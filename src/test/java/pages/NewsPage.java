package pages;

import helpers.PageHelper;
import ui.Button;
import ui.Text;

import java.io.IOException;

public class NewsPage extends PageHelper {
    private final Button btnNews = new Button("xpath = //a[@href=\"https://phongvu.vn/cong-nghe/macos-12-monterey/\" and contains(.,\"MacOS 12 Monterey\")]");

    public void clickNewsDetail(){
        waitForElementAppearShow(btnNews.getElementLocator());
        btnNews.click();
    }

    public void verifyNewsDisplayed() throws IOException {
        verifyURL("https://phongvu.vn/cong-nghe/","News is displayed");
    }
}
