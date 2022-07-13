package com.selenium.spring.sushobhan.annotation;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

// TYPE - class
// Field - FIELD (@Autowired)
// Type, Field, Method --- its an array where the annotation will be used
// Now, we are only going to use it on a class
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Lazy
public @interface Page {
}
