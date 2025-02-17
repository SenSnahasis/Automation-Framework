package com.webFramework.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;

public class Button extends CommonHelper {
    public static void click(By element) {
        try {
            getElement(element).click();
        } catch (ElementClickInterceptedException e) {
            getElement(element).click();
        }
    }
    public static void doubleClick(By element) {
        try {
            getElement(element).click();
            getElement(element).click();
        } catch (ElementClickInterceptedException e) {
            getElement(element).click();
            getElement(element).click();
        }
    }
}
