package pages;

import commons.GlobalVariable;
import org.openqa.selenium.By;
import ui.Button;
import ui.TextBox;

public class HomePage {

//    private final By txtSearch = By.xpath("//input[@class=\"search-input css-1t77xaz\"]");
//    private final By btnSearch = By.xpath("//span[@class=\"css-140csle\"]");
    private final TextBox txtSearch = new TextBox("xpath = //input[@class=\"search-input css-1t77xaz\"]");
    private final Button btnSearch = new Button("xpath = //span[@class=\"css-140csle\"]");

    public void setProductName(String productName) {
//        GlobalVariable.getDriver().findElement(txtSearch).sendKeys(productName);
//        GlobalVariable.getDriver().findElement(btnSearch).click();
        txtSearch.enterText(productName);
        btnSearch.click();
    }
}
