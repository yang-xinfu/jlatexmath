package org.scilab.forge.jlatexmath.share.commands;

import org.scilab.forge.jlatexmath.share.*;

public class CommandBuildRel extends CommandStyle {

    public CommandBuildRel() {
        //
    }

    public CommandBuildRel(RowAtom size) {
        this.size = size;
    }

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        if (a instanceof OverAtom) {
            final Atom over = ((OverAtom) a).getNum();
            final Atom base = ((OverAtom) a).getDen();
            return new BuildrelAtom(base, over);
        }
        return a;
    }

}
