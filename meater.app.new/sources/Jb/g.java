package Jb;

import Ra.InterfaceC1695h;
import Ra.InterfaceC1700m;
import Ra.Z;
import Ra.g0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.V;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;

/* compiled from: ErrorScope.kt */
/* loaded from: classes3.dex */
public class g implements Ab.k {

    /* renamed from: b, reason: collision with root package name */
    private final h f7678b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7679c;

    public g(h kind, String... formatParams) {
        C3862t.g(kind, "kind");
        C3862t.g(formatParams, "formatParams");
        this.f7678b = kind;
        String strJ = kind.j();
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str = String.format(strJ, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        C3862t.f(str, "format(...)");
        this.f7679c = str;
    }

    @Override // Ab.k
    public Set<qb.f> a() {
        return V.d();
    }

    @Override // Ab.k
    public Set<qb.f> c() {
        return V.d();
    }

    @Override // Ab.k
    public Set<qb.f> e() {
        return V.d();
    }

    @Override // Ab.n
    public Collection<InterfaceC1700m> f(Ab.d kindFilter, Ba.l<? super qb.f, Boolean> nameFilter) {
        C3862t.g(kindFilter, "kindFilter");
        C3862t.g(nameFilter, "nameFilter");
        return r.m();
    }

    @Override // Ab.n
    public InterfaceC1695h g(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        String str = String.format(b.f7659C.j(), Arrays.copyOf(new Object[]{name}, 1));
        C3862t.f(str, "format(...)");
        qb.f fVarW = qb.f.w(str);
        C3862t.f(fVarW, "special(...)");
        return new a(fVarW);
    }

    @Override // Ab.k
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set<g0> b(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        return V.c(new c(l.f7791a.h()));
    }

    @Override // Ab.k
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set<Z> d(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        return l.f7791a.j();
    }

    protected final String j() {
        return this.f7679c;
    }

    public String toString() {
        return "ErrorScope{" + this.f7679c + '}';
    }
}
