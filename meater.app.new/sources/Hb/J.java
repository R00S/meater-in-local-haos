package Hb;

import java.util.HashSet;
import kotlin.jvm.internal.C3862t;

/* compiled from: expandedTypeUtils.kt */
/* loaded from: classes3.dex */
public final class J {
    public static final Lb.i a(K0 k02, Lb.i inlineClassType) {
        C3862t.g(k02, "<this>");
        C3862t.g(inlineClassType, "inlineClassType");
        return b(k02, inlineClassType, new HashSet());
    }

    private static final Lb.i b(K0 k02, Lb.i iVar, HashSet<Lb.m> hashSet) {
        Lb.i iVarB;
        Lb.i iVarA0;
        Lb.m mVarD0 = k02.d0(iVar);
        if (!hashSet.add(mVarD0)) {
            return null;
        }
        Lb.n nVarX0 = k02.x0(mVarD0);
        if (nVarX0 != null) {
            Lb.i iVarN = k02.n(nVarX0);
            iVarB = b(k02, iVarN, hashSet);
            if (iVarB == null) {
                return null;
            }
            boolean z10 = k02.D0(k02.d0(iVarN)) || ((iVarN instanceof Lb.j) && k02.C0((Lb.j) iVarN));
            if ((iVarB instanceof Lb.j) && k02.C0((Lb.j) iVarB) && k02.l(iVar) && z10) {
                iVarA0 = k02.A0(iVarN);
            } else if (!k02.l(iVarB) && k02.a0(iVar)) {
                iVarA0 = k02.A0(iVarB);
            }
            return iVarA0;
        }
        if (!k02.D0(mVarD0)) {
            return iVar;
        }
        Lb.i iVarE = k02.E(iVar);
        if (iVarE == null || (iVarB = b(k02, iVarE, hashSet)) == null) {
            return null;
        }
        if (k02.l(iVar)) {
            return k02.l(iVarB) ? iVar : ((iVarB instanceof Lb.j) && k02.C0((Lb.j) iVarB)) ? iVar : k02.A0(iVarB);
        }
        return iVarB;
    }
}
