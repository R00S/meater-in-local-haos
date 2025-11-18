package eb;

import Ab.c;
import Hb.L0;
import Hb.M0;
import Ra.InterfaceC1688a;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1712z;
import Ra.g0;
import Ra.m0;
import Ra.t0;
import Ra.u0;
import ab.C1940V;
import db.C3088c;
import db.C3093h;
import db.C3096k;
import fb.C3354a;
import fb.C3355b;
import hb.InterfaceC3505B;
import hb.InterfaceC3513f;
import hb.InterfaceC3521n;
import hb.InterfaceC3525r;
import hb.InterfaceC3531x;
import hb.InterfaceC3532y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jb.C3759C;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4170o;
import tb.C4596h;
import tb.C4597i;
import tb.C4606r;
import vb.AbstractC4943g;

/* compiled from: LazyJavaScope.kt */
/* loaded from: classes3.dex */
public abstract class U extends Ab.l {

    /* renamed from: m, reason: collision with root package name */
    static final /* synthetic */ Ia.m<Object>[] f40849m = {kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(U.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(U.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(U.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};

    /* renamed from: b, reason: collision with root package name */
    private final C3096k f40850b;

    /* renamed from: c, reason: collision with root package name */
    private final U f40851c;

    /* renamed from: d, reason: collision with root package name */
    private final Gb.i<Collection<InterfaceC1700m>> f40852d;

    /* renamed from: e, reason: collision with root package name */
    private final Gb.i<InterfaceC3271c> f40853e;

    /* renamed from: f, reason: collision with root package name */
    private final Gb.g<qb.f, Collection<g0>> f40854f;

    /* renamed from: g, reason: collision with root package name */
    private final Gb.h<qb.f, Ra.Z> f40855g;

    /* renamed from: h, reason: collision with root package name */
    private final Gb.g<qb.f, Collection<g0>> f40856h;

    /* renamed from: i, reason: collision with root package name */
    private final Gb.i f40857i;

    /* renamed from: j, reason: collision with root package name */
    private final Gb.i f40858j;

    /* renamed from: k, reason: collision with root package name */
    private final Gb.i f40859k;

    /* renamed from: l, reason: collision with root package name */
    private final Gb.g<qb.f, List<Ra.Z>> f40860l;

    /* compiled from: LazyJavaScope.kt */
    protected static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Hb.U f40861a;

        /* renamed from: b, reason: collision with root package name */
        private final Hb.U f40862b;

        /* renamed from: c, reason: collision with root package name */
        private final List<t0> f40863c;

        /* renamed from: d, reason: collision with root package name */
        private final List<m0> f40864d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f40865e;

        /* renamed from: f, reason: collision with root package name */
        private final List<String> f40866f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Hb.U returnType, Hb.U u10, List<? extends t0> valueParameters, List<? extends m0> typeParameters, boolean z10, List<String> errors) {
            C3862t.g(returnType, "returnType");
            C3862t.g(valueParameters, "valueParameters");
            C3862t.g(typeParameters, "typeParameters");
            C3862t.g(errors, "errors");
            this.f40861a = returnType;
            this.f40862b = u10;
            this.f40863c = valueParameters;
            this.f40864d = typeParameters;
            this.f40865e = z10;
            this.f40866f = errors;
        }

        public final List<String> a() {
            return this.f40866f;
        }

        public final boolean b() {
            return this.f40865e;
        }

        public final Hb.U c() {
            return this.f40862b;
        }

        public final Hb.U d() {
            return this.f40861a;
        }

        public final List<m0> e() {
            return this.f40864d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C3862t.b(this.f40861a, aVar.f40861a) && C3862t.b(this.f40862b, aVar.f40862b) && C3862t.b(this.f40863c, aVar.f40863c) && C3862t.b(this.f40864d, aVar.f40864d) && this.f40865e == aVar.f40865e && C3862t.b(this.f40866f, aVar.f40866f);
        }

        public final List<t0> f() {
            return this.f40863c;
        }

        public int hashCode() {
            int iHashCode = this.f40861a.hashCode() * 31;
            Hb.U u10 = this.f40862b;
            return ((((((((iHashCode + (u10 == null ? 0 : u10.hashCode())) * 31) + this.f40863c.hashCode()) * 31) + this.f40864d.hashCode()) * 31) + Boolean.hashCode(this.f40865e)) * 31) + this.f40866f.hashCode();
        }

        public String toString() {
            return "MethodSignatureData(returnType=" + this.f40861a + ", receiverType=" + this.f40862b + ", valueParameters=" + this.f40863c + ", typeParameters=" + this.f40864d + ", hasStableParameterNames=" + this.f40865e + ", errors=" + this.f40866f + ')';
        }
    }

    /* compiled from: LazyJavaScope.kt */
    protected static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List<t0> f40867a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f40868b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends t0> descriptors, boolean z10) {
            C3862t.g(descriptors, "descriptors");
            this.f40867a = descriptors;
            this.f40868b = z10;
        }

        public final List<t0> a() {
            return this.f40867a;
        }

        public final boolean b() {
            return this.f40868b;
        }
    }

    public /* synthetic */ U(C3096k c3096k, U u10, int i10, C3854k c3854k) {
        this(c3096k, (i10 & 2) != 0 ? null : u10);
    }

    private final Ua.K E(InterfaceC3521n interfaceC3521n) {
        cb.f fVarG1 = cb.f.g1(R(), C3093h.a(this.f40850b, interfaceC3521n), Ra.E.f15106C, C1940V.d(interfaceC3521n.getVisibility()), !interfaceC3521n.isFinal(), interfaceC3521n.getName(), this.f40850b.a().t().a(interfaceC3521n), U(interfaceC3521n));
        C3862t.f(fVarG1, "create(...)");
        return fVarG1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ra.Z F(U u10, qb.f name) {
        C3862t.g(name, "name");
        U u11 = u10.f40851c;
        if (u11 != null) {
            return u11.f40855g.invoke(name);
        }
        InterfaceC3521n interfaceC3521nD = u10.f40853e.invoke().d(name);
        if (interfaceC3521nD == null || interfaceC3521nD.G()) {
            return null;
        }
        return u10.a0(interfaceC3521nD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection G(U u10, qb.f name) {
        C3862t.g(name, "name");
        U u11 = u10.f40851c;
        if (u11 != null) {
            return u11.f40854f.invoke(name);
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC3525r interfaceC3525r : u10.f40853e.invoke().c(name)) {
            cb.e eVarZ = u10.Z(interfaceC3525r);
            if (u10.V(eVarZ)) {
                u10.f40850b.a().h().c(interfaceC3525r, eVarZ);
                arrayList.add(eVarZ);
            }
        }
        u10.y(arrayList, name);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3271c H(U u10) {
        return u10.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set I(U u10) {
        return u10.x(Ab.d.f1128v, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection J(U u10, qb.f name) {
        C3862t.g(name, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet(u10.f40854f.invoke(name));
        u10.e0(linkedHashSet);
        u10.B(linkedHashSet, name);
        return kotlin.collections.r.W0(u10.f40850b.a().r().p(u10.f40850b, linkedHashSet));
    }

    private final Set<qb.f> M() {
        return (Set) Gb.m.a(this.f40859k, this, f40849m[2]);
    }

    private final Set<qb.f> P() {
        return (Set) Gb.m.a(this.f40857i, this, f40849m[0]);
    }

    private final Set<qb.f> S() {
        return (Set) Gb.m.a(this.f40858j, this, f40849m[1]);
    }

    private final Hb.U T(InterfaceC3521n interfaceC3521n) {
        Hb.U uP = this.f40850b.g().p(interfaceC3521n.a(), C3355b.b(L0.f5678C, false, false, null, 7, null));
        if ((!Oa.j.s0(uP) && !Oa.j.v0(uP)) || !U(interfaceC3521n) || !interfaceC3521n.O()) {
            return uP;
        }
        Hb.U uN = M0.n(uP);
        C3862t.f(uN, "makeNotNullable(...)");
        return uN;
    }

    private final boolean U(InterfaceC3521n interfaceC3521n) {
        return interfaceC3521n.isFinal() && interfaceC3521n.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List W(U u10, qb.f name) {
        C3862t.g(name, "name");
        ArrayList arrayList = new ArrayList();
        Rb.a.a(arrayList, u10.f40855g.invoke(name));
        u10.C(name, arrayList);
        return C4597i.t(u10.R()) ? kotlin.collections.r.W0(arrayList) : kotlin.collections.r.W0(u10.f40850b.a().r().p(u10.f40850b, arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set X(U u10) {
        return u10.D(Ab.d.f1129w, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, Ua.K] */
    /* JADX WARN: Type inference failed for: r1v15, types: [T, Ua.K] */
    private final Ra.Z a0(InterfaceC3521n interfaceC3521n) {
        kotlin.jvm.internal.O o10 = new kotlin.jvm.internal.O();
        ?? E10 = E(interfaceC3521n);
        o10.f43978B = E10;
        E10.W0(null, null, null, null);
        ((Ua.K) o10.f43978B).c1(T(interfaceC3521n), kotlin.collections.r.m(), O(), null, kotlin.collections.r.m());
        InterfaceC1700m interfaceC1700mR = R();
        InterfaceC1692e interfaceC1692e = interfaceC1700mR instanceof InterfaceC1692e ? (InterfaceC1692e) interfaceC1700mR : null;
        if (interfaceC1692e != null) {
            o10.f43978B = this.f40850b.a().w().f(interfaceC1692e, (Ua.K) o10.f43978B, this.f40850b);
        }
        T t10 = o10.f43978B;
        if (C4597i.K((u0) t10, ((Ua.K) t10).a())) {
            ((Ua.K) o10.f43978B).M0(new I(this, interfaceC3521n, o10));
        }
        this.f40850b.a().h().b(interfaceC3521n, (Ra.Z) o10.f43978B);
        return (Ra.Z) o10.f43978B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gb.j b0(U u10, InterfaceC3521n interfaceC3521n, kotlin.jvm.internal.O o10) {
        return u10.f40850b.e().i(new J(u10, interfaceC3521n, o10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC4943g c0(U u10, InterfaceC3521n interfaceC3521n, kotlin.jvm.internal.O o10) {
        return u10.f40850b.a().g().a(interfaceC3521n, (Ra.Z) o10.f43978B);
    }

    private final void e0(Set<g0> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            String strC = C3759C.c((g0) obj, false, false, 2, null);
            Object arrayList = linkedHashMap.get(strC);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strC, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                List list2 = list;
                Collection<? extends g0> collectionB = C4606r.b(list2, T.f40848B);
                set.removeAll(list2);
                set.addAll(collectionB);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1688a f0(g0 selectMostSpecificInEachOverridableGroup) {
        C3862t.g(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection t(U u10) {
        return u10.w(Ab.d.f1121o, Ab.k.f1147a.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set u(U u10) {
        return u10.v(Ab.d.f1126t, null);
    }

    protected final Hb.U A(InterfaceC3525r method, C3096k c10) {
        C3862t.g(method, "method");
        C3862t.g(c10, "c");
        return c10.g().p(method.getReturnType(), C3355b.b(L0.f5678C, method.P().q(), false, null, 6, null));
    }

    protected abstract void B(Collection<g0> collection, qb.f fVar);

    protected abstract void C(qb.f fVar, Collection<Ra.Z> collection);

    protected abstract Set<qb.f> D(Ab.d dVar, Ba.l<? super qb.f, Boolean> lVar);

    protected final Gb.i<Collection<InterfaceC1700m>> K() {
        return this.f40852d;
    }

    protected final C3096k L() {
        return this.f40850b;
    }

    protected final Gb.i<InterfaceC3271c> N() {
        return this.f40853e;
    }

    protected abstract Ra.c0 O();

    protected final U Q() {
        return this.f40851c;
    }

    protected abstract InterfaceC1700m R();

    protected boolean V(cb.e eVar) {
        C3862t.g(eVar, "<this>");
        return true;
    }

    protected abstract a Y(InterfaceC3525r interfaceC3525r, List<? extends m0> list, Hb.U u10, List<? extends t0> list2);

    protected final cb.e Z(InterfaceC3525r method) {
        C3862t.g(method, "method");
        cb.e eVarQ1 = cb.e.q1(R(), C3093h.a(this.f40850b, method), method.getName(), this.f40850b.a().t().a(method), this.f40853e.invoke().b(method.getName()) != null && method.k().isEmpty());
        C3862t.f(eVarQ1, "createJavaMethod(...)");
        C3096k c3096kI = C3088c.i(this.f40850b, eVarQ1, method, 0, 4, null);
        List<InterfaceC3532y> typeParameters = method.getTypeParameters();
        List<? extends m0> arrayList = new ArrayList<>(kotlin.collections.r.x(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            m0 m0VarA = c3096kI.f().a((InterfaceC3532y) it.next());
            C3862t.d(m0VarA);
            arrayList.add(m0VarA);
        }
        b bVarD0 = d0(c3096kI, eVarQ1, method.k());
        a aVarY = Y(method, arrayList, A(method, c3096kI), bVarD0.a());
        Hb.U uC = aVarY.c();
        eVarQ1.p1(uC != null ? C4596h.i(eVarQ1, uC, Sa.h.f15630e.b()) : null, O(), kotlin.collections.r.m(), aVarY.e(), aVarY.f(), aVarY.d(), Ra.E.f15105B.a(false, method.isAbstract(), true ^ method.isFinal()), C1940V.d(method.getVisibility()), aVarY.c() != null ? kotlin.collections.M.e(oa.v.a(cb.e.f31130h0, kotlin.collections.r.j0(bVarD0.a()))) : kotlin.collections.M.h());
        eVarQ1.t1(aVarY.b(), bVarD0.b());
        if (!aVarY.a().isEmpty()) {
            c3096kI.a().s().a(eVarQ1, aVarY.a());
        }
        return eVarQ1;
    }

    @Override // Ab.l, Ab.k
    public Set<qb.f> a() {
        return P();
    }

    @Override // Ab.l, Ab.k
    public Collection<g0> b(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        return !a().contains(name) ? kotlin.collections.r.m() : this.f40856h.invoke(name);
    }

    @Override // Ab.l, Ab.k
    public Set<qb.f> c() {
        return S();
    }

    @Override // Ab.l, Ab.k
    public Collection<Ra.Z> d(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        return !c().contains(name) ? kotlin.collections.r.m() : this.f40860l.invoke(name);
    }

    protected final b d0(C3096k c3096k, InterfaceC1712z function, List<? extends InterfaceC3505B> jValueParameters) {
        C4170o c4170oA;
        qb.f name;
        C3096k c10 = c3096k;
        C3862t.g(c10, "c");
        C3862t.g(function, "function");
        C3862t.g(jValueParameters, "jValueParameters");
        Iterable<IndexedValue> iterableD1 = kotlin.collections.r.d1(jValueParameters);
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(iterableD1, 10));
        boolean z10 = false;
        for (IndexedValue indexedValue : iterableD1) {
            int index = indexedValue.getIndex();
            InterfaceC3505B interfaceC3505B = (InterfaceC3505B) indexedValue.b();
            Sa.h hVarA = C3093h.a(c10, interfaceC3505B);
            C3354a c3354aB = C3355b.b(L0.f5678C, false, false, null, 7, null);
            if (interfaceC3505B.j()) {
                InterfaceC3531x interfaceC3531xA = interfaceC3505B.a();
                InterfaceC3513f interfaceC3513f = interfaceC3531xA instanceof InterfaceC3513f ? (InterfaceC3513f) interfaceC3531xA : null;
                if (interfaceC3513f == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + interfaceC3505B);
                }
                Hb.U uL = c3096k.g().l(interfaceC3513f, c3354aB, true);
                c4170oA = oa.v.a(uL, c3096k.d().q().k(uL));
            } else {
                c4170oA = oa.v.a(c3096k.g().p(interfaceC3505B.a(), c3354aB), null);
            }
            Hb.U u10 = (Hb.U) c4170oA.a();
            Hb.U u11 = (Hb.U) c4170oA.b();
            if (C3862t.b(function.getName().j(), "equals") && jValueParameters.size() == 1 && C3862t.b(c3096k.d().q().I(), u10)) {
                name = qb.f.t("other");
            } else {
                name = interfaceC3505B.getName();
                if (name == null) {
                    z10 = true;
                }
                if (name == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append('p');
                    sb2.append(index);
                    name = qb.f.t(sb2.toString());
                    C3862t.f(name, "identifier(...)");
                }
            }
            boolean z11 = z10;
            qb.f fVar = name;
            C3862t.d(fVar);
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new Ua.V(function, null, index, hVarA, fVar, u10, false, false, false, u11, c3096k.a().t().a(interfaceC3505B)));
            arrayList = arrayList2;
            z10 = z11;
            c10 = c3096k;
        }
        return new b(kotlin.collections.r.W0(arrayList), z10);
    }

    @Override // Ab.l, Ab.k
    public Set<qb.f> e() {
        return M();
    }

    @Override // Ab.l, Ab.n
    public Collection<InterfaceC1700m> f(Ab.d kindFilter, Ba.l<? super qb.f, Boolean> nameFilter) {
        C3862t.g(kindFilter, "kindFilter");
        C3862t.g(nameFilter, "nameFilter");
        return this.f40852d.invoke();
    }

    public String toString() {
        return "Lazy scope for " + R();
    }

    protected abstract Set<qb.f> v(Ab.d dVar, Ba.l<? super qb.f, Boolean> lVar);

    protected final List<InterfaceC1700m> w(Ab.d kindFilter, Ba.l<? super qb.f, Boolean> nameFilter) {
        C3862t.g(kindFilter, "kindFilter");
        C3862t.g(nameFilter, "nameFilter");
        Za.d dVar = Za.d.f19637N;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (kindFilter.a(Ab.d.f1109c.c())) {
            for (qb.f fVar : v(kindFilter, nameFilter)) {
                if (nameFilter.invoke(fVar).booleanValue()) {
                    Rb.a.a(linkedHashSet, g(fVar, dVar));
                }
            }
        }
        if (kindFilter.a(Ab.d.f1109c.d()) && !kindFilter.l().contains(c.a.f1106a)) {
            for (qb.f fVar2 : x(kindFilter, nameFilter)) {
                if (nameFilter.invoke(fVar2).booleanValue()) {
                    linkedHashSet.addAll(b(fVar2, dVar));
                }
            }
        }
        if (kindFilter.a(Ab.d.f1109c.i()) && !kindFilter.l().contains(c.a.f1106a)) {
            for (qb.f fVar3 : D(kindFilter, nameFilter)) {
                if (nameFilter.invoke(fVar3).booleanValue()) {
                    linkedHashSet.addAll(d(fVar3, dVar));
                }
            }
        }
        return kotlin.collections.r.W0(linkedHashSet);
    }

    protected abstract Set<qb.f> x(Ab.d dVar, Ba.l<? super qb.f, Boolean> lVar);

    protected void y(Collection<g0> result, qb.f name) {
        C3862t.g(result, "result");
        C3862t.g(name, "name");
    }

    protected abstract InterfaceC3271c z();

    public U(C3096k c10, U u10) {
        C3862t.g(c10, "c");
        this.f40850b = c10;
        this.f40851c = u10;
        this.f40852d = c10.e().f(new H(this), kotlin.collections.r.m());
        this.f40853e = c10.e().g(new K(this));
        this.f40854f = c10.e().h(new L(this));
        this.f40855g = c10.e().e(new M(this));
        this.f40856h = c10.e().h(new N(this));
        this.f40857i = c10.e().g(new O(this));
        this.f40858j = c10.e().g(new P(this));
        this.f40859k = c10.e().g(new Q(this));
        this.f40860l = c10.e().h(new S(this));
    }
}
