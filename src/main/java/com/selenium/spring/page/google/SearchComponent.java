package com.selenium.spring.page.google;

import com.selenium.spring.annotation.PageFragment;
import com.selenium.spring.page.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@PageFragment
public class SearchComponent extends BaseClass {

    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(name = "btnK")
    private List<WebElement> searchBtn;

    @Override
    public boolean isAt() {
        return this.wait.until(driver -> this.searchBox.isDisplayed());
    }

    public void search(final String keyboard) {
        this.searchBox.sendKeys(keyboard);
        this.searchBox.sendKeys(Keys.TAB);
        this.searchBtn.stream()
                .filter(e -> e.isDisplayed() && e.isEnabled())
                .findFirst()
                .ifPresent(WebElement::click);
    }
}
