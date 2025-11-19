package Hb;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3862t;

/* compiled from: flexibleTypes.kt */
/* loaded from: classes3.dex */
public final class N {
    public static final K a(U u10) {
        C3862t.g(u10, "<this>");
        P0 p0R0 = u10.R0();
        C3862t.e(p0R0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return (K) p0R0;
    }

    public static final boolean b(U u10) {
        C3862t.g(u10, "<this>");
        return u10.R0() instanceof K;
    }

    public static final AbstractC1082f0 c(U u10) {
        C3862t.g(u10, "<this>");
        P0 p0R0 = u10.R0();
        if (p0R0 instanceof K) {
            return ((K) p0R0).W0();
        }
        if (p0R0 instanceof AbstractC1082f0) {
            return (AbstractC1082f0) p0R0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final AbstractC1082f0 d(U u10) {
        C3862t.g(u10, "<this>");
        P0 p0R0 = u10.R0();
        if (p0R0 instanceof K) {
            return ((K) p0R0).X0();
        }
        if (p0R0 instanceof AbstractC1082f0) {
            return (AbstractC1082f0) p0R0;
        }
        throw new NoWhenBranchMatchedException();
    }
}
