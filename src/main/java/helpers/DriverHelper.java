package helpers;


import commons.GlobalVariable;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverHelper {
//    public static WebDriver driver;
//
//    public static void setUp() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        GlobalVariable.setDriver(driver);
//    }
private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static  void setDriver() {
        WebDriverManager.chromedriver().setup();
        driver.set(new ChromeDriver());
    }

    public static WebDriver getDriver()
    {
        return driver.get();
    }

}
