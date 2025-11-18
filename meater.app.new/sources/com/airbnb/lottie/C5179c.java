package com.airbnb.lottie;

import android.util.Log;
import androidx.core.os.C0275d;
import java.util.HashSet;
import java.util.Set;

/* compiled from: L.java */
/* renamed from: com.airbnb.lottie.c */
/* loaded from: classes.dex */
public class C5179c {

    /* renamed from: a */
    public static boolean f12325a = false;

    /* renamed from: d */
    private static String[] f12328d;

    /* renamed from: e */
    private static long[] f12329e;

    /* renamed from: b */
    private static final Set<String> f12326b = new HashSet();

    /* renamed from: c */
    private static boolean f12327c = false;

    /* renamed from: f */
    private static int f12330f = 0;

    /* renamed from: g */
    private static int f12331g = 0;

    /* renamed from: a */
    public static void m9391a(String str) {
        if (f12327c) {
            int i2 = f12330f;
            if (i2 == 20) {
                f12331g++;
                return;
            }
            f12328d[i2] = str;
            f12329e[i2] = System.nanoTime();
            C0275d.m1840a(str);
            f12330f++;
        }
    }

    /* renamed from: b */
    public static void m9392b(String str) {
        if (f12325a) {
            Log.d("LOTTIE", str);
        }
    }

    /* renamed from: c */
    public static float m9393c(String str) {
        int i2 = f12331g;
        if (i2 > 0) {
            f12331g = i2 - 1;
            return 0.0f;
        }
        if (!f12327c) {
            return 0.0f;
        }
        int i3 = f12330f - 1;
        f12330f = i3;
        if (i3 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(f12328d[i3])) {
            C0275d.m1841b();
            return (System.nanoTime() - f12329e[f12330f]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f12328d[f12330f] + ".");
    }

    /* renamed from: d */
    public static void m9394d(String str) {
        Set<String> set = f12326b;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str);
        set.add(str);
    }
}
