package com.selenium.spring.page.hp;

import com.selenium.spring.page.BaseClass;
import com.selenium.spring.sushobhan.annotation.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Page
public class HPLoginLandingPage extends BaseClass {
    @FindBy(id = "filter")
    private WebElement filterTextBox;

    @Override
    public boolean isAt() {
        return this.wait.until(driver -> this.filterTextBox.isDisplayed() && this.filterTextBox.isEnabled());
    }
}
