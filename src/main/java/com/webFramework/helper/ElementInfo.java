package com.webFramework.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ElementInfo extends CommonHelper {
    public static boolean isElementPresent(By element){
        try{
            return getElement(element).isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }

    }
    public static String getAttributeValue(By element, String attributeName){
        try {
            return getElement(element).getAttribute(attributeName);
        }catch (StaleElementReferenceException e){
            ExplicitWait.hardWait(2000);
            return getElement(element).getAttribute(attributeName);
        }
    }
    public static String getText(By element) {
        return getElement(element).getText();
    }

    public static Boolean isAttributePresent(By element, String attribute) {
        boolean result = false;
        try {
            String value = getAttributeValue(element, attribute);
            if (value != null) {
                result = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return result;
    }

    public static String getCssValue(By locator, String cssAttribute) {
        return getElement(locator).getCssValue(cssAttribute);
    }
    public static int getElementCount(By locator) {
        int size = 0;
        List<WebElement> elementSize = getListOfWebElements(locator);
        size = elementSize.size();
        return size;
    }


}
