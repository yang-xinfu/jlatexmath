package org.scilab.forge.jlatexmath.share.commands;

import org.scilab.forge.jlatexmath.share.*;

public class CommandDDDDot extends Command1A {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new BuildrelAtom(a,
                new RowAtom(Symbols.TEXTNORMALDOT, Symbols.TEXTNORMALDOT,
                        Symbols.TEXTNORMALDOT, Symbols.TEXTNORMALDOT));
    }

}
