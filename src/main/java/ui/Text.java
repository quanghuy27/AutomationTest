package ui;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Text extends BaseElement {

    public Text(String locator) {
        super(locator);
    }

    public String getText() {
        return getElement().getText();
    }
}
