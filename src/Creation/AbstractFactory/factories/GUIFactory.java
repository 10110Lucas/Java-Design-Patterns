package Creation.AbstractFactory.factories;

import Creation.AbstractFactory.Buttons.Button;
import Creation.AbstractFactory.Checkboxes.Checkbox;

/**
 * en-us: Abstract factory knows about all (abstract) product types.
 * <br><br>
 * pt-br: A fábrica abstrata conhece todos os tipos de produtos (abstratos).
 */
public interface GUIFactory {
    
    Button createButton();
    Checkbox createCheckbox();
}