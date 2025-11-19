package fb;

import Hb.AbstractC1082f0;
import Hb.C1072a0;
import Hb.D0;
import Hb.E0;
import Hb.G0;
import Hb.L0;
import Hb.M0;
import Hb.Q0;
import Hb.U;
import Hb.X;
import Hb.u0;
import Hb.v0;
import Hb.y0;
import Jb.l;
import Oa.m;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.m0;
import Sa.o;
import ab.C1940V;
import db.C3092g;
import db.C3096k;
import db.InterfaceC3101p;
import hb.C3504A;
import hb.InterfaceC3506C;
import hb.InterfaceC3513f;
import hb.InterfaceC3514g;
import hb.InterfaceC3516i;
import hb.InterfaceC3517j;
import hb.InterfaceC3529v;
import hb.InterfaceC3531x;
import hb.InterfaceC3532y;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;

/* compiled from: JavaTypeResolver.kt */
/* renamed from: fb.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3358e {

    /* renamed from: a, reason: collision with root package name */
    private final C3096k f41436a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3101p f41437b;

    /* renamed from: c, reason: collision with root package name */
    private final C3360g f41438c;

    /* renamed from: d, reason: collision with root package name */
    private final D0 f41439d;

    public C3358e(C3096k c10, InterfaceC3101p typeParameterResolver) {
        C3862t.g(c10, "c");
        C3862t.g(typeParameterResolver, "typeParameterResolver");
        this.f41436a = c10;
        this.f41437b = typeParameterResolver;
        C3360g c3360g = new C3360g();
        this.f41438c = c3360g;
        this.f41439d = new D0(c3360g, null, 2, 0 == true ? 1 : 0);
    }

    private final boolean b(InterfaceC3517j interfaceC3517j, InterfaceC1692e interfaceC1692e) {
        Q0 q0P;
        if (!C3504A.a((InterfaceC3531x) r.w0(interfaceC3517j.F()))) {
            return false;
        }
        List<m0> parameters = Qa.d.f14596a.b(interfaceC1692e).l().getParameters();
        C3862t.f(parameters, "getParameters(...)");
        m0 m0Var = (m0) r.w0(parameters);
        return (m0Var == null || (q0P = m0Var.p()) == null || q0P == Q0.f5695H) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List<Hb.E0> c(hb.InterfaceC3517j r10, fb.C3354a r11, Hb.y0 r12) {
        /*
            r9 = this;
            boolean r0 = r10.y()
            java.lang.String r1 = "getParameters(...)"
            if (r0 != 0) goto L24
            java.util.List r0 = r10.F()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L22
            java.util.List r0 = r12.getParameters()
            kotlin.jvm.internal.C3862t.f(r0, r1)
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L22
            goto L24
        L22:
            r0 = 0
            goto L25
        L24:
            r0 = 1
        L25:
            java.util.List r2 = r12.getParameters()
            kotlin.jvm.internal.C3862t.f(r2, r1)
            if (r0 == 0) goto L33
            java.util.List r10 = r9.d(r10, r2, r12, r11)
            return r10
        L33:
            int r11 = r2.size()
            java.util.List r12 = r10.F()
            int r12 = r12.size()
            r0 = 10
            if (r11 == r12) goto L7e
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = kotlin.collections.r.x(r2, r0)
            r10.<init>(r11)
            java.util.Iterator r11 = r2.iterator()
        L52:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L79
            java.lang.Object r12 = r11.next()
            Ra.m0 r12 = (Ra.m0) r12
            Hb.G0 r0 = new Hb.G0
            Jb.k r1 = Jb.k.f7786x0
            qb.f r12 = r12.getName()
            java.lang.String r12 = r12.j()
            java.lang.String[] r12 = new java.lang.String[]{r12}
            Jb.i r12 = Jb.l.d(r1, r12)
            r0.<init>(r12)
            r10.add(r0)
            goto L52
        L79:
            java.util.List r10 = kotlin.collections.r.W0(r10)
            return r10
        L7e:
            java.util.List r10 = r10.F()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Iterable r10 = kotlin.collections.r.d1(r10)
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = kotlin.collections.r.x(r10, r0)
            r11.<init>(r12)
            java.util.Iterator r10 = r10.iterator()
        L95:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto Lca
            java.lang.Object r12 = r10.next()
            kotlin.collections.G r12 = (kotlin.collections.IndexedValue) r12
            int r0 = r12.getIndex()
            java.lang.Object r12 = r12.b()
            hb.x r12 = (hb.InterfaceC3531x) r12
            r2.size()
            java.lang.Object r0 = r2.get(r0)
            Ra.m0 r0 = (Ra.m0) r0
            Hb.L0 r3 = Hb.L0.f5678C
            r7 = 7
            r8 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            fb.a r1 = fb.C3355b.b(r3, r4, r5, r6, r7, r8)
            kotlin.jvm.internal.C3862t.d(r0)
            Hb.E0 r12 = r9.q(r12, r1, r0)
            r11.add(r12)
            goto L95
        Lca:
            java.util.List r10 = kotlin.collections.r.W0(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.C3358e.c(hb.j, fb.a, Hb.y0):java.util.List");
    }

    private final List<E0> d(InterfaceC3517j interfaceC3517j, List<? extends m0> list, y0 y0Var, C3354a c3354a) {
        List<? extends m0> list2 = list;
        ArrayList arrayList = new ArrayList(r.x(list2, 10));
        for (m0 m0Var : list2) {
            arrayList.add(Mb.d.q(m0Var, null, c3354a.c()) ? M0.t(m0Var, c3354a) : this.f41438c.a(m0Var, c3354a.j(interfaceC3517j.y()), this.f41439d, new C1072a0(this.f41436a.e(), new C3357d(this, m0Var, c3354a, y0Var, interfaceC3517j))));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U e(C3358e c3358e, m0 m0Var, C3354a c3354a, y0 y0Var, InterfaceC3517j interfaceC3517j) {
        D0 d02 = c3358e.f41439d;
        InterfaceC1695h interfaceC1695hT = y0Var.t();
        return d02.e(m0Var, c3354a.k(interfaceC1695hT != null ? interfaceC1695hT.u() : null).j(interfaceC3517j.y()));
    }

    private final AbstractC1082f0 f(InterfaceC3517j interfaceC3517j, C3354a c3354a, AbstractC1082f0 abstractC1082f0) {
        u0 u0VarB;
        if (abstractC1082f0 == null || (u0VarB = abstractC1082f0.N0()) == null) {
            u0VarB = v0.b(new C3092g(this.f41436a, interfaceC3517j, false, 4, null));
        }
        u0 u0Var = u0VarB;
        y0 y0VarG = g(interfaceC3517j, c3354a);
        if (y0VarG == null) {
            return null;
        }
        boolean zJ = j(c3354a);
        return (C3862t.b(abstractC1082f0 != null ? abstractC1082f0.O0() : null, y0VarG) && !interfaceC3517j.y() && zJ) ? abstractC1082f0.S0(true) : X.k(u0Var, y0VarG, c(interfaceC3517j, c3354a, y0VarG), zJ, null, 16, null);
    }

    private final y0 g(InterfaceC3517j interfaceC3517j, C3354a c3354a) {
        y0 y0VarL;
        InterfaceC3516i interfaceC3516iD = interfaceC3517j.d();
        if (interfaceC3516iD == null) {
            return h(interfaceC3517j);
        }
        if (!(interfaceC3516iD instanceof InterfaceC3514g)) {
            if (interfaceC3516iD instanceof InterfaceC3532y) {
                m0 m0VarA = this.f41437b.a((InterfaceC3532y) interfaceC3516iD);
                if (m0VarA != null) {
                    return m0VarA.l();
                }
                return null;
            }
            throw new IllegalStateException("Unknown classifier kind: " + interfaceC3516iD);
        }
        InterfaceC3514g interfaceC3514g = (InterfaceC3514g) interfaceC3516iD;
        qb.c cVarF = interfaceC3514g.f();
        if (cVarF != null) {
            InterfaceC1692e interfaceC1692eK = k(interfaceC3517j, c3354a, cVarF);
            if (interfaceC1692eK == null) {
                interfaceC1692eK = this.f41436a.a().n().a(interfaceC3514g);
            }
            return (interfaceC1692eK == null || (y0VarL = interfaceC1692eK.l()) == null) ? h(interfaceC3517j) : y0VarL;
        }
        throw new AssertionError("Class type should have a FQ name: " + interfaceC3516iD);
    }

    private final y0 h(InterfaceC3517j interfaceC3517j) {
        y0 y0VarL = this.f41436a.a().b().f().r().d(qb.b.f48178d.c(new qb.c(interfaceC3517j.z())), r.e(0)).l();
        C3862t.f(y0VarL, "getTypeConstructor(...)");
        return y0VarL;
    }

    private final boolean i(Q0 q02, m0 m0Var) {
        return (m0Var.p() == Q0.f5693F || q02 == m0Var.p()) ? false : true;
    }

    private final boolean j(C3354a c3354a) {
        return (c3354a.g() == EnumC3356c.f41428D || c3354a.h() || c3354a.b() == L0.f5677B) ? false : true;
    }

    private final InterfaceC1692e k(InterfaceC3517j interfaceC3517j, C3354a c3354a, qb.c cVar) {
        if (c3354a.h() && C3862t.b(cVar, C3359f.f41440a)) {
            return this.f41436a.a().p().d();
        }
        Qa.d dVar = Qa.d.f14596a;
        InterfaceC1692e interfaceC1692eF = Qa.d.f(dVar, cVar, this.f41436a.d().q(), null, 4, null);
        if (interfaceC1692eF == null) {
            return null;
        }
        return (dVar.d(interfaceC1692eF) && (c3354a.g() == EnumC3356c.f41428D || c3354a.b() == L0.f5677B || b(interfaceC3517j, interfaceC1692eF))) ? dVar.b(interfaceC1692eF) : interfaceC1692eF;
    }

    public static /* synthetic */ U m(C3358e c3358e, InterfaceC3513f interfaceC3513f, C3354a c3354a, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return c3358e.l(interfaceC3513f, c3354a, z10);
    }

    private final U n(InterfaceC3517j interfaceC3517j, C3354a c3354a) {
        boolean z10 = (c3354a.h() || c3354a.b() == L0.f5677B) ? false : true;
        boolean zY = interfaceC3517j.y();
        if (!zY && !z10) {
            AbstractC1082f0 abstractC1082f0F = f(interfaceC3517j, c3354a, null);
            return abstractC1082f0F != null ? abstractC1082f0F : o(interfaceC3517j);
        }
        AbstractC1082f0 abstractC1082f0F2 = f(interfaceC3517j, c3354a.l(EnumC3356c.f41428D), null);
        if (abstractC1082f0F2 == null) {
            return o(interfaceC3517j);
        }
        AbstractC1082f0 abstractC1082f0F3 = f(interfaceC3517j, c3354a.l(EnumC3356c.f41427C), abstractC1082f0F2);
        return abstractC1082f0F3 == null ? o(interfaceC3517j) : zY ? new C3364k(abstractC1082f0F2, abstractC1082f0F3) : X.e(abstractC1082f0F2, abstractC1082f0F3);
    }

    private static final Jb.i o(InterfaceC3517j interfaceC3517j) {
        return l.d(Jb.k.f7712G, interfaceC3517j.p());
    }

    private final E0 q(InterfaceC3531x interfaceC3531x, C3354a c3354a, m0 m0Var) {
        if (!(interfaceC3531x instanceof InterfaceC3506C)) {
            return new G0(Q0.f5693F, p(interfaceC3531x, c3354a));
        }
        InterfaceC3506C interfaceC3506C = (InterfaceC3506C) interfaceC3531x;
        InterfaceC3531x interfaceC3531xD = interfaceC3506C.D();
        Q0 q02 = interfaceC3506C.J() ? Q0.f5695H : Q0.f5694G;
        if (interfaceC3531xD == null || i(q02, m0Var)) {
            E0 e0T = M0.t(m0Var, c3354a);
            C3862t.f(e0T, "makeStarProjection(...)");
            return e0T;
        }
        Sa.c cVarA = C1940V.a(this.f41436a, interfaceC3506C);
        U uP = p(interfaceC3531xD, C3355b.b(L0.f5678C, false, false, null, 7, null));
        if (cVarA != null) {
            uP = Mb.d.C(uP, Sa.h.f15630e.a(r.E0(uP.getAnnotations(), cVarA)));
        }
        return Mb.d.k(uP, q02, m0Var);
    }

    public final U l(InterfaceC3513f arrayType, C3354a attr, boolean z10) {
        C3862t.g(arrayType, "arrayType");
        C3862t.g(attr, "attr");
        InterfaceC3531x interfaceC3531xM = arrayType.m();
        InterfaceC3529v interfaceC3529v = interfaceC3531xM instanceof InterfaceC3529v ? (InterfaceC3529v) interfaceC3531xM : null;
        m mVarA = interfaceC3529v != null ? interfaceC3529v.a() : null;
        C3092g c3092g = new C3092g(this.f41436a, arrayType, true);
        if (mVarA != null) {
            AbstractC1082f0 abstractC1082f0O = this.f41436a.d().q().O(mVarA);
            C3862t.d(abstractC1082f0O);
            U uC = Mb.d.C(abstractC1082f0O, new o(abstractC1082f0O.getAnnotations(), c3092g));
            C3862t.e(uC, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
            AbstractC1082f0 abstractC1082f0 = (AbstractC1082f0) uC;
            return attr.h() ? abstractC1082f0 : X.e(abstractC1082f0, abstractC1082f0.S0(true));
        }
        U uP = p(interfaceC3531xM, C3355b.b(L0.f5678C, attr.h(), false, null, 6, null));
        if (attr.h()) {
            AbstractC1082f0 abstractC1082f0M = this.f41436a.d().q().m(z10 ? Q0.f5695H : Q0.f5693F, uP, c3092g);
            C3862t.f(abstractC1082f0M, "getArrayType(...)");
            return abstractC1082f0M;
        }
        AbstractC1082f0 abstractC1082f0M2 = this.f41436a.d().q().m(Q0.f5693F, uP, c3092g);
        C3862t.f(abstractC1082f0M2, "getArrayType(...)");
        return X.e(abstractC1082f0M2, this.f41436a.d().q().m(Q0.f5695H, uP, c3092g).S0(true));
    }

    public final U p(InterfaceC3531x interfaceC3531x, C3354a attr) {
        U uP;
        C3862t.g(attr, "attr");
        if (interfaceC3531x instanceof InterfaceC3529v) {
            m mVarA = ((InterfaceC3529v) interfaceC3531x).a();
            AbstractC1082f0 abstractC1082f0R = mVarA != null ? this.f41436a.d().q().R(mVarA) : this.f41436a.d().q().Z();
            C3862t.d(abstractC1082f0R);
            return abstractC1082f0R;
        }
        if (interfaceC3531x instanceof InterfaceC3517j) {
            return n((InterfaceC3517j) interfaceC3531x, attr);
        }
        if (interfaceC3531x instanceof InterfaceC3513f) {
            return m(this, (InterfaceC3513f) interfaceC3531x, attr, false, 4, null);
        }
        if (interfaceC3531x instanceof InterfaceC3506C) {
            InterfaceC3531x interfaceC3531xD = ((InterfaceC3506C) interfaceC3531x).D();
            if (interfaceC3531xD != null && (uP = p(interfaceC3531xD, attr)) != null) {
                return uP;
            }
            AbstractC1082f0 abstractC1082f0Y = this.f41436a.d().q().y();
            C3862t.f(abstractC1082f0Y, "getDefaultBound(...)");
            return abstractC1082f0Y;
        }
        if (interfaceC3531x == null) {
            AbstractC1082f0 abstractC1082f0Y2 = this.f41436a.d().q().y();
            C3862t.f(abstractC1082f0Y2, "getDefaultBound(...)");
            return abstractC1082f0Y2;
        }
        throw new UnsupportedOperationException("Unsupported type: " + interfaceC3531x);
    }
}
