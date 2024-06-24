package org.scilab.forge.jlatexmath.share.commands;

import org.scilab.forge.jlatexmath.share.*;

public class CommandTextSubscript extends Command {

    boolean mode;

    @Override
    public boolean init(TeXParser tp) {
        mode = tp.setTextMode();
        return true;
    }

    @Override
    public void add(TeXParser tp, Atom a) {
        tp.setMathMode(mode);
        a = new TextStyleAtom(a, TextStyle.MATHNORMAL);
        tp.closeConsumer(SubSupCom.get(EmptyAtom.get(),
                new StyleAtom(TeXConstants.STYLE_TEXT, new RomanAtom(a)),
                null));
    }
}
