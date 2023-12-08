package org.example.pages;

import org.example.utils.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MainPage {
    private WebElement onlinePayWithoutTaxesHeader = BrowserDriver.getDriver()
            .findElement(new By.ByXPath("//div[@class = 'pay__wrapper']/h2"));

    private List<WebElement> payPartnersList = BrowserDriver.getDriver()
            .findElements(new By.ByXPath("//div[@class = 'pay__wrapper']/div[@class = 'pay__partners']/ul/li"));

    private WebElement moreAboutServiceLink = BrowserDriver.getDriver()
            .findElement(new By.ByXPath("//div[@class = 'pay__wrapper']/a"));

    private WebElement optionsDropDownButton = BrowserDriver.getDriver()
            .findElement(new By.ByXPath("//div[@class = 'pay__form']//button[@class = 'select__header']"));

    private List<WebElement> optionsDropDownList = BrowserDriver.getDriver()
            .findElements(new By.ByXPath("//div[@class = 'pay__form']//ul[@class = 'select__list']/li/p"));

    private WebElement phoneNumberInput = BrowserDriver.getDriver()
            .findElement(new By.ByXPath("//input[@id='connection-phone']"));

    private WebElement sumInput = BrowserDriver.getDriver()
            .findElement(new By.ByXPath("//input[@id='connection-sum']"));

    private WebElement emailInput = BrowserDriver.getDriver()
            .findElement(new By.ByXPath("//input[@id='connection-email']"));

    private WebElement installmentInput = BrowserDriver.getDriver()
            .findElement(new By.ByXPath("//input[@id='score-instalment']"));

    private WebElement accountNumberInput = BrowserDriver.getDriver()
            .findElement(new By.ByXPath("//input[@id='score-arrears']"));

    private WebElement internetPhoneInput = BrowserDriver.getDriver()
            .findElement(new By.ByXPath("//input[@id='internet-phone']"));

    private WebElement submitButton = BrowserDriver.getDriver()
            .findElement(new By.ByXPath("//div[@class='pay__wrapper']//form[contains(@class, 'opened')]/button[@type='submit']"));

    private By bePaidIframeXpath = new By.ByXPath("//iframe[@class='bepaid-iframe']");

    public void optionsDropDownButtonClick() {
        optionsDropDownButton.click();
    }

    public String getOnlinePayWithoutTaxesHeaderText() {
        return onlinePayWithoutTaxesHeader.getText();
    }

    public List<WebElement> getPayPartnersList() {
        return payPartnersList;
    }

    public void moreAboutServiceLinkClick() {
        moreAboutServiceLink.click();
    }

    public void selectOptionFromDropDownList(String option) {
        for (WebElement opt : optionsDropDownList) {
            if (opt.getText().equals(option)) {
                opt.click();
                return;
            }
        }
    }

    public void insertToPhoneNumberInput(String value) {
        phoneNumberInput.sendKeys(value);
    }

    public void insertToSumInput(String value) {
        sumInput.sendKeys(value);
    }

    public void setValueToEmailInput(String value) {
        emailInput.sendKeys(value);
    }

    public void submitButtonClick() {
        submitButton.click();
    }

    public String getCaptionFromPhoneNumberInput() {
        return phoneNumberInput.getAttribute("placeholder");
    }

    public String getCaptionFromSumInput() {
        return sumInput.getAttribute("placeholder");
    }

    public String getCaptionFromEmailInput() {
        return emailInput.getAttribute("placeholder");
    }

    public String getCaptionFromInternetPhoneInput() {
        return internetPhoneInput.getAttribute("placeholder");
    }

    public String getCaptionFromInstallmentInput() {
        return installmentInput.getAttribute("placeholder");
    }

    public String getCaptionFromAccountNumberInput() {
        return accountNumberInput.getAttribute("placeholder");
    }

    public WebElement getBePaidIframe() {
        return new WebDriverWait(BrowserDriver.getDriver(), Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated((new By.ByXPath("//iframe[@class='bepaid-iframe']"))));
    }
}
