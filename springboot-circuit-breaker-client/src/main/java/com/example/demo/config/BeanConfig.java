package com.example.demo.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by MyPC on 2018/7/27.
 */
@Configuration
public class BeanConfig {
    @Bean
    RestTemplate getRestTemplate(RestTemplateBuilder builder){
        RestTemplate build = builder.build();
        return build;
    }
}
