package com.selenium.spring.sushobhan.scope;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.SimpleThreadScope;

import java.util.Objects;

public class BrowserScope extends SimpleThreadScope {

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        Object obj = super.get(name, objectFactory);
        // if the webdriver is quit, it won't know
        // Now, we need to check the webdriver through sessionId
        SessionId sessionId = ((RemoteWebDriver) obj).getSessionId();
        if (Objects.isNull(sessionId)) {
            super.remove(name); //The browser is quit already, and we are removing the instance
            obj = super.get(name, objectFactory); // Gives a fresh instance of webdriver
        }
        return obj;
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {

    }
}
