package com.restapi.restapi;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;

@Builder
@Entity
@Table(name = "records")
public class RestEntity {

    @Id
    @GeneratedValue
    private int id;

    private String username;

    public RestEntity(int id, String username){
        this.username = username;
        this.id = id;
    }

    public RestEntity() {}


    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

}
