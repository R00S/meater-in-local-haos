package o8;

import l8.m;

/* compiled from: DoubleUtils.java */
/* renamed from: o8.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4143c {
    static long a(double d10) {
        m.e(b(d10), "not a normal value");
        int exponent = Math.getExponent(d10);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    static boolean b(double d10) {
        return Math.getExponent(d10) <= 1023;
    }

    static boolean c(double d10) {
        return Math.getExponent(d10) >= -1022;
    }

    static double d(double d10) {
        return Double.longBitsToDouble((Double.doubleToRawLongBits(d10) & 4503599627370495L) | 4607182418800017408L);
    }
}
