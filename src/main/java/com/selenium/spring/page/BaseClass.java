package com.selenium.spring.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import javax.annotation.PostConstruct;

public abstract class BaseClass {
    @Autowired
    protected WebDriver driver;

    @Autowired
    @Lazy
    protected WebDriverWait wait;

    @PostConstruct
    private void init() {
        PageFactory.initElements(this.driver, this); // All elements will be found (initialised) by this time
    }

    public abstract boolean isAt();
}
