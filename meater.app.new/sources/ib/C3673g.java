package ib;

import Hb.AbstractC1082f0;
import Hb.C1090j0;
import Hb.E0;
import Hb.M0;
import Hb.P0;
import Hb.Q0;
import Hb.u0;
import Hb.v0;
import Hb.y0;
import Ra.InterfaceC1695h;
import Ra.m0;
import db.InterfaceC3090e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: typeEnhancement.kt */
/* renamed from: ib.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3673g {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3090e f43249a;

    /* compiled from: typeEnhancement.kt */
    /* renamed from: ib.g$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Hb.U f43250a;

        /* renamed from: b, reason: collision with root package name */
        private final int f43251b;

        public a(Hb.U u10, int i10) {
            this.f43250a = u10;
            this.f43251b = i10;
        }

        public final int a() {
            return this.f43251b;
        }

        public final Hb.U b() {
            return this.f43250a;
        }
    }

    /* compiled from: typeEnhancement.kt */
    /* renamed from: ib.g$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC1082f0 f43252a;

        /* renamed from: b, reason: collision with root package name */
        private final int f43253b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f43254c;

        public b(AbstractC1082f0 abstractC1082f0, int i10, boolean z10) {
            this.f43252a = abstractC1082f0;
            this.f43253b = i10;
            this.f43254c = z10;
        }

        public final boolean a() {
            return this.f43254c;
        }

        public final int b() {
            return this.f43253b;
        }

        public final AbstractC1082f0 c() {
            return this.f43252a;
        }
    }

    public C3673g(InterfaceC3090e javaResolverSettings) {
        C3862t.g(javaResolverSettings, "javaResolverSettings");
        this.f43249a = javaResolverSettings;
    }

    private final b b(AbstractC1082f0 abstractC1082f0, Ba.l<? super Integer, C3674h> lVar, int i10, h0 h0Var, boolean z10, boolean z11) {
        y0 y0VarO0;
        boolean z12;
        a aVar;
        E0 e0S;
        Ba.l<? super Integer, C3674h> lVar2 = lVar;
        boolean zA = i0.a(h0Var);
        boolean z13 = (z11 && z10) ? false : true;
        Hb.U u10 = null;
        if (!zA && abstractC1082f0.M0().isEmpty()) {
            return new b(null, 1, false);
        }
        InterfaceC1695h interfaceC1695hT = abstractC1082f0.O0().t();
        if (interfaceC1695hT == null) {
            return new b(null, 1, false);
        }
        C3674h c3674hInvoke = lVar2.invoke(Integer.valueOf(i10));
        InterfaceC1695h interfaceC1695hF = k0.f(interfaceC1695hT, c3674hInvoke, h0Var);
        Boolean boolH = k0.h(c3674hInvoke, h0Var);
        if (interfaceC1695hF == null || (y0VarO0 = interfaceC1695hF.l()) == null) {
            y0VarO0 = abstractC1082f0.O0();
        }
        y0 y0Var = y0VarO0;
        int iA = i10 + 1;
        List<E0> listM0 = abstractC1082f0.M0();
        List<m0> parameters = y0Var.getParameters();
        C3862t.f(parameters, "getParameters(...)");
        List<m0> list = parameters;
        Iterator<T> it = listM0.iterator();
        Iterator<T> it2 = list.iterator();
        ArrayList arrayList = new ArrayList(Math.min(kotlin.collections.r.x(listM0, 10), kotlin.collections.r.x(list, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            m0 m0Var = (m0) it2.next();
            E0 e02 = (E0) next;
            if (z13) {
                z12 = z13;
                if (!e02.c()) {
                    aVar = d(e02.a().R0(), lVar2, iA, z11);
                } else if (lVar2.invoke(Integer.valueOf(iA)).f() == EnumC3677k.f43277B) {
                    P0 p0R0 = e02.a().R0();
                    aVar = new a(Hb.X.e(Hb.N.c(p0R0).S0(false), Hb.N.d(p0R0).S0(true)), 1);
                } else {
                    aVar = new a(null, 1);
                }
            } else {
                z12 = z13;
                aVar = new a(u10, 0);
            }
            iA += aVar.a();
            if (aVar.b() != null) {
                Hb.U uB = aVar.b();
                Q0 q0B = e02.b();
                C3862t.f(q0B, "getProjectionKind(...)");
                e0S = Mb.d.k(uB, q0B, m0Var);
            } else if (interfaceC1695hF == null || e02.c()) {
                e0S = interfaceC1695hF != null ? M0.s(m0Var) : null;
            } else {
                Hb.U uA = e02.a();
                C3862t.f(uA, "getType(...)");
                Q0 q0B2 = e02.b();
                C3862t.f(q0B2, "getProjectionKind(...)");
                e0S = Mb.d.k(uA, q0B2, m0Var);
            }
            arrayList.add(e0S);
            lVar2 = lVar;
            z13 = z12;
            u10 = null;
        }
        int i11 = iA - i10;
        if (interfaceC1695hF == null && boolH == null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (((E0) it3.next()) == null) {
                    }
                }
            }
            return new b(null, i11, false);
        }
        Sa.h annotations = abstractC1082f0.getAnnotations();
        C3672f c3672f = k0.f43283b;
        if (interfaceC1695hF == null) {
            c3672f = null;
        }
        boolean z14 = false;
        u0 u0VarB = v0.b(k0.e(kotlin.collections.r.r(annotations, c3672f, boolH != null ? k0.g() : null)));
        List<E0> listM02 = abstractC1082f0.M0();
        Iterator it4 = arrayList.iterator();
        Iterator<T> it5 = listM02.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(kotlin.collections.r.x(arrayList, 10), kotlin.collections.r.x(listM02, 10)));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            E0 e03 = (E0) it5.next();
            E0 e04 = (E0) next2;
            if (e04 != null) {
                e03 = e04;
            }
            arrayList2.add(e03);
        }
        AbstractC1082f0 abstractC1082f0K = Hb.X.k(u0VarB, y0Var, arrayList2, boolH != null ? boolH.booleanValue() : abstractC1082f0.P0(), null, 16, null);
        if (c3674hInvoke.d()) {
            abstractC1082f0K = e(abstractC1082f0K);
        }
        if (boolH != null && c3674hInvoke.g()) {
            z14 = true;
        }
        return new b(abstractC1082f0K, i11, z14);
    }

    static /* synthetic */ b c(C3673g c3673g, AbstractC1082f0 abstractC1082f0, Ba.l lVar, int i10, h0 h0Var, boolean z10, boolean z11, int i11, Object obj) {
        return c3673g.b(abstractC1082f0, lVar, i10, h0Var, (i11 & 8) != 0 ? false : z10, (i11 & 16) != 0 ? false : z11);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final ib.C3673g.a d(Hb.P0 r12, Ba.l<? super java.lang.Integer, ib.C3674h> r13, int r14, boolean r15) {
        /*
            r11 = this;
            boolean r0 = Hb.Y.a(r12)
            r1 = 0
            if (r0 == 0) goto Le
            ib.g$a r12 = new ib.g$a
            r13 = 1
            r12.<init>(r1, r13)
            return r12
        Le:
            boolean r0 = r12 instanceof Hb.K
            if (r0 == 0) goto Lad
            boolean r0 = r12 instanceof Hb.InterfaceC1080e0
            r9 = r12
            Hb.K r9 = (Hb.K) r9
            Hb.f0 r3 = r9.W0()
            ib.h0 r6 = ib.h0.f43266B
            r2 = r11
            r4 = r13
            r5 = r14
            r7 = r0
            r8 = r15
            ib.g$b r10 = r2.b(r3, r4, r5, r6, r7, r8)
            Hb.f0 r3 = r9.X0()
            ib.h0 r6 = ib.h0.f43267C
            ib.g$b r13 = r2.b(r3, r4, r5, r6, r7, r8)
            r10.b()
            r13.b()
            Hb.f0 r14 = r10.c()
            if (r14 != 0) goto L43
            Hb.f0 r14 = r13.c()
            if (r14 != 0) goto L43
            goto La3
        L43:
            boolean r14 = r10.a()
            if (r14 != 0) goto L85
            boolean r14 = r13.a()
            if (r14 == 0) goto L50
            goto L85
        L50:
            if (r0 == 0) goto L6c
            fb.k r1 = new fb.k
            Hb.f0 r12 = r10.c()
            if (r12 != 0) goto L5e
            Hb.f0 r12 = r9.W0()
        L5e:
            Hb.f0 r13 = r13.c()
            if (r13 != 0) goto L68
            Hb.f0 r13 = r9.X0()
        L68:
            r1.<init>(r12, r13)
            goto La3
        L6c:
            Hb.f0 r12 = r10.c()
            if (r12 != 0) goto L76
            Hb.f0 r12 = r9.W0()
        L76:
            Hb.f0 r13 = r13.c()
            if (r13 != 0) goto L80
            Hb.f0 r13 = r9.X0()
        L80:
            Hb.P0 r1 = Hb.X.e(r12, r13)
            goto La3
        L85:
            Hb.f0 r13 = r13.c()
            if (r13 == 0) goto L98
            Hb.f0 r14 = r10.c()
            if (r14 != 0) goto L92
            r14 = r13
        L92:
            Hb.P0 r13 = Hb.X.e(r14, r13)
            if (r13 != 0) goto L9f
        L98:
            Hb.f0 r13 = r10.c()
            kotlin.jvm.internal.C3862t.d(r13)
        L9f:
            Hb.P0 r1 = Hb.O0.d(r12, r13)
        La3:
            ib.g$a r12 = new ib.g$a
            int r13 = r10.b()
            r12.<init>(r1, r13)
            goto Ldf
        Lad:
            boolean r0 = r12 instanceof Hb.AbstractC1082f0
            if (r0 == 0) goto Le0
            r2 = r12
            Hb.f0 r2 = (Hb.AbstractC1082f0) r2
            ib.h0 r5 = ib.h0.f43268D
            r8 = 8
            r9 = 0
            r6 = 0
            r1 = r11
            r3 = r13
            r4 = r14
            r7 = r15
            ib.g$b r13 = c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            ib.g$a r14 = new ib.g$a
            boolean r15 = r13.a()
            if (r15 == 0) goto Ld3
            Hb.f0 r15 = r13.c()
            Hb.P0 r12 = Hb.O0.d(r12, r15)
            goto Ld7
        Ld3:
            Hb.f0 r12 = r13.c()
        Ld7:
            int r13 = r13.b()
            r14.<init>(r12, r13)
            r12 = r14
        Ldf:
            return r12
        Le0:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ib.C3673g.d(Hb.P0, Ba.l, int, boolean):ib.g$a");
    }

    private final AbstractC1082f0 e(AbstractC1082f0 abstractC1082f0) {
        return this.f43249a.a() ? C1090j0.h(abstractC1082f0, true) : new C3676j(abstractC1082f0);
    }

    public final Hb.U a(Hb.U u10, Ba.l<? super Integer, C3674h> qualifiers, boolean z10) {
        C3862t.g(u10, "<this>");
        C3862t.g(qualifiers, "qualifiers");
        return d(u10.R0(), qualifiers, 0, z10).b();
    }
}
