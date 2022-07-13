package com.selenium.spring.scope;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
@Scope("prototype")
public class Salary {
    private int amount;
}
