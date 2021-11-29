package pages;

import com.aventstack.extentreports.Status;
import commons.GlobalVariable;
import helpers.PageHelper;
import org.openqa.selenium.By;

public class LoginPage extends PageHelper {

    private By btnLoginWithGoogle = By.xpath("//button[@class=\"css-3jqyn5\"]");


    public void verifyCartDisplayed() {
        int numOfProd = GlobalVariable.getDriver().findElements(btnLoginWithGoogle).size();
        System.out.println(numOfProd);
        Status status = numOfProd > 0 ? Status.PASS : Status.FAIL;
        GlobalVariable.getExtentTest().log(status, "Verify Product Detail displayed");
    }
}
