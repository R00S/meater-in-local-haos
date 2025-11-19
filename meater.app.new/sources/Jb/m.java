package Jb;

import Ra.InterfaceC1695h;
import Ra.InterfaceC1700m;
import Ra.Z;
import Ra.g0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.C3862t;

/* compiled from: ThrowingScope.kt */
/* loaded from: classes3.dex */
public final class m extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(h kind, String... formatParams) {
        super(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
        C3862t.g(kind, "kind");
        C3862t.g(formatParams, "formatParams");
    }

    @Override // Jb.g, Ab.k
    public Set<qb.f> a() {
        throw new IllegalStateException();
    }

    @Override // Jb.g, Ab.k
    public Set<qb.f> c() {
        throw new IllegalStateException();
    }

    @Override // Jb.g, Ab.k
    public Set<qb.f> e() {
        throw new IllegalStateException();
    }

    @Override // Jb.g, Ab.n
    public Collection<InterfaceC1700m> f(Ab.d kindFilter, Ba.l<? super qb.f, Boolean> nameFilter) {
        C3862t.g(kindFilter, "kindFilter");
        C3862t.g(nameFilter, "nameFilter");
        throw new IllegalStateException(j());
    }

    @Override // Jb.g, Ab.n
    public InterfaceC1695h g(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        throw new IllegalStateException(j() + ", required name: " + name);
    }

    @Override // Jb.g, Ab.k
    /* renamed from: h */
    public Set<g0> b(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        throw new IllegalStateException(j() + ", required name: " + name);
    }

    @Override // Jb.g, Ab.k
    /* renamed from: i */
    public Set<Z> d(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        throw new IllegalStateException(j() + ", required name: " + name);
    }

    @Override // Jb.g
    public String toString() {
        return "ThrowingScope{" + j() + '}';
    }
}
