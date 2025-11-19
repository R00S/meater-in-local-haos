package db;

import Ra.N;
import Ra.U;
import ab.C1960t;
import db.InterfaceC3101p;
import eb.C3268D;
import hb.InterfaceC3528u;
import java.util.Collection;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import oa.C4165j;
import oa.InterfaceC4156a;

/* compiled from: LazyJavaPackageFragmentProvider.kt */
/* renamed from: db.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3095j implements U {

    /* renamed from: a, reason: collision with root package name */
    private final C3096k f39911a;

    /* renamed from: b, reason: collision with root package name */
    private final Gb.a<qb.c, C3268D> f39912b;

    public C3095j(C3089d components) {
        C3862t.g(components, "components");
        C3096k c3096k = new C3096k(components, InterfaceC3101p.a.f39925a, C4165j.c(null));
        this.f39911a = c3096k;
        this.f39912b = c3096k.e().d();
    }

    private final C3268D e(qb.c cVar) {
        InterfaceC3528u interfaceC3528uA = C1960t.a(this.f39911a.a().d(), cVar, false, 2, null);
        if (interfaceC3528uA == null) {
            return null;
        }
        return this.f39912b.a(cVar, new C3094i(this, interfaceC3528uA));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3268D f(C3095j c3095j, InterfaceC3528u interfaceC3528u) {
        return new C3268D(c3095j.f39911a, interfaceC3528u);
    }

    @Override // Ra.O
    @InterfaceC4156a
    public List<C3268D> a(qb.c fqName) {
        C3862t.g(fqName, "fqName");
        return r.q(e(fqName));
    }

    @Override // Ra.U
    public boolean b(qb.c fqName) {
        C3862t.g(fqName, "fqName");
        return C1960t.a(this.f39911a.a().d(), fqName, false, 2, null) == null;
    }

    @Override // Ra.U
    public void c(qb.c fqName, Collection<N> packageFragments) {
        C3862t.g(fqName, "fqName");
        C3862t.g(packageFragments, "packageFragments");
        Rb.a.a(packageFragments, e(fqName));
    }

    @Override // Ra.O
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public List<qb.c> r(qb.c fqName, Ba.l<? super qb.f, Boolean> nameFilter) {
        C3862t.g(fqName, "fqName");
        C3862t.g(nameFilter, "nameFilter");
        C3268D c3268dE = e(fqName);
        List<qb.c> listR0 = c3268dE != null ? c3268dE.R0() : null;
        return listR0 == null ? r.m() : listR0;
    }

    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f39911a.a().m();
    }
}
