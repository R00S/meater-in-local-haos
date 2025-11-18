package sb;

import Hb.AbstractC1082f0;
import Hb.C1071a;
import Hb.C1090j0;
import Hb.C1100o0;
import Hb.C1113z;
import Hb.E0;
import Hb.K;
import Hb.M0;
import Hb.P0;
import Hb.Q0;
import Hb.R0;
import Hb.T;
import Hb.U;
import Hb.y0;
import Oa.p;
import Ra.AbstractC1707u;
import Ra.C1706t;
import Ra.EnumC1693f;
import Ra.H;
import Ra.InterfaceC1688a;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1691d;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1696i;
import Ra.InterfaceC1699l;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1702o;
import Ra.InterfaceC1703p;
import Ra.InterfaceC1709w;
import Ra.InterfaceC1712z;
import Ra.M;
import Ra.N;
import Ra.V;
import Ra.X;
import Ra.Y;
import Ra.Z;
import Ra.a0;
import Ra.b0;
import Ra.c0;
import Ra.l0;
import Ra.m0;
import Ra.q0;
import Ra.t0;
import Ra.u0;
import Ub.C1786a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4165j;
import oa.InterfaceC4164i;
import sb.n;
import tb.C4597i;
import vb.AbstractC4943g;
import vb.C4937a;
import vb.C4938b;
import vb.t;
import xb.C5087e;

/* compiled from: DescriptorRendererImpl.kt */
/* loaded from: classes3.dex */
public final class u extends n implements w {

    /* renamed from: m, reason: collision with root package name */
    private final z f49609m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC4164i f49610n;

    /* compiled from: DescriptorRendererImpl.kt */
    private final class a implements InterfaceC1702o<C4153F, StringBuilder> {

        /* compiled from: DescriptorRendererImpl.kt */
        /* renamed from: sb.u$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0702a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f49612a;

            static {
                int[] iArr = new int[E.values().length];
                try {
                    iArr[E.f49559B.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[E.f49560C.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[E.f49561D.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f49612a = iArr;
            }
        }

        public a() {
        }

        private final void t(Y y10, StringBuilder sb2, String str) throws IOException {
            int i10 = C0702a.f49612a[u.this.P0().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    p(y10, sb2);
                    return;
                } else {
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
            }
            u.this.w1(y10, sb2);
            sb2.append(str + " for ");
            u uVar = u.this;
            Z zA0 = y10.A0();
            C3862t.f(zA0, "getCorrespondingProperty(...)");
            uVar.h2(zA0, sb2);
        }

        public void A(t0 descriptor, StringBuilder builder) {
            C3862t.g(descriptor, "descriptor");
            C3862t.g(builder, "builder");
            u.this.B2(descriptor, true, builder, true);
        }

        @Override // Ra.InterfaceC1702o
        public /* bridge */ /* synthetic */ C4153F a(Z z10, StringBuilder sb2) throws IOException {
            u(z10, sb2);
            return C4153F.f46609a;
        }

        @Override // Ra.InterfaceC1702o
        public /* bridge */ /* synthetic */ C4153F b(V v10, StringBuilder sb2) {
            s(v10, sb2);
            return C4153F.f46609a;
        }

        @Override // Ra.InterfaceC1702o
        public /* bridge */ /* synthetic */ C4153F c(l0 l0Var, StringBuilder sb2) {
            y(l0Var, sb2);
            return C4153F.f46609a;
        }

        @Override // Ra.InterfaceC1702o
        public /* bridge */ /* synthetic */ C4153F d(c0 c0Var, StringBuilder sb2) {
            x(c0Var, sb2);
            return C4153F.f46609a;
        }

        @Override // Ra.InterfaceC1702o
        public /* bridge */ /* synthetic */ C4153F e(t0 t0Var, StringBuilder sb2) {
            A(t0Var, sb2);
            return C4153F.f46609a;
        }

        @Override // Ra.InterfaceC1702o
        public /* bridge */ /* synthetic */ C4153F f(N n10, StringBuilder sb2) {
            r(n10, sb2);
            return C4153F.f46609a;
        }

        @Override // Ra.InterfaceC1702o
        public /* bridge */ /* synthetic */ C4153F g(b0 b0Var, StringBuilder sb2) throws IOException {
            w(b0Var, sb2);
            return C4153F.f46609a;
        }

        @Override // Ra.InterfaceC1702o
        public /* bridge */ /* synthetic */ C4153F h(InterfaceC1692e interfaceC1692e, StringBuilder sb2) throws IOException {
            n(interfaceC1692e, sb2);
            return C4153F.f46609a;
        }

        @Override // Ra.InterfaceC1702o
        public /* bridge */ /* synthetic */ C4153F i(InterfaceC1699l interfaceC1699l, StringBuilder sb2) throws IOException {
            o(interfaceC1699l, sb2);
            return C4153F.f46609a;
        }

        @Override // Ra.InterfaceC1702o
        public /* bridge */ /* synthetic */ C4153F j(m0 m0Var, StringBuilder sb2) {
            z(m0Var, sb2);
            return C4153F.f46609a;
        }

        @Override // Ra.InterfaceC1702o
        public /* bridge */ /* synthetic */ C4153F k(a0 a0Var, StringBuilder sb2) throws IOException {
            v(a0Var, sb2);
            return C4153F.f46609a;
        }

        @Override // Ra.InterfaceC1702o
        public /* bridge */ /* synthetic */ C4153F l(H h10, StringBuilder sb2) {
            q(h10, sb2);
            return C4153F.f46609a;
        }

        @Override // Ra.InterfaceC1702o
        public /* bridge */ /* synthetic */ C4153F m(InterfaceC1712z interfaceC1712z, StringBuilder sb2) throws IOException {
            p(interfaceC1712z, sb2);
            return C4153F.f46609a;
        }

        public void n(InterfaceC1692e descriptor, StringBuilder builder) throws IOException {
            C3862t.g(descriptor, "descriptor");
            C3862t.g(builder, "builder");
            u.this.C1(descriptor, builder);
        }

        public void o(InterfaceC1699l constructorDescriptor, StringBuilder builder) throws IOException {
            C3862t.g(constructorDescriptor, "constructorDescriptor");
            C3862t.g(builder, "builder");
            u.this.H1(constructorDescriptor, builder);
        }

        public void p(InterfaceC1712z descriptor, StringBuilder builder) throws IOException {
            C3862t.g(descriptor, "descriptor");
            C3862t.g(builder, "builder");
            u.this.P1(descriptor, builder);
        }

        public void q(H descriptor, StringBuilder builder) {
            C3862t.g(descriptor, "descriptor");
            C3862t.g(builder, "builder");
            u.this.Z1(descriptor, builder, true);
        }

        public void r(N descriptor, StringBuilder builder) {
            C3862t.g(descriptor, "descriptor");
            C3862t.g(builder, "builder");
            u.this.d2(descriptor, builder);
        }

        public void s(V descriptor, StringBuilder builder) {
            C3862t.g(descriptor, "descriptor");
            C3862t.g(builder, "builder");
            u.this.f2(descriptor, builder);
        }

        public void u(Z descriptor, StringBuilder builder) throws IOException {
            C3862t.g(descriptor, "descriptor");
            C3862t.g(builder, "builder");
            u.this.h2(descriptor, builder);
        }

        public void v(a0 descriptor, StringBuilder builder) throws IOException {
            C3862t.g(descriptor, "descriptor");
            C3862t.g(builder, "builder");
            t(descriptor, builder, "getter");
        }

        public void w(b0 descriptor, StringBuilder builder) throws IOException {
            C3862t.g(descriptor, "descriptor");
            C3862t.g(builder, "builder");
            t(descriptor, builder, "setter");
        }

        public void x(c0 descriptor, StringBuilder builder) {
            C3862t.g(descriptor, "descriptor");
            C3862t.g(builder, "builder");
            builder.append(descriptor.getName());
        }

        public void y(l0 descriptor, StringBuilder builder) {
            C3862t.g(descriptor, "descriptor");
            C3862t.g(builder, "builder");
            u.this.q2(descriptor, builder);
        }

        public void z(m0 descriptor, StringBuilder builder) {
            C3862t.g(descriptor, "descriptor");
            C3862t.g(builder, "builder");
            u.this.w2(descriptor, builder, true);
        }
    }

    /* compiled from: DescriptorRendererImpl.kt */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f49613a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f49614b;

        static {
            int[] iArr = new int[F.values().length];
            try {
                iArr[F.f49564B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[F.f49565C.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f49613a = iArr;
            int[] iArr2 = new int[D.values().length];
            try {
                iArr2[D.f49554B.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[D.f49555C.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[D.f49556D.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f49614b = iArr2;
        }
    }

    public u(z options) {
        C3862t.g(options, "options");
        this.f49609m = options;
        options.p0();
        this.f49610n = C4165j.a(new o(this));
    }

    static /* synthetic */ void A1(u uVar, StringBuilder sb2, Sa.a aVar, Sa.e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            eVar = null;
        }
        uVar.z1(sb2, aVar, eVar);
    }

    static /* synthetic */ void A2(u uVar, u0 u0Var, StringBuilder sb2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        uVar.z2(u0Var, sb2, z10);
    }

    private final void B1(InterfaceC1696i interfaceC1696i, StringBuilder sb2) {
        List<m0> listW = interfaceC1696i.w();
        C3862t.f(listW, "getDeclaredTypeParameters(...)");
        List<m0> parameters = interfaceC1696i.l().getParameters();
        C3862t.f(parameters, "getParameters(...)");
        if (j1() && interfaceC1696i.L() && parameters.size() > listW.size()) {
            sb2.append(" /*captured type parameters: ");
            x2(sb2, parameters.subList(listW.size(), parameters.size()));
            sb2.append("*/");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B2(Ra.t0 r10, boolean r11, java.lang.StringBuilder r12, boolean r13) {
        /*
            r9 = this;
            if (r13 == 0) goto L10
            java.lang.String r0 = "value-parameter"
            java.lang.String r0 = r9.S1(r0)
            r12.append(r0)
            java.lang.String r0 = " "
            r12.append(r0)
        L10:
            boolean r0 = r9.j1()
            if (r0 == 0) goto L27
            java.lang.String r0 = "/*"
            r12.append(r0)
            int r0 = r10.getIndex()
            r12.append(r0)
        */
        //  java.lang.String r0 = "*/ "
        /*
            r12.append(r0)
        L27:
            r5 = 2
            r6 = 0
            r4 = 0
            r1 = r9
            r2 = r12
            r3 = r10
            A1(r1, r2, r3, r4, r5, r6)
            boolean r0 = r10.Z()
            java.lang.String r1 = "crossinline"
            r9.Y1(r12, r0, r1)
            boolean r0 = r10.W()
            java.lang.String r1 = "noinline"
            r9.Y1(r12, r0, r1)
            boolean r0 = r9.Y0()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L60
            Ra.a r0 = r10.c()
            boolean r3 = r0 instanceof Ra.InterfaceC1691d
            if (r3 == 0) goto L55
            Ra.d r0 = (Ra.InterfaceC1691d) r0
            goto L56
        L55:
            r0 = 0
        L56:
            if (r0 == 0) goto L60
            boolean r0 = r0.A()
            if (r0 != r2) goto L60
            r8 = r2
            goto L61
        L60:
            r8 = r1
        L61:
            if (r8 == 0) goto L6c
            boolean r0 = r9.v0()
            java.lang.String r3 = "actual"
            r9.Y1(r12, r0, r3)
        L6c:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r3.D2(r4, r5, r6, r7, r8)
            Ba.l r11 = r9.B0()
            if (r11 == 0) goto L8c
            boolean r11 = r9.p()
            if (r11 == 0) goto L85
            boolean r11 = r10.r0()
            goto L89
        L85:
            boolean r11 = xb.C5087e.f(r10)
        L89:
            if (r11 == 0) goto L8c
            r1 = r2
        L8c:
            if (r1 == 0) goto Laf
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = " = "
            r11.append(r13)
            Ba.l r13 = r9.B0()
            kotlin.jvm.internal.C3862t.d(r13)
            java.lang.Object r10 = r13.invoke(r10)
            java.lang.String r10 = (java.lang.String) r10
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r12.append(r10)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sb.u.B2(Ra.t0, boolean, java.lang.StringBuilder, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C1(InterfaceC1692e interfaceC1692e, StringBuilder sb2) throws IOException {
        InterfaceC1691d interfaceC1691dP;
        boolean z10 = interfaceC1692e.i() == EnumC1693f.f15146F;
        if (!d1()) {
            List<c0> listG0 = interfaceC1692e.G0();
            C3862t.f(listG0, "getContextReceivers(...)");
            J1(listG0, sb2);
            A1(this, sb2, interfaceC1692e, null, 2, null);
            if (!z10) {
                AbstractC1707u visibility = interfaceC1692e.getVisibility();
                C3862t.f(visibility, "getVisibility(...)");
                E2(visibility, sb2);
            }
            if ((interfaceC1692e.i() != EnumC1693f.f15144D || interfaceC1692e.m() != Ra.E.f15109F) && (!interfaceC1692e.i().j() || interfaceC1692e.m() != Ra.E.f15106C)) {
                Ra.E eM = interfaceC1692e.m();
                C3862t.f(eM, "getModality(...)");
                W1(eM, sb2, r1(interfaceC1692e));
            }
            U1(interfaceC1692e, sb2);
            Y1(sb2, I0().contains(v.f49622J) && interfaceC1692e.L(), "inner");
            Y1(sb2, I0().contains(v.f49624L) && interfaceC1692e.J0(), "data");
            Y1(sb2, I0().contains(v.f49625M) && interfaceC1692e.isInline(), "inline");
            Y1(sb2, I0().contains(v.f49631S) && interfaceC1692e.o(), "value");
            Y1(sb2, I0().contains(v.f49630R) && interfaceC1692e.C(), "fun");
            D1(interfaceC1692e, sb2);
        }
        if (C4597i.x(interfaceC1692e)) {
            F1(interfaceC1692e, sb2);
        } else {
            if (!d1()) {
                m2(sb2);
            }
            Z1(interfaceC1692e, sb2, true);
        }
        if (z10) {
            return;
        }
        List<m0> listW = interfaceC1692e.w();
        C3862t.f(listW, "getDeclaredTypeParameters(...)");
        y2(listW, sb2, false);
        B1(interfaceC1692e, sb2);
        if (!interfaceC1692e.i().j() && z0() && (interfaceC1691dP = interfaceC1692e.P()) != null) {
            sb2.append(" ");
            A1(this, sb2, interfaceC1691dP, null, 2, null);
            AbstractC1707u visibility2 = interfaceC1691dP.getVisibility();
            C3862t.f(visibility2, "getVisibility(...)");
            E2(visibility2, sb2);
            sb2.append(S1("constructor"));
            List<t0> listK = interfaceC1691dP.k();
            C3862t.f(listK, "getValueParameters(...)");
            C2(listK, interfaceC1691dP.F(), sb2);
        }
        n2(interfaceC1692e, sb2);
        F2(listW, sb2);
    }

    private final void C2(Collection<? extends t0> collection, boolean z10, StringBuilder sb2) {
        boolean zH2 = H2(z10);
        int size = collection.size();
        i1().b(size, sb2);
        int i10 = 0;
        for (t0 t0Var : collection) {
            i1().c(t0Var, i10, size, sb2);
            B2(t0Var, zH2, sb2, false);
            i1().a(t0Var, i10, size, sb2);
            i10++;
        }
        i1().d(size, sb2);
    }

    private final void D1(InterfaceC1692e interfaceC1692e, StringBuilder sb2) {
        sb2.append(S1(n.f49589a.a(interfaceC1692e)));
    }

    private final void D2(u0 u0Var, boolean z10, StringBuilder sb2, boolean z11, boolean z12) {
        U uA = u0Var.a();
        C3862t.f(uA, "getType(...)");
        t0 t0Var = u0Var instanceof t0 ? (t0) u0Var : null;
        U uI0 = t0Var != null ? t0Var.i0() : null;
        U u10 = uI0 == null ? uA : uI0;
        Y1(sb2, uI0 != null, "vararg");
        if (z12 || (z11 && !d1())) {
            z2(u0Var, sb2, z12);
        }
        if (z10) {
            Z1(u0Var, sb2, z11);
            sb2.append(": ");
        }
        sb2.append(U(u10));
        R1(u0Var, sb2);
        if (!j1() || uI0 == null) {
            return;
        }
        sb2.append(" /*");
        sb2.append(U(uA));
        sb2.append("*/");
    }

    private final u E0() {
        return (u) this.f49610n.getValue();
    }

    private final boolean E2(AbstractC1707u abstractC1707u, StringBuilder sb2) {
        if (!I0().contains(v.f49618F)) {
            return false;
        }
        if (J0()) {
            abstractC1707u = abstractC1707u.f();
        }
        if (!X0() && C3862t.b(abstractC1707u, C1706t.f15177l)) {
            return false;
        }
        sb2.append(S1(abstractC1707u.c()));
        sb2.append(" ");
        return true;
    }

    private final void F1(InterfaceC1700m interfaceC1700m, StringBuilder sb2) {
        if (S0()) {
            if (d1()) {
                sb2.append("companion object");
            }
            m2(sb2);
            InterfaceC1700m interfaceC1700mC = interfaceC1700m.c();
            if (interfaceC1700mC != null) {
                sb2.append("of ");
                qb.f name = interfaceC1700mC.getName();
                C3862t.f(name, "getName(...)");
                sb2.append(T(name, false));
            }
        }
        if (j1() || !C3862t.b(interfaceC1700m.getName(), qb.h.f48201d)) {
            if (!d1()) {
                m2(sb2);
            }
            qb.f name2 = interfaceC1700m.getName();
            C3862t.f(name2, "getName(...)");
            sb2.append(T(name2, true));
        }
    }

    private final void F2(List<? extends m0> list, StringBuilder sb2) throws IOException {
        if (o1()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        for (m0 m0Var : list) {
            List<U> upperBounds = m0Var.getUpperBounds();
            C3862t.f(upperBounds, "getUpperBounds(...)");
            for (U u10 : kotlin.collections.r.d0(upperBounds, 1)) {
                StringBuilder sb3 = new StringBuilder();
                qb.f name = m0Var.getName();
                C3862t.f(name, "getName(...)");
                sb3.append(T(name, false));
                sb3.append(" : ");
                C3862t.d(u10);
                sb3.append(U(u10));
                arrayList.add(sb3.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb2.append(" ");
        sb2.append(S1("where"));
        sb2.append(" ");
        kotlin.collections.B.p0(arrayList, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
    }

    private final String G1(AbstractC4943g<?> abstractC4943g) {
        Ba.l<AbstractC4943g<?>, String> lVarP = this.f49609m.P();
        if (lVarP != null) {
            return lVarP.invoke(abstractC4943g);
        }
        if (abstractC4943g instanceof C4938b) {
            List<? extends AbstractC4943g<?>> listB = ((C4938b) abstractC4943g).b();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                String strG1 = G1((AbstractC4943g) it.next());
                if (strG1 != null) {
                    arrayList.add(strG1);
                }
            }
            return kotlin.collections.r.s0(arrayList, ", ", "{", "}", 0, null, null, 56, null);
        }
        if (abstractC4943g instanceof C4937a) {
            return Ub.n.p0(n.Q(this, ((C4937a) abstractC4943g).b(), null, 2, null), "@");
        }
        if (!(abstractC4943g instanceof vb.t)) {
            return abstractC4943g.toString();
        }
        t.b bVarB = ((vb.t) abstractC4943g).b();
        if (bVarB instanceof t.b.a) {
            return ((t.b.a) bVarB).a() + "::class";
        }
        if (!(bVarB instanceof t.b.C0741b)) {
            throw new NoWhenBranchMatchedException();
        }
        t.b.C0741b c0741b = (t.b.C0741b) bVarB;
        String strB = c0741b.b().a().b();
        C3862t.f(strB, "asString(...)");
        for (int i10 = 0; i10 < c0741b.a(); i10++) {
            strB = "kotlin.Array<" + strB + '>';
        }
        return strB + "::class";
    }

    private final boolean G2(U u10) {
        if (Oa.i.p(u10)) {
            List<E0> listM0 = u10.M0();
            if (!(listM0 instanceof Collection) || !listM0.isEmpty()) {
                Iterator<T> it = listM0.iterator();
                while (it.hasNext()) {
                    if (((E0) it.next()).c()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H1(Ra.InterfaceC1699l r18, java.lang.StringBuilder r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sb.u.H1(Ra.l, java.lang.StringBuilder):void");
    }

    private final boolean H2(boolean z10) {
        int i10 = b.f49614b[M0().ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (!z10) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence I1(t0 t0Var) {
        return "";
    }

    private final void J1(List<? extends c0> list, StringBuilder sb2) {
        if (list.isEmpty()) {
            return;
        }
        sb2.append("context(");
        int i10 = 0;
        for (c0 c0Var : list) {
            int i11 = i10 + 1;
            z1(sb2, c0Var, Sa.e.f15617H);
            U uA = c0Var.a();
            C3862t.f(uA, "getType(...)");
            sb2.append(N1(uA));
            if (i10 == kotlin.collections.r.o(list)) {
                sb2.append(") ");
            } else {
                sb2.append(", ");
            }
            i10 = i11;
        }
    }

    private final void K1(StringBuilder sb2, U u10) {
        A1(this, sb2, u10, null, 2, null);
        C1113z c1113z = u10 instanceof C1113z ? (C1113z) u10 : null;
        AbstractC1082f0 abstractC1082f0A1 = c1113z != null ? c1113z.a1() : null;
        if (Hb.Y.a(u10)) {
            if (Mb.d.z(u10) && O0()) {
                sb2.append(L1(Jb.l.f7791a.p(u10)));
            } else {
                if (!(u10 instanceof Jb.i) || H0()) {
                    sb2.append(u10.O0().toString());
                } else {
                    sb2.append(((Jb.i) u10).X0());
                }
                sb2.append(r2(u10.M0()));
            }
        } else if (u10 instanceof C1100o0) {
            sb2.append(((C1100o0) u10).X0().toString());
        } else if (abstractC1082f0A1 instanceof C1100o0) {
            sb2.append(((C1100o0) abstractC1082f0A1).X0().toString());
        } else {
            v2(this, sb2, u10, null, 2, null);
            C4153F c4153f = C4153F.f46609a;
        }
        if (u10.P0()) {
            sb2.append("?");
        }
        if (C1090j0.c(u10)) {
            sb2.append(" & Any");
        }
    }

    private final String L1(String str) {
        int i10 = b.f49613a[e1().ordinal()];
        if (i10 == 1) {
            return str;
        }
        if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return "<font color=red><b>" + str + "</b></font>";
    }

    private final void M1(StringBuilder sb2, C1071a c1071a) {
        F fE1 = e1();
        F f10 = F.f49565C;
        if (fE1 == f10) {
            sb2.append("<font color=\"808080\"><i>");
        }
        sb2.append(" /* ");
        sb2.append("= ");
        b2(sb2, c1071a.U());
        sb2.append(" */");
        if (e1() == f10) {
            sb2.append("</i></font>");
        }
    }

    private final String N1(U u10) {
        String strU = U(u10);
        if ((!G2(u10) || M0.l(u10)) && !(u10 instanceof C1113z)) {
            return strU;
        }
        return '(' + strU + ')';
    }

    private final String O1(List<qb.f> list) {
        return s0(G.c(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P1(InterfaceC1712z interfaceC1712z, StringBuilder sb2) throws IOException {
        if (!d1()) {
            if (!c1()) {
                List<c0> listO0 = interfaceC1712z.o0();
                C3862t.f(listO0, "getContextReceiverParameters(...)");
                J1(listO0, sb2);
                A1(this, sb2, interfaceC1712z, null, 2, null);
                AbstractC1707u visibility = interfaceC1712z.getVisibility();
                C3862t.f(visibility, "getVisibility(...)");
                E2(visibility, sb2);
                X1(interfaceC1712z, sb2);
                if (F0()) {
                    U1(interfaceC1712z, sb2);
                }
                c2(interfaceC1712z, sb2);
                if (F0()) {
                    x1(interfaceC1712z, sb2);
                } else {
                    p2(interfaceC1712z, sb2);
                }
                T1(interfaceC1712z, sb2);
                if (j1()) {
                    if (interfaceC1712z.u0()) {
                        sb2.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (interfaceC1712z.B0()) {
                        sb2.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb2.append(S1("fun"));
            sb2.append(" ");
            List<m0> typeParameters = interfaceC1712z.getTypeParameters();
            C3862t.f(typeParameters, "getTypeParameters(...)");
            y2(typeParameters, sb2, true);
            j2(interfaceC1712z, sb2);
        }
        Z1(interfaceC1712z, sb2, true);
        List<t0> listK = interfaceC1712z.k();
        C3862t.f(listK, "getValueParameters(...)");
        C2(listK, interfaceC1712z.F(), sb2);
        k2(interfaceC1712z, sb2);
        U returnType = interfaceC1712z.getReturnType();
        if (!m1() && (h1() || returnType == null || !Oa.j.C0(returnType))) {
            sb2.append(": ");
            sb2.append(returnType == null ? "[NULL]" : U(returnType));
        }
        List<m0> typeParameters2 = interfaceC1712z.getTypeParameters();
        C3862t.f(typeParameters2, "getTypeParameters(...)");
        F2(typeParameters2, sb2);
    }

    private final void Q1(StringBuilder sb2, U u10) {
        qb.f fVarD;
        int length = sb2.length();
        A1(E0(), sb2, u10, null, 2, null);
        boolean z10 = sb2.length() != length;
        U uK = Oa.i.k(u10);
        List<U> listE = Oa.i.e(u10);
        boolean zR = Oa.i.r(u10);
        boolean zP0 = u10.P0();
        boolean z11 = zP0 || (z10 && uK != null);
        if (z11) {
            if (zR) {
                sb2.insert(length, '(');
            } else {
                if (z10) {
                    C1786a.c(Ub.n.W0(sb2));
                    if (sb2.charAt(Ub.n.S(sb2) - 1) != ')') {
                        sb2.insert(Ub.n.S(sb2), "()");
                    }
                }
                sb2.append("(");
            }
        }
        if (!listE.isEmpty()) {
            sb2.append("context(");
            Iterator<U> it = listE.subList(0, kotlin.collections.r.o(listE)).iterator();
            while (it.hasNext()) {
                a2(sb2, it.next());
                sb2.append(", ");
            }
            a2(sb2, (U) kotlin.collections.r.u0(listE));
            sb2.append(") ");
        }
        Y1(sb2, zR, "suspend");
        if (uK != null) {
            boolean z12 = (G2(uK) && !uK.P0()) || q1(uK) || (uK instanceof C1113z);
            if (z12) {
                sb2.append("(");
            }
            a2(sb2, uK);
            if (z12) {
                sb2.append(")");
            }
            sb2.append(".");
        }
        sb2.append("(");
        if (!Oa.i.n(u10) || u10.M0().size() > 1) {
            int i10 = 0;
            for (E0 e02 : Oa.i.m(u10)) {
                int i11 = i10 + 1;
                if (i10 > 0) {
                    sb2.append(", ");
                }
                if (N0()) {
                    U uA = e02.a();
                    C3862t.f(uA, "getType(...)");
                    fVarD = Oa.i.d(uA);
                } else {
                    fVarD = null;
                }
                if (fVarD != null) {
                    sb2.append(T(fVarD, false));
                    sb2.append(": ");
                }
                sb2.append(V(e02));
                i10 = i11;
            }
        } else {
            sb2.append("???");
        }
        sb2.append(") ");
        sb2.append(r0());
        sb2.append(" ");
        a2(sb2, Oa.i.l(u10));
        if (z11) {
            sb2.append(")");
        }
        if (zP0) {
            sb2.append("?");
        }
    }

    private final void R1(u0 u0Var, StringBuilder sb2) {
        AbstractC4943g<?> abstractC4943gV;
        String strG1;
        if (!G0() || (abstractC4943gV = u0Var.V()) == null || (strG1 = G1(abstractC4943gV)) == null) {
            return;
        }
        sb2.append(" = ");
        sb2.append(s0(strG1));
    }

    private final String S1(String str) {
        int i10 = b.f49613a[e1().ordinal()];
        if (i10 == 1) {
            return str;
        }
        if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (y0()) {
            return str;
        }
        return "<b>" + str + "</b>";
    }

    private final void T1(InterfaceC1689b interfaceC1689b, StringBuilder sb2) {
        if (I0().contains(v.f49623K) && j1() && interfaceC1689b.i() != InterfaceC1689b.a.DECLARATION) {
            sb2.append("/*");
            sb2.append(Pb.a.f(interfaceC1689b.i().name()));
            sb2.append("*/ ");
        }
    }

    private final void U1(Ra.D d10, StringBuilder sb2) {
        Y1(sb2, d10.isExternal(), "external");
        boolean z10 = false;
        Y1(sb2, I0().contains(v.f49626N) && d10.K(), "expect");
        if (I0().contains(v.f49627O) && d10.D0()) {
            z10 = true;
        }
        Y1(sb2, z10, "actual");
    }

    private final void W1(Ra.E e10, StringBuilder sb2, Ra.E e11) {
        if (W0() || e10 != e11) {
            Y1(sb2, I0().contains(v.f49619G), Pb.a.f(e10.name()));
        }
    }

    private final void X1(InterfaceC1689b interfaceC1689b, StringBuilder sb2) {
        if (C4597i.J(interfaceC1689b) && interfaceC1689b.m() == Ra.E.f15106C) {
            return;
        }
        if (L0() == C.f49549B && interfaceC1689b.m() == Ra.E.f15108E && u1(interfaceC1689b)) {
            return;
        }
        Ra.E eM = interfaceC1689b.m();
        C3862t.f(eM, "getModality(...)");
        W1(eM, sb2, r1(interfaceC1689b));
    }

    private final void Y1(StringBuilder sb2, boolean z10, String str) {
        if (z10) {
            sb2.append(S1(str));
            sb2.append(" ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z1(InterfaceC1700m interfaceC1700m, StringBuilder sb2, boolean z10) {
        qb.f name = interfaceC1700m.getName();
        C3862t.f(name, "getName(...)");
        sb2.append(T(name, z10));
    }

    private final void a2(StringBuilder sb2, U u10) {
        P0 p0R0 = u10.R0();
        C1071a c1071a = p0R0 instanceof C1071a ? (C1071a) p0R0 : null;
        if (c1071a == null) {
            b2(sb2, u10);
            return;
        }
        if (Z0()) {
            b2(sb2, c1071a.U());
            if (R0()) {
                v1(sb2, c1071a);
                return;
            }
            return;
        }
        b2(sb2, c1071a.a1());
        if (a1()) {
            M1(sb2, c1071a);
        }
    }

    private final void b2(StringBuilder sb2, U u10) {
        if ((u10 instanceof R0) && p() && !((R0) u10).T0()) {
            sb2.append("<Not computed yet>");
            return;
        }
        P0 p0R0 = u10.R0();
        if (p0R0 instanceof K) {
            sb2.append(((K) p0R0).Y0(this, this));
        } else {
            if (!(p0R0 instanceof AbstractC1082f0)) {
                throw new NoWhenBranchMatchedException();
            }
            l2(sb2, (AbstractC1082f0) p0R0);
        }
    }

    private final void c2(InterfaceC1689b interfaceC1689b, StringBuilder sb2) {
        if (I0().contains(v.f49620H) && u1(interfaceC1689b) && L0() != C.f49550C) {
            Y1(sb2, true, "override");
            if (j1()) {
                sb2.append("/*");
                sb2.append(interfaceC1689b.g().size());
                sb2.append("*/ ");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d2(N n10, StringBuilder sb2) {
        e2(n10.f(), "package-fragment", sb2);
        if (p()) {
            sb2.append(" in ");
            Z1(n10.c(), sb2, false);
        }
    }

    private final void e2(qb.c cVar, String str, StringBuilder sb2) {
        sb2.append(S1(str));
        qb.d dVarJ = cVar.j();
        C3862t.f(dVarJ, "toUnsafe(...)");
        String strS = S(dVarJ);
        if (strS.length() > 0) {
            sb2.append(" ");
            sb2.append(strS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f2(V v10, StringBuilder sb2) {
        e2(v10.f(), "package", sb2);
        if (p()) {
            sb2.append(" in context of ");
            Z1(v10.s0(), sb2, false);
        }
    }

    private final void g2(StringBuilder sb2, X x10) {
        X xC = x10.c();
        if (xC != null) {
            g2(sb2, xC);
            sb2.append('.');
            qb.f name = x10.b().getName();
            C3862t.f(name, "getName(...)");
            sb2.append(T(name, false));
        } else {
            y0 y0VarL = x10.b().l();
            C3862t.f(y0VarL, "getTypeConstructor(...)");
            sb2.append(s2(y0VarL));
        }
        sb2.append(r2(x10.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h2(Z z10, StringBuilder sb2) throws IOException {
        if (!d1()) {
            if (!c1()) {
                List<c0> listO0 = z10.o0();
                C3862t.f(listO0, "getContextReceiverParameters(...)");
                J1(listO0, sb2);
                i2(z10, sb2);
                AbstractC1707u visibility = z10.getVisibility();
                C3862t.f(visibility, "getVisibility(...)");
                E2(visibility, sb2);
                boolean z11 = false;
                Y1(sb2, I0().contains(v.f49628P) && z10.z(), "const");
                U1(z10, sb2);
                X1(z10, sb2);
                c2(z10, sb2);
                if (I0().contains(v.f49629Q) && z10.p0()) {
                    z11 = true;
                }
                Y1(sb2, z11, "lateinit");
                T1(z10, sb2);
            }
            A2(this, z10, sb2, false, 4, null);
            List<m0> typeParameters = z10.getTypeParameters();
            C3862t.f(typeParameters, "getTypeParameters(...)");
            y2(typeParameters, sb2, true);
            j2(z10, sb2);
        }
        Z1(z10, sb2, true);
        sb2.append(": ");
        U uA = z10.a();
        C3862t.f(uA, "getType(...)");
        sb2.append(U(uA));
        k2(z10, sb2);
        R1(z10, sb2);
        List<m0> typeParameters2 = z10.getTypeParameters();
        C3862t.f(typeParameters2, "getTypeParameters(...)");
        F2(typeParameters2, sb2);
    }

    private final void i2(Z z10, StringBuilder sb2) {
        if (I0().contains(v.f49621I)) {
            A1(this, sb2, z10, null, 2, null);
            InterfaceC1709w interfaceC1709wN0 = z10.n0();
            if (interfaceC1709wN0 != null) {
                z1(sb2, interfaceC1709wN0, Sa.e.f15612C);
            }
            InterfaceC1709w interfaceC1709wK0 = z10.k0();
            if (interfaceC1709wK0 != null) {
                z1(sb2, interfaceC1709wK0, Sa.e.f15620K);
            }
            if (P0() == E.f49561D) {
                a0 a0VarE = z10.e();
                if (a0VarE != null) {
                    z1(sb2, a0VarE, Sa.e.f15615F);
                }
                b0 b0VarH = z10.h();
                if (b0VarH != null) {
                    z1(sb2, b0VarH, Sa.e.f15616G);
                    List<t0> listK = b0VarH.k();
                    C3862t.f(listK, "getValueParameters(...)");
                    t0 t0Var = (t0) kotlin.collections.r.J0(listK);
                    C3862t.d(t0Var);
                    z1(sb2, t0Var, Sa.e.f15619J);
                }
            }
        }
    }

    private final void j2(InterfaceC1688a interfaceC1688a, StringBuilder sb2) {
        c0 c0VarJ0 = interfaceC1688a.j0();
        if (c0VarJ0 != null) {
            z1(sb2, c0VarJ0, Sa.e.f15617H);
            U uA = c0VarJ0.a();
            C3862t.f(uA, "getType(...)");
            sb2.append(N1(uA));
            sb2.append(".");
        }
    }

    private final void k2(InterfaceC1688a interfaceC1688a, StringBuilder sb2) {
        c0 c0VarJ0;
        if (Q0() && (c0VarJ0 = interfaceC1688a.j0()) != null) {
            sb2.append(" on ");
            U uA = c0VarJ0.a();
            C3862t.f(uA, "getType(...)");
            sb2.append(U(uA));
        }
    }

    private final void l2(StringBuilder sb2, AbstractC1082f0 abstractC1082f0) {
        if (C3862t.b(abstractC1082f0, M0.f5684b) || M0.k(abstractC1082f0)) {
            sb2.append("???");
            return;
        }
        if (Jb.l.o(abstractC1082f0)) {
            if (!g1()) {
                sb2.append("???");
                return;
            }
            y0 y0VarO0 = abstractC1082f0.O0();
            C3862t.e(y0VarO0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
            sb2.append(L1(((Jb.j) y0VarO0).d(0)));
            return;
        }
        if (Hb.Y.a(abstractC1082f0)) {
            K1(sb2, abstractC1082f0);
        } else if (G2(abstractC1082f0)) {
            Q1(sb2, abstractC1082f0);
        } else {
            K1(sb2, abstractC1082f0);
        }
    }

    private final void m2(StringBuilder sb2) {
        int length = sb2.length();
        if (length == 0 || sb2.charAt(length - 1) != ' ') {
            sb2.append(' ');
        }
    }

    private final void n2(InterfaceC1692e interfaceC1692e, StringBuilder sb2) throws IOException {
        if (n1() || Oa.j.n0(interfaceC1692e.u())) {
            return;
        }
        Collection<U> collectionS = interfaceC1692e.l().s();
        C3862t.f(collectionS, "getSupertypes(...)");
        if (collectionS.isEmpty()) {
            return;
        }
        if (collectionS.size() == 1 && Oa.j.b0(collectionS.iterator().next())) {
            return;
        }
        m2(sb2);
        sb2.append(": ");
        kotlin.collections.B.p0(collectionS, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new s(this));
    }

    private final void o0(StringBuilder sb2, InterfaceC1700m interfaceC1700m) {
        InterfaceC1700m interfaceC1700mC;
        String name;
        if ((interfaceC1700m instanceof N) || (interfaceC1700m instanceof V) || (interfaceC1700mC = interfaceC1700m.c()) == null || (interfaceC1700mC instanceof H)) {
            return;
        }
        sb2.append(" ");
        sb2.append(V1("defined in"));
        sb2.append(" ");
        qb.d dVarM = C4597i.m(interfaceC1700mC);
        C3862t.f(dVarM, "getFqName(...)");
        sb2.append(dVarM.e() ? "root package" : S(dVarM));
        if (l1() && (interfaceC1700mC instanceof N) && (interfaceC1700m instanceof InterfaceC1703p) && (name = ((InterfaceC1703p) interfaceC1700m).j().a().getName()) != null) {
            sb2.append(" ");
            sb2.append(V1("in file"));
            sb2.append(" ");
            sb2.append(name);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence o2(u uVar, U u10) {
        C3862t.d(u10);
        return uVar.U(u10);
    }

    private final void p0(StringBuilder sb2, List<? extends E0> list) throws IOException {
        kotlin.collections.B.p0(list, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new q(this));
    }

    private final String p1() {
        return s0(">");
    }

    private final void p2(InterfaceC1712z interfaceC1712z, StringBuilder sb2) {
        Y1(sb2, interfaceC1712z.isSuspend(), "suspend");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence q0(u uVar, E0 it) {
        C3862t.g(it, "it");
        if (it.c()) {
            return "*";
        }
        U uA = it.a();
        C3862t.f(uA, "getType(...)");
        String strU = uVar.U(uA);
        if (it.b() == Q0.f5693F) {
            return strU;
        }
        return it.b() + ' ' + strU;
    }

    private final boolean q1(U u10) {
        return Oa.i.r(u10) || !u10.getAnnotations().isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q2(l0 l0Var, StringBuilder sb2) {
        A1(this, sb2, l0Var, null, 2, null);
        AbstractC1707u visibility = l0Var.getVisibility();
        C3862t.f(visibility, "getVisibility(...)");
        E2(visibility, sb2);
        U1(l0Var, sb2);
        sb2.append(S1("typealias"));
        sb2.append(" ");
        Z1(l0Var, sb2, true);
        List<m0> listW = l0Var.w();
        C3862t.f(listW, "getDeclaredTypeParameters(...)");
        y2(listW, sb2, false);
        B1(l0Var, sb2);
        sb2.append(" = ");
        sb2.append(U(l0Var.e0()));
    }

    private final String r0() {
        int i10 = b.f49613a[e1().ordinal()];
        if (i10 == 1) {
            return s0("->");
        }
        if (i10 == 2) {
            return "&rarr;";
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Ra.E r1(Ra.D d10) {
        if (d10 instanceof InterfaceC1692e) {
            return ((InterfaceC1692e) d10).i() == EnumC1693f.f15144D ? Ra.E.f15109F : Ra.E.f15106C;
        }
        InterfaceC1700m interfaceC1700mC = d10.c();
        InterfaceC1692e interfaceC1692e = interfaceC1700mC instanceof InterfaceC1692e ? (InterfaceC1692e) interfaceC1700mC : null;
        if (interfaceC1692e == null) {
            return Ra.E.f15106C;
        }
        if (!(d10 instanceof InterfaceC1689b)) {
            return Ra.E.f15106C;
        }
        InterfaceC1689b interfaceC1689b = (InterfaceC1689b) d10;
        Collection<? extends InterfaceC1689b> collectionG = interfaceC1689b.g();
        C3862t.f(collectionG, "getOverriddenDescriptors(...)");
        if (!collectionG.isEmpty() && interfaceC1692e.m() != Ra.E.f15106C) {
            return Ra.E.f15108E;
        }
        if (interfaceC1692e.i() != EnumC1693f.f15144D || C3862t.b(interfaceC1689b.getVisibility(), C1706t.f15166a)) {
            return Ra.E.f15106C;
        }
        Ra.E eM = interfaceC1689b.m();
        Ra.E e10 = Ra.E.f15109F;
        return eM == e10 ? e10 : Ra.E.f15108E;
    }

    private final String s0(String str) {
        return e1().j(str);
    }

    private final boolean s1(Sa.c cVar) {
        return C3862t.b(cVar.f(), p.a.f13408E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u t0(u uVar) {
        n nVarW = uVar.W(t.f49608B);
        C3862t.e(nVarW, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
        return (u) nVarW;
    }

    private final String t1() {
        return s0("<");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object t2(U it) {
        C3862t.g(it, "it");
        return it instanceof C1100o0 ? ((C1100o0) it).X0() : it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F u0(w withOptions) {
        C3862t.g(withOptions, "$this$withOptions");
        withOptions.b(kotlin.collections.V.j(withOptions.o(), kotlin.collections.r.p(p.a.f13404C, p.a.f13406D)));
        return C4153F.f46609a;
    }

    private final boolean u1(InterfaceC1689b interfaceC1689b) {
        return !interfaceC1689b.g().isEmpty();
    }

    private final void u2(StringBuilder sb2, U u10, y0 y0Var) {
        X xD = q0.d(u10);
        if (xD != null) {
            g2(sb2, xD);
        } else {
            sb2.append(s2(y0Var));
            sb2.append(r2(u10.M0()));
        }
    }

    private final void v1(StringBuilder sb2, C1071a c1071a) {
        F fE1 = e1();
        F f10 = F.f49565C;
        if (fE1 == f10) {
            sb2.append("<font color=\"808080\"><i>");
        }
        sb2.append(" /* ");
        sb2.append("from: ");
        b2(sb2, c1071a.a1());
        sb2.append(" */");
        if (e1() == f10) {
            sb2.append("</i></font>");
        }
    }

    static /* synthetic */ void v2(u uVar, StringBuilder sb2, U u10, y0 y0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            y0Var = u10.O0();
        }
        uVar.u2(sb2, u10, y0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w1(Y y10, StringBuilder sb2) {
        U1(y10, sb2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w2(m0 m0Var, StringBuilder sb2, boolean z10) {
        if (z10) {
            sb2.append(t1());
        }
        if (j1()) {
            sb2.append("/*");
            sb2.append(m0Var.getIndex());
            sb2.append("*/ ");
        }
        Y1(sb2, m0Var.E(), "reified");
        String strN = m0Var.p().n();
        boolean z11 = true;
        Y1(sb2, strN.length() > 0, strN);
        A1(this, sb2, m0Var, null, 2, null);
        Z1(m0Var, sb2, z10);
        int size = m0Var.getUpperBounds().size();
        if ((size > 1 && !z10) || size == 1) {
            U next = m0Var.getUpperBounds().iterator().next();
            if (!Oa.j.j0(next)) {
                sb2.append(" : ");
                C3862t.d(next);
                sb2.append(U(next));
            }
        } else if (z10) {
            for (U u10 : m0Var.getUpperBounds()) {
                if (!Oa.j.j0(u10)) {
                    if (z11) {
                        sb2.append(" : ");
                    } else {
                        sb2.append(" & ");
                    }
                    C3862t.d(u10);
                    sb2.append(U(u10));
                    z11 = false;
                }
            }
        }
        if (z10) {
            sb2.append(p1());
        }
    }

    private final void x1(InterfaceC1712z interfaceC1712z, StringBuilder sb2) {
        boolean z10;
        boolean z11 = false;
        if (interfaceC1712z.isOperator()) {
            Collection<? extends InterfaceC1712z> collectionG = interfaceC1712z.g();
            C3862t.f(collectionG, "getOverriddenDescriptors(...)");
            Collection<? extends InterfaceC1712z> collection = collectionG;
            if (!collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((InterfaceC1712z) it.next()).isOperator()) {
                        if (w0()) {
                            break;
                        }
                    }
                }
                z10 = false;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (interfaceC1712z.isInfix()) {
            Collection<? extends InterfaceC1712z> collectionG2 = interfaceC1712z.g();
            C3862t.f(collectionG2, "getOverriddenDescriptors(...)");
            Collection<? extends InterfaceC1712z> collection2 = collectionG2;
            if (collection2.isEmpty()) {
                z11 = true;
            } else {
                Iterator<T> it2 = collection2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (((InterfaceC1712z) it2.next()).isInfix()) {
                        if (w0()) {
                            break;
                        }
                    }
                }
            }
        }
        Y1(sb2, interfaceC1712z.O(), "tailrec");
        p2(interfaceC1712z, sb2);
        Y1(sb2, interfaceC1712z.isInline(), "inline");
        Y1(sb2, z11, "infix");
        Y1(sb2, z10, "operator");
    }

    private final void x2(StringBuilder sb2, List<? extends m0> list) {
        Iterator<? extends m0> it = list.iterator();
        while (it.hasNext()) {
            w2(it.next(), sb2, false);
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
    }

    private final List<String> y1(Sa.c cVar) {
        InterfaceC1691d interfaceC1691dP;
        List<t0> listK;
        Map<qb.f, AbstractC4943g<?>> mapB = cVar.b();
        List listM = null;
        InterfaceC1692e interfaceC1692eL = V0() ? C5087e.l(cVar) : null;
        if (interfaceC1692eL != null && (interfaceC1691dP = interfaceC1692eL.P()) != null && (listK = interfaceC1691dP.k()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listK) {
                if (((t0) obj).r0()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(kotlin.collections.r.x(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((t0) it.next()).getName());
            }
            listM = arrayList2;
        }
        if (listM == null) {
            listM = kotlin.collections.r.m();
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listM) {
            if (!mapB.containsKey((qb.f) obj2)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(kotlin.collections.r.x(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((qb.f) it2.next()).j() + " = ...");
        }
        Set<Map.Entry<qb.f, AbstractC4943g<?>>> setEntrySet = mapB.entrySet();
        ArrayList arrayList5 = new ArrayList(kotlin.collections.r.x(setEntrySet, 10));
        Iterator<T> it3 = setEntrySet.iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            qb.f fVar = (qb.f) entry.getKey();
            AbstractC4943g<?> abstractC4943g = (AbstractC4943g) entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(fVar.j());
            sb2.append(" = ");
            sb2.append(!listM.contains(fVar) ? G1(abstractC4943g) : "...");
            arrayList5.add(sb2.toString());
        }
        return kotlin.collections.r.N0(kotlin.collections.r.F0(arrayList4, arrayList5));
    }

    private final void y2(List<? extends m0> list, StringBuilder sb2, boolean z10) {
        if (o1() || list.isEmpty()) {
            return;
        }
        sb2.append(t1());
        x2(sb2, list);
        sb2.append(p1());
        if (z10) {
            sb2.append(" ");
        }
    }

    private final void z1(StringBuilder sb2, Sa.a aVar, Sa.e eVar) {
        if (I0().contains(v.f49621I)) {
            Set<qb.c> setO = aVar instanceof U ? o() : D0();
            Ba.l<Sa.c, Boolean> lVarX0 = x0();
            for (Sa.c cVar : aVar.getAnnotations()) {
                if (!kotlin.collections.r.a0(setO, cVar.f()) && !s1(cVar) && (lVarX0 == null || lVarX0.invoke(cVar).booleanValue())) {
                    sb2.append(P(cVar, eVar));
                    if (C0()) {
                        sb2.append('\n');
                        C3862t.f(sb2, "append(...)");
                    } else {
                        sb2.append(" ");
                    }
                }
            }
        }
    }

    private final void z2(u0 u0Var, StringBuilder sb2, boolean z10) {
        if (z10 || !(u0Var instanceof t0)) {
            sb2.append(S1(u0Var.h0() ? "var" : "val"));
            sb2.append(" ");
        }
    }

    public InterfaceC4523b A0() {
        return this.f49609m.B();
    }

    public Ba.l<t0, String> B0() {
        return this.f49609m.C();
    }

    public boolean C0() {
        return this.f49609m.D();
    }

    public Set<qb.c> D0() {
        return this.f49609m.E();
    }

    public String E1(InterfaceC1695h klass) {
        C3862t.g(klass, "klass");
        return Jb.l.m(klass) ? klass.l().toString() : A0().a(klass, this);
    }

    public boolean F0() {
        return this.f49609m.F();
    }

    public boolean G0() {
        return this.f49609m.G();
    }

    public boolean H0() {
        return this.f49609m.H();
    }

    public Set<v> I0() {
        return this.f49609m.I();
    }

    public boolean J0() {
        return this.f49609m.J();
    }

    public final z K0() {
        return this.f49609m;
    }

    public C L0() {
        return this.f49609m.K();
    }

    public D M0() {
        return this.f49609m.L();
    }

    public boolean N0() {
        return this.f49609m.M();
    }

    @Override // sb.n
    public String O(InterfaceC1700m declarationDescriptor) {
        C3862t.g(declarationDescriptor, "declarationDescriptor");
        StringBuilder sb2 = new StringBuilder();
        declarationDescriptor.v0(new a(), sb2);
        if (k1()) {
            o0(sb2, declarationDescriptor);
        }
        String string = sb2.toString();
        C3862t.f(string, "toString(...)");
        return string;
    }

    public boolean O0() {
        return this.f49609m.N();
    }

    @Override // sb.n
    public String P(Sa.c annotation, Sa.e eVar) throws IOException {
        C3862t.g(annotation, "annotation");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        if (eVar != null) {
            sb2.append(eVar.j() + ':');
        }
        U uA = annotation.a();
        sb2.append(U(uA));
        if (n()) {
            List<String> listY1 = y1(annotation);
            if (c() || !listY1.isEmpty()) {
                kotlin.collections.B.p0(listY1, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
            }
        }
        if (j1() && (Hb.Y.a(uA) || (uA.O0().t() instanceof M.b))) {
            sb2.append(" /* annotation class not found */");
        }
        String string = sb2.toString();
        C3862t.f(string, "toString(...)");
        return string;
    }

    public E P0() {
        return this.f49609m.O();
    }

    public boolean Q0() {
        return this.f49609m.Q();
    }

    @Override // sb.n
    public String R(String lowerRendered, String upperRendered, Oa.j builtIns) {
        C3862t.g(lowerRendered, "lowerRendered");
        C3862t.g(upperRendered, "upperRendered");
        C3862t.g(builtIns, "builtIns");
        if (G.f(lowerRendered, upperRendered)) {
            if (!Ub.n.G(upperRendered, "(", false, 2, null)) {
                return lowerRendered + '!';
            }
            return '(' + lowerRendered + ")!";
        }
        InterfaceC4523b interfaceC4523bA0 = A0();
        InterfaceC1692e interfaceC1692eW = builtIns.w();
        C3862t.f(interfaceC1692eW, "getCollection(...)");
        String strQ0 = Ub.n.Q0(interfaceC4523bA0.a(interfaceC1692eW, this), "Collection", null, 2, null);
        String strD = G.d(lowerRendered, strQ0 + "Mutable", upperRendered, strQ0, strQ0 + "(Mutable)");
        if (strD != null) {
            return strD;
        }
        String strD2 = G.d(lowerRendered, strQ0 + "MutableMap.MutableEntry", upperRendered, strQ0 + "Map.Entry", strQ0 + "(Mutable)Map.(Mutable)Entry");
        if (strD2 != null) {
            return strD2;
        }
        InterfaceC4523b interfaceC4523bA02 = A0();
        InterfaceC1692e interfaceC1692eJ = builtIns.j();
        C3862t.f(interfaceC1692eJ, "getArray(...)");
        String strQ02 = Ub.n.Q0(interfaceC4523bA02.a(interfaceC1692eJ, this), "Array", null, 2, null);
        String strD3 = G.d(lowerRendered, strQ02 + s0("Array<"), upperRendered, strQ02 + s0("Array<out "), strQ02 + s0("Array<(out) "));
        if (strD3 != null) {
            return strD3;
        }
        return '(' + lowerRendered + ".." + upperRendered + ')';
    }

    public boolean R0() {
        return this.f49609m.R();
    }

    @Override // sb.n
    public String S(qb.d fqName) {
        C3862t.g(fqName, "fqName");
        List<qb.f> listH = fqName.h();
        C3862t.f(listH, "pathSegments(...)");
        return O1(listH);
    }

    public boolean S0() {
        return this.f49609m.S();
    }

    @Override // sb.n
    public String T(qb.f name, boolean z10) {
        C3862t.g(name, "name");
        String strS0 = s0(G.b(name));
        if (!y0() || e1() != F.f49565C || !z10) {
            return strS0;
        }
        return "<b>" + strS0 + "</b>";
    }

    public boolean T0() {
        return this.f49609m.T();
    }

    @Override // sb.n
    public String U(U type) {
        C3862t.g(type, "type");
        StringBuilder sb2 = new StringBuilder();
        a2(sb2, f1().invoke(type));
        String string = sb2.toString();
        C3862t.f(string, "toString(...)");
        return string;
    }

    public boolean U0() {
        return this.f49609m.U();
    }

    @Override // sb.n
    public String V(E0 typeProjection) throws IOException {
        C3862t.g(typeProjection, "typeProjection");
        StringBuilder sb2 = new StringBuilder();
        p0(sb2, kotlin.collections.r.e(typeProjection));
        String string = sb2.toString();
        C3862t.f(string, "toString(...)");
        return string;
    }

    public boolean V0() {
        return this.f49609m.V();
    }

    public String V1(String message) {
        C3862t.g(message, "message");
        int i10 = b.f49613a[e1().ordinal()];
        if (i10 == 1) {
            return message;
        }
        if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return "<i>" + message + "</i>";
    }

    public boolean W0() {
        return this.f49609m.W();
    }

    public boolean X0() {
        return this.f49609m.X();
    }

    public boolean Y0() {
        return this.f49609m.Y();
    }

    public boolean Z0() {
        return this.f49609m.Z();
    }

    @Override // sb.w
    public void a(F f10) {
        C3862t.g(f10, "<set-?>");
        this.f49609m.a(f10);
    }

    public boolean a1() {
        return this.f49609m.a0();
    }

    @Override // sb.w
    public void b(Set<qb.c> set) {
        C3862t.g(set, "<set-?>");
        this.f49609m.b(set);
    }

    public boolean b1() {
        return this.f49609m.b0();
    }

    @Override // sb.w
    public boolean c() {
        return this.f49609m.c();
    }

    public boolean c1() {
        return this.f49609m.c0();
    }

    @Override // sb.w
    public void d(boolean z10) {
        this.f49609m.d(z10);
    }

    public boolean d1() {
        return this.f49609m.d0();
    }

    @Override // sb.w
    public void e(Set<? extends v> set) {
        C3862t.g(set, "<set-?>");
        this.f49609m.e(set);
    }

    public F e1() {
        return this.f49609m.e0();
    }

    @Override // sb.w
    public void f(boolean z10) {
        this.f49609m.f(z10);
    }

    public Ba.l<U, U> f1() {
        return this.f49609m.f0();
    }

    @Override // sb.w
    public boolean g() {
        return this.f49609m.g();
    }

    public boolean g1() {
        return this.f49609m.g0();
    }

    @Override // sb.w
    public void h(D d10) {
        C3862t.g(d10, "<set-?>");
        this.f49609m.h(d10);
    }

    public boolean h1() {
        return this.f49609m.h0();
    }

    @Override // sb.w
    public void i(boolean z10) {
        this.f49609m.i(z10);
    }

    public n.b i1() {
        return this.f49609m.i0();
    }

    @Override // sb.w
    public void j(boolean z10) {
        this.f49609m.j(z10);
    }

    public boolean j1() {
        return this.f49609m.j0();
    }

    @Override // sb.w
    public void k(boolean z10) {
        this.f49609m.k(z10);
    }

    public boolean k1() {
        return this.f49609m.k0();
    }

    @Override // sb.w
    public void l(boolean z10) {
        this.f49609m.l(z10);
    }

    public boolean l1() {
        return this.f49609m.l0();
    }

    @Override // sb.w
    public void m(InterfaceC4523b interfaceC4523b) {
        C3862t.g(interfaceC4523b, "<set-?>");
        this.f49609m.m(interfaceC4523b);
    }

    public boolean m1() {
        return this.f49609m.m0();
    }

    @Override // sb.w
    public boolean n() {
        return this.f49609m.n();
    }

    public boolean n1() {
        return this.f49609m.n0();
    }

    @Override // sb.w
    public Set<qb.c> o() {
        return this.f49609m.o();
    }

    public boolean o1() {
        return this.f49609m.o0();
    }

    @Override // sb.w
    public boolean p() {
        return this.f49609m.p();
    }

    @Override // sb.w
    public EnumC4522a q() {
        return this.f49609m.q();
    }

    @Override // sb.w
    public void r(boolean z10) {
        this.f49609m.r(z10);
    }

    public String r2(List<? extends E0> typeArguments) throws IOException {
        C3862t.g(typeArguments, "typeArguments");
        if (typeArguments.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(t1());
        p0(sb2, typeArguments);
        sb2.append(p1());
        String string = sb2.toString();
        C3862t.f(string, "toString(...)");
        return string;
    }

    public String s2(y0 typeConstructor) {
        C3862t.g(typeConstructor, "typeConstructor");
        InterfaceC1695h interfaceC1695hT = typeConstructor.t();
        if ((interfaceC1695hT instanceof m0) || (interfaceC1695hT instanceof InterfaceC1692e) || (interfaceC1695hT instanceof l0)) {
            return E1(interfaceC1695hT);
        }
        if (interfaceC1695hT == null) {
            return typeConstructor instanceof T ? ((T) typeConstructor).j(p.f49604B) : typeConstructor.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + interfaceC1695hT.getClass()).toString());
    }

    public boolean v0() {
        return this.f49609m.w();
    }

    public boolean w0() {
        return this.f49609m.x();
    }

    public Ba.l<Sa.c, Boolean> x0() {
        return this.f49609m.y();
    }

    public boolean y0() {
        return this.f49609m.z();
    }

    public boolean z0() {
        return this.f49609m.A();
    }
}
