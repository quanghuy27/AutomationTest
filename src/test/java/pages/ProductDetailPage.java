package pages;


import helpers.PageHelper;
import ui.Button;


public class ProductDetailPage extends PageHelper {

    private final Button btnBuyNow = new Button("xpath = //button[@data-content-name=\"buyNow\"]");
    private final Button btnAddCart = new Button("xpath = //button[@data-content-name=\"addToCart\"]");
    private final Button btnCart = new Button("xpath = //a[@href=\"/cart\" and @class=\"css-cbrxda\"]");
    private final Button btnProduct = new Button("xpath = //img[@class=\"css-ckeaxc\"]");

    public void clickBuyNow(){
        waitForElementAppearShow(btnBuyNow.getElementLocator());
        btnBuyNow.click();
    }

    public void verifyProductDetailDisplayed() {
        waitForElementAppearShow(btnBuyNow.getElementLocator());
        verifyPoint(btnBuyNow.getElementLocator(),"Verify Product Detail displayed");
    }

    public void clickAddCart(){
        waitForElementAppearShow(btnAddCart.getElementLocator());
        btnAddCart.click();
    }

    public void clickCart(){
        waitForElementAppearShow(btnCart.getElementLocator());
        btnCart.click();
    }

}
