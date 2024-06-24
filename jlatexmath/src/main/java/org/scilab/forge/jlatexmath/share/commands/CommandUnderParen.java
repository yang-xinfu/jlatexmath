package org.scilab.forge.jlatexmath.share.commands;

import org.scilab.forge.jlatexmath.share.*;

public class CommandUnderParen extends Command1A {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new OverUnderDelimiter(a, null, Symbols.RBRACK,
                Unit.EX, 0, false);
    }

}
