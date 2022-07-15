package com.selenium.spring.window;

import com.selenium.spring.SpringBaseTestNGTest;
import com.selenium.spring.page.window.MainPage;
import com.selenium.spring.page.window.PageA;
import com.selenium.spring.page.window.PageB;
import com.selenium.spring.page.window.PageC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.TestPropertySource;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@TestPropertySource(properties = "browser=edge")
public class WindowSwitchTest extends SpringBaseTestNGTest {
    @Autowired
    private MainPage mainPage;

    @Autowired
    private PageA pageA;

    @Autowired
    private PageB pageB;

    @Autowired
    private PageC pageC;

//    @Autowired
//    private WindowSwitchService windowSwitchService;

    @BeforeClass
    void setUp() {
        this.mainPage.goTo();
        this.mainPage.isAt();
        this.mainPage.launchAllWindows();
    }

    @Test(dataProvider = "getData")
    public void switchTest(int index) {
        this.pageA.addToArea(index + "\n");
        this.pageB.addToArea((index * 2) + "\n");
        this.pageC.addToArea((index * 3) + "\n");
    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][]{
                {3}, {4}, {2}, {7}, {6}, {5}
        };
    }
}
