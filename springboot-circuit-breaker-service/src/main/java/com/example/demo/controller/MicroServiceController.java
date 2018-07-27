package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MyPC on 2018/7/27.
 */
@RestController
public class MicroServiceController {
    @RequestMapping("recommended")
    public String readingList(){
        return "Spring in Action (Manning), Cloud Native Java (O'Reilly), Learning Spring Boot (Packt)";
    }
}
