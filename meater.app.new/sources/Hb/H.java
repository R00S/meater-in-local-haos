package Hb;

import kotlin.jvm.internal.C3862t;

/* compiled from: ErasureProjectionComputer.kt */
/* loaded from: classes3.dex */
public class H {
    public static /* synthetic */ E0 b(H h10, Ra.m0 m0Var, I i10, D0 d02, U u10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: computeProjection");
        }
        if ((i11 & 8) != 0) {
            u10 = d02.e(m0Var, i10);
        }
        return h10.a(m0Var, i10, d02, u10);
    }

    public E0 a(Ra.m0 parameter, I typeAttr, D0 typeParameterUpperBoundEraser, U erasedUpperBound) {
        C3862t.g(parameter, "parameter");
        C3862t.g(typeAttr, "typeAttr");
        C3862t.g(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        C3862t.g(erasedUpperBound, "erasedUpperBound");
        return new G0(Q0.f5695H, erasedUpperBound);
    }
}
