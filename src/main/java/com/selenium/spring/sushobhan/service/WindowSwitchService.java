package com.selenium.spring.sushobhan.service;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class WindowSwitchService {
    @Autowired
    private ApplicationContext applicationContext;

    public void switchByTitle(final String title) {
        WebDriver webDriver = this.applicationContext.getBean(WebDriver.class);
        webDriver.getWindowHandles()
                .stream()
                .map(handle -> webDriver.switchTo().window(handle).getTitle())
                .filter(f -> f.startsWith(title))
                .findFirst()
                .orElseThrow(() -> {
                    throw new RuntimeException("No such window");
                });
    }

    public void switchByIndex(final int index) {
        WebDriver webDriver = this.applicationContext.getBean(WebDriver.class);
        String[] handles = webDriver.getWindowHandles().toArray(new String[0]);
        webDriver.switchTo().window(handles[index]);
    }
}
