package com.example.demo.controllers;

import com.example.demo.domain.Response;
import com.example.demo.domain.SearchResult;
import com.example.demo.service.SearchService;
import java.util.concurrent.ExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @Autowired
    private SearchService searchService;

    @GetMapping("search")
    public ResponseEntity<Response> getResult(@RequestParam("term") String term) throws ExecutionException, InterruptedException {
        Response response = new Response(searchService.getResult(term));
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
