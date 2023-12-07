package org.example.pages;

import org.example.utils.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CookiePage {
    private WebElement headerText = new WebDriverWait(BrowserDriver.getDriver(), Duration.ofSeconds(5) )
            .until(ExpectedConditions.presenceOfElementLocated(new By.ByXPath("//div[@class = 'cookie__main cookie__info']/h3")));

    private WebElement cancelButton = BrowserDriver.getDriver().findElement(new By.ByXPath("//button[contains(@class, 'cookie__cancel')]"));

    public void cancelButtonClick() {
        cancelButton.click();
    }
}
