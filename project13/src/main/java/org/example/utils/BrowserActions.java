package org.example.utils;

public class BrowserActions {
    public static void GoBack() {
        BrowserDriver.getDriver().navigate().back();
    }
}
