package test;

import commons.GlobalVariable;

public class BaseTest {
    /**
     * navigate to a page by its URL
     *
     * @param url
     */
    protected void navigateByURL(String url) {
        GlobalVariable.getDriver().get(url);
    }
}
