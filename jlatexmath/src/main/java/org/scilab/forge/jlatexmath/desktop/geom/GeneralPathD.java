package org.scilab.forge.jlatexmath.desktop.geom;

import org.scilab.forge.jlatexmath.share.platform.FactoryProvider;
import org.scilab.forge.jlatexmath.share.platform.geom.Rectangle2D;
import org.scilab.forge.jlatexmath.share.platform.geom.Shape;

import java.awt.geom.Path2D;

public class GeneralPathD implements ShapeD {

    private final java.awt.geom.GeneralPath impl;

    public GeneralPathD(java.awt.geom.GeneralPath g) {
        impl = g;
    }

    public GeneralPathD() {
        // default winding rule changed for ggb50 (for Polygons) #3983
        impl = new java.awt.geom.GeneralPath(Path2D.WIND_EVEN_ODD);
    }

    public GeneralPathD(int rule) {
        impl = new java.awt.geom.GeneralPath(rule);
    }

    public static java.awt.geom.GeneralPath getAwtGeneralPath(Shape gp) {
        if (!(gp instanceof GeneralPathD)) {
            if (gp != null) {
                FactoryProvider.debugS("other type");
            }
            return null;
        }
        return ((GeneralPathD) gp).impl;
    }

    @Override
    public Rectangle2D getBounds2DX() {
        return new Rectangle2DD(impl.getBounds2D());
    }

}
