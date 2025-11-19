package Hb;

import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: TypeUtils.java */
/* loaded from: classes3.dex */
public class M0 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC1082f0 f5683a = Jb.l.d(Jb.k.f7762f0, new String[0]);

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC1082f0 f5684b = Jb.l.d(Jb.k.f7748Y, new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC1082f0 f5685c = new a("NO_EXPECTED_TYPE");

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC1082f0 f5686d = new a("UNIT_EXPECTED_TYPE");

    /* compiled from: TypeUtils.java */
    public static class a extends B {

        /* renamed from: C, reason: collision with root package name */
        private final String f5687C;

        public a(String str) {
            this.f5687C = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ void a1(int r9) {
            /*
                r0 = 4
                r1 = 1
                if (r9 == r1) goto L9
                if (r9 == r0) goto L9
                java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto Lb
            L9:
                java.lang.String r2 = "@NotNull method %s.%s must not return null"
            Lb:
                r3 = 3
                r4 = 2
                if (r9 == r1) goto L13
                if (r9 == r0) goto L13
                r5 = r3
                goto L14
            L13:
                r5 = r4
            L14:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
                r7 = 0
                if (r9 == r1) goto L30
                if (r9 == r4) goto L2b
                if (r9 == r3) goto L26
                if (r9 == r0) goto L30
                java.lang.String r8 = "newAttributes"
                r5[r7] = r8
                goto L32
            L26:
                java.lang.String r8 = "kotlinTypeRefiner"
                r5[r7] = r8
                goto L32
            L2b:
                java.lang.String r8 = "delegate"
                r5[r7] = r8
                goto L32
            L30:
                r5[r7] = r6
            L32:
                java.lang.String r7 = "refine"
                if (r9 == r1) goto L3e
                if (r9 == r0) goto L3b
                r5[r1] = r6
                goto L42
            L3b:
                r5[r1] = r7
                goto L42
            L3e:
                java.lang.String r6 = "toString"
                r5[r1] = r6
            L42:
                if (r9 == r1) goto L56
                if (r9 == r4) goto L52
                if (r9 == r3) goto L4f
                if (r9 == r0) goto L56
                java.lang.String r3 = "replaceAttributes"
                r5[r4] = r3
                goto L56
            L4f:
                r5[r4] = r7
                goto L56
            L52:
                java.lang.String r3 = "replaceDelegate"
                r5[r4] = r3
            L56:
                java.lang.String r2 = java.lang.String.format(r2, r5)
                if (r9 == r1) goto L64
                if (r9 == r0) goto L64
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                r9.<init>(r2)
                goto L69
            L64:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>(r2)
            L69:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: Hb.M0.a.a1(int):void");
        }

        @Override // Hb.P0
        /* renamed from: V0, reason: merged with bridge method [inline-methods] */
        public AbstractC1082f0 S0(boolean z10) {
            throw new IllegalStateException(this.f5687C);
        }

        @Override // Hb.P0
        /* renamed from: W0, reason: merged with bridge method [inline-methods] */
        public AbstractC1082f0 U0(u0 u0Var) {
            if (u0Var == null) {
                a1(0);
            }
            throw new IllegalStateException(this.f5687C);
        }

        @Override // Hb.B
        protected AbstractC1082f0 X0() {
            throw new IllegalStateException(this.f5687C);
        }

        @Override // Hb.B
        public B Z0(AbstractC1082f0 abstractC1082f0) {
            if (abstractC1082f0 == null) {
                a1(2);
            }
            throw new IllegalStateException(this.f5687C);
        }

        @Override // Hb.B
        /* renamed from: b1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public a Y0(Ib.g gVar) {
            if (gVar == null) {
                a1(3);
            }
            return this;
        }

        @Override // Hb.AbstractC1082f0
        public String toString() {
            String str = this.f5687C;
            if (str == null) {
                a1(1);
            }
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void a(int r24) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Hb.M0.a(int):void");
    }

    public static boolean b(U u10) {
        if (u10 == null) {
            a(28);
        }
        if (u10.P0()) {
            return true;
        }
        return N.b(u10) && b(N.a(u10).X0());
    }

    public static boolean c(U u10, Ba.l<P0, Boolean> lVar) {
        if (lVar == null) {
            a(43);
        }
        return d(u10, lVar, null);
    }

    private static boolean d(U u10, Ba.l<P0, Boolean> lVar, Rb.l<U> lVar2) {
        if (lVar == null) {
            a(44);
        }
        if (u10 == null) {
            return false;
        }
        P0 p0R0 = u10.R0();
        if (w(u10)) {
            return lVar.invoke(p0R0).booleanValue();
        }
        if (lVar2 != null && lVar2.contains(u10)) {
            return false;
        }
        if (lVar.invoke(p0R0).booleanValue()) {
            return true;
        }
        if (lVar2 == null) {
            lVar2 = Rb.l.h();
        }
        lVar2.add(u10);
        K k10 = p0R0 instanceof K ? (K) p0R0 : null;
        if (k10 != null && (d(k10.W0(), lVar, lVar2) || d(k10.X0(), lVar, lVar2))) {
            return true;
        }
        if ((p0R0 instanceof C1113z) && d(((C1113z) p0R0).a1(), lVar, lVar2)) {
            return true;
        }
        y0 y0VarO0 = u10.O0();
        if (y0VarO0 instanceof T) {
            Iterator<U> it = ((T) y0VarO0).s().iterator();
            while (it.hasNext()) {
                if (d(it.next(), lVar, lVar2)) {
                    return true;
                }
            }
            return false;
        }
        for (E0 e02 : u10.M0()) {
            if (!e02.c() && d(e02.a(), lVar, lVar2)) {
                return true;
            }
        }
        return false;
    }

    public static U e(U u10, U u11, J0 j02) {
        if (u10 == null) {
            a(20);
        }
        if (u11 == null) {
            a(21);
        }
        if (j02 == null) {
            a(22);
        }
        U uP = j02.p(u11, Q0.f5693F);
        if (uP != null) {
            return q(uP, u10.P0());
        }
        return null;
    }

    public static InterfaceC1692e f(U u10) {
        if (u10 == null) {
            a(30);
        }
        InterfaceC1695h interfaceC1695hT = u10.O0().t();
        if (interfaceC1695hT instanceof InterfaceC1692e) {
            return (InterfaceC1692e) interfaceC1695hT;
        }
        return null;
    }

    public static List<E0> g(List<Ra.m0> list) {
        if (list == null) {
            a(16);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Ra.m0> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new G0(it.next().u()));
        }
        List<E0> listW0 = kotlin.collections.r.W0(arrayList);
        if (listW0 == null) {
            a(17);
        }
        return listW0;
    }

    public static List<U> h(U u10) {
        if (u10 == null) {
            a(18);
        }
        J0 j0F = J0.f(u10);
        Collection<U> collectionS = u10.O0().s();
        ArrayList arrayList = new ArrayList(collectionS.size());
        Iterator<U> it = collectionS.iterator();
        while (it.hasNext()) {
            U uE = e(u10, it.next(), j0F);
            if (uE != null) {
                arrayList.add(uE);
            }
        }
        return arrayList;
    }

    public static Ra.m0 i(U u10) {
        if (u10 == null) {
            a(63);
        }
        if (u10.O0().t() instanceof Ra.m0) {
            return (Ra.m0) u10.O0().t();
        }
        return null;
    }

    public static boolean j(U u10) {
        if (u10 == null) {
            a(29);
        }
        if (u10.O0().t() instanceof InterfaceC1692e) {
            return false;
        }
        Iterator<U> it = h(u10).iterator();
        while (it.hasNext()) {
            if (l(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(U u10) {
        return u10 != null && u10.O0() == f5683a.O0();
    }

    public static boolean l(U u10) {
        if (u10 == null) {
            a(27);
        }
        if (u10.P0()) {
            return true;
        }
        if (N.b(u10) && l(N.a(u10).X0())) {
            return true;
        }
        if (C1090j0.c(u10)) {
            return false;
        }
        if (m(u10)) {
            return j(u10);
        }
        if (u10 instanceof AbstractC1079e) {
            Ra.m0 m0VarA = ((AbstractC1079e) u10).X0().a();
            return m0VarA == null || j(m0VarA.u());
        }
        y0 y0VarO0 = u10.O0();
        if (y0VarO0 instanceof T) {
            Iterator<U> it = y0VarO0.s().iterator();
            while (it.hasNext()) {
                if (l(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean m(U u10) {
        if (u10 == null) {
            a(60);
        }
        return i(u10) != null || (u10.O0() instanceof Ib.r);
    }

    public static U n(U u10) {
        if (u10 == null) {
            a(2);
        }
        return p(u10, false);
    }

    public static U o(U u10) {
        if (u10 == null) {
            a(1);
        }
        return p(u10, true);
    }

    public static U p(U u10, boolean z10) {
        if (u10 == null) {
            a(3);
        }
        P0 p0S0 = u10.R0().S0(z10);
        if (p0S0 == null) {
            a(4);
        }
        return p0S0;
    }

    public static U q(U u10, boolean z10) {
        if (u10 == null) {
            a(8);
        }
        if (z10) {
            return o(u10);
        }
        if (u10 == null) {
            a(9);
        }
        return u10;
    }

    public static AbstractC1082f0 r(AbstractC1082f0 abstractC1082f0, boolean z10) {
        if (abstractC1082f0 == null) {
            a(5);
        }
        if (!z10) {
            if (abstractC1082f0 == null) {
                a(7);
            }
            return abstractC1082f0;
        }
        AbstractC1082f0 abstractC1082f0S0 = abstractC1082f0.S0(true);
        if (abstractC1082f0S0 == null) {
            a(6);
        }
        return abstractC1082f0S0;
    }

    public static E0 s(Ra.m0 m0Var) {
        if (m0Var == null) {
            a(45);
        }
        return new C1096m0(m0Var);
    }

    public static E0 t(Ra.m0 m0Var, I i10) {
        if (m0Var == null) {
            a(46);
        }
        return i10.b() == L0.f5677B ? new G0(C1098n0.b(m0Var)) : new C1096m0(m0Var);
    }

    public static AbstractC1082f0 u(y0 y0Var, Ab.k kVar, Ba.l<Ib.g, AbstractC1082f0> lVar) {
        if (y0Var == null) {
            a(12);
        }
        if (kVar == null) {
            a(13);
        }
        if (lVar == null) {
            a(14);
        }
        AbstractC1082f0 abstractC1082f0N = X.n(u0.f5791C.j(), y0Var, g(y0Var.getParameters()), false, kVar, lVar);
        if (abstractC1082f0N == null) {
            a(15);
        }
        return abstractC1082f0N;
    }

    public static AbstractC1082f0 v(InterfaceC1695h interfaceC1695h, Ab.k kVar, Ba.l<Ib.g, AbstractC1082f0> lVar) {
        if (!Jb.l.m(interfaceC1695h)) {
            return u(interfaceC1695h.l(), kVar, lVar);
        }
        Jb.i iVarD = Jb.l.d(Jb.k.f7760e0, interfaceC1695h.toString());
        if (iVarD == null) {
            a(11);
        }
        return iVarD;
    }

    public static boolean w(U u10) {
        if (u10 == null) {
            a(0);
        }
        return u10 == f5685c || u10 == f5686d;
    }
}
