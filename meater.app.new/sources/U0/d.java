package U0;

import h0.C3482m;
import h0.C3483n;
import kotlin.Metadata;

/* compiled from: Density.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\u00020\u0003*\u00020\tH\u0017ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u0002*\u00020\u0006H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u0002*\u00020\u0003H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0005J\u0019\u0010\u000f\u001a\u00020\t*\u00020\u0003H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\u0011*\u00020\u0012H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"LU0/d;", "LU0/l;", "LU0/h;", "", "X0", "(F)F", "", "i1", "(F)I", "LU0/v;", "w1", "(J)F", "E0", "(I)F", "G0", "x", "(F)J", "LU0/k;", "Lh0/m;", "t1", "(J)J", "Z", "getDensity", "()F", "getDensity$annotations", "()V", "density", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface d extends l {
    default float E0(int i10) {
        return h.u(i10 / getDensity());
    }

    default float G0(float f10) {
        return h.u(f10 / getDensity());
    }

    default float X0(float f10) {
        return f10 * getDensity();
    }

    default long Z(long j10) {
        return j10 != 9205357640488583168L ? i.b(G0(C3482m.i(j10)), G0(C3482m.g(j10))) : k.INSTANCE.a();
    }

    float getDensity();

    default int i1(float f10) {
        float fX0 = X0(f10);
        if (Float.isInfinite(fX0)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fX0);
    }

    default long t1(long j10) {
        return j10 != 9205357640488583168L ? C3483n.a(X0(k.e(j10)), X0(k.d(j10))) : C3482m.INSTANCE.a();
    }

    default float w1(long j10) {
        if (x.g(v.g(j10), x.INSTANCE.b())) {
            return X0(i0(j10));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    default long x(float f10) {
        return s(G0(f10));
    }
}
