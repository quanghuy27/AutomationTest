package pages;

import com.aventstack.extentreports.Status;
import commons.GlobalVariable;
import helpers.PageHelper;
import org.openqa.selenium.By;

public class ProductsPage extends PageHelper {

    private By btnAsusWithSearch = By.xpath("//div[@class=\"css-eklmil\"]");
    private By btnProducts = By.xpath("//div[@type=\"caption\" and @color=\"textPrimary\"]");
    private By btnProduct = By.xpath("//img[@class=\"css-ckeaxc\"]");

    public void selectProductWithSearch(){
        waitForElementAppearShow(GlobalVariable.getDriver(),btnAsusWithSearch);
        GlobalVariable.getDriver().findElement(btnProduct).click();
    }

    public void verifyProductsDisplayed() {
        int numOfProd = GlobalVariable.getDriver().findElements(btnProducts).size();
        Status status = numOfProd > 0 ? Status.PASS : Status.FAIL;
        GlobalVariable.getExtentTest().log(status, "Verify products displayed");
    }
}
