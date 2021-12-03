package test;

import helpers.DriverHelper;
import helpers.ModelHelper;
import model.Product;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;
import reports.HtmlLog;

import java.io.IOException;

public class TC004_ChooseMoreProductAndDeleteAll {
    private final String TEST_URL = "https://phongvu.vn";
    private final String TEST_PRODUCT = "Asus";
    private final String TEST_PRODUCT1 = "Acer";
    Product product = null;
    Product product1 = null;
    HomePage homePage = new HomePage();
    ProductsPage productsPage = new ProductsPage();
    ProductDetailPage productDetailPage = new ProductDetailPage();
    CartPage cartPage = new CartPage();

    @BeforeClass
    public void setUp() {
        DriverHelper.setDriver();
    }

    @BeforeClass
    protected void getTestData() {
        product = ModelHelper.getProductName(TEST_PRODUCT);
        product1 = ModelHelper.getProductName(TEST_PRODUCT1);
    }

    @Test
    public void ChooseMoreProductAndDeleteAll() throws IOException {
        DriverHelper.getDriver().get(TEST_URL);
        HtmlLog.stepInfo("Open in https://phongvu.vn");

        HtmlLog.stepInfo("Close ADS");
        homePage.closeADS();

        HtmlLog.stepInfo("Search product with name");
        homePage.setProductName(product.getProductName());
        productsPage.verifyProductsDisplayed();

        HtmlLog.stepInfo("Choose product 1");
        productsPage.selectProductWithSearch();

        HtmlLog.stepInfo("Verify Product Detail Displayed");
        productDetailPage.verifyProductDetailDisplayed();

        HtmlLog.stepInfo("Click Add Cart");
        productDetailPage.clickAddCart();

        HtmlLog.stepInfo("Click Cart");
        productDetailPage.clickCart();

        HtmlLog.stepInfo("Verify Cart Displayed");
        cartPage.verifyCartDisplayed();

        HtmlLog.stepInfo("Click Back Home");
        cartPage.clickBackHome();

        HtmlLog.stepInfo("Choose Type Product");
        homePage.chooseSSD();

        HtmlLog.stepInfo("Choose Product 2");
        productsPage.chooseProduct();

        HtmlLog.stepInfo("Click Buy Now");
        productDetailPage.clickBuyNow();

        HtmlLog.stepInfo("Verify Cart Displayed");
        cartPage.verifyCartDisplayed();

        HtmlLog.stepInfo("Click Back Home");
        cartPage.clickBackHome();

        HtmlLog.stepInfo("Search product with name");
        homePage.setProductName(product1.getProductName());
        productsPage.verifyProductsIsDisplayed();

        HtmlLog.stepInfo("Choose product 3");
        productsPage.chooseProductSecond();

        HtmlLog.stepInfo("Click Buy Now");
        productDetailPage.clickBuyNow();

        HtmlLog.stepInfo("Click Delete All Product");
        cartPage.clickDeleteAll();

        HtmlLog.stepInfo("Click Accept");
        cartPage.clickAcceptDeleteAll();

        HtmlLog.stepInfo("Verify Cart Displayed");
        cartPage.verifyCartDisplayed();
    }
}
