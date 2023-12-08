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
    public void checkCaptionsOnCommunicationServices() {
        String selectedOption = "Услуги связи";
        MainPage mainPage = new MainPage();
        mainPage.optionsDropDownButtonClick();
        mainPage.selectOptionFromDropDownList(selectedOption);
        String expectedValueFromPhoneInput = "Номер телефона";
        String expectedValueFromSumInput = "Сумма";
        String expectedValueFromEmailInput = "E-mail для отправки чека";
        Assertions.assertAll(
            () -> Assertions.assertEquals(expectedValueFromPhoneInput, mainPage.getCaptionFromPhoneNumberInput(),
                    "Caption from phone number input doesn't contain expected value."),
            () -> Assertions.assertEquals(expectedValueFromSumInput, mainPage.getCaptionFromSumInput(),
                    "Caption from sum input doesn't contain expected value."),
            () -> Assertions.assertEquals(expectedValueFromEmailInput, mainPage.getCaptionFromEmailInput(),
                    "Caption from email input doesn't contain expected value.")
        );
    }

    @Test
    public void checkCaptionsOnHomeInternet() {
        String selectedOption = "Домашний интернет";
        MainPage mainPage = new MainPage();
        mainPage.optionsDropDownButtonClick();
        mainPage.selectOptionFromDropDownList(selectedOption);
        String expectedValueFromPhoneInput = "Номер абонента";
        String expectedValueFromSumInput = "Сумма";
        String expectedValueFromEmailInput = "E-mail для отправки чека";
        Assertions.assertAll(
                () -> Assertions.assertEquals(expectedValueFromPhoneInput, mainPage.getCaptionFromInternetPhoneInput(),
                        "Caption from internet input doesn't contain expected value."),
                () -> Assertions.assertEquals(expectedValueFromSumInput, mainPage.getCaptionFromSumInput(),
                        "Caption from sum input doesn't contain expected value."),
                () -> Assertions.assertEquals(expectedValueFromEmailInput, mainPage.getCaptionFromEmailInput(),
                        "Caption from email input doesn't contain expected value.")
        );
    }

    @Test
    public void checkCaptionsOnInstallmentPay() {
        String selectedOption = "Рассрочка";
        MainPage mainPage = new MainPage();
        mainPage.optionsDropDownButtonClick();
        mainPage.selectOptionFromDropDownList(selectedOption);
        String expectedValueFromInstallmentInput = "Номер счета на 44";
        String expectedValueFromSumInput = "Сумма";
        String expectedValueFromEmailInput = "E-mail для отправки чека";
        Assertions.assertAll(
                () -> Assertions.assertEquals(expectedValueFromInstallmentInput, mainPage.getCaptionFromInstallmentInput(),
                        "Caption from installment input doesn't contain expected value."),
                () -> Assertions.assertEquals(expectedValueFromSumInput, mainPage.getCaptionFromSumInput(),
                        "Caption from sum input doesn't contain expected value."),
                () -> Assertions.assertEquals(expectedValueFromEmailInput, mainPage.getCaptionFromEmailInput(),
                        "Caption from email input doesn't contain expected value.")
        );
    }

    @Test
    public void checkCaptionsOnDebt() {
        String selectedOption = "Задолженность";
        MainPage mainPage = new MainPage();
        mainPage.optionsDropDownButtonClick();
        mainPage.selectOptionFromDropDownList(selectedOption);
        String expectedValueFromAccountNumberInput = "Номер счета на 2073";
        String expectedValueFromSumInput = "Сумма";
        String expectedValueFromEmailInput = "E-mail для отправки чека";
        Assertions.assertAll(
                () -> Assertions.assertEquals(expectedValueFromAccountNumberInput, mainPage.getCaptionFromAccountNumberInput(),
                        "Caption from account number input doesn't contain expected value."),
                () -> Assertions.assertEquals(expectedValueFromSumInput, mainPage.getCaptionFromSumInput(),
                        "Caption from sum input doesn't contain expected value."),
                () -> Assertions.assertEquals(expectedValueFromEmailInput, mainPage.getCaptionFromEmailInput(),
                        "Caption from email input doesn't contain expected value.")
        );
    }

    @Test
    public void checkBePaidIframe() {
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

        BrowserDriver.getDriver().switchTo().frame(mainPage.getBePaidIframe());
        BePaidIframe bePaidIframe = new BePaidIframe();

        String expectedValueFromCCNumberPlaceholder = "Номер карты";
        String expectedValueFromCreditCardExpirationTimeLabel = "Срок действия";
        String expectedValueFromCreditCardCVCInputLabel = "CVC";
        String expectedValueFromCreditCardHolderNameInputLabel = "Имя держателя (как на карте)";

        Assertions.assertAll(
            () -> Assertions.assertTrue(bePaidIframe.getPaymentAmount().contains(sum),
                    "Payment amount doesn't contain a sum."),
            () -> Assertions.assertTrue(bePaidIframe.getSubmitPayButtonText().contains(sum),
                    "The pay button doesn't contain a sum."),
            () -> Assertions.assertTrue(bePaidIframe.getPaymentInfo().contains(phoneNumber),
                    "A payment info doesn't contain phone number."),
            () -> Assertions.assertEquals(bePaidIframe.getCreditCardNumberLabelText(), expectedValueFromCCNumberPlaceholder,
                    "Credit card input doesn't contain expected text."),
            () -> Assertions.assertEquals(bePaidIframe.getCreditCardExpirationTimeLabelText(), expectedValueFromCreditCardExpirationTimeLabel,
                    "Expiration time input doesn't contain expected text."),
            () -> Assertions.assertEquals(bePaidIframe.getCreditCardCVCInputLabelText(), expectedValueFromCreditCardCVCInputLabel,
                    "CVC input doesnt contain expected text."),
            () -> Assertions.assertEquals(bePaidIframe.getCreditCardHolderNameInputLabel(), expectedValueFromCreditCardHolderNameInputLabel,
                    "CC holder name doesn't contain expected text."),
            () -> Assertions.assertTrue(!bePaidIframe.isCardBrandsImagesSizeEmpty(),
                    "Card brands list is empty.")
        );
    }

    @AfterEach
    public void tear() {
        BrowserDriver.quitDriver();
    }
}
