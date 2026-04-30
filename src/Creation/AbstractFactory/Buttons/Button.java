package Creation.AbstractFactory.Buttons;

/**
 * en-us: Abstract Factory assumes that you have several families of products,
 * structured into separate class hierarchies (Button/Checkbox). All products of
 * the same family have the common interface.<br>
 *        This is the common interface for buttons family.
 * <br><br>
 * pt-br: Abstract Factory assume que você tem várias famílias de produtos, 
 * estruturados em hierarquias de classes separadas (Button/Checkbox). 
 * Todos os produtos da mesma família têm a interface comum.<br>
 *        Esta é a interface comum para a família de botões.
 */
public interface Button {

    void paint();
}