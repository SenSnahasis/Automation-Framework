package com.webFramework.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Checkbox extends CommonHelper{
    public static boolean isChecked(WebElement locator) {
        return locator.isSelected();
    }

    public static boolean isChecked(By locator) {
        return isChecked(getElement(locator));
    }

    public static void checkedTheCheckBox(WebElement locator) {
        if(!isChecked(locator)) {
            locator.click();
        }
    }

    public static void checkedTheCheckBox(By locator) {
        checkedTheCheckBox(getElement(locator));
    }

    public static void unCheckedTheCheckBox(WebElement locator) {
        if(isChecked(locator)) {
            locator.click();
        }
    }

    public static void unCheckedTheCheckBox(By locator) {
        unCheckedTheCheckBox(getElement(locator));
    }
}
