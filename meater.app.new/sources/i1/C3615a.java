package i1;

import j1.C3718c;

/* compiled from: CamColor.java */
/* renamed from: i1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3615a {

    /* renamed from: a, reason: collision with root package name */
    private final float f42983a;

    /* renamed from: b, reason: collision with root package name */
    private final float f42984b;

    /* renamed from: c, reason: collision with root package name */
    private final float f42985c;

    /* renamed from: d, reason: collision with root package name */
    private final float f42986d;

    /* renamed from: e, reason: collision with root package name */
    private final float f42987e;

    /* renamed from: f, reason: collision with root package name */
    private final float f42988f;

    /* renamed from: g, reason: collision with root package name */
    private final float f42989g;

    /* renamed from: h, reason: collision with root package name */
    private final float f42990h;

    /* renamed from: i, reason: collision with root package name */
    private final float f42991i;

    C3615a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f42983a = f10;
        this.f42984b = f11;
        this.f42985c = f12;
        this.f42986d = f13;
        this.f42987e = f14;
        this.f42988f = f15;
        this.f42989g = f16;
        this.f42990h = f17;
        this.f42991i = f18;
    }

    private static C3615a b(float f10, float f11, float f12) {
        float f13 = 100.0f;
        float f14 = 1000.0f;
        float f15 = 0.0f;
        C3615a c3615a = null;
        float f16 = 1000.0f;
        while (Math.abs(f15 - f13) > 0.01f) {
            float f17 = ((f13 - f15) / 2.0f) + f15;
            int iP = e(f17, f11, f10).p();
            float fB = C3616b.b(iP);
            float fAbs = Math.abs(f12 - fB);
            if (fAbs < 0.2f) {
                C3615a c3615aC = c(iP);
                float fA = c3615aC.a(e(c3615aC.k(), c3615aC.i(), f10));
                if (fA <= 1.0f) {
                    c3615a = c3615aC;
                    f14 = fAbs;
                    f16 = fA;
                }
            }
            if (f14 == 0.0f && f16 == 0.0f) {
                break;
            }
            if (fB < f12) {
                f15 = f17;
            } else {
                f13 = f17;
            }
        }
        return c3615a;
    }

    static C3615a c(int i10) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        d(i10, l.f43029k, fArr, fArr2);
        return new C3615a(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    static void d(int i10, l lVar, float[] fArr, float[] fArr2) {
        C3616b.f(i10, fArr2);
        float[][] fArr3 = C3616b.f42992a;
        float f10 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f11 = fArr4[0] * f10;
        float f12 = fArr2[1];
        float f13 = f11 + (fArr4[1] * f12);
        float f14 = fArr2[2];
        float f15 = f13 + (fArr4[2] * f14);
        float[] fArr5 = fArr3[1];
        float f16 = (fArr5[0] * f10) + (fArr5[1] * f12) + (fArr5[2] * f14);
        float[] fArr6 = fArr3[2];
        float f17 = (f10 * fArr6[0]) + (f12 * fArr6[1]) + (f14 * fArr6[2]);
        float f18 = lVar.i()[0] * f15;
        float f19 = lVar.i()[1] * f16;
        float f20 = lVar.i()[2] * f17;
        float fPow = (float) Math.pow((lVar.c() * Math.abs(f18)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((lVar.c() * Math.abs(f19)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((lVar.c() * Math.abs(f20)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f18) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f19) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f20) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d10 = fSignum3;
        float f21 = ((float) (((fSignum * 11.0d) + (fSignum2 * (-12.0d))) + d10)) / 11.0f;
        float f22 = ((float) ((fSignum + fSignum2) - (d10 * 2.0d))) / 9.0f;
        float f23 = fSignum2 * 20.0f;
        float f24 = (((fSignum * 20.0f) + f23) + (21.0f * fSignum3)) / 20.0f;
        float f25 = (((fSignum * 40.0f) + f23) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f22, f21)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f26 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f25 * lVar.f()) / lVar.a(), lVar.b() * lVar.j())) * 100.0f;
        float fB = (4.0f / lVar.b()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (lVar.a() + 4.0f) * lVar.d();
        float fSqrt = ((float) Math.sqrt(fPow4 / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, lVar.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.g()) * lVar.h()) * ((float) Math.sqrt((f21 * f21) + (f22 * f22)))) / (f24 + 0.305f), 0.9d));
        float fD = lVar.d() * fSqrt;
        float fSqrt2 = ((float) Math.sqrt((r7 * lVar.b()) / (lVar.a() + 4.0f))) * 50.0f;
        float f27 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * fD) + 1.0f)) * 43.85965f;
        double d11 = f26;
        float fCos = ((float) Math.cos(d11)) * fLog;
        float fSin = fLog * ((float) Math.sin(d11));
        fArr2[0] = fAtan2;
        fArr2[1] = fSqrt;
        if (fArr != null) {
            fArr[0] = fPow4;
            fArr[1] = fB;
            fArr[2] = fD;
            fArr[3] = fSqrt2;
            fArr[4] = f27;
            fArr[5] = fCos;
            fArr[6] = fSin;
        }
    }

    private static C3615a e(float f10, float f11, float f12) {
        return f(f10, f11, f12, l.f43029k);
    }

    private static C3615a f(float f10, float f11, float f12, l lVar) {
        float fB = (4.0f / lVar.b()) * ((float) Math.sqrt(f10 / 100.0d)) * (lVar.a() + 4.0f) * lVar.d();
        float fD = f11 * lVar.d();
        float fSqrt = ((float) Math.sqrt(((f11 / ((float) Math.sqrt(r4))) * lVar.b()) / (lVar.a() + 4.0f))) * 50.0f;
        float f13 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float fLog = ((float) Math.log((fD * 0.0228d) + 1.0d)) * 43.85965f;
        double d10 = (3.1415927f * f12) / 180.0f;
        return new C3615a(f12, f11, f10, fB, fD, fSqrt, f13, fLog * ((float) Math.cos(d10)), fLog * ((float) Math.sin(d10)));
    }

    public static int m(float f10, float f11, float f12) {
        return n(f10, f11, f12, l.f43029k);
    }

    static int n(float f10, float f11, float f12, l lVar) {
        if (f11 < 1.0d || Math.round(f12) <= 0.0d || Math.round(f12) >= 100.0d) {
            return C3616b.a(f12);
        }
        float fMin = f10 < 0.0f ? 0.0f : Math.min(360.0f, f10);
        C3615a c3615a = null;
        boolean z10 = true;
        float f13 = 0.0f;
        float f14 = f11;
        while (Math.abs(f13 - f11) >= 0.4f) {
            C3615a c3615aB = b(fMin, f14, f12);
            if (!z10) {
                if (c3615aB == null) {
                    f11 = f14;
                } else {
                    f13 = f14;
                    c3615a = c3615aB;
                }
                f14 = ((f11 - f13) / 2.0f) + f13;
            } else {
                if (c3615aB != null) {
                    return c3615aB.o(lVar);
                }
                f14 = ((f11 - f13) / 2.0f) + f13;
                z10 = false;
            }
        }
        return c3615a == null ? C3616b.a(f12) : c3615a.o(lVar);
    }

    float a(C3615a c3615a) {
        float fL = l() - c3615a.l();
        float fG = g() - c3615a.g();
        float fH = h() - c3615a.h();
        return (float) (Math.pow(Math.sqrt((fL * fL) + (fG * fG) + (fH * fH)), 0.63d) * 1.41d);
    }

    float g() {
        return this.f42990h;
    }

    float h() {
        return this.f42991i;
    }

    float i() {
        return this.f42984b;
    }

    float j() {
        return this.f42983a;
    }

    float k() {
        return this.f42985c;
    }

    float l() {
        return this.f42989g;
    }

    int o(l lVar) {
        float fPow = (float) Math.pow(((((double) i()) == 0.0d || ((double) k()) == 0.0d) ? 0.0f : i() / ((float) Math.sqrt(k() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, lVar.e()), 0.73d), 1.1111111111111112d);
        double dJ = (j() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + dJ) + 3.8d)) * 0.25f;
        float fA = lVar.a() * ((float) Math.pow(k() / 100.0d, (1.0d / lVar.b()) / lVar.j()));
        float fG = fCos * 3846.1538f * lVar.g() * lVar.h();
        float f10 = fA / lVar.f();
        float fSin = (float) Math.sin(dJ);
        float fCos2 = (float) Math.cos(dJ);
        float f11 = (((0.305f + f10) * 23.0f) * fPow) / (((fG * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f12 = fCos2 * f11;
        float f13 = f11 * fSin;
        float f14 = f10 * 460.0f;
        float f15 = (((451.0f * f12) + f14) + (288.0f * f13)) / 1403.0f;
        float f16 = ((f14 - (891.0f * f12)) - (261.0f * f13)) / 1403.0f;
        float fSignum = Math.signum(f15) * (100.0f / lVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f15) * 27.13d) / (400.0d - Math.abs(f15))), 2.380952380952381d));
        float fSignum2 = Math.signum(f16) * (100.0f / lVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f16) * 27.13d) / (400.0d - Math.abs(f16))), 2.380952380952381d));
        float fSignum3 = Math.signum(((f14 - (f12 * 220.0f)) - (f13 * 6300.0f)) / 1403.0f) * (100.0f / lVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(r8) * 27.13d) / (400.0d - Math.abs(r8))), 2.380952380952381d));
        float f17 = fSignum / lVar.i()[0];
        float f18 = fSignum2 / lVar.i()[1];
        float f19 = fSignum3 / lVar.i()[2];
        float[][] fArr = C3616b.f42993b;
        float[] fArr2 = fArr[0];
        float f20 = (fArr2[0] * f17) + (fArr2[1] * f18) + (fArr2[2] * f19);
        float[] fArr3 = fArr[1];
        float f21 = (fArr3[0] * f17) + (fArr3[1] * f18) + (fArr3[2] * f19);
        float[] fArr4 = fArr[2];
        return C3718c.b(f20, f21, (f17 * fArr4[0]) + (f18 * fArr4[1]) + (f19 * fArr4[2]));
    }

    int p() {
        return o(l.f43029k);
    }
}
