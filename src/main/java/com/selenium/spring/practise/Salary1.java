package com.selenium.spring.practise;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Salary1 {
    @Value("${amount}")
    private int amount;

    public Salary1(){

    }
}
