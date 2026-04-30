package Creation.AbstractFactory.Buttons;

/**
 * en-us: All products families have the same varieties (MacOS/Windows).<br>
 *        This is another variant of a button.
 * <br><br>
 * pt-br: Todas as famílias de produtos têm as mesmas variedades (MacOS/Windows).<br>
 *        Esta é outra variante de um botão.
 */
public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}