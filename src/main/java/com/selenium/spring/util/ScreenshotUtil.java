package com.selenium.spring.util;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;

@Lazy
@Component
public class ScreenshotUtil {
    @Autowired
    private WebDriver driver;

    @Value("${screenshot.path}")
    private String path;

    public void takeScreenShot(final String imgName) throws IOException {
        File sourceFile = ((TakesScreenshot) this.driver).getScreenshotAs(OutputType.FILE);
        FileCopyUtils.copy(sourceFile, new File(this.path + "/" + imgName + ".png"));
    }
}
