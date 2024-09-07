package com.webFramework.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonHelper {
    public static WebDriver driver;
    public CommonHelper() {

    }
    public CommonHelper(WebDriver driver) {CommonHelper.driver = driver; }
    public static WebElement getElement(By locator) {return driver.findElement(locator);}
}

