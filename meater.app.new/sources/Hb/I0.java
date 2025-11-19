package Hb;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3862t;

/* compiled from: TypeSubstitution.kt */
/* loaded from: classes3.dex */
public final class I0 {
    public static final AbstractC1082f0 a(U u10) {
        C3862t.g(u10, "<this>");
        P0 p0R0 = u10.R0();
        AbstractC1082f0 abstractC1082f0 = p0R0 instanceof AbstractC1082f0 ? (AbstractC1082f0) p0R0 : null;
        if (abstractC1082f0 != null) {
            return abstractC1082f0;
        }
        throw new IllegalStateException(("This is should be simple type: " + u10).toString());
    }

    public static final U b(U u10, List<? extends E0> newArguments, Sa.h newAnnotations) {
        C3862t.g(u10, "<this>");
        C3862t.g(newArguments, "newArguments");
        C3862t.g(newAnnotations, "newAnnotations");
        return e(u10, newArguments, newAnnotations, null, 4, null);
    }

    public static final U c(U u10, List<? extends E0> newArguments, Sa.h newAnnotations, List<? extends E0> newArgumentsForUpperBound) {
        C3862t.g(u10, "<this>");
        C3862t.g(newArguments, "newArguments");
        C3862t.g(newAnnotations, "newAnnotations");
        C3862t.g(newArgumentsForUpperBound, "newArgumentsForUpperBound");
        if ((newArguments.isEmpty() || newArguments == u10.M0()) && newAnnotations == u10.getAnnotations()) {
            return u10;
        }
        u0 u0VarN0 = u10.N0();
        if ((newAnnotations instanceof Sa.p) && ((Sa.p) newAnnotations).isEmpty()) {
            newAnnotations = Sa.h.f15630e.b();
        }
        u0 u0VarA = v0.a(u0VarN0, newAnnotations);
        P0 p0R0 = u10.R0();
        if (p0R0 instanceof K) {
            K k10 = (K) p0R0;
            return X.e(d(k10.W0(), newArguments, u0VarA), d(k10.X0(), newArgumentsForUpperBound, u0VarA));
        }
        if (p0R0 instanceof AbstractC1082f0) {
            return d((AbstractC1082f0) p0R0, newArguments, u0VarA);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final AbstractC1082f0 d(AbstractC1082f0 abstractC1082f0, List<? extends E0> newArguments, u0 newAttributes) {
        C3862t.g(abstractC1082f0, "<this>");
        C3862t.g(newArguments, "newArguments");
        C3862t.g(newAttributes, "newAttributes");
        return (newArguments.isEmpty() && newAttributes == abstractC1082f0.N0()) ? abstractC1082f0 : newArguments.isEmpty() ? abstractC1082f0.U0(newAttributes) : abstractC1082f0 instanceof Jb.i ? ((Jb.i) abstractC1082f0).a1(newArguments) : X.k(newAttributes, abstractC1082f0.O0(), newArguments, abstractC1082f0.P0(), null, 16, null);
    }

    public static /* synthetic */ U e(U u10, List list, Sa.h hVar, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = u10.M0();
        }
        if ((i10 & 2) != 0) {
            hVar = u10.getAnnotations();
        }
        if ((i10 & 4) != 0) {
            list2 = list;
        }
        return c(u10, list, hVar, list2);
    }

    public static /* synthetic */ AbstractC1082f0 f(AbstractC1082f0 abstractC1082f0, List list, u0 u0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = abstractC1082f0.M0();
        }
        if ((i10 & 2) != 0) {
            u0Var = abstractC1082f0.N0();
        }
        return d(abstractC1082f0, list, u0Var);
    }
}
