package test;

import helpers.ModelHelper;
import model.Product;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsPage;
import reports.HtmlLog;

import java.io.IOException;


public class TC001_AddToCartWithSearch extends BaseTest {

    private final String TEST_URL = "https://phongvu.vn";
    private final String TEST_PRODUCT = "Asus";
    Product product = null;
    HomePage homePage = new HomePage();
    ProductsPage productsPage = new ProductsPage();

    @BeforeTest
    public void navigateToPage() {
        navigateByURL(TEST_URL);
    }

    @BeforeTest
    protected void getTestData() {
        product = ModelHelper.getProductName(TEST_PRODUCT);
    }

    @Test
    public void testAddToCartWithSearch() throws IOException {
        HtmlLog.stepInfo("Check if all information inputted correctly");
        homePage.setProductName(product.getProductName());
        homePage.closeAds();
        HtmlLog.stepInfo("The browser navigated to confirm signup page");
        productsPage.selectProductWithSearch();
        productsPage.verifyProductsDisplayed();

    }
}
