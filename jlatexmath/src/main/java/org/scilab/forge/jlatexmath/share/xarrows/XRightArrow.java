package org.scilab.forge.jlatexmath.share.xarrows;

public class XRightArrow extends XArrowBox {

    public XRightArrow(double width) {
        this.commands = "MQQLQLQQQQLLLQQQQQLQQQQQL";

        this.width = width < 1 ? 1 : width;
        this.height = 0.366875;
        this.depth = -0.0665625;

        double len = width < 0.91 ? 0 : width - 0.91;
        data = new double[]{0.089, -0.230, 0.056, -0.250, 0.059, -0.235,
                0.089, -0.270, 0.056, -0.270, 0.858 + len, -0.270, 0.756 + len,
                -0.399, 0.790 + len, -0.320, 0.755 + len, -0.400, 0.750 + len,
                -0.416, 0.750 + len, -0.413, 0.765 + len, -0.428, 0.750 + len,
                -0.428, 0.782 + len, -0.414, 0.776 + len, -0.428, 0.918 + len,
                -0.268, 0.826 + len, -0.315, 0.919 + len, -0.268, 0.920 + len,
                -0.267, 0.921 + len, -0.267, 0.935 + len, -0.260, 0.928 + len,
                -0.263, 0.942 + len, -0.250, 0.939 + len, -0.260, 0.933 + len,
                -0.238, 0.942 + len, -0.243, 0.928 + len, -0.236, 0.931 + len,
                -0.238, 0.783 + len, -0.086, 0.829 + len, -0.189, 0.783 + len,
                -0.086, 0.781 + len, -0.082, 0.782 + len, -0.085, 0.765 + len,
                -0.072, 0.776 + len, -0.072, 0.750 + len, -0.084, 0.750 + len,
                -0.072, 0.779 + len, -0.144, 0.750 + len, -0.099, 0.858 + len,
                -0.230, 0.812 + len, -0.196, 0.858 + len, -0.230};
    }
}
