package org.scilab.forge.jlatexmath.share.commands;

import org.scilab.forge.jlatexmath.share.*;

public class CommandTextStyle2 extends CommandStyle {

    public CommandTextStyle2() {
        //
    }

    public CommandTextStyle2(RowAtom size) {
        this.size = size;
    }

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new StyleAtom(TeXConstants.STYLE_TEXT, a);
    }
}
