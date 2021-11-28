package pages;

import com.aventstack.extentreports.Status;
import commons.GlobalVariable;
import helpers.PageHelper;
import org.openqa.selenium.By;

public class ProductsPage extends PageHelper {

    private By btnLaptop = By.xpath("//*[@id=\"__next\"]/div[4]/div[1]/div[2]/div[1]/div[1]/div/div/a[2]/div/div[2]");
    private By btnAsus = By.xpath("//*[@id=\"js-brands\"]/div[2]");
    private By btnAsusWithSearch = By.xpath("//*[@class=\"css-eklmil\"]");
    private By btnProducts = By.xpath("//div[@type=\"caption\" and @color=\"textPrimary\"]");
    private By btnProduct = By.xpath("//div[@class=\"css-1h67xpm\"]");

    public void selectProductWithSearch(){
        waitForElementAppearShow(GlobalVariable.getDriver(),btnAsusWithSearch);
        GlobalVariable.getDriver().findElement(btnProduct).click();
    }
    public void selectProduct(){
        GlobalVariable.getDriver().findElement(btnProduct).click();
    }
    public void verifyProductsDisplayed() {
        int numOfProd = GlobalVariable.getDriver().findElements(btnProducts).size();
        Status status = numOfProd > 0 ? Status.PASS : Status.FAIL;
        GlobalVariable.getExtentTest().log(status, "Verify products displayed");
    }
}
