package com.webFramework.helper;

import org.openqa.selenium.By;

public class LocatorGenerator {
    public static By dynamicLocator(String string) {
        return By.xpath("//*[contains(text(),'"+string+"')]");
    }

    public static By dynamicLocatorLast(String string)
    {
        return By.xpath("(//*[contains(text(),'"+string+"')])[last()]");
    }

    public static By generateById(String id) {
        return By.id(id);
    }

    public static By generateByClass(String className) {
        return By.className(className);
    }

    public static By generateByText(String textValue) {
        return By.xpath("//*[text()='"+textValue+"']");
    }

    public static By generateByTextLast(String textValue) {
        return By.xpath("(//*[text()='"+textValue+"'])[last()]");
    }

    public static By generateLocatorByAttribute(String attribute, String string) {
        return By.xpath("//*[@"+attribute+"='"+string+"']");
    }

    public static By generateLocatorByTagAndAttribute(String tagName, String attribute, String string) {
        return By.xpath("//"+tagName+"[@"+attribute+"='"+string+"']");
    }
}
