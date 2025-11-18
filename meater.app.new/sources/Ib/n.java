package Ib;

import Hb.E0;
import Hb.P0;
import Hb.U;
import Ra.InterfaceC1695h;
import Ra.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4164i;
import ub.InterfaceC4700b;

/* compiled from: NewCapturedType.kt */
/* loaded from: classes3.dex */
public final class n implements InterfaceC4700b {

    /* renamed from: a, reason: collision with root package name */
    private final E0 f6995a;

    /* renamed from: b, reason: collision with root package name */
    private Ba.a<? extends List<? extends P0>> f6996b;

    /* renamed from: c, reason: collision with root package name */
    private final n f6997c;

    /* renamed from: d, reason: collision with root package name */
    private final m0 f6998d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC4164i f6999e;

    public n(E0 projection, Ba.a<? extends List<? extends P0>> aVar, n nVar, m0 m0Var) {
        C3862t.g(projection, "projection");
        this.f6995a = projection;
        this.f6996b = aVar;
        this.f6997c = nVar;
        this.f6998d = m0Var;
        this.f6999e = C4165j.b(EnumC4168m.f46627C, new j(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d(n nVar) {
        Ba.a<? extends List<? extends P0>> aVar = nVar.f6996b;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    private final List<P0> j() {
        return (List) this.f6999e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List n(n nVar, g gVar) {
        List<P0> listS = nVar.s();
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(listS, 10));
        Iterator<T> it = listS.iterator();
        while (it.hasNext()) {
            arrayList.add(((P0) it.next()).T0(gVar));
        }
        return arrayList;
    }

    @Override // ub.InterfaceC4700b
    public E0 b() {
        return this.f6995a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C3862t.b(n.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C3862t.e(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        n nVar = (n) obj;
        n nVar2 = this.f6997c;
        if (nVar2 == null) {
            nVar2 = this;
        }
        n nVar3 = nVar.f6997c;
        if (nVar3 != null) {
            obj = nVar3;
        }
        return nVar2 == obj;
    }

    @Override // Hb.y0
    public List<m0> getParameters() {
        return kotlin.collections.r.m();
    }

    public int hashCode() {
        n nVar = this.f6997c;
        return nVar != null ? nVar.hashCode() : super.hashCode();
    }

    @Override // Hb.y0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public List<P0> s() {
        List<P0> listJ = j();
        return listJ == null ? kotlin.collections.r.m() : listJ;
    }

    public final void k(List<? extends P0> supertypes) {
        C3862t.g(supertypes, "supertypes");
        this.f6996b = new l(supertypes);
    }

    @Override // Hb.y0
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public n r(g kotlinTypeRefiner) {
        C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        E0 e0R = b().r(kotlinTypeRefiner);
        C3862t.f(e0R, "refine(...)");
        m mVar = this.f6996b != null ? new m(this, kotlinTypeRefiner) : null;
        n nVar = this.f6997c;
        if (nVar == null) {
            nVar = this;
        }
        return new n(e0R, mVar, nVar, this.f6998d);
    }

    @Override // Hb.y0
    public Oa.j q() {
        U uA = b().a();
        C3862t.f(uA, "getType(...)");
        return Mb.d.n(uA);
    }

    @Override // Hb.y0
    public InterfaceC1695h t() {
        return null;
    }

    public String toString() {
        return "CapturedType(" + b() + ')';
    }

    @Override // Hb.y0
    public boolean u() {
        return false;
    }

    public /* synthetic */ n(E0 e02, Ba.a aVar, n nVar, m0 m0Var, int i10, C3854k c3854k) {
        this(e02, (i10 & 2) != 0 ? null : aVar, (i10 & 4) != 0 ? null : nVar, (i10 & 8) != 0 ? null : m0Var);
    }

    public /* synthetic */ n(E0 e02, List list, n nVar, int i10, C3854k c3854k) {
        this(e02, list, (i10 & 4) != 0 ? null : nVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(E0 projection, List<? extends P0> supertypes, n nVar) {
        this(projection, new k(supertypes), nVar, null, 8, null);
        C3862t.g(projection, "projection");
        C3862t.g(supertypes, "supertypes");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List l(List list) {
        return list;
    }
}
