package com.webFramework.helper;

import org.openqa.selenium.By;

public class TextBox extends CommonHelper {
    public static void clearText(By element) {
        getElement(element).clear();
    }
    public static void sendKeys(By element, String value) {
        getElement(element).sendKeys(value);
    }
    public static void clearAndSendKeys(By element, String value) {
        clearText(element);
        sendKeys(element,value);
    }
    public static String getText(By locator) {
        return getElement(locator).getText();
    }

    public static void typeText(By locator, String value) {
        for (int i=0; i<value.length(); i++) {
            getElement(locator).sendKeys(String.valueOf(value.charAt(i)));
        }
    }

    public static void clickInTextBox(By locator) {
        getElement(locator).click();
    }
}
