package org.example;

import org.example.pages.BasketPage;
import org.example.pages.MainPage;
import org.example.pages.ProductPage;
import org.example.utils.BrowserActions;
import org.example.utils.BrowserDriver;
import org.junit.jupiter.api.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AppTest {
    @BeforeEach
    public void setup() {
        final String URL = "https://www.wildberries.ru/";
        WebDriver driver = BrowserDriver.getDriver();
        driver.get(URL);
        driver.manage().window().maximize();
    }

    @Test
    public void checkCreateOrder() {
        int first = 0;
        int second = 1;
        String searchString = "logitech g102 light sync";
        MainPage mainPage = new MainPage();
        mainPage.setValueToSearchInput(searchString);
        mainPage.setKeySearchInput(Keys.RETURN);

        mainPage.getProductCardList().get(first).getProductCardArticle().click();
        ProductPage productPage = new ProductPage();
        productPage.addToBasketButtonClick();
        String product0Name = productPage.getProductName();
        String product0Price = productPage.getProductPrice();
        BrowserActions.GoBack();

        mainPage.getProductCardList().get(second).getProductCardArticle().click();
        productPage.addToBasketButtonClick();
        String product1Name = productPage.getProductName();
        String product1Price = productPage.getProductPrice();

        mainPage.basketLinkClick();
        int expectedItemsCount = 2;
        String expectedResultPrice = "4 337 ₽";
        BasketPage basketPage = new BasketPage();
        Assertions.assertAll(
            () -> Assertions.assertEquals(expectedItemsCount, basketPage.getBasketItems().size(), "The different count items in a basket"),
            () -> Assertions.assertEquals(product0Name, basketPage.getBasketItemName(second), "Products names aren't equal."),
            () -> Assertions.assertEquals(product1Name, basketPage.getBasketItemName(first), "Products names aren't equal."),
            () -> Assertions.assertEquals(product0Price, basketPage.getBasketItemPrice(second), "Products prices aren't equal."),
            () -> Assertions.assertEquals(product1Price, basketPage.getBasketItemPrice(first), "Products prices aren't equal."),
            () -> Assertions.assertEquals(expectedResultPrice, basketPage.getFinalPrice(), "Expected final price and current prices are not equal")
        );
    }

    @AfterEach
    public void tear() {
        BrowserDriver.quitDriver();
      }
}
