package com.example.demo.service.impl;

import com.example.demo.config.RibbonConfig;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by MyPC on 2018/7/27.
 */
@RibbonClient(name = "say-hello",configuration = RibbonConfig.class)
@Service
public class UserServiceImpl implements UserService {

        @Autowired
        private RestTemplate restTemplate;

        @Value("${uri2}")
        private String uri;
        public String getGreeting() {
            String greeting = restTemplate.getForObject (uri+"greeting/", String.class);
            return greeting;
        }
}
