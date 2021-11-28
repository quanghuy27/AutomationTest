package pages;

import commons.GlobalVariable;
import org.openqa.selenium.By;

public class HomePage {

    private final By txtSearch = By.xpath("//input[@class=\"search-input css-1t77xaz\"]");
    private final By btnSearch = By.xpath("//span[@class=\"css-140csle\"]");
    private By btnClose = By.xpath("/html/body/div[3]/div[2]/div/span");


    public void setProductName(String productName) {
        GlobalVariable.getDriver().findElement(txtSearch).sendKeys(productName);
        GlobalVariable.getDriver().findElement(btnSearch).click();

    }
    public void closeAds(){
        GlobalVariable.getDriver().findElement(btnClose).click();
    }
}
