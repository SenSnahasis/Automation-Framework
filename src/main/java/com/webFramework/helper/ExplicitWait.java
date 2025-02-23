package com.webFramework.helper;

import com.webFramework.utility.CONSTANT;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait extends CommonHelper {
    public static void hardWait(int value) {
        try {
            if((String.valueOf(value)).length() >= 3) {
                Thread.sleep(value);
            } else {
                Thread.sleep((value*1000));
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void waitForVisibility(By locator) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(CONSTANT.EXPLICIT_WAIT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForPresence(By locator) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(CONSTANT.EXPLICIT_WAIT));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public static void waitForAttributeContains(By locator, String attribute, String value) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(CONSTANT.EXPLICIT_WAIT));
        wait.until(ExpectedConditions.attributeContains(locator, attribute, value));
    }

    public static void waitForElementsToBeClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(CONSTANT.EXPLICIT_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void waitForElementToBeVisibleAndClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(CONSTANT.EXPLICIT_WAIT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void waitForInvisibility(By locator) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(CONSTANT.EXPLICIT_WAIT));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public static void waitAndSwitchToFrame(By locator) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(CONSTANT.EXPLICIT_WAIT));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
    }

    public static void waitUntilThePageIsLoaded() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(CONSTANT.EXPLICIT_WAIT));
        wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("Complete"));
    }
}
