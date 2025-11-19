package J;

import h0.C3476g;
import h0.C3477h;
import h0.C3482m;
import kotlin.Metadata;

/* compiled from: RippleAnimation.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a&\u0010\b\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Lh0/m;", "size", "", "b", "(J)F", "LU0/d;", "", "bounded", "a", "(LU0/d;ZJ)F", "LU0/h;", "F", "BoundedRippleExtraRadius", "material-ripple_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final float f7112a = U0.h.u(10);

    public static final float a(U0.d dVar, boolean z10, long j10) {
        float fK = C3476g.k(C3477h.a(C3482m.i(j10), C3482m.g(j10))) / 2.0f;
        return z10 ? fK + dVar.X0(f7112a) : fK;
    }

    public static final float b(long j10) {
        return Math.max(C3482m.i(j10), C3482m.g(j10)) * 0.3f;
    }
}
