package com.airbnb.lottie.p118v;

/* compiled from: MeanCalculator.java */
/* renamed from: com.airbnb.lottie.v.d */
/* loaded from: classes.dex */
public class C5318d {

    /* renamed from: a */
    private float f12923a;

    /* renamed from: b */
    private int f12924b;

    /* renamed from: a */
    public void m9870a(float f2) {
        float f3 = this.f12923a + f2;
        this.f12923a = f3;
        int i2 = this.f12924b + 1;
        this.f12924b = i2;
        if (i2 == Integer.MAX_VALUE) {
            this.f12923a = f3 / 2.0f;
            this.f12924b = i2 / 2;
        }
    }
}
