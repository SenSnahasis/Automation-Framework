package com.desktopFramework.helper;

import org.openqa.selenium.By;

public class Button extends CommonHelper{
    public static void click(By element) {
        getElement(element).click();
    }
    public static void doubleClick(By element) {
        getElement(element).click();
        getElement(element).click();
    }
}
