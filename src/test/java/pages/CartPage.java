package pages;

import com.aventstack.extentreports.Status;
import commons.GlobalVariable;
import helpers.PageHelper;
import org.openqa.selenium.By;

public class CartPage extends PageHelper {
    private By btnPay = By.xpath("//button[@class=\"css-zx0x0o\"]");
    private By txtCart = By.xpath("//div[@class=\"css-18baaq3\"]");


    public void clickPay(){
        waitForElementAppearShow(GlobalVariable.getDriver(),txtCart);
        GlobalVariable.getDriver().findElement(btnPay).click();
    }

    public void verifyCartDisplayed() {
        waitForElementAppearShow(GlobalVariable.getDriver(),txtCart);
        int numOfProd = GlobalVariable.getDriver().findElements(btnPay).size();
        Status status = numOfProd > 0 ? Status.PASS : Status.FAIL;
        GlobalVariable.getExtentTest().log(status, "Verify Cart displayed");
    }
}
