package Creation.AbstractFactory.app;

import Creation.AbstractFactory.Buttons.Button;
import Creation.AbstractFactory.Checkboxes.Checkbox;
import Creation.AbstractFactory.factories.GUIFactory;

/**
 * en-us: Factory users don't care which concrete factory they use since they work with
 *        factories and products through abstract interfaces.
 *        This is important!!
 * <br><br>
 * pt-br: Os usuários da fábrica não se importam com qual fábrica concreta eles usam, pois eles trabalham com
 *        fábricas e produtos por meio de interfaces abstratas.
 *        Isso é importante!!
 */
public class Application {
    
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}