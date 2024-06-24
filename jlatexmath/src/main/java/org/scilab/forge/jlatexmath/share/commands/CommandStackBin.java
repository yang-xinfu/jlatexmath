package org.scilab.forge.jlatexmath.share.commands;

import org.scilab.forge.jlatexmath.share.*;

public class CommandStackBin extends Command1O2A {

    @Override
    public Atom newI(TeXParser tp, Atom a, Atom b, Atom c) {
        final Atom at = new UnderOverAtom(c, a,
                new TeXLength(Unit.MU, 3.5), true, b,
                new TeXLength(Unit.MU, 3.), true);
        return at.changeType(TeXConstants.TYPE_BINARY_OPERATOR);
    }
}
