package com.example.demo.service.impl;

import com.example.demo.service.BookService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * Created by MyPC on 2018/7/27.
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${uri}")
    private String src;
    @HystrixCommand(fallbackMethod = "reliable")
    public String readingList() {
        URI uri = URI.create(src+"recommended");
        String forObject = restTemplate.getForObject(uri, String.class);
        return forObject;
    }

    public String reliable() {
        return "Cloud Native Java (O'Reilly)";
    }
}
