package desktopFramework.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;

public class ElementInfo extends CommonHelper{
    public static boolean isElementPresent(By element){
        try{
            return getElement(element).isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }

    }
    public static String getAttributeValue(By element,String attributeName){
        try {
            return getElement(element).getAttribute(attributeName);
        }catch (StaleElementReferenceException e){
            ExplicitWait.hardWait(2000);
            return getElement(element).getAttribute(attributeName);
        }
    }
    public static String getText(By element) {
        return getElement(element).getText();
    }

}
