package org.scilab.forge.jlatexmath.share.commands;

import org.scilab.forge.jlatexmath.share.AccentedAtom;
import org.scilab.forge.jlatexmath.share.Atom;
import org.scilab.forge.jlatexmath.share.Symbols;
import org.scilab.forge.jlatexmath.share.TeXParser;

public class CommandMap extends Command1A {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new AccentedAtom(a, Symbols.CHECK);
    }

    @Override
    public boolean close(TeXParser tp) {
        tp.closeConsumer(Symbols.CHECK);
        return true;
    }

    @Override
    public boolean isClosable() {
        return true;
    }

}