package org.scilab.forge.jlatexmath.share.commands;

import org.scilab.forge.jlatexmath.share.Atom;
import org.scilab.forge.jlatexmath.share.FractionAtom;
import org.scilab.forge.jlatexmath.share.TeXParser;

public class CommandATop extends CommandOver {

    @Override
    public Atom newI(TeXParser tp, Atom a, Atom b) {
        return new FractionAtom(a, b, false);
    }
}
