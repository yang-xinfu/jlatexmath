/* CMBX10.java
 * =========================================================================
 * This file is part of the JLaTeXMath Library - http://forge.scilab.org/jlatexmath
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

package org.scilab.forge.jlatexmath.share.fonts;

import org.scilab.forge.jlatexmath.share.Configuration;
import org.scilab.forge.jlatexmath.share.FontInfo;

final class CMBX10 extends FontInfo {

    CMBX10(final String ttfPath) {
        super(0, ttfPath, 0.444445, 0.383331, 1.149994, '\u0000');
    }

    @Override
    protected final void initMetrics() {
        setInfo('\u00A1', // char code: 161
                new double[]{0.691663, 0.686111, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u00A2', // char code: 162
                new double[]{0.958328, 0.686111, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u00A3', // char code: 163
                new double[]{0.89444, 0.686111, 0., 0.}, // metrics: width,
                // height, depth,
                // italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u00A4', // char code: 164
                new double[]{0.805552, 0.686111, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u00A5', // char code: 165
                new double[]{0.766663, 0.686111, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u00A6', // char code: 166
                new double[]{0.899996, 0.686111, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u00A7', // char code: 167
                new double[]{0.830551, 0.686111, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u00A8', // char code: 168
                new double[]{0.89444, 0.686111, 0., 0.}, // metrics: width,
                // height, depth,
                // italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u00A9', // char code: 169
                new double[]{0.830551, 0.686111, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u00AA', // char code: 170
                new double[]{0.89444, 0.686111, 0., 0.}, // metrics: width,
                // height, depth,
                // italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u00AB', // char code: 171
                new double[]{0.830551, 0.686111, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u00AE', // char code: 174
                new double[]{0.67083, 0.694445, 0., 0.109027}, // metrics:
                // width,
                // height,
                // depth,
                // italic
                new char[]{'\u0069', '\u00B1', '\u006C', '\u00B2'}, // ligatures
                new char[]{'\'', '\u003F', '\u0021', '\u0029', '\u005D'}, // kern
                // codes
                new double[]{0.109027, 0.109027, 0.109027, 0.109027,
                        0.109027}, // kern
                // values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u00AF', // char code: 175
                new double[]{0.6388855, 0.694445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u00B0', // char code: 176
                new double[]{0.6388855, 0.694445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u00B1', // char code: 177
                new double[]{0.958328, 0.694445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u00B2', // char code: 178
                new double[]{0.958328, 0.694445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u00B3', // char code: 179
                new double[]{0.319443, 0.444445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u00B4', // char code: 180
                new double[]{0.351387, 0.444445, 0.194445, 0.}, // metrics:
                // width,
                // height,
                // depth,
                // italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u00B5', // char code: 181
                new double[]{0.574997, 0.694445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u00B6', // char code: 182
                new double[]{0.574997, 0.694445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u00B7', // char code: 183
                new double[]{0.574997, 0.631945, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u00B8', // char code: 184
                new double[]{0.574997, 0.694445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u00B9', // char code: 185
                new double[]{0.574997, 0.596109, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u00BA', // char code: 186
                new double[]{0.86944, 0.694445, 0., 0.}, // metrics: width,
                // height, depth,
                // italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u00BB', // char code: 187
                new double[]{0.511108, 0., 0.170138, 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u00BC', // char code: 188
                new double[]{0.597219, 0.694445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u00BD', // char code: 189
                new double[]{0.830551, 0.444445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u00BE', // char code: 190
                new double[]{0.89444, 0.444445, 0., 0.}, // metrics: width,
                // height, depth,
                // italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u00BF', // char code: 191
                new double[]{0.574997, 0.541667, 0.097223, 0.}, // metrics:
                // width,
                // height,
                // depth,
                // italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u00C0', // char code: 192
                new double[]{1.041661, 0.686111, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u00C1', // char code: 193
                new double[]{1.169438, 0.686111, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u00C2', // char code: 194
                new double[]{0.89444, 0.734723, 0.048612, 0.}, // metrics:
                // width,
                // height,
                // depth,
                // italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u00C3', // char code: 195
                new double[]{0.319443, 0.444445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                new char[]{'\u006C', '\u004C'}, // kern codes
                new double[]{-0.319443, -0.377777}, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0021', // char code: 33
                new double[]{0.349998, 0.694445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                new char[]{'\u0060', '\u003C'}, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\"', // char code: 34
                new double[]{0.602776, 0.694445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0023', // char code: 35
                new double[]{0.958328, 0.694445, 0.194443, 0.}, // metrics:
                // width,
                // height,
                // depth,
                // italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0024', // char code: 36
                new double[]{0.574997, 0.75, 0.055555, 0.}, // metrics:
                // width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0025', // char code: 37
                new double[]{0.958328, 0.75, 0.055555, 0.}, // metrics:
                // width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0026', // char code: 38
                new double[]{0.89444, 0.694445, 0., 0.}, // metrics: width,
                // height, depth,
                // italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\'', // char code: 39
                new double[]{0.319443, 0.694445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                new char[]{'\'', '\"'}, // ligatures
                new char[]{'\u003F', '\u0021'}, // kern codes
                new double[]{0.127777, 0.127777}, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0028', // char code: 40
                new double[]{0.44722, 0.75, 0.25, 0.}, // metrics: width,
                // height, depth,
                // italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                Configuration.getFonts().cmex10, '\u00A1', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0029', // char code: 41
                new double[]{0.44722, 0.75, 0.25, 0.}, // metrics: width,
                // height, depth,
                // italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                Configuration.getFonts().cmex10, '\u00A2', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u002A', // char code: 42
                new double[]{0.574997, 0.75, 0., 0.}, // metrics: width,
                // height, depth,
                // italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u002B', // char code: 43
                new double[]{0.89444, 0.633331, 0.133331, 0.}, // metrics:
                // width,
                // height,
                // depth,
                // italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u002C', // char code: 44
                new double[]{0.319443, 0.155556, 0.194445, 0.}, // metrics:
                // width,
                // height,
                // depth,
                // italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u002D', // char code: 45
                new double[]{0.383331, 0.444445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                new char[]{'\u002D', '\u007B'}, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u002E', // char code: 46
                new double[]{0.319443, 0.155556, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u002F', // char code: 47
                new double[]{0.574997, 0.75, 0.25, 0.}, // metrics: width,
                // height, depth,
                // italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                Configuration.getFonts().cmex10, '\u00B1', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0030', // char code: 48
                new double[]{0.574997, 0.644444, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0031', // char code: 49
                new double[]{0.574997, 0.644444, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0032', // char code: 50
                new double[]{0.574997, 0.644444, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0033', // char code: 51
                new double[]{0.574997, 0.644444, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0034', // char code: 52
                new double[]{0.574997, 0.644444, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0035', // char code: 53
                new double[]{0.574997, 0.644444, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0036', // char code: 54
                new double[]{0.574997, 0.644444, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0037', // char code: 55
                new double[]{0.574997, 0.644444, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0038', // char code: 56
                new double[]{0.574997, 0.644444, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0039', // char code: 57
                new double[]{0.574997, 0.644444, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u003A', // char code: 58
                new double[]{0.319443, 0.444445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u003B', // char code: 59
                new double[]{0.319443, 0.444445, 0.194445, 0.}, // metrics:
                // width,
                // height,
                // depth,
                // italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u003C', // char code: 60
                new double[]{0.349998, 0.5, 0.194445, 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u003D', // char code: 61
                new double[]{0.89444, 0.391111, -0.108889, 0.}, // metrics:
                // width,
                // height,
                // depth,
                // italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u003E', // char code: 62
                new double[]{0.543053, 0.5, 0.194445, 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u003F', // char code: 63
                new double[]{0.543053, 0.694445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                new char[]{'\u0060', '\u003E'}, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0040', // char code: 64
                new double[]{0.89444, 0.694445, 0., 0.}, // metrics: width,
                // height, depth,
                // italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0041', // char code: 65
                new double[]{0.86944, 0.686111, 0., 0.}, // metrics: width,
                // height, depth,
                // italic
                null, // ligatures
                new char[]{'\u0074', '\u0043', '\u004F', '\u0047', '\u0055',
                        '\u0051', '\u0054', '\u0059', '\u0056', '\u0057'}, // kern
                // codes
                new double[]{-0.031944, -0.031944, -0.031944, -0.031944,
                        -0.031944, -0.031944, -0.095833, -0.095833, -0.127777,
                        -0.127777}, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0042', // char code: 66
                new double[]{0.818051, 0.686111, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0043', // char code: 67
                new double[]{0.830551, 0.686111, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0044', // char code: 68
                new double[]{0.88194, 0.686111, 0., 0.}, // metrics: width,
                // height, depth,
                // italic
                null, // ligatures
                new char[]{'\u0058', '\u0057', '\u0041', '\u0056', '\u0059'}, // kern
                // codes
                new double[]{-0.031944, -0.031944, -0.031944, -0.031944,
                        -0.031944}, // kern
                // values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0045', // char code: 69
                new double[]{0.755551, 0.686111, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0046', // char code: 70
                new double[]{0.723607, 0.686111, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                new char[]{'\u006F', '\u0065', '\u0075', '\u0072', '\u0061',
                        '\u0041', '\u004F', '\u0043', '\u0047', '\u0051'}, // kern
                // codes
                new double[]{-0.095833, -0.095833, -0.095833, -0.095833,
                        -0.095833, -0.127777, -0.031944, -0.031944, -0.031944,
                        -0.031944}, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0047', // char code: 71
                new double[]{0.904162, 0.686111, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0048', // char code: 72
                new double[]{0.899996, 0.686111, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0049', // char code: 73
                new double[]{0.43611, 0.686111, 0., 0.}, // metrics: width,
                // height, depth,
                // italic
                null, // ligatures
                new char[]{'\u0049'}, // kern codes
                new double[]{0.031944}, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u004A', // char code: 74
                new double[]{0.594441, 0.686111, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u004B', // char code: 75
                new double[]{0.901384, 0.686111, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                new char[]{'\u004F', '\u0043', '\u0047', '\u0051'}, // kern
                // codes
                new double[]{-0.031944, -0.031944, -0.031944, -0.031944}, // kern
                // values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u004C', // char code: 76
                new double[]{0.691663, 0.686111, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                new char[]{'\u0054', '\u0059', '\u0056', '\u0057'}, // kern
                // codes
                new double[]{-0.095833, -0.095833, -0.127777, -0.127777}, // kern
                // values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u004D', // char code: 77
                new double[]{1.091661, 0.686111, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u004E', // char code: 78
                new double[]{0.899996, 0.686111, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u004F', // char code: 79
                new double[]{0.863884, 0.686111, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                new char[]{'\u0058', '\u0057', '\u0041', '\u0056', '\u0059'}, // kern
                // codes
                new double[]{-0.031944, -0.031944, -0.031944, -0.031944,
                        -0.031944}, // kern
                // values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0050', // char code: 80
                new double[]{0.786107, 0.686111, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                new char[]{'\u0041', '\u006F', '\u0065', '\u0061', '\u002E',
                        '\u002C'}, // kern
                // codes
                new double[]{-0.095833, -0.031944, -0.031944, -0.031944,
                        -0.095833, -0.095833}, // kern
                // values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0051', // char code: 81
                new double[]{0.863884, 0.686111, 0.194445, 0.}, // metrics:
                // width,
                // height,
                // depth,
                // italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0052', // char code: 82
                new double[]{0.862495, 0.686111, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                new char[]{'\u0074', '\u0043', '\u004F', '\u0047', '\u0055',
                        '\u0051', '\u0054', '\u0059', '\u0056', '\u0057'}, // kern
                // codes
                new double[]{-0.031944, -0.031944, -0.031944, -0.031944,
                        -0.031944, -0.031944, -0.095833, -0.095833, -0.127777,
                        -0.127777}, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0053', // char code: 83
                new double[]{0.6388855, 0.686111, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0054', // char code: 84
                new double[]{0.799995, 0.686111, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                new char[]{'\u0079', '\u0065', '\u006F', '\u0072', '\u0061',
                        '\u0041', '\u0075'}, // kern
                // codes
                new double[]{-0.031944, -0.095833, -0.095833, -0.095833,
                        -0.095833, -0.095833, -0.095833}, // kern
                // values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0055', // char code: 85
                new double[]{0.884718, 0.686111, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0056', // char code: 86
                new double[]{0.86944, 0.686111, 0., 0.015973}, // metrics:
                // width,
                // height,
                // depth,
                // italic
                null, // ligatures
                new char[]{'\u006F', '\u0065', '\u0075', '\u0072', '\u0061',
                        '\u0041', '\u004F', '\u0043', '\u0047', '\u0051'}, // kern
                // codes
                new double[]{-0.095833, -0.095833, -0.095833, -0.095833,
                        -0.095833, -0.127777, -0.031944, -0.031944, -0.031944,
                        -0.031944}, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0057', // char code: 87
                new double[]{1.188883, 0.686111, 0., 0.015973}, // metrics:
                // width,
                // height,
                // depth,
                // italic
                null, // ligatures
                new char[]{'\u006F', '\u0065', '\u0075', '\u0072', '\u0061',
                        '\u0041', '\u004F', '\u0043', '\u0047', '\u0051'}, // kern
                // codes
                new double[]{-0.095833, -0.095833, -0.095833, -0.095833,
                        -0.095833, -0.127777, -0.031944, -0.031944, -0.031944,
                        -0.031944}, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0058', // char code: 88
                new double[]{0.86944, 0.686111, 0., 0.}, // metrics: width,
                // height, depth,
                // italic
                null, // ligatures
                new char[]{'\u004F', '\u0043', '\u0047', '\u0051'}, // kern
                // codes
                new double[]{-0.031944, -0.031944, -0.031944, -0.031944}, // kern
                // values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0059', // char code: 89
                new double[]{0.86944, 0.686111, 0., 0.028749}, // metrics:
                // width,
                // height,
                // depth,
                // italic
                null, // ligatures
                new char[]{'\u0065', '\u006F', '\u0072', '\u0061', '\u0041',
                        '\u0075'}, // kern
                // codes
                new double[]{-0.095833, -0.095833, -0.095833, -0.095833,
                        -0.095833, -0.095833}, // kern
                // values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u005A', // char code: 90
                new double[]{0.702774, 0.686111, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u005B', // char code: 91
                new double[]{0.319443, 0.75, 0.25, 0.}, // metrics: width,
                // height, depth,
                // italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                Configuration.getFonts().cmex10, '\u00A3', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\\', // char code: 92
                new double[]{0.602776, 0.694445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u005D', // char code: 93
                new double[]{0.319443, 0.75, 0.25, 0.}, // metrics: width,
                // height, depth,
                // italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                Configuration.getFonts().cmex10, '\u00A4', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u005E', // char code: 94
                new double[]{0.574997, 0.694445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u005F', // char code: 95
                new double[]{0.319443, 0.694445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0060', // char code: 96
                new double[]{0.319443, 0.694445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                new char[]{'\u0060', '\\'}, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0061', // char code: 97
                new double[]{0.559024, 0.444445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                new char[]{'\u0076', '\u006A', '\u0079', '\u0077'}, // kern
                // codes
                new double[]{-0.031944, 0.063889, -0.031944, -0.031944}, // kern
                // values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0062', // char code: 98
                new double[]{0.6388855, 0.694445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                new char[]{'\u0065', '\u006F', '\u0078', '\u0064', '\u0063',
                        '\u0071', '\u0076', '\u006A', '\u0079', '\u0077'}, // kern
                // codes
                new double[]{0.031944, 0.031944, -0.031944, 0.031944,
                        0.031944, 0.031944, -0.031944, 0.063889, -0.031944,
                        -0.031944}, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0063', // char code: 99
                new double[]{0.511108, 0.444445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                new char[]{'\u0068', '\u006B'}, // kern codes
                new double[]{-0.031944, -0.031944}, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0064', // char code: 100
                new double[]{0.6388855, 0.694445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0065', // char code: 101
                new double[]{0.5270815, 0.444445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0066', // char code: 102
                new double[]{0.351387, 0.694445, 0., 0.109027}, // metrics:
                // width,
                // height,
                // depth,
                // italic
                new char[]{'\u0069', '\u00AF', '\u0066', '\u00AE', '\u006C',
                        '\u00B0'}, // ligatures
                new char[]{'\'', '\u003F', '\u0021', '\u0029', '\u005D'}, // kern
                // codes
                new double[]{0.109027, 0.109027, 0.109027, 0.109027,
                        0.109027}, // kern
                // values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0067', // char code: 103
                new double[]{0.574997, 0.444445, 0.194445, 0.015973}, // metrics:
                // width,
                // height,
                // depth,
                // italic
                null, // ligatures
                new char[]{'\u006A'}, // kern codes
                new double[]{0.031944}, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0068', // char code: 104
                new double[]{0.6388855, 0.694445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                new char[]{'\u0074', '\u0075', '\u0062', '\u0079', '\u0076',
                        '\u0077'}, // kern
                // codes
                new double[]{-0.031944, -0.031944, -0.031944, -0.031944,
                        -0.031944, -0.031944}, // kern
                // values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0069', // char code: 105
                new double[]{0.319443, 0.694445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u006A', // char code: 106
                new double[]{0.351387, 0.694445, 0.194445, 0.}, // metrics:
                // width,
                // height,
                // depth,
                // italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u006B', // char code: 107
                new double[]{0.606941, 0.694445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                new char[]{'\u0061', '\u0065', '\u0061', '\u006F', '\u0063'}, // kern
                // codes
                new double[]{-0.063889, -0.031944, -0.031944, -0.031944,
                        -0.031944}, // kern
                // values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u006C', // char code: 108
                new double[]{0.319443, 0.694445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u006D', // char code: 109
                new double[]{0.958328, 0.444445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                new char[]{'\u0074', '\u0075', '\u0062', '\u0079', '\u0076',
                        '\u0077'}, // kern
                // codes
                new double[]{-0.031944, -0.031944, -0.031944, -0.031944,
                        -0.031944, -0.031944}, // kern
                // values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u006E', // char code: 110
                new double[]{0.6388855, 0.444445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                new char[]{'\u0074', '\u0075', '\u0062', '\u0079', '\u0076',
                        '\u0077'}, // kern
                // codes
                new double[]{-0.031944, -0.031944, -0.031944, -0.031944,
                        -0.031944, -0.031944}, // kern
                // values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u006F', // char code: 111
                new double[]{0.574997, 0.444445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                new char[]{'\u0065', '\u006F', '\u0078', '\u0064', '\u0063',
                        '\u0071', '\u0076', '\u006A', '\u0079', '\u0077'}, // kern
                // codes
                new double[]{0.031944, 0.031944, -0.031944, 0.031944,
                        0.031944, 0.031944, -0.031944, 0.063889, -0.031944,
                        -0.031944}, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0070', // char code: 112
                new double[]{0.6388855, 0.444445, 0.194445, 0.}, // metrics:
                // width,
                // height,
                // depth,
                // italic
                null, // ligatures
                new char[]{'\u0065', '\u006F', '\u0078', '\u0064', '\u0063',
                        '\u0071', '\u0076', '\u006A', '\u0079', '\u0077'}, // kern
                // codes
                new double[]{0.031944, 0.031944, -0.031944, 0.031944,
                        0.031944, 0.031944, -0.031944, 0.063889, -0.031944,
                        -0.031944}, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0071', // char code: 113
                new double[]{0.606941, 0.444445, 0.194445, 0.}, // metrics:
                // width,
                // height,
                // depth,
                // italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0072', // char code: 114
                new double[]{0.47361, 0.444445, 0., 0.}, // metrics: width,
                // height, depth,
                // italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0073', // char code: 115
                new double[]{0.4536085, 0.444445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0074', // char code: 116
                new double[]{0.44722, 0.634921, 0., 0.}, // metrics: width,
                // height, depth,
                // italic
                null, // ligatures
                new char[]{'\u0079', '\u0077'}, // kern codes
                new double[]{-0.031944, -0.031944}, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0075', // char code: 117
                new double[]{0.6388855, 0.444445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                new char[]{'\u0077'}, // kern codes
                new double[]{-0.031944}, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0076', // char code: 118
                new double[]{0.606941, 0.444445, 0., 0.015973}, // metrics:
                // width,
                // height,
                // depth,
                // italic
                null, // ligatures
                new char[]{'\u0061', '\u0065', '\u0061', '\u006F', '\u0063'}, // kern
                // codes
                new double[]{-0.063889, -0.031944, -0.031944, -0.031944,
                        -0.031944}, // kern
                // values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0077', // char code: 119
                new double[]{0.830551, 0.444445, 0., 0.015973}, // metrics:
                // width,
                // height,
                // depth,
                // italic
                null, // ligatures
                new char[]{'\u0065', '\u0061', '\u006F', '\u0063'}, // kern
                // codes
                new double[]{-0.031944, -0.031944, -0.031944, -0.031944}, // kern
                // values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0078', // char code: 120
                new double[]{0.606941, 0.444445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u0079', // char code: 121
                new double[]{0.606941, 0.444445, 0.194445, 0.015973}, // metrics:
                // width,
                // height,
                // depth,
                // italic
                null, // ligatures
                new char[]{'\u006F', '\u0065', '\u0061', '\u002E', '\u002C'}, // kern
                // codes
                new double[]{-0.031944, -0.031944, -0.031944, -0.095833,
                        -0.095833}, // kern
                // values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u007A', // char code: 122
                new double[]{0.511108, 0.444445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u007B', // char code: 123
                new double[]{0.574997, 0.444445, 0., 0.031944}, // metrics:
                // width,
                // height,
                // depth,
                // italic
                new char[]{'\u002D', '\u007C'}, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u007C', // char code: 124
                new double[]{1.149994, 0.444445, 0., 0.031944}, // metrics:
                // width,
                // height,
                // depth,
                // italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u007D', // char code: 125
                new double[]{0.574997, 0.694445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u007E', // char code: 126
                new double[]{0.574997, 0.694445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u00C4', // char code: 196
                new double[]{0.574997, 0.694445, 0., 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
        setInfo('\u00C5', // char code: 197
                new double[]{0.319366, 0.029, 0.215, 0.}, // metrics: width,
                // height,
                // depth, italic
                null, // ligatures
                null, // kern codes
                null, // kern values
                null, '\0', // next larger
                null); // extension: top, mid, rep, bot
    }
}
