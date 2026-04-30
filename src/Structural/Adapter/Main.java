package Structural.Adapter;

import Structural.Adapter.Adapters.SquarePegAdapter;
import Structural.Adapter.Round.RoundHole;
import Structural.Adapter.Round.RoundPeg;
import Structural.Adapter.Square.SquarePeg;

/**
 * en-us: Somewhere in client code... <br>
 * pt-br: Em algum lugar no código do cliente...
 */
public class Main {

    public static void main(String[] args) {
        
        // en-us: Round fits round, no surprise.
        // pt-br: Redondo encaixa redondo, sem surpresa.
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // en-us: hole.fits(smallSqPeg);
        //        Won't compile, since hole.fits expects RoundPeg
        // pt-br: hole.fits(smallSqPeg);
        //        Não compila, pois hole.fits espera um RoundPeg

        // en-us: Adapter solves the problem.
        // pt-br: Adaptador resolve o problema.
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
