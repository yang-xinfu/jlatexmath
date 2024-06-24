package org.scilab.forge.jlatexmath.examples.export;

import org.apache.commons.io.FileUtils;
import org.scilab.forge.jlatexmath.desktop.FactoryProviderDesktop;
import org.scilab.forge.jlatexmath.desktop.graphics.ColorD;
import org.scilab.forge.jlatexmath.share.TeXConstants;
import org.scilab.forge.jlatexmath.share.TeXFormula;
import org.scilab.forge.jlatexmath.share.platform.FactoryProvider;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Objects;

public class Convert {

    static {
        FactoryProvider.setInstance(new FactoryProviderDesktop());
    }

    public static void toSVG(String latex, String file, boolean fontAsShapes) throws IOException {

        int style = TeXConstants.STYLE_DISPLAY; // 样式 符号以最大的尺寸呈现
        float fontSize = 16; // 生成公式图片的字体大小
        // 字体颜色，黑色
        ColorD fg = new ColorD(Color.WHITE);

        String svg = TeXFormula.createSvg(latex, style, fontSize, fg, null, fontAsShapes);

        System.out.println(svg);
        File file1 = new File(file);
        FileUtils.writeStringToFile(file1, svg, "utf-8");
    }

    public static void toPng(String latex, String file,Float size) throws IOException {

        int style = TeXConstants.STYLE_DISPLAY; // 样式 符号以最大的尺寸呈现
        float fontSize = Objects.isNull(size) ? 16 : size ; // 生成公式图片的字体大小
        // 字体颜色，黑色
        ColorD fg = new ColorD(Color.WHITE);

        TeXFormula.setDPITarget(72);

        BufferedImage bufferedImage = (BufferedImage) TeXFormula.createBufferedImage(latex, style, fontSize * 3, fg, null);

        FileOutputStream imgOutStream = new FileOutputStream(new File(file));
        ImageIO.write(bufferedImage, "png", imgOutStream);
    }

}
