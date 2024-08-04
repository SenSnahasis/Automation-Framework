package desktopFramework.helper;


import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CommonHelper {
    public static WindowsDriver desktopDriver;
    public CommonHelper() {

    }

    public CommonHelper(WindowsDriver desktopDriver) {
        CommonHelper.desktopDriver = desktopDriver;
    }
    public static WebElement getElement(By locator) {
        return desktopDriver.findElement(locator);
    }

}
