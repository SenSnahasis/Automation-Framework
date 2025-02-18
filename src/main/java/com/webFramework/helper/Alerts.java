package com.webFramework.helper;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;

public class Alerts extends CommonHelper{
    public static Alert getAlert() {
        return webDriver.switchTo().alert();
    }

    public static void acceptAlert() {
        getAlert().accept();
    }

    public static void dismissAlert() {
        getAlert().dismiss();
    }

    public static String getAlertText() {
        return getAlert().getText();
    }

    public static boolean isAlertPresent() {
        try {
            getAlert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public static void acceptAlertIfPresent() {
        if(isAlertPresent()) {
            acceptAlert();
        }
    }

    public static void dismissAlertIfPresent() {
        if(isAlertPresent()) {
            dismissAlert();
        }
    }
}
