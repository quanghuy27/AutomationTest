package helpers;

import org.openqa.selenium.By;

public class ElementHelper {
    public static By getLocatorFromString(String locator) {
        String type = StringHelper.splitStringWithChar(locator, "=")[0].trim();
        String body = StringHelper.splitStringWithChar(locator, "=")[1].trim();

        switch (type.toLowerCase()) {
            case "id":
                return By.id(body);
            case "css":
                return By.cssSelector(body);
            case "name":
                return By.name(body);
            case "classname":
                return By.className(body);
            case "tagname":
                return By.tagName(body);
            case "xpath":
                return By.xpath(body);
            default:
                return By.xpath(locator);
        }
    }
}
