package Hb;

import Oa.p;
import java.util.ArrayList;
import java.util.List;
import ub.C4703e;

/* compiled from: TypeSubstitutor.java */
/* loaded from: classes3.dex */
public class J0 {

    /* renamed from: b, reason: collision with root package name */
    public static final J0 f5665b = g(H0.f5660b);

    /* renamed from: a, reason: collision with root package name */
    private final H0 f5666a;

    /* compiled from: TypeSubstitutor.java */
    static class a implements Ba.l<qb.c, Boolean> {
        a() {
        }

        private static /* synthetic */ void a(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
        }

        @Override // Ba.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(qb.c cVar) {
            if (cVar == null) {
                a(0);
            }
            return Boolean.valueOf(!cVar.equals(p.a.f13431Q));
        }
    }

    /* compiled from: TypeSubstitutor.java */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5667a;

        static {
            int[] iArr = new int[d.values().length];
            f5667a = iArr;
            try {
                iArr[d.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5667a[d.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5667a[d.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: TypeSubstitutor.java */
    private static final class c extends Exception {
        public c(String str) {
            super(str);
        }
    }

    /* compiled from: TypeSubstitutor.java */
    private enum d {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    protected J0(H0 h02) {
        if (h02 == null) {
            a(7);
        }
        this.f5666a = h02;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void a(int r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Hb.J0.a(int):void");
    }

    private static void b(int i10, E0 e02, H0 h02) {
        if (i10 <= 100) {
            return;
        }
        throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + o(e02) + "; substitution: " + o(h02));
    }

    public static Q0 c(Q0 q02, E0 e02) {
        if (q02 == null) {
            a(35);
        }
        if (e02 == null) {
            a(36);
        }
        if (!e02.c()) {
            return d(q02, e02.b());
        }
        Q0 q03 = Q0.f5695H;
        if (q03 == null) {
            a(37);
        }
        return q03;
    }

    public static Q0 d(Q0 q02, Q0 q03) {
        if (q02 == null) {
            a(38);
        }
        if (q03 == null) {
            a(39);
        }
        Q0 q04 = Q0.f5693F;
        if (q02 == q04) {
            if (q03 == null) {
                a(40);
            }
            return q03;
        }
        if (q03 == q04) {
            if (q02 == null) {
                a(41);
            }
            return q02;
        }
        if (q02 == q03) {
            if (q03 == null) {
                a(42);
            }
            return q03;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + q02 + "' and projection kind '" + q03 + "' cannot be combined");
    }

    private static d e(Q0 q02, Q0 q03) {
        Q0 q04 = Q0.f5694G;
        return (q02 == q04 && q03 == Q0.f5695H) ? d.OUT_IN_IN_POSITION : (q02 == Q0.f5695H && q03 == q04) ? d.IN_IN_OUT_POSITION : d.NO_CONFLICT;
    }

    public static J0 f(U u10) {
        if (u10 == null) {
            a(6);
        }
        return g(z0.i(u10.O0(), u10.M0()));
    }

    public static J0 g(H0 h02) {
        if (h02 == null) {
            a(0);
        }
        return new J0(h02);
    }

    public static J0 h(H0 h02, H0 h03) {
        if (h02 == null) {
            a(3);
        }
        if (h03 == null) {
            a(4);
        }
        return g(E.i(h02, h03));
    }

    private static Sa.h i(Sa.h hVar) {
        if (hVar == null) {
            a(33);
        }
        return !hVar.P(p.a.f13431Q) ? hVar : new Sa.p(hVar, new a());
    }

    private static E0 l(U u10, E0 e02, Ra.m0 m0Var, E0 e03) {
        if (u10 == null) {
            a(26);
        }
        if (e02 == null) {
            a(27);
        }
        if (e03 == null) {
            a(28);
        }
        if (!u10.getAnnotations().P(p.a.f13431Q)) {
            if (e02 == null) {
                a(29);
            }
            return e02;
        }
        y0 y0VarO0 = e02.a().O0();
        if (!(y0VarO0 instanceof Ib.n)) {
            return e02;
        }
        E0 e0B = ((Ib.n) y0VarO0).b();
        Q0 q0B = e0B.b();
        d dVarE = e(e03.b(), q0B);
        d dVar = d.OUT_IN_IN_POSITION;
        return dVarE == dVar ? new G0(e0B.a()) : (m0Var != null && e(m0Var.p(), q0B) == dVar) ? new G0(e0B.a()) : e02;
    }

    private static String o(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (Rb.d.a(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    private E0 r(E0 e02, int i10) {
        U uA = e02.a();
        Q0 q0B = e02.b();
        if (uA.O0().t() instanceof Ra.m0) {
            return e02;
        }
        AbstractC1082f0 abstractC1082f0B = C1090j0.b(uA);
        U uP = abstractC1082f0B != null ? m().p(abstractC1082f0B, Q0.f5693F) : null;
        U uB = I0.b(uA, s(uA.O0().getParameters(), uA.M0(), i10), this.f5666a.d(uA.getAnnotations()));
        if ((uB instanceof AbstractC1082f0) && (uP instanceof AbstractC1082f0)) {
            uB = C1090j0.j((AbstractC1082f0) uB, (AbstractC1082f0) uP);
        }
        return new G0(q0B, uB);
    }

    private List<E0> s(List<Ra.m0> list, List<E0> list2, int i10) throws c {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z10 = false;
        for (int i11 = 0; i11 < list.size(); i11++) {
            Ra.m0 m0Var = list.get(i11);
            E0 e02 = list2.get(i11);
            E0 e0U = u(e02, m0Var, i10 + 1);
            int i12 = b.f5667a[e(m0Var.p(), e0U.b()).ordinal()];
            if (i12 == 1 || i12 == 2) {
                e0U = M0.s(m0Var);
            } else if (i12 == 3) {
                Q0 q0P = m0Var.p();
                Q0 q02 = Q0.f5693F;
                if (q0P != q02 && !e0U.c()) {
                    e0U = new G0(q02, e0U.a());
                }
            }
            if (e0U != e02) {
                z10 = true;
            }
            arrayList.add(e0U);
        }
        return !z10 ? list2 : arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private E0 u(E0 e02, Ra.m0 m0Var, int i10) throws c {
        if (e02 == null) {
            a(18);
        }
        b(i10, e02, this.f5666a);
        if (e02.c()) {
            return e02;
        }
        U uA = e02.a();
        if (uA instanceof N0) {
            N0 n02 = (N0) uA;
            P0 p0E0 = n02.E0();
            U uH = n02.H();
            E0 e0U = u(new G0(e02.b(), p0E0), m0Var, i10 + 1);
            return e0U.c() ? e0U : new G0(e0U.b(), O0.d(e0U.a().R0(), p(uH, e02.b())));
        }
        if (!G.a(uA) && !(uA.R0() instanceof InterfaceC1080e0)) {
            E0 e0E = this.f5666a.e(uA);
            E0 e0L = e0E != null ? l(uA, e0E, m0Var, e02) : null;
            Q0 q0B = e02.b();
            if (e0L == null && N.b(uA) && !w0.b(uA)) {
                K kA = N.a(uA);
                int i11 = i10 + 1;
                E0 e0U2 = u(new G0(q0B, kA.W0()), m0Var, i11);
                E0 e0U3 = u(new G0(q0B, kA.X0()), m0Var, i11);
                return (e0U2.a() == kA.W0() && e0U3.a() == kA.X0()) ? e02 : new G0(e0U2.b(), X.e(I0.a(e0U2.a()), I0.a(e0U3.a())));
            }
            if (!Oa.j.n0(uA) && !Y.a(uA)) {
                if (e0L != null) {
                    d dVarE = e(q0B, e0L.b());
                    if (!C4703e.f(uA)) {
                        int i12 = b.f5667a[dVarE.ordinal()];
                        if (i12 == 1) {
                            throw new c("Out-projection in in-position");
                        }
                        if (i12 == 2) {
                            return new G0(Q0.f5695H, uA.O0().q().I());
                        }
                    }
                    InterfaceC1111x interfaceC1111xA = w0.a(uA);
                    if (e0L.c()) {
                        return e0L;
                    }
                    U uF0 = interfaceC1111xA != null ? interfaceC1111xA.F0(e0L.a()) : M0.q(e0L.a(), uA.P0());
                    if (!uA.getAnnotations().isEmpty()) {
                        uF0 = Mb.d.C(uF0, new Sa.o(uF0.getAnnotations(), i(this.f5666a.d(uA.getAnnotations()))));
                    }
                    if (dVarE == d.NO_CONFLICT) {
                        q0B = d(q0B, e0L.b());
                    }
                    return new G0(q0B, uF0);
                }
                e02 = r(e02, i10);
                if (e02 == null) {
                    a(25);
                }
            }
        }
        return e02;
    }

    public H0 j() {
        H0 h02 = this.f5666a;
        if (h02 == null) {
            a(8);
        }
        return h02;
    }

    public boolean k() {
        return this.f5666a.f();
    }

    public J0 m() {
        H0 h02 = this.f5666a;
        return ((h02 instanceof O) && h02.b()) ? new J0(new O(((O) this.f5666a).j(), ((O) this.f5666a).i(), false)) : this;
    }

    public U n(U u10, Q0 q02) {
        if (u10 == null) {
            a(9);
        }
        if (q02 == null) {
            a(10);
        }
        if (k()) {
            if (u10 == null) {
                a(11);
            }
            return u10;
        }
        try {
            U uA = u(new G0(q02, u10), null, 0).a();
            if (uA == null) {
                a(12);
            }
            return uA;
        } catch (c e10) {
            Jb.i iVarD = Jb.l.d(Jb.k.f7760e0, e10.getMessage());
            if (iVarD == null) {
                a(13);
            }
            return iVarD;
        }
    }

    public U p(U u10, Q0 q02) {
        if (u10 == null) {
            a(14);
        }
        if (q02 == null) {
            a(15);
        }
        E0 e0Q = q(new G0(q02, j().g(u10, q02)));
        if (e0Q == null) {
            return null;
        }
        return e0Q.a();
    }

    public E0 q(E0 e02) {
        if (e02 == null) {
            a(16);
        }
        E0 e0T = t(e02);
        return (this.f5666a.a() || this.f5666a.b()) ? Nb.c.d(e0T, this.f5666a.b()) : e0T;
    }

    public E0 t(E0 e02) {
        if (e02 == null) {
            a(17);
        }
        if (k()) {
            return e02;
        }
        try {
            return u(e02, null, 0);
        } catch (c unused) {
            return null;
        }
    }
}
