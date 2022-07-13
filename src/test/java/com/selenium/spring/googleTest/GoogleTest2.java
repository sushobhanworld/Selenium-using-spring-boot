package com.selenium.spring.googleTest;

import com.google.common.util.concurrent.Uninterruptibles;
import com.selenium.spring.SpringBaseTestNGTest;
import com.selenium.spring.page.google.GooglePage;
import com.selenium.spring.util.ScreenshotUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class GoogleTest2 extends SpringBaseTestNGTest {
    @Autowired
    private GooglePage googlePage;

    @Autowired
    @Lazy
    private ScreenshotUtil screenshotUtil;

    @Test
    public void googleTest() throws IOException {
        this.googlePage.goTo();
        Assert.assertTrue(this.googlePage.isAt());
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        this.googlePage.getSearchComponent().search("selenium ");
        Assert.assertTrue(this.googlePage.getSearchResult().isAt());
        Assert.assertTrue(this.googlePage.getSearchResult().getCount()>2);
        this.screenshotUtil.takeScreenShot("Google");
    }
}
