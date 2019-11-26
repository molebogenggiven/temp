package com.in28minutes.springboot.soap.web.services.example.springboottutorialsoapwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Controller {

    @GetMapping("/hello_world")
    public String helloWorld(){

        return "hello world";
    }
}
