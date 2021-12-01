package pages;


import helpers.PageHelper;
import ui.Button;

public class LoginPage extends PageHelper {

    private final Button btnLoginWithGoogle = new Button("xpath = //button[@class=\"css-3jqyn5\"]");

    public void verifyLoginDisplayed() {
        verifyPoint(btnLoginWithGoogle.getElementLocator(),"Verify Login displayed");
    }
}
