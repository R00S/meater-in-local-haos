package Hb;

import Ab.k;
import Hb.InterfaceC1105r0;
import Ra.InterfaceC1695h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: TypeAliasExpander.kt */
/* renamed from: Hb.p0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1102p0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f5771c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final C1102p0 f5772d = new C1102p0(InterfaceC1105r0.a.f5787a, false);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1105r0 f5773a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f5774b;

    /* compiled from: TypeAliasExpander.kt */
    /* renamed from: Hb.p0$a */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(int i10, Ra.l0 l0Var) {
            if (i10 <= 100) {
                return;
            }
            throw new AssertionError("Too deep recursion while expanding type alias " + l0Var.getName());
        }

        private a() {
        }
    }

    public C1102p0(InterfaceC1105r0 reportStrategy, boolean z10) {
        C3862t.g(reportStrategy, "reportStrategy");
        this.f5773a = reportStrategy;
        this.f5774b = z10;
    }

    private final void a(Sa.h hVar, Sa.h hVar2) {
        HashSet hashSet = new HashSet();
        Iterator<Sa.c> it = hVar.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().f());
        }
        for (Sa.c cVar : hVar2) {
            if (hashSet.contains(cVar.f())) {
                this.f5773a.c(cVar);
            }
        }
    }

    private final void b(U u10, U u11) {
        J0 j0F = J0.f(u11);
        C3862t.f(j0F, "create(...)");
        int i10 = 0;
        for (Object obj : u11.M0()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kotlin.collections.r.w();
            }
            E0 e02 = (E0) obj;
            if (!e02.c()) {
                U uA = e02.a();
                C3862t.f(uA, "getType(...)");
                if (!Mb.d.g(uA)) {
                    E0 e03 = u10.M0().get(i10);
                    Ra.m0 m0Var = u10.O0().getParameters().get(i10);
                    if (this.f5774b) {
                        InterfaceC1105r0 interfaceC1105r0 = this.f5773a;
                        U uA2 = e03.a();
                        C3862t.f(uA2, "getType(...)");
                        U uA3 = e02.a();
                        C3862t.f(uA3, "getType(...)");
                        C3862t.d(m0Var);
                        interfaceC1105r0.b(j0F, uA2, uA3, m0Var);
                    }
                }
            }
            i10 = i11;
        }
    }

    private final F c(F f10, u0 u0Var) {
        return f10.U0(h(f10, u0Var));
    }

    private final AbstractC1082f0 d(AbstractC1082f0 abstractC1082f0, u0 u0Var) {
        return Y.a(abstractC1082f0) ? abstractC1082f0 : I0.f(abstractC1082f0, null, h(abstractC1082f0, u0Var), 1, null);
    }

    private final AbstractC1082f0 e(AbstractC1082f0 abstractC1082f0, U u10) {
        AbstractC1082f0 abstractC1082f0R = M0.r(abstractC1082f0, u10.P0());
        C3862t.f(abstractC1082f0R, "makeNullableIfNeeded(...)");
        return abstractC1082f0R;
    }

    private final AbstractC1082f0 f(AbstractC1082f0 abstractC1082f0, U u10) {
        return d(e(abstractC1082f0, u10), u10.N0());
    }

    private final AbstractC1082f0 g(C1104q0 c1104q0, u0 u0Var, boolean z10) {
        y0 y0VarL = c1104q0.b().l();
        C3862t.f(y0VarL, "getTypeConstructor(...)");
        return X.m(u0Var, y0VarL, c1104q0.a(), z10, k.b.f1150b);
    }

    private final u0 h(U u10, u0 u0Var) {
        return Y.a(u10) ? u10.N0() : u0Var.x(u10.N0());
    }

    private final E0 j(E0 e02, C1104q0 c1104q0, int i10) {
        P0 p0R0 = e02.a().R0();
        if (G.a(p0R0)) {
            return e02;
        }
        AbstractC1082f0 abstractC1082f0A = I0.a(p0R0);
        if (Y.a(abstractC1082f0A) || !Mb.d.E(abstractC1082f0A)) {
            return e02;
        }
        y0 y0VarO0 = abstractC1082f0A.O0();
        InterfaceC1695h interfaceC1695hT = y0VarO0.t();
        y0VarO0.getParameters().size();
        abstractC1082f0A.M0().size();
        if (interfaceC1695hT instanceof Ra.m0) {
            return e02;
        }
        if (!(interfaceC1695hT instanceof Ra.l0)) {
            AbstractC1082f0 abstractC1082f0M = m(abstractC1082f0A, c1104q0, i10);
            b(abstractC1082f0A, abstractC1082f0M);
            return new G0(e02.b(), abstractC1082f0M);
        }
        Ra.l0 l0Var = (Ra.l0) interfaceC1695hT;
        if (c1104q0.d(l0Var)) {
            this.f5773a.a(l0Var);
            return new G0(Q0.f5693F, Jb.l.d(Jb.k.f7738T, l0Var.getName().toString()));
        }
        List<E0> listM0 = abstractC1082f0A.M0();
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(listM0, 10));
        int i11 = 0;
        for (Object obj : listM0) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                kotlin.collections.r.w();
            }
            arrayList.add(l((E0) obj, c1104q0, y0VarO0.getParameters().get(i11), i10 + 1));
            i11 = i12;
        }
        AbstractC1082f0 abstractC1082f0K = k(C1104q0.f5782e.a(c1104q0, l0Var, arrayList), abstractC1082f0A.N0(), abstractC1082f0A.P0(), i10 + 1, false);
        AbstractC1082f0 abstractC1082f0M2 = m(abstractC1082f0A, c1104q0, i10);
        if (!G.a(abstractC1082f0K)) {
            abstractC1082f0K = C1090j0.j(abstractC1082f0K, abstractC1082f0M2);
        }
        return new G0(e02.b(), abstractC1082f0K);
    }

    private final AbstractC1082f0 k(C1104q0 c1104q0, u0 u0Var, boolean z10, int i10, boolean z11) {
        E0 e0L = l(new G0(Q0.f5693F, c1104q0.b().e0()), c1104q0, null, i10);
        U uA = e0L.a();
        C3862t.f(uA, "getType(...)");
        AbstractC1082f0 abstractC1082f0A = I0.a(uA);
        if (Y.a(abstractC1082f0A)) {
            return abstractC1082f0A;
        }
        e0L.b();
        a(abstractC1082f0A.getAnnotations(), C1108u.a(u0Var));
        AbstractC1082f0 abstractC1082f0R = M0.r(d(abstractC1082f0A, u0Var), z10);
        C3862t.f(abstractC1082f0R, "let(...)");
        return z11 ? C1090j0.j(abstractC1082f0R, g(c1104q0, u0Var, z10)) : abstractC1082f0R;
    }

    private final E0 l(E0 e02, C1104q0 c1104q0, Ra.m0 m0Var, int i10) {
        Q0 q0P;
        Q0 q02;
        Q0 q03;
        f5771c.b(i10, c1104q0.b());
        if (e02.c()) {
            C3862t.d(m0Var);
            E0 e0S = M0.s(m0Var);
            C3862t.f(e0S, "makeStarProjection(...)");
            return e0S;
        }
        U uA = e02.a();
        C3862t.f(uA, "getType(...)");
        E0 e0C = c1104q0.c(uA.O0());
        if (e0C == null) {
            return j(e02, c1104q0, i10);
        }
        if (e0C.c()) {
            C3862t.d(m0Var);
            E0 e0S2 = M0.s(m0Var);
            C3862t.f(e0S2, "makeStarProjection(...)");
            return e0S2;
        }
        P0 p0R0 = e0C.a().R0();
        Q0 q0B = e0C.b();
        C3862t.f(q0B, "getProjectionKind(...)");
        Q0 q0B2 = e02.b();
        C3862t.f(q0B2, "getProjectionKind(...)");
        if (q0B2 != q0B && q0B2 != (q03 = Q0.f5693F)) {
            if (q0B == q03) {
                q0B = q0B2;
            } else {
                this.f5773a.d(c1104q0.b(), m0Var, p0R0);
            }
        }
        if (m0Var == null || (q0P = m0Var.p()) == null) {
            q0P = Q0.f5693F;
        }
        if (q0P != q0B && q0P != (q02 = Q0.f5693F)) {
            if (q0B == q02) {
                q0B = q02;
            } else {
                this.f5773a.d(c1104q0.b(), m0Var, p0R0);
            }
        }
        a(uA.getAnnotations(), p0R0.getAnnotations());
        return new G0(q0B, p0R0 instanceof F ? c((F) p0R0, uA.N0()) : f(I0.a(p0R0), uA));
    }

    private final AbstractC1082f0 m(AbstractC1082f0 abstractC1082f0, C1104q0 c1104q0, int i10) {
        y0 y0VarO0 = abstractC1082f0.O0();
        List<E0> listM0 = abstractC1082f0.M0();
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(listM0, 10));
        int i11 = 0;
        for (Object obj : listM0) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                kotlin.collections.r.w();
            }
            E0 e02 = (E0) obj;
            E0 e0L = l(e02, c1104q0, y0VarO0.getParameters().get(i11), i10 + 1);
            if (!e0L.c()) {
                e0L = new G0(e0L.b(), M0.q(e0L.a(), e02.a().P0()));
            }
            arrayList.add(e0L);
            i11 = i12;
        }
        return I0.f(abstractC1082f0, arrayList, null, 2, null);
    }

    public final AbstractC1082f0 i(C1104q0 typeAliasExpansion, u0 attributes) {
        C3862t.g(typeAliasExpansion, "typeAliasExpansion");
        C3862t.g(attributes, "attributes");
        return k(typeAliasExpansion, attributes, false, 0, true);
    }
}
