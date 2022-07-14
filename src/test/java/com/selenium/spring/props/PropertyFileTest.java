package com.selenium.spring.props;

import com.selenium.spring.SpringBaseTestNGTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Properties;

public class PropertyFileTest extends SpringBaseTestNGTest {
    @Autowired
    private ResourceLoader resourceLoader;

    @Test
    void propertyFileTest() throws IOException {
        Properties properties = PropertiesLoaderUtils.loadProperties(resourceLoader.getResource("classpath:my.properties"));
        System.out.println(properties.getProperty("username"));
    }
}
