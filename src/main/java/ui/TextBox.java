package ui;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class TextBox extends BaseElement {

    public TextBox(String locator) {
        super(locator);
    }

    public void enterText(String text) {
        getElement().sendKeys(text);
    }
}
