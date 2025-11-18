package Db;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C3862t;
import oa.InterfaceC4156a;

/* compiled from: AbstractDeserializedPackageFragmentProvider.kt */
/* renamed from: Db.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0997c implements Ra.U {

    /* renamed from: a, reason: collision with root package name */
    private final Gb.n f3664a;

    /* renamed from: b, reason: collision with root package name */
    private final A f3665b;

    /* renamed from: c, reason: collision with root package name */
    private final Ra.H f3666c;

    /* renamed from: d, reason: collision with root package name */
    protected C1008n f3667d;

    /* renamed from: e, reason: collision with root package name */
    private final Gb.h<qb.c, Ra.N> f3668e;

    public AbstractC0997c(Gb.n storageManager, A finder, Ra.H moduleDescriptor) {
        C3862t.g(storageManager, "storageManager");
        C3862t.g(finder, "finder");
        C3862t.g(moduleDescriptor, "moduleDescriptor");
        this.f3664a = storageManager;
        this.f3665b = finder;
        this.f3666c = moduleDescriptor;
        this.f3668e = storageManager.e(new C0996b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ra.N f(AbstractC0997c abstractC0997c, qb.c fqName) {
        C3862t.g(fqName, "fqName");
        r rVarE = abstractC0997c.e(fqName);
        if (rVarE == null) {
            return null;
        }
        rVarE.M0(abstractC0997c.g());
        return rVarE;
    }

    @Override // Ra.O
    @InterfaceC4156a
    public List<Ra.N> a(qb.c fqName) {
        C3862t.g(fqName, "fqName");
        return kotlin.collections.r.q(this.f3668e.invoke(fqName));
    }

    @Override // Ra.U
    public boolean b(qb.c fqName) {
        C3862t.g(fqName, "fqName");
        return (this.f3668e.l(fqName) ? (Ra.N) this.f3668e.invoke(fqName) : e(fqName)) == null;
    }

    @Override // Ra.U
    public void c(qb.c fqName, Collection<Ra.N> packageFragments) {
        C3862t.g(fqName, "fqName");
        C3862t.g(packageFragments, "packageFragments");
        Rb.a.a(packageFragments, this.f3668e.invoke(fqName));
    }

    protected abstract r e(qb.c cVar);

    protected final C1008n g() {
        C1008n c1008n = this.f3667d;
        if (c1008n != null) {
            return c1008n;
        }
        C3862t.u("components");
        return null;
    }

    protected final A h() {
        return this.f3665b;
    }

    protected final Ra.H i() {
        return this.f3666c;
    }

    protected final Gb.n j() {
        return this.f3664a;
    }

    protected final void k(C1008n c1008n) {
        C3862t.g(c1008n, "<set-?>");
        this.f3667d = c1008n;
    }

    @Override // Ra.O
    public Collection<qb.c> r(qb.c fqName, Ba.l<? super qb.f, Boolean> nameFilter) {
        C3862t.g(fqName, "fqName");
        C3862t.g(nameFilter, "nameFilter");
        return kotlin.collections.V.d();
    }
}
