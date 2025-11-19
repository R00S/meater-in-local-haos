package eb;

import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1696i;
import Ra.InterfaceC1700m;
import Ra.g0;
import db.C3096k;
import hb.InterfaceC3528u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3862t;

/* compiled from: JvmPackageScope.kt */
/* renamed from: eb.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3274f implements Ab.k {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ Ia.m<Object>[] f40890f = {kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(C3274f.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: b, reason: collision with root package name */
    private final C3096k f40891b;

    /* renamed from: c, reason: collision with root package name */
    private final C3268D f40892c;

    /* renamed from: d, reason: collision with root package name */
    private final G f40893d;

    /* renamed from: e, reason: collision with root package name */
    private final Gb.i f40894e;

    public C3274f(C3096k c10, InterfaceC3528u jPackage, C3268D packageFragment) {
        C3862t.g(c10, "c");
        C3862t.g(jPackage, "jPackage");
        C3862t.g(packageFragment, "packageFragment");
        this.f40891b = c10;
        this.f40892c = packageFragment;
        this.f40893d = new G(c10, jPackage, packageFragment);
        this.f40894e = c10.e().g(new C3273e(this));
    }

    private final Ab.k[] j() {
        return (Ab.k[]) Gb.m.a(this.f40894e, this, f40890f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ab.k[] k(C3274f c3274f) {
        Collection<jb.x> collectionValues = c3274f.f40892c.P0().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            Ab.k kVarC = c3274f.f40891b.a().b().c(c3274f.f40892c, (jb.x) it.next());
            if (kVarC != null) {
                arrayList.add(kVarC);
            }
        }
        return (Ab.k[]) Qb.a.b(arrayList).toArray(new Ab.k[0]);
    }

    @Override // Ab.k
    public Set<qb.f> a() {
        Ab.k[] kVarArrJ = j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Ab.k kVar : kVarArrJ) {
            kotlin.collections.r.D(linkedHashSet, kVar.a());
        }
        linkedHashSet.addAll(this.f40893d.a());
        return linkedHashSet;
    }

    @Override // Ab.k
    public Collection<g0> b(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        l(name, location);
        G g10 = this.f40893d;
        Ab.k[] kVarArrJ = j();
        Collection<? extends g0> collectionB = g10.b(name, location);
        int length = kVarArrJ.length;
        int i10 = 0;
        Collection collection = collectionB;
        while (i10 < length) {
            Collection collectionA = Qb.a.a(collection, kVarArrJ[i10].b(name, location));
            i10++;
            collection = collectionA;
        }
        return collection == null ? kotlin.collections.V.d() : collection;
    }

    @Override // Ab.k
    public Set<qb.f> c() {
        Ab.k[] kVarArrJ = j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Ab.k kVar : kVarArrJ) {
            kotlin.collections.r.D(linkedHashSet, kVar.c());
        }
        linkedHashSet.addAll(this.f40893d.c());
        return linkedHashSet;
    }

    @Override // Ab.k
    public Collection<Ra.Z> d(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        l(name, location);
        G g10 = this.f40893d;
        Ab.k[] kVarArrJ = j();
        Collection<? extends Ra.Z> collectionD = g10.d(name, location);
        int length = kVarArrJ.length;
        int i10 = 0;
        Collection collection = collectionD;
        while (i10 < length) {
            Collection collectionA = Qb.a.a(collection, kVarArrJ[i10].d(name, location));
            i10++;
            collection = collectionA;
        }
        return collection == null ? kotlin.collections.V.d() : collection;
    }

    @Override // Ab.k
    public Set<qb.f> e() {
        Set<qb.f> setA = Ab.m.a(C3831l.N(j()));
        if (setA == null) {
            return null;
        }
        setA.addAll(this.f40893d.e());
        return setA;
    }

    @Override // Ab.n
    public Collection<InterfaceC1700m> f(Ab.d kindFilter, Ba.l<? super qb.f, Boolean> nameFilter) {
        C3862t.g(kindFilter, "kindFilter");
        C3862t.g(nameFilter, "nameFilter");
        G g10 = this.f40893d;
        Ab.k[] kVarArrJ = j();
        Collection<InterfaceC1700m> collectionF = g10.f(kindFilter, nameFilter);
        for (Ab.k kVar : kVarArrJ) {
            collectionF = Qb.a.a(collectionF, kVar.f(kindFilter, nameFilter));
        }
        return collectionF == null ? kotlin.collections.V.d() : collectionF;
    }

    @Override // Ab.n
    public InterfaceC1695h g(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        l(name, location);
        InterfaceC1692e interfaceC1692eG = this.f40893d.g(name, location);
        if (interfaceC1692eG != null) {
            return interfaceC1692eG;
        }
        InterfaceC1695h interfaceC1695h = null;
        for (Ab.k kVar : j()) {
            InterfaceC1695h interfaceC1695hG = kVar.g(name, location);
            if (interfaceC1695hG != null) {
                if (!(interfaceC1695hG instanceof InterfaceC1696i) || !((Ra.D) interfaceC1695hG).K()) {
                    return interfaceC1695hG;
                }
                if (interfaceC1695h == null) {
                    interfaceC1695h = interfaceC1695hG;
                }
            }
        }
        return interfaceC1695h;
    }

    public final G i() {
        return this.f40893d;
    }

    public void l(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        Ya.a.b(this.f40891b.a().l(), location, this.f40892c, name);
    }

    public String toString() {
        return "scope for " + this.f40892c;
    }
}
