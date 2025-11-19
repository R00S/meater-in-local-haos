package eb;

import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.g0;
import Rb.b;
import bb.C2275a;
import db.C3096k;
import hb.InterfaceC3514g;
import hb.InterfaceC3524q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import tb.C4596h;

/* compiled from: LazyJavaStaticClassScope.kt */
/* loaded from: classes3.dex */
public final class a0 extends b0 {

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC3514g f40875n;

    /* renamed from: o, reason: collision with root package name */
    private final cb.c f40876o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(C3096k c10, InterfaceC3514g jClass, cb.c ownerDescriptor) {
        super(c10);
        C3862t.g(c10, "c");
        C3862t.g(jClass, "jClass");
        C3862t.g(ownerDescriptor, "ownerDescriptor");
        this.f40875n = jClass;
        this.f40876o = ownerDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m0(InterfaceC3524q it) {
        C3862t.g(it, "it");
        return it.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection n0(qb.f fVar, Ab.k it) {
        C3862t.g(it, "it");
        return it.d(fVar, Za.d.f19639P);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection o0(Ab.k it) {
        C3862t.g(it, "it");
        return it.c();
    }

    private final <R> Set<R> p0(InterfaceC1692e interfaceC1692e, Set<R> set, Ba.l<? super Ab.k, ? extends Collection<? extends R>> lVar) {
        Rb.b.b(kotlin.collections.r.e(interfaceC1692e), Y.f40872a, new a(interfaceC1692e, set, lVar));
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable q0(InterfaceC1692e interfaceC1692e) {
        Collection<Hb.U> collectionS = interfaceC1692e.l().s();
        C3862t.f(collectionS, "getSupertypes(...)");
        return Tb.k.k(Tb.k.B(kotlin.collections.r.Z(collectionS), Z.f40873B));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1692e r0(Hb.U u10) {
        InterfaceC1695h interfaceC1695hT = u10.O0().t();
        if (interfaceC1695hT instanceof InterfaceC1692e) {
            return (InterfaceC1692e) interfaceC1695hT;
        }
        return null;
    }

    private final Ra.Z t0(Ra.Z z10) {
        if (z10.i().c()) {
            return z10;
        }
        Collection<? extends Ra.Z> collectionG = z10.g();
        C3862t.f(collectionG, "getOverriddenDescriptors(...)");
        Collection<? extends Ra.Z> collection = collectionG;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(collection, 10));
        for (Ra.Z z11 : collection) {
            C3862t.d(z11);
            arrayList.add(t0(z11));
        }
        return (Ra.Z) kotlin.collections.r.J0(kotlin.collections.r.c0(arrayList));
    }

    private final Set<g0> u0(qb.f fVar, InterfaceC1692e interfaceC1692e) {
        a0 a0VarB = cb.h.b(interfaceC1692e);
        return a0VarB == null ? kotlin.collections.V.d() : kotlin.collections.r.b1(a0VarB.b(fVar, Za.d.f19639P));
    }

    @Override // eb.U
    protected void B(Collection<g0> result, qb.f name) {
        C3862t.g(result, "result");
        C3862t.g(name, "name");
        Collection<? extends g0> collectionE = C2275a.e(name, u0(name, R()), result, R(), L().a().c(), L().a().k().a());
        C3862t.f(collectionE, "resolveOverridesForStaticMembers(...)");
        result.addAll(collectionE);
        if (this.f40875n.C()) {
            if (C3862t.b(name, Oa.p.f13379f)) {
                g0 g0VarG = C4596h.g(R());
                C3862t.f(g0VarG, "createEnumValueOfMethod(...)");
                result.add(g0VarG);
            } else if (C3862t.b(name, Oa.p.f13377d)) {
                g0 g0VarH = C4596h.h(R());
                C3862t.f(g0VarH, "createEnumValuesMethod(...)");
                result.add(g0VarH);
            }
        }
    }

    @Override // eb.b0, eb.U
    protected void C(qb.f name, Collection<Ra.Z> result) {
        C3862t.g(name, "name");
        C3862t.g(result, "result");
        Set setP0 = p0(R(), new LinkedHashSet(), new X(name));
        if (result.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : setP0) {
                Ra.Z zT0 = t0((Ra.Z) obj);
                Object arrayList = linkedHashMap.get(zT0);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(zT0, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collectionE = C2275a.e(name, (Collection) ((Map.Entry) it.next()).getValue(), result, R(), L().a().c(), L().a().k().a());
                C3862t.f(collectionE, "resolveOverridesForStaticMembers(...)");
                kotlin.collections.r.D(arrayList2, collectionE);
            }
            result.addAll(arrayList2);
        } else {
            Collection<? extends Ra.Z> collectionE2 = C2275a.e(name, setP0, result, R(), L().a().c(), L().a().k().a());
            C3862t.f(collectionE2, "resolveOverridesForStaticMembers(...)");
            result.addAll(collectionE2);
        }
        if (this.f40875n.C() && C3862t.b(name, Oa.p.f13378e)) {
            Rb.a.a(result, C4596h.f(R()));
        }
    }

    @Override // eb.U
    protected Set<qb.f> D(Ab.d kindFilter, Ba.l<? super qb.f, Boolean> lVar) {
        C3862t.g(kindFilter, "kindFilter");
        Set<qb.f> setA1 = kotlin.collections.r.a1(N().invoke().f());
        p0(R(), setA1, W.f40870B);
        if (this.f40875n.C()) {
            setA1.add(Oa.p.f13378e);
        }
        return setA1;
    }

    @Override // Ab.l, Ab.n
    public InterfaceC1695h g(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // eb.U
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public C3270b z() {
        return new C3270b(this.f40875n, V.f40869B);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // eb.U
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public cb.c R() {
        return this.f40876o;
    }

    @Override // eb.U
    protected Set<qb.f> v(Ab.d kindFilter, Ba.l<? super qb.f, Boolean> lVar) {
        C3862t.g(kindFilter, "kindFilter");
        return kotlin.collections.V.d();
    }

    @Override // eb.U
    protected Set<qb.f> x(Ab.d kindFilter, Ba.l<? super qb.f, Boolean> lVar) {
        C3862t.g(kindFilter, "kindFilter");
        Set<qb.f> setA1 = kotlin.collections.r.a1(N().invoke().a());
        a0 a0VarB = cb.h.b(R());
        Set<qb.f> setA = a0VarB != null ? a0VarB.a() : null;
        if (setA == null) {
            setA = kotlin.collections.V.d();
        }
        setA1.addAll(setA);
        if (this.f40875n.C()) {
            setA1.addAll(kotlin.collections.r.p(Oa.p.f13379f, Oa.p.f13377d));
        }
        setA1.addAll(L().a().w().h(R(), L()));
        return setA1;
    }

    @Override // eb.U
    protected void y(Collection<g0> result, qb.f name) {
        C3862t.g(result, "result");
        C3862t.g(name, "name");
        L().a().w().b(R(), name, result, L());
    }

    /* compiled from: LazyJavaStaticClassScope.kt */
    public static final class a extends b.AbstractC0223b<InterfaceC1692e, C4153F> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1692e f40877a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set<R> f40878b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ba.l<Ab.k, Collection<R>> f40879c;

        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC1692e interfaceC1692e, Set<R> set, Ba.l<? super Ab.k, ? extends Collection<? extends R>> lVar) {
            this.f40877a = interfaceC1692e;
            this.f40878b = set;
            this.f40879c = lVar;
        }

        @Override // Rb.b.d
        public /* bridge */ /* synthetic */ Object a() {
            e();
            return C4153F.f46609a;
        }

        @Override // Rb.b.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean c(InterfaceC1692e current) {
            C3862t.g(current, "current");
            if (current == this.f40877a) {
                return true;
            }
            Ab.k kVarQ = current.Q();
            C3862t.f(kVarQ, "getStaticScope(...)");
            if (!(kVarQ instanceof b0)) {
                return true;
            }
            this.f40878b.addAll((Collection) this.f40879c.invoke(kVarQ));
            return false;
        }

        public void e() {
        }
    }
}
