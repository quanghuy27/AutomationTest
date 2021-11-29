package helpers;

import com.aventstack.extentreports.Status;
import commons.GlobalVariable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageHelper {
    private static final int ELEMENT_TIME_WAIT = 10;

    public static void waitForElementAppearShow(By locator) {
        WebDriverWait webDriverWait = new WebDriverWait(DriverHelper.getDriver(), ELEMENT_TIME_WAIT);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

//    public static void waitForElementAppear(By locator) {
//        WebDriverWait webDriverWait = new WebDriverWait(GlobalVariable.getDriver(), ELEMENT_TIME_WAIT);
//        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//    }

    public static void verifyPoint(By locator, String text){
        int numOfProd = DriverHelper.getDriver().findElements(locator).size();
        Status status = numOfProd > 0 ? Status.PASS : Status.FAIL;
        GlobalVariable.getExtentTest().log(status, text);
    }
}
