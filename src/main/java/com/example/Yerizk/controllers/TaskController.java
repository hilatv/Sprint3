package com.example.Yerizk.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    @GetMapping("/tasks")
    public String TaskList (){
        return  "Hola bebé";
    }
}
