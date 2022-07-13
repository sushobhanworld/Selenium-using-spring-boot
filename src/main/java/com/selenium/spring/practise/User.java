package com.selenium.spring.practise;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class User {
    private Address address;
    private Salary1 salary1;

    public void printDetails(){
        System.out.println("Address :" + this.address.getStreet());
        System.out.println("Salary :" + this.salary1.getAmount());
    }
}
