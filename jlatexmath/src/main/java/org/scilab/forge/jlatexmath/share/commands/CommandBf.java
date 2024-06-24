package org.scilab.forge.jlatexmath.share.commands;

import org.scilab.forge.jlatexmath.share.*;

public class CommandBf extends CommandStyle {

    public CommandBf() {
        //
    }

    public CommandBf(RowAtom size) {
        this.size = size;
    }

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new BoldAtom(new RomanAtom(a));
    }

}
