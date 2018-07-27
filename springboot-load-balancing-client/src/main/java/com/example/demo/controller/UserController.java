package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MyPC on 2018/7/27.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("hi")
    public String hi(@RequestParam(value = "name",defaultValue = "Artaban")String name){
        String greeting = userService.getGreeting();
        return String.format("%s, %s!", greeting, name);
    }

}
