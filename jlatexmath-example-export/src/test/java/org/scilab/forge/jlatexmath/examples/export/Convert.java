package org.scilab.forge.jlatexmath.examples.export;

import java.awt.Color;
import java.awt.Dimension;
import java.io.*;
import java.nio.charset.StandardCharsets;

import javax.swing.JLabel;

import org.apache.batik.dom.GenericDOMImplementation;
import org.apache.batik.svggen.SVGGeneratorContext;
import org.apache.batik.svggen.SVGGraphics2D;
import org.apache.batik.svggen.SVGGraphics2DIOException;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.fop.render.ps.EPSTranscoder;
import org.apache.fop.render.ps.PSTranscoder;
import org.apache.fop.svg.AbstractFOPTranscoder;
import org.apache.fop.svg.PDFTranscoder;
import org.junit.Test;
import org.scilab.forge.jlatexmath.desktop.FactoryProviderDesktop;
import org.scilab.forge.jlatexmath.desktop.graphics.ColorD;
import org.scilab.forge.jlatexmath.desktop.graphics.SVGDD;
import org.scilab.forge.jlatexmath.share.TeXConstants;
import org.scilab.forge.jlatexmath.share.TeXFormula;
import org.scilab.forge.jlatexmath.share.TeXIcon;
import org.scilab.forge.jlatexmath.share.platform.FactoryProvider;
import org.scilab.forge.jlatexmath.share.platform.graphics.*;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;

public class Convert {

    public static final int PDF = 0;
    public static final int PS = 1;
    public static final int EPS = 2;

    @Test
    public void testHanZi() throws FileNotFoundException, SVGGraphics2DIOException {

        DOMImplementation domImpl = GenericDOMImplementation.getDOMImplementation();
        String svgNS = "http://www.w3.org/2000/svg";
        Document document = domImpl.createDocument(svgNS, "svg", null);
        SVGGeneratorContext ctx = SVGGeneratorContext.createDefault(document);

        SVGGraphics2D g2 = new SVGGraphics2D(ctx, false);

        g2.drawString("上",10,10);
//        g2.drawString("a",0,10);

//        g2.stream("testHanZi.svg",true);

        // 创建一个输出文件
        try (FileOutputStream fos = new FileOutputStream("testHanZi.svg");
             OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8); // 指定UTF-8编码
             BufferedWriter bw = new BufferedWriter(osw)) {

            // 写入 SVG 图像到文件
            g2.stream(bw);

        } catch (IOException e) {
            e.printStackTrace();
        }

        g2.dispose();

    }

    public static void toSVG(String latex, String file, boolean fontAsShapes) throws IOException {

        FactoryProvider.setInstance(new FactoryProviderDesktop());

        DOMImplementation domImpl = GenericDOMImplementation.getDOMImplementation();
        String svgNS = "http://www.w3.org/2000/svg";
        Document document = domImpl.createDocument(svgNS, "svg", null);
        SVGGeneratorContext ctx = SVGGeneratorContext.createDefault(document);

        SVGGraphics2D g2 = new SVGGraphics2D(ctx, fontAsShapes);
//        g2.drawString("上",1,1);

        TeXFormula formula = new TeXFormula(latex);
        TeXIcon icon = formula.createTeXIcon(TeXConstants.STYLE_DISPLAY, 20);
        icon.setInsets(new Insets(5, 5, 5, 5));
        g2.setSVGCanvasSize(new Dimension(icon.getIconWidth(), icon.getIconHeight()));
        g2.setColor(Color.white);
        g2.fillRect(0, 0, icon.getIconWidth(), icon.getIconHeight());

        SVGDD svgdd = new SVGDD(g2);

        JLabel jl = new JLabel();
        jl.setForeground(new Color(0, 0, 0));
        HasForegroundColor hasForegroundColor = new HasForegroundColor() {
            @Override
            public org.scilab.forge.jlatexmath.share.platform.graphics.Color getForegroundColor() {
                return new ColorD(0, 0, 0);
            }
        };
        icon.paintIcon(hasForegroundColor, svgdd, 0, 0);

        boolean useCSS = true;

        FileOutputStream fos = new FileOutputStream(file);
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8); // 指定UTF-8编码
        BufferedWriter bw = new BufferedWriter(osw);

//        FileOutputStream svgs = new FileOutputStream(file);
//        Writer out = new OutputStreamWriter(svgs, StandardCharsets.UTF_8);
        g2.stream(bw, useCSS);
        fos.flush();
        fos.close();
    }



    public static void SVGTo(String inSVG, String out, int type) {
        AbstractFOPTranscoder trans;
        switch (type) {
        case PDF:
            trans = new PDFTranscoder();
            break;
        case PS:
            trans = new PSTranscoder();
            break;
        case EPS:
            trans = new EPSTranscoder();
            break;
        default:
            trans = null;
        }

        try {
            String filename = "target/" + inSVG;
            System.out.println("transcoding "
                               + filename);
            TranscoderInput input = new TranscoderInput(new FileInputStream(filename));
            OutputStream os = new FileOutputStream("target/" + out);
            TranscoderOutput output = new TranscoderOutput(os);
            trans.transcode(input, output);
            os.flush();
            os.close();
        } catch (Exception e) {
            System.out.println(
                "Problem when exporting " + inSVG + " to " + out + "!\n" + e.toString());
            throw new RuntimeException(e);
        }
    }
}
