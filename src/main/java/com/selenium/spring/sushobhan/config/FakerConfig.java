package com.selenium.spring.sushobhan.config;

import com.github.javafaker.Faker;
import com.selenium.spring.sushobhan.annotation.LazyConfiguration;
import org.springframework.context.annotation.Bean;

@LazyConfiguration
public class FakerConfig {
    @Bean
    public Faker newInstance(){
        return new Faker();
    }
}
