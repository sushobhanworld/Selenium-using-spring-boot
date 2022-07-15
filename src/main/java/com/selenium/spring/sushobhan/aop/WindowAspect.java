package com.selenium.spring.sushobhan.aop;

import com.selenium.spring.sushobhan.annotation.Window;
import com.selenium.spring.sushobhan.service.WindowSwitchService;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WindowAspect {
    @Autowired
    private WindowSwitchService windowSwitchService;

    // Below methods are called Advice, they are triggered at appropriate times

    @Before("@target(window) && within(com.selenium.spring..*)")
    public void before(Window window) {
        this.windowSwitchService.switchByTitle(window.value());
    }

    @After("@target(window) && within(com.selenium.spring..*)")
    public void after(Window window) {
        this.windowSwitchService.switchByIndex(0);
    }
}
