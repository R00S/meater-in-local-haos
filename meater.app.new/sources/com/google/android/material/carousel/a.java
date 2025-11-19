package com.google.android.material.carousel;

import m1.C3946a;

/* compiled from: Arrangement.java */
/* loaded from: classes2.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    final int f36231a;

    /* renamed from: b, reason: collision with root package name */
    float f36232b;

    /* renamed from: c, reason: collision with root package name */
    int f36233c;

    /* renamed from: d, reason: collision with root package name */
    int f36234d;

    /* renamed from: e, reason: collision with root package name */
    float f36235e;

    /* renamed from: f, reason: collision with root package name */
    float f36236f;

    /* renamed from: g, reason: collision with root package name */
    final int f36237g;

    /* renamed from: h, reason: collision with root package name */
    final float f36238h;

    a(int i10, float f10, float f11, float f12, int i11, float f13, int i12, float f14, int i13, float f15) {
        this.f36231a = i10;
        this.f36232b = C3946a.a(f10, f11, f12);
        this.f36233c = i11;
        this.f36235e = f13;
        this.f36234d = i12;
        this.f36236f = f14;
        this.f36237g = i13;
        d(f15, f11, f12, f14);
        this.f36238h = b(f14);
    }

    private float a(float f10, int i10, float f11, int i11, int i12) {
        if (i10 <= 0) {
            f11 = 0.0f;
        }
        float f12 = i11 / 2.0f;
        return (f10 - ((i10 + f12) * f11)) / (i12 + f12);
    }

    private float b(float f10) {
        if (g()) {
            return Math.abs(f10 - this.f36236f) * this.f36231a;
        }
        return Float.MAX_VALUE;
    }

    static a c(float f10, float f11, float f12, float f13, int[] iArr, float f14, int[] iArr2, float f15, int[] iArr3) {
        a aVar = null;
        int i10 = 1;
        for (int i11 : iArr3) {
            int length = iArr2.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = iArr2[i12];
                int length2 = iArr.length;
                int i14 = 0;
                while (i14 < length2) {
                    int i15 = i14;
                    int i16 = length2;
                    int i17 = i12;
                    int i18 = length;
                    a aVar2 = new a(i10, f11, f12, f13, iArr[i14], f14, i13, f15, i11, f10);
                    if (aVar == null || aVar2.f36238h < aVar.f36238h) {
                        if (aVar2.f36238h == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    i10++;
                    i14 = i15 + 1;
                    length2 = i16;
                    i12 = i17;
                    length = i18;
                }
                i12++;
            }
        }
        return aVar;
    }

    private void d(float f10, float f11, float f12, float f13) {
        float f14 = f10 - f();
        int i10 = this.f36233c;
        if (i10 > 0 && f14 > 0.0f) {
            float f15 = this.f36232b;
            this.f36232b = f15 + Math.min(f14 / i10, f12 - f15);
        } else if (i10 > 0 && f14 < 0.0f) {
            float f16 = this.f36232b;
            this.f36232b = f16 + Math.max(f14 / i10, f11 - f16);
        }
        int i11 = this.f36233c;
        float f17 = i11 > 0 ? this.f36232b : 0.0f;
        this.f36232b = f17;
        float fA = a(f10, i11, f17, this.f36234d, this.f36237g);
        this.f36236f = fA;
        float f18 = (this.f36232b + fA) / 2.0f;
        this.f36235e = f18;
        int i12 = this.f36234d;
        if (i12 <= 0 || fA == f13) {
            return;
        }
        float f19 = (f13 - fA) * this.f36237g;
        float fMin = Math.min(Math.abs(f19), f18 * 0.1f * i12);
        if (f19 > 0.0f) {
            this.f36235e -= fMin / this.f36234d;
            this.f36236f += fMin / this.f36237g;
        } else {
            this.f36235e += fMin / this.f36234d;
            this.f36236f -= fMin / this.f36237g;
        }
    }

    private float f() {
        return (this.f36236f * this.f36237g) + (this.f36235e * this.f36234d) + (this.f36232b * this.f36233c);
    }

    private boolean g() {
        int i10 = this.f36237g;
        if (i10 <= 0 || this.f36233c <= 0 || this.f36234d <= 0) {
            return i10 <= 0 || this.f36233c <= 0 || this.f36236f > this.f36232b;
        }
        float f10 = this.f36236f;
        float f11 = this.f36235e;
        return f10 > f11 && f11 > this.f36232b;
    }

    int e() {
        return this.f36233c + this.f36234d + this.f36237g;
    }

    public String toString() {
        return "Arrangement [priority=" + this.f36231a + ", smallCount=" + this.f36233c + ", smallSize=" + this.f36232b + ", mediumCount=" + this.f36234d + ", mediumSize=" + this.f36235e + ", largeCount=" + this.f36237g + ", largeSize=" + this.f36236f + ", cost=" + this.f36238h + "]";
    }
}
