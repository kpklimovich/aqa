package org.example.pages;

import org.example.utils.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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

    private WebElement submitButton = BrowserDriver.getDriver()
            .findElement(new By.ByXPath("//div[@class='pay__wrapper']//form[contains(@class, 'opened')]/button[@type='submit']"));

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
}
