/**
 * This file is part of the JLaTeXMath library - https://github.com/opencollab/jlatexmath/
 * <p>
 * Copyright (C) 2019 JLaTeXMath developers and GeoGebra Gmbh
 * <p>
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 * <p>
 * A copy of the GNU General Public License can be found in the file
 * LICENSE.txt provided with the source distribution of this program (see
 * the META-INF directory in the source jar). This license can also be
 * found on the GNU website at http://www.gnu.org/licenses/gpl.html.
 * <p>
 * If you did not receive a copy of the GNU General Public License along
 * with this program, contact the lead developer, or write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301, USA.
 * <p>
 * Linking this library statically or dynamically with other modules
 * is making a combined work based on this library. Thus, the terms
 * and conditions of the GNU General Public License cover the whole
 * combination.
 * <p>
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
 */
package org.scilab.forge.jlatexmath.desktop.geom;

import org.scilab.forge.jlatexmath.share.platform.geom.*;

import java.awt.geom.GeneralPath;

public class GeomFactoryDesktop extends GeomFactory {

    @Override
    public Line2D createLine2D(double x1, double y1, double x2, double y2) {
        return new Line2DD(x1, y1, x2, y2);
    }

    @Override
    public Rectangle2D createRectangle2D(double x, double y, double width,
                                         double height) {
        return new Rectangle2DD(x, y, width, height);
    }

    @Override
    public RoundRectangle2D createRoundRectangle2D(double x, double y, double w,
                                                   double h, double arcw, double arch) {
        return new RoundRectangle2DD(x, y, w, h, arcw, arch);
    }

    @Override
    public Point2D createPoint2D(double x, double y) {
        return new Point2DD(x, y);
    }

    @Override
    public Area createArea(Shape s) {
        if (s instanceof GeneralPathD) {
            GeneralPath gp = GeneralPathD.getAwtGeneralPath((s));
            return new AreaD(gp);
        }
        if (s == null) {
            return new AreaD();
        }
        return new AreaD((java.awt.Shape) s);
    }

    @Override
    public Area newArea() {
        return new AreaD();
    }

}
