package com.selenium.spring.flights;

import com.selenium.spring.SpringBaseTestNGTest;
import com.selenium.spring.page.flights.FlightAppDetails;
import com.selenium.spring.page.flights.FlightPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlightsTest extends SpringBaseTestNGTest {
    @Autowired
    private FlightAppDetails flightAppDetails;

    @Autowired
    private FlightPage flightPage;

    @Test
    void flightTest() {
        this.flightPage.goTo(this.flightAppDetails.getUrl());
        Assert.assertTrue(this.flightPage.isAt());
        Assert.assertEquals(this.flightPage.getLabels(), this.flightAppDetails.getLabels());
    }
}
