package Hb;

import Hb.C1113z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C3862t;

/* compiled from: SpecialTypes.kt */
/* renamed from: Hb.j0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1090j0 {
    public static final C1071a a(U u10) {
        C3862t.g(u10, "<this>");
        P0 p0R0 = u10.R0();
        if (p0R0 instanceof C1071a) {
            return (C1071a) p0R0;
        }
        return null;
    }

    public static final AbstractC1082f0 b(U u10) {
        C3862t.g(u10, "<this>");
        C1071a c1071aA = a(u10);
        if (c1071aA != null) {
            return c1071aA.a1();
        }
        return null;
    }

    public static final boolean c(U u10) {
        C3862t.g(u10, "<this>");
        return u10.R0() instanceof C1113z;
    }

    private static final T d(T t10) {
        U u10;
        Collection<U> collectionS = t10.s();
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(collectionS, 10));
        Iterator<T> it = collectionS.iterator();
        boolean z10 = false;
        while (true) {
            u10 = null;
            if (!it.hasNext()) {
                break;
            }
            U uF = (U) it.next();
            if (M0.l(uF)) {
                uF = f(uF.R0(), false, 1, null);
                z10 = true;
            }
            arrayList.add(uF);
        }
        if (!z10) {
            return null;
        }
        U uI = t10.i();
        if (uI != null) {
            if (M0.l(uI)) {
                uI = f(uI.R0(), false, 1, null);
            }
            u10 = uI;
        }
        return new T(arrayList).o(u10);
    }

    public static final P0 e(P0 p02, boolean z10) {
        C3862t.g(p02, "<this>");
        C1113z c1113zC = C1113z.a.c(C1113z.f5817E, p02, z10, false, 4, null);
        if (c1113zC != null) {
            return c1113zC;
        }
        AbstractC1082f0 abstractC1082f0G = g(p02);
        return abstractC1082f0G != null ? abstractC1082f0G : p02.S0(false);
    }

    public static /* synthetic */ P0 f(P0 p02, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return e(p02, z10);
    }

    private static final AbstractC1082f0 g(U u10) {
        T tD;
        y0 y0VarO0 = u10.O0();
        T t10 = y0VarO0 instanceof T ? (T) y0VarO0 : null;
        if (t10 == null || (tD = d(t10)) == null) {
            return null;
        }
        return tD.g();
    }

    public static final AbstractC1082f0 h(AbstractC1082f0 abstractC1082f0, boolean z10) {
        C3862t.g(abstractC1082f0, "<this>");
        C1113z c1113zC = C1113z.a.c(C1113z.f5817E, abstractC1082f0, z10, false, 4, null);
        if (c1113zC != null) {
            return c1113zC;
        }
        AbstractC1082f0 abstractC1082f0G = g(abstractC1082f0);
        return abstractC1082f0G == null ? abstractC1082f0.S0(false) : abstractC1082f0G;
    }

    public static /* synthetic */ AbstractC1082f0 i(AbstractC1082f0 abstractC1082f0, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return h(abstractC1082f0, z10);
    }

    public static final AbstractC1082f0 j(AbstractC1082f0 abstractC1082f0, AbstractC1082f0 abbreviatedType) {
        C3862t.g(abstractC1082f0, "<this>");
        C3862t.g(abbreviatedType, "abbreviatedType");
        return Y.a(abstractC1082f0) ? abstractC1082f0 : new C1071a(abstractC1082f0, abbreviatedType);
    }

    public static final Ib.i k(Ib.i iVar) {
        C3862t.g(iVar, "<this>");
        return new Ib.i(iVar.X0(), iVar.O0(), iVar.Z0(), iVar.N0(), iVar.P0(), true);
    }
}
