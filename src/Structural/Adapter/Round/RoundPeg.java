package Structural.Adapter.Round;

/**
 * en-us: RoundPegs are compatible with RoundHoles. <br>
 * pt-br: Parafusos redondos são compatíveis com buracos redondos.
 */
public class RoundPeg {

    private double radius;

    public RoundPeg() {}

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}