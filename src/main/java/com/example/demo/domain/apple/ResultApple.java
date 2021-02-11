package com.example.demo.domain.apple;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultApple {
    @JsonProperty("kind")
    private String kind;
    @JsonProperty("artistName")
    private String artistName;

    public ResultApple(String kind, String artistName) {
        this.kind = kind;
        this.artistName = artistName;
    }

    public ResultApple() {
    }
}
