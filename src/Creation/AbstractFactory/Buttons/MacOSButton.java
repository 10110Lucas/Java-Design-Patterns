package Creation.AbstractFactory.Buttons;

/**
 * en-us: All products families have the same varieties (MacOS/Windows).<br>
 *        This is a MacOS variant of a button.<br>
 * <br><br>
 * pt-br: Todas as famílias de produtos têm as mesmas variedades (MacOS/Windows).<br>
 *        Esta é uma variante MacOS de um botão.
 */
public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}