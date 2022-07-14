package com.selenium.spring.excel;

import com.selenium.spring.SpringBaseTestNGTest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class ResourceTest extends SpringBaseTestNGTest {
    @Value("classpath:data/testdata.csv")
    //@Value("file:/C:/Users/KUMARSUS/Downloads/spring-selenium/src/test/resources/data/testdata.csv")
    private Resource resource;

    @Test(dataProvider = "getData")
    void excelData() throws IOException {
        Files.readAllLines(resource.getFile().toPath())
                .forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------------------");
        List<String> readAllLines = Files.readAllLines(resource.getFile().toPath());
        System.out.println(readAllLines.get(1));
        System.out.println(readAllLines.get(1).length());
        String[] names = readAllLines.get(1).split(",");
        System.out.println("last_name : " + names[1]);


    }

    @DataProvider
    public Object[][] getData() throws IOException {
        return Files.readAllLines(resource.getFile().toPath())
                .stream()
                .map(s -> s.split(","))
                .toArray(Object[][]::new);
    }
}
