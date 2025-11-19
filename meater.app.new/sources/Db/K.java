package Db;

import Db.N;
import Fb.C1020a;
import Fb.C1022c;
import Fb.C1032m;
import Ra.AbstractC1707u;
import Ra.EnumC1693f;
import Ra.InterfaceC1688a;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1691d;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1700m;
import Ra.c0;
import Ra.g0;
import Ra.h0;
import Ra.l0;
import Ra.m0;
import Ra.t0;
import Sa.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C3862t;
import lb.C3922b;
import lb.C3924d;
import lb.C3929i;
import lb.C3934n;
import lb.C3937q;
import lb.C3938r;
import lb.C3939s;
import lb.EnumC3931k;
import nb.C4076b;
import oa.C4170o;
import tb.C4596h;
import vb.AbstractC4943g;
import xb.C5087e;

/* compiled from: MemberDeserializer.kt */
/* loaded from: classes3.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    private final C1010p f3616a;

    /* renamed from: b, reason: collision with root package name */
    private final C1001g f3617b;

    public K(C1010p c10) {
        C3862t.g(c10, "c");
        this.f3616a = c10;
        this.f3617b = new C1001g(c10.c().q(), c10.c().r());
    }

    private final c0 A(C3937q c3937q, C1010p c1010p, InterfaceC1688a interfaceC1688a, int i10) {
        return C4596h.b(interfaceC1688a, c1010p.i().u(c3937q), null, Sa.h.f15630e.b(), i10);
    }

    private final List<t0> B(List<lb.u> list, kotlin.reflect.jvm.internal.impl.protobuf.o oVar, EnumC0998d enumC0998d) {
        InterfaceC1700m interfaceC1700mE = this.f3616a.e();
        C3862t.e(interfaceC1700mE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        InterfaceC1688a interfaceC1688a = (InterfaceC1688a) interfaceC1700mE;
        InterfaceC1700m interfaceC1700mC = interfaceC1688a.c();
        C3862t.f(interfaceC1700mC, "getContainingDeclaration(...)");
        N nI = i(interfaceC1700mC);
        List<lb.u> list2 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list2, 10));
        int i10 = 0;
        for (Object obj : list2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kotlin.collections.r.w();
            }
            lb.u uVar = (lb.u) obj;
            int iL = uVar.R() ? uVar.L() : 0;
            Sa.h hVarB = (nI == null || !C4076b.f45815c.d(iL).booleanValue()) ? Sa.h.f15630e.b() : new Fb.T(this.f3616a.h(), new H(this, nI, oVar, enumC0998d, i10, uVar));
            qb.f fVarB = L.b(this.f3616a.g(), uVar.M());
            Hb.U u10 = this.f3616a.i().u(nb.f.q(uVar, this.f3616a.j()));
            Boolean boolD = C4076b.f45804H.d(iL);
            C3862t.f(boolD, "get(...)");
            boolean zBooleanValue = boolD.booleanValue();
            Boolean boolD2 = C4076b.f45805I.d(iL);
            C3862t.f(boolD2, "get(...)");
            boolean zBooleanValue2 = boolD2.booleanValue();
            Boolean boolD3 = C4076b.f45806J.d(iL);
            C3862t.f(boolD3, "get(...)");
            boolean zBooleanValue3 = boolD3.booleanValue();
            C3937q c3937qT = nb.f.t(uVar, this.f3616a.j());
            Hb.U u11 = c3937qT != null ? this.f3616a.i().u(c3937qT) : null;
            h0 NO_SOURCE = h0.f15158a;
            C3862t.f(NO_SOURCE, "NO_SOURCE");
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new Ua.V(interfaceC1688a, null, i10, hVarB, fVarB, u10, zBooleanValue, zBooleanValue2, zBooleanValue3, u11, NO_SOURCE));
            arrayList = arrayList2;
            i10 = i11;
        }
        return kotlin.collections.r.W0(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List C(K k10, N n10, kotlin.reflect.jvm.internal.impl.protobuf.o oVar, EnumC0998d enumC0998d, int i10, lb.u uVar) {
        return kotlin.collections.r.W0(k10.f3616a.c().d().d(n10, oVar, enumC0998d, i10, uVar));
    }

    private final N i(InterfaceC1700m interfaceC1700m) {
        if (interfaceC1700m instanceof Ra.N) {
            return new N.b(((Ra.N) interfaceC1700m).f(), this.f3616a.g(), this.f3616a.j(), this.f3616a.d());
        }
        if (interfaceC1700m instanceof C1032m) {
            return ((C1032m) interfaceC1700m).j1();
        }
        return null;
    }

    private final Sa.h j(kotlin.reflect.jvm.internal.impl.protobuf.o oVar, int i10, EnumC0998d enumC0998d) {
        return !C4076b.f45815c.d(i10).booleanValue() ? Sa.h.f15630e.b() : new Fb.T(this.f3616a.h(), new E(this, oVar, enumC0998d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List k(K k10, kotlin.reflect.jvm.internal.impl.protobuf.o oVar, EnumC0998d enumC0998d) {
        N nI = k10.i(k10.f3616a.e());
        List listW0 = nI != null ? kotlin.collections.r.W0(k10.f3616a.c().d().l(nI, oVar, enumC0998d)) : null;
        return listW0 == null ? kotlin.collections.r.m() : listW0;
    }

    private final c0 l() {
        InterfaceC1700m interfaceC1700mE = this.f3616a.e();
        InterfaceC1692e interfaceC1692e = interfaceC1700mE instanceof InterfaceC1692e ? (InterfaceC1692e) interfaceC1700mE : null;
        if (interfaceC1692e != null) {
            return interfaceC1692e.K0();
        }
        return null;
    }

    private final Sa.h m(C3934n c3934n, boolean z10) {
        return !C4076b.f45815c.d(c3934n.b0()).booleanValue() ? Sa.h.f15630e.b() : new Fb.T(this.f3616a.h(), new F(this, z10, c3934n));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List n(K k10, boolean z10, C3934n c3934n) {
        N nI = k10.i(k10.f3616a.e());
        List listW0 = nI != null ? z10 ? kotlin.collections.r.W0(k10.f3616a.c().d().i(nI, c3934n)) : kotlin.collections.r.W0(k10.f3616a.c().d().f(nI, c3934n)) : null;
        return listW0 == null ? kotlin.collections.r.m() : listW0;
    }

    private final Sa.h o(kotlin.reflect.jvm.internal.impl.protobuf.o oVar, EnumC0998d enumC0998d) {
        return new C1020a(this.f3616a.h(), new G(this, oVar, enumC0998d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List p(K k10, kotlin.reflect.jvm.internal.impl.protobuf.o oVar, EnumC0998d enumC0998d) {
        N nI = k10.i(k10.f3616a.e());
        List<Sa.c> listC = nI != null ? k10.f3616a.c().d().c(nI, oVar, enumC0998d) : null;
        return listC == null ? kotlin.collections.r.m() : listC;
    }

    private final void q(Fb.O o10, c0 c0Var, c0 c0Var2, List<? extends c0> list, List<? extends m0> list2, List<? extends t0> list3, Hb.U u10, Ra.E e10, AbstractC1707u abstractC1707u, Map<? extends InterfaceC1688a.InterfaceC0222a<?>, ?> map) {
        o10.p1(c0Var, c0Var2, list, list2, list3, u10, e10, abstractC1707u, map);
    }

    private final int t(int i10) {
        return (i10 & 63) + ((i10 >> 8) << 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gb.j v(K k10, C3934n c3934n, Fb.N n10) {
        return k10.f3616a.h().i(new I(k10, c3934n, n10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC4943g w(K k10, C3934n c3934n, Fb.N n10) {
        N nI = k10.i(k10.f3616a.e());
        C3862t.d(nI);
        InterfaceC0999e<Sa.c, AbstractC4943g<?>> interfaceC0999eD = k10.f3616a.c().d();
        Hb.U returnType = n10.getReturnType();
        C3862t.f(returnType, "getReturnType(...)");
        return interfaceC0999eD.b(nI, c3934n, returnType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gb.j x(K k10, C3934n c3934n, Fb.N n10) {
        return k10.f3616a.h().i(new J(k10, c3934n, n10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC4943g y(K k10, C3934n c3934n, Fb.N n10) {
        N nI = k10.i(k10.f3616a.e());
        C3862t.d(nI);
        InterfaceC0999e<Sa.c, AbstractC4943g<?>> interfaceC0999eD = k10.f3616a.c().d();
        Hb.U returnType = n10.getReturnType();
        C3862t.f(returnType, "getReturnType(...)");
        return interfaceC0999eD.h(nI, c3934n, returnType);
    }

    public final InterfaceC1691d r(C3924d proto, boolean z10) {
        C3862t.g(proto, "proto");
        InterfaceC1700m interfaceC1700mE = this.f3616a.e();
        C3862t.e(interfaceC1700mE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        InterfaceC1692e interfaceC1692e = (InterfaceC1692e) interfaceC1700mE;
        int iK = proto.K();
        EnumC0998d enumC0998d = EnumC0998d.FUNCTION;
        C1022c c1022c = new C1022c(interfaceC1692e, null, j(proto, iK, enumC0998d), z10, InterfaceC1689b.a.DECLARATION, proto, this.f3616a.g(), this.f3616a.j(), this.f3616a.k(), this.f3616a.d(), null, 1024, null);
        K kF = C1010p.b(this.f3616a, c1022c, kotlin.collections.r.m(), null, null, null, null, 60, null).f();
        List<lb.u> listN = proto.N();
        C3862t.f(listN, "getValueParameterList(...)");
        c1022c.r1(kF.B(listN, proto, enumC0998d), P.a(O.f3632a, C4076b.f45816d.d(proto.K())));
        c1022c.h1(interfaceC1692e.u());
        c1022c.X0(interfaceC1692e.K());
        c1022c.Z0(!C4076b.f45827o.d(proto.K()).booleanValue());
        return c1022c;
    }

    public final g0 s(C3929i proto) {
        Hb.U u10;
        C3862t.g(proto, "proto");
        int iD0 = proto.u0() ? proto.d0() : t(proto.f0());
        EnumC0998d enumC0998d = EnumC0998d.FUNCTION;
        Sa.h hVarJ = j(proto, iD0, enumC0998d);
        Sa.h hVarO = nb.f.g(proto) ? o(proto, enumC0998d) : Sa.h.f15630e.b();
        Fb.O o10 = new Fb.O(this.f3616a.e(), null, hVarJ, L.b(this.f3616a.g(), proto.e0()), P.b(O.f3632a, C4076b.f45828p.d(iD0)), proto, this.f3616a.g(), this.f3616a.j(), C3862t.b(C5087e.o(this.f3616a.e()).c(L.b(this.f3616a.g(), proto.e0())), Q.f3644a) ? nb.h.f45846b.b() : this.f3616a.k(), this.f3616a.d(), null, 1024, null);
        C1010p c1010p = this.f3616a;
        List<C3939s> listN0 = proto.n0();
        C3862t.f(listN0, "getTypeParameterList(...)");
        C1010p c1010pB = C1010p.b(c1010p, o10, listN0, null, null, null, null, 60, null);
        C3937q c3937qK = nb.f.k(proto, this.f3616a.j());
        c0 c0VarI = (c3937qK == null || (u10 = c1010pB.i().u(c3937qK)) == null) ? null : C4596h.i(o10, u10, hVarO);
        c0 c0VarL = l();
        List<C3937q> listC = nb.f.c(proto, this.f3616a.j());
        List<? extends c0> arrayList = new ArrayList<>();
        int i10 = 0;
        for (Object obj : listC) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kotlin.collections.r.w();
            }
            c0 c0VarA = A((C3937q) obj, c1010pB, o10, i10);
            if (c0VarA != null) {
                arrayList.add(c0VarA);
            }
            i10 = i11;
        }
        List<m0> listM = c1010pB.i().m();
        K kF = c1010pB.f();
        List<lb.u> listR0 = proto.r0();
        C3862t.f(listR0, "getValueParameterList(...)");
        List<t0> listB = kF.B(listR0, proto, EnumC0998d.FUNCTION);
        Hb.U u11 = c1010pB.i().u(nb.f.m(proto, this.f3616a.j()));
        O o11 = O.f3632a;
        q(o10, c0VarI, c0VarL, arrayList, listM, listB, u11, o11.b(C4076b.f45817e.d(iD0)), P.a(o11, C4076b.f45816d.d(iD0)), kotlin.collections.M.h());
        o10.g1(C4076b.f45829q.d(iD0).booleanValue());
        o10.d1(C4076b.f45830r.d(iD0).booleanValue());
        o10.Y0(C4076b.f45833u.d(iD0).booleanValue());
        o10.f1(C4076b.f45831s.d(iD0).booleanValue());
        o10.j1(C4076b.f45832t.d(iD0).booleanValue());
        o10.i1(C4076b.f45834v.d(iD0).booleanValue());
        o10.X0(C4076b.f45835w.d(iD0).booleanValue());
        o10.Z0(!C4076b.f45836x.d(iD0).booleanValue());
        C4170o<InterfaceC1688a.InterfaceC0222a<?>, Object> c4170oA = this.f3616a.c().h().a(proto, o10, this.f3616a.j(), c1010pB.i());
        if (c4170oA != null) {
            o10.V0(c4170oA.c(), c4170oA.d());
        }
        return o10;
    }

    public final Ra.Z u(C3934n proto) {
        C3934n c3934n;
        Sa.h hVarB;
        Fb.N n10;
        c0 c0VarI;
        C1010p c1010p;
        C4076b.d<EnumC3931k> dVar;
        C4076b.d<lb.x> dVar2;
        Fb.N n11;
        C3934n c3934n2;
        Ua.L l10;
        Ua.L l11;
        Ua.M mE;
        Ua.L l12;
        Hb.U u10;
        C3862t.g(proto, "proto");
        int iB0 = proto.q0() ? proto.b0() : t(proto.e0());
        InterfaceC1700m interfaceC1700mE = this.f3616a.e();
        Sa.h hVarJ = j(proto, iB0, EnumC0998d.PROPERTY);
        O o10 = O.f3632a;
        Ra.E eB = o10.b(C4076b.f45817e.d(iB0));
        AbstractC1707u abstractC1707uA = P.a(o10, C4076b.f45816d.d(iB0));
        Boolean boolD = C4076b.f45837y.d(iB0);
        C3862t.f(boolD, "get(...)");
        boolean zBooleanValue = boolD.booleanValue();
        qb.f fVarB = L.b(this.f3616a.g(), proto.d0());
        InterfaceC1689b.a aVarB = P.b(o10, C4076b.f45828p.d(iB0));
        Boolean boolD2 = C4076b.f45799C.d(iB0);
        C3862t.f(boolD2, "get(...)");
        boolean zBooleanValue2 = boolD2.booleanValue();
        Boolean boolD3 = C4076b.f45798B.d(iB0);
        C3862t.f(boolD3, "get(...)");
        boolean zBooleanValue3 = boolD3.booleanValue();
        Boolean boolD4 = C4076b.f45801E.d(iB0);
        C3862t.f(boolD4, "get(...)");
        boolean zBooleanValue4 = boolD4.booleanValue();
        Boolean boolD5 = C4076b.f45802F.d(iB0);
        C3862t.f(boolD5, "get(...)");
        boolean zBooleanValue5 = boolD5.booleanValue();
        Boolean boolD6 = C4076b.f45803G.d(iB0);
        C3862t.f(boolD6, "get(...)");
        Fb.N n12 = new Fb.N(interfaceC1700mE, null, hVarJ, eB, abstractC1707uA, zBooleanValue, fVarB, aVarB, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, boolD6.booleanValue(), proto, this.f3616a.g(), this.f3616a.j(), this.f3616a.k(), this.f3616a.d());
        C1010p c1010p2 = this.f3616a;
        List<C3939s> listO0 = proto.o0();
        C3862t.f(listO0, "getTypeParameterList(...)");
        C1010p c1010pB = C1010p.b(c1010p2, n12, listO0, null, null, null, null, 60, null);
        Boolean boolD7 = C4076b.f45838z.d(iB0);
        C3862t.f(boolD7, "get(...)");
        boolean zBooleanValue6 = boolD7.booleanValue();
        if (zBooleanValue6 && nb.f.h(proto)) {
            c3934n = proto;
            hVarB = o(c3934n, EnumC0998d.PROPERTY_GETTER);
        } else {
            c3934n = proto;
            hVarB = Sa.h.f15630e.b();
        }
        Hb.U u11 = c1010pB.i().u(nb.f.n(c3934n, this.f3616a.j()));
        List<m0> listM = c1010pB.i().m();
        c0 c0VarL = l();
        C3937q c3937qL = nb.f.l(c3934n, this.f3616a.j());
        if (c3937qL == null || (u10 = c1010pB.i().u(c3937qL)) == null) {
            n10 = n12;
            c0VarI = null;
        } else {
            n10 = n12;
            c0VarI = C4596h.i(n10, u10, hVarB);
        }
        List<C3937q> listD = nb.f.d(c3934n, this.f3616a.j());
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(listD, 10));
        int i10 = 0;
        for (Object obj : listD) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kotlin.collections.r.w();
            }
            arrayList.add(A((C3937q) obj, c1010pB, n10, i10));
            i10 = i11;
        }
        n10.c1(u11, listM, c0VarL, c0VarI, arrayList);
        Boolean boolD8 = C4076b.f45815c.d(iB0);
        C3862t.f(boolD8, "get(...)");
        boolean zBooleanValue7 = boolD8.booleanValue();
        C4076b.d<lb.x> dVar3 = C4076b.f45816d;
        lb.x xVarD = dVar3.d(iB0);
        C4076b.d<EnumC3931k> dVar4 = C4076b.f45817e;
        int iB = C4076b.b(zBooleanValue7, xVarD, dVar4.d(iB0), false, false, false);
        if (zBooleanValue6) {
            int iC0 = proto.r0() ? proto.c0() : iB;
            Boolean boolD9 = C4076b.f45807K.d(iC0);
            C3862t.f(boolD9, "get(...)");
            boolean zBooleanValue8 = boolD9.booleanValue();
            Boolean boolD10 = C4076b.f45808L.d(iC0);
            C3862t.f(boolD10, "get(...)");
            boolean zBooleanValue9 = boolD10.booleanValue();
            Boolean boolD11 = C4076b.f45809M.d(iC0);
            C3862t.f(boolD11, "get(...)");
            boolean zBooleanValue10 = boolD11.booleanValue();
            Sa.h hVarJ2 = j(c3934n, iC0, EnumC0998d.PROPERTY_GETTER);
            if (zBooleanValue8) {
                O o11 = O.f3632a;
                dVar = dVar4;
                c1010p = c1010pB;
                n11 = n10;
                dVar2 = dVar3;
                c3934n2 = c3934n;
                l12 = new Ua.L(n10, hVarJ2, o11.b(dVar4.d(iC0)), P.a(o11, dVar3.d(iC0)), !zBooleanValue8, zBooleanValue9, zBooleanValue10, n10.i(), null, h0.f15158a);
            } else {
                c1010p = c1010pB;
                dVar = dVar4;
                dVar2 = dVar3;
                n11 = n10;
                c3934n2 = c3934n;
                Ua.L lD = C4596h.d(n11, hVarJ2);
                C3862t.d(lD);
                l12 = lD;
            }
            l12.R0(n11.getReturnType());
            l10 = l12;
        } else {
            c1010p = c1010pB;
            dVar = dVar4;
            dVar2 = dVar3;
            n11 = n10;
            c3934n2 = c3934n;
            l10 = null;
        }
        if (C4076b.f45797A.d(iB0).booleanValue()) {
            if (proto.y0()) {
                iB = proto.k0();
            }
            int i12 = iB;
            Boolean boolD12 = C4076b.f45807K.d(i12);
            C3862t.f(boolD12, "get(...)");
            boolean zBooleanValue11 = boolD12.booleanValue();
            Boolean boolD13 = C4076b.f45808L.d(i12);
            C3862t.f(boolD13, "get(...)");
            boolean zBooleanValue12 = boolD13.booleanValue();
            Boolean boolD14 = C4076b.f45809M.d(i12);
            C3862t.f(boolD14, "get(...)");
            boolean zBooleanValue13 = boolD14.booleanValue();
            EnumC0998d enumC0998d = EnumC0998d.PROPERTY_SETTER;
            Sa.h hVarJ3 = j(c3934n2, i12, enumC0998d);
            if (zBooleanValue11) {
                O o12 = O.f3632a;
                l11 = l10;
                Ua.M m10 = new Ua.M(n11, hVarJ3, o12.b(dVar.d(i12)), P.a(o12, dVar2.d(i12)), !zBooleanValue11, zBooleanValue12, zBooleanValue13, n11.i(), null, h0.f15158a);
                m10.S0((t0) kotlin.collections.r.J0(C1010p.b(c1010p, m10, kotlin.collections.r.m(), null, null, null, null, 60, null).f().B(kotlin.collections.r.e(proto.l0()), c3934n2, enumC0998d)));
                mE = m10;
            } else {
                l11 = l10;
                mE = C4596h.e(n11, hVarJ3, Sa.h.f15630e.b());
                C3862t.d(mE);
            }
        } else {
            l11 = l10;
            mE = null;
        }
        if (C4076b.f45800D.d(iB0).booleanValue()) {
            n11.M0(new C(this, c3934n2, n11));
        }
        InterfaceC1700m interfaceC1700mE2 = this.f3616a.e();
        InterfaceC1692e interfaceC1692e = interfaceC1700mE2 instanceof InterfaceC1692e ? (InterfaceC1692e) interfaceC1700mE2 : null;
        if ((interfaceC1692e != null ? interfaceC1692e.i() : null) == EnumC1693f.f15147G) {
            n11.M0(new D(this, c3934n2, n11));
        }
        n11.W0(l11, mE, new Ua.r(m(c3934n2, false), n11), new Ua.r(m(c3934n2, true), n11));
        return n11;
    }

    public final l0 z(C3938r proto) {
        C3862t.g(proto, "proto");
        h.a aVar = Sa.h.f15630e;
        List<C3922b> listR = proto.R();
        C3862t.f(listR, "getAnnotationList(...)");
        List<C3922b> list = listR;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
        for (C3922b c3922b : list) {
            C1001g c1001g = this.f3617b;
            C3862t.d(c3922b);
            arrayList.add(c1001g.a(c3922b, this.f3616a.g()));
        }
        Fb.P p10 = new Fb.P(this.f3616a.h(), this.f3616a.e(), aVar.a(arrayList), L.b(this.f3616a.g(), proto.X()), P.a(O.f3632a, C4076b.f45816d.d(proto.W())), proto, this.f3616a.g(), this.f3616a.j(), this.f3616a.k(), this.f3616a.d());
        C1010p c1010p = this.f3616a;
        List<C3939s> listA0 = proto.a0();
        C3862t.f(listA0, "getTypeParameterList(...)");
        C1010p c1010pB = C1010p.b(c1010p, p10, listA0, null, null, null, null, 60, null);
        p10.X0(c1010pB.i().m(), c1010pB.i().o(nb.f.r(proto, this.f3616a.j()), false), c1010pB.i().o(nb.f.e(proto, this.f3616a.j()), false));
        return p10;
    }
}
