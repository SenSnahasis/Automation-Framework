package com.desktopFramework.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard extends CommonHelper{
    public static Actions actions;

    public static void clearText(By locator) {
        actions = new Actions(desktopDriver);
        actions.click(getElement(locator))
                .keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)
                .sendKeys(Keys.BACK_SPACE)
                .build().perform();
    }

    public static void sendText(By locator, String text) {
        actions = new Actions(desktopDriver);
        actions.sendKeys(getElement(locator), text).perform();
    }

    public static void clearAndSendText(By locator, String text) {
        clearText(locator);
        sendText(locator, text);
    }
}
