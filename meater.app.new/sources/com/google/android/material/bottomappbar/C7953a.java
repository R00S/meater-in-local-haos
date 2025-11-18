package com.google.android.material.bottomappbar;

import p241e.p254e.p256b.p271c.p272a0.C8899f;
import p241e.p254e.p256b.p271c.p272a0.C8906m;

/* compiled from: BottomAppBarTopEdgeTreatment.java */
/* renamed from: com.google.android.material.bottomappbar.a */
/* loaded from: classes2.dex */
public class C7953a extends C8899f implements Cloneable {

    /* renamed from: f */
    private float f29764f;

    /* renamed from: g */
    private float f29765g;

    /* renamed from: h */
    private float f29766h;

    /* renamed from: i */
    private float f29767i;

    /* renamed from: j */
    private float f29768j;

    @Override // p241e.p254e.p256b.p271c.p272a0.C8899f
    /* renamed from: d */
    public void mo23920d(float f2, float f3, float f4, C8906m c8906m) {
        float f5 = this.f29766h;
        if (f5 == 0.0f) {
            c8906m.m28399m(f2, 0.0f);
            return;
        }
        float f6 = ((this.f29765g * 2.0f) + f5) / 2.0f;
        float f7 = f4 * this.f29764f;
        float f8 = f3 + this.f29768j;
        float f9 = (this.f29767i * f4) + ((1.0f - f4) * f6);
        if (f9 / f6 >= 1.0f) {
            c8906m.m28399m(f2, 0.0f);
            return;
        }
        float f10 = f6 + f7;
        float f11 = f9 + f7;
        float fSqrt = (float) Math.sqrt((f10 * f10) - (f11 * f11));
        float f12 = f8 - fSqrt;
        float f13 = f8 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f11));
        float f14 = 90.0f - degrees;
        c8906m.m28399m(f12, 0.0f);
        float f15 = f7 * 2.0f;
        c8906m.m28391a(f12 - f7, 0.0f, f12 + f7, f15, 270.0f, degrees);
        c8906m.m28391a(f8 - f6, (-f6) - f9, f8 + f6, f6 - f9, 180.0f - f14, (f14 * 2.0f) - 180.0f);
        c8906m.m28391a(f13 - f7, 0.0f, f13 + f7, f15, 270.0f - degrees, degrees);
        c8906m.m28399m(f2, 0.0f);
    }

    /* renamed from: e */
    float m23921e() {
        return this.f29767i;
    }

    /* renamed from: f */
    float m23922f() {
        return this.f29765g;
    }

    /* renamed from: g */
    float m23923g() {
        return this.f29764f;
    }

    /* renamed from: h */
    public float m23924h() {
        return this.f29766h;
    }

    /* renamed from: i */
    void m23925i(float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f29767i = f2;
    }

    /* renamed from: j */
    void m23926j(float f2) {
        this.f29765g = f2;
    }

    /* renamed from: k */
    void m23927k(float f2) {
        this.f29764f = f2;
    }

    /* renamed from: l */
    public void m23928l(float f2) {
        this.f29766h = f2;
    }

    /* renamed from: m */
    void m23929m(float f2) {
        this.f29768j = f2;
    }
}
