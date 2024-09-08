package com.webFramework.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CommonHelper {
    public static WebDriver webDriver;
    public CommonHelper() {

    }
    public CommonHelper(WebDriver driver) {CommonHelper.webDriver = driver; }
    public static WebElement getElement(By locator) {return webDriver.findElement(locator);}
    public static List<WebElement> getListOfWebElements(By locator) {
        return webDriver.findElements(locator);
    }
}

