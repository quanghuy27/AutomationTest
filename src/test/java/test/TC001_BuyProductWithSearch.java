package test;

import helpers.ModelHelper;
import model.Product;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;
import reports.HtmlLog;


public class TC001_BuyProductWithSearch extends BaseTest {

    private final String TEST_URL = "https://phongvu.vn";
    private final String TEST_PRODUCT = "Asus";
    Product product = null;
    HomePage homePage = new HomePage();
    ProductsPage productsPage = new ProductsPage();
    ProductDetailPage productDetailPage = new ProductDetailPage();
    CartPage cartPage = new CartPage();
    LoginPage loginPage = new LoginPage();
    @BeforeClass
    public void navigateToPage() {
        navigateByURL(TEST_URL);
    }

    @BeforeClass
    protected void getTestData() {
        product = ModelHelper.getProductName(TEST_PRODUCT);
    }

    @Test
    public void testAddToCartWithSearch() {
        HtmlLog.stepInfo("Open in https://phongvu.vn");
        HtmlLog.stepInfo("Close ADS");
        HtmlLog.stepInfo("Search product with name");
        homePage.setProductName(product.getProductName());
        productsPage.verifyProductsDisplayed();

        HtmlLog.stepInfo("Select product");
        productsPage.selectProductWithSearch();

        HtmlLog.stepInfo("Verify Product Detail Displayed");
        productDetailPage.verifyProductDetailDisplayed();

        HtmlLog.stepInfo("Click Buy Now");
        productDetailPage.clickBuyNow();

        HtmlLog.stepInfo("Verify Cart Displayed");
        cartPage.verifyCartDisplayed();

        HtmlLog.stepInfo("Click Pay");
        cartPage.clickPay();

        HtmlLog.stepInfo("Verify Login Displayed");
        loginPage.verifyLoginDisplayed();
    }
}
