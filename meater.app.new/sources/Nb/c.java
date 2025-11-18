package Nb;

import Hb.AbstractC1082f0;
import Hb.E0;
import Hb.G0;
import Hb.I0;
import Hb.J0;
import Hb.M0;
import Hb.N;
import Hb.O0;
import Hb.P0;
import Hb.Q0;
import Hb.U;
import Hb.X;
import Hb.y0;
import Hb.z0;
import Oa.j;
import Ra.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import oa.C4170o;
import ub.C4703e;
import ub.InterfaceC4700b;
import xb.C5087e;

/* compiled from: CapturedTypeApproximation.kt */
/* loaded from: classes3.dex */
public final class c {

    /* compiled from: CapturedTypeApproximation.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12592a;

        static {
            int[] iArr = new int[Q0.values().length];
            try {
                iArr[Q0.f5693F.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Q0.f5694G.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Q0.f5695H.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f12592a = iArr;
        }
    }

    /* compiled from: CapturedTypeApproximation.kt */
    public static final class b extends z0 {
        b() {
        }

        @Override // Hb.z0
        public E0 k(y0 key) {
            C3862t.g(key, "key");
            InterfaceC4700b interfaceC4700b = key instanceof InterfaceC4700b ? (InterfaceC4700b) key : null;
            if (interfaceC4700b == null) {
                return null;
            }
            return interfaceC4700b.b().c() ? new G0(Q0.f5695H, interfaceC4700b.b().a()) : interfaceC4700b.b();
        }
    }

    public static final Nb.a<U> b(U type) {
        Object objG;
        C3862t.g(type, "type");
        if (N.b(type)) {
            Nb.a<U> aVarB = b(N.c(type));
            Nb.a<U> aVarB2 = b(N.d(type));
            return new Nb.a<>(O0.b(X.e(N.c(aVarB.c()), N.d(aVarB2.c())), type), O0.b(X.e(N.c(aVarB.d()), N.d(aVarB2.d())), type));
        }
        y0 y0VarO0 = type.O0();
        if (C4703e.f(type)) {
            C3862t.e(y0VarO0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            E0 e0B = ((InterfaceC4700b) y0VarO0).b();
            U uA = e0B.a();
            C3862t.f(uA, "getType(...)");
            U uC = c(uA, type);
            int i10 = a.f12592a[e0B.b().ordinal()];
            if (i10 == 2) {
                return new Nb.a<>(uC, Mb.d.n(type).I());
            }
            if (i10 == 3) {
                AbstractC1082f0 abstractC1082f0H = Mb.d.n(type).H();
                C3862t.f(abstractC1082f0H, "getNothingType(...)");
                return new Nb.a<>(c(abstractC1082f0H, type), uC);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + e0B);
        }
        if (type.M0().isEmpty() || type.M0().size() != y0VarO0.getParameters().size()) {
            return new Nb.a<>(type, type);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<E0> listM0 = type.M0();
        List<m0> parameters = y0VarO0.getParameters();
        C3862t.f(parameters, "getParameters(...)");
        for (C4170o c4170o : r.e1(listM0, parameters)) {
            E0 e02 = (E0) c4170o.a();
            m0 m0Var = (m0) c4170o.b();
            C3862t.d(m0Var);
            d dVarI = i(e02, m0Var);
            if (e02.c()) {
                arrayList.add(dVarI);
                arrayList2.add(dVarI);
            } else {
                Nb.a<d> aVarF = f(dVarI);
                d dVarA = aVarF.a();
                d dVarB = aVarF.b();
                arrayList.add(dVarA);
                arrayList2.add(dVarB);
            }
        }
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!((d) it.next()).d()) {
                    z10 = true;
                    break;
                }
            }
        }
        if (z10) {
            objG = Mb.d.n(type).H();
            C3862t.f(objG, "getNothingType(...)");
        } else {
            objG = g(type, arrayList);
        }
        return new Nb.a<>(objG, g(type, arrayList2));
    }

    private static final U c(U u10, U u11) {
        U uQ = M0.q(u10, u11.P0());
        C3862t.f(uQ, "makeNullableIfNeeded(...)");
        return uQ;
    }

    public static final E0 d(E0 e02, boolean z10) {
        if (e02 == null) {
            return null;
        }
        if (e02.c()) {
            return e02;
        }
        U uA = e02.a();
        C3862t.f(uA, "getType(...)");
        if (!M0.c(uA, Nb.b.f12591B)) {
            return e02;
        }
        Q0 q0B = e02.b();
        C3862t.f(q0B, "getProjectionKind(...)");
        return q0B == Q0.f5695H ? new G0(q0B, b(uA).d()) : z10 ? new G0(q0B, b(uA).c()) : h(e02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean e(P0 p02) {
        C3862t.d(p02);
        return Boolean.valueOf(C4703e.f(p02));
    }

    private static final Nb.a<d> f(d dVar) {
        Nb.a<U> aVarB = b(dVar.a());
        U uA = aVarB.a();
        U uB = aVarB.b();
        Nb.a<U> aVarB2 = b(dVar.b());
        return new Nb.a<>(new d(dVar.c(), uB, aVarB2.a()), new d(dVar.c(), uA, aVarB2.b()));
    }

    private static final U g(U u10, List<d> list) {
        u10.M0().size();
        list.size();
        List<d> list2 = list;
        ArrayList arrayList = new ArrayList(r.x(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(j((d) it.next()));
        }
        return I0.e(u10, arrayList, null, null, 6, null);
    }

    private static final E0 h(E0 e02) {
        J0 j0G = J0.g(new b());
        C3862t.f(j0G, "create(...)");
        return j0G.t(e02);
    }

    private static final d i(E0 e02, m0 m0Var) {
        int i10 = a.f12592a[J0.c(m0Var.p(), e02).ordinal()];
        if (i10 == 1) {
            U uA = e02.a();
            C3862t.f(uA, "getType(...)");
            U uA2 = e02.a();
            C3862t.f(uA2, "getType(...)");
            return new d(m0Var, uA, uA2);
        }
        if (i10 == 2) {
            U uA3 = e02.a();
            C3862t.f(uA3, "getType(...)");
            AbstractC1082f0 abstractC1082f0I = C5087e.m(m0Var).I();
            C3862t.f(abstractC1082f0I, "getNullableAnyType(...)");
            return new d(m0Var, uA3, abstractC1082f0I);
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC1082f0 abstractC1082f0H = C5087e.m(m0Var).H();
        C3862t.f(abstractC1082f0H, "getNothingType(...)");
        U uA4 = e02.a();
        C3862t.f(uA4, "getType(...)");
        return new d(m0Var, abstractC1082f0H, uA4);
    }

    private static final E0 j(d dVar) {
        dVar.d();
        if (!C3862t.b(dVar.a(), dVar.b())) {
            Q0 q0P = dVar.c().p();
            Q0 q02 = Q0.f5694G;
            if (q0P != q02) {
                return (!j.n0(dVar.a()) || dVar.c().p() == q02) ? j.p0(dVar.b()) ? new G0(k(dVar, q02), dVar.a()) : new G0(k(dVar, Q0.f5695H), dVar.b()) : new G0(k(dVar, Q0.f5695H), dVar.b());
            }
        }
        return new G0(dVar.a());
    }

    private static final Q0 k(d dVar, Q0 q02) {
        return q02 == dVar.c().p() ? Q0.f5693F : q02;
    }
}
