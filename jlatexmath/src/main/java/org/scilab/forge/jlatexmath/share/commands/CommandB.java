package org.scilab.forge.jlatexmath.share.commands;

import org.scilab.forge.jlatexmath.share.*;

public class CommandB extends Command1A {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new UnderOverAtom(a, Symbols.BAR,
                new TeXLength(Unit.MU, 0.1), false, false);
    }

}
