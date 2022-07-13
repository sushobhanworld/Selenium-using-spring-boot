package com.selenium.spring.config;

import com.selenium.spring.annotation.LazyConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import java.time.Duration;

@LazyConfiguration
public class WebDriverWaitConfig {

    @Value("${default.timeout:30}")
    private long timeout;

    @Bean
    public WebDriverWait webDriverWait(WebDriver driver) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeout));
    }
}
