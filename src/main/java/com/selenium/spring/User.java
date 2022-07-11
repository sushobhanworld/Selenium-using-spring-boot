package com.selenium.spring;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class User {
    private Address address;
    private Salary salary;

    public void printDetails(){
        System.out.println("Address :" + this.address.getStreet());
        System.out.println("Salary :" + this.salary.getAmount());
    }
}
