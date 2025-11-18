package cm.aptoide.p092pt.editorial;

import java.text.DecimalFormat;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class ViewsFormatter {
    private static final int NUMBER_OF_SUFFIXES = 2;

    public static String formatNumberOfViews(String str) {
        int length = str.length() / 4;
        if (length > 2) {
            length = 2;
        }
        double d2 = get3DigitNumber(Double.parseDouble(str), length);
        return getDecimalFormat(d2).format(d2) + getSuffix(length);
    }

    private static double get3DigitNumber(double d2, int i2) {
        return d2 / Math.pow(1000.0d, i2);
    }

    private static DecimalFormat getDecimalFormat(double d2) {
        return d2 < 10.0d ? new DecimalFormat("#.##") : d2 < 100.0d ? new DecimalFormat("#.#") : new DecimalFormat("#");
    }

    private static String getSuffix(int i2) {
        return i2 < 3 ? new String[]{HttpUrl.FRAGMENT_ENCODE_SET, "k", "M"}[i2] : HttpUrl.FRAGMENT_ENCODE_SET;
    }
}
