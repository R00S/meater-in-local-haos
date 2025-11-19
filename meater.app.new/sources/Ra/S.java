package Ra;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C3862t;
import oa.InterfaceC4156a;

/* compiled from: PackageFragmentProviderImpl.kt */
/* loaded from: classes3.dex */
public final class S implements U {

    /* renamed from: a, reason: collision with root package name */
    private final Collection<N> f15128a;

    /* JADX WARN: Multi-variable type inference failed */
    public S(Collection<? extends N> packageFragments) {
        C3862t.g(packageFragments, "packageFragments");
        this.f15128a = packageFragments;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qb.c f(N it) {
        C3862t.g(it, "it");
        return it.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(qb.c cVar, qb.c it) {
        C3862t.g(it, "it");
        return !it.d() && C3862t.b(it.e(), cVar);
    }

    @Override // Ra.O
    @InterfaceC4156a
    public List<N> a(qb.c fqName) {
        C3862t.g(fqName, "fqName");
        Collection<N> collection = this.f15128a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (C3862t.b(((N) obj).f(), fqName)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // Ra.U
    public boolean b(qb.c fqName) {
        C3862t.g(fqName, "fqName");
        Collection<N> collection = this.f15128a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (C3862t.b(((N) it.next()).f(), fqName)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ra.U
    public void c(qb.c fqName, Collection<N> packageFragments) {
        C3862t.g(fqName, "fqName");
        C3862t.g(packageFragments, "packageFragments");
        for (Object obj : this.f15128a) {
            if (C3862t.b(((N) obj).f(), fqName)) {
                packageFragments.add(obj);
            }
        }
    }

    @Override // Ra.O
    public Collection<qb.c> r(qb.c fqName, Ba.l<? super qb.f, Boolean> nameFilter) {
        C3862t.g(fqName, "fqName");
        C3862t.g(nameFilter, "nameFilter");
        return Tb.k.H(Tb.k.q(Tb.k.A(kotlin.collections.r.Z(this.f15128a), P.f15126B), new Q(fqName)));
    }
}
