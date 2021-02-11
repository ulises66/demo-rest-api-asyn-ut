package com.example.demo;

import com.example.demo.domain.SearchResult;
import com.example.demo.domain.tvmaze.ItemShow;
import com.example.demo.domain.tvmaze.ItemTvMaze;
import com.example.demo.service.SearchService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


import static junit.framework.TestCase.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class SearchServiceTest {
    @InjectMocks
    private SearchService service;

    @Mock
    private SearchService mockService;

    @Test
    public void testGetResult() throws ExecutionException, InterruptedException {
        // UT
        assertThat(service.getResult("test")).isNotNull();
        assertThat(service.getResult("test")).isInstanceOfAny(Object.class);

    }
}
