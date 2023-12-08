package org.example.pages;

import org.example.utils.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BePaidIframe {
    private WebElement paymentAmount = new WebDriverWait(BrowserDriver.getDriver(), Duration.ofSeconds(5))
            .until(ExpectedConditions.visibilityOfElementLocated(new By.ByXPath("//p[@class='header__payment-amount']")));

    private WebElement paymentInfo = BrowserDriver.getDriver().findElement(new By.ByXPath("//p[@class='header__payment-info']"));

    private WebElement submitPayButton = BrowserDriver.getDriver().findElement(new By.ByXPath("//section[contains(@class, 'payment-page_pays')]//button[@type='submit']"));

    private WebElement creditCardNumberLabel = BrowserDriver.getDriver()
            .findElement(new By.ByXPath("//input[@id='cc-number']/following-sibling::label"));

    private WebElement creditCardExpirationTimeLabel = BrowserDriver.getDriver()
            .findElement(new By.ByXPath("//input[@formcontrolname='expirationDate']/following-sibling::label"));

    private WebElement creditCardCVCInputLabel = BrowserDriver.getDriver()
            .findElement(new By.ByXPath("//input[@formcontrolname='cvc']/following-sibling::label"));

    private WebElement creditCardHolderNameInputLabel = BrowserDriver.getDriver()
            .findElement(new By.ByXPath("//input[@formcontrolname='holder']/following-sibling::label"));

    private List<WebElement> cardBrandsImages = BrowserDriver.getDriver().findElements(new By.ByXPath("//div[contains(@class, 'cards-brands')]/img"));

    public String getPaymentAmount() {
        return paymentAmount.getText();
    }

    public String getPaymentInfo() {
        return paymentInfo.getText();
    }

    public String getSubmitPayButtonText() {
        return submitPayButton.getText();
    }

    public String getCreditCardNumberLabelText() {
        return creditCardNumberLabel.getText();
    }

    public String getCreditCardExpirationTimeLabelText() {
        return creditCardExpirationTimeLabel.getText();
    }

    public String getCreditCardCVCInputLabelText() {
        return creditCardCVCInputLabel.getText();
    }

    public String getCreditCardHolderNameInputLabel() {
        return creditCardHolderNameInputLabel.getText();
    }

    public boolean isCardBrandsImagesSizeEmpty() {
        return cardBrandsImages.isEmpty();
    }
}
