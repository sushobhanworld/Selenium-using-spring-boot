package com.selenium.spring.practise;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Television {
    @Value("${tv.name:sony}")
    private String name;

    public Television(){
        System.out.println("Inside the constructor : " + this.name);
    }

    @PostConstruct
    public void init(){
        System.out.println("Inside the init : " + this.name);
        System.out.println("TV is turned ON...");
    }

    public void playMovie(){
        for(int i=1; i<6; i++){
            System.out.println("Playing scene " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @PreDestroy
    public void turnOffTV(){
        System.out.println("TV is turned OFF...");
    }
}
