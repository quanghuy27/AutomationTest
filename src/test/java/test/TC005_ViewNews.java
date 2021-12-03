package test;

import helpers.DriverHelper;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;
import reports.HtmlLog;

import java.io.IOException;

public class TC005_ViewNews {
    private final String TEST_URL = "https://phongvu.vn";
    HomePage homePage = new HomePage();
    NewsPage newsPage = new NewsPage();
    @BeforeClass
    public void setUp() {
        DriverHelper.setDriver();
    }

    @Test
    public void ViewNews() throws IOException {
        HtmlLog.stepInfo("Open in https://phongvu.vn");
        DriverHelper.getDriver().get(TEST_URL);

        HtmlLog.stepInfo("Close ADS");
        homePage.closeADS();

        HtmlLog.stepInfo("Click News");
        homePage.clickNews();

        HtmlLog.stepInfo("Verify News Displayed");
        newsPage.verifyNewsDisplayed();

        HtmlLog.stepInfo("Click News Detail");
        newsPage.clickNewsDetail();
    }
}
