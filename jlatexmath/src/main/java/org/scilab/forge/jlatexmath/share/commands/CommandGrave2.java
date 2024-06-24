package org.scilab.forge.jlatexmath.share.commands;

import org.scilab.forge.jlatexmath.share.AccentedAtom;
import org.scilab.forge.jlatexmath.share.Atom;
import org.scilab.forge.jlatexmath.share.Symbols;
import org.scilab.forge.jlatexmath.share.TeXParser;

public class CommandGrave2 extends Command1A {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new AccentedAtom(a, Symbols.GRAVE);
    }

    @Override
    public boolean close(TeXParser tp) {
        tp.closeConsumer(Symbols.GRAVE);
        return true;
    }

    @Override
    public boolean isClosable() {
        return true;
    }

}