package com.selenium.spring.googleTest;

import com.selenium.spring.SpringBaseTestNGTest;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.testng.annotations.Test;

public class MultiBrowserTest extends SpringBaseTestNGTest {
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void browserTest() {
        WebDriver chromeDriver = this.applicationContext.getBean("chromeDriver", WebDriver.class);
        chromeDriver.get("https://www.google.com");
        this.applicationContext.getBean("edgeDriver", WebDriver.class).get("https://www.yahoo.com");
    }
}
