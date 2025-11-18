package com.airbnb.lottie.p118v;

/* compiled from: GammaEvaluator.java */
/* renamed from: com.airbnb.lottie.v.b */
/* loaded from: classes.dex */
public class C5316b {
    /* renamed from: a */
    private static float m9846a(float f2) {
        return f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    /* renamed from: b */
    private static float m9847b(float f2) {
        return f2 <= 0.0031308f ? f2 * 12.92f : (float) ((Math.pow(f2, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    /* renamed from: c */
    public static int m9848c(float f2, int i2, int i3) {
        float f3 = ((i2 >> 24) & 255) / 255.0f;
        float fM9846a = m9846a(((i2 >> 16) & 255) / 255.0f);
        float fM9846a2 = m9846a(((i2 >> 8) & 255) / 255.0f);
        float fM9846a3 = m9846a((i2 & 255) / 255.0f);
        float fM9846a4 = m9846a(((i3 >> 16) & 255) / 255.0f);
        float f4 = f3 + (((((i3 >> 24) & 255) / 255.0f) - f3) * f2);
        float fM9846a5 = fM9846a2 + ((m9846a(((i3 >> 8) & 255) / 255.0f) - fM9846a2) * f2);
        float fM9846a6 = fM9846a3 + (f2 * (m9846a((i3 & 255) / 255.0f) - fM9846a3));
        return (Math.round(m9847b(fM9846a + ((fM9846a4 - fM9846a) * f2)) * 255.0f) << 16) | (Math.round(f4 * 255.0f) << 24) | (Math.round(m9847b(fM9846a5) * 255.0f) << 8) | Math.round(m9847b(fM9846a6) * 255.0f);
    }
}
