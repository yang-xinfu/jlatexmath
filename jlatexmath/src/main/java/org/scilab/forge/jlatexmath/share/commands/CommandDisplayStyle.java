package org.scilab.forge.jlatexmath.share.commands;

import org.scilab.forge.jlatexmath.share.*;

public class CommandDisplayStyle extends CommandStyle {

    public CommandDisplayStyle() {
        //
    }

    public CommandDisplayStyle(RowAtom size) {
        this.size = size;
    }

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new StyleAtom(TeXConstants.STYLE_DISPLAY, a);
    }

}
