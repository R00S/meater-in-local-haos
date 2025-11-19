package Db;

import Fb.C1020a;
import Hb.AbstractC1082f0;
import Hb.C1090j0;
import Hb.C1092k0;
import Hb.C1096m0;
import Hb.C1113z;
import Hb.E0;
import Hb.G0;
import Hb.Q0;
import Hb.t0;
import Hb.u0;
import Hb.y0;
import Ra.C1711y;
import Ra.InterfaceC1688a;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1700m;
import Ra.l0;
import Ra.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C3862t;
import lb.C3937q;
import lb.C3939s;
import nb.C4076b;
import xb.C5087e;

/* compiled from: TypeDeserializer.kt */
/* loaded from: classes3.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    private final C1010p f3652a;

    /* renamed from: b, reason: collision with root package name */
    private final X f3653b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3654c;

    /* renamed from: d, reason: collision with root package name */
    private final String f3655d;

    /* renamed from: e, reason: collision with root package name */
    private final Ba.l<Integer, InterfaceC1695h> f3656e;

    /* renamed from: f, reason: collision with root package name */
    private final Ba.l<Integer, InterfaceC1695h> f3657f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<Integer, m0> f3658g;

    public X(C1010p c10, X x10, List<C3939s> typeParameterProtos, String debugName, String containerPresentableName) {
        Map<Integer, m0> linkedHashMap;
        C3862t.g(c10, "c");
        C3862t.g(typeParameterProtos, "typeParameterProtos");
        C3862t.g(debugName, "debugName");
        C3862t.g(containerPresentableName, "containerPresentableName");
        this.f3652a = c10;
        this.f3653b = x10;
        this.f3654c = debugName;
        this.f3655d = containerPresentableName;
        this.f3656e = c10.h().e(new S(this));
        this.f3657f = c10.h().e(new T(this));
        if (typeParameterProtos.isEmpty()) {
            linkedHashMap = kotlin.collections.M.h();
        } else {
            linkedHashMap = new LinkedHashMap<>();
            int i10 = 0;
            for (C3939s c3939s : typeParameterProtos) {
                linkedHashMap.put(Integer.valueOf(c3939s.N()), new Fb.S(this.f3652a, c3939s, i10));
                i10++;
            }
        }
        this.f3658g = linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int A(C3937q it) {
        C3862t.g(it, "it");
        return it.V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1695h f(X x10, int i10) {
        return x10.g(i10);
    }

    private final InterfaceC1695h g(int i10) {
        qb.b bVarA = L.a(this.f3652a.g(), i10);
        return bVarA.i() ? this.f3652a.c().b(bVarA) : C1711y.c(this.f3652a.c().q(), bVarA);
    }

    private final AbstractC1082f0 h(int i10) {
        if (L.a(this.f3652a.g(), i10).i()) {
            return this.f3652a.c().o().a();
        }
        return null;
    }

    private final InterfaceC1695h i(int i10) {
        qb.b bVarA = L.a(this.f3652a.g(), i10);
        if (bVarA.i()) {
            return null;
        }
        return C1711y.f(this.f3652a.c().q(), bVarA);
    }

    private final AbstractC1082f0 j(Hb.U u10, Hb.U u11) {
        Oa.j jVarN = Mb.d.n(u10);
        Sa.h annotations = u10.getAnnotations();
        Hb.U uK = Oa.i.k(u10);
        List<Hb.U> listE = Oa.i.e(u10);
        List listE0 = kotlin.collections.r.e0(Oa.i.m(u10), 1);
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(listE0, 10));
        Iterator it = listE0.iterator();
        while (it.hasNext()) {
            arrayList.add(((E0) it.next()).a());
        }
        return Oa.i.b(jVarN, annotations, uK, listE, arrayList, null, u11, true).S0(u10.P0());
    }

    private final AbstractC1082f0 k(u0 u0Var, y0 y0Var, List<? extends E0> list, boolean z10) {
        AbstractC1082f0 abstractC1082f0L;
        int size;
        int size2 = y0Var.getParameters().size() - list.size();
        if (size2 != 0) {
            abstractC1082f0L = null;
            if (size2 == 1 && (size = list.size() - 1) >= 0) {
                y0 y0VarL = y0Var.q().X(size).l();
                C3862t.f(y0VarL, "getTypeConstructor(...)");
                abstractC1082f0L = Hb.X.k(u0Var, y0VarL, list, z10, null, 16, null);
            }
        } else {
            abstractC1082f0L = l(u0Var, y0Var, list, z10);
        }
        return abstractC1082f0L == null ? Jb.l.f7791a.f(Jb.k.f7779q0, list, y0Var, new String[0]) : abstractC1082f0L;
    }

    private final AbstractC1082f0 l(u0 u0Var, y0 y0Var, List<? extends E0> list, boolean z10) {
        AbstractC1082f0 abstractC1082f0K = Hb.X.k(u0Var, y0Var, list, z10, null, 16, null);
        if (Oa.i.q(abstractC1082f0K)) {
            return t(abstractC1082f0K);
        }
        return null;
    }

    private final m0 n(int i10) {
        m0 m0Var = this.f3658g.get(Integer.valueOf(i10));
        if (m0Var != null) {
            return m0Var;
        }
        X x10 = this.f3653b;
        if (x10 != null) {
            return x10.n(i10);
        }
        return null;
    }

    private static final List<C3937q.b> p(C3937q c3937q, X x10) {
        List<C3937q.b> listW = c3937q.W();
        C3862t.f(listW, "getArgumentList(...)");
        List<C3937q.b> list = listW;
        C3937q c3937qJ = nb.f.j(c3937q, x10.f3652a.j());
        List<C3937q.b> listP = c3937qJ != null ? p(c3937qJ, x10) : null;
        if (listP == null) {
            listP = kotlin.collections.r.m();
        }
        return kotlin.collections.r.F0(list, listP);
    }

    public static /* synthetic */ AbstractC1082f0 q(X x10, C3937q c3937q, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return x10.o(c3937q, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List r(X x10, C3937q c3937q) {
        return x10.f3652a.c().d().g(c3937q, x10.f3652a.g());
    }

    private final u0 s(List<? extends t0> list, Sa.h hVar, y0 y0Var, InterfaceC1700m interfaceC1700m) {
        List<? extends t0> list2 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((t0) it.next()).a(hVar, y0Var, interfaceC1700m));
        }
        return u0.f5791C.i(kotlin.collections.r.z(arrayList));
    }

    private final AbstractC1082f0 t(Hb.U u10) {
        Hb.U uA;
        E0 e02 = (E0) kotlin.collections.r.w0(Oa.i.m(u10));
        if (e02 == null || (uA = e02.a()) == null) {
            return null;
        }
        InterfaceC1695h interfaceC1695hT = uA.O0().t();
        qb.c cVarO = interfaceC1695hT != null ? C5087e.o(interfaceC1695hT) : null;
        if (uA.M0().size() != 1 || (!C3862t.b(cVarO, Oa.p.f13395v) && !C3862t.b(cVarO, Y.f3660a))) {
            return (AbstractC1082f0) u10;
        }
        Hb.U uA2 = ((E0) kotlin.collections.r.J0(uA.M0())).a();
        C3862t.f(uA2, "getType(...)");
        InterfaceC1700m interfaceC1700mE = this.f3652a.e();
        InterfaceC1688a interfaceC1688a = interfaceC1700mE instanceof InterfaceC1688a ? (InterfaceC1688a) interfaceC1700mE : null;
        return C3862t.b(interfaceC1688a != null ? C5087e.k(interfaceC1688a) : null, Q.f3644a) ? j(u10, uA2) : j(u10, uA2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1695h v(X x10, int i10) {
        return x10.i(i10);
    }

    private final E0 w(m0 m0Var, C3937q.b bVar) {
        if (bVar.y() == C3937q.b.c.STAR) {
            return m0Var == null ? new C1092k0(this.f3652a.c().q().q()) : new C1096m0(m0Var);
        }
        O o10 = O.f3632a;
        C3937q.b.c cVarY = bVar.y();
        C3862t.f(cVarY, "getProjection(...)");
        Q0 q0C = o10.c(cVarY);
        C3937q c3937qP = nb.f.p(bVar, this.f3652a.j());
        return c3937qP == null ? new G0(Jb.l.d(Jb.k.f7753a1, bVar.toString())) : new G0(q0C, u(c3937qP));
    }

    private final y0 x(C3937q c3937q) {
        InterfaceC1695h interfaceC1695hInvoke;
        Object next;
        if (c3937q.n0()) {
            interfaceC1695hInvoke = this.f3656e.invoke(Integer.valueOf(c3937q.X()));
            if (interfaceC1695hInvoke == null) {
                interfaceC1695hInvoke = y(this, c3937q, c3937q.X());
            }
        } else if (c3937q.w0()) {
            interfaceC1695hInvoke = n(c3937q.j0());
            if (interfaceC1695hInvoke == null) {
                return Jb.l.f7791a.e(Jb.k.f7777o0, String.valueOf(c3937q.j0()), this.f3655d);
            }
        } else if (c3937q.x0()) {
            String string = this.f3652a.g().getString(c3937q.k0());
            Iterator<T> it = m().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C3862t.b(((m0) next).getName().j(), string)) {
                    break;
                }
            }
            interfaceC1695hInvoke = (m0) next;
            if (interfaceC1695hInvoke == null) {
                return Jb.l.f7791a.e(Jb.k.f7778p0, string, this.f3652a.e().toString());
            }
        } else {
            if (!c3937q.v0()) {
                return Jb.l.f7791a.e(Jb.k.f7781s0, new String[0]);
            }
            interfaceC1695hInvoke = this.f3657f.invoke(Integer.valueOf(c3937q.i0()));
            if (interfaceC1695hInvoke == null) {
                interfaceC1695hInvoke = y(this, c3937q, c3937q.i0());
            }
        }
        y0 y0VarL = interfaceC1695hInvoke.l();
        C3862t.f(y0VarL, "getTypeConstructor(...)");
        return y0VarL;
    }

    private static final InterfaceC1692e y(X x10, C3937q c3937q, int i10) {
        qb.b bVarA = L.a(x10.f3652a.g(), i10);
        List<Integer> listI = Tb.k.I(Tb.k.A(Tb.k.i(c3937q, new V(x10)), W.f3651B));
        int iM = Tb.k.m(Tb.k.i(bVarA, new kotlin.jvm.internal.F() { // from class: Db.X.a
            @Override // Ia.o
            public Object get(Object obj) {
                return ((qb.b) obj).e();
            }

            @Override // kotlin.jvm.internal.AbstractC3849f, Ia.c
            public String getName() {
                return "outerClassId";
            }

            @Override // kotlin.jvm.internal.AbstractC3849f
            public Ia.g getOwner() {
                return kotlin.jvm.internal.P.b(qb.b.class);
            }

            @Override // kotlin.jvm.internal.AbstractC3849f
            public String getSignature() {
                return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
            }
        }));
        while (listI.size() < iM) {
            listI.add(0);
        }
        return x10.f3652a.c().r().d(bVarA, listI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3937q z(X x10, C3937q it) {
        C3862t.g(it, "it");
        return nb.f.j(it, x10.f3652a.j());
    }

    public final List<m0> m() {
        return kotlin.collections.r.W0(this.f3658g.values());
    }

    public final AbstractC1082f0 o(C3937q proto, boolean z10) {
        AbstractC1082f0 abstractC1082f0K;
        AbstractC1082f0 abstractC1082f0J;
        C3862t.g(proto, "proto");
        AbstractC1082f0 abstractC1082f0H = proto.n0() ? h(proto.X()) : proto.v0() ? h(proto.i0()) : null;
        if (abstractC1082f0H != null) {
            return abstractC1082f0H;
        }
        y0 y0VarX = x(proto);
        if (Jb.l.m(y0VarX.t())) {
            return Jb.l.f7791a.c(Jb.k.f7743V0, y0VarX, y0VarX.toString());
        }
        C1020a c1020a = new C1020a(this.f3652a.h(), new U(this, proto));
        u0 u0VarS = s(this.f3652a.c().v(), c1020a, y0VarX, this.f3652a.e());
        List<C3937q.b> listP = p(proto, this);
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(listP, 10));
        int i10 = 0;
        for (Object obj : listP) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kotlin.collections.r.w();
            }
            List<m0> parameters = y0VarX.getParameters();
            C3862t.f(parameters, "getParameters(...)");
            arrayList.add(w((m0) kotlin.collections.r.m0(parameters, i10), (C3937q.b) obj));
            i10 = i11;
        }
        List<? extends E0> listW0 = kotlin.collections.r.W0(arrayList);
        InterfaceC1695h interfaceC1695hT = y0VarX.t();
        if (z10 && (interfaceC1695hT instanceof l0)) {
            AbstractC1082f0 abstractC1082f0C = Hb.X.c((l0) interfaceC1695hT, listW0);
            abstractC1082f0K = abstractC1082f0C.S0(Hb.Y.b(abstractC1082f0C) || proto.e0()).U0(s(this.f3652a.c().v(), Sa.h.f15630e.a(kotlin.collections.r.D0(c1020a, abstractC1082f0C.getAnnotations())), y0VarX, this.f3652a.e()));
        } else if (C4076b.f45813a.d(proto.a0()).booleanValue()) {
            abstractC1082f0K = k(u0VarS, y0VarX, listW0, proto.e0());
        } else {
            abstractC1082f0K = Hb.X.k(u0VarS, y0VarX, listW0, proto.e0(), null, 16, null);
            if (C4076b.f45814b.d(proto.a0()).booleanValue()) {
                C1113z c1113zC = C1113z.a.c(C1113z.f5817E, abstractC1082f0K, true, false, 4, null);
                if (c1113zC == null) {
                    throw new IllegalStateException(("null DefinitelyNotNullType for '" + abstractC1082f0K + '\'').toString());
                }
                abstractC1082f0K = c1113zC;
            }
        }
        C3937q c3937qA = nb.f.a(proto, this.f3652a.j());
        return (c3937qA == null || (abstractC1082f0J = C1090j0.j(abstractC1082f0K, o(c3937qA, false))) == null) ? abstractC1082f0K : abstractC1082f0J;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f3654c);
        if (this.f3653b == null) {
            str = "";
        } else {
            str = ". Child of " + this.f3653b.f3654c;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public final Hb.U u(C3937q proto) {
        C3862t.g(proto, "proto");
        if (!proto.p0()) {
            return o(proto, true);
        }
        String string = this.f3652a.g().getString(proto.b0());
        AbstractC1082f0 abstractC1082f0Q = q(this, proto, false, 2, null);
        C3937q c3937qF = nb.f.f(proto, this.f3652a.j());
        C3862t.d(c3937qF);
        return this.f3652a.c().m().a(proto, string, abstractC1082f0Q, q(this, c3937qF, false, 2, null));
    }
}
