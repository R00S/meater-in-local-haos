package j0;

import j0.C3702b;
import j0.C3708h;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import s.C4380B;

/* compiled from: ColorSpace.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u000e\u001a*\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a(\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a%\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a?\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a?\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0017\u0010\u0016\u001aO\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aO\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001c\u0010\u001b\u001a?\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0016\u001a?\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0016\u001a\u001f\u0010\u0019\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0019\u0010\u001e\u001a\u001f\u0010\u0014\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u001fH\u0000¢\u0006\u0004\b\u0014\u0010 \u001a\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001f\u0010&\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u001fH\u0000¢\u0006\u0004\b&\u0010'\u001a\u001f\u0010(\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u001fH\u0000¢\u0006\u0004\b(\u0010'\u001a\u001f\u0010!\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010'\u001a'\u0010\u0018\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001fH\u0000¢\u0006\u0004\b\u0018\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Lj0/c;", "source", "destination", "Lj0/n;", "intent", "Lj0/h;", "j", "(Lj0/c;Lj0/c;I)Lj0/h;", "h", "Lj0/z;", "whitePoint", "Lj0/a;", "adaptation", "c", "(Lj0/c;Lj0/z;Lj0/a;)Lj0/c;", "", "x", "a", "b", "d", "g", "o", "(DDDDDD)D", "q", "e", "f", "p", "(DDDDDDDD)D", "r", "", "(Lj0/z;Lj0/z;)Z", "", "([F[F)Z", "m", "k", "([F)[F", "lhs", "rhs", "l", "([F[F)[F", "n", "matrix", "srcWhitePoint", "dstWhitePoint", "([F[F[F)[F", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: j0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3704d {
    public static final double a(double d10, double d11, double d12, double d13, double d14, double d15) {
        return Math.copySign(o(d10 < 0.0d ? -d10 : d10, d11, d12, d13, d14, d15), d10);
    }

    public static final double b(double d10, double d11, double d12, double d13, double d14, double d15) {
        return Math.copySign(q(d10 < 0.0d ? -d10 : d10, d11, d12, d13, d14, d15), d10);
    }

    public static final AbstractC3703c c(AbstractC3703c abstractC3703c, WhitePoint whitePoint, AbstractC3701a abstractC3701a) {
        if (!C3702b.e(abstractC3703c.getModel(), C3702b.INSTANCE.b())) {
            return abstractC3703c;
        }
        C3862t.e(abstractC3703c, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        x xVar = (x) abstractC3703c;
        if (f(xVar.getWhitePoint(), whitePoint)) {
            return abstractC3703c;
        }
        return new x(xVar, l(e(abstractC3701a.getTransform(), xVar.getWhitePoint().c(), whitePoint.c()), xVar.getTransform()), whitePoint);
    }

    public static /* synthetic */ AbstractC3703c d(AbstractC3703c abstractC3703c, WhitePoint whitePoint, AbstractC3701a abstractC3701a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            abstractC3701a = AbstractC3701a.INSTANCE.a();
        }
        return c(abstractC3703c, whitePoint, abstractC3701a);
    }

    public static final float[] e(float[] fArr, float[] fArr2, float[] fArr3) {
        float[] fArrN = n(fArr, fArr2);
        float[] fArrN2 = n(fArr, fArr3);
        return l(k(fArr), m(new float[]{fArrN2[0] / fArrN[0], fArrN2[1] / fArrN[1], fArrN2[2] / fArrN[2]}, fArr));
    }

    public static final boolean f(WhitePoint whitePoint, WhitePoint whitePoint2) {
        if (whitePoint == whitePoint2) {
            return true;
        }
        return Math.abs(whitePoint.getX() - whitePoint2.getX()) < 0.001f && Math.abs(whitePoint.getY() - whitePoint2.getY()) < 0.001f;
    }

    public static final boolean g(float[] fArr, float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (Float.compare(fArr[i10], fArr2[i10]) != 0 && Math.abs(fArr[i10] - fArr2[i10]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    public static final C3708h h(AbstractC3703c abstractC3703c, AbstractC3703c abstractC3703c2, int i10) {
        int id2 = abstractC3703c.getId();
        int id3 = abstractC3703c2.getId();
        if ((id2 | id3) < 0) {
            return j(abstractC3703c, abstractC3703c2, i10);
        }
        C4380B<C3708h> c4380bA = C3709i.a();
        int i11 = id2 | (id3 << 6) | (i10 << 12);
        C3708h c3708hC = c4380bA.c(i11);
        if (c3708hC == null) {
            c3708hC = j(abstractC3703c, abstractC3703c2, i10);
            c4380bA.t(i11, c3708hC);
        }
        return c3708hC;
    }

    public static /* synthetic */ C3708h i(AbstractC3703c abstractC3703c, AbstractC3703c abstractC3703c2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            abstractC3703c2 = C3707g.f43324a.w();
        }
        if ((i11 & 2) != 0) {
            i10 = C3714n.INSTANCE.b();
        }
        return h(abstractC3703c, abstractC3703c2, i10);
    }

    private static final C3708h j(AbstractC3703c abstractC3703c, AbstractC3703c abstractC3703c2, int i10) {
        C3708h c3708h;
        if (abstractC3703c == abstractC3703c2) {
            return C3708h.INSTANCE.c(abstractC3703c);
        }
        long model = abstractC3703c.getModel();
        C3702b.Companion companion = C3702b.INSTANCE;
        C3854k c3854k = null;
        if (C3702b.e(model, companion.b()) && C3702b.e(abstractC3703c2.getModel(), companion.b())) {
            C3862t.e(abstractC3703c, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            C3862t.e(abstractC3703c2, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            c3708h = new C3708h.b((x) abstractC3703c, (x) abstractC3703c2, i10, c3854k);
        } else {
            c3708h = new C3708h(abstractC3703c, abstractC3703c2, i10, c3854k);
        }
        return c3708h;
    }

    public static final float[] k(float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[3];
        float f12 = fArr[6];
        float f13 = fArr[1];
        float f14 = fArr[4];
        float f15 = fArr[7];
        float f16 = fArr[2];
        float f17 = fArr[5];
        float f18 = fArr[8];
        float f19 = (f14 * f18) - (f15 * f17);
        float f20 = (f15 * f16) - (f13 * f18);
        float f21 = (f13 * f17) - (f14 * f16);
        float f22 = (f10 * f19) + (f11 * f20) + (f12 * f21);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f19 / f22;
        fArr2[1] = f20 / f22;
        fArr2[2] = f21 / f22;
        fArr2[3] = ((f12 * f17) - (f11 * f18)) / f22;
        fArr2[4] = ((f18 * f10) - (f12 * f16)) / f22;
        fArr2[5] = ((f16 * f11) - (f17 * f10)) / f22;
        fArr2[6] = ((f11 * f15) - (f12 * f14)) / f22;
        fArr2[7] = ((f12 * f13) - (f15 * f10)) / f22;
        fArr2[8] = ((f10 * f14) - (f11 * f13)) / f22;
        return fArr2;
    }

    public static final float[] l(float[] fArr, float[] fArr2) {
        float f10 = fArr[0];
        float f11 = fArr2[0];
        float f12 = fArr[3];
        float f13 = fArr2[1];
        float f14 = fArr[6];
        float f15 = fArr2[2];
        float f16 = (f10 * f11) + (f12 * f13) + (f14 * f15);
        float f17 = fArr[1];
        float f18 = fArr[4];
        float f19 = fArr[7];
        float f20 = (f17 * f11) + (f18 * f13) + (f19 * f15);
        float f21 = fArr[2];
        float f22 = fArr[5];
        float f23 = fArr[8];
        float f24 = (f11 * f21) + (f13 * f22) + (f15 * f23);
        float f25 = fArr2[3];
        float f26 = fArr2[4];
        float f27 = fArr2[5];
        float f28 = (f10 * f25) + (f12 * f26) + (f14 * f27);
        float f29 = (f17 * f25) + (f18 * f26) + (f19 * f27);
        float f30 = (f25 * f21) + (f26 * f22) + (f27 * f23);
        float f31 = fArr2[6];
        float f32 = fArr2[7];
        float f33 = (f10 * f31) + (f12 * f32);
        float f34 = fArr2[8];
        return new float[]{f16, f20, f24, f28, f29, f30, f33 + (f14 * f34), (f17 * f31) + (f18 * f32) + (f19 * f34), (f21 * f31) + (f22 * f32) + (f23 * f34)};
    }

    public static final float[] m(float[] fArr, float[] fArr2) {
        float f10 = fArr[0];
        float f11 = fArr2[0] * f10;
        float f12 = fArr[1];
        float f13 = fArr2[1] * f12;
        float f14 = fArr[2];
        return new float[]{f11, f13, fArr2[2] * f14, fArr2[3] * f10, fArr2[4] * f12, fArr2[5] * f14, f10 * fArr2[6], f12 * fArr2[7], f14 * fArr2[8]};
    }

    public static final float[] n(float[] fArr, float[] fArr2) {
        float f10 = fArr2[0];
        float f11 = fArr2[1];
        float f12 = fArr2[2];
        fArr2[0] = (fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f12);
        fArr2[1] = (fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f12);
        fArr2[2] = (fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f12);
        return fArr2;
    }

    public static final double o(double d10, double d11, double d12, double d13, double d14, double d15) {
        return d10 >= d14 * d13 ? (Math.pow(d10, 1.0d / d15) - d12) / d11 : d10 / d13;
    }

    public static final double p(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        return d10 >= d14 * d13 ? (Math.pow(d10 - d15, 1.0d / d17) - d12) / d11 : (d10 - d16) / d13;
    }

    public static final double q(double d10, double d11, double d12, double d13, double d14, double d15) {
        return d10 >= d14 ? Math.pow((d11 * d10) + d12, d15) : d10 * d13;
    }

    public static final double r(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        return d10 >= d14 ? Math.pow((d11 * d10) + d12, d17) + d15 : (d13 * d10) + d16;
    }
}
