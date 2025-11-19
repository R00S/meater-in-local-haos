package Jb;

import Hb.H0;
import Hb.J0;
import Ra.C1706t;
import Ra.E;
import Ra.EnumC1693f;
import Ra.H;
import Ra.InterfaceC1692e;
import Ra.h0;
import Ua.C1770i;
import Ua.C1772k;
import java.util.List;
import kotlin.collections.V;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;

/* compiled from: ErrorClassDescriptor.kt */
/* loaded from: classes3.dex */
public final class a extends C1772k {
    /* JADX WARN: Illegal instructions before constructor call */
    public a(qb.f name) {
        C3862t.g(name, "name");
        l lVar = l.f7791a;
        H hI = lVar.i();
        E e10 = E.f15108E;
        EnumC1693f enumC1693f = EnumC1693f.f15143C;
        List listM = r.m();
        h0 h0Var = h0.f15158a;
        super(hI, name, e10, enumC1693f, listM, h0Var, false, Gb.f.f4998e);
        C1770i c1770iO1 = C1770i.o1(this, Sa.h.f15630e.b(), true, h0Var);
        c1770iO1.r1(r.m(), C1706t.f15169d);
        C3862t.f(c1770iO1, "apply(...)");
        Ab.k kVarB = l.b(h.f7688K, c1770iO1.getName().toString(), "");
        k kVar = k.f7741U0;
        c1770iO1.h1(new i(lVar.e(kVar, new String[0]), kVarB, kVar, null, false, new String[0], 24, null));
        L0(kVarB, V.c(c1770iO1), c1770iO1);
    }

    @Override // Ua.AbstractC1762a, Ra.j0
    /* renamed from: F0 */
    public InterfaceC1692e d(J0 substitutor) {
        C3862t.g(substitutor, "substitutor");
        return this;
    }

    @Override // Ua.AbstractC1762a, Ua.z
    public Ab.k H(H0 typeSubstitution, Ib.g kotlinTypeRefiner) {
        C3862t.g(typeSubstitution, "typeSubstitution");
        C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return l.b(h.f7688K, getName().toString(), typeSubstitution.toString());
    }

    @Override // Ua.C1772k
    public String toString() {
        String strJ = getName().j();
        C3862t.f(strJ, "asString(...)");
        return strJ;
    }
}
