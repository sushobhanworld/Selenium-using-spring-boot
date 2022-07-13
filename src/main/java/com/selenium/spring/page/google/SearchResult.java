package com.selenium.spring.page.google;

import com.selenium.spring.annotation.Page;
import com.selenium.spring.page.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Page
public class SearchResult extends BaseClass {
    @FindBy(xpath = "//*[@class='g Ww4FFb tF2Cxc']")
    private List<WebElement> results;

    @Override
    public boolean isAt() {
        return this.wait.until(driver -> !this.results.isEmpty());
    }

    public int getCount(){
        return this.results.size();
    }
}
