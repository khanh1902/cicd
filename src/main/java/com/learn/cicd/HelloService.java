package com.learn.cicd;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String hello() {
        return "Hello World!";
    }
}
