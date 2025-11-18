package Ab;

import Ab.k;
import Ra.D;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1696i;
import Ra.InterfaceC1700m;
import Ra.Z;
import Ra.g0;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C3831l;
import kotlin.collections.V;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: ChainedMemberScope.kt */
/* loaded from: classes3.dex */
public final class b implements k {

    /* renamed from: d, reason: collision with root package name */
    public static final a f1103d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final String f1104b;

    /* renamed from: c, reason: collision with root package name */
    private final k[] f1105c;

    /* compiled from: ChainedMemberScope.kt */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        public final k a(String debugName, Iterable<? extends k> scopes) {
            C3862t.g(debugName, "debugName");
            C3862t.g(scopes, "scopes");
            Rb.k kVar = new Rb.k();
            for (k kVar2 : scopes) {
                if (kVar2 != k.b.f1150b) {
                    if (kVar2 instanceof b) {
                        kotlin.collections.r.E(kVar, ((b) kVar2).f1105c);
                    } else {
                        kVar.add(kVar2);
                    }
                }
            }
            return b(debugName, kVar);
        }

        public final k b(String debugName, List<? extends k> scopes) {
            C3862t.g(debugName, "debugName");
            C3862t.g(scopes, "scopes");
            int size = scopes.size();
            return size != 0 ? size != 1 ? new b(debugName, (k[]) scopes.toArray(new k[0]), null) : scopes.get(0) : k.b.f1150b;
        }

        private a() {
        }
    }

    public /* synthetic */ b(String str, k[] kVarArr, C3854k c3854k) {
        this(str, kVarArr);
    }

    @Override // Ab.k
    public Set<qb.f> a() {
        k[] kVarArr = this.f1105c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (k kVar : kVarArr) {
            kotlin.collections.r.D(linkedHashSet, kVar.a());
        }
        return linkedHashSet;
    }

    @Override // Ab.k
    public Collection<g0> b(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        k[] kVarArr = this.f1105c;
        int length = kVarArr.length;
        if (length == 0) {
            return kotlin.collections.r.m();
        }
        if (length == 1) {
            return kVarArr[0].b(name, location);
        }
        Collection<g0> collectionA = null;
        for (k kVar : kVarArr) {
            collectionA = Qb.a.a(collectionA, kVar.b(name, location));
        }
        return collectionA == null ? V.d() : collectionA;
    }

    @Override // Ab.k
    public Set<qb.f> c() {
        k[] kVarArr = this.f1105c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (k kVar : kVarArr) {
            kotlin.collections.r.D(linkedHashSet, kVar.c());
        }
        return linkedHashSet;
    }

    @Override // Ab.k
    public Collection<Z> d(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        k[] kVarArr = this.f1105c;
        int length = kVarArr.length;
        if (length == 0) {
            return kotlin.collections.r.m();
        }
        if (length == 1) {
            return kVarArr[0].d(name, location);
        }
        Collection<Z> collectionA = null;
        for (k kVar : kVarArr) {
            collectionA = Qb.a.a(collectionA, kVar.d(name, location));
        }
        return collectionA == null ? V.d() : collectionA;
    }

    @Override // Ab.k
    public Set<qb.f> e() {
        return m.a(C3831l.N(this.f1105c));
    }

    @Override // Ab.n
    public Collection<InterfaceC1700m> f(d kindFilter, Ba.l<? super qb.f, Boolean> nameFilter) {
        C3862t.g(kindFilter, "kindFilter");
        C3862t.g(nameFilter, "nameFilter");
        k[] kVarArr = this.f1105c;
        int length = kVarArr.length;
        if (length == 0) {
            return kotlin.collections.r.m();
        }
        if (length == 1) {
            return kVarArr[0].f(kindFilter, nameFilter);
        }
        Collection<InterfaceC1700m> collectionA = null;
        for (k kVar : kVarArr) {
            collectionA = Qb.a.a(collectionA, kVar.f(kindFilter, nameFilter));
        }
        return collectionA == null ? V.d() : collectionA;
    }

    @Override // Ab.n
    public InterfaceC1695h g(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        InterfaceC1695h interfaceC1695h = null;
        for (k kVar : this.f1105c) {
            InterfaceC1695h interfaceC1695hG = kVar.g(name, location);
            if (interfaceC1695hG != null) {
                if (!(interfaceC1695hG instanceof InterfaceC1696i) || !((D) interfaceC1695hG).K()) {
                    return interfaceC1695hG;
                }
                if (interfaceC1695h == null) {
                    interfaceC1695h = interfaceC1695hG;
                }
            }
        }
        return interfaceC1695h;
    }

    public String toString() {
        return this.f1104b;
    }

    private b(String str, k[] kVarArr) {
        this.f1104b = str;
        this.f1105c = kVarArr;
    }
}
