package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestSeleniumSauceLabs {
    public static final String baseUrl = System.getProperty("baseUrl", "https://www.google.com/");
    //    public static final String host = System.getProperty("host", "localhost");
    public static final String browserName = System.getProperty("browserName", "chrome");
    public static final String browserVersion = System.getProperty("browserVersion", "75.0");
    public static final String platformName = System.getProperty("platformName", "Windows 10");
    public static final String sauceUser = "oauth-thanhtngcd17200-3d846";
    public static final String sauceKey = "cd009abb-df5d-4feb-a9ab-c1391b369a69";
    public static final String sauceUrl = "https://oauth-thanhtngcd17200-3d846:cd009abb-df5d-4feb-a9ab-c1391b369a69@ondemand.us-west-1.saucelabs.com:443/wd/hub";
    protected WebDriver driver;
    @BeforeMethod
    public void setUp() throws MalformedURLException {
        System.out.print(baseUrl);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", browserName);
        capabilities.setCapability("browserVersion", browserVersion);
        capabilities.setCapability("sauceUser", sauceUser);
        capabilities.setCapability("sauceKey", sauceKey);
        capabilities.setCapability("platformName", platformName);
        driver = new RemoteWebDriver(new URL(sauceUrl), capabilities);
    }

    @Test
    public void main() {
        driver.navigate().to(baseUrl);
    }

    @AfterMethod
    public void exit() {
        driver.quit();
    }

}
