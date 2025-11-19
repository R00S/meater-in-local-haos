package tb;

import Hb.U;
import Hb.x0;
import Hb.y0;
import Ib.C1199a;
import Ib.InterfaceC1200b;
import Ib.e;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;

/* compiled from: OverridingUtilTypeSystemContext.kt */
/* renamed from: tb.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4604p implements InterfaceC1200b {

    /* renamed from: a, reason: collision with root package name */
    private final Map<y0, y0> f50047a;

    /* renamed from: b, reason: collision with root package name */
    private final e.a f50048b;

    /* renamed from: c, reason: collision with root package name */
    private final Ib.g f50049c;

    /* renamed from: d, reason: collision with root package name */
    private final Ib.f f50050d;

    /* renamed from: e, reason: collision with root package name */
    private final Ba.p<U, U, Boolean> f50051e;

    /* compiled from: OverridingUtilTypeSystemContext.kt */
    /* renamed from: tb.p$a */
    public static final class a extends x0 {

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ C4604p f50052k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, boolean z11, C4604p c4604p, Ib.f fVar, Ib.g gVar) {
            super(z10, z11, true, c4604p, fVar, gVar);
            this.f50052k = c4604p;
        }

        @Override // Hb.x0
        public boolean f(Lb.i subType, Lb.i superType) {
            C3862t.g(subType, "subType");
            C3862t.g(superType, "superType");
            if (!(subType instanceof U)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (superType instanceof U) {
                return ((Boolean) this.f50052k.f50051e.invoke(subType, superType)).booleanValue();
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4604p(Map<y0, ? extends y0> map, e.a equalityAxioms, Ib.g kotlinTypeRefiner, Ib.f kotlinTypePreparator, Ba.p<? super U, ? super U, Boolean> pVar) {
        C3862t.g(equalityAxioms, "equalityAxioms");
        C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        C3862t.g(kotlinTypePreparator, "kotlinTypePreparator");
        this.f50047a = map;
        this.f50048b = equalityAxioms;
        this.f50049c = kotlinTypeRefiner;
        this.f50050d = kotlinTypePreparator;
        this.f50051e = pVar;
    }

    private final boolean K0(y0 y0Var, y0 y0Var2) {
        if (this.f50048b.a(y0Var, y0Var2)) {
            return true;
        }
        Map<y0, y0> map = this.f50047a;
        if (map == null) {
            return false;
        }
        y0 y0Var3 = map.get(y0Var);
        y0 y0Var4 = this.f50047a.get(y0Var2);
        if (y0Var3 == null || !C3862t.b(y0Var3, y0Var2)) {
            return y0Var4 != null && C3862t.b(y0Var4, y0Var);
        }
        return true;
    }

    @Override // Lb.o
    public Collection<Lb.i> A(Lb.m mVar) {
        return InterfaceC1200b.a.m0(this, mVar);
    }

    @Override // Hb.K0
    public Lb.i A0(Lb.i iVar) {
        Lb.j jVarD;
        C3862t.g(iVar, "<this>");
        Lb.j jVarC = c(iVar);
        return (jVarC == null || (jVarD = d(jVarC, true)) == null) ? iVar : jVarD;
    }

    @Override // Lb.o
    public boolean B(Lb.j jVar) {
        return InterfaceC1200b.a.O(this, jVar);
    }

    @Override // Lb.o
    public Lb.t B0(Lb.l lVar) {
        return InterfaceC1200b.a.z(this, lVar);
    }

    @Override // Hb.K0
    public Oa.m C(Lb.m mVar) {
        return InterfaceC1200b.a.s(this, mVar);
    }

    @Override // Lb.o
    public boolean C0(Lb.j jVar) {
        return InterfaceC1200b.a.T(this, jVar);
    }

    @Override // Lb.o
    public boolean D(Lb.m mVar) {
        return InterfaceC1200b.a.L(this, mVar);
    }

    @Override // Hb.K0
    public boolean D0(Lb.m mVar) {
        return InterfaceC1200b.a.K(this, mVar);
    }

    @Override // Hb.K0
    public Lb.i E(Lb.i iVar) {
        return InterfaceC1200b.a.x(this, iVar);
    }

    @Override // Lb.o
    public boolean E0(Lb.m mVar) {
        return InterfaceC1200b.a.G(this, mVar);
    }

    @Override // Lb.o
    public boolean F(Lb.m mVar) {
        return InterfaceC1200b.a.Q(this, mVar);
    }

    @Override // Lb.o
    public boolean F0(Lb.j jVar) {
        return InterfaceC1200b.a.a0(this, jVar);
    }

    @Override // Lb.o
    public Lb.n G(Lb.s sVar) {
        return InterfaceC1200b.a.v(this, sVar);
    }

    @Override // Lb.o
    public Lb.j G0(Lb.i iVar) {
        Lb.j jVarE;
        C3862t.g(iVar, "<this>");
        Lb.g gVarM = M(iVar);
        if (gVarM != null && (jVarE = e(gVarM)) != null) {
            return jVarE;
        }
        Lb.j jVarC = c(iVar);
        C3862t.d(jVarC);
        return jVarC;
    }

    @Override // Lb.o
    public boolean H(Lb.n nVar, Lb.m mVar) {
        return InterfaceC1200b.a.C(this, nVar, mVar);
    }

    @Override // Lb.o
    public Lb.i H0(Lb.l lVar) {
        return InterfaceC1200b.a.u(this, lVar);
    }

    @Override // Lb.o
    public Lb.l I(Lb.c cVar) {
        return InterfaceC1200b.a.k0(this, cVar);
    }

    @Override // Lb.o
    public Lb.t I0(Lb.n nVar) {
        return InterfaceC1200b.a.A(this, nVar);
    }

    @Override // Lb.o
    public List<Lb.i> J(Lb.n nVar) {
        return InterfaceC1200b.a.y(this, nVar);
    }

    @Override // Lb.o
    public Lb.l K(Lb.k kVar, int i10) {
        C3862t.g(kVar, "<this>");
        if (kVar instanceof Lb.j) {
            return Q((Lb.i) kVar, i10);
        }
        if (kVar instanceof Lb.a) {
            Lb.l lVar = ((Lb.a) kVar).get(i10);
            C3862t.f(lVar, "get(...)");
            return lVar;
        }
        throw new IllegalStateException(("unknown type argument list type: " + kVar + ", " + P.b(kVar.getClass())).toString());
    }

    @Override // Hb.K0
    public qb.d L(Lb.m mVar) {
        return InterfaceC1200b.a.o(this, mVar);
    }

    public x0 L0(boolean z10, boolean z11) {
        if (this.f50051e != null) {
            return new a(z10, z11, this, this.f50050d, this.f50049c);
        }
        return C1199a.a(z10, z11, this, this.f50050d, this.f50049c);
    }

    @Override // Lb.o
    public Lb.g M(Lb.i iVar) {
        return InterfaceC1200b.a.g(this, iVar);
    }

    @Override // Lb.o
    public Lb.b N(Lb.d dVar) {
        return InterfaceC1200b.a.k(this, dVar);
    }

    @Override // Lb.o
    public boolean O(Lb.m mVar) {
        return InterfaceC1200b.a.M(this, mVar);
    }

    @Override // Lb.o
    public boolean P(Lb.i iVar) {
        C3862t.g(iVar, "<this>");
        return B(m0(iVar)) != B(G0(iVar));
    }

    @Override // Lb.o
    public Lb.l Q(Lb.i iVar, int i10) {
        return InterfaceC1200b.a.m(this, iVar, i10);
    }

    @Override // Lb.o
    public boolean R(Lb.i iVar) {
        return InterfaceC1200b.a.P(this, iVar);
    }

    @Override // Lb.r
    public boolean S(Lb.j jVar, Lb.j jVar2) {
        return InterfaceC1200b.a.D(this, jVar, jVar2);
    }

    @Override // Hb.K0
    public boolean T(Lb.i iVar, qb.c cVar) {
        return InterfaceC1200b.a.B(this, iVar, cVar);
    }

    @Override // Lb.o
    public int U(Lb.m mVar) {
        return InterfaceC1200b.a.i0(this, mVar);
    }

    @Override // Lb.o
    public Lb.j V(Lb.e eVar) {
        return InterfaceC1200b.a.h0(this, eVar);
    }

    @Override // Lb.o
    public boolean W(Lb.i iVar) {
        C3862t.g(iVar, "<this>");
        return F(d0(iVar)) && !l(iVar);
    }

    @Override // Lb.o
    public List<Lb.j> X(Lb.j jVar, Lb.m constructor) {
        C3862t.g(jVar, "<this>");
        C3862t.g(constructor, "constructor");
        return null;
    }

    @Override // Lb.o
    public Lb.i Y(Lb.d dVar) {
        return InterfaceC1200b.a.e0(this, dVar);
    }

    @Override // Lb.o
    public Lb.i Z(Collection<? extends Lb.i> collection) {
        return InterfaceC1200b.a.E(this, collection);
    }

    @Override // Ib.InterfaceC1200b, Lb.o
    public Lb.m a(Lb.j jVar) {
        return InterfaceC1200b.a.o0(this, jVar);
    }

    @Override // Lb.o
    public boolean a0(Lb.i iVar) {
        C3862t.g(iVar, "<this>");
        return (iVar instanceof Lb.j) && B((Lb.j) iVar);
    }

    @Override // Ib.InterfaceC1200b, Lb.o
    public boolean b(Lb.j jVar) {
        return InterfaceC1200b.a.W(this, jVar);
    }

    @Override // Hb.K0
    public Oa.m b0(Lb.m mVar) {
        return InterfaceC1200b.a.r(this, mVar);
    }

    @Override // Ib.InterfaceC1200b, Lb.o
    public Lb.j c(Lb.i iVar) {
        return InterfaceC1200b.a.h(this, iVar);
    }

    @Override // Lb.o
    public boolean c0(Lb.j jVar) {
        return InterfaceC1200b.a.Z(this, jVar);
    }

    @Override // Ib.InterfaceC1200b, Lb.o
    public Lb.j d(Lb.j jVar, boolean z10) {
        return InterfaceC1200b.a.r0(this, jVar, z10);
    }

    @Override // Lb.o
    public Lb.m d0(Lb.i iVar) {
        C3862t.g(iVar, "<this>");
        Lb.j jVarC = c(iVar);
        if (jVarC == null) {
            jVarC = m0(iVar);
        }
        return a(jVarC);
    }

    @Override // Ib.InterfaceC1200b, Lb.o
    public Lb.j e(Lb.g gVar) {
        return InterfaceC1200b.a.p0(this, gVar);
    }

    @Override // Lb.o
    public boolean e0(Lb.i iVar) {
        C3862t.g(iVar, "<this>");
        Lb.j jVarC = c(iVar);
        return (jVarC != null ? f(jVarC) : null) != null;
    }

    @Override // Ib.InterfaceC1200b, Lb.o
    public Lb.d f(Lb.j jVar) {
        return InterfaceC1200b.a.d(this, jVar);
    }

    @Override // Lb.o
    public boolean f0(Lb.i iVar) {
        return InterfaceC1200b.a.J(this, iVar);
    }

    @Override // Ib.InterfaceC1200b, Lb.o
    public Lb.j g(Lb.g gVar) {
        return InterfaceC1200b.a.d0(this, gVar);
    }

    @Override // Lb.o
    public Lb.i g0(Lb.i iVar, boolean z10) {
        return InterfaceC1200b.a.f0(this, iVar, z10);
    }

    @Override // Lb.o
    public Lb.j h(Lb.j jVar, Lb.b bVar) {
        return InterfaceC1200b.a.j(this, jVar, bVar);
    }

    @Override // Lb.o
    public Lb.e h0(Lb.j jVar) {
        return InterfaceC1200b.a.e(this, jVar);
    }

    @Override // Lb.o
    public boolean i(Lb.i iVar) {
        C3862t.g(iVar, "<this>");
        return !C3862t.b(a(m0(iVar)), a(G0(iVar)));
    }

    @Override // Ib.InterfaceC1200b
    public Lb.i i0(Lb.j jVar, Lb.j jVar2) {
        return InterfaceC1200b.a.l(this, jVar, jVar2);
    }

    @Override // Lb.o
    public boolean j(Lb.j jVar) {
        C3862t.g(jVar, "<this>");
        return E0(a(jVar));
    }

    @Override // Lb.o
    public x0.c j0(Lb.j jVar) {
        return InterfaceC1200b.a.l0(this, jVar);
    }

    @Override // Lb.o
    public Lb.n k(Lb.m mVar, int i10) {
        return InterfaceC1200b.a.p(this, mVar, i10);
    }

    @Override // Lb.q
    public boolean k0() {
        return InterfaceC1200b.a.N(this);
    }

    @Override // Lb.o
    public boolean l(Lb.i iVar) {
        return InterfaceC1200b.a.R(this, iVar);
    }

    @Override // Lb.o
    public Lb.i l0(Lb.i iVar) {
        C3862t.g(iVar, "<this>");
        return g0(iVar, false);
    }

    @Override // Lb.o
    public List<Lb.n> m(Lb.m mVar) {
        return InterfaceC1200b.a.q(this, mVar);
    }

    @Override // Lb.o
    public Lb.j m0(Lb.i iVar) {
        Lb.j jVarG;
        C3862t.g(iVar, "<this>");
        Lb.g gVarM = M(iVar);
        if (gVarM != null && (jVarG = g(gVarM)) != null) {
            return jVarG;
        }
        Lb.j jVarC = c(iVar);
        C3862t.d(jVarC);
        return jVarC;
    }

    @Override // Hb.K0
    public Lb.i n(Lb.n nVar) {
        return InterfaceC1200b.a.t(this, nVar);
    }

    @Override // Lb.o
    public List<Lb.l> n0(Lb.i iVar) {
        return InterfaceC1200b.a.n(this, iVar);
    }

    @Override // Lb.o
    public Lb.i o(Lb.i iVar, boolean z10) {
        return InterfaceC1200b.a.q0(this, iVar, z10);
    }

    @Override // Lb.o
    public Lb.c o0(Lb.d dVar) {
        return InterfaceC1200b.a.n0(this, dVar);
    }

    @Override // Lb.o
    public boolean p(Lb.i iVar) {
        C3862t.g(iVar, "<this>");
        Lb.j jVarC = c(iVar);
        return (jVarC != null ? h0(jVarC) : null) != null;
    }

    @Override // Lb.o
    public boolean p0(Lb.m mVar) {
        return InterfaceC1200b.a.I(this, mVar);
    }

    @Override // Lb.o
    public int q(Lb.i iVar) {
        return InterfaceC1200b.a.b(this, iVar);
    }

    @Override // Hb.K0
    public boolean q0(Lb.m mVar) {
        return InterfaceC1200b.a.c0(this, mVar);
    }

    @Override // Lb.o
    public boolean r(Lb.d dVar) {
        return InterfaceC1200b.a.U(this, dVar);
    }

    @Override // Lb.o
    public Lb.l r0(Lb.j jVar, int i10) {
        C3862t.g(jVar, "<this>");
        if (i10 < 0 || i10 >= q(jVar)) {
            return null;
        }
        return Q(jVar, i10);
    }

    @Override // Lb.o
    public Collection<Lb.i> s(Lb.j jVar) {
        return InterfaceC1200b.a.j0(this, jVar);
    }

    @Override // Lb.o
    public Lb.f s0(Lb.g gVar) {
        return InterfaceC1200b.a.f(this, gVar);
    }

    @Override // Lb.o
    public boolean t(Lb.m c12, Lb.m c22) {
        C3862t.g(c12, "c1");
        C3862t.g(c22, "c2");
        if (!(c12 instanceof y0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (c22 instanceof y0) {
            return InterfaceC1200b.a.a(this, c12, c22) || K0((y0) c12, (y0) c22);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // Lb.o
    public boolean t0(Lb.d dVar) {
        return InterfaceC1200b.a.S(this, dVar);
    }

    @Override // Lb.o
    public Lb.k u(Lb.j jVar) {
        return InterfaceC1200b.a.c(this, jVar);
    }

    @Override // Lb.o
    public Lb.l u0(Lb.i iVar) {
        return InterfaceC1200b.a.i(this, iVar);
    }

    @Override // Lb.o
    public boolean v(Lb.m mVar) {
        return InterfaceC1200b.a.H(this, mVar);
    }

    @Override // Lb.o
    public boolean v0(Lb.i iVar) {
        return InterfaceC1200b.a.b0(this, iVar);
    }

    @Override // Lb.o
    public boolean w(Lb.j jVar) {
        C3862t.g(jVar, "<this>");
        return D(a(jVar));
    }

    @Override // Lb.o
    public boolean w0(Lb.m mVar) {
        return InterfaceC1200b.a.F(this, mVar);
    }

    @Override // Lb.o
    public Lb.j x(Lb.j jVar) {
        Lb.j jVarV;
        C3862t.g(jVar, "<this>");
        Lb.e eVarH0 = h0(jVar);
        return (eVarH0 == null || (jVarV = V(eVarH0)) == null) ? jVar : jVarV;
    }

    @Override // Lb.o
    public Lb.n x0(Lb.m mVar) {
        return InterfaceC1200b.a.w(this, mVar);
    }

    @Override // Lb.o
    public boolean y(Lb.l lVar) {
        return InterfaceC1200b.a.Y(this, lVar);
    }

    @Override // Lb.o
    public boolean y0(Lb.i iVar) {
        C3862t.g(iVar, "<this>");
        Lb.g gVarM = M(iVar);
        return (gVarM != null ? s0(gVarM) : null) != null;
    }

    @Override // Lb.o
    public boolean z(Lb.i iVar) {
        return InterfaceC1200b.a.V(this, iVar);
    }

    @Override // Lb.o
    public int z0(Lb.k kVar) {
        C3862t.g(kVar, "<this>");
        if (kVar instanceof Lb.j) {
            return q((Lb.i) kVar);
        }
        if (kVar instanceof Lb.a) {
            return ((Lb.a) kVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + kVar + ", " + P.b(kVar.getClass())).toString());
    }
}
