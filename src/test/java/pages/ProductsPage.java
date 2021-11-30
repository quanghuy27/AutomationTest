package pages;


import helpers.PageHelper;
import ui.Button;


public class ProductsPage extends PageHelper {

    private final Button btnAsusWithSearch = new Button("xpath = //div[@class=\"css-eklmil\"]");
    private final Button btnProducts = new Button("xpath = //div[@type=\"caption\" and @color=\"textPrimary\"]");
    private final Button btnProduct = new Button("xpath = //div[@class=\"css-3z5569\" and contains(.,'Laptop ASUS ROG Zephyrus G14 GA401QE-K2097T')]");


    public void selectProductWithSearch(){
        waitForElementAppearShow(btnAsusWithSearch.getElementLocator());
        btnProduct.click();
    }

    public void verifyProductsDisplayed() {
        verifyPoint(btnProducts.getElementLocator(),"Verify products displayed");
    }
}
