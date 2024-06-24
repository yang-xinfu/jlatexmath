package org.scilab.forge.jlatexmath.share.commands;

import org.scilab.forge.jlatexmath.share.*;

public class CommandPMod extends Command1A {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        final RowAtom ra = new RowAtom(3);
        ra.add(new RomanAtom(TeXParser.getAtomForLatinStr("mod", true)));
        ra.add(new SpaceAtom(Unit.MU, 6.));
        ra.add(a);
        return new PodAtom(ra, 8., true);
    }
}
