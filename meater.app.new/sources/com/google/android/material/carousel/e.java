package com.google.android.material.carousel;

import android.content.Context;
import com.google.android.material.carousel.f;

/* compiled from: CarouselStrategyHelper.java */
/* loaded from: classes2.dex */
final class e {
    static float a(float f10, float f11, int i10) {
        return f10 + (Math.max(0, i10 - 1) * f11);
    }

    static float b(float f10, float f11, int i10) {
        return i10 > 0 ? f10 + (f11 / 2.0f) : f10;
    }

    static f c(Context context, float f10, float f11, a aVar) {
        float f12;
        float f13;
        float fMin = Math.min(f(context) + f10, aVar.f36236f);
        float f14 = fMin / 2.0f;
        float f15 = 0.0f - f14;
        float fB = b(0.0f, aVar.f36232b, aVar.f36233c);
        float fJ = j(0.0f, a(fB, aVar.f36232b, (int) Math.floor(aVar.f36233c / 2.0f)), aVar.f36232b, aVar.f36233c);
        float fB2 = b(fJ, aVar.f36235e, aVar.f36234d);
        float fJ2 = j(fJ, a(fB2, aVar.f36235e, (int) Math.floor(aVar.f36234d / 2.0f)), aVar.f36235e, aVar.f36234d);
        float fB3 = b(fJ2, aVar.f36236f, aVar.f36237g);
        float fJ3 = j(fJ2, a(fB3, aVar.f36236f, aVar.f36237g), aVar.f36236f, aVar.f36237g);
        float fB4 = b(fJ3, aVar.f36235e, aVar.f36234d);
        float fB5 = b(j(fJ3, a(fB4, aVar.f36235e, (int) Math.ceil(aVar.f36234d / 2.0f)), aVar.f36235e, aVar.f36234d), aVar.f36232b, aVar.f36233c);
        float f16 = f14 + f11;
        float fB6 = d.b(fMin, aVar.f36236f, f10);
        float fB7 = d.b(aVar.f36232b, aVar.f36236f, f10);
        float fB8 = d.b(aVar.f36235e, aVar.f36236f, f10);
        f.b bVarA = new f.b(aVar.f36236f, f11).a(f15, fB6, fMin);
        if (aVar.f36233c > 0) {
            f12 = f16;
            bVarA.g(fB, fB7, aVar.f36232b, (int) Math.floor(r7 / 2.0f));
        } else {
            f12 = f16;
        }
        if (aVar.f36234d > 0) {
            bVarA.g(fB2, fB8, aVar.f36235e, (int) Math.floor(r4 / 2.0f));
        }
        bVarA.h(fB3, 0.0f, aVar.f36236f, aVar.f36237g, true);
        if (aVar.f36234d > 0) {
            f13 = 2.0f;
            bVarA.g(fB4, fB8, aVar.f36235e, (int) Math.ceil(r4 / 2.0f));
        } else {
            f13 = 2.0f;
        }
        if (aVar.f36233c > 0) {
            bVarA.g(fB5, fB7, aVar.f36232b, (int) Math.ceil(r0 / f13));
        }
        bVarA.a(f12, fB6, fMin);
        return bVarA.i();
    }

    static f d(Context context, float f10, float f11, a aVar, int i10) {
        return i10 == 1 ? c(context, f10, f11, aVar) : e(context, f10, f11, aVar);
    }

    static f e(Context context, float f10, float f11, a aVar) {
        float fMin = Math.min(f(context) + f10, aVar.f36236f);
        float f12 = fMin / 2.0f;
        float f13 = 0.0f - f12;
        float fB = b(0.0f, aVar.f36236f, aVar.f36237g);
        float fJ = j(0.0f, a(fB, aVar.f36236f, aVar.f36237g), aVar.f36236f, aVar.f36237g);
        float fB2 = b(fJ, aVar.f36235e, aVar.f36234d);
        float fB3 = b(j(fJ, fB2, aVar.f36235e, aVar.f36234d), aVar.f36232b, aVar.f36233c);
        float f14 = f12 + f11;
        float fB4 = d.b(fMin, aVar.f36236f, f10);
        float fB5 = d.b(aVar.f36232b, aVar.f36236f, f10);
        float fB6 = d.b(aVar.f36235e, aVar.f36236f, f10);
        f.b bVarH = new f.b(aVar.f36236f, f11).a(f13, fB4, fMin).h(fB, 0.0f, aVar.f36236f, aVar.f36237g, true);
        if (aVar.f36234d > 0) {
            bVarH.b(fB2, fB6, aVar.f36235e);
        }
        int i10 = aVar.f36233c;
        if (i10 > 0) {
            bVarH.g(fB3, fB5, aVar.f36232b, i10);
        }
        bVarH.a(f14, fB4, fMin);
        return bVarH.i();
    }

    static float f(Context context) {
        return context.getResources().getDimension(C7.e.f2353A);
    }

    static float g(Context context) {
        return context.getResources().getDimension(C7.e.f2354B);
    }

    static float h(Context context) {
        return context.getResources().getDimension(C7.e.f2355C);
    }

    static int i(int[] iArr) {
        int i10 = Integer.MIN_VALUE;
        for (int i11 : iArr) {
            if (i11 > i10) {
                i10 = i11;
            }
        }
        return i10;
    }

    static float j(float f10, float f11, float f12, int i10) {
        return i10 > 0 ? f11 + (f12 / 2.0f) : f10;
    }
}
