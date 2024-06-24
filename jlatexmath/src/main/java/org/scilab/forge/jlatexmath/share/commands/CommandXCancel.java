package org.scilab.forge.jlatexmath.share.commands;

import org.scilab.forge.jlatexmath.share.Atom;
import org.scilab.forge.jlatexmath.share.CancelAtom;
import org.scilab.forge.jlatexmath.share.TeXParser;

public class CommandXCancel extends Command1A {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new CancelAtom(a, CancelAtom.Type.X);
    }

}
