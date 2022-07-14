package com.selenium.spring.page.flights;

import com.selenium.spring.page.BaseClass;
import com.selenium.spring.sushobhan.annotation.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

@Page
public class FlightPage extends BaseClass {

    @FindBy(xpath = "//a[contains(@class,'P4z3kc KgqTrc')]")
    private List<WebElement> links;

    public void goTo(final String url) {
        this.driver.get(url);
        this.driver.manage().window().maximize();
    }

    public List<String> getLabels() {
        return links.stream()
                .map(WebElement::getText)
                .map(String::trim)
                .collect(Collectors.toList());
    }

    @Override
    public boolean isAt() {
        return this.wait.until(driver -> !this.links.isEmpty());
    }
}
