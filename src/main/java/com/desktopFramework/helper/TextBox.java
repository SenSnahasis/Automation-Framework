package com.desktopFramework.helper;

import org.openqa.selenium.By;

public class TextBox extends CommonHelper{
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
}
