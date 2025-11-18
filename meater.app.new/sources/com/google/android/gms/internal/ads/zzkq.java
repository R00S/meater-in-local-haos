package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zzkq {

    /* renamed from: a */
    public static final int f26428a = Build.VERSION.SDK_INT;

    /* renamed from: b */
    private static final Pattern f26429b = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)(\\.(\\d+))?([Zz]|((\\+|\\-)(\\d\\d):(\\d\\d)))?");

    /* renamed from: c */
    private static final Pattern f26430c = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");

    /* renamed from: a */
    public static int m20155a(long[] jArr, long j2, boolean z, boolean z2) {
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            iBinarySearch = -(iBinarySearch + 2);
        }
        return z2 ? Math.max(0, iBinarySearch) : iBinarySearch;
    }

    /* renamed from: b */
    public static long m20156b(long j2, long j3, long j4) {
        if (j4 >= 1000000 && j4 % 1000000 == 0) {
            return j2 / (j4 / 1000000);
        }
        if (j4 < 1000000 && 1000000 % j4 == 0) {
            return j2 * (1000000 / j4);
        }
        double d2 = j4;
        Double.isNaN(d2);
        double d3 = j2;
        Double.isNaN(d3);
        return (long) (d3 * (1000000.0d / d2));
    }

    /* renamed from: c */
    public static void m20157c(long[] jArr, long j2, long j3) {
        int i2 = 0;
        if (j3 >= 1000000 && j3 % 1000000 == 0) {
            long j4 = j3 / 1000000;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] / j4;
                i2++;
            }
            return;
        }
        if (j3 < 1000000 && 1000000 % j3 == 0) {
            long j5 = 1000000 / j3;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] * j5;
                i2++;
            }
            return;
        }
        double d2 = j3;
        Double.isNaN(d2);
        double d3 = 1000000.0d / d2;
        while (i2 < jArr.length) {
            double d4 = jArr[i2];
            Double.isNaN(d4);
            jArr[i2] = (long) (d4 * d3);
            i2++;
        }
    }

    /* renamed from: d */
    public static boolean m20158d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: e */
    public static ExecutorService m20159e(String str) {
        return Executors.newSingleThreadExecutor(new m00(str));
    }

    /* renamed from: f */
    public static int m20160f(String str) {
        int length = str.length();
        zzkh.m20126a(length <= 4);
        int iCharAt = 0;
        for (int i2 = 0; i2 < length; i2++) {
            iCharAt = (iCharAt << 8) | str.charAt(i2);
        }
        return iCharAt;
    }

    /* renamed from: g */
    public static int m20161g(int i2, int i3) {
        return ((i3 + 0) - 1) / i3;
    }

    /* renamed from: h */
    public static int m20162h(long[] jArr, long j2, boolean z, boolean z2) {
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        return iBinarySearch < 0 ? iBinarySearch ^ (-1) : iBinarySearch;
    }
}
