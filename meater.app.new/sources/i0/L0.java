package i0;

import h0.C3476g;
import h0.C3477h;
import h0.MutableRect;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: Matrix.kt */
@Aa.b
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00042\u00020\u0001:\u0001*B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001aJ+\u0010 \u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\u00172\b\b\u0002\u0010\u001e\u001a\u00020\u00172\b\b\u0002\u0010\u001f\u001a\u00020\u0017¢\u0006\u0004\b \u0010!J+\u0010\"\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\u00172\b\b\u0002\u0010\u001e\u001a\u00020\u00172\b\b\u0002\u0010\u001f\u001a\u00020\u0017¢\u0006\u0004\b\"\u0010!J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Li0/L0;", "", "", "values", "b", "([F)[F", "Lh0/g;", "point", "f", "([FJ)J", "Lh0/e;", "rect", "Loa/F;", "g", "([FLh0/e;)V", "m", "n", "([F[F)V", "", "o", "([F)Ljava/lang/String;", "h", "([F)V", "", "degrees", "i", "([FF)V", "j", "k", "x", "y", "z", "l", "([FFFF)V", "p", "", "e", "([F)I", "other", "", "d", "([FLjava/lang/Object;)Z", "a", "[F", "getValues", "()[F", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class L0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float[] values;

    private /* synthetic */ L0(float[] fArr) {
        this.values = fArr;
    }

    public static final /* synthetic */ L0 a(float[] fArr) {
        return new L0(fArr);
    }

    public static /* synthetic */ float[] c(float[] fArr, int i10, C3854k c3854k) {
        if ((i10 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return b(fArr);
    }

    public static boolean d(float[] fArr, Object obj) {
        return (obj instanceof L0) && C3862t.b(fArr, ((L0) obj).getValues());
    }

    public static int e(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public static final long f(float[] fArr, long j10) {
        float fM = C3476g.m(j10);
        float fN = C3476g.n(j10);
        float f10 = 1 / (((fArr[3] * fM) + (fArr[7] * fN)) + fArr[15]);
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            f10 = 0.0f;
        }
        return C3477h.a(((fArr[0] * fM) + (fArr[4] * fN) + fArr[12]) * f10, f10 * ((fArr[1] * fM) + (fArr[5] * fN) + fArr[13]));
    }

    public static final void g(float[] fArr, MutableRect mutableRect) {
        long jF = f(fArr, C3477h.a(mutableRect.getLeft(), mutableRect.getTop()));
        long jF2 = f(fArr, C3477h.a(mutableRect.getLeft(), mutableRect.getBottom()));
        long jF3 = f(fArr, C3477h.a(mutableRect.getRight(), mutableRect.getTop()));
        long jF4 = f(fArr, C3477h.a(mutableRect.getRight(), mutableRect.getBottom()));
        mutableRect.i(Math.min(Math.min(C3476g.m(jF), C3476g.m(jF2)), Math.min(C3476g.m(jF3), C3476g.m(jF4))));
        mutableRect.k(Math.min(Math.min(C3476g.n(jF), C3476g.n(jF2)), Math.min(C3476g.n(jF3), C3476g.n(jF4))));
        mutableRect.j(Math.max(Math.max(C3476g.m(jF), C3476g.m(jF2)), Math.max(C3476g.m(jF3), C3476g.m(jF4))));
        mutableRect.h(Math.max(Math.max(C3476g.n(jF), C3476g.n(jF2)), Math.max(C3476g.n(jF3), C3476g.n(jF4))));
    }

    public static final void h(float[] fArr) {
        int i10 = 0;
        while (i10 < 4) {
            int i11 = 0;
            while (i11 < 4) {
                fArr[(i11 * 4) + i10] = i10 == i11 ? 1.0f : 0.0f;
                i11++;
            }
            i10++;
        }
    }

    public static final void i(float[] fArr, float f10) {
        double d10 = (f10 * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[5];
        float f14 = fArr[6];
        float f15 = fArr[9];
        float f16 = fArr[10];
        float f17 = fArr[13];
        float f18 = fArr[14];
        fArr[1] = (f11 * fCos) - (f12 * fSin);
        fArr[2] = (f11 * fSin) + (f12 * fCos);
        fArr[5] = (f13 * fCos) - (f14 * fSin);
        fArr[6] = (f13 * fSin) + (f14 * fCos);
        fArr[9] = (f15 * fCos) - (f16 * fSin);
        fArr[10] = (f15 * fSin) + (f16 * fCos);
        fArr[13] = (f17 * fCos) - (f18 * fSin);
        fArr[14] = (f17 * fSin) + (f18 * fCos);
    }

    public static final void j(float[] fArr, float f10) {
        double d10 = (f10 * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        float f11 = fArr[0];
        float f12 = fArr[2];
        float f13 = fArr[4];
        float f14 = fArr[6];
        float f15 = fArr[8];
        float f16 = fArr[10];
        float f17 = fArr[12];
        float f18 = fArr[14];
        fArr[0] = (f11 * fCos) + (f12 * fSin);
        fArr[2] = ((-f11) * fSin) + (f12 * fCos);
        fArr[4] = (f13 * fCos) + (f14 * fSin);
        fArr[6] = ((-f13) * fSin) + (f14 * fCos);
        fArr[8] = (f15 * fCos) + (f16 * fSin);
        fArr[10] = ((-f15) * fSin) + (f16 * fCos);
        fArr[12] = (f17 * fCos) + (f18 * fSin);
        fArr[14] = ((-f17) * fSin) + (f18 * fCos);
    }

    public static final void k(float[] fArr, float f10) {
        double d10 = (f10 * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        float f11 = fArr[0];
        float f12 = fArr[4];
        float f13 = -fSin;
        float f14 = fArr[1];
        float f15 = fArr[5];
        float f16 = fArr[2];
        float f17 = fArr[6];
        float f18 = fArr[3];
        float f19 = fArr[7];
        fArr[0] = (fCos * f11) + (fSin * f12);
        fArr[1] = (fCos * f14) + (fSin * f15);
        fArr[2] = (fCos * f16) + (fSin * f17);
        fArr[3] = (fCos * f18) + (fSin * f19);
        fArr[4] = (f11 * f13) + (f12 * fCos);
        fArr[5] = (f14 * f13) + (f15 * fCos);
        fArr[6] = (f16 * f13) + (f17 * fCos);
        fArr[7] = (f13 * f18) + (fCos * f19);
    }

    public static final void l(float[] fArr, float f10, float f11, float f12) {
        fArr[0] = fArr[0] * f10;
        fArr[1] = fArr[1] * f10;
        fArr[2] = fArr[2] * f10;
        fArr[3] = fArr[3] * f10;
        fArr[4] = fArr[4] * f11;
        fArr[5] = fArr[5] * f11;
        fArr[6] = fArr[6] * f11;
        fArr[7] = fArr[7] * f11;
        fArr[8] = fArr[8] * f12;
        fArr[9] = fArr[9] * f12;
        fArr[10] = fArr[10] * f12;
        fArr[11] = fArr[11] * f12;
    }

    public static /* synthetic */ void m(float[] fArr, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 1.0f;
        }
        l(fArr, f10, f11, f12);
    }

    public static final void n(float[] fArr, float[] fArr2) {
        float fB = M0.b(fArr, 0, fArr2, 0);
        float fB2 = M0.b(fArr, 0, fArr2, 1);
        float fB3 = M0.b(fArr, 0, fArr2, 2);
        float fB4 = M0.b(fArr, 0, fArr2, 3);
        float fB5 = M0.b(fArr, 1, fArr2, 0);
        float fB6 = M0.b(fArr, 1, fArr2, 1);
        float fB7 = M0.b(fArr, 1, fArr2, 2);
        float fB8 = M0.b(fArr, 1, fArr2, 3);
        float fB9 = M0.b(fArr, 2, fArr2, 0);
        float fB10 = M0.b(fArr, 2, fArr2, 1);
        float fB11 = M0.b(fArr, 2, fArr2, 2);
        float fB12 = M0.b(fArr, 2, fArr2, 3);
        float fB13 = M0.b(fArr, 3, fArr2, 0);
        float fB14 = M0.b(fArr, 3, fArr2, 1);
        float fB15 = M0.b(fArr, 3, fArr2, 2);
        float fB16 = M0.b(fArr, 3, fArr2, 3);
        fArr[0] = fB;
        fArr[1] = fB2;
        fArr[2] = fB3;
        fArr[3] = fB4;
        fArr[4] = fB5;
        fArr[5] = fB6;
        fArr[6] = fB7;
        fArr[7] = fB8;
        fArr[8] = fB9;
        fArr[9] = fB10;
        fArr[10] = fB11;
        fArr[11] = fB12;
        fArr[12] = fB13;
        fArr[13] = fB14;
        fArr[14] = fB15;
        fArr[15] = fB16;
    }

    public static String o(float[] fArr) {
        return Ub.n.f("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    public static final void p(float[] fArr, float f10, float f11, float f12) {
        float f13 = (fArr[0] * f10) + (fArr[4] * f11) + (fArr[8] * f12) + fArr[12];
        float f14 = (fArr[1] * f10) + (fArr[5] * f11) + (fArr[9] * f12) + fArr[13];
        float f15 = (fArr[2] * f10) + (fArr[6] * f11) + (fArr[10] * f12) + fArr[14];
        float f16 = (fArr[3] * f10) + (fArr[7] * f11) + (fArr[11] * f12) + fArr[15];
        fArr[12] = f13;
        fArr[13] = f14;
        fArr[14] = f15;
        fArr[15] = f16;
    }

    public static /* synthetic */ void q(float[] fArr, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        p(fArr, f10, f11, f12);
    }

    public boolean equals(Object obj) {
        return d(this.values, obj);
    }

    public int hashCode() {
        return e(this.values);
    }

    /* renamed from: r, reason: from getter */
    public final /* synthetic */ float[] getValues() {
        return this.values;
    }

    public String toString() {
        return o(this.values);
    }

    public static float[] b(float[] fArr) {
        return fArr;
    }
}
