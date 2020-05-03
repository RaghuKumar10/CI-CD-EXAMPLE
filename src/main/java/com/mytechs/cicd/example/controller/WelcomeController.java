package com.mytechs.cicd.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WelcomeController {
    @GetMapping
    public String saySomethingGood(){
        return "Welcome to CI-CD with jenkins and Pivotal cloud foundry";
    }
}
