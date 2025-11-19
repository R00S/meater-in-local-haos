package Hb;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3862t;

/* compiled from: TypeWithEnhancement.kt */
/* loaded from: classes3.dex */
public final class O0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final U a(U u10) {
        C3862t.g(u10, "<this>");
        if (u10 instanceof N0) {
            return ((N0) u10).H();
        }
        return null;
    }

    public static final P0 b(P0 p02, U origin) {
        C3862t.g(p02, "<this>");
        C3862t.g(origin, "origin");
        return d(p02, a(origin));
    }

    public static final P0 c(P0 p02, U origin, Ba.l<? super U, ? extends U> transform) {
        C3862t.g(p02, "<this>");
        C3862t.g(origin, "origin");
        C3862t.g(transform, "transform");
        U uA = a(origin);
        return d(p02, uA != null ? transform.invoke(uA) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final P0 d(P0 p02, U u10) {
        C3862t.g(p02, "<this>");
        if (p02 instanceof N0) {
            return d(((N0) p02).E0(), u10);
        }
        if (u10 == null || C3862t.b(u10, p02)) {
            return p02;
        }
        if (p02 instanceof AbstractC1082f0) {
            return new C1088i0((AbstractC1082f0) p02, u10);
        }
        if (p02 instanceof K) {
            return new M((K) p02, u10);
        }
        throw new NoWhenBranchMatchedException();
    }
}
