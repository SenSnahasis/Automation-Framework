package com.webFramework.helper;

public class Navigate extends CommonHelper{
    public static void navigateTo(String url) {
        webDriver.navigate().to(url);
    }

    public static void refreshPage() {
        webDriver.navigate().refresh();
    }

    public static String getTitle() {
        return webDriver.getTitle();
    }

    public static String getCurrentUrl() {
        return webDriver.getCurrentUrl();
    }

    public static void quit() {
        webDriver.quit();
    }

    public static void navigateForward() {
        webDriver.navigate().forward();
    }

    public static void navigateBack() {
        webDriver.navigate().back();
    }
}
