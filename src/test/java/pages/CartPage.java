package pages;


import helpers.PageHelper;
import ui.Button;


public class CartPage extends PageHelper {
    private final Button btnPay = new Button("xpath = //div[@class=\"card-footer css-0\"]/button[@class=\"css-zx0x0o\"]");
    private final Button btnDelete = new Button("xpath = //div[@class=\"css-1b294vb\"]");
    private final Button btnAccept = new Button("xpath = //div[@class=\"teko-modal-body\"]//button[@class=\"css-1s0uzkz\"]");
    private final Button modal = new Button("xpath = //div[@class=\"teko-modal-header\"]");
    private final Button btnHome = new Button("xpath = //img[@src=\"/phongvu/logo.svg\"]");
    private final Button btnDeleteAll = new Button("xpath = //button[@class=\"css-tj2ae3\"]");
    private final Button btnAcceptDeleteAll = new Button("xpath = //div[@class=\"css-zbbb61\"]/div[@class=\"css-148sxs3\"]/button[@class=\"css-1jzqxci\"]");
    private final Button modalDeleteAll = new Button("xpath = //div[@class=\"css-zbbb61\"]");



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
        waitForElementAppearShow(btnPay.getElementLocator());
        verifyPoint(btnPay.getElementLocator(),"Verify Cart displayed");
    }


    public void verifyCartEmpty() {
        verifyPoint(btnDelete.getElementLocator(),"Verify Cart emtry");
    }
}
