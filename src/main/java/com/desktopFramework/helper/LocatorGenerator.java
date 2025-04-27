package com.desktopFramework.helper;

import org.openqa.selenium.By;

public class LocatorGenerator {
    public static By generateByName(String name) {
        return By.name(name);
    }
    public static By generateByAutomationId(String automationId) {
        return By.xpath("//*[@AutomationId='" + automationId + "']");
    }
    public static By generateLocatorByAttribute(String attribute, String string) {
        return By.xpath("//*[@"+ attribute +"='"+ string +"']");
    }
}
