package com.webFramework.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard extends CommonHelper{
    public static Actions action;

    public static void pressKeyUP() {
        action = new Actions(webDriver);
        action.sendKeys(Keys.ARROW_UP).perform();
    }

    public static void pressKeyDown() {
        action = new Actions(webDriver);
        action.sendKeys(Keys.ARROW_DOWN).perform();
    }

    public static void pressKeyLeft() {
        action = new Actions(webDriver);
        action.sendKeys(Keys.ARROW_LEFT).perform();
    }

    public static void pressKeyRight() {
        action = new Actions(webDriver);
        action.sendKeys(Keys.ARROW_RIGHT).perform();
    }

    public static void pressEnter() {
        action = new Actions(webDriver);
        action.sendKeys(Keys.ENTER).perform();
    }

    public static void pressTab() {
        action = new Actions(webDriver);
        action.sendKeys(Keys.TAB).perform();
    }

    public static void pressControlShift(String keyValue) {
        action = new Actions(webDriver);
        action.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT)
                .sendKeys(keyValue)
                .keyUp(Keys.CONTROL).keyUp(Keys.SHIFT)
                .build().perform();
    }

    public static void clearText(By locator) {
        action = new Actions(webDriver);
        action.click(getElement(locator))
                .keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)
                .sendKeys(Keys.BACK_SPACE).build().perform();
    }

    public static void sendText(By locator, String value) {
        action = new Actions(webDriver);
        action.sendKeys(getElement(locator), value).perform();
    }
}
