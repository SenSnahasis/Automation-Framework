package com.webFramework.helper;

public class Navigate extends CommonHelper{
    public static void navigateTo(String url) {
        driver.navigate().to(url);
    }

    public static void refreshPage() {
        driver.navigate().refresh();
    }

    public static String getTitle() {
        return driver.getTitle();
    }

    public static String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public static void quit() {
        driver.quit();
    }

    public static void navigateForward() {
        driver.navigate().forward();
    }

    public static void navigateBack() {
        driver.navigate().back();
    }
}
