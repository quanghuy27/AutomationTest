package helpers;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverHelper {

private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static  void setDriver() {
        WebDriverManager.chromedriver().setup();
        driver.set(new ChromeDriver());
//        GridLauncherV3.main(new String[] { "-role", "hub", "-port", "4444" });
//        WebDriverManager.chromedriver().setup();
//
//        GridLauncherV3.main(new String[] { "-role", "node", "-hub",
//                "http://localhost:4444/grid/register", "-browser",
//                "browserName=chrome", "-port", "5555" });
    }

    public static WebDriver getDriver()
    {
        return driver.get();
    }

}
