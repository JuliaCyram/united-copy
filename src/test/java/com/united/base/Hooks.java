package com.united.base;

import com.united.utils.BrowserManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Hooks {
    public static WebDriver driver;
    String URL = "https://www.united.com/en/us/";

    @Before
    public void setup() {
        driver = BrowserManager.getDriver("chrome");
        driver.get(URL);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}


