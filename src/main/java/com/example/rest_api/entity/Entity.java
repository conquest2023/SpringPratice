package com.example.rest_api.entity;


import lombok.Data;

@Data
public  abstract class Entity implements  PrimaryKey {

    private  Long id;


}
