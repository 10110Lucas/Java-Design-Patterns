package Structural.Adapter.Round;

/**
 * en-us: RoundHoles are compatible with RoundPegs. <br>
 * pt-br: Buracos redondos são compatíveis com parafusos redondos.
 */
public class RoundHole {

    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}