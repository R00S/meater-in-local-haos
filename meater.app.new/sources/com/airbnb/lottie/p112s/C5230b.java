package com.airbnb.lottie.p112s;

/* compiled from: DocumentData.java */
/* renamed from: com.airbnb.lottie.s.b */
/* loaded from: classes.dex */
public class C5230b {

    /* renamed from: a */
    public final String f12651a;

    /* renamed from: b */
    public final String f12652b;

    /* renamed from: c */
    public final double f12653c;

    /* renamed from: d */
    final int f12654d;

    /* renamed from: e */
    public final int f12655e;

    /* renamed from: f */
    final double f12656f;

    /* renamed from: g */
    public final double f12657g;

    /* renamed from: h */
    public final int f12658h;

    /* renamed from: i */
    public final int f12659i;

    /* renamed from: j */
    public final double f12660j;

    /* renamed from: k */
    public final boolean f12661k;

    public C5230b(String str, String str2, double d2, int i2, int i3, double d3, double d4, int i4, int i5, double d5, boolean z) {
        this.f12651a = str;
        this.f12652b = str2;
        this.f12653c = d2;
        this.f12654d = i2;
        this.f12655e = i3;
        this.f12656f = d3;
        this.f12657g = d4;
        this.f12658h = i4;
        this.f12659i = i5;
        this.f12660j = d5;
        this.f12661k = z;
    }

    public int hashCode() {
        double dHashCode = ((this.f12651a.hashCode() * 31) + this.f12652b.hashCode()) * 31;
        double d2 = this.f12653c;
        Double.isNaN(dHashCode);
        int i2 = (((((int) (dHashCode + d2)) * 31) + this.f12654d) * 31) + this.f12655e;
        long jDoubleToLongBits = Double.doubleToLongBits(this.f12656f);
        return (((i2 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31) + this.f12658h;
    }
}
