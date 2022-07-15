package com.selenium.spring.sushobhan.annotation;

import java.lang.annotation.*;

@Page
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Window {
    String value() default "";
}
