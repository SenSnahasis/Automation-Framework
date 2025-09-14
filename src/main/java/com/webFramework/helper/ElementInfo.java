package com.webFramework.helper;
import org.openqa.selenium.*;

public class ElementInfo extends CommonHelper {
    private static Rectangle rectangle;

    public static boolean isElementPresent(By element){
        try{
            return getElement(element).isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }
    }

    public static boolean isEnabled(By locator) {
        return getElement(locator).isEnabled();
    }

    public static boolean isSelected(By locator) {
        return getElement(locator).isSelected();
    }

    public static String getAttributeValue(By locator, String attributeName) {
        return getElement(locator).getAttribute(attributeName);
    }

    public static String getText(By locator) {
        return getElement(locator).getText();
    }

    public static String getTagName(By locator) {
        return getElement(locator).getTagName();
    }

    public static String getCssValue(By locator, String cssAttribute) {
        return getElement(locator).getCssValue(cssAttribute);
    }

    public static Dimension getDimension(By locator) {
        rectangle = getElement(locator).getRect();
        return rectangle.getDimension();
    }

    public static int getElementHeight(By locator) {
        rectangle = getElement(locator).getRect();
        return rectangle.getHeight();
    }

    public static int getElementWidth(By locator) {
        rectangle = getElement(locator).getRect();
        return rectangle.getWidth();
    }

    public static int getXCoordinate(By locator) {
        rectangle = getElement(locator).getRect();
        return rectangle.getX();
    }

    public static int getYCoordinate(By locator) {
        rectangle = getElement(locator).getRect();
        return rectangle.getY();
    }

    public static int getElementCount(By locator) {
        return getListOfWebElements(locator).size();
    }

    public static boolean isAttributePresent(By element, String attribute) {
        try {
            String value = getAttributeValue(element, attribute);
            return value != null;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
