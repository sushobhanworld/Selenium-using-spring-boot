package com.selenium.spring;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Address {
    @Value("${street}")
    private String street;

    public Address(){

    }
}
