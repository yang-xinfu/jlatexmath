/* CommandLMR.java
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

package org.scilab.forge.jlatexmath.share.commands;

import org.scilab.forge.jlatexmath.share.*;
import org.scilab.forge.jlatexmath.share.exception.ParseException;

import java.util.ArrayList;

public class CommandLMR {

    public static class CommandLeft extends Command {

        Atom left;
        ArrayList<MiddleAtom> middles;
        RowAtom base;

        @Override
        public void add(TeXParser tp, Atom a) {
            if (left == null) {
                left = a;
                base = new RowAtom();
            } else {
                base.add(a);
                if (a instanceof MiddleAtom) {
                    if (middles == null) {
                        middles = new ArrayList<>();
                    }
                    middles.add((MiddleAtom) a);
                }
            }
        }

        @Override
        public RowAtom steal(TeXParser tp) {
            final RowAtom ra = base;
            base = new RowAtom();
            return ra;
        }

        @Override
        public Atom getLastAtom() {
            return base.getLastAtom();
        }

        void close(TeXParser tp, Atom right) {
            if (left instanceof BigDelimiterAtom) {
                left = ((BigDelimiterAtom) left).delim;
            }
            if (right instanceof BigDelimiterAtom) {
                right = ((BigDelimiterAtom) right).delim;
            }

            Atom a;
            if ((left instanceof SymbolAtom) && (right instanceof SymbolAtom)) {
                a = new FencedAtom(base.simplify(), (SymbolAtom) left, middles,
                        (SymbolAtom) right);
            } else {
                a = new RowAtom(left, base.simplify(), right);
            }

            tp.closeConsumer(a);
        }
    }

    public static class CommandMiddle extends Command {

        @Override
        public boolean init(TeXParser tp) {
            tp.close();
            return true;
        }

        @Override
        public void add(TeXParser tp, Atom middle) {
            tp.pop(); // remove this from the stack
            final AtomConsumer ac = tp.peek();
            if (!(ac instanceof CommandLeft)) {
                throw new ParseException(tp, "\\middle doesn't match \\left");
            }
            ac.add(tp, new MiddleAtom(middle));
        }
    }

    public static class CommandRight extends Command {

        @Override
        public boolean init(TeXParser tp) {
            tp.close();
            return true;
        }

        @Override
        public void add(TeXParser tp, Atom close) {
            tp.pop(); // remove this from the stack
            final AtomConsumer ac = tp.peek();
            if (!(ac instanceof CommandLeft)) {
                throw new ParseException(tp, "\\right doesn't match \\left");
            }
            ((CommandLeft) ac).close(tp, close);
        }
    }
}
