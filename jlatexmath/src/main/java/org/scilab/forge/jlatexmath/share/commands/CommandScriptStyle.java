package org.scilab.forge.jlatexmath.share.commands;

import org.scilab.forge.jlatexmath.share.*;

public class CommandScriptStyle extends CommandStyle {

    public CommandScriptStyle() {
        //
    }

    public CommandScriptStyle(RowAtom size) {
        this.size = size;
    }

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new StyleAtom(TeXConstants.STYLE_SCRIPT, a);
    }
}
