package pages;

import com.aventstack.extentreports.Status;
import commons.GlobalVariable;
import helpers.PageHelper;
import org.openqa.selenium.By;
import ui.Button;
import ui.Text;
import ui.TextBox;

public class CartPage extends PageHelper {
//    private By btnPay = By.xpath("//button[@class=\"css-zx0x0o\"]");
//    private By txtCart = By.xpath("//div[@class=\"css-18baaq3\"]");
    private final Button btnPay = new Button("xpath = //button[@class=\"css-zx0x0o\"]");
    private final Text txtCart = new Text("xpath = //div[@class=\"css-18baaq3\"]");
    private final Button btnDelete = new Button("xpath = //div[@class=\"css-1b294vb\"]");
    private final Button btnAccept = new Button("xpath = //div[@class=\"teko-modal-body\"]/div[@class=\"teko-modal-footer teko-modal-footer-center\"]/button[@class=\"css-1s0uzkz\"]");
    private final Button btnAcceptDeleteAll = new Button("xpath = //div[@class=\"css-zbbb61\"]/div[@class=\"css-148sxs3\"]/button[@class=\"css-1jzqxci\"]");
    private final Button modal = new Button("xpath = //div[@class=\"teko-modal-content\"]");
    private final Button modalDeleteAll = new Button("xpath = //div[@class=\"css-zbbb61\"]");
    private final Button btnHome = new Button("xpath = //img[@class=\"css-qk9wdb css-0\"]");
    private final Button btnDeleteAll = new Button("xpath = //button[@class=\"css-tj2ae3\"]");


    public void clickPay(){
        waitForElementAppearShow(btnPay.getElementLocator());
        btnPay.click();
    }

    public void clickDelete(){
        waitForElementAppearShow(btnDelete.getElementLocator());
        btnDelete.click();
    }
    public void clickAccept(){
        waitForElementAppearShow(btnAccept.getElementLocator());
        waitForElementAppearShow(modal.getElementLocator());
        btnAccept.click();
    }

    public void clickAcceptDeleteAll(){
        waitForElementAppearShow(btnAcceptDeleteAll.getElementLocator());
        waitForElementAppearShow(modalDeleteAll.getElementLocator());
        btnAcceptDeleteAll.click();
    }

    public void clickBackHome(){
        waitForElementAppearShow(btnHome.getElementLocator());
        btnHome.click();
    }

    public void clickDeleteAll(){
        waitForElementAppearShow(btnDeleteAll.getElementLocator());
        btnDeleteAll.click();
    }

    public void verifyCartDisplayed() {
        waitForElementAppearShow(txtCart.getElementLocator());
        verifyPoint(btnPay.getElementLocator(),"Verify Cart displayed");
    }


    public void verifyCartEmpty() {
        verifyPoint(btnDelete.getElementLocator(),"Verify Cart emtry");
    }
}
