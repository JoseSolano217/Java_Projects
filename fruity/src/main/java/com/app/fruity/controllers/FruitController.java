package com.app.fruity.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fruits")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FruitController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello world";
    }
}
