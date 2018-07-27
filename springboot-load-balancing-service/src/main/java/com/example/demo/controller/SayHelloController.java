package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by MyPC on 2018/7/27.
 */
@RestController
public class SayHelloController {

    private static final Logger log = LoggerFactory.getLogger(SayHelloController.class);

    @Value("${server.port}")
    private String serverPort;
    @RequestMapping("greeting")
    public String greeting(){
        log.info("Access /greeting");
        List<String> greetings = Arrays.asList("Hi there", "Greetings", "Salutations");
        Random rand = new Random();

        int randomNum = rand.nextInt(greetings.size());
        return greetings.get(randomNum)+"serverPort:"+serverPort;
    }

    @RequestMapping(value = "/")
    public String home() {
        log.info("Access /");
        return "Hi!";
    }

}
