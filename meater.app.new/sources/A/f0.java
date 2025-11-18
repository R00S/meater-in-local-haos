package A;

import kotlin.Metadata;

/* compiled from: WindowInsets.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u001c\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014\u001a8\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00152\b\b\u0002\u0010\u0010\u001a\u00020\u00152\b\b\u0002\u0010\u0011\u001a\u00020\u00152\b\b\u0002\u0010\u0012\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"LA/d0;", "insets", "g", "(LA/d0;LA/d0;)LA/d0;", "e", "LA/i0;", "sides", "f", "(LA/d0;I)LA/d0;", "LU0/d;", "density", "LA/N;", "d", "(LA/d0;LU0/d;)LA/N;", "", "left", "top", "right", "bottom", "a", "(IIII)LA/d0;", "LU0/h;", "b", "(FFFF)LA/d0;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f0 {
    public static final d0 a(int i10, int i11, int i12, int i13) {
        return new Insets(i10, i11, i12, i13);
    }

    public static final d0 b(float f10, float f11, float f12, float f13) {
        return new Insets(f10, f11, f12, f13, null);
    }

    public static /* synthetic */ d0 c(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = U0.h.u(0);
        }
        if ((i10 & 2) != 0) {
            f11 = U0.h.u(0);
        }
        if ((i10 & 4) != 0) {
            f12 = U0.h.u(0);
        }
        if ((i10 & 8) != 0) {
            f13 = U0.h.u(0);
        }
        return b(f10, f11, f12, f13);
    }

    public static final N d(d0 d0Var, U0.d dVar) {
        return new InsetsPaddingValues(d0Var, dVar);
    }

    public static final d0 e(d0 d0Var, d0 d0Var2) {
        return new C0807o(d0Var, d0Var2);
    }

    public static final d0 f(d0 d0Var, int i10) {
        return new L(d0Var, i10, null);
    }

    public static final d0 g(d0 d0Var, d0 d0Var2) {
        return new a0(d0Var, d0Var2);
    }
}
