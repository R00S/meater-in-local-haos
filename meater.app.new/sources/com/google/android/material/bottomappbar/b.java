package com.google.android.material.bottomappbar;

import X7.f;
import X7.m;

/* compiled from: BottomAppBarTopEdgeTreatment.java */
/* loaded from: classes2.dex */
public class b extends f implements Cloneable {

    /* renamed from: B, reason: collision with root package name */
    private float f35989B;

    /* renamed from: C, reason: collision with root package name */
    private float f35990C;

    /* renamed from: D, reason: collision with root package name */
    private float f35991D;

    /* renamed from: E, reason: collision with root package name */
    private float f35992E;

    /* renamed from: F, reason: collision with root package name */
    private float f35993F;

    /* renamed from: G, reason: collision with root package name */
    private float f35994G;

    @Override // X7.f
    public void c(float f10, float f11, float f12, m mVar) {
        float f13;
        float f14;
        float f15 = this.f35991D;
        if (f15 == 0.0f) {
            mVar.m(f10, 0.0f);
            return;
        }
        float f16 = ((this.f35990C * 2.0f) + f15) / 2.0f;
        float f17 = f12 * this.f35989B;
        float f18 = f11 + this.f35993F;
        float f19 = (this.f35992E * f12) + ((1.0f - f12) * f16);
        if (f19 / f16 >= 1.0f) {
            mVar.m(f10, 0.0f);
            return;
        }
        float f20 = this.f35994G;
        float f21 = f20 * f12;
        boolean z10 = f20 == -1.0f || Math.abs((f20 * 2.0f) - f15) < 0.1f;
        if (z10) {
            f13 = f19;
            f14 = 0.0f;
        } else {
            f14 = 1.75f;
            f13 = 0.0f;
        }
        float f22 = f16 + f17;
        float f23 = f13 + f17;
        float fSqrt = (float) Math.sqrt((f22 * f22) - (f23 * f23));
        float f24 = f18 - fSqrt;
        float f25 = f18 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f23));
        float f26 = (90.0f - degrees) + f14;
        mVar.m(f24, 0.0f);
        float f27 = f17 * 2.0f;
        mVar.a(f24 - f17, 0.0f, f24 + f17, f27, 270.0f, degrees);
        if (z10) {
            mVar.a(f18 - f16, (-f16) - f13, f18 + f16, f16 - f13, 180.0f - f26, (f26 * 2.0f) - 180.0f);
        } else {
            float f28 = this.f35990C;
            float f29 = f21 * 2.0f;
            float f30 = f18 - f16;
            mVar.a(f30, -(f21 + f28), f30 + f28 + f29, f28 + f21, 180.0f - f26, ((f26 * 2.0f) - 180.0f) / 2.0f);
            float f31 = f18 + f16;
            float f32 = this.f35990C;
            mVar.m(f31 - ((f32 / 2.0f) + f21), f32 + f21);
            float f33 = this.f35990C;
            mVar.a(f31 - (f29 + f33), -(f21 + f33), f31, f33 + f21, 90.0f, f26 - 90.0f);
        }
        mVar.a(f25 - f17, 0.0f, f25 + f17, f27, 270.0f - degrees, degrees);
        mVar.m(f10, 0.0f);
    }

    float d() {
        return this.f35992E;
    }

    public float f() {
        return this.f35994G;
    }

    float g() {
        return this.f35990C;
    }

    float h() {
        return this.f35989B;
    }

    public float i() {
        return this.f35991D;
    }

    void k(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f35992E = f10;
    }

    public void l(float f10) {
        this.f35994G = f10;
    }

    void m(float f10) {
        this.f35990C = f10;
    }

    void n(float f10) {
        this.f35989B = f10;
    }

    public void o(float f10) {
        this.f35991D = f10;
    }

    void p(float f10) {
        this.f35993F = f10;
    }
}
