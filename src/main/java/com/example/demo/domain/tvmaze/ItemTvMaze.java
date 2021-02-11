package com.example.demo.domain.tvmaze;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemTvMaze {
    @JsonProperty("score")
    private float score;
    @JsonProperty("show")
    private ItemShow itemShow;

    public ItemTvMaze(float score, ItemShow itemShow) {
        this.score = score;
        this.itemShow = itemShow;
    }

    public ItemTvMaze() {
    }
}
