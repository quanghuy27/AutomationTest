package pages;

import helpers.PageHelper;
import ui.Button;
import ui.Text;

public class NewsPage extends PageHelper {
    private final Button btnNews = new Button("xpath = //a[@href=\"https://phongvu.vn/cong-nghe/macos-12-monterey/\" and contains(.,\"MacOS 12 Monterey\")]");
    private final Text news = new Text("xpath = //div[@class=\"td-trending-now-title\"]");

    public void clickNewsDetail(){
        waitForElementAppearShow(btnNews.getElementLocator());
        btnNews.click();
    }

    public void verifyNewsDisplayed() {
        verifyPoint(news.getElementLocator(),"Verify News displayed");
    }
}
