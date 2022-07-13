package com.selenium.spring.config;

import com.github.javafaker.Faker;
import com.selenium.spring.annotation.LazyConfiguration;
import org.springframework.context.annotation.Bean;

@LazyConfiguration
public class FakerConfig {
    @Bean
    public Faker newInstance(){
        return new Faker();
    }
}
