package Ua;

import Ab.c;
import Ra.InterfaceC1700m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C3862t;

/* compiled from: SubpackagesScope.kt */
/* loaded from: classes3.dex */
public class P extends Ab.l {

    /* renamed from: b, reason: collision with root package name */
    private final Ra.H f17764b;

    /* renamed from: c, reason: collision with root package name */
    private final qb.c f17765c;

    public P(Ra.H moduleDescriptor, qb.c fqName) {
        C3862t.g(moduleDescriptor, "moduleDescriptor");
        C3862t.g(fqName, "fqName");
        this.f17764b = moduleDescriptor;
        this.f17765c = fqName;
    }

    @Override // Ab.l, Ab.k
    public Set<qb.f> e() {
        return kotlin.collections.V.d();
    }

    @Override // Ab.l, Ab.n
    public Collection<InterfaceC1700m> f(Ab.d kindFilter, Ba.l<? super qb.f, Boolean> nameFilter) {
        C3862t.g(kindFilter, "kindFilter");
        C3862t.g(nameFilter, "nameFilter");
        if (!kindFilter.a(Ab.d.f1109c.f())) {
            return kotlin.collections.r.m();
        }
        if (this.f17765c.d() && kindFilter.l().contains(c.b.f1108a)) {
            return kotlin.collections.r.m();
        }
        Collection<qb.c> collectionR = this.f17764b.r(this.f17765c, nameFilter);
        ArrayList arrayList = new ArrayList(collectionR.size());
        Iterator<qb.c> it = collectionR.iterator();
        while (it.hasNext()) {
            qb.f fVarG = it.next().g();
            C3862t.f(fVarG, "shortName(...)");
            if (nameFilter.invoke(fVarG).booleanValue()) {
                Rb.a.a(arrayList, h(fVarG));
            }
        }
        return arrayList;
    }

    protected final Ra.V h(qb.f name) {
        C3862t.g(name, "name");
        if (name.u()) {
            return null;
        }
        Ra.H h10 = this.f17764b;
        qb.c cVarC = this.f17765c.c(name);
        C3862t.f(cVarC, "child(...)");
        Ra.V vG = h10.G(cVarC);
        if (vG.isEmpty()) {
            return null;
        }
        return vG;
    }

    public String toString() {
        return "subpackages of " + this.f17765c + " from " + this.f17764b;
    }
}
