package pages;

import helpers.PageHelper;
import ui.Button;
import ui.TextBox;

public class HomePage extends PageHelper {

    private final TextBox txtSearch = new TextBox("xpath = //input[@class=\"search-input css-1t77xaz\"]");
    private final Button btnSearch = new Button("xpath = //span[@class=\"css-140csle\"]");
    private final Button chooseSSD = new Button("xpath = //div[@class=\"css-1odsp4p\" and contains(.,'SSD')]");
    private final Button btnCloseADS = new Button("xpath = //div[@class=\"css-1vqwujl\"]");
    private final Button btnNews  = new Button("xpath = //button[@class=\"css-1252sqg\" and @data-content-name=\"techNewsURL\"]");

    public void setProductName(String productName) {
        txtSearch.enterText(productName);
        btnSearch.click();
    }

    public void chooseSSD() {
        waitForElementAppearShow(chooseSSD.getElementLocator());
        chooseSSD.click();
    }

    public void closeADS() {
        waitForElementAppearShow(btnCloseADS.getElementLocator());
        btnCloseADS.click();
    }

    public void clickNews() {
        waitForElementAppearShow(btnNews.getElementLocator());
        btnNews.click();
    }






}
