package Creation.AbstractFactory.Checkboxes;

/**
 * en-us: All products families have the same varieties (MacOS/Windows).<br>
 *        This is another variant of a checkbox.
 * <br><br>
 * pt-br: Todas as famílias de produtos têm as mesmas variedades (MacOS/Windows).<br>
 *        Esta é outra variante de um checkbox.
 */
public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}