package Ab;

import Ab.n;
import Hb.H0;
import Hb.J0;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1700m;
import Ra.Z;
import Ra.g0;
import Ra.j0;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C3862t;
import oa.C4165j;
import oa.InterfaceC4164i;
import ub.C4703e;

/* compiled from: SubstitutingScope.kt */
/* loaded from: classes3.dex */
public final class t implements k {

    /* renamed from: b, reason: collision with root package name */
    private final k f1160b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4164i f1161c;

    /* renamed from: d, reason: collision with root package name */
    private final J0 f1162d;

    /* renamed from: e, reason: collision with root package name */
    private Map<InterfaceC1700m, InterfaceC1700m> f1163e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC4164i f1164f;

    public t(k workerScope, J0 givenSubstitutor) {
        C3862t.g(workerScope, "workerScope");
        C3862t.g(givenSubstitutor, "givenSubstitutor");
        this.f1160b = workerScope;
        this.f1161c = C4165j.a(new r(givenSubstitutor));
        H0 h0J = givenSubstitutor.j();
        C3862t.f(h0J, "getSubstitution(...)");
        this.f1162d = C4703e.h(h0J, false, 1, null).c();
        this.f1164f = C4165j.a(new s(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection h(t tVar) {
        return tVar.m(n.a.a(tVar.f1160b, null, null, 3, null));
    }

    private final Collection<InterfaceC1700m> k() {
        return (Collection) this.f1164f.getValue();
    }

    private final <D extends InterfaceC1700m> D l(D d10) {
        if (this.f1162d.k()) {
            return d10;
        }
        if (this.f1163e == null) {
            this.f1163e = new HashMap();
        }
        Map<InterfaceC1700m, InterfaceC1700m> map = this.f1163e;
        C3862t.d(map);
        InterfaceC1700m interfaceC1700mD = map.get(d10);
        if (interfaceC1700mD == null) {
            if (!(d10 instanceof j0)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + d10).toString());
            }
            interfaceC1700mD = ((j0) d10).d(this.f1162d);
            if (interfaceC1700mD == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d10 + " substitution fails");
            }
            map.put(d10, interfaceC1700mD);
        }
        D d11 = (D) interfaceC1700mD;
        C3862t.e(d11, "null cannot be cast to non-null type D of org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute");
        return d11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <D extends InterfaceC1700m> Collection<D> m(Collection<? extends D> collection) {
        if (this.f1162d.k() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet linkedHashSetG = Rb.a.g(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSetG.add(l((InterfaceC1700m) it.next()));
        }
        return linkedHashSetG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J0 n(J0 j02) {
        return j02.j().c();
    }

    @Override // Ab.k
    public Set<qb.f> a() {
        return this.f1160b.a();
    }

    @Override // Ab.k
    public Collection<? extends g0> b(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        return m(this.f1160b.b(name, location));
    }

    @Override // Ab.k
    public Set<qb.f> c() {
        return this.f1160b.c();
    }

    @Override // Ab.k
    public Collection<? extends Z> d(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        return m(this.f1160b.d(name, location));
    }

    @Override // Ab.k
    public Set<qb.f> e() {
        return this.f1160b.e();
    }

    @Override // Ab.n
    public Collection<InterfaceC1700m> f(d kindFilter, Ba.l<? super qb.f, Boolean> nameFilter) {
        C3862t.g(kindFilter, "kindFilter");
        C3862t.g(nameFilter, "nameFilter");
        return k();
    }

    @Override // Ab.n
    public InterfaceC1695h g(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        InterfaceC1695h interfaceC1695hG = this.f1160b.g(name, location);
        if (interfaceC1695hG != null) {
            return (InterfaceC1695h) l(interfaceC1695hG);
        }
        return null;
    }
}
