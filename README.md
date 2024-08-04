# Windows Application Driver Setup

## Installation & Running WinAppDriver

### Step 1: Download WinAppDriver
Download the Windows Application Driver installer from the following link: [WinAppDriver Releases](https://github.com/Microsoft/WinAppDriver/releases).

### Step 2: Install WinAppDriver
Run the installer on a Windows 10 machine where your application under test is installed and will be tested.

### Step 3: Enable Developer Mode
Enable Developer Mode in Windows settings:
1. Open **Settings**.
2. Go to **Update & Security**.
3. Select **For Developers**.
4. Choose **Developer mode**.

### Step 4: Run WinAppDriver
Run `WinAppDriver.exe` from the installation directory. The default installation directory is: 
`C:\Program Files (x86)\Windows Application Driver`

# Project Setup

## Dependencies

To ensure your project runs correctly, you need to use specific versions of certain dependencies. Follow the instructions below based on your project type.

### Java Projects

For Java projects using Maven, add the following dependencies to your `pom.xml` file:

```xml
<dependencies>
    <!-- Appium Java Client -->
    <dependency>
        <groupId>io.appium</groupId>
        <artifactId>java-client</artifactId>
        <version>7.5.1</version> <!-- Ensure this version is used -->
    </dependency>

    <!-- Selenium Java -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>3.141.59</version> <!-- Ensure this version is used -->
    </dependency>
</dependencies>

