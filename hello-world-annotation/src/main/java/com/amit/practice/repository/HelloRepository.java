package com.amit.practice.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository {

    public String greet() {
        return "Hello world";
    }

    public String show(){
        System.out.println("show method");
        return "hi";
    }
}