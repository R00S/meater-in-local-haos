package Ua;

import Ab.k;
import Ra.InterfaceC1702o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: LazyPackageViewDescriptorImpl.kt */
/* renamed from: Ua.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1784x extends AbstractC1774m implements Ra.V {

    /* renamed from: I, reason: collision with root package name */
    static final /* synthetic */ Ia.m<Object>[] f17912I = {kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(C1784x.class), "fragments", "getFragments()Ljava/util/List;")), kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(C1784x.class), "empty", "getEmpty()Z"))};

    /* renamed from: D, reason: collision with root package name */
    private final F f17913D;

    /* renamed from: E, reason: collision with root package name */
    private final qb.c f17914E;

    /* renamed from: F, reason: collision with root package name */
    private final Gb.i f17915F;

    /* renamed from: G, reason: collision with root package name */
    private final Gb.i f17916G;

    /* renamed from: H, reason: collision with root package name */
    private final Ab.k f17917H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1784x(F module, qb.c fqName, Gb.n storageManager) {
        super(Sa.h.f15630e.b(), fqName.h());
        C3862t.g(module, "module");
        C3862t.g(fqName, "fqName");
        C3862t.g(storageManager, "storageManager");
        this.f17913D = module;
        this.f17914E = fqName;
        this.f17915F = storageManager.g(new C1781u(this));
        this.f17916G = storageManager.g(new C1782v(this));
        this.f17917H = new Ab.i(storageManager, new C1783w(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean M0(C1784x c1784x) {
        return Ra.T.b(c1784x.s0().N0(), c1784x.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List N0(C1784x c1784x) {
        return Ra.T.c(c1784x.s0().N0(), c1784x.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ab.k R0(C1784x c1784x) {
        if (c1784x.isEmpty()) {
            return k.b.f1150b;
        }
        List<Ra.N> listI = c1784x.I();
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(listI, 10));
        Iterator<T> it = listI.iterator();
        while (it.hasNext()) {
            arrayList.add(((Ra.N) it.next()).s());
        }
        List listG0 = kotlin.collections.r.G0(arrayList, new P(c1784x.s0(), c1784x.f()));
        return Ab.b.f1103d.a("package view scope for " + c1784x.f() + " in " + c1784x.s0().getName(), listG0);
    }

    @Override // Ra.V
    public List<Ra.N> I() {
        return (List) Gb.m.a(this.f17915F, this, f17912I[0]);
    }

    @Override // Ra.InterfaceC1700m
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public Ra.V c() {
        if (f().d()) {
            return null;
        }
        F fS0 = s0();
        qb.c cVarE = f().e();
        C3862t.f(cVarE, "parent(...)");
        return fS0.G(cVarE);
    }

    protected final boolean P0() {
        return ((Boolean) Gb.m.a(this.f17916G, this, f17912I[1])).booleanValue();
    }

    @Override // Ra.V
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public F s0() {
        return this.f17913D;
    }

    public boolean equals(Object obj) {
        Ra.V v10 = obj instanceof Ra.V ? (Ra.V) obj : null;
        return v10 != null && C3862t.b(f(), v10.f()) && C3862t.b(s0(), v10.s0());
    }

    @Override // Ra.V
    public qb.c f() {
        return this.f17914E;
    }

    public int hashCode() {
        return (s0().hashCode() * 31) + f().hashCode();
    }

    @Override // Ra.V
    public boolean isEmpty() {
        return P0();
    }

    @Override // Ra.V
    public Ab.k s() {
        return this.f17917H;
    }

    @Override // Ra.InterfaceC1700m
    public <R, D> R v0(InterfaceC1702o<R, D> visitor, D d10) {
        C3862t.g(visitor, "visitor");
        return visitor.b(this, d10);
    }
}
