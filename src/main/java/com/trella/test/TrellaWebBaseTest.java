package com.trella.test;

import com.trella.pages.PageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrellaWebBaseTest {
    protected WebDriver driver;
    protected PageFactory page;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        if (driver == null)
            driver = new ChromeDriver();
        if (page == null)
            page = new PageFactory(driver);
        String url = "http://www.way2automation.com/protractor-angularjs-practice-website.html";
        driver.get(url);
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
