package com.webFramework.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard extends CommonHelper{
    static Actions action;
    public static void pressEnter(){
        action = new Actions(webDriver);
        action.sendKeys(Keys.ENTER).build().perform();
    }
    public static void pressKeyDown() {
        action = new Actions(webDriver);
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
    }
    public static void pressKeyUP() {
        action = new Actions(webDriver);
        action.sendKeys(Keys.ARROW_UP).build().perform();
    }
    public static void pressControlShift(String keyValue){
        action = new Actions(webDriver);
        action.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT);
        action.sendKeys(keyValue);
        action.keyUp(Keys.CONTROL).keyUp(Keys.SHIFT);
        action.perform();
    }
    public static void clearText(By locator){
        action = new Actions(webDriver);
        action.click(webDriver.findElement(locator))
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .keyUp(Keys.CONTROL)
                .sendKeys(Keys.BACK_SPACE)
                .build()
                .perform();
    }

}
