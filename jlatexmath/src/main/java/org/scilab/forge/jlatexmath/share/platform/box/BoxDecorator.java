package org.scilab.forge.jlatexmath.share.platform.box;

import org.scilab.forge.jlatexmath.share.Box;

/**
 * Decorates a box.
 */
public interface BoxDecorator {

    /**
     * @param box The returned decorated box is based on this one.
     * @return A decorated box.
     */
    Box decorate(Box box);
}
