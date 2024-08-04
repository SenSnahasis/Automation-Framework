package desktopFramework.helper;

import org.openqa.selenium.By;

public class Button extends CommonHelper{
    public static void singleTap(By element) {
        getElement(element).click();
    }
    public static void doubleTap(By element) {
        getElement(element).click();
        getElement(element).click();
    }
}
