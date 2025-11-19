package Ab;

import Ra.EnumC1693f;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.Z;
import Ra.g0;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import tb.C4596h;

/* compiled from: StaticScopeForKotlinEnum.kt */
/* loaded from: classes3.dex */
public final class q extends l {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ Ia.m<Object>[] f1153f = {P.h(new G(P.b(q.class), "functions", "getFunctions()Ljava/util/List;")), P.h(new G(P.b(q.class), "properties", "getProperties()Ljava/util/List;"))};

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1692e f1154b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f1155c;

    /* renamed from: d, reason: collision with root package name */
    private final Gb.i f1156d;

    /* renamed from: e, reason: collision with root package name */
    private final Gb.i f1157e;

    public q(Gb.n storageManager, InterfaceC1692e containingClass, boolean z10) {
        C3862t.g(storageManager, "storageManager");
        C3862t.g(containingClass, "containingClass");
        this.f1154b = containingClass;
        this.f1155c = z10;
        containingClass.i();
        EnumC1693f enumC1693f = EnumC1693f.f15143C;
        this.f1156d = storageManager.g(new o(this));
        this.f1157e = storageManager.g(new p(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List j(q qVar) {
        return kotlin.collections.r.p(C4596h.g(qVar.f1154b), C4596h.h(qVar.f1154b));
    }

    private final List<g0> n() {
        return (List) Gb.m.a(this.f1156d, this, f1153f[0]);
    }

    private final List<Z> o() {
        return (List) Gb.m.a(this.f1157e, this, f1153f[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List p(q qVar) {
        return qVar.f1155c ? kotlin.collections.r.q(C4596h.f(qVar.f1154b)) : kotlin.collections.r.m();
    }

    @Override // Ab.l, Ab.k
    public Collection<Z> d(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        List<Z> listO = o();
        Rb.k kVar = new Rb.k();
        for (Object obj : listO) {
            if (C3862t.b(((Z) obj).getName(), name)) {
                kVar.add(obj);
            }
        }
        return kVar;
    }

    @Override // Ab.l, Ab.n
    public /* bridge */ /* synthetic */ InterfaceC1695h g(qb.f fVar, Za.b bVar) {
        return (InterfaceC1695h) k(fVar, bVar);
    }

    public Void k(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        return null;
    }

    @Override // Ab.l, Ab.n
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public List<InterfaceC1689b> f(d kindFilter, Ba.l<? super qb.f, Boolean> nameFilter) {
        C3862t.g(kindFilter, "kindFilter");
        C3862t.g(nameFilter, "nameFilter");
        return kotlin.collections.r.F0(n(), o());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ab.l, Ab.k
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Rb.k<g0> b(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        List<g0> listN = n();
        Rb.k<g0> kVar = new Rb.k<>();
        for (Object obj : listN) {
            if (C3862t.b(((g0) obj).getName(), name)) {
                kVar.add(obj);
            }
        }
        return kVar;
    }
}
