package org.example.pages;

import org.example.utils.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BePaidIframe {
    private WebElement bePaidIframe = new WebDriverWait(BrowserDriver.getDriver(), Duration.ofSeconds(5))
            .until(ExpectedConditions.presenceOfElementLocated((new By.ByXPath("//iframe[@class='bepaid-iframe']"))));

    public boolean bePaidIframeIsDisplayed() {
        new WebDriverWait(BrowserDriver.getDriver(), Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOf(bePaidIframe));
        return bePaidIframe.isDisplayed();
    }
}
