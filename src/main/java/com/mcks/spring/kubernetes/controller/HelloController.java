package com.mcks.spring.kubernetes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Spring Boot ! This is an example of deploying a simple spring boot application in a kubernetes cluster!";
    }
}
