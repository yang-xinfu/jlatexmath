package org.scilab.forge.jlatexmath.share.commands;

import org.scilab.forge.jlatexmath.share.*;

public class CommandPMatrix extends CommandMatrix {

    @Override
    public Atom newI(TeXParser tp) {
        return new FencedAtom(new SMatrixAtom(aoa, false), Symbols.LBRACK,
                Symbols.RBRACK);
    }
}
