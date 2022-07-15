package com.selenium.spring.page.window;

import com.selenium.spring.page.BaseClass;
import com.selenium.spring.sushobhan.annotation.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

@Page
public class MainPage extends BaseClass {

    @FindBy(tagName = "a")
    private List<WebElement> links;

    public void goTo() {
        this.driver.get("https://vins-udemy.s3.amazonaws.com/ds/window/main.html");
        driver.manage().window().maximize();
    }

    public void launchAllWindows() {
        for (int i = 0; i < links.size(); i++) {
            links.get(i).click();
            this.wait.until(ExpectedConditions.numberOfWindowsToBe(i + 2));
        }
    }

    @Override
    public boolean isAt() {
        return this.wait.until(driver -> !this.links.isEmpty());
    }
}
