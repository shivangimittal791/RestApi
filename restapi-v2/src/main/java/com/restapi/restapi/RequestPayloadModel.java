package com.restapi.restapi;

public class RequestPayloadModel {

    private String username;

    public RequestPayloadModel() {

    }
    public RequestPayloadModel(String username){
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

