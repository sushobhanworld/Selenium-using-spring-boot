package com.selenium.spring;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringSeleniumApplicationTests {
	@Autowired
	private User user;

	@Value("${fruits}")
	private List<String> fruits;

	@Value("${timeout}")
	private int timeout;

	@Value("${TEST_URL:http://www.google.com}")
	private String url;

	@Autowired
	private Faker faker;

	@Test
	void contextLoads() {
		user.printDetails();
		System.out.println(this.fruits);
		System.out.println(this.timeout);
		System.out.println(this.url);
		System.out.println("First Name: "+ faker.name().firstName());
	}

}
