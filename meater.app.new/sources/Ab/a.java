package Ab;

import Ra.InterfaceC1695h;
import Ra.InterfaceC1700m;
import Ra.Z;
import Ra.g0;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.C3862t;

/* compiled from: AbstractScopeAdapter.kt */
/* loaded from: classes3.dex */
public abstract class a implements k {
    @Override // Ab.k
    public Set<qb.f> a() {
        return i().a();
    }

    @Override // Ab.k
    public Collection<g0> b(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        return i().b(name, location);
    }

    @Override // Ab.k
    public Set<qb.f> c() {
        return i().c();
    }

    @Override // Ab.k
    public Collection<Z> d(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        return i().d(name, location);
    }

    @Override // Ab.k
    public Set<qb.f> e() {
        return i().e();
    }

    @Override // Ab.n
    public Collection<InterfaceC1700m> f(d kindFilter, Ba.l<? super qb.f, Boolean> nameFilter) {
        C3862t.g(kindFilter, "kindFilter");
        C3862t.g(nameFilter, "nameFilter");
        return i().f(kindFilter, nameFilter);
    }

    @Override // Ab.n
    public InterfaceC1695h g(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        return i().g(name, location);
    }

    public final k h() {
        if (!(i() instanceof a)) {
            return i();
        }
        k kVarI = i();
        C3862t.e(kVarI, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((a) kVarI).h();
    }

    protected abstract k i();
}
