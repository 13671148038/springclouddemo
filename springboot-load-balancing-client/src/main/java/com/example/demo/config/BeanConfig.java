package com.example.demo.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by MyPC on 2018/7/27.
 */
@Configuration
public class BeanConfig {
    @LoadBalanced
    @Bean
    RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
