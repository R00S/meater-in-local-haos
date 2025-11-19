package kotlin;

import kotlin.Metadata;

/* compiled from: SpringEstimation.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001a7\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a/\u0010\u0012\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0011\u001a7\u0010\u0014\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a?\u0010\u0017\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"", "stiffness", "dampingRatio", "initialVelocity", "initialDisplacement", "delta", "", "b", "(FFFFF)J", "", "a", "(DDDDD)J", "Lv/v;", "firstRoot", "p0", "v0", "g", "(Lv/v;DDD)D", "c", "secondRoot", "e", "(Lv/v;Lv/v;DDD)D", "initialPosition", "d", "(Lv/v;Lv/v;DDDD)J", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4742c0 {
    public static final long a(double d10, double d11, double d12, double d13, double d14) {
        double dSqrt = 2.0d * d11 * Math.sqrt(d10);
        double d15 = (dSqrt * dSqrt) - (4.0d * d10);
        double d16 = -dSqrt;
        ComplexDouble complexDoubleA = C4781w.a(d15);
        complexDoubleA._real += d16;
        complexDoubleA._real *= 0.5d;
        complexDoubleA._imaginary *= 0.5d;
        ComplexDouble complexDoubleA2 = C4781w.a(d15);
        double d17 = -1;
        complexDoubleA2._real *= d17;
        complexDoubleA2._imaginary *= d17;
        complexDoubleA2._real += d16;
        complexDoubleA2._real *= 0.5d;
        complexDoubleA2._imaginary *= 0.5d;
        return d(complexDoubleA, complexDoubleA2, d11, d12, d13, d14);
    }

    public static final long b(float f10, float f11, float f12, float f13, float f14) {
        if (f11 == 0.0f) {
            return 9223372036854L;
        }
        return a(f10, f11, f12, f13, f14);
    }

    private static final double c(ComplexDouble complexDouble, double d10, double d11, double d12) {
        double d13 = d12;
        double d14 = complexDouble.get_real();
        double d15 = d14 * d10;
        double d16 = d11 - d15;
        double dLog = Math.log(Math.abs(d13 / d10)) / d14;
        double dLog2 = Math.log(Math.abs(d13 / d16));
        double dLog3 = dLog2;
        for (int i10 = 0; i10 < 6; i10++) {
            dLog3 = dLog2 - Math.log(Math.abs(dLog3 / d14));
        }
        double d17 = dLog3 / d14;
        if (!((Double.isInfinite(dLog) || Double.isNaN(dLog)) ? false : true)) {
            dLog = d17;
        } else if ((Double.isInfinite(d17) || Double.isNaN(d17)) ? false : true) {
            dLog = Math.max(dLog, d17);
        }
        double d18 = (-(d15 + d16)) / (d14 * d16);
        double d19 = d14 * d18;
        double dExp = (Math.exp(d19) * d10) + (d16 * d18 * Math.exp(d19));
        if (Double.isNaN(d18) || d18 <= 0.0d) {
            d13 = -d13;
        } else if (d18 <= 0.0d || (-dExp) >= d13) {
            dLog = (-(2.0d / d14)) - (d10 / d16);
        } else {
            if (d16 < 0.0d && d10 > 0.0d) {
                dLog = 0.0d;
            }
            d13 = -d13;
        }
        double dAbs = Double.MAX_VALUE;
        int i11 = 0;
        while (dAbs > 0.001d && i11 < 100) {
            i11++;
            double d20 = d14 * dLog;
            double d21 = d13;
            double dExp2 = dLog - ((((d10 + (d16 * dLog)) * Math.exp(d20)) + d13) / ((((1 + d20) * d16) + d15) * Math.exp(d20)));
            dAbs = Math.abs(dLog - dExp2);
            dLog = dExp2;
            d13 = d21;
        }
        return dLog;
    }

    private static final long d(ComplexDouble complexDouble, ComplexDouble complexDouble2, double d10, double d11, double d12, double d13) {
        double d14 = d11;
        if (d12 == 0.0d && d14 == 0.0d) {
            return 0L;
        }
        if (d12 < 0.0d) {
            d14 = -d14;
        }
        double dAbs = Math.abs(d12);
        return (long) ((d10 > 1.0d ? e(complexDouble, complexDouble2, dAbs, d14, d13) : d10 < 1.0d ? g(complexDouble, dAbs, d14, d13) : c(complexDouble, dAbs, d14, d13)) * 1000.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final double e(kotlin.ComplexDouble r29, kotlin.ComplexDouble r30, double r31, double r33, double r35) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C4742c0.e(v.v, v.v, double, double, double):double");
    }

    private static final double f(double d10, double d11, double d12, double d13, double d14) {
        return (d10 * Math.exp(d11 * d12)) + (d13 * Math.exp(d14 * d12));
    }

    private static final double g(ComplexDouble complexDouble, double d10, double d11, double d12) {
        double d13 = complexDouble.get_real();
        double d14 = (d11 - (d13 * d10)) / complexDouble.get_imaginary();
        return Math.log(d12 / Math.sqrt((d10 * d10) + (d14 * d14))) / d13;
    }
}
