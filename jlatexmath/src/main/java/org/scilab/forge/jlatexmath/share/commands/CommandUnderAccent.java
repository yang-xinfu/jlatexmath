package org.scilab.forge.jlatexmath.share.commands;

import org.scilab.forge.jlatexmath.share.*;

public class CommandUnderAccent extends Command2A {

    @Override
    public Atom newI(TeXParser tp, Atom a, Atom b) {
        // TODO: take into account the italic correction
        // \\underaccent{\\hat}{x}\\underaccent{\\bar}{\\gamma}
        // TODO: verifier que le 0.3 ds undertilde est correct
        // Ca marche pas ce truc parce que \\hat est une command a 1
        // arg...
        return new UnderOverAtom(b, a, new TeXLength(Unit.MU, 0.1),
                false, false);
    }

}
