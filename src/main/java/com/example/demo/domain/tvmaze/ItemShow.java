package com.example.demo.domain.tvmaze;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemShow {
    @JsonProperty("name")
    private String name;
    @JsonProperty("url")
    private String url;

    public ItemShow(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public ItemShow() {
    }
}
