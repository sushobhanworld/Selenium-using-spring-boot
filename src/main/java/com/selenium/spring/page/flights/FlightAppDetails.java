package com.selenium.spring.page.flights;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
//@PropertySource("classpath:language/${app.locale}.properties")
@Getter
public class FlightAppDetails {
//    @Value("${flight.app.url}")
    private String url;

//    @Value("${flight.app.labels}")
    private List<String> labels;
}
