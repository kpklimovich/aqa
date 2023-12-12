package org.example.pages;

import org.example.utils.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class MainPage {
    private WebElement searchInput = BrowserDriver.getDriver().findElement(new By.ByXPath("//input[@id='searchInput']"));

    private WebElement mainPageContent = new WebDriverWait(BrowserDriver.getDriver(), Duration.ofSeconds(7) )
            .until(ExpectedConditions.presenceOfElementLocated(new By.ByXPath("//div[@class='main-page__content']")));

    private By.ByXPath productCardList = new By.ByXPath("//div[@class='product-card-list']/article");

    private By.ByXPath basketLink = new By.ByXPath("//div[contains(@class, 'j-item-basket')]/a");

    public void setValueToSearchInput(String value) {
        searchInput.click();
        searchInput.sendKeys(value);
    }

    public void setKeySearchInput(CharSequence... keysToSend) {
        searchInput.sendKeys(keysToSend);
    }

    public ArrayList<ProductCard> getProductCardList() {
        ArrayList<ProductCard> productCards = new ArrayList<>();
        new WebDriverWait(BrowserDriver.getDriver(), Duration.ofSeconds(5))
            .until(ExpectedConditions.presenceOfElementLocated(productCardList));
        List<WebElement> webElementList = BrowserDriver.getDriver().findElements(productCardList);
        for (WebElement productCard : webElementList) {
            productCards.add(new ProductCard(productCard));
        }
        return productCards;
    }

    private WebElement getBasketLink() {
        return BrowserDriver.getDriver().findElement(basketLink);
    }

    public void basketLinkClick() {
        getBasketLink().click();
    }
}
