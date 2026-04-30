package Creation.AbstractFactory.factories;


import Creation.AbstractFactory.Buttons.Button;
import Creation.AbstractFactory.Buttons.MacOSButton;
import Creation.AbstractFactory.Checkboxes.Checkbox;
import Creation.AbstractFactory.Checkboxes.MacOSCheckbox;

/**
 * en-us: Each concrete factory extends basic factory and responsible for creating
 *        products of a single variety.
 * <br><br>
 * pt-br: Cada fábrica concreta estende a fábrica básica e é responsável por criar
 *        produtos de uma única variedade.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}