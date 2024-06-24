package org.scilab.forge.jlatexmath.share.commands;

import org.scilab.forge.jlatexmath.share.Atom;
import org.scilab.forge.jlatexmath.share.TeXParser;
import org.scilab.forge.jlatexmath.share.XArrowAtom;

public class CommandXSmallRightLeftHarpoons extends Command1O1A {

    @Override
    public Atom newI(TeXParser tp, Atom a, Atom b) {
        return new XArrowAtom(b, a, XArrowAtom.Kind.SmallRightLeftHarpoons);
    }

}
