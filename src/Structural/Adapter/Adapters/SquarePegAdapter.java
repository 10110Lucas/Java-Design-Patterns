package Structural.Adapter.Adapters;

import Structural.Adapter.Round.RoundPeg;
import Structural.Adapter.Square.SquarePeg;

/**
 * en-us: Adapter allows fitting square pegs into round holes. <br>
 * pt-br: Adaptador permite encaixar parafusos quadrados em buracos redondos.
 */
public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    /**
     * en-us: we don't want to edit SquarePeg directly <br>
     *        we want to create an adaptor that allows roundHole to get the radius of a square peg! <br>
     *        hence we override the RoundPeg radius function <br> <br>
     * pt-br: não queremos editar o SquarePeg diretamente <br>
     *        queremos criar um adaptador que permita ao roundHole obter o raio de um parafuso quadrado! <br>
     *        por isso sobrescrevemos a função de raio do RoundPeg
     */
    @Override
    public double getRadius() {
        double result;
        // en-us: Calculate a minimum circle radius, which can fit this peg.
        // pt-br: Calcula um raio mínimo de círculo, que possa encaixar este parafuso.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}