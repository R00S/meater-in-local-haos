package kotlin;

import i0.C3564a0;
import kotlin.Metadata;

/* compiled from: Easing.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0004\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018¨\u0006\u001d"}, d2 = {"Lv/x;", "Lv/D;", "", "a", "b", "c", "d", "<init>", "(FFFF)V", "fraction", "Loa/F;", "(F)V", "(F)F", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "F", "e", "min", "f", "max", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.x, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final class CubicBezierEasing implements InterfaceC4712D {
    private final float a;
    private final float b;
    private final float c;
    private final float d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float min;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float max;

    public CubicBezierEasing(float f10, float f11, float f12, float f13) {
        this.a = f10;
        this.b = f11;
        this.c = f12;
        this.d = f13;
        if (!((Float.isNaN(f10) || Float.isNaN(f11) || Float.isNaN(f12) || Float.isNaN(f13)) ? false : true)) {
            C4736Z.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f10 + ", " + f11 + ", " + f12 + ", " + f13 + '.');
        }
        long jB = C3564a0.b(0.0f, f11, f13, 1.0f, new float[5], 0);
        this.min = Float.intBitsToFloat((int) (jB >> 32));
        this.max = Float.intBitsToFloat((int) (jB & 4294967295L));
    }

    private final void b(float fraction) {
        throw new IllegalArgumentException("The cubic curve with parameters (" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + ") has no solution at " + fraction);
    }

    @Override // kotlin.InterfaceC4712D
    public float a(float fraction) {
        if (fraction <= 0.0f || fraction >= 1.0f) {
            return fraction;
        }
        float fE = C3564a0.e(0.0f - fraction, this.a - fraction, this.c - fraction, 1.0f - fraction);
        if (Float.isNaN(fE)) {
            b(fraction);
        }
        float fC = C3564a0.c(this.b, this.d, fE);
        float f10 = this.min;
        float f11 = this.max;
        if (fC < f10) {
            fC = f10;
        }
        return fC > f11 ? f11 : fC;
    }

    public boolean equals(Object other) {
        if (other instanceof CubicBezierEasing) {
            CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) other;
            if (this.a == cubicBezierEasing.a && this.b == cubicBezierEasing.b && this.c == cubicBezierEasing.c && this.d == cubicBezierEasing.d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.a) * 31) + Float.hashCode(this.b)) * 31) + Float.hashCode(this.c)) * 31) + Float.hashCode(this.d);
    }

    public String toString() {
        return "CubicBezierEasing(a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", d=" + this.d + ')';
    }
}
