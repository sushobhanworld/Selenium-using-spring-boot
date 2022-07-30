package com.selenium.spring.enity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Customer {
    @Id
    private Integer id;
    private String fromCountry;
    private String toCountry;
    private Date dob;
    private String firstName;
    private String lastName;
    @Column(name = "customer_email")
    private String email;
    private String phone;
    private String comments;
}
