package pages;


import helpers.PageHelper;
import ui.Button;


public class ProductsPage extends PageHelper {

    private final Button btnAsusWithSearch = new Button("xpath = //div[@class=\"css-eklmil\"]");
    private final Button btnProducts = new Button("xpath = //div[@type=\"caption\" and @color=\"textPrimary\"]");
    private final Button btnProduct = new Button("xpath = //div[@class=\"css-1vouyjx\" and contains(.,'Laptop ASUS ROG Zephyrus G14 GA401QE-K2097T')]");
    private final Button btnProductSecond = new Button("xpath = //div[@class=\"css-3z5569\" and contains(.,'Laptop ACER Predator Helios 300 PH315-54-74RU NH.QC1SV.002')]");
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


}
