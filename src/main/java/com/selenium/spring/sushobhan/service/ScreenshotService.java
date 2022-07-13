package com.selenium.spring.sushobhan.service;

import com.selenium.spring.sushobhan.config.FakerConfig;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;

@Lazy
@Service
public class ScreenshotService {
    @Autowired
    private ApplicationContext applicationContext;

    @Value("${screenshot.path}")
    private String path;

    @Autowired
    private FakerConfig fakerConfig;

    public void takeScreenShot() throws IOException {
        File sourceFile = this.applicationContext.getBean(TakesScreenshot.class).getScreenshotAs(OutputType.FILE);
        FileCopyUtils.copy(sourceFile, new File(this.path + "/" + fakerConfig.newInstance().name().username() + ".png"));
    }
}
