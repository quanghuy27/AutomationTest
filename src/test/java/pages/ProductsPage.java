package pages;

import com.aventstack.extentreports.Status;
import commons.GlobalVariable;
import helpers.PageHelper;
import org.openqa.selenium.By;
import ui.Button;
import ui.TextBox;

public class ProductsPage extends PageHelper {

//    private By btnAsusWithSearch = By.xpath("//div[@class=\"css-eklmil\"]");
//    private By btnProducts = By.xpath("//div[@type=\"caption\" and @color=\"textPrimary\"]");
//    private By btnProduct = By.xpath("//img[@class=\"css-ckeaxc\"]");
    private final Button btnAsusWithSearch = new Button("xpath = //div[@class=\"css-eklmil\"]");
    private final Button btnProducts = new Button("xpath = //div[@type=\"caption\" and @color=\"textPrimary\"]");
    private final Button btnProduct = new Button("xpath = //img[@class=\"css-ckeaxc\"]");

    public void selectProductWithSearch(){
        waitForElementAppearShow(btnAsusWithSearch.getElementLocator());
        btnProduct.click();
    }

    public void verifyProductsDisplayed() {
        verifyPoint(btnProducts.getElementLocator(),"Verify products displayed");
    }
}
