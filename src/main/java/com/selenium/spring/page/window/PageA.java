package com.selenium.spring.page.window;

import com.selenium.spring.page.BaseClass;
import com.selenium.spring.sushobhan.annotation.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Window("Page A")
public class PageA extends BaseClass {
    @FindBy(id = "area")
    private WebElement textArea;

    public void addToArea(final String message) {
        this.textArea.sendKeys(message);
    }

    @Override
    public boolean isAt() {
        return this.wait.until(driver -> this.textArea.isDisplayed());
    }
}
