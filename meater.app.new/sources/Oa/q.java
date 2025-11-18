package Oa;

import Hb.AbstractC1082f0;
import Hb.E0;
import Hb.Q0;
import Hb.X;
import Hb.u0;
import Hb.y0;
import Ra.C1706t;
import Ra.E;
import Ra.EnumC1693f;
import Ra.h0;
import Ua.C1777p;
import Ua.G;
import Ua.U;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: suspendFunctionTypes.kt */
/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private static final G f13493a;

    static {
        C1777p c1777p = new C1777p(Jb.l.f7791a.i(), p.f13392s);
        EnumC1693f enumC1693f = EnumC1693f.f15144D;
        qb.f fVarG = p.f13395v.g();
        h0 h0Var = h0.f15158a;
        Gb.n nVar = Gb.f.f4998e;
        G g10 = new G(c1777p, enumC1693f, false, false, fVarG, h0Var, nVar);
        g10.N0(E.f15109F);
        g10.P0(C1706t.f15170e);
        g10.O0(kotlin.collections.r.e(U.S0(g10, Sa.h.f15630e.b(), false, Q0.f5694G, qb.f.t("T"), 0, nVar)));
        g10.L0();
        f13493a = g10;
    }

    public static final AbstractC1082f0 a(Hb.U suspendFunType) {
        C3862t.g(suspendFunType, "suspendFunType");
        i.r(suspendFunType);
        j jVarN = Mb.d.n(suspendFunType);
        Sa.h annotations = suspendFunType.getAnnotations();
        Hb.U uK = i.k(suspendFunType);
        List<Hb.U> listE = i.e(suspendFunType);
        List<E0> listM = i.m(suspendFunType);
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(listM, 10));
        Iterator<T> it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(((E0) it.next()).a());
        }
        u0 u0VarJ = u0.f5791C.j();
        y0 y0VarL = f13493a.l();
        C3862t.f(y0VarL, "getTypeConstructor(...)");
        List listG0 = kotlin.collections.r.G0(arrayList, X.k(u0VarJ, y0VarL, kotlin.collections.r.e(Mb.d.d(i.l(suspendFunType))), false, null, 16, null));
        AbstractC1082f0 abstractC1082f0I = Mb.d.n(suspendFunType).I();
        C3862t.f(abstractC1082f0I, "getNullableAnyType(...)");
        return i.b(jVarN, annotations, uK, listE, listG0, null, abstractC1082f0I, (128 & 128) != 0 ? false : false).S0(suspendFunType.P0());
    }
}
