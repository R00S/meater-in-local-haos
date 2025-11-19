package fb;

import Hb.AbstractC1082f0;
import Hb.D0;
import Hb.E0;
import Hb.G0;
import Hb.H;
import Hb.H0;
import Hb.L0;
import Hb.N;
import Hb.Q0;
import Hb.U;
import Hb.X;
import Hb.Y;
import Hb.u0;
import Hb.y0;
import Jb.l;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.m0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4170o;
import oa.v;
import xb.C5087e;

/* compiled from: RawSubstitution.kt */
/* renamed from: fb.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3362i extends H0 {

    /* renamed from: e, reason: collision with root package name */
    public static final a f41446e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final C3354a f41447f;

    /* renamed from: g, reason: collision with root package name */
    private static final C3354a f41448g;

    /* renamed from: c, reason: collision with root package name */
    private final C3360g f41449c;

    /* renamed from: d, reason: collision with root package name */
    private final D0 f41450d;

    /* compiled from: RawSubstitution.kt */
    /* renamed from: fb.i$a */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        private a() {
        }
    }

    static {
        L0 l02 = L0.f5678C;
        f41447f = C3355b.b(l02, false, true, null, 5, null).l(EnumC3356c.f41428D);
        f41448g = C3355b.b(l02, false, true, null, 5, null).l(EnumC3356c.f41427C);
    }

    public C3362i(D0 d02) {
        C3360g c3360g = new C3360g();
        this.f41449c = c3360g;
        if (d02 == null) {
            d02 = new D0(c3360g, null, 2, 0 == true ? 1 : 0);
        }
        this.f41450d = d02;
    }

    private final C4170o<AbstractC1082f0, Boolean> j(AbstractC1082f0 abstractC1082f0, InterfaceC1692e interfaceC1692e, C3354a c3354a) {
        if (abstractC1082f0.O0().getParameters().isEmpty()) {
            return v.a(abstractC1082f0, Boolean.FALSE);
        }
        if (Oa.j.c0(abstractC1082f0)) {
            E0 e02 = abstractC1082f0.M0().get(0);
            Q0 q0B = e02.b();
            U uA = e02.a();
            C3862t.f(uA, "getType(...)");
            return v.a(X.k(abstractC1082f0.N0(), abstractC1082f0.O0(), r.e(new G0(q0B, l(uA, c3354a))), abstractC1082f0.P0(), null, 16, null), Boolean.FALSE);
        }
        if (Y.a(abstractC1082f0)) {
            return v.a(l.d(Jb.k.f7774l0, abstractC1082f0.O0().toString()), Boolean.FALSE);
        }
        Ab.k kVarH0 = interfaceC1692e.H0(this);
        C3862t.f(kVarH0, "getMemberScope(...)");
        u0 u0VarN0 = abstractC1082f0.N0();
        y0 y0VarL = interfaceC1692e.l();
        C3862t.f(y0VarL, "getTypeConstructor(...)");
        List<m0> parameters = interfaceC1692e.l().getParameters();
        C3862t.f(parameters, "getParameters(...)");
        List<m0> list = parameters;
        ArrayList arrayList = new ArrayList(r.x(list, 10));
        for (m0 m0Var : list) {
            C3360g c3360g = this.f41449c;
            C3862t.d(m0Var);
            arrayList.add(H.b(c3360g, m0Var, c3354a, this.f41450d, null, 8, null));
        }
        return v.a(X.n(u0VarN0, y0VarL, arrayList, abstractC1082f0.P0(), kVarH0, new C3361h(interfaceC1692e, this, abstractC1082f0, c3354a)), Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC1082f0 k(InterfaceC1692e interfaceC1692e, C3362i c3362i, AbstractC1082f0 abstractC1082f0, C3354a c3354a, Ib.g kotlinTypeRefiner) {
        InterfaceC1692e interfaceC1692eB;
        C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        qb.b bVarN = C5087e.n(interfaceC1692e);
        if (bVarN == null || (interfaceC1692eB = kotlinTypeRefiner.b(bVarN)) == null || C3862t.b(interfaceC1692eB, interfaceC1692e)) {
            return null;
        }
        return c3362i.j(abstractC1082f0, interfaceC1692eB, c3354a).c();
    }

    private final U l(U u10, C3354a c3354a) {
        InterfaceC1695h interfaceC1695hT = u10.O0().t();
        if (interfaceC1695hT instanceof m0) {
            return l(this.f41450d.e((m0) interfaceC1695hT, c3354a.j(true)), c3354a);
        }
        if (!(interfaceC1695hT instanceof InterfaceC1692e)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + interfaceC1695hT).toString());
        }
        InterfaceC1695h interfaceC1695hT2 = N.d(u10).O0().t();
        if (interfaceC1695hT2 instanceof InterfaceC1692e) {
            C4170o<AbstractC1082f0, Boolean> c4170oJ = j(N.c(u10), (InterfaceC1692e) interfaceC1695hT, f41447f);
            AbstractC1082f0 abstractC1082f0A = c4170oJ.a();
            boolean zBooleanValue = c4170oJ.b().booleanValue();
            C4170o<AbstractC1082f0, Boolean> c4170oJ2 = j(N.d(u10), (InterfaceC1692e) interfaceC1695hT2, f41448g);
            AbstractC1082f0 abstractC1082f0A2 = c4170oJ2.a();
            return (zBooleanValue || c4170oJ2.b().booleanValue()) ? new C3364k(abstractC1082f0A, abstractC1082f0A2) : X.e(abstractC1082f0A, abstractC1082f0A2);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + interfaceC1695hT2 + "\" while for lower it's \"" + interfaceC1695hT + '\"').toString());
    }

    static /* synthetic */ U m(C3362i c3362i, U u10, C3354a c3354a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            c3354a = new C3354a(L0.f5678C, null, false, false, null, null, 62, null);
        }
        return c3362i.l(u10, c3354a);
    }

    @Override // Hb.H0
    public boolean f() {
        return false;
    }

    @Override // Hb.H0
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public G0 e(U key) {
        C3862t.g(key, "key");
        return new G0(m(this, key, null, 2, null));
    }

    public /* synthetic */ C3362i(D0 d02, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? null : d02);
    }
}
