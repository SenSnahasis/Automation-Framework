package com.webFramework.helper;

import org.openqa.selenium.By;

public class LocatorGenerator {
    public static By generateLocatorFromText(String textValue){
        return By.xpath("//*[text()='"+textValue+"']");
    }
    public static By dynamicLocator(String string) {
        return By.xpath("//*[contains(text(),'"+string+"')]");
    }
    public static By dynamicLocatorLast(String string)
    {
        return By.xpath("(//*[contains(text(),'"+string+"')])[last()]");
    }
}
