package pages;


import com.aventstack.extentreports.Status;
import helpers.PageHelper;
import ui.Button;

import java.io.IOException;


public class ProductsPage extends PageHelper {

    private final Button btnAsusWithSearch = new Button("xpath = //div[@class=\"css-eklmil\"]");
    private final Button btnProducts = new Button("xpath = //div[@type=\"caption\" and @color=\"textPrimary\"]");
    private final Button btnProduct = new Button("xpath = //div[@color=\"textPrimary\" and contains(.,'Laptop ASUS ROG Zephyrus G14 GA401QE-K2097T 90NR05R6-M01500')]");
    private final Button btnProductSecond = new Button("xpath = //div[@color=\"textPrimary\" and contains(.,'Laptop ACER Aspire 3 A315-57G-524Z NX.HZRSV.009')]");
    private final Button btnProductSSD = new Button("xpath = //div[@class=\"css-1vouyjx\"]");


    public void selectProductWithSearch(){
        waitForElementAppearShow(btnAsusWithSearch.getElementLocator());
        btnProduct.click();
    }

    public void chooseProductSecond(){
        waitForElementAppearShow(btnAsusWithSearch.getElementLocator());
        btnProductSecond.click();
    }

    public void chooseProduct(){
        waitForElementAppearShow(btnAsusWithSearch.getElementLocator());
        btnProductSSD.click();
    }

    public void verifyProductsDisplayed() {
        verifyPoint(btnProducts.getElementLocator(),"Verify products displayed");
    }

    public void verifyProductsIsDisplayed() throws IOException {
        verifyURL("http","HomePage is displayed");
    }


}
