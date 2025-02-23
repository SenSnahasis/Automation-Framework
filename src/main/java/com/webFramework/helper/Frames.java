package com.webFramework.helper;

import org.openqa.selenium.By;

public class Frames extends CommonHelper{
    public static void switchToFrame(By locator) {
        webDriver.switchTo().frame(getElement(locator));
    }

    public static void switchToFrame(String value) {
        webDriver.switchTo().frame(value);
    }

    public static void switchToFrame(int value) {
        webDriver.switchTo().frame(value);
    }

    public static void waitForFrameToSwitch(By locator) {
        ExplicitWait.waitAndSwitchToFrame(locator);
    }

    public static void switchToDefaultContent() {
        webDriver.switchTo().defaultContent();
    }

    public static void switchToParentFrame() {
        webDriver.switchTo().parentFrame();
    }
}
