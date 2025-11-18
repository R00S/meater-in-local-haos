package Ua;

import Ra.H;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1702o;
import Ua.I;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4165j;
import oa.InterfaceC4164i;
import rb.C4377a;

/* compiled from: ModuleDescriptorImpl.kt */
/* loaded from: classes3.dex */
public final class F extends AbstractC1774m implements Ra.H {

    /* renamed from: D, reason: collision with root package name */
    private final Gb.n f17693D;

    /* renamed from: E, reason: collision with root package name */
    private final Oa.j f17694E;

    /* renamed from: F, reason: collision with root package name */
    private final qb.f f17695F;

    /* renamed from: G, reason: collision with root package name */
    private final Map<Ra.G<?>, Object> f17696G;

    /* renamed from: H, reason: collision with root package name */
    private final I f17697H;

    /* renamed from: I, reason: collision with root package name */
    private B f17698I;

    /* renamed from: J, reason: collision with root package name */
    private Ra.O f17699J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f17700K;

    /* renamed from: L, reason: collision with root package name */
    private final Gb.g<qb.c, Ra.V> f17701L;

    /* renamed from: M, reason: collision with root package name */
    private final InterfaceC4164i f17702M;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public F(qb.f moduleName, Gb.n storageManager, Oa.j builtIns, C4377a c4377a) {
        this(moduleName, storageManager, builtIns, c4377a, null, null, 48, null);
        C3862t.g(moduleName, "moduleName");
        C3862t.g(storageManager, "storageManager");
        C3862t.g(builtIns, "builtIns");
    }

    private final String M0() {
        String string = getName().toString();
        C3862t.f(string, "toString(...)");
        return string;
    }

    private final C1773l O0() {
        return (C1773l) this.f17702M.getValue();
    }

    private final boolean Q0() {
        return this.f17699J != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1773l S0(F f10) {
        B b10 = f10.f17698I;
        if (b10 == null) {
            throw new AssertionError("Dependencies of module " + f10.M0() + " were not set before querying module content");
        }
        List<F> listA = b10.a();
        f10.L0();
        listA.contains(f10);
        List<F> list = listA;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((F) it.next()).Q0();
        }
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            Ra.O o10 = ((F) it2.next()).f17699J;
            C3862t.d(o10);
            arrayList.add(o10);
        }
        return new C1773l(arrayList, "CompositeProvider@ModuleDescriptor for " + f10.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ra.V T0(F f10, qb.c fqName) {
        C3862t.g(fqName, "fqName");
        return f10.f17697H.a(f10, fqName, f10.f17693D);
    }

    @Override // Ra.H
    public Ra.V G(qb.c fqName) {
        C3862t.g(fqName, "fqName");
        L0();
        return this.f17701L.invoke(fqName);
    }

    @Override // Ra.H
    public boolean I0(Ra.H targetModule) {
        C3862t.g(targetModule, "targetModule");
        if (C3862t.b(this, targetModule)) {
            return true;
        }
        B b10 = this.f17698I;
        C3862t.d(b10);
        return kotlin.collections.r.a0(b10.b(), targetModule) || q0().contains(targetModule) || targetModule.q0().contains(this);
    }

    public void L0() {
        if (R0()) {
            return;
        }
        Ra.B.a(this);
    }

    @Override // Ra.H
    public <T> T M(Ra.G<T> capability) {
        C3862t.g(capability, "capability");
        T t10 = (T) this.f17696G.get(capability);
        if (t10 == null) {
            return null;
        }
        return t10;
    }

    public final Ra.O N0() {
        L0();
        return O0();
    }

    public final void P0(Ra.O providerForModuleContent) {
        C3862t.g(providerForModuleContent, "providerForModuleContent");
        Q0();
        this.f17699J = providerForModuleContent;
    }

    public boolean R0() {
        return this.f17700K;
    }

    public final void U0(B dependencies) {
        C3862t.g(dependencies, "dependencies");
        this.f17698I = dependencies;
    }

    public final void V0(List<F> descriptors) {
        C3862t.g(descriptors, "descriptors");
        W0(descriptors, kotlin.collections.V.d());
    }

    public final void W0(List<F> descriptors, Set<F> friends) {
        C3862t.g(descriptors, "descriptors");
        C3862t.g(friends, "friends");
        U0(new C(descriptors, friends, kotlin.collections.r.m(), kotlin.collections.V.d()));
    }

    public final void X0(F... descriptors) {
        C3862t.g(descriptors, "descriptors");
        V0(C3831l.I0(descriptors));
    }

    @Override // Ra.InterfaceC1700m
    public InterfaceC1700m c() {
        return H.a.b(this);
    }

    @Override // Ra.H
    public Oa.j q() {
        return this.f17694E;
    }

    @Override // Ra.H
    public List<Ra.H> q0() {
        B b10 = this.f17698I;
        if (b10 != null) {
            return b10.c();
        }
        throw new AssertionError("Dependencies of module " + M0() + " were not set");
    }

    @Override // Ra.H
    public Collection<qb.c> r(qb.c fqName, Ba.l<? super qb.f, Boolean> nameFilter) {
        C3862t.g(fqName, "fqName");
        C3862t.g(nameFilter, "nameFilter");
        L0();
        return N0().r(fqName, nameFilter);
    }

    @Override // Ua.AbstractC1774m
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (!R0()) {
            sb2.append(" !isValid");
        }
        sb2.append(" packageFragmentProvider: ");
        Ra.O o10 = this.f17699J;
        sb2.append(o10 != null ? o10.getClass().getSimpleName() : null);
        String string = sb2.toString();
        C3862t.f(string, "toString(...)");
        return string;
    }

    @Override // Ra.InterfaceC1700m
    public <R, D> R v0(InterfaceC1702o<R, D> interfaceC1702o, D d10) {
        return (R) H.a.a(this, interfaceC1702o, d10);
    }

    public /* synthetic */ F(qb.f fVar, Gb.n nVar, Oa.j jVar, C4377a c4377a, Map map, qb.f fVar2, int i10, C3854k c3854k) {
        this(fVar, nVar, jVar, (i10 & 8) != 0 ? null : c4377a, (i10 & 16) != 0 ? kotlin.collections.M.h() : map, (i10 & 32) != 0 ? null : fVar2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(qb.f moduleName, Gb.n storageManager, Oa.j builtIns, C4377a c4377a, Map<Ra.G<?>, ? extends Object> capabilities, qb.f fVar) {
        super(Sa.h.f15630e.b(), moduleName);
        C3862t.g(moduleName, "moduleName");
        C3862t.g(storageManager, "storageManager");
        C3862t.g(builtIns, "builtIns");
        C3862t.g(capabilities, "capabilities");
        this.f17693D = storageManager;
        this.f17694E = builtIns;
        this.f17695F = fVar;
        if (moduleName.u()) {
            this.f17696G = capabilities;
            I i10 = (I) M(I.f17713a.a());
            this.f17697H = i10 == null ? I.b.f17716b : i10;
            this.f17700K = true;
            this.f17701L = storageManager.h(new D(this));
            this.f17702M = C4165j.a(new E(this));
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + moduleName);
    }
}
