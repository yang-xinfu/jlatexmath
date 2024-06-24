package org.scilab.forge.jlatexmath.share.commands;

import org.scilab.forge.jlatexmath.share.GraphicsAtomBase64;
import org.scilab.forge.jlatexmath.share.TeXParser;

public class CommandImageBase64 extends Command {

    @Override
    public boolean init(TeXParser tp) {
        int width = tp.getArgAsPositiveInteger();
        int height = tp.getArgAsPositiveInteger();
        String base64 = tp.getArgAsString();
        tp.addToConsumer(new GraphicsAtomBase64(width, height, base64));
        return false;
    }

}
