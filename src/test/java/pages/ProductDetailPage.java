package pages;


import helpers.PageHelper;
import ui.Button;


public class ProductDetailPage extends PageHelper {

//    private By btnBuyNow = By.xpath("//div[@class=\"css-f7zc9t\"]/button[@class=\"css-1sa0jyd\"]");
    private final Button btnBuyNow = new Button("xpath = //div[@class=\"css-f7zc9t\"]/button[@class=\"css-1sa0jyd\"]");
    private final Button btnAddCart = new Button("xpath = //button[@class=\"css-1664w5q\"]");
    private final Button btnCart = new Button("xpath = //div[@class=\"css-1e18qtw\"]");
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

    public void chooseMoreProduct(){
        waitForElementAppearShow(btnProduct.getElementLocator());
        btnProduct.click();
    }


}
