package p024c.p052i.p053e;

import android.graphics.Color;

/* compiled from: ColorUtils.java */
/* renamed from: c.i.e.a */
/* loaded from: classes.dex */
public final class C0923a {

    /* renamed from: a */
    private static final ThreadLocal<double[]> f6281a = new ThreadLocal<>();

    /* renamed from: a */
    public static int m5873a(float[] fArr) {
        int iRound;
        int iRound2;
        int iRound3;
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float fAbs = (1.0f - Math.abs((f4 * 2.0f) - 1.0f)) * f3;
        float f5 = f4 - (0.5f * fAbs);
        float fAbs2 = (1.0f - Math.abs(((f2 / 60.0f) % 2.0f) - 1.0f)) * fAbs;
        switch (((int) f2) / 60) {
            case 0:
                iRound = Math.round((fAbs + f5) * 255.0f);
                iRound2 = Math.round((fAbs2 + f5) * 255.0f);
                iRound3 = Math.round(f5 * 255.0f);
                break;
            case 1:
                iRound = Math.round((fAbs2 + f5) * 255.0f);
                iRound2 = Math.round((fAbs + f5) * 255.0f);
                iRound3 = Math.round(f5 * 255.0f);
                break;
            case 2:
                iRound = Math.round(f5 * 255.0f);
                iRound2 = Math.round((fAbs + f5) * 255.0f);
                iRound3 = Math.round((fAbs2 + f5) * 255.0f);
                break;
            case 3:
                iRound = Math.round(f5 * 255.0f);
                iRound2 = Math.round((fAbs2 + f5) * 255.0f);
                iRound3 = Math.round((fAbs + f5) * 255.0f);
                break;
            case 4:
                iRound = Math.round((fAbs2 + f5) * 255.0f);
                iRound2 = Math.round(f5 * 255.0f);
                iRound3 = Math.round((fAbs + f5) * 255.0f);
                break;
            case 5:
            case 6:
                iRound = Math.round((fAbs + f5) * 255.0f);
                iRound2 = Math.round(f5 * 255.0f);
                iRound3 = Math.round((fAbs2 + f5) * 255.0f);
                break;
            default:
                iRound3 = 0;
                iRound = 0;
                iRound2 = 0;
                break;
        }
        return Color.rgb(m5885m(iRound, 0, 255), m5885m(iRound2, 0, 255), m5885m(iRound3, 0, 255));
    }

    /* renamed from: b */
    public static void m5874b(int i2, int i3, int i4, float[] fArr) {
        float f2;
        float fAbs;
        float f3 = i2 / 255.0f;
        float f4 = i3 / 255.0f;
        float f5 = i4 / 255.0f;
        float fMax = Math.max(f3, Math.max(f4, f5));
        float fMin = Math.min(f3, Math.min(f4, f5));
        float f6 = fMax - fMin;
        float f7 = (fMax + fMin) / 2.0f;
        if (fMax == fMin) {
            f2 = 0.0f;
            fAbs = 0.0f;
        } else {
            f2 = fMax == f3 ? ((f4 - f5) / f6) % 6.0f : fMax == f4 ? ((f5 - f3) / f6) + 2.0f : 4.0f + ((f3 - f4) / f6);
            fAbs = f6 / (1.0f - Math.abs((2.0f * f7) - 1.0f));
        }
        float f8 = (f2 * 60.0f) % 360.0f;
        if (f8 < 0.0f) {
            f8 += 360.0f;
        }
        fArr[0] = m5884l(f8, 0.0f, 360.0f);
        fArr[1] = m5884l(fAbs, 0.0f, 1.0f);
        fArr[2] = m5884l(f7, 0.0f, 1.0f);
    }

    /* renamed from: c */
    public static void m5875c(int i2, int i3, int i4, double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d2 = i2;
        Double.isNaN(d2);
        double d3 = d2 / 255.0d;
        double dPow = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        double d4 = i3;
        Double.isNaN(d4);
        double d5 = d4 / 255.0d;
        double dPow2 = d5 < 0.04045d ? d5 / 12.92d : Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
        double d6 = i4;
        Double.isNaN(d6);
        double d7 = d6 / 255.0d;
        double dPow3 = d7 < 0.04045d ? d7 / 12.92d : Math.pow((d7 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * dPow) + (0.3576d * dPow2) + (0.1805d * dPow3)) * 100.0d;
        dArr[1] = ((0.2126d * dPow) + (0.7152d * dPow2) + (0.0722d * dPow3)) * 100.0d;
        dArr[2] = ((dPow * 0.0193d) + (dPow2 * 0.1192d) + (dPow3 * 0.9505d)) * 100.0d;
    }

    /* renamed from: d */
    public static double m5876d(int i2, int i3) {
        if (Color.alpha(i3) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i3));
        }
        if (Color.alpha(i2) < 255) {
            i2 = m5882j(i2, i3);
        }
        double dM5877e = m5877e(i2) + 0.05d;
        double dM5877e2 = m5877e(i3) + 0.05d;
        return Math.max(dM5877e, dM5877e2) / Math.min(dM5877e, dM5877e2);
    }

    /* renamed from: e */
    public static double m5877e(int i2) {
        double[] dArrM5886n = m5886n();
        m5880h(i2, dArrM5886n);
        return dArrM5886n[1] / 100.0d;
    }

    /* renamed from: f */
    public static int m5878f(int i2, int i3, float f2) {
        int i4 = 255;
        if (Color.alpha(i3) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i3));
        }
        double d2 = f2;
        if (m5876d(m5887o(i2, 255), i3) < d2) {
            return -1;
        }
        int i5 = 0;
        for (int i6 = 0; i6 <= 10 && i4 - i5 > 1; i6++) {
            int i7 = (i5 + i4) / 2;
            if (m5876d(m5887o(i2, i7), i3) < d2) {
                i5 = i7;
            } else {
                i4 = i7;
            }
        }
        return i4;
    }

    /* renamed from: g */
    public static void m5879g(int i2, float[] fArr) {
        m5874b(Color.red(i2), Color.green(i2), Color.blue(i2), fArr);
    }

    /* renamed from: h */
    public static void m5880h(int i2, double[] dArr) {
        m5875c(Color.red(i2), Color.green(i2), Color.blue(i2), dArr);
    }

    /* renamed from: i */
    private static int m5881i(int i2, int i3) {
        return 255 - (((255 - i3) * (255 - i2)) / 255);
    }

    /* renamed from: j */
    public static int m5882j(int i2, int i3) {
        int iAlpha = Color.alpha(i3);
        int iAlpha2 = Color.alpha(i2);
        int iM5881i = m5881i(iAlpha2, iAlpha);
        return Color.argb(iM5881i, m5883k(Color.red(i2), iAlpha2, Color.red(i3), iAlpha, iM5881i), m5883k(Color.green(i2), iAlpha2, Color.green(i3), iAlpha, iM5881i), m5883k(Color.blue(i2), iAlpha2, Color.blue(i3), iAlpha, iM5881i));
    }

    /* renamed from: k */
    private static int m5883k(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            return 0;
        }
        return (((i2 * 255) * i3) + ((i4 * i5) * (255 - i3))) / (i6 * 255);
    }

    /* renamed from: l */
    private static float m5884l(float f2, float f3, float f4) {
        return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
    }

    /* renamed from: m */
    private static int m5885m(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    /* renamed from: n */
    private static double[] m5886n() {
        ThreadLocal<double[]> threadLocal = f6281a;
        double[] dArr = threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    /* renamed from: o */
    public static int m5887o(int i2, int i3) {
        if (i3 < 0 || i3 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i2 & 16777215) | (i3 << 24);
    }
}
