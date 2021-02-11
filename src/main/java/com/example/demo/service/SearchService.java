package com.example.demo.service;

import com.example.demo.domain.SearchResult;
import com.example.demo.domain.apple.ResponseApple;
import com.example.demo.domain.tvmaze.ItemTvMaze;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SearchService {
    public SearchService() {
    }

    public Object getResult(String term) throws ExecutionException, InterruptedException {
        // Get Response from Apple
        CompletableFuture<HashMap<String, Object>> responseApple = getMovieAndSongsFromApple(term);
        CompletableFuture<HashMap<String, Object>> responseTvMaze = getShowsFromTvMaze(term);
        CompletableFuture.allOf(responseApple,responseTvMaze).join();
        SearchResult responses = new SearchResult();
        HashMap<String, Object> providers = new HashMap<>();
        providers.put("Apple", responseApple.get());
        providers.put("TvMaze", responseTvMaze.get());
        responses.setProviders(providers);

        return responses;
    }

    @Async
    public CompletableFuture<HashMap<String, Object>> getMovieAndSongsFromApple(String term) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            String url = "https://itunes.apple.com/search?term=" + term;
            String strResponse = restTemplate.getForObject( url, String.class);
            ResponseApple responseApple = new ObjectMapper().readValue(strResponse, ResponseApple.class);
            HashMap<String, Object> map = new HashMap<>();
            map.put("Itunes", responseApple.getResults());
            return CompletableFuture.completedFuture(map);
        } catch (Exception ex) {
            return null;
        }
    }

    @Async
    public CompletableFuture<HashMap<String, Object>> getShowsFromTvMaze(String term) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            String url = "http://api.tvmaze.com/search/shows?q=" + term;
            ItemTvMaze[] response = restTemplate.getForObject(url, ItemTvMaze[].class);
            HashMap<String, Object> map = new HashMap<>();
            map.put("TvMaze", response);
            return CompletableFuture.completedFuture(map);
        } catch (Exception ex) {
            return null;
        }
    }
}
