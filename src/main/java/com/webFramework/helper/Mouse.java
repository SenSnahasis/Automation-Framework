package com.webFramework.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Mouse extends CommonHelper{
    private static Actions action;
    public static void mouseClick(By locator) {
        action = new Actions(webDriver);
        action.moveToElement(getElement(locator)).click().perform();
    }

    public static void mouseHover(By locator) {
        action = new Actions(webDriver);
        action.moveToElement(getElement(locator)).perform();
    }

    public static void scrollToElement(By locator) {
        action = new Actions(webDriver);
        action.scrollToElement(getElement(locator)).perform();
    }

    public static void clickAndHold(By locator) {
        action = new Actions(webDriver);
        action.clickAndHold(getElement(locator)).perform();
    }

    public static void rightClick(By locator) {
        action = new Actions(webDriver);
        action.contextClick(getElement(locator)).perform();
    }

    public static void singleClick(By locator) {
        action = new Actions(webDriver);
        action.click(getElement(locator));
    }

    public static void doubleClick(By locator) {
        action = new Actions(webDriver);
        action.doubleClick(getElement(locator));
    }

    public static void dragAndDrop(By startPoint, By endPoint) {
        action = new Actions(webDriver);
        action.dragAndDrop(getElement(startPoint), getElement(endPoint));
    }
}
