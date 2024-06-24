package org.scilab.forge.jlatexmath.share.commands;

import org.scilab.forge.jlatexmath.share.*;

public class CommandUnderBrack extends Command1A {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new OverUnderDelimiter(a, null, Symbols.RSQBRACK,
                Unit.EX, 0, false);
    }

}
