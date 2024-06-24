package org.scilab.forge.jlatexmath.examples.export;

import java.io.IOException;

public class Example1 {
    public static void main(String[] args) {

        String latex = "\\ce{A ->[上a][下b] B}";
        latex += "\\left[ \\frac{1}{2\\mathrm{e}},\\mathrm{e}^2 \\right]";

        try {
            Convert.toPng(latex, "Example1.png", null);
            Convert.toSVG(latex, "Example1.svg", true);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
