package com.selenium.spring.hp;

import com.selenium.spring.SpringBaseTestNGTest;
import com.selenium.spring.page.hp.HPLoginLandingPage;
import com.selenium.spring.page.hp.HPLoginPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

public class HPTest extends SpringBaseTestNGTest {
    @Autowired
    private HPLoginPage hpLoginPage;

    @Autowired
    private HPLoginLandingPage hpLoginLandingPage;

    @Test
    void login(){
        this.hpLoginPage.goTo("https://hptest.service-now.com/login.do");
        this.hpLoginPage.isAt();
        this.hpLoginPage.login("sushobhan.kumar@hp.com", "London@1");
        this.hpLoginLandingPage.isAt();
    }
}
