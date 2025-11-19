package Qa;

import Ra.InterfaceC1692e;
import java.util.Collection;
import kotlin.collections.V;
import kotlin.jvm.internal.C3862t;
import tb.C4597i;
import xb.C5087e;

/* compiled from: JavaToKotlinClassMapper.kt */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f14596a = new d();

    private d() {
    }

    public static /* synthetic */ InterfaceC1692e f(d dVar, qb.c cVar, Oa.j jVar, Integer num, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            num = null;
        }
        return dVar.e(cVar, jVar, num);
    }

    public final InterfaceC1692e a(InterfaceC1692e mutable) {
        C3862t.g(mutable, "mutable");
        qb.c cVarO = c.f14576a.o(C4597i.m(mutable));
        if (cVarO != null) {
            InterfaceC1692e interfaceC1692eO = C5087e.m(mutable).o(cVarO);
            C3862t.f(interfaceC1692eO, "getBuiltInClassByFqName(...)");
            return interfaceC1692eO;
        }
        throw new IllegalArgumentException("Given class " + mutable + " is not a mutable collection");
    }

    public final InterfaceC1692e b(InterfaceC1692e readOnly) {
        C3862t.g(readOnly, "readOnly");
        qb.c cVarP = c.f14576a.p(C4597i.m(readOnly));
        if (cVarP != null) {
            InterfaceC1692e interfaceC1692eO = C5087e.m(readOnly).o(cVarP);
            C3862t.f(interfaceC1692eO, "getBuiltInClassByFqName(...)");
            return interfaceC1692eO;
        }
        throw new IllegalArgumentException("Given class " + readOnly + " is not a read-only collection");
    }

    public final boolean c(InterfaceC1692e mutable) {
        C3862t.g(mutable, "mutable");
        return c.f14576a.k(C4597i.m(mutable));
    }

    public final boolean d(InterfaceC1692e readOnly) {
        C3862t.g(readOnly, "readOnly");
        return c.f14576a.l(C4597i.m(readOnly));
    }

    public final InterfaceC1692e e(qb.c fqName, Oa.j builtIns, Integer num) {
        C3862t.g(fqName, "fqName");
        C3862t.g(builtIns, "builtIns");
        qb.b bVarM = (num == null || !C3862t.b(fqName, c.f14576a.h())) ? c.f14576a.m(fqName) : Oa.p.a(num.intValue());
        if (bVarM != null) {
            return builtIns.o(bVarM.a());
        }
        return null;
    }

    public final Collection<InterfaceC1692e> g(qb.c fqName, Oa.j builtIns) {
        C3862t.g(fqName, "fqName");
        C3862t.g(builtIns, "builtIns");
        InterfaceC1692e interfaceC1692eF = f(this, fqName, builtIns, null, 4, null);
        if (interfaceC1692eF == null) {
            return V.d();
        }
        qb.c cVarP = c.f14576a.p(C5087e.p(interfaceC1692eF));
        return cVarP == null ? V.c(interfaceC1692eF) : kotlin.collections.r.p(interfaceC1692eF, builtIns.o(cVarP));
    }
}
