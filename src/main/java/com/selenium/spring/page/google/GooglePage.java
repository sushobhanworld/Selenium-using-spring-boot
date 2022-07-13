package com.selenium.spring.page.google;

import com.selenium.spring.sushobhan.annotation.Page;
import com.selenium.spring.page.BaseClass;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Page
@Getter
public class GooglePage extends BaseClass {
    @Autowired
    private SearchComponent searchComponent;

    @Autowired
    private SearchResult searchResult;

    @Value("${application-url}")
    private String url;

    public void goTo() {
        this.driver.get(this.url);
    }

    @Override
    public boolean isAt() {
        return this.searchComponent.isAt();
    }

    public void closeBrowser() {
        this.driver.quit();
    }
}
