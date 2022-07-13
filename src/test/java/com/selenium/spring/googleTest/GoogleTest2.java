package com.selenium.spring.googleTest;

import com.google.common.util.concurrent.Uninterruptibles;
import com.selenium.spring.SpringBaseTestNGTest;
import com.selenium.spring.page.google.GooglePage;
import com.selenium.spring.sushobhan.annotation.LazyAutowired;
import com.selenium.spring.sushobhan.service.ScreenshotService;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class GoogleTest2 extends SpringBaseTestNGTest {
    @LazyAutowired
    private GooglePage googlePage;

    @LazyAutowired
    private ScreenshotService screenshotService;

    @Test
    public void googleTest() throws IOException {
        this.googlePage.goTo();
        Assert.assertTrue(this.googlePage.isAt());
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        this.googlePage.getSearchComponent().search("selenium ");
        Assert.assertTrue(this.googlePage.getSearchResult().isAt());
        Assert.assertTrue(this.googlePage.getSearchResult().getCount()>2);
        this.screenshotService.takeScreenShot();
        this.googlePage.closeBrowser();
    }
}
