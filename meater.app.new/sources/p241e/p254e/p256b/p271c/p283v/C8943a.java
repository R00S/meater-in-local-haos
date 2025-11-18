package p241e.p254e.p256b.p271c.p283v;

/* compiled from: MathUtils.java */
/* renamed from: e.e.b.c.v.a */
/* loaded from: classes2.dex */
public final class C8943a {
    /* renamed from: a */
    public static float m28489a(float f2, float f3, float f4, float f5) {
        return (float) Math.hypot(f4 - f2, f5 - f3);
    }

    /* renamed from: b */
    public static float m28490b(float f2, float f3, float f4, float f5, float f6, float f7) {
        return m28492d(m28489a(f2, f3, f4, f5), m28489a(f2, f3, f6, f5), m28489a(f2, f3, f6, f7), m28489a(f2, f3, f4, f7));
    }

    /* renamed from: c */
    public static float m28491c(float f2, float f3, float f4) {
        return ((1.0f - f4) * f2) + (f4 * f3);
    }

    /* renamed from: d */
    private static float m28492d(float f2, float f3, float f4, float f5) {
        return (f2 <= f3 || f2 <= f4 || f2 <= f5) ? (f3 <= f4 || f3 <= f5) ? f4 > f5 ? f4 : f5 : f3 : f2;
    }
}
