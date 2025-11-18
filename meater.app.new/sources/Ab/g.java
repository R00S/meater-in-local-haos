package Ab;

import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1696i;
import Ra.InterfaceC1700m;
import Ra.l0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C3862t;

/* compiled from: InnerClassesScopeWrapper.kt */
/* loaded from: classes3.dex */
public final class g extends l {

    /* renamed from: b, reason: collision with root package name */
    private final k f1143b;

    public g(k workerScope) {
        C3862t.g(workerScope, "workerScope");
        this.f1143b = workerScope;
    }

    @Override // Ab.l, Ab.k
    public Set<qb.f> a() {
        return this.f1143b.a();
    }

    @Override // Ab.l, Ab.k
    public Set<qb.f> c() {
        return this.f1143b.c();
    }

    @Override // Ab.l, Ab.k
    public Set<qb.f> e() {
        return this.f1143b.e();
    }

    @Override // Ab.l, Ab.n
    public InterfaceC1695h g(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        InterfaceC1695h interfaceC1695hG = this.f1143b.g(name, location);
        if (interfaceC1695hG == null) {
            return null;
        }
        InterfaceC1692e interfaceC1692e = interfaceC1695hG instanceof InterfaceC1692e ? (InterfaceC1692e) interfaceC1695hG : null;
        if (interfaceC1692e != null) {
            return interfaceC1692e;
        }
        if (interfaceC1695hG instanceof l0) {
            return (l0) interfaceC1695hG;
        }
        return null;
    }

    @Override // Ab.l, Ab.n
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public List<InterfaceC1695h> f(d kindFilter, Ba.l<? super qb.f, Boolean> nameFilter) {
        C3862t.g(kindFilter, "kindFilter");
        C3862t.g(nameFilter, "nameFilter");
        d dVarN = kindFilter.n(d.f1109c.c());
        if (dVarN == null) {
            return kotlin.collections.r.m();
        }
        Collection<InterfaceC1700m> collectionF = this.f1143b.f(dVarN, nameFilter);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionF) {
            if (obj instanceof InterfaceC1696i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public String toString() {
        return "Classes from " + this.f1143b;
    }
}
