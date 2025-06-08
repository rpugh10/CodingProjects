package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello") //Used to handle HTTP GET request 
    public String helloWorld()
    {
        return "Hello Ryan";
    }

}
