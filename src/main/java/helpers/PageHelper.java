package helpers;

import commons.GlobalVariable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageHelper {
    private static final int ELEMENT_TIME_WAIT = 10;

    public void waitForElementAppearShow(WebDriver driver, By locator){
        WebDriverWait webDriverWait = new WebDriverWait(driver, ELEMENT_TIME_WAIT);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForElementAppear(By locator) {
        WebDriverWait webDriverWait = new WebDriverWait(GlobalVariable.getDriver(), ELEMENT_TIME_WAIT);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

}
