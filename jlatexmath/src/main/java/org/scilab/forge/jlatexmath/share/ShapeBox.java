/* ShapeBox.java
 * =========================================================================
 * This file is part of the JLaTeXMath Library - http://jlatexmath.sourceforge.net
 *
 * Copyright (C) 2018 DENIZET Calixte
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * A copy of the GNU General Public License can be found in the file
 * LICENSE.txt provided with the source distribution of this program (see
 * the META-INF directory in the source jar). This license can also be
 * found on the GNU website at http://www.gnu.org/licenses/gpl.html.
 *
 * If you did not receive a copy of the GNU General Public License along
 * with this program, contact the lead developer, or write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301, USA.
 *
 * Linking this library statically or dynamically with other modules
 * is making a combined work based on this library. Thus, the terms
 * and conditions of the GNU General Public License cover the whole
 * combination.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce
 * an executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under terms
 * of your choice, provided that you also meet, for each linked independent
 * module, the terms and conditions of the license of that module.
 * An independent module is a module which is not derived from or based
 * on this library. If you modify this library, you may extend this exception
 * to your version of the library, but you are not obliged to do so.
 * If you do not wish to do so, delete this exception statement from your
 * version.
 *
 */

package org.scilab.forge.jlatexmath.share;

import org.scilab.forge.jlatexmath.share.platform.geom.Area;
import org.scilab.forge.jlatexmath.share.platform.geom.Rectangle2D;
import org.scilab.forge.jlatexmath.share.platform.geom.Shape;
import org.scilab.forge.jlatexmath.share.platform.graphics.Graphics2DInterface;

/**
 * Responsible for creating a box containing a delimiter symbol that exists in
 * different sizes.
 */
public class ShapeBox extends Box {

    private Shape shape;

    public ShapeBox(final Shape shape) {
        this.shape = shape;
        final Rectangle2D rect = shape.getBounds2DX();
        this.height = rect.getHeight();
        this.depth = 0.;
        this.width = rect.getWidth();
    }

    @Override
    public void draw(Graphics2DInterface g2, double x, double y) {
        startDraw(g2, x, y);
        g2.translate(x, y);
        g2.fill(shape);
        g2.translate(-x, -y);
        endDraw(g2);
    }

    @Override
    public FontInfo getLastFont() {
        return null;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static Box create(final Box b) {
        final Area a = b.getArea();
        if (a != null) {
            final ShapeBox sb = new ShapeBox(a);
            sb.setDepth(b.getDepth());
            sb.setHeight(b.getHeight());
            sb.setWidth(b.getWidth());
            return sb;
        }
        return b;
    }
}
