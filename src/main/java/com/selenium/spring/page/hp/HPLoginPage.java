package com.selenium.spring.page.hp;

import com.selenium.spring.page.BaseClass;
import com.selenium.spring.sushobhan.annotation.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Page
public class HPLoginPage extends BaseClass {

    @FindBy(id = "user_name")
    private WebElement userName;

    @FindBy(id = "user_password")
    private WebElement userPassword;

    @FindBy(id = "language_select")
    private WebElement languageDD;

    @FindBy(id = "sysverb_login")
    private WebElement loginBtn;

    public void goTo(final String url) {
        this.driver.get(url);
        this.driver.manage().window().maximize();
    }

    public void login(String username, String password) {
        this.userName.sendKeys(username);
        this.userPassword.sendKeys(password);
        this.loginBtn.click();
    }

    @Override
    public boolean isAt() {
        return this.wait.until(driver -> languageDD.isDisplayed());
    }
}
