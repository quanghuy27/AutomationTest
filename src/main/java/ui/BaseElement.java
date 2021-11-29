package ui;

import commons.GlobalVariable;
import helpers.ElementHelper;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BaseElement {
    private String locator;

    public WebElement getElement() {
        return GlobalVariable.getDriver().findElement(ElementHelper.getLocatorFromString(locator));
    }

    public By getElementLocator() {
        return ElementHelper.getLocatorFromString(locator);
    }
}
