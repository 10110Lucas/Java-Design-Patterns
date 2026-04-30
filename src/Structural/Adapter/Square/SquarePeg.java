package Structural.Adapter.Square;

/**
 * en-us: SquarePegs are not compatible with RoundHoles (they were implemented by <br>
 * previous development team). But we have to integrate them into our program. <br>
 *  <br> <br>
 * pt-br: Parafusos quadrados não são compatíveis com buracos redondos  <br>
 * (foram implementados pela equipe de desenvolvimento anterior).  <br>
 * Mas temos que integrá-los ao nosso programa.
 */
public class SquarePeg {

    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}