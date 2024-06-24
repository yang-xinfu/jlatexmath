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
package org.scilab.forge.jlatexmath.share.platform;

import org.scilab.forge.jlatexmath.share.Configuration;
import org.scilab.forge.jlatexmath.share.platform.box.BoxDecorator;
import org.scilab.forge.jlatexmath.share.platform.box.DefaultBoxDecorator;
import org.scilab.forge.jlatexmath.share.platform.font.FontFactory;
import org.scilab.forge.jlatexmath.share.platform.geom.GeomFactory;
import org.scilab.forge.jlatexmath.share.platform.graphics.GraphicsFactory;
import org.scilab.forge.jlatexmath.share.platform.resources.ResourceLoaderFactory;

public abstract class FactoryProvider {

    private static FactoryProvider INSTANCE;

    private GeomFactory geomFactory;
    private FontFactory fontFactory;
    private GraphicsFactory graphicsFactory;
    private BoxDecorator boxDecorator;

    protected abstract GeomFactory createGeomFactory();

    protected abstract FontFactory createFontFactory();

    protected abstract GraphicsFactory createGraphicsFactory();

    protected BoxDecorator createBoxDecorator() {
        return new DefaultBoxDecorator();
    }

    protected FactoryProvider() {
    }

    public GeomFactory getGeomFactory() {
        if (geomFactory == null) {
            geomFactory = createGeomFactory();
        }
        return geomFactory;
    }

    public FontFactory getFontFactory() {
        if (fontFactory == null) {
            fontFactory = createFontFactory();
        }
        return fontFactory;
    }

    public GraphicsFactory getGraphicsFactory() {
        if (graphicsFactory == null) {
            graphicsFactory = createGraphicsFactory();
        }
        return graphicsFactory;
    }

    public BoxDecorator getBoxDecorator() {
        if (boxDecorator == null) {
            boxDecorator = createBoxDecorator();
        }
        return boxDecorator;
    }

    /**
     * Overridden in eg FactoryProviderGWT
     *
     * @param string debug message
     */
    public void debug(Object string) {
        System.out.println("[LaTeX] " + string);
    }

    public static void setInstance(FactoryProvider factory) {
        INSTANCE = factory;
        Configuration.getFontMapping();
    }

    public static FactoryProvider getInstance() {
        return INSTANCE;
    }

    public void printStacktrace() {
        try {
            // message null check done in caller
            throw new Exception("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // TODO remove as part of Android / iOS cleanup
    public ResourceLoaderFactory getResourceLoaderFactory() {
        return null;
    }

    // TODO remove as part of Android / iOS cleanup
    protected ResourceLoaderFactory createResourceLoaderFactory() {
        return null;
    }

    public static void debugS(String message) {
        if (INSTANCE != null) {
            INSTANCE.debug(message);
        } else {
            System.out.println(message);
        }

    }

}
