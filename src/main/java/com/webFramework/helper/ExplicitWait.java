package com.webFramework.helper;

import com.webFramework.utility.CONSTANT;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait extends CommonHelper {
    public static void hardWait(int value) {
        try {
            Thread.sleep(value);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void waitForVisibility(By element) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(CONSTANT.EXPLICIT_WAIT));
        wait.until(ExpectedConditions.visibilityOf(getElement(element)));
    }
    public static void waitForVisibility(By element, int pollingTime) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(pollingTime));
        wait.until(ExpectedConditions.visibilityOf(getElement(element)));
    }
    public static void presenceOfElementLocated(By element) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(CONSTANT.EXPLICIT_WAIT));
        wait.until(ExpectedConditions.presenceOfElementLocated(element));
    }
    public static void presenceOfAllElementLocated(By element) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(CONSTANT.EXPLICIT_WAIT));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
    }
    public static void waitForClickable(By element, int pollingTime) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(pollingTime));
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(getElement(element))));
    }
    public static void waitForClickable(By element) {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(CONSTANT.EXPLICIT_WAIT));
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(getElement(element))));
    }

}
