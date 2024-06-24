package org.scilab.forge.jlatexmath.share.commands;

import org.scilab.forge.jlatexmath.share.AccentedAtom;
import org.scilab.forge.jlatexmath.share.Atom;
import org.scilab.forge.jlatexmath.share.TeXParser;

public class CommandT2 extends Command1A {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new AccentedAtom(a, "tie");
    }

}
