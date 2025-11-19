package Ab;

import Ra.InterfaceC1695h;
import Ra.InterfaceC1700m;
import Ra.Z;
import Ra.g0;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C3862t;

/* compiled from: MemberScopeImpl.kt */
/* loaded from: classes3.dex */
public abstract class l implements k {
    @Override // Ab.k
    public Set<qb.f> a() {
        Collection<InterfaceC1700m> collectionF = f(d.f1128v, Rb.j.k());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionF) {
            if (obj instanceof g0) {
                qb.f name = ((g0) obj).getName();
                C3862t.f(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // Ab.k
    public Collection<? extends g0> b(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        return kotlin.collections.r.m();
    }

    @Override // Ab.k
    public Set<qb.f> c() {
        Collection<InterfaceC1700m> collectionF = f(d.f1129w, Rb.j.k());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionF) {
            if (obj instanceof g0) {
                qb.f name = ((g0) obj).getName();
                C3862t.f(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // Ab.k
    public Collection<? extends Z> d(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        return kotlin.collections.r.m();
    }

    @Override // Ab.k
    public Set<qb.f> e() {
        return null;
    }

    @Override // Ab.n
    public Collection<InterfaceC1700m> f(d kindFilter, Ba.l<? super qb.f, Boolean> nameFilter) {
        C3862t.g(kindFilter, "kindFilter");
        C3862t.g(nameFilter, "nameFilter");
        return kotlin.collections.r.m();
    }

    @Override // Ab.n
    public InterfaceC1695h g(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        return null;
    }
}
