package com.selenium.spring.qualify;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("civic")
public class Civic implements Car {
    @Override
    public void run() {
        System.out.println("From car civic");
    }
}
