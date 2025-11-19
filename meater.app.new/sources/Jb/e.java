package Jb;

import Ra.G;
import Ra.H;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1702o;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.V;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import oa.C4165j;
import oa.InterfaceC4164i;

/* compiled from: ErrorModuleDescriptor.kt */
/* loaded from: classes3.dex */
public final class e implements H {

    /* renamed from: B, reason: collision with root package name */
    public static final e f7671B = new e();

    /* renamed from: C, reason: collision with root package name */
    private static final qb.f f7672C;

    /* renamed from: D, reason: collision with root package name */
    private static final List<H> f7673D;

    /* renamed from: E, reason: collision with root package name */
    private static final List<H> f7674E;

    /* renamed from: F, reason: collision with root package name */
    private static final Set<H> f7675F;

    /* renamed from: G, reason: collision with root package name */
    private static final InterfaceC4164i f7676G;

    static {
        qb.f fVarW = qb.f.w(b.f7662F.j());
        C3862t.f(fVarW, "special(...)");
        f7672C = fVarW;
        f7673D = r.m();
        f7674E = r.m();
        f7675F = V.d();
        f7676G = C4165j.a(d.f7670B);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Oa.g z0() {
        return Oa.g.f13317h.a();
    }

    public qb.f E0() {
        return f7672C;
    }

    @Override // Ra.H
    public Ra.V G(qb.c fqName) {
        C3862t.g(fqName, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // Ra.H
    public boolean I0(H targetModule) {
        C3862t.g(targetModule, "targetModule");
        return false;
    }

    @Override // Ra.H
    public <T> T M(G<T> capability) {
        C3862t.g(capability, "capability");
        return null;
    }

    @Override // Ra.InterfaceC1700m
    public InterfaceC1700m c() {
        return null;
    }

    @Override // Sa.a
    public Sa.h getAnnotations() {
        return Sa.h.f15630e.b();
    }

    @Override // Ra.J
    public qb.f getName() {
        return E0();
    }

    @Override // Ra.H
    public Oa.j q() {
        return (Oa.j) f7676G.getValue();
    }

    @Override // Ra.H
    public List<H> q0() {
        return f7674E;
    }

    @Override // Ra.H
    public Collection<qb.c> r(qb.c fqName, Ba.l<? super qb.f, Boolean> nameFilter) {
        C3862t.g(fqName, "fqName");
        C3862t.g(nameFilter, "nameFilter");
        return r.m();
    }

    @Override // Ra.InterfaceC1700m
    public <R, D> R v0(InterfaceC1702o<R, D> visitor, D d10) {
        C3862t.g(visitor, "visitor");
        return null;
    }

    @Override // Ra.InterfaceC1700m
    public InterfaceC1700m b() {
        return this;
    }
}
