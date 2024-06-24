package org.scilab.forge.jlatexmath.examples.export;

import java.awt.Color;
import java.awt.Dimension;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

import javax.swing.JLabel;

import org.apache.batik.dom.GenericDOMImplementation;
import org.apache.batik.svggen.SVGGeneratorContext;
import org.apache.batik.svggen.SVGGraphics2D;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.scilab.forge.jlatexmath.desktop.FactoryProviderDesktop;
import org.scilab.forge.jlatexmath.desktop.graphics.ColorD;
import org.scilab.forge.jlatexmath.desktop.graphics.SVGGraphics2DD;
import org.scilab.forge.jlatexmath.share.TeXConstants;
import org.scilab.forge.jlatexmath.share.TeXFormula;
import org.scilab.forge.jlatexmath.share.TeXIcon;
import org.scilab.forge.jlatexmath.share.platform.FactoryProvider;
import org.scilab.forge.jlatexmath.share.platform.graphics.*;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;

public class Convert {

    static {
        FactoryProvider.setInstance(new FactoryProviderDesktop());
    }

    public static void toSVG(String latex, String file, boolean fontAsShapes) throws IOException {

        int style = TeXConstants.STYLE_DISPLAY; // 样式 符号以最大的尺寸呈现
        float fontSize = 16; // 生成公式图片的字体大小
        // 字体颜色，黑色
        ColorD fg = new ColorD(Color.BLACK);

        TeXFormula.setDPITarget(72);

        String svg = TeXFormula.createSvg(latex, style, fontSize, fg, null, fontAsShapes);

        System.out.println(svg);
        File file1 = new File(file);
        FileUtils.writeStringToFile(file1,svg,"utf-8");
    }

}
