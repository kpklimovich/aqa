package org.example;

import org.example.pages.BePaidIframe;
import org.example.pages.CookiePage;
import org.example.pages.MainPage;
import org.example.utils.BrowserDriver;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

public class AppTest {
    @BeforeEach
    public void setup() {
        final String URL = "https://www.mts.by/";
        WebDriver driver = BrowserDriver.getDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        CookiePage cookiePage = new CookiePage();
        cookiePage.cancelButtonClick();
    }

    @Test
    public void checkSectionName() {
        MainPage mainPage = new MainPage();
        final String EXPECTED_TEXT = "Онлайн пополнение\nбез комиссии";
        String text = mainPage.getOnlinePayWithoutTaxesHeaderText();
        Assertions.assertEquals(EXPECTED_TEXT, text, "Section header isn't correct.");
    }

    @Test
    public void payParentsListIsEmpty() {
        MainPage mainPage = new MainPage();
        Assertions.assertFalse(mainPage.getPayPartnersList().isEmpty(), "Pay partners list is empty.");
    }

    @Test
    public void checkMoreAboutServiceLink() {
        final String EXPECTED_URL = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        MainPage mainPage = new MainPage();
        mainPage.moreAboutServiceLinkClick();
        String currentURL = BrowserDriver.getDriver().getCurrentUrl();
        Assertions.assertEquals(EXPECTED_URL, currentURL, "Current url isn't correct.");
    }

    @Test
    public void checkContinueButton() {
        String selectedOption = "Услуги связи";
        String phoneNumber = "297777777";
        String sum = "10";
        String email = "test@email.com";
        MainPage mainPage = new MainPage();
        mainPage.optionsDropDownButtonClick();
        mainPage.selectOptionFromDropDownList(selectedOption);
        mainPage.insertToPhoneNumberInput(phoneNumber);
        mainPage.insertToSumInput(sum);
        mainPage.setValueToEmailInput(email);
        mainPage.submitButtonClick();
        BePaidIframe bePaidIframe = new BePaidIframe();
        Assertions.assertTrue(bePaidIframe.bePaidIframeIsDisplayed(), "Iframe isn't displayed");
    }

    @AfterEach
    public void tear() {
        BrowserDriver.quitDriver();
    }
}
