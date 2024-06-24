package org.scilab.forge.jlatexmath.share.commands;

import org.scilab.forge.jlatexmath.share.*;

public class CommandMoveRight extends Command1A {

    TeXLength right;

    @Override
    public boolean init(TeXParser tp) {
        right = tp.getArgAsLength();
        return true;
    }

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new RowAtom(new SpaceAtom(right), a);
    }
}
