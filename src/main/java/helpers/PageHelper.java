package helpers;

import com.aventstack.extentreports.Status;
import commons.GlobalVariable;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import reports.AbstractAssertion;
import reports.TestUtilities;

import java.io.IOException;


public class PageHelper {
    private static final int ELEMENT_TIME_WAIT = 10;

    public static void waitForElementAppearShow(By locator) {
        WebDriverWait webDriverWait = new WebDriverWait(DriverHelper.getDriver(), ELEMENT_TIME_WAIT);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void verifyPoint(By locator, String text){
        int numOfProd = DriverHelper.getDriver().findElements(locator).size();
        Status status = numOfProd > 0 ? Status.PASS : Status.FAIL;
        GlobalVariable.getExtentTest().log(status, "&emsp;&emsp;&emsp;"+text);
    }

    public static void verifyURL(String url, String expected) throws IOException {
        if(DriverHelper.getDriver().getCurrentUrl().equals(url))
        {
            GlobalVariable.getExtentTest().log(Status.PASS,"&emsp;&emsp;&emsp;"+ expected);
        }
        else
        {
            String message = "Verify point fail: " + AbstractAssertion.formatFailedMessage(expected," "+GlobalVariable.getExtentTest().addScreenCaptureFromPath(TestUtilities.captureScreen()));
            GlobalVariable.getExtentTest().log(Status.FAIL,message);
        }
    }
}
