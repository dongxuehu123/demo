package com.tiger.forever.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class HelloWorldController {
    @PostMapping("/hello")
    public  String hello(){
        System.out.println("--------------4125");
        return "hello world2";
    }
}
