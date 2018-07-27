package com.example.demo.config;

import com.example.demo.filter.SimpleFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by MyPC on 2018/7/27.
 */
@Configuration
public class FilterConfig {
    @Bean
    SimpleFilter getSimpleFilter(){
        return  new SimpleFilter();
    }
}
