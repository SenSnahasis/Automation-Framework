package com.desktopFramework.helper;

import com.desktopFramework.utility.CONSTANT;

import java.util.Iterator;
import java.util.Set;

public class Window extends CommonHelper{

    public static void setOriginalWindow() {
        CONSTANT.ORIGINAL_WINDOW = desktopDriver.getWindowHandle();
    }

    public static Set<String> getWindows() {
        return desktopDriver.getWindowHandles();
    }

    public static void switchWindow() {
        setOriginalWindow();
        Set<String> windows = getWindows();
        Iterator<String> iterator = windows.iterator();
        while (iterator.hasNext()) {
            String childWindow = iterator.next();
            if (!CONSTANT.ORIGINAL_WINDOW.equals(childWindow)) {
                desktopDriver.switchTo().window(childWindow);
                break;
            }
        }
    }
}
