package com.restapi.restapi;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseModel {

    private int id;
    private String response;


    public ResponseModel(int id, String response){
        this.id = id;
        this.response = response;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
