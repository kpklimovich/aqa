package org.example.pages;

import org.example.utils.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasketPage {
    private By.ByXPath basketItems = new By.ByXPath("//div[contains(@class, 'basket-page')]//div[contains(@class, 'accordion__list-item')]");

    private By.ByXPath basketItemPrice = new By.ByXPath(".//div[@class='list-item__price-new']");

    private By.ByXPath basketItemName = new By.ByXPath(".//span[@class='good-info__good-name']");

    private By.ByXPath finalPrice = new By.ByXPath("//p[contains(@class, 'b-top__total')]/span/span");


    public List<WebElement> getBasketItems() {
        new WebDriverWait(BrowserDriver.getDriver(), Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(basketItems));
        return BrowserDriver.getDriver().findElements(this.basketItems);
    }

    public String getBasketItemPrice(int index) {
        return getBasketItems().get(index).findElement(basketItemPrice).getText();
    }

    public String getBasketItemName(int index) {
        return getBasketItems().get(index).findElement(basketItemName).getText();
    }

    public String getFinalPrice() {
        return BrowserDriver.getDriver().findElement(finalPrice).getText();
    }
}
