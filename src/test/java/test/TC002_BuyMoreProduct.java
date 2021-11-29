package test;

import helpers.ModelHelper;
import model.Product;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;
import reports.HtmlLog;

public class TC002_BuyMoreProduct extends BaseTest{
    private final String TEST_URL = "https://phongvu.vn";
    private final String TEST_PRODUCT = "Asus";
    Product product = null;
    HomePage homePage = new HomePage();
    ProductsPage productsPage = new ProductsPage();
    ProductDetailPage productDetailPage = new ProductDetailPage();
    CartPage cartPage = new CartPage();

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

        HtmlLog.stepInfo("Search product with name");
        homePage.setProductName(product.getProductName());
        productsPage.verifyProductsDisplayed();

        HtmlLog.stepInfo("Select product");
        productsPage.selectProductWithSearch();

        HtmlLog.stepInfo("Verify Product Detail Displayed");
        productDetailPage.verifyProductDetailDisplayed();

        HtmlLog.stepInfo("Click Add Cart");
        productDetailPage.clickAddCart();

        HtmlLog.stepInfo("Click Cart");
        productDetailPage.clickCart();

        HtmlLog.stepInfo("Choose more product");
        productDetailPage.chooseMoreProduct();

        HtmlLog.stepInfo("Click Cart");
        productDetailPage.clickCart();

        HtmlLog.stepInfo("Verify Cart Displayed");
        cartPage.verifyCartDisplayed();



    }
}
