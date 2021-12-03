package helpers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverHelper {

private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static  void setDriver() {
        WebDriverManager.chromedriver().setup();
        driver.set(new ChromeDriver());
        driver.get().manage().window().maximize();
    }

    public static WebDriver getDriver()
    {
        return driver.get();
    }

}
