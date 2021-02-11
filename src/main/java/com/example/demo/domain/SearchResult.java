package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchResult {
    @JsonProperty("providers")
    HashMap<String, Object> providers;

    public SearchResult(HashMap<String, Object> providers) {
        this.providers = providers;
    }

    public SearchResult() {
    }
}
