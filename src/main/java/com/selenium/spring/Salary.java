package com.selenium.spring;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Salary {
    @Value("${amount}")
    private int amount;

    public Salary(){

    }
}
