package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
    @JsonProperty("data")
    private Object data;

    public Response(Object data) {
        this.data = data;
    }

    public Response() {
    }
}
