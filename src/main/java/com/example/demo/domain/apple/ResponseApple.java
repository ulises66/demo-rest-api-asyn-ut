package com.example.demo.domain.apple;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseApple {
    @JsonProperty("resultCount")
    private int resultCount;
    @JsonProperty("results")
    private List<ResultApple> results;

    public ResponseApple(int resultCount, List<ResultApple> results) {
        this.resultCount = resultCount;
        this.results = results;
    }

    public ResponseApple() {
    }
}
