package Oa;

import Hb.AbstractC1082f0;
import Hb.E0;
import Hb.U;
import Hb.X;
import Hb.v0;
import Oa.p;
import Pa.f;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1700m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.M;
import kotlin.jvm.internal.C3862t;
import oa.v;
import vb.AbstractC4943g;
import vb.y;
import xb.C5087e;

/* compiled from: functionTypes.kt */
/* loaded from: classes3.dex */
public final class i {
    public static final int a(U u10) {
        C3862t.g(u10, "<this>");
        Sa.c cVarO = u10.getAnnotations().o(p.a.f13406D);
        if (cVarO == null) {
            return 0;
        }
        AbstractC4943g abstractC4943g = (AbstractC4943g) M.i(cVarO.b(), p.f13390q);
        C3862t.e(abstractC4943g, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((vb.n) abstractC4943g).b().intValue();
    }

    public static final AbstractC1082f0 b(j builtIns, Sa.h annotations, U u10, List<? extends U> contextReceiverTypes, List<? extends U> parameterTypes, List<qb.f> list, U returnType, boolean z10) {
        C3862t.g(builtIns, "builtIns");
        C3862t.g(annotations, "annotations");
        C3862t.g(contextReceiverTypes, "contextReceiverTypes");
        C3862t.g(parameterTypes, "parameterTypes");
        C3862t.g(returnType, "returnType");
        List<E0> listG = g(u10, contextReceiverTypes, parameterTypes, list, returnType, builtIns);
        InterfaceC1692e interfaceC1692eF = f(builtIns, parameterTypes.size() + contextReceiverTypes.size() + (u10 == null ? 0 : 1), z10);
        if (u10 != null) {
            annotations = u(annotations, builtIns);
        }
        if (!contextReceiverTypes.isEmpty()) {
            annotations = t(annotations, builtIns, contextReceiverTypes.size());
        }
        return X.h(v0.b(annotations), interfaceC1692eF, listG);
    }

    public static final qb.f d(U u10) {
        String strB;
        C3862t.g(u10, "<this>");
        Sa.c cVarO = u10.getAnnotations().o(p.a.f13408E);
        if (cVarO == null) {
            return null;
        }
        Object objK0 = kotlin.collections.r.K0(cVarO.b().values());
        y yVar = objK0 instanceof y ? (y) objK0 : null;
        if (yVar != null && (strB = yVar.b()) != null) {
            if (!qb.f.v(strB)) {
                strB = null;
            }
            if (strB != null) {
                return qb.f.t(strB);
            }
        }
        return null;
    }

    public static final List<U> e(U u10) {
        C3862t.g(u10, "<this>");
        p(u10);
        int iA = a(u10);
        if (iA == 0) {
            return kotlin.collections.r.m();
        }
        List<E0> listSubList = u10.M0().subList(0, iA);
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(listSubList, 10));
        Iterator<T> it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((E0) it.next()).a());
        }
        return arrayList;
    }

    public static final InterfaceC1692e f(j builtIns, int i10, boolean z10) {
        C3862t.g(builtIns, "builtIns");
        InterfaceC1692e interfaceC1692eX = z10 ? builtIns.X(i10) : builtIns.C(i10);
        C3862t.d(interfaceC1692eX);
        return interfaceC1692eX;
    }

    public static final List<E0> g(U u10, List<? extends U> contextReceiverTypes, List<? extends U> parameterTypes, List<qb.f> list, U returnType, j builtIns) {
        qb.f fVar;
        C3862t.g(contextReceiverTypes, "contextReceiverTypes");
        C3862t.g(parameterTypes, "parameterTypes");
        C3862t.g(returnType, "returnType");
        C3862t.g(builtIns, "builtIns");
        int i10 = 0;
        ArrayList arrayList = new ArrayList(parameterTypes.size() + contextReceiverTypes.size() + (u10 != null ? 1 : 0) + 1);
        List<? extends U> list2 = contextReceiverTypes;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.r.x(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(Mb.d.d((U) it.next()));
        }
        arrayList.addAll(arrayList2);
        Rb.a.a(arrayList, u10 != null ? Mb.d.d(u10) : null);
        for (Object obj : parameterTypes) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kotlin.collections.r.w();
            }
            U uC = (U) obj;
            if (list == null || (fVar = list.get(i10)) == null || fVar.u()) {
                fVar = null;
            }
            if (fVar != null) {
                qb.c cVar = p.a.f13408E;
                qb.f fVar2 = p.f13386m;
                String strJ = fVar.j();
                C3862t.f(strJ, "asString(...)");
                uC = Mb.d.C(uC, Sa.h.f15630e.a(kotlin.collections.r.E0(uC.getAnnotations(), new Sa.l(builtIns, cVar, M.e(v.a(fVar2, new y(strJ))), false, 8, null))));
            }
            arrayList.add(Mb.d.d(uC));
            i10 = i11;
        }
        arrayList.add(Mb.d.d(returnType));
        return arrayList;
    }

    public static final Pa.f h(U u10) {
        C3862t.g(u10, "<this>");
        InterfaceC1695h interfaceC1695hT = u10.O0().t();
        if (interfaceC1695hT != null) {
            return i(interfaceC1695hT);
        }
        return null;
    }

    public static final Pa.f i(InterfaceC1700m interfaceC1700m) {
        C3862t.g(interfaceC1700m, "<this>");
        if ((interfaceC1700m instanceof InterfaceC1692e) && j.B0(interfaceC1700m)) {
            return j(C5087e.p(interfaceC1700m));
        }
        return null;
    }

    private static final Pa.f j(qb.d dVar) {
        if (!dVar.f() || dVar.e()) {
            return null;
        }
        Pa.g gVarA = Pa.g.f14169c.a();
        qb.c cVarE = dVar.l().e();
        C3862t.f(cVarE, "parent(...)");
        String strJ = dVar.i().j();
        C3862t.f(strJ, "asString(...)");
        return gVarA.b(cVarE, strJ);
    }

    public static final U k(U u10) {
        C3862t.g(u10, "<this>");
        p(u10);
        if (!s(u10)) {
            return null;
        }
        return u10.M0().get(a(u10)).a();
    }

    public static final U l(U u10) {
        C3862t.g(u10, "<this>");
        p(u10);
        U uA = ((E0) kotlin.collections.r.u0(u10.M0())).a();
        C3862t.f(uA, "getType(...)");
        return uA;
    }

    public static final List<E0> m(U u10) {
        C3862t.g(u10, "<this>");
        p(u10);
        return u10.M0().subList(a(u10) + (n(u10) ? 1 : 0), r0.size() - 1);
    }

    public static final boolean n(U u10) {
        C3862t.g(u10, "<this>");
        return p(u10) && s(u10);
    }

    public static final boolean o(InterfaceC1700m interfaceC1700m) {
        C3862t.g(interfaceC1700m, "<this>");
        Pa.f fVarI = i(interfaceC1700m);
        return C3862t.b(fVarI, f.a.f14165e) || C3862t.b(fVarI, f.d.f14168e);
    }

    public static final boolean p(U u10) {
        C3862t.g(u10, "<this>");
        InterfaceC1695h interfaceC1695hT = u10.O0().t();
        return interfaceC1695hT != null && o(interfaceC1695hT);
    }

    public static final boolean q(U u10) {
        C3862t.g(u10, "<this>");
        return C3862t.b(h(u10), f.a.f14165e);
    }

    public static final boolean r(U u10) {
        C3862t.g(u10, "<this>");
        return C3862t.b(h(u10), f.d.f14168e);
    }

    private static final boolean s(U u10) {
        return u10.getAnnotations().o(p.a.f13404C) != null;
    }

    public static final Sa.h t(Sa.h hVar, j builtIns, int i10) {
        C3862t.g(hVar, "<this>");
        C3862t.g(builtIns, "builtIns");
        qb.c cVar = p.a.f13406D;
        return hVar.P(cVar) ? hVar : Sa.h.f15630e.a(kotlin.collections.r.E0(hVar, new Sa.l(builtIns, cVar, M.e(v.a(p.f13390q, new vb.n(i10))), false, 8, null)));
    }

    public static final Sa.h u(Sa.h hVar, j builtIns) {
        C3862t.g(hVar, "<this>");
        C3862t.g(builtIns, "builtIns");
        qb.c cVar = p.a.f13404C;
        return hVar.P(cVar) ? hVar : Sa.h.f15630e.a(kotlin.collections.r.E0(hVar, new Sa.l(builtIns, cVar, M.h(), false, 8, null)));
    }
}
