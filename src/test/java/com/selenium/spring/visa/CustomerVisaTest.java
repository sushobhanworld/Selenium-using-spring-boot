package com.selenium.spring.visa;

import com.selenium.spring.SpringBaseTestNGTest;
import com.selenium.spring.enity.Customer;
import com.selenium.spring.page.visa.VisaRegistrationPage;
import com.selenium.spring.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import java.util.List;

public class CustomerVisaTest extends SpringBaseTestNGTest {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private VisaRegistrationPage visaRegistrationPage;

    @Test
    void visaTest() {
        System.out.println("Number of records :" + this.customerRepository.findAll().size());
        System.out.println("Number of users with names starting with : " + this.customerRepository.findByFirstNameStartingWith("Bran").size());
        List<Customer> customers = this.customerRepository.findAll()
                .stream()
                .limit(3).toList();

        for (Customer c : customers) {
            this.visaRegistrationPage.goTo();
            this.visaRegistrationPage.setNames(c.getFirstName(), c.getLastName());
            this.visaRegistrationPage.setCountryFromAndTo(c.getFromCountry(), c.getToCountry());
            this.visaRegistrationPage.setBirthDate(c.getDob().toLocalDate());
            this.visaRegistrationPage.setContactDetails(c.getEmail(), c.getPhone());
            this.visaRegistrationPage.typeComments(c.getComments());
            this.visaRegistrationPage.submit();

            System.out.println("Confirmation Number : " + this.visaRegistrationPage.getConfirmationNumber());
        }
    }
}
