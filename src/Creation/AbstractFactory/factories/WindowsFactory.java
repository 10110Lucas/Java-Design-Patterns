package Creation.AbstractFactory.factories;

import Creation.AbstractFactory.Buttons.Button;
import Creation.AbstractFactory.Buttons.WindowsButton;
import Creation.AbstractFactory.Checkboxes.Checkbox;
import Creation.AbstractFactory.Checkboxes.WindowsCheckbox;

/**
 * en-us: Each concrete factory extends basic factory and responsible for creating
 *        products of a single variety.
 * <br><br>
 * pt-br: Cada fábrica concreta estende a fábrica básica e é responsável por criar
 *        produtos de uma única variedade.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
