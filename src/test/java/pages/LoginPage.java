package pages;


import helpers.PageHelper;
import org.openqa.selenium.By;
import ui.Button;

public class LoginPage extends PageHelper {

//    private By btnLoginWithGoogle = By.xpath("//button[@class=\"css-3jqyn5\"]");
    private final Button btnLoginWithGoogle = new Button("xpath = //button[@class=\"css-3jqyn5\"]");

    public void verifyLoginDisplayed() {
//        int numOfProd = GlobalVariable.getDriver().findElements(btnLoginWithGoogle).size();
//        System.out.println(numOfProd);
//        Status status = numOfProd > 0 ? Status.PASS : Status.FAIL;
//        GlobalVariable.getExtentTest().log(status, "Verify Product Detail displayed");
        verifyPoint(btnLoginWithGoogle.getElementLocator(),"Verify Product Detail displayed");
    }
}
