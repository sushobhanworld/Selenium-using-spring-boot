package com.selenium.spring.scope;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class SeniorEngg {
    @Autowired
    private Salary salary;

    public void setAmount(int amount) {
        this.salary.setAmount(amount);
    }

}
