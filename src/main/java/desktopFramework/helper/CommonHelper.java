package desktopFramework.helper;


import io.appium.java_client.windows.WindowsDriver;

public class CommonHelper {
    public static WindowsDriver desktopDriver;

    public CommonHelper(WindowsDriver desktopDriver) {
        CommonHelper.desktopDriver = desktopDriver;
    }

}
