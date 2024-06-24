package org.scilab.forge.jlatexmath.share.commands;

import org.scilab.forge.jlatexmath.share.*;

public class CommandBoxed extends Command1A {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new FBoxAtom(new MathAtom(a, TeXConstants.STYLE_DISPLAY));
    }

}
