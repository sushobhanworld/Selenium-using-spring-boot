package com.selenium.spring.hp;

import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonCompareTest {
    @Test
    void compare() throws IOException, JSONException {
        String expectedJson = Files.readString(Paths.get(System.getProperty("user.dir") + "/src/main/resources/json/e.json"));
        String actualJson = Files.readString(Paths.get(System.getProperty("user.dir") + "/src/main/resources/json/a.json"));
        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }
}
