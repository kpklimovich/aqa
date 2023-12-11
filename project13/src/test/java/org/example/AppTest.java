package org.example;

import org.example.utils.BrowserDriver;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

public class AppTest {
    @BeforeEach
    public void setup() {
        final String URL = "";
        WebDriver driver = BrowserDriver.getDriver();
        driver.get(URL);
        driver.manage().window().maximize();
    }

    @Test
    public void checkCreateOrder() {

    }

    @AfterEach
    public void tear() {
        BrowserDriver.quitDriver();
    }
}
