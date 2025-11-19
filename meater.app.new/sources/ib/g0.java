package ib;

import Hb.M0;
import Hb.O0;
import Ra.InterfaceC1692e;
import Ra.t0;
import ab.C1924E;
import ab.C1944d;
import ab.C1963w;
import ab.EnumC1943c;
import db.C3096k;
import eb.C3278j;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import tb.C4597i;

/* compiled from: signatureEnhancement.kt */
/* loaded from: classes3.dex */
final class g0 extends AbstractC3670d<Sa.c> {

    /* renamed from: a, reason: collision with root package name */
    private final Sa.a f43255a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f43256b;

    /* renamed from: c, reason: collision with root package name */
    private final C3096k f43257c;

    /* renamed from: d, reason: collision with root package name */
    private final EnumC1943c f43258d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f43259e;

    public /* synthetic */ g0(Sa.a aVar, boolean z10, C3096k c3096k, EnumC1943c enumC1943c, boolean z11, int i10, C3854k c3854k) {
        this(aVar, z10, c3096k, enumC1943c, (i10 & 16) != 0 ? false : z11);
    }

    @Override // ib.AbstractC3670d
    public boolean B(Lb.i iVar) {
        C3862t.g(iVar, "<this>");
        return Oa.j.d0((Hb.U) iVar);
    }

    @Override // ib.AbstractC3670d
    public boolean C() {
        return this.f43256b;
    }

    @Override // ib.AbstractC3670d
    public boolean D(Lb.i iVar, Lb.i other) {
        C3862t.g(iVar, "<this>");
        C3862t.g(other, "other");
        return this.f43257c.a().k().c((Hb.U) iVar, (Hb.U) other);
    }

    @Override // ib.AbstractC3670d
    public boolean E(Lb.n nVar) {
        C3862t.g(nVar, "<this>");
        return nVar instanceof eb.c0;
    }

    @Override // ib.AbstractC3670d
    public boolean F(Lb.i iVar) {
        C3862t.g(iVar, "<this>");
        return ((Hb.U) iVar).R0() instanceof C3676j;
    }

    @Override // ib.AbstractC3670d
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public boolean l(Sa.c cVar, Lb.i iVar) {
        C3862t.g(cVar, "<this>");
        return ((cVar instanceof cb.g) && ((cb.g) cVar).e()) || ((cVar instanceof C3278j) && !u() && (((C3278j) cVar).n() || q() == EnumC1943c.f20246G)) || (iVar != null && Oa.j.q0((Hb.U) iVar) && m().p(cVar) && !this.f43257c.a().q().c());
    }

    @Override // ib.AbstractC3670d
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public C1944d m() {
        return this.f43257c.a().a();
    }

    @Override // ib.AbstractC3670d
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public Hb.U v(Lb.i iVar) {
        C3862t.g(iVar, "<this>");
        return O0.a((Hb.U) iVar);
    }

    @Override // ib.AbstractC3670d
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public Lb.q A() {
        return Ib.u.f7008a;
    }

    @Override // ib.AbstractC3670d
    public Iterable<Sa.c> n(Lb.i iVar) {
        C3862t.g(iVar, "<this>");
        return ((Hb.U) iVar).getAnnotations();
    }

    @Override // ib.AbstractC3670d
    public Iterable<Sa.c> p() {
        Sa.h annotations;
        Sa.a aVar = this.f43255a;
        return (aVar == null || (annotations = aVar.getAnnotations()) == null) ? kotlin.collections.r.m() : annotations;
    }

    @Override // ib.AbstractC3670d
    public EnumC1943c q() {
        return this.f43258d;
    }

    @Override // ib.AbstractC3670d
    public C1924E r() {
        return this.f43257c.b();
    }

    @Override // ib.AbstractC3670d
    public boolean s() {
        Sa.a aVar = this.f43255a;
        return (aVar instanceof t0) && ((t0) aVar).i0() != null;
    }

    @Override // ib.AbstractC3670d
    protected C3678l t(C3678l c3678l, C1963w c1963w) {
        C3678l c3678lB;
        if (c3678l != null && (c3678lB = C3678l.b(c3678l, EnumC3677k.f43279D, false, 2, null)) != null) {
            return c3678lB;
        }
        if (c1963w != null) {
            return c1963w.d();
        }
        return null;
    }

    @Override // ib.AbstractC3670d
    public boolean u() {
        return this.f43257c.a().q().d();
    }

    @Override // ib.AbstractC3670d
    public qb.d x(Lb.i iVar) {
        C3862t.g(iVar, "<this>");
        InterfaceC1692e interfaceC1692eF = M0.f((Hb.U) iVar);
        if (interfaceC1692eF != null) {
            return C4597i.m(interfaceC1692eF);
        }
        return null;
    }

    @Override // ib.AbstractC3670d
    public boolean z() {
        return this.f43259e;
    }

    public g0(Sa.a aVar, boolean z10, C3096k containerContext, EnumC1943c containerApplicabilityType, boolean z11) {
        C3862t.g(containerContext, "containerContext");
        C3862t.g(containerApplicabilityType, "containerApplicabilityType");
        this.f43255a = aVar;
        this.f43256b = z10;
        this.f43257c = containerContext;
        this.f43258d = containerApplicabilityType;
        this.f43259e = z11;
    }
}
