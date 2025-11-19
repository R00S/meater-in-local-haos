package eb;

import Db.InterfaceC1016w;
import Hb.L0;
import Hb.M0;
import Ra.AbstractC1707u;
import Ra.C1706t;
import Ra.InterfaceC1688a;
import Ra.InterfaceC1691d;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1699l;
import Ra.InterfaceC1712z;
import Ra.g0;
import Ra.m0;
import Ra.t0;
import Rb.l;
import Ua.C1770i;
import Ua.C1778q;
import ab.C1927H;
import ab.C1928I;
import ab.C1933N;
import ab.C1938T;
import ab.C1939U;
import ab.C1940V;
import ab.C1946f;
import ab.C1949i;
import ab.C1953m;
import ab.InterfaceC1961u;
import bb.C2275a;
import bb.o;
import db.C3088c;
import db.C3093h;
import db.C3096k;
import eb.U;
import fb.C3354a;
import fb.C3355b;
import hb.InterfaceC3513f;
import hb.InterfaceC3514g;
import hb.InterfaceC3518k;
import hb.InterfaceC3521n;
import hb.InterfaceC3524q;
import hb.InterfaceC3525r;
import hb.InterfaceC3530w;
import hb.InterfaceC3531x;
import hb.InterfaceC3532y;
import ib.e0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jb.C3759C;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3859p;
import kotlin.jvm.internal.C3862t;
import oa.C4170o;
import tb.C4596h;
import tb.C4597i;
import tb.C4603o;
import xb.C5087e;

/* compiled from: LazyJavaClassMemberScope.kt */
/* renamed from: eb.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3293z extends U {

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC1692e f40945n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC3514g f40946o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f40947p;

    /* renamed from: q, reason: collision with root package name */
    private final Gb.i<List<InterfaceC1691d>> f40948q;

    /* renamed from: r, reason: collision with root package name */
    private final Gb.i<Set<qb.f>> f40949r;

    /* renamed from: s, reason: collision with root package name */
    private final Gb.i<Set<qb.f>> f40950s;

    /* renamed from: t, reason: collision with root package name */
    private final Gb.i<Map<qb.f, InterfaceC3521n>> f40951t;

    /* renamed from: u, reason: collision with root package name */
    private final Gb.h<qb.f, InterfaceC1692e> f40952u;

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* renamed from: eb.z$a */
    /* synthetic */ class a extends C3859p implements Ba.l<qb.f, Collection<? extends g0>> {
        a(Object obj) {
            super(1, obj);
        }

        @Override // Ba.l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Collection<g0> invoke(qb.f p02) {
            C3862t.g(p02, "p0");
            return ((C3293z) this.receiver).q1(p02);
        }

        @Override // kotlin.jvm.internal.AbstractC3849f, Ia.c
        public final String getName() {
            return "searchMethodsByNameWithoutBuiltinMagic";
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final Ia.g getOwner() {
            return kotlin.jvm.internal.P.b(C3293z.class);
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final String getSignature() {
            return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }
    }

    /* compiled from: LazyJavaClassMemberScope.kt */
    /* renamed from: eb.z$b */
    /* synthetic */ class b extends C3859p implements Ba.l<qb.f, Collection<? extends g0>> {
        b(Object obj) {
            super(1, obj);
        }

        @Override // Ba.l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Collection<g0> invoke(qb.f p02) {
            C3862t.g(p02, "p0");
            return ((C3293z) this.receiver).r1(p02);
        }

        @Override // kotlin.jvm.internal.AbstractC3849f, Ia.c
        public final String getName() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic";
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final Ia.g getOwner() {
            return kotlin.jvm.internal.P.b(C3293z.class);
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final String getSignature() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }
    }

    public /* synthetic */ C3293z(C3096k c3096k, InterfaceC1692e interfaceC1692e, InterfaceC3514g interfaceC3514g, boolean z10, C3293z c3293z, int i10, C3854k c3854k) {
        this(c3096k, interfaceC1692e, interfaceC3514g, z10, (i10 & 16) != 0 ? null : c3293z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection A0(C3293z c3293z, qb.f it) {
        C3862t.g(it, "it");
        return c3293z.q1(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection B0(C3293z c3293z, qb.f it) {
        C3862t.g(it, "it");
        return c3293z.r1(it);
    }

    private final Collection<Hb.U> C0() {
        if (!this.f40947p) {
            return L().a().k().d().g(R());
        }
        Collection<Hb.U> collectionS = R().l().s();
        C3862t.f(collectionS, "getSupertypes(...)");
        return collectionS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Collection] */
    public static final List D0(C3293z c3293z, C3096k c3096k) {
        Collection<InterfaceC3518k> collectionN = c3293z.f40946o.n();
        ArrayList arrayList = new ArrayList(collectionN.size());
        Iterator<InterfaceC3518k> it = collectionN.iterator();
        while (it.hasNext()) {
            arrayList.add(c3293z.o1(it.next()));
        }
        if (c3293z.f40946o.t()) {
            InterfaceC1691d interfaceC1691dG0 = c3293z.G0();
            String strC = C3759C.c(interfaceC1691dG0, false, false, 2, null);
            if (arrayList.isEmpty()) {
                arrayList.add(interfaceC1691dG0);
                c3096k.a().h().e(c3293z.f40946o, interfaceC1691dG0);
            } else {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (C3862t.b(C3759C.c((InterfaceC1691d) it2.next(), false, false, 2, null), strC)) {
                        break;
                    }
                }
                arrayList.add(interfaceC1691dG0);
                c3096k.a().h().e(c3293z.f40946o, interfaceC1691dG0);
            }
        }
        c3096k.a().w().c(c3293z.R(), arrayList, c3096k);
        e0 e0VarR = c3096k.a().r();
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayListQ = arrayList;
        if (zIsEmpty) {
            arrayListQ = kotlin.collections.r.q(c3293z.F0());
        }
        return kotlin.collections.r.W0(e0VarR.p(c3096k, arrayListQ));
    }

    private final List<t0> E0(C1770i c1770i) {
        C4170o c4170o;
        Collection<InterfaceC3525r> collectionM = this.f40946o.M();
        ArrayList arrayList = new ArrayList(collectionM.size());
        C3354a c3354aB = C3355b.b(L0.f5678C, true, false, null, 6, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : collectionM) {
            if (C3862t.b(((InterfaceC3525r) obj).getName(), C1928I.f20141c)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        C4170o c4170o2 = new C4170o(arrayList2, arrayList3);
        List list = (List) c4170o2.a();
        List<InterfaceC3525r> list2 = (List) c4170o2.b();
        list.size();
        InterfaceC3525r interfaceC3525r = (InterfaceC3525r) kotlin.collections.r.l0(list);
        if (interfaceC3525r != null) {
            InterfaceC3531x returnType = interfaceC3525r.getReturnType();
            if (returnType instanceof InterfaceC3513f) {
                InterfaceC3513f interfaceC3513f = (InterfaceC3513f) returnType;
                c4170o = new C4170o(L().g().l(interfaceC3513f, c3354aB, true), L().g().p(interfaceC3513f.m(), c3354aB));
            } else {
                c4170o = new C4170o(L().g().p(returnType, c3354aB), null);
            }
            s0(arrayList, c1770i, 0, interfaceC3525r, (Hb.U) c4170o.a(), (Hb.U) c4170o.b());
        }
        int i10 = 0;
        int i11 = interfaceC3525r == null ? 0 : 1;
        for (InterfaceC3525r interfaceC3525r2 : list2) {
            s0(arrayList, c1770i, i10 + i11, interfaceC3525r2, L().g().p(interfaceC3525r2.getReturnType(), c3354aB), null);
            i10++;
        }
        return arrayList;
    }

    private final InterfaceC1691d F0() {
        boolean zQ = this.f40946o.q();
        if ((this.f40946o.H() || !this.f40946o.u()) && !zQ) {
            return null;
        }
        InterfaceC1692e interfaceC1692eR = R();
        cb.b bVarU1 = cb.b.u1(interfaceC1692eR, Sa.h.f15630e.b(), true, L().a().t().a(this.f40946o));
        C3862t.f(bVarU1, "createJavaConstructor(...)");
        List<t0> listE0 = zQ ? E0(bVarU1) : Collections.emptyList();
        bVarU1.a1(false);
        bVarU1.r1(listE0, Z0(interfaceC1692eR));
        bVarU1.Z0(true);
        bVarU1.h1(interfaceC1692eR.u());
        L().a().h().e(this.f40946o, bVarU1);
        return bVarU1;
    }

    private final InterfaceC1691d G0() {
        InterfaceC1692e interfaceC1692eR = R();
        cb.b bVarU1 = cb.b.u1(interfaceC1692eR, Sa.h.f15630e.b(), true, L().a().t().a(this.f40946o));
        C3862t.f(bVarU1, "createJavaConstructor(...)");
        List<t0> listM0 = M0(bVarU1);
        bVarU1.a1(false);
        bVarU1.r1(listM0, Z0(interfaceC1692eR));
        bVarU1.Z0(false);
        bVarU1.h1(interfaceC1692eR.u());
        return bVarU1;
    }

    private final g0 H0(g0 g0Var, InterfaceC1688a interfaceC1688a, Collection<? extends g0> collection) {
        Collection<? extends g0> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return g0Var;
        }
        for (g0 g0Var2 : collection2) {
            if (!C3862t.b(g0Var, g0Var2) && g0Var2.c0() == null && Q0(g0Var2, interfaceC1688a)) {
                InterfaceC1712z interfaceC1712zE = g0Var.v().l().e();
                C3862t.d(interfaceC1712zE);
                return (g0) interfaceC1712zE;
            }
        }
        return g0Var;
    }

    private final g0 I0(InterfaceC1712z interfaceC1712z, Ba.l<? super qb.f, ? extends Collection<? extends g0>> lVar) {
        Object next;
        qb.f name = interfaceC1712z.getName();
        C3862t.f(name, "getName(...)");
        Iterator<T> it = lVar.invoke(name).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (e1((g0) next, interfaceC1712z)) {
                break;
            }
        }
        g0 g0Var = (g0) next;
        if (g0Var == null) {
            return null;
        }
        InterfaceC1712z.a<? extends g0> aVarV = g0Var.v();
        List<t0> listK = interfaceC1712z.k();
        C3862t.f(listK, "getValueParameters(...)");
        List<t0> list = listK;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((t0) it2.next()).a());
        }
        List<t0> listK2 = g0Var.k();
        C3862t.f(listK2, "getValueParameters(...)");
        aVarV.c(cb.h.a(arrayList, listK2, interfaceC1712z));
        aVarV.t();
        aVarV.d();
        aVarV.i(cb.e.f31131i0, Boolean.TRUE);
        return (g0) aVarV.e();
    }

    private final cb.f J0(Ra.Z z10, Ba.l<? super qb.f, ? extends Collection<? extends g0>> lVar) {
        g0 g0VarX0;
        Ua.M m10 = null;
        if (!P0(z10, lVar)) {
            return null;
        }
        g0 g0VarW0 = W0(z10, lVar);
        C3862t.d(g0VarW0);
        if (z10.h0()) {
            g0VarX0 = X0(z10, lVar);
            C3862t.d(g0VarX0);
        } else {
            g0VarX0 = null;
        }
        if (g0VarX0 != null) {
            g0VarX0.m();
            g0VarW0.m();
        }
        cb.d dVar = new cb.d(R(), g0VarW0, g0VarX0, z10);
        Hb.U returnType = g0VarW0.getReturnType();
        C3862t.d(returnType);
        dVar.c1(returnType, kotlin.collections.r.m(), O(), null, kotlin.collections.r.m());
        Ua.L lK = C4596h.k(dVar, g0VarW0.getAnnotations(), false, false, false, g0VarW0.j());
        lK.O0(g0VarW0);
        lK.R0(dVar.a());
        C3862t.f(lK, "apply(...)");
        if (g0VarX0 != null) {
            List<t0> listK = g0VarX0.k();
            C3862t.f(listK, "getValueParameters(...)");
            t0 t0Var = (t0) kotlin.collections.r.l0(listK);
            if (t0Var == null) {
                throw new AssertionError("No parameter found for " + g0VarX0);
            }
            m10 = C4596h.m(dVar, g0VarX0.getAnnotations(), t0Var.getAnnotations(), false, false, false, g0VarX0.getVisibility(), g0VarX0.j());
            m10.O0(g0VarX0);
        }
        dVar.V0(lK, m10);
        return dVar;
    }

    private final cb.f K0(InterfaceC3525r interfaceC3525r, Hb.U u10, Ra.E e10) {
        cb.f fVarG1 = cb.f.g1(R(), C3093h.a(L(), interfaceC3525r), e10, C1940V.d(interfaceC3525r.getVisibility()), false, interfaceC3525r.getName(), L().a().t().a(interfaceC3525r), false);
        C3862t.f(fVarG1, "create(...)");
        Ua.L lD = C4596h.d(fVarG1, Sa.h.f15630e.b());
        C3862t.f(lD, "createDefaultGetter(...)");
        fVarG1.V0(lD, null);
        Hb.U uA = u10 == null ? A(interfaceC3525r, C3088c.i(L(), fVarG1, interfaceC3525r, 0, 4, null)) : u10;
        fVarG1.c1(uA, kotlin.collections.r.m(), O(), null, kotlin.collections.r.m());
        lD.R0(uA);
        return fVarG1;
    }

    static /* synthetic */ cb.f L0(C3293z c3293z, InterfaceC3525r interfaceC3525r, Hb.U u10, Ra.E e10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            u10 = null;
        }
        return c3293z.K0(interfaceC3525r, u10, e10);
    }

    private final List<t0> M0(C1770i c1770i) {
        Collection<InterfaceC3530w> collectionI = this.f40946o.i();
        ArrayList arrayList = new ArrayList(collectionI.size());
        C3354a c3354aB = C3355b.b(L0.f5678C, false, false, null, 6, null);
        Iterator<T> it = collectionI.iterator();
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (!it.hasNext()) {
                return arrayList;
            }
            i10 = i11 + 1;
            InterfaceC3530w interfaceC3530w = (InterfaceC3530w) it.next();
            Hb.U uP = L().g().p(interfaceC3530w.a(), c3354aB);
            arrayList.add(new Ua.V(c1770i, null, i11, Sa.h.f15630e.b(), interfaceC3530w.getName(), uP, false, false, false, interfaceC3530w.j() ? L().a().m().q().k(uP) : null, L().a().t().a(interfaceC3530w)));
        }
    }

    private final g0 N0(g0 g0Var, qb.f fVar) {
        InterfaceC1712z.a<? extends g0> aVarV = g0Var.v();
        aVarV.b(fVar);
        aVarV.t();
        aVarV.d();
        InterfaceC1712z interfaceC1712zE = aVarV.e();
        C3862t.d(interfaceC1712zE);
        return (g0) interfaceC1712zE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final Ra.g0 O0(Ra.g0 r6) {
        /*
            r5 = this;
            java.util.List r0 = r6.k()
            java.lang.String r1 = "getValueParameters(...)"
            kotlin.jvm.internal.C3862t.f(r0, r1)
            java.lang.Object r0 = kotlin.collections.r.w0(r0)
            Ra.t0 r0 = (Ra.t0) r0
            r2 = 0
            if (r0 == 0) goto L7d
            Hb.U r3 = r0.a()
            Hb.y0 r3 = r3.O0()
            Ra.h r3 = r3.t()
            if (r3 == 0) goto L35
            qb.d r3 = xb.C5087e.p(r3)
            if (r3 == 0) goto L35
            boolean r4 = r3.f()
            if (r4 == 0) goto L2d
            goto L2e
        L2d:
            r3 = r2
        L2e:
            if (r3 == 0) goto L35
            qb.c r3 = r3.l()
            goto L36
        L35:
            r3 = r2
        L36:
            qb.c r4 = Oa.p.f13395v
            boolean r3 = kotlin.jvm.internal.C3862t.b(r3, r4)
            if (r3 == 0) goto L3f
            goto L40
        L3f:
            r0 = r2
        L40:
            if (r0 != 0) goto L43
            goto L7d
        L43:
            Ra.z$a r2 = r6.v()
            java.util.List r6 = r6.k()
            kotlin.jvm.internal.C3862t.f(r6, r1)
            r1 = 1
            java.util.List r6 = kotlin.collections.r.e0(r6, r1)
            Ra.z$a r6 = r2.c(r6)
            Hb.U r0 = r0.a()
            java.util.List r0 = r0.M0()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            Hb.E0 r0 = (Hb.E0) r0
            Hb.U r0 = r0.a()
            Ra.z$a r6 = r6.s(r0)
            Ra.z r6 = r6.e()
            Ra.g0 r6 = (Ra.g0) r6
            r0 = r6
            Ua.O r0 = (Ua.O) r0
            if (r0 == 0) goto L7c
            r0.i1(r1)
        L7c:
            return r6
        L7d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.C3293z.O0(Ra.g0):Ra.g0");
    }

    private final boolean P0(Ra.Z z10, Ba.l<? super qb.f, ? extends Collection<? extends g0>> lVar) {
        if (C3272d.a(z10)) {
            return false;
        }
        g0 g0VarW0 = W0(z10, lVar);
        g0 g0VarX0 = X0(z10, lVar);
        if (g0VarW0 == null) {
            return false;
        }
        if (z10.h0()) {
            return g0VarX0 != null && g0VarX0.m() == g0VarW0.m();
        }
        return true;
    }

    private final boolean Q0(InterfaceC1688a interfaceC1688a, InterfaceC1688a interfaceC1688a2) {
        C4603o.i.a aVarC = C4603o.f50027f.F(interfaceC1688a2, interfaceC1688a, true).c();
        C3862t.f(aVarC, "getResult(...)");
        return aVarC == C4603o.i.a.OVERRIDABLE && !ab.z.f20286a.a(interfaceC1688a2, interfaceC1688a);
    }

    private final boolean R0(g0 g0Var) {
        C1939U.a aVar = C1939U.f20204a;
        qb.f name = g0Var.getName();
        C3862t.f(name, "getName(...)");
        qb.f fVarB = aVar.b(name);
        if (fVarB == null) {
            return false;
        }
        Set<g0> setB1 = b1(fVarB);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setB1) {
            if (C1938T.d((g0) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        g0 g0VarN0 = N0(g0Var, fVarB);
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (S0((g0) it.next(), g0VarN0)) {
                return true;
            }
        }
        return false;
    }

    private final boolean S0(g0 g0Var, InterfaceC1712z interfaceC1712z) {
        if (C1946f.f20252o.m(g0Var)) {
            interfaceC1712z = interfaceC1712z.L0();
        }
        C3862t.d(interfaceC1712z);
        return Q0(interfaceC1712z, g0Var);
    }

    private final boolean T0(g0 g0Var) {
        g0 g0VarO0 = O0(g0Var);
        if (g0VarO0 == null) {
            return false;
        }
        qb.f name = g0Var.getName();
        C3862t.f(name, "getName(...)");
        Set<g0> setB1 = b1(name);
        if ((setB1 instanceof Collection) && setB1.isEmpty()) {
            return false;
        }
        for (g0 g0Var2 : setB1) {
            if (g0Var2.isSuspend() && Q0(g0VarO0, g0Var2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map U0(C3293z c3293z) {
        Collection<InterfaceC3521n> fields = c3293z.f40946o.getFields();
        ArrayList arrayList = new ArrayList();
        for (Object obj : fields) {
            if (((InterfaceC3521n) obj).G()) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(Ha.g.d(kotlin.collections.M.d(kotlin.collections.r.x(arrayList, 10)), 16));
        for (Object obj2 : arrayList) {
            linkedHashMap.put(((InterfaceC3521n) obj2).getName(), obj2);
        }
        return linkedHashMap;
    }

    private final g0 V0(Ra.Z z10, String str, Ba.l<? super qb.f, ? extends Collection<? extends g0>> lVar) {
        g0 g0Var;
        qb.f fVarT = qb.f.t(str);
        C3862t.f(fVarT, "identifier(...)");
        Iterator<T> it = lVar.invoke(fVarT).iterator();
        do {
            g0Var = null;
            if (!it.hasNext()) {
                break;
            }
            g0 g0Var2 = (g0) it.next();
            if (g0Var2.k().size() == 0) {
                Ib.e eVar = Ib.e.f6980a;
                Hb.U returnType = g0Var2.getReturnType();
                if (returnType == null ? false : eVar.b(returnType, z10.a())) {
                    g0Var = g0Var2;
                }
            }
        } while (g0Var == null);
        return g0Var;
    }

    private final g0 W0(Ra.Z z10, Ba.l<? super qb.f, ? extends Collection<? extends g0>> lVar) {
        Ra.a0 a0VarE = z10.e();
        Ra.a0 a0Var = a0VarE != null ? (Ra.a0) C1938T.g(a0VarE) : null;
        String strB = a0Var != null ? C1953m.f20263a.b(a0Var) : null;
        if (strB != null && !C1938T.l(R(), a0Var)) {
            return V0(z10, strB, lVar);
        }
        String strJ = z10.getName().j();
        C3862t.f(strJ, "asString(...)");
        return V0(z10, C1927H.b(strJ), lVar);
    }

    private final g0 X0(Ra.Z z10, Ba.l<? super qb.f, ? extends Collection<? extends g0>> lVar) {
        g0 g0Var;
        Hb.U returnType;
        String strJ = z10.getName().j();
        C3862t.f(strJ, "asString(...)");
        qb.f fVarT = qb.f.t(C1927H.e(strJ));
        C3862t.f(fVarT, "identifier(...)");
        Iterator<T> it = lVar.invoke(fVarT).iterator();
        do {
            g0Var = null;
            if (!it.hasNext()) {
                break;
            }
            g0 g0Var2 = (g0) it.next();
            if (g0Var2.k().size() == 1 && (returnType = g0Var2.getReturnType()) != null && Oa.j.C0(returnType)) {
                Ib.e eVar = Ib.e.f6980a;
                List<t0> listK = g0Var2.k();
                C3862t.f(listK, "getValueParameters(...)");
                if (eVar.c(((t0) kotlin.collections.r.J0(listK)).a(), z10.a())) {
                    g0Var = g0Var2;
                }
            }
        } while (g0Var == null);
        return g0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set Y0(C3096k c3096k, C3293z c3293z) {
        return kotlin.collections.r.b1(c3096k.a().w().g(c3293z.R(), c3096k));
    }

    private final AbstractC1707u Z0(InterfaceC1692e interfaceC1692e) {
        AbstractC1707u visibility = interfaceC1692e.getVisibility();
        C3862t.f(visibility, "getVisibility(...)");
        if (!C3862t.b(visibility, ab.y.f20283b)) {
            return visibility;
        }
        AbstractC1707u PROTECTED_AND_PACKAGE = ab.y.f20284c;
        C3862t.f(PROTECTED_AND_PACKAGE, "PROTECTED_AND_PACKAGE");
        return PROTECTED_AND_PACKAGE;
    }

    private final Set<g0> b1(qb.f fVar) {
        Collection<Hb.U> collectionC0 = C0();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = collectionC0.iterator();
        while (it.hasNext()) {
            kotlin.collections.r.D(linkedHashSet, ((Hb.U) it.next()).s().b(fVar, Za.d.f19639P));
        }
        return linkedHashSet;
    }

    private final Set<Ra.Z> d1(qb.f fVar) {
        Collection<Hb.U> collectionC0 = C0();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionC0.iterator();
        while (it.hasNext()) {
            Collection<? extends Ra.Z> collectionD = ((Hb.U) it.next()).s().d(fVar, Za.d.f19639P);
            ArrayList arrayList2 = new ArrayList(kotlin.collections.r.x(collectionD, 10));
            Iterator<T> it2 = collectionD.iterator();
            while (it2.hasNext()) {
                arrayList2.add((Ra.Z) it2.next());
            }
            kotlin.collections.r.D(arrayList, arrayList2);
        }
        return kotlin.collections.r.b1(arrayList);
    }

    private final boolean e1(g0 g0Var, InterfaceC1712z interfaceC1712z) {
        String strC = C3759C.c(g0Var, false, false, 2, null);
        InterfaceC1712z interfaceC1712zL0 = interfaceC1712z.L0();
        C3862t.f(interfaceC1712zL0, "getOriginal(...)");
        return C3862t.b(strC, C3759C.c(interfaceC1712zL0, false, false, 2, null)) && !Q0(g0Var, interfaceC1712z);
    }

    private final boolean f1(g0 g0Var) {
        qb.f name = g0Var.getName();
        C3862t.f(name, "getName(...)");
        List<qb.f> listA = C1933N.a(name);
        if (!(listA instanceof Collection) || !listA.isEmpty()) {
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                Set<Ra.Z> setD1 = d1((qb.f) it.next());
                if (!(setD1 instanceof Collection) || !setD1.isEmpty()) {
                    for (Ra.Z z10 : setD1) {
                        if (P0(z10, new C3289v(g0Var, this))) {
                            if (!z10.h0()) {
                                String strJ = g0Var.getName().j();
                                C3862t.f(strJ, "asString(...)");
                                if (!C1927H.d(strJ)) {
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return (R0(g0Var) || s1(g0Var) || T0(g0Var)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection g1(g0 g0Var, C3293z c3293z, qb.f accessorName) {
        C3862t.g(accessorName, "accessorName");
        return C3862t.b(g0Var.getName(), accessorName) ? kotlin.collections.r.e(g0Var) : kotlin.collections.r.F0(c3293z.q1(accessorName), c3293z.r1(accessorName));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set h1(C3293z c3293z) {
        return kotlin.collections.r.b1(c3293z.f40946o.K());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1692e i1(C3293z c3293z, C3096k c3096k, qb.f name) {
        C3862t.g(name, "name");
        if (c3293z.f40949r.invoke().contains(name)) {
            InterfaceC1961u interfaceC1961uD = c3096k.a().d();
            qb.b bVarN = C5087e.n(c3293z.R());
            C3862t.d(bVarN);
            InterfaceC3514g interfaceC3514gC = interfaceC1961uD.c(new InterfaceC1961u.a(bVarN.d(name), null, c3293z.f40946o, 2, null));
            if (interfaceC3514gC == null) {
                return null;
            }
            C3282n c3282n = new C3282n(c3096k, c3293z.R(), interfaceC3514gC, null, 8, null);
            c3096k.a().e().a(c3282n);
            return c3282n;
        }
        if (!c3293z.f40950s.invoke().contains(name)) {
            InterfaceC3521n interfaceC3521n = c3293z.f40951t.invoke().get(name);
            if (interfaceC3521n == null) {
                return null;
            }
            return C1778q.M0(c3096k.e(), c3293z.R(), name, c3096k.e().g(new C3292y(c3293z)), C3093h.a(c3096k, interfaceC3521n), c3096k.a().t().a(interfaceC3521n));
        }
        List<InterfaceC1692e> listC = kotlin.collections.r.c();
        c3096k.a().w().a(c3293z.R(), name, listC, c3096k);
        List listA = kotlin.collections.r.a(listC);
        int size = listA.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return (InterfaceC1692e) kotlin.collections.r.J0(listA);
        }
        throw new IllegalStateException(("Multiple classes with same name are generated: " + listA).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set j1(C3293z c3293z) {
        return kotlin.collections.V.j(c3293z.a(), c3293z.c());
    }

    private final g0 k1(g0 g0Var, Ba.l<? super qb.f, ? extends Collection<? extends g0>> lVar, Collection<? extends g0> collection) {
        g0 g0VarI0;
        InterfaceC1712z interfaceC1712zL = C1949i.l(g0Var);
        if (interfaceC1712zL == null || (g0VarI0 = I0(interfaceC1712zL, lVar)) == null) {
            return null;
        }
        if (!f1(g0VarI0)) {
            g0VarI0 = null;
        }
        if (g0VarI0 != null) {
            return H0(g0VarI0, interfaceC1712zL, collection);
        }
        return null;
    }

    private final g0 l1(g0 g0Var, Ba.l<? super qb.f, ? extends Collection<? extends g0>> lVar, qb.f fVar, Collection<? extends g0> collection) {
        g0 g0Var2 = (g0) C1938T.g(g0Var);
        if (g0Var2 == null) {
            return null;
        }
        String strE = C1938T.e(g0Var2);
        C3862t.d(strE);
        qb.f fVarT = qb.f.t(strE);
        C3862t.f(fVarT, "identifier(...)");
        Iterator<? extends g0> it = lVar.invoke(fVarT).iterator();
        while (it.hasNext()) {
            g0 g0VarN0 = N0(it.next(), fVar);
            if (S0(g0Var2, g0VarN0)) {
                return H0(g0VarN0, g0Var2, collection);
            }
        }
        return null;
    }

    private final g0 m1(g0 g0Var, Ba.l<? super qb.f, ? extends Collection<? extends g0>> lVar) {
        if (!g0Var.isSuspend()) {
            return null;
        }
        qb.f name = g0Var.getName();
        C3862t.f(name, "getName(...)");
        Iterator<T> it = lVar.invoke(name).iterator();
        while (it.hasNext()) {
            g0 g0VarO0 = O0((g0) it.next());
            if (g0VarO0 == null || !Q0(g0VarO0, g0Var)) {
                g0VarO0 = null;
            }
            if (g0VarO0 != null) {
                return g0VarO0;
            }
        }
        return null;
    }

    private final cb.b o1(InterfaceC3518k interfaceC3518k) {
        InterfaceC1692e interfaceC1692eR = R();
        cb.b bVarU1 = cb.b.u1(interfaceC1692eR, C3093h.a(L(), interfaceC3518k), false, L().a().t().a(interfaceC3518k));
        C3862t.f(bVarU1, "createJavaConstructor(...)");
        C3096k c3096kH = C3088c.h(L(), bVarU1, interfaceC3518k, interfaceC1692eR.w().size());
        U.b bVarD0 = d0(c3096kH, bVarU1, interfaceC3518k.k());
        List<m0> listW = interfaceC1692eR.w();
        C3862t.f(listW, "getDeclaredTypeParameters(...)");
        List<m0> list = listW;
        List<InterfaceC3532y> typeParameters = interfaceC3518k.getTypeParameters();
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            m0 m0VarA = c3096kH.f().a((InterfaceC3532y) it.next());
            C3862t.d(m0VarA);
            arrayList.add(m0VarA);
        }
        bVarU1.s1(bVarD0.a(), C1940V.d(interfaceC3518k.getVisibility()), kotlin.collections.r.F0(list, arrayList));
        bVarU1.Z0(false);
        bVarU1.a1(bVarD0.b());
        bVarU1.h1(interfaceC1692eR.u());
        c3096kH.a().h().e(interfaceC3518k, bVarU1);
        return bVarU1;
    }

    private final cb.e p1(InterfaceC3530w interfaceC3530w) {
        cb.e eVarQ1 = cb.e.q1(R(), C3093h.a(L(), interfaceC3530w), interfaceC3530w.getName(), L().a().t().a(interfaceC3530w), true);
        C3862t.f(eVarQ1, "createJavaMethod(...)");
        eVarQ1.p1(null, O(), kotlin.collections.r.m(), kotlin.collections.r.m(), kotlin.collections.r.m(), L().g().p(interfaceC3530w.a(), C3355b.b(L0.f5678C, false, false, null, 6, null)), Ra.E.f15105B.a(false, false, true), C1706t.f15170e, null);
        eVarQ1.t1(false, false);
        L().a().h().c(interfaceC3530w, eVarQ1);
        return eVarQ1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<g0> q1(qb.f fVar) {
        Collection<InterfaceC3525r> collectionC = N().invoke().c(fVar);
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(collectionC, 10));
        Iterator<T> it = collectionC.iterator();
        while (it.hasNext()) {
            arrayList.add(Z((InterfaceC3525r) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<g0> r1(qb.f fVar) {
        Set<g0> setB1 = b1(fVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setB1) {
            g0 g0Var = (g0) obj;
            if (!C1938T.d(g0Var) && C1949i.l(g0Var) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final void s0(List<t0> list, InterfaceC1699l interfaceC1699l, int i10, InterfaceC3525r interfaceC3525r, Hb.U u10, Hb.U u11) {
        Sa.h hVarB = Sa.h.f15630e.b();
        qb.f name = interfaceC3525r.getName();
        Hb.U uN = M0.n(u10);
        C3862t.f(uN, "makeNotNullable(...)");
        list.add(new Ua.V(interfaceC1699l, null, i10, hVarB, name, uN, interfaceC3525r.L(), false, false, u11 != null ? M0.n(u11) : null, L().a().t().a(interfaceC3525r)));
    }

    private final boolean s1(g0 g0Var) {
        C1949i c1949i = C1949i.f20255o;
        qb.f name = g0Var.getName();
        C3862t.f(name, "getName(...)");
        if (!c1949i.n(name)) {
            return false;
        }
        qb.f name2 = g0Var.getName();
        C3862t.f(name2, "getName(...)");
        Set<g0> setB1 = b1(name2);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setB1.iterator();
        while (it.hasNext()) {
            InterfaceC1712z interfaceC1712zL = C1949i.l((g0) it.next());
            if (interfaceC1712zL != null) {
                arrayList.add(interfaceC1712zL);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (e1(g0Var, (InterfaceC1712z) it2.next())) {
                return true;
            }
        }
        return false;
    }

    private final void t0(Collection<g0> collection, qb.f fVar, Collection<? extends g0> collection2, boolean z10) {
        Collection<? extends g0> collectionD = C2275a.d(fVar, collection2, collection, R(), L().a().c(), L().a().k().a());
        C3862t.f(collectionD, "resolveOverridesForNonStaticMembers(...)");
        if (!z10) {
            collection.addAll(collectionD);
            return;
        }
        Collection<? extends g0> collection3 = collectionD;
        List listF0 = kotlin.collections.r.F0(collection, collection3);
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(collection3, 10));
        for (g0 g0VarH0 : collection3) {
            g0 g0Var = (g0) C1938T.j(g0VarH0);
            if (g0Var == null) {
                C3862t.d(g0VarH0);
            } else {
                C3862t.d(g0VarH0);
                g0VarH0 = H0(g0VarH0, g0Var, listF0);
            }
            arrayList.add(g0VarH0);
        }
        collection.addAll(arrayList);
    }

    private final void u0(qb.f fVar, Collection<? extends g0> collection, Collection<? extends g0> collection2, Collection<g0> collection3, Ba.l<? super qb.f, ? extends Collection<? extends g0>> lVar) {
        for (g0 g0Var : collection2) {
            Rb.a.a(collection3, l1(g0Var, lVar, fVar, collection));
            Rb.a.a(collection3, k1(g0Var, lVar, collection));
            Rb.a.a(collection3, m1(g0Var, lVar));
        }
    }

    private final void v0(Set<? extends Ra.Z> set, Collection<Ra.Z> collection, Set<Ra.Z> set2, Ba.l<? super qb.f, ? extends Collection<? extends g0>> lVar) {
        for (Ra.Z z10 : set) {
            cb.f fVarJ0 = J0(z10, lVar);
            if (fVarJ0 != null) {
                collection.add(fVarJ0);
                if (set2 != null) {
                    set2.add(z10);
                    return;
                }
                return;
            }
        }
    }

    private final void w0(qb.f fVar, Collection<Ra.Z> collection) {
        InterfaceC3525r interfaceC3525r = (InterfaceC3525r) kotlin.collections.r.K0(N().invoke().c(fVar));
        if (interfaceC3525r == null) {
            return;
        }
        collection.add(L0(this, interfaceC3525r, null, Ra.E.f15106C, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z0(InterfaceC3524q it) {
        C3862t.g(it, "it");
        return !it.g();
    }

    @Override // eb.U
    protected void B(Collection<g0> result, qb.f name) {
        C3862t.g(result, "result");
        C3862t.g(name, "name");
        Set<g0> setB1 = b1(name);
        if (!C1939U.f20204a.k(name) && !C1949i.f20255o.n(name)) {
            Set<g0> set = setB1;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC1712z) it.next()).isSuspend()) {
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (f1((g0) obj)) {
                    arrayList.add(obj);
                }
            }
            t0(result, name, arrayList, false);
            return;
        }
        Rb.l lVarA = Rb.l.f15221D.a();
        Collection<? extends g0> collectionD = C2275a.d(name, setB1, kotlin.collections.r.m(), R(), InterfaceC1016w.f3734a, L().a().k().a());
        C3862t.f(collectionD, "resolveOverridesForNonStaticMembers(...)");
        u0(name, result, collectionD, result, new a(this));
        u0(name, result, collectionD, lVarA, new b(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : setB1) {
            if (f1((g0) obj2)) {
                arrayList2.add(obj2);
            }
        }
        t0(result, name, kotlin.collections.r.F0(arrayList2, lVarA), true);
    }

    @Override // eb.U
    protected void C(qb.f name, Collection<Ra.Z> result) {
        C3862t.g(name, "name");
        C3862t.g(result, "result");
        if (this.f40946o.q()) {
            w0(name, result);
        }
        Set<Ra.Z> setD1 = d1(name);
        if (setD1.isEmpty()) {
            return;
        }
        l.b bVar = Rb.l.f15221D;
        Rb.l lVarA = bVar.a();
        Rb.l lVarA2 = bVar.a();
        v0(setD1, result, lVarA, new C3290w(this));
        v0(kotlin.collections.V.h(setD1, lVarA), lVarA2, null, new C3291x(this));
        Collection<? extends Ra.Z> collectionD = C2275a.d(name, kotlin.collections.V.j(setD1, lVarA2), result, R(), L().a().c(), L().a().k().a());
        C3862t.f(collectionD, "resolveOverridesForNonStaticMembers(...)");
        result.addAll(collectionD);
    }

    @Override // eb.U
    protected Set<qb.f> D(Ab.d kindFilter, Ba.l<? super qb.f, Boolean> lVar) {
        C3862t.g(kindFilter, "kindFilter");
        if (this.f40946o.q()) {
            return a();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(N().invoke().f());
        Collection<Hb.U> collectionS = R().l().s();
        C3862t.f(collectionS, "getSupertypes(...)");
        Iterator<T> it = collectionS.iterator();
        while (it.hasNext()) {
            kotlin.collections.r.D(linkedHashSet, ((Hb.U) it.next()).s().c());
        }
        return linkedHashSet;
    }

    @Override // eb.U
    protected Ra.c0 O() {
        return C4597i.l(R());
    }

    @Override // eb.U
    protected boolean V(cb.e eVar) {
        C3862t.g(eVar, "<this>");
        if (this.f40946o.q()) {
            return false;
        }
        return f1(eVar);
    }

    @Override // eb.U
    protected U.a Y(InterfaceC3525r method, List<? extends m0> methodTypeParameters, Hb.U returnType, List<? extends t0> valueParameters) {
        C3862t.g(method, "method");
        C3862t.g(methodTypeParameters, "methodTypeParameters");
        C3862t.g(returnType, "returnType");
        C3862t.g(valueParameters, "valueParameters");
        o.b bVarB = L().a().s().b(method, R(), returnType, null, valueParameters, methodTypeParameters);
        C3862t.f(bVarB, "resolvePropagatedSignature(...)");
        Hb.U uD = bVarB.d();
        C3862t.f(uD, "getReturnType(...)");
        Hb.U uC = bVarB.c();
        List<t0> listF = bVarB.f();
        C3862t.f(listF, "getValueParameters(...)");
        List<m0> listE = bVarB.e();
        C3862t.f(listE, "getTypeParameters(...)");
        boolean zG = bVarB.g();
        List<String> listB = bVarB.b();
        C3862t.f(listB, "getErrors(...)");
        return new U.a(uD, uC, listF, listE, zG, listB);
    }

    public final Gb.i<List<InterfaceC1691d>> a1() {
        return this.f40948q;
    }

    @Override // eb.U, Ab.l, Ab.k
    public Collection<g0> b(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        n1(name, location);
        return super.b(name, location);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // eb.U
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public InterfaceC1692e R() {
        return this.f40945n;
    }

    @Override // eb.U, Ab.l, Ab.k
    public Collection<Ra.Z> d(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        n1(name, location);
        return super.d(name, location);
    }

    @Override // Ab.l, Ab.n
    public InterfaceC1695h g(qb.f name, Za.b location) {
        Gb.h<qb.f, InterfaceC1692e> hVar;
        InterfaceC1692e interfaceC1692eInvoke;
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        n1(name, location);
        C3293z c3293z = (C3293z) Q();
        return (c3293z == null || (hVar = c3293z.f40952u) == null || (interfaceC1692eInvoke = hVar.invoke(name)) == null) ? this.f40952u.invoke(name) : interfaceC1692eInvoke;
    }

    public void n1(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        Ya.a.a(L().a().l(), location, R(), name);
    }

    @Override // eb.U
    public String toString() {
        return "Lazy Java member scope for " + this.f40946o.f();
    }

    @Override // eb.U
    protected Set<qb.f> v(Ab.d kindFilter, Ba.l<? super qb.f, Boolean> lVar) {
        C3862t.g(kindFilter, "kindFilter");
        return kotlin.collections.V.j(this.f40949r.invoke(), this.f40951t.invoke().keySet());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // eb.U
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet<qb.f> x(Ab.d kindFilter, Ba.l<? super qb.f, Boolean> lVar) {
        C3862t.g(kindFilter, "kindFilter");
        Collection<Hb.U> collectionS = R().l().s();
        C3862t.f(collectionS, "getSupertypes(...)");
        LinkedHashSet<qb.f> linkedHashSet = new LinkedHashSet<>();
        Iterator<T> it = collectionS.iterator();
        while (it.hasNext()) {
            kotlin.collections.r.D(linkedHashSet, ((Hb.U) it.next()).s().a());
        }
        linkedHashSet.addAll(N().invoke().a());
        linkedHashSet.addAll(N().invoke().e());
        linkedHashSet.addAll(v(kindFilter, lVar));
        linkedHashSet.addAll(L().a().w().e(R(), L()));
        return linkedHashSet;
    }

    @Override // eb.U
    protected void y(Collection<g0> result, qb.f name) {
        C3862t.g(result, "result");
        C3862t.g(name, "name");
        if (this.f40946o.t() && N().invoke().b(name) != null) {
            Collection<g0> collection = result;
            if (collection.isEmpty()) {
                InterfaceC3530w interfaceC3530wB = N().invoke().b(name);
                C3862t.d(interfaceC3530wB);
                result.add(p1(interfaceC3530wB));
            } else {
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    if (((g0) it.next()).k().isEmpty()) {
                        break;
                    }
                }
                InterfaceC3530w interfaceC3530wB2 = N().invoke().b(name);
                C3862t.d(interfaceC3530wB2);
                result.add(p1(interfaceC3530wB2));
            }
        }
        L().a().w().d(R(), name, result, L());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // eb.U
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public C3270b z() {
        return new C3270b(this.f40946o, C3288u.f40939B);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3293z(C3096k c10, InterfaceC1692e ownerDescriptor, InterfaceC3514g jClass, boolean z10, C3293z c3293z) {
        super(c10, c3293z);
        C3862t.g(c10, "c");
        C3862t.g(ownerDescriptor, "ownerDescriptor");
        C3862t.g(jClass, "jClass");
        this.f40945n = ownerDescriptor;
        this.f40946o = jClass;
        this.f40947p = z10;
        this.f40948q = c10.e().g(new C3284p(this, c10));
        this.f40949r = c10.e().g(new C3285q(this));
        this.f40950s = c10.e().g(new r(c10, this));
        this.f40951t = c10.e().g(new C3286s(this));
        this.f40952u = c10.e().e(new C3287t(this, c10));
    }
}
