package pages;

import com.aventstack.extentreports.Status;
import commons.GlobalVariable;
import helpers.PageHelper;
import org.openqa.selenium.By;

public class ProductDetailPage extends PageHelper {

    private By btnBuyNow = By.xpath("//div[@class=\"css-f7zc9t\"]/button[@class=\"css-1sa0jyd\"]");

    public void clickBuyNow(){
        waitForElementAppearShow(GlobalVariable.getDriver(),btnBuyNow);
        GlobalVariable.getDriver().findElement(btnBuyNow).click();
    }

    public void verifyProductDetailDisplayed() {
        waitForElementAppearShow(GlobalVariable.getDriver(),btnBuyNow);
        int numOfProd = GlobalVariable.getDriver().findElements(btnBuyNow).size();
        System.out.println(numOfProd);
        Status status = numOfProd > 0 ? Status.PASS : Status.FAIL;
        GlobalVariable.getExtentTest().log(status, "Verify Product Detail displayed");
    }
}
