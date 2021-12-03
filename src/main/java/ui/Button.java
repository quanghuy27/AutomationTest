package ui;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Button extends BaseElement {

    public Button(String locator) {
        super(locator);
    }

    public void click() {
        getElement().click();
    }

}
