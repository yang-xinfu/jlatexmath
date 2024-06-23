package org.scilab.forge.jlatexmath.desktop.graphics;

import org.apache.batik.svggen.SVGGraphics2D;
import org.scilab.forge.jlatexmath.desktop.font.FontD;
import org.scilab.forge.jlatexmath.desktop.font.FontRenderContextD;
import org.scilab.forge.jlatexmath.share.platform.FactoryProvider;
import org.scilab.forge.jlatexmath.share.platform.font.Font;
import org.scilab.forge.jlatexmath.share.platform.font.FontRenderContext;
import org.scilab.forge.jlatexmath.share.platform.geom.Line2D;
import org.scilab.forge.jlatexmath.share.platform.geom.Rectangle2D;
import org.scilab.forge.jlatexmath.share.platform.geom.RoundRectangle2D;
import org.scilab.forge.jlatexmath.share.platform.graphics.*;
import org.scilab.forge.jlatexmath.share.platform.graphics.Color;
import org.scilab.forge.jlatexmath.share.platform.graphics.Image;
import org.scilab.forge.jlatexmath.share.platform.graphics.Stroke;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @Desc
 * @Author yxf
 * @Date 2024/6/23 15:12
 * 但行好事，莫问前程。
 */
public class SVGDD implements Graphics2DInterface {

    private SVGGraphics2D impl;
    private LinkedList<TransformD> transformationStack = new LinkedList<>();
    private GeneralPath path;

    public Graphics2D getImpl() {
        return impl;
    }

    public SVGDD(SVGGraphics2D impl) {
        this.impl = impl;
    }

    @Override
    public void setStroke(Stroke stroke) {
        impl.setStroke((java.awt.Stroke) stroke);
    }

    @Override
    public Stroke getStroke() {
        return new StrokeD(impl.getStroke());
    }

    @Override
    public void setColor(Color color) {
        impl.setColor((java.awt.Color) color);
    }

    //	@Override
    public Color getColor() {
        return new ColorD(impl.getColor());
    }

    @Override
    public Transform getTransform() {
        return new TransformD(impl.getTransform());
    }

    @Override
    public Font getFont() {
        return new FontD(impl.getFont());
    }

    @Override
    public void setFont(Font font) {
        impl.setFont(((FontD) font).impl);
    }

    @Override
    public void fillRect(int x, int y, int width, int height) {
        impl.fillRect(x, y, width, height);
    }

    @Override
    public void fill(org.scilab.forge.jlatexmath.share.platform.geom.Shape s) {
        impl.fill((java.awt.Shape) s);
    }

    @Override
    public void startDrawing() {
        path = new GeneralPath();
    }

    @Override
    public void moveTo(double x, double y) {
        path.moveTo(x, y);
    }

    @Override
    public void lineTo(double x, double y) {
        path.lineTo(x, y);
    }

    @Override
    public void quadraticCurveTo(double x, double y, double x1, double y1) {
        path.quadTo(x, y, x1, y1);
    }

    @Override
    public void bezierCurveTo(double x, double y, double x1, double y1,
                              double x2, double y2) {
        path.curveTo(x, y, x1, y1, x2, y2);
    }

    @Override
    public void finishDrawing() {
        impl.fill(path);
    }

    @Override
    public void draw(Rectangle2D rectangle) {
        impl.draw((java.awt.Shape) rectangle);
    }

    @Override
    public void draw(RoundRectangle2D rectangle) {
        impl.draw((java.awt.Shape) rectangle);
    }

    @Override
    public void draw(Line2D line) {
        impl.draw((java.awt.Shape) line);
    }

    @Override
    public void drawChars(char[] data, int offset, int length, int x, int y) {
        impl.drawChars(data, offset, length, x, y);

    }

    @Override
    public void drawArc(int x, int y, int width, int height, int startAngle,
                        int arcAngle) {
        impl.drawArc(x, y, width, height, startAngle, arcAngle);
    }

    @Override
    public void fillArc(int x, int y, int width, int height, int startAngle,
                        int arcAngle) {
        impl.fillArc(x, y, width, height, startAngle, arcAngle);
    }

    @Override
    public void translate(double x, double y) {
        impl.translate(x, y);
    }

    @Override
    public void scale(double x, double y) {
        impl.scale(x, y);
    }

    @Override
    public void rotate(double theta, double x, double y) {
        impl.rotate(theta, x, y);
    }

    @Override
    public void rotate(double theta) {
        impl.rotate(theta);
    }

    @Override
    public void drawImage(Image image, int x, int y) {

        if (image instanceof ImageBase64) {
            impl.drawImage(base64ToBufferedImage((ImageBase64) image), x, y,
                    null);
        } else {
            impl.drawImage((java.awt.Image) image, x, y, null);
        }

    }

    @Override
    public void drawImage(Image image, Transform transform) {
        if (image instanceof ImageBase64) {
            impl.drawImage(base64ToBufferedImage((ImageBase64) image),
                    (AffineTransform) transform, null);
        } else {
            impl.drawImage((java.awt.Image) image, (AffineTransform) transform,
                    null);
        }
    }

    private static BufferedImage base64ToBufferedImage(ImageBase64 image) {
        String pngBase64 = image.getBase64();

        final String pngMarker = "data:image/png;base64,";

        if (pngBase64.startsWith(pngMarker)) {
            pngBase64 = pngBase64.substring(pngMarker.length());
        } else {
            FactoryProvider.debugS("invalid base64 image");
            return null;
        }

        byte[] imageData = Base64.decode(pngBase64);

        try {
            return ImageIO.read(new ByteArrayInputStream(imageData));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public FontRenderContext getFontRenderContext() {
        return new FontRenderContextD(impl.getFontRenderContext());
    }

    @Override
    public void dispose() {
        impl.dispose();
    }

    @Override
    public void setRenderingHint(int key, int value) {
        impl.setRenderingHint(getNativeRenderingKey(key),
                getNativeRenderingValue(value));
    }

    @Override
    public int getRenderingHint(int key) {
        RenderingHints.Key nKey = getNativeRenderingKey(key);
        Object val = impl.getRenderingHint(nKey);
        return getRenderingValue(val);
    }

    private static RenderingHints.Key getNativeRenderingKey(int key) {
        switch (key) {
            case org.scilab.forge.jlatexmath.share.platform.graphics.RenderingHints.KEY_ANTIALIASING:
                return java.awt.RenderingHints.KEY_ANTIALIASING;
            case org.scilab.forge.jlatexmath.share.platform.graphics.RenderingHints.KEY_RENDERING:
                return java.awt.RenderingHints.KEY_RENDERING;
            case org.scilab.forge.jlatexmath.share.platform.graphics.RenderingHints.KEY_TEXT_ANTIALIASING:
                return java.awt.RenderingHints.KEY_TEXT_ANTIALIASING;
            default:
                return null;
        }
    }

    private static Object getNativeRenderingValue(int value) {
        switch (value) {
            case org.scilab.forge.jlatexmath.share.platform.graphics.RenderingHints.VALUE_ANTIALIAS_ON:
                return java.awt.RenderingHints.VALUE_ANTIALIAS_ON;
            case org.scilab.forge.jlatexmath.share.platform.graphics.RenderingHints.VALUE_RENDER_QUALITY:
                return java.awt.RenderingHints.VALUE_RENDER_QUALITY;
            case org.scilab.forge.jlatexmath.share.platform.graphics.RenderingHints.VALUE_TEXT_ANTIALIAS_ON:
                return java.awt.RenderingHints.VALUE_TEXT_ANTIALIAS_ON;
            default:
                return null;
        }
    }

    private static int getRenderingValue(Object value) {
        if (value == java.awt.RenderingHints.VALUE_INTERPOLATION_BICUBIC) {
            return org.scilab.forge.jlatexmath.share.platform.graphics.RenderingHints.VALUE_INTERPOLATION_BICUBIC;
        } else if (value == java.awt.RenderingHints.VALUE_INTERPOLATION_BILINEAR) {
            return org.scilab.forge.jlatexmath.share.platform.graphics.RenderingHints.VALUE_INTERPOLATION_BILINEAR;
        } else if (value == java.awt.RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR) {
            return org.scilab.forge.jlatexmath.share.platform.graphics.RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR;
        } else {
            return -1;
        }
    }

    @Override
    public void saveTransformation() {
        transformationStack.add(new TransformD(impl.getTransform()));
    }

    @Override
    public void restoreTransformation() {
        TransformD last = transformationStack.removeLast();
        impl.setTransform(last);
    }
}
