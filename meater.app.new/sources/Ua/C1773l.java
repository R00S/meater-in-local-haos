package Ua;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C3862t;
import oa.InterfaceC4156a;

/* compiled from: CompositePackageFragmentProvider.kt */
/* renamed from: Ua.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1773l implements Ra.U {

    /* renamed from: a, reason: collision with root package name */
    private final List<Ra.O> f17832a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17833b;

    /* JADX WARN: Multi-variable type inference failed */
    public C1773l(List<? extends Ra.O> providers, String debugName) {
        C3862t.g(providers, "providers");
        C3862t.g(debugName, "debugName");
        this.f17832a = providers;
        this.f17833b = debugName;
        providers.size();
        kotlin.collections.r.b1(providers).size();
    }

    @Override // Ra.O
    @InterfaceC4156a
    public List<Ra.N> a(qb.c fqName) {
        C3862t.g(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        Iterator<Ra.O> it = this.f17832a.iterator();
        while (it.hasNext()) {
            Ra.T.a(it.next(), fqName, arrayList);
        }
        return kotlin.collections.r.W0(arrayList);
    }

    @Override // Ra.U
    public boolean b(qb.c fqName) {
        C3862t.g(fqName, "fqName");
        List<Ra.O> list = this.f17832a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!Ra.T.b((Ra.O) it.next(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // Ra.U
    public void c(qb.c fqName, Collection<Ra.N> packageFragments) {
        C3862t.g(fqName, "fqName");
        C3862t.g(packageFragments, "packageFragments");
        Iterator<Ra.O> it = this.f17832a.iterator();
        while (it.hasNext()) {
            Ra.T.a(it.next(), fqName, packageFragments);
        }
    }

    @Override // Ra.O
    public Collection<qb.c> r(qb.c fqName, Ba.l<? super qb.f, Boolean> nameFilter) {
        C3862t.g(fqName, "fqName");
        C3862t.g(nameFilter, "nameFilter");
        HashSet hashSet = new HashSet();
        Iterator<Ra.O> it = this.f17832a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().r(fqName, nameFilter));
        }
        return hashSet;
    }

    public String toString() {
        return this.f17833b;
    }
}
