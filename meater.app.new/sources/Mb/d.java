package Mb;

import Ba.l;
import Hb.AbstractC1079e;
import Hb.AbstractC1082f0;
import Hb.C1096m0;
import Hb.C1100o0;
import Hb.C1113z;
import Hb.E0;
import Hb.G0;
import Hb.I0;
import Hb.K;
import Hb.M0;
import Hb.O0;
import Hb.P0;
import Hb.Q0;
import Hb.U;
import Hb.X;
import Hb.v0;
import Hb.y0;
import Ib.e;
import Jb.i;
import Oa.j;
import Ra.EnumC1693f;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1696i;
import Ra.l0;
import Ra.m0;
import Sa.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.IndexedValue;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;

/* compiled from: TypeUtils.kt */
/* loaded from: classes3.dex */
public final class d {
    public static final U A(U u10) {
        C3862t.g(u10, "<this>");
        U uN = M0.n(u10);
        C3862t.f(uN, "makeNotNullable(...)");
        return uN;
    }

    public static final U B(U u10) {
        C3862t.g(u10, "<this>");
        U uO = M0.o(u10);
        C3862t.f(uO, "makeNullable(...)");
        return uO;
    }

    public static final U C(U u10, h newAnnotations) {
        C3862t.g(u10, "<this>");
        C3862t.g(newAnnotations, "newAnnotations");
        return (u10.getAnnotations().isEmpty() && newAnnotations.isEmpty()) ? u10 : u10.R0().U0(v0.a(u10.N0(), newAnnotations));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [Hb.P0] */
    public static final U D(U u10) {
        AbstractC1082f0 abstractC1082f0F;
        C3862t.g(u10, "<this>");
        P0 p0R0 = u10.R0();
        if (p0R0 instanceof K) {
            K k10 = (K) p0R0;
            AbstractC1082f0 abstractC1082f0W0 = k10.W0();
            if (!abstractC1082f0W0.O0().getParameters().isEmpty() && abstractC1082f0W0.O0().t() != null) {
                List<m0> parameters = abstractC1082f0W0.O0().getParameters();
                C3862t.f(parameters, "getParameters(...)");
                List<m0> list = parameters;
                ArrayList arrayList = new ArrayList(r.x(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C1096m0((m0) it.next()));
                }
                abstractC1082f0W0 = I0.f(abstractC1082f0W0, arrayList, null, 2, null);
            }
            AbstractC1082f0 abstractC1082f0X0 = k10.X0();
            if (!abstractC1082f0X0.O0().getParameters().isEmpty() && abstractC1082f0X0.O0().t() != null) {
                List<m0> parameters2 = abstractC1082f0X0.O0().getParameters();
                C3862t.f(parameters2, "getParameters(...)");
                List<m0> list2 = parameters2;
                ArrayList arrayList2 = new ArrayList(r.x(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C1096m0((m0) it2.next()));
                }
                abstractC1082f0X0 = I0.f(abstractC1082f0X0, arrayList2, null, 2, null);
            }
            abstractC1082f0F = X.e(abstractC1082f0W0, abstractC1082f0X0);
        } else {
            if (!(p0R0 instanceof AbstractC1082f0)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC1082f0 abstractC1082f0 = (AbstractC1082f0) p0R0;
            boolean zIsEmpty = abstractC1082f0.O0().getParameters().isEmpty();
            abstractC1082f0F = abstractC1082f0;
            if (!zIsEmpty) {
                InterfaceC1695h interfaceC1695hT = abstractC1082f0.O0().t();
                abstractC1082f0F = abstractC1082f0;
                if (interfaceC1695hT != null) {
                    List<m0> parameters3 = abstractC1082f0.O0().getParameters();
                    C3862t.f(parameters3, "getParameters(...)");
                    List<m0> list3 = parameters3;
                    ArrayList arrayList3 = new ArrayList(r.x(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new C1096m0((m0) it3.next()));
                    }
                    abstractC1082f0F = I0.f(abstractC1082f0, arrayList3, null, 2, null);
                }
            }
        }
        return O0.b(abstractC1082f0F, p0R0);
    }

    public static final boolean E(U u10) {
        C3862t.g(u10, "<this>");
        return e(u10, c.f12192B);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean F(P0 it) {
        C3862t.g(it, "it");
        InterfaceC1695h interfaceC1695hT = it.O0().t();
        if (interfaceC1695hT != null) {
            return (interfaceC1695hT instanceof l0) || (interfaceC1695hT instanceof m0);
        }
        return false;
    }

    public static final E0 d(U u10) {
        C3862t.g(u10, "<this>");
        return new G0(u10);
    }

    public static final boolean e(U u10, l<? super P0, Boolean> predicate) {
        C3862t.g(u10, "<this>");
        C3862t.g(predicate, "predicate");
        return M0.c(u10, predicate);
    }

    private static final boolean f(U u10, y0 y0Var, Set<? extends m0> set) {
        boolean zF;
        if (C3862t.b(u10.O0(), y0Var)) {
            return true;
        }
        InterfaceC1695h interfaceC1695hT = u10.O0().t();
        InterfaceC1696i interfaceC1696i = interfaceC1695hT instanceof InterfaceC1696i ? (InterfaceC1696i) interfaceC1695hT : null;
        List<m0> listW = interfaceC1696i != null ? interfaceC1696i.w() : null;
        Iterable<IndexedValue> iterableD1 = r.d1(u10.M0());
        if (!(iterableD1 instanceof Collection) || !((Collection) iterableD1).isEmpty()) {
            for (IndexedValue indexedValue : iterableD1) {
                int index = indexedValue.getIndex();
                E0 e02 = (E0) indexedValue.b();
                m0 m0Var = listW != null ? (m0) r.m0(listW, index) : null;
                if ((m0Var == null || set == null || !set.contains(m0Var)) && !e02.c()) {
                    U uA = e02.a();
                    C3862t.f(uA, "getType(...)");
                    zF = f(uA, y0Var, set);
                } else {
                    zF = false;
                }
                if (zF) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean g(U u10) {
        C3862t.g(u10, "<this>");
        return e(u10, b.f12191B);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(P0 it) {
        C3862t.g(it, "it");
        InterfaceC1695h interfaceC1695hT = it.O0().t();
        if (interfaceC1695hT != null) {
            return x(interfaceC1695hT);
        }
        return false;
    }

    public static final boolean i(U u10) {
        C3862t.g(u10, "<this>");
        return M0.c(u10, a.f12190B);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean j(P0 p02) {
        return Boolean.valueOf(M0.m(p02));
    }

    public static final E0 k(U type, Q0 projectionKind, m0 m0Var) {
        C3862t.g(type, "type");
        C3862t.g(projectionKind, "projectionKind");
        if ((m0Var != null ? m0Var.p() : null) == projectionKind) {
            projectionKind = Q0.f5693F;
        }
        return new G0(projectionKind, type);
    }

    public static final Set<m0> l(U u10, Set<? extends m0> set) {
        C3862t.g(u10, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m(u10, u10, linkedHashSet, set);
        return linkedHashSet;
    }

    private static final void m(U u10, U u11, Set<m0> set, Set<? extends m0> set2) {
        InterfaceC1695h interfaceC1695hT = u10.O0().t();
        if (interfaceC1695hT instanceof m0) {
            if (!C3862t.b(u10.O0(), u11.O0())) {
                set.add(interfaceC1695hT);
                return;
            }
            for (U u12 : ((m0) interfaceC1695hT).getUpperBounds()) {
                C3862t.d(u12);
                m(u12, u11, set, set2);
            }
            return;
        }
        InterfaceC1695h interfaceC1695hT2 = u10.O0().t();
        InterfaceC1696i interfaceC1696i = interfaceC1695hT2 instanceof InterfaceC1696i ? (InterfaceC1696i) interfaceC1695hT2 : null;
        List<m0> listW = interfaceC1696i != null ? interfaceC1696i.w() : null;
        int i10 = 0;
        for (E0 e02 : u10.M0()) {
            int i11 = i10 + 1;
            m0 m0Var = listW != null ? (m0) r.m0(listW, i10) : null;
            if ((m0Var == null || set2 == null || !set2.contains(m0Var)) && !e02.c() && !r.a0(set, e02.a().O0().t()) && !C3862t.b(e02.a().O0(), u11.O0())) {
                U uA = e02.a();
                C3862t.f(uA, "getType(...)");
                m(uA, u11, set, set2);
            }
            i10 = i11;
        }
    }

    public static final j n(U u10) {
        C3862t.g(u10, "<this>");
        j jVarQ = u10.O0().q();
        C3862t.f(jVarQ, "getBuiltIns(...)");
        return jVarQ;
    }

    public static final U o(m0 m0Var) {
        Object obj;
        C3862t.g(m0Var, "<this>");
        List<U> upperBounds = m0Var.getUpperBounds();
        C3862t.f(upperBounds, "getUpperBounds(...)");
        upperBounds.isEmpty();
        List<U> upperBounds2 = m0Var.getUpperBounds();
        C3862t.f(upperBounds2, "getUpperBounds(...)");
        Iterator<T> it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC1695h interfaceC1695hT = ((U) next).O0().t();
            InterfaceC1692e interfaceC1692e = interfaceC1695hT instanceof InterfaceC1692e ? (InterfaceC1692e) interfaceC1695hT : null;
            if (interfaceC1692e != null && interfaceC1692e.i() != EnumC1693f.f15144D && interfaceC1692e.i() != EnumC1693f.f15147G) {
                obj = next;
                break;
            }
        }
        U u10 = (U) obj;
        if (u10 != null) {
            return u10;
        }
        List<U> upperBounds3 = m0Var.getUpperBounds();
        C3862t.f(upperBounds3, "getUpperBounds(...)");
        Object objJ0 = r.j0(upperBounds3);
        C3862t.f(objJ0, "first(...)");
        return (U) objJ0;
    }

    public static final boolean p(m0 typeParameter) {
        C3862t.g(typeParameter, "typeParameter");
        return r(typeParameter, null, null, 6, null);
    }

    public static final boolean q(m0 typeParameter, y0 y0Var, Set<? extends m0> set) {
        C3862t.g(typeParameter, "typeParameter");
        List<U> upperBounds = typeParameter.getUpperBounds();
        C3862t.f(upperBounds, "getUpperBounds(...)");
        List<U> list = upperBounds;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (U u10 : list) {
            C3862t.d(u10);
            if (f(u10, typeParameter.u().O0(), set) && (y0Var == null || C3862t.b(u10.O0(), y0Var))) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean r(m0 m0Var, y0 y0Var, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            y0Var = null;
        }
        if ((i10 & 4) != 0) {
            set = null;
        }
        return q(m0Var, y0Var, set);
    }

    public static final boolean s(U u10) {
        C3862t.g(u10, "<this>");
        return j.f0(u10);
    }

    public static final boolean t(U u10) {
        C3862t.g(u10, "<this>");
        return j.n0(u10);
    }

    public static final boolean u(U u10) {
        C3862t.g(u10, "<this>");
        return (u10 instanceof AbstractC1079e) || ((u10 instanceof C1113z) && (((C1113z) u10).a1() instanceof AbstractC1079e));
    }

    public static final boolean v(U u10) {
        C3862t.g(u10, "<this>");
        return (u10 instanceof C1100o0) || ((u10 instanceof C1113z) && (((C1113z) u10).a1() instanceof C1100o0));
    }

    public static final boolean w(U u10, U superType) {
        C3862t.g(u10, "<this>");
        C3862t.g(superType, "superType");
        return e.f6980a.b(u10, superType);
    }

    public static final boolean x(InterfaceC1695h interfaceC1695h) {
        C3862t.g(interfaceC1695h, "<this>");
        return (interfaceC1695h instanceof m0) && (((m0) interfaceC1695h).c() instanceof l0);
    }

    public static final boolean y(U u10) {
        C3862t.g(u10, "<this>");
        return M0.m(u10);
    }

    public static final boolean z(U type) {
        C3862t.g(type, "type");
        return (type instanceof i) && ((i) type).Y0().n();
    }
}
