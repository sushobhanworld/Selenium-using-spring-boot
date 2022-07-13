package com.selenium.spring.qualify;

import com.selenium.spring.SpringBaseTestNGTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.testng.annotations.Test;

public class CarTest extends SpringBaseTestNGTest {
    @Autowired
    @Qualifier("civic")
    private Car car;

    @Test
    void carTest() {
        this.car.run();
    }
}
