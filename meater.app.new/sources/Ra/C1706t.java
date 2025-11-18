package Ra;

import Ob.l;
import Ra.w0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import tb.C4597i;

/* compiled from: DescriptorVisibilities.java */
/* renamed from: Ra.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1706t {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC1707u f15166a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC1707u f15167b;

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC1707u f15168c;

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC1707u f15169d;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC1707u f15170e;

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC1707u f15171f;

    /* renamed from: g, reason: collision with root package name */
    public static final AbstractC1707u f15172g;

    /* renamed from: h, reason: collision with root package name */
    public static final AbstractC1707u f15173h;

    /* renamed from: i, reason: collision with root package name */
    public static final AbstractC1707u f15174i;

    /* renamed from: j, reason: collision with root package name */
    public static final Set<AbstractC1707u> f15175j;

    /* renamed from: k, reason: collision with root package name */
    private static final Map<AbstractC1707u, Integer> f15176k;

    /* renamed from: l, reason: collision with root package name */
    public static final AbstractC1707u f15177l;

    /* renamed from: m, reason: collision with root package name */
    private static final Bb.g f15178m;

    /* renamed from: n, reason: collision with root package name */
    public static final Bb.g f15179n;

    /* renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final Bb.g f15180o;

    /* renamed from: p, reason: collision with root package name */
    private static final Ob.l f15181p;

    /* renamed from: q, reason: collision with root package name */
    private static final Map<x0, AbstractC1707u> f15182q;

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: Ra.t$a */
    static class a implements Bb.g {
        a() {
        }

        @Override // Bb.g
        public Hb.U a() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: Ra.t$b */
    static class b implements Bb.g {
        b() {
        }

        @Override // Bb.g
        public Hb.U a() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: Ra.t$c */
    static class c implements Bb.g {
        c() {
        }

        @Override // Bb.g
        public Hb.U a() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: Ra.t$d */
    static class d extends r {
        d(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "what";
            } else if (i10 != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private boolean h(InterfaceC1700m interfaceC1700m) {
            if (interfaceC1700m == null) {
                g(0);
            }
            return C4597i.j(interfaceC1700m) != i0.f15159a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [Ra.m, Ra.q] */
        /* JADX WARN: Type inference failed for: r4v1, types: [Ra.m] */
        /* JADX WARN: Type inference failed for: r4v2, types: [Ra.m] */
        /* JADX WARN: Type inference failed for: r4v4, types: [Ra.m] */
        @Override // Ra.AbstractC1707u
        public boolean e(Bb.g gVar, InterfaceC1704q interfaceC1704q, InterfaceC1700m interfaceC1700m, boolean z10) {
            if (interfaceC1704q == 0) {
                g(1);
            }
            if (interfaceC1700m == null) {
                g(2);
            }
            if (C4597i.J(interfaceC1704q) && h(interfaceC1700m)) {
                return C1706t.f(interfaceC1704q, interfaceC1700m);
            }
            if (interfaceC1704q instanceof InterfaceC1699l) {
                InterfaceC1696i interfaceC1696iC = ((InterfaceC1699l) interfaceC1704q).c();
                if (z10 && C4597i.G(interfaceC1696iC) && C4597i.J(interfaceC1696iC) && (interfaceC1700m instanceof InterfaceC1699l) && C4597i.J(interfaceC1700m.c()) && C1706t.f(interfaceC1704q, interfaceC1700m)) {
                    return true;
                }
            }
            while (interfaceC1704q != 0) {
                interfaceC1704q = interfaceC1704q.c();
                if (((interfaceC1704q instanceof InterfaceC1692e) && !C4597i.x(interfaceC1704q)) || (interfaceC1704q instanceof N)) {
                    break;
                }
            }
            if (interfaceC1704q == 0) {
                return false;
            }
            while (interfaceC1700m != null) {
                if (interfaceC1704q == interfaceC1700m) {
                    return true;
                }
                if (interfaceC1700m instanceof N) {
                    return (interfaceC1704q instanceof N) && interfaceC1704q.f().equals(((N) interfaceC1700m).f()) && C4597i.b(interfaceC1700m, interfaceC1704q);
                }
                interfaceC1700m = interfaceC1700m.c();
            }
            return false;
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: Ra.t$e */
    static class e extends r {
        e(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Ra.AbstractC1707u
        public boolean e(Bb.g gVar, InterfaceC1704q interfaceC1704q, InterfaceC1700m interfaceC1700m, boolean z10) {
            InterfaceC1700m interfaceC1700mQ;
            if (interfaceC1704q == null) {
                g(0);
            }
            if (interfaceC1700m == null) {
                g(1);
            }
            if (C1706t.f15166a.e(gVar, interfaceC1704q, interfaceC1700m, z10)) {
                if (gVar == C1706t.f15179n) {
                    return true;
                }
                if (gVar != C1706t.f15178m && (interfaceC1700mQ = C4597i.q(interfaceC1704q, InterfaceC1692e.class)) != null && (gVar instanceof Bb.i)) {
                    return ((Bb.i) gVar).t().b().equals(interfaceC1700mQ.b());
                }
            }
            return false;
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: Ra.t$f */
    static class f extends r {
        f(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "from";
            } else if (i10 == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i10 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i10 == 2 || i10 == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private boolean h(Bb.g gVar, InterfaceC1704q interfaceC1704q, InterfaceC1692e interfaceC1692e) {
            if (interfaceC1704q == null) {
                g(2);
            }
            if (interfaceC1692e == null) {
                g(3);
            }
            if (gVar == C1706t.f15180o) {
                return false;
            }
            if (!(interfaceC1704q instanceof InterfaceC1689b) || (interfaceC1704q instanceof InterfaceC1699l) || gVar == C1706t.f15179n) {
                return true;
            }
            if (gVar == C1706t.f15178m || gVar == null) {
                return false;
            }
            Hb.U uC = gVar instanceof Bb.h ? ((Bb.h) gVar).c() : gVar.a();
            return C4597i.I(uC, interfaceC1692e) || Hb.G.a(uC);
        }

        @Override // Ra.AbstractC1707u
        public boolean e(Bb.g gVar, InterfaceC1704q interfaceC1704q, InterfaceC1700m interfaceC1700m, boolean z10) {
            InterfaceC1692e interfaceC1692e;
            if (interfaceC1704q == null) {
                g(0);
            }
            if (interfaceC1700m == null) {
                g(1);
            }
            InterfaceC1692e interfaceC1692e2 = (InterfaceC1692e) C4597i.q(interfaceC1704q, InterfaceC1692e.class);
            InterfaceC1692e interfaceC1692e3 = (InterfaceC1692e) C4597i.r(interfaceC1700m, InterfaceC1692e.class, false);
            if (interfaceC1692e3 == null) {
                return false;
            }
            if (interfaceC1692e2 != null && C4597i.x(interfaceC1692e2) && (interfaceC1692e = (InterfaceC1692e) C4597i.q(interfaceC1692e2, InterfaceC1692e.class)) != null && C4597i.H(interfaceC1692e3, interfaceC1692e)) {
                return true;
            }
            InterfaceC1704q interfaceC1704qM = C4597i.M(interfaceC1704q);
            InterfaceC1692e interfaceC1692e4 = (InterfaceC1692e) C4597i.q(interfaceC1704qM, InterfaceC1692e.class);
            if (interfaceC1692e4 == null) {
                return false;
            }
            if (C4597i.H(interfaceC1692e3, interfaceC1692e4) && h(gVar, interfaceC1704qM, interfaceC1692e3)) {
                return true;
            }
            return e(gVar, interfaceC1704q, interfaceC1692e3.c(), z10);
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: Ra.t$g */
    static class g extends r {
        g(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Ra.AbstractC1707u
        public boolean e(Bb.g gVar, InterfaceC1704q interfaceC1704q, InterfaceC1700m interfaceC1700m, boolean z10) {
            if (interfaceC1704q == null) {
                g(0);
            }
            if (interfaceC1700m == null) {
                g(1);
            }
            if (C4597i.g(interfaceC1700m).I0(C4597i.g(interfaceC1704q))) {
                return C1706t.f15181p.a(interfaceC1704q, interfaceC1700m);
            }
            return false;
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: Ra.t$h */
    static class h extends r {
        h(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Ra.AbstractC1707u
        public boolean e(Bb.g gVar, InterfaceC1704q interfaceC1704q, InterfaceC1700m interfaceC1700m, boolean z10) {
            if (interfaceC1704q == null) {
                g(0);
            }
            if (interfaceC1700m == null) {
                g(1);
            }
            return true;
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: Ra.t$i */
    static class i extends r {
        i(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Ra.AbstractC1707u
        public boolean e(Bb.g gVar, InterfaceC1704q interfaceC1704q, InterfaceC1700m interfaceC1700m, boolean z10) {
            if (interfaceC1704q == null) {
                g(0);
            }
            if (interfaceC1700m == null) {
                g(1);
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: Ra.t$j */
    static class j extends r {
        j(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Ra.AbstractC1707u
        public boolean e(Bb.g gVar, InterfaceC1704q interfaceC1704q, InterfaceC1700m interfaceC1700m, boolean z10) {
            if (interfaceC1704q == null) {
                g(0);
            }
            if (interfaceC1700m == null) {
                g(1);
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: Ra.t$k */
    static class k extends r {
        k(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Ra.AbstractC1707u
        public boolean e(Bb.g gVar, InterfaceC1704q interfaceC1704q, InterfaceC1700m interfaceC1700m, boolean z10) {
            if (interfaceC1704q == null) {
                g(0);
            }
            if (interfaceC1700m == null) {
                g(1);
            }
            return false;
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: Ra.t$l */
    static class l extends r {
        l(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Ra.AbstractC1707u
        public boolean e(Bb.g gVar, InterfaceC1704q interfaceC1704q, InterfaceC1700m interfaceC1700m, boolean z10) {
            if (interfaceC1704q == null) {
                g(0);
            }
            if (interfaceC1700m == null) {
                g(1);
            }
            return false;
        }
    }

    static {
        d dVar = new d(w0.e.f15191c);
        f15166a = dVar;
        e eVar = new e(w0.f.f15192c);
        f15167b = eVar;
        f fVar = new f(w0.g.f15193c);
        f15168c = fVar;
        g gVar = new g(w0.b.f15188c);
        f15169d = gVar;
        h hVar = new h(w0.h.f15194c);
        f15170e = hVar;
        i iVar = new i(w0.d.f15190c);
        f15171f = iVar;
        j jVar = new j(w0.a.f15187c);
        f15172g = jVar;
        k kVar = new k(w0.c.f15189c);
        f15173h = kVar;
        l lVar = new l(w0.i.f15195c);
        f15174i = lVar;
        f15175j = Collections.unmodifiableSet(kotlin.collections.V.g(dVar, eVar, gVar, iVar));
        HashMap mapE = Rb.a.e(4);
        mapE.put(eVar, 0);
        mapE.put(dVar, 0);
        mapE.put(gVar, 1);
        mapE.put(fVar, 1);
        mapE.put(hVar, 2);
        f15176k = Collections.unmodifiableMap(mapE);
        f15177l = hVar;
        f15178m = new a();
        f15179n = new b();
        f15180o = new c();
        Iterator it = ServiceLoader.load(Ob.l.class, Ob.l.class.getClassLoader()).iterator();
        f15181p = it.hasNext() ? (Ob.l) it.next() : l.a.f13548a;
        f15182q = new HashMap();
        i(dVar);
        i(eVar);
        i(fVar);
        i(gVar);
        i(hVar);
        i(iVar);
        i(jVar);
        i(kVar);
        i(lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void a(int r8) {
        /*
            r0 = 16
            if (r8 == r0) goto L7
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L9
        L7:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L9:
            r2 = 3
            r3 = 2
            if (r8 == r0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r3
        L10:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"
            r6 = 1
            r7 = 0
            if (r8 == r6) goto L3a
            if (r8 == r2) goto L3a
            r2 = 5
            if (r8 == r2) goto L3a
            r2 = 7
            if (r8 == r2) goto L3a
            switch(r8) {
                case 9: goto L3a;
                case 10: goto L35;
                case 11: goto L30;
                case 12: goto L35;
                case 13: goto L30;
                case 14: goto L2b;
                case 15: goto L2b;
                case 16: goto L28;
                default: goto L23;
            }
        L23:
            java.lang.String r2 = "what"
            r4[r7] = r2
            goto L3e
        L28:
            r4[r7] = r5
            goto L3e
        L2b:
            java.lang.String r2 = "visibility"
            r4[r7] = r2
            goto L3e
        L30:
            java.lang.String r2 = "second"
            r4[r7] = r2
            goto L3e
        L35:
            java.lang.String r2 = "first"
            r4[r7] = r2
            goto L3e
        L3a:
            java.lang.String r2 = "from"
            r4[r7] = r2
        L3e:
            java.lang.String r2 = "toDescriptorVisibility"
            if (r8 == r0) goto L45
            r4[r6] = r5
            goto L47
        L45:
            r4[r6] = r2
        L47:
            switch(r8) {
                case 2: goto L70;
                case 3: goto L70;
                case 4: goto L6b;
                case 5: goto L6b;
                case 6: goto L66;
                case 7: goto L66;
                case 8: goto L61;
                case 9: goto L61;
                case 10: goto L5c;
                case 11: goto L5c;
                case 12: goto L57;
                case 13: goto L57;
                case 14: goto L52;
                case 15: goto L4f;
                case 16: goto L74;
                default: goto L4a;
            }
        L4a:
            java.lang.String r2 = "isVisible"
            r4[r3] = r2
            goto L74
        L4f:
            r4[r3] = r2
            goto L74
        L52:
            java.lang.String r2 = "isPrivate"
            r4[r3] = r2
            goto L74
        L57:
            java.lang.String r2 = "compare"
            r4[r3] = r2
            goto L74
        L5c:
            java.lang.String r2 = "compareLocal"
            r4[r3] = r2
            goto L74
        L61:
            java.lang.String r2 = "findInvisibleMember"
            r4[r3] = r2
            goto L74
        L66:
            java.lang.String r2 = "inSameFile"
            r4[r3] = r2
            goto L74
        L6b:
            java.lang.String r2 = "isVisibleWithAnyReceiver"
            r4[r3] = r2
            goto L74
        L70:
            java.lang.String r2 = "isVisibleIgnoringReceiver"
            r4[r3] = r2
        L74:
            java.lang.String r1 = java.lang.String.format(r1, r4)
            if (r8 == r0) goto L80
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto L85
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        L85:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Ra.C1706t.a(int):void");
    }

    public static Integer d(AbstractC1707u abstractC1707u, AbstractC1707u abstractC1707u2) {
        if (abstractC1707u == null) {
            a(12);
        }
        if (abstractC1707u2 == null) {
            a(13);
        }
        Integer numA = abstractC1707u.a(abstractC1707u2);
        if (numA != null) {
            return numA;
        }
        Integer numA2 = abstractC1707u2.a(abstractC1707u);
        if (numA2 != null) {
            return Integer.valueOf(-numA2.intValue());
        }
        return null;
    }

    public static InterfaceC1704q e(Bb.g gVar, InterfaceC1704q interfaceC1704q, InterfaceC1700m interfaceC1700m, boolean z10) {
        InterfaceC1704q interfaceC1704qE;
        if (interfaceC1704q == null) {
            a(8);
        }
        if (interfaceC1700m == null) {
            a(9);
        }
        for (InterfaceC1704q interfaceC1704q2 = (InterfaceC1704q) interfaceC1704q.b(); interfaceC1704q2 != null && interfaceC1704q2.getVisibility() != f15171f; interfaceC1704q2 = (InterfaceC1704q) C4597i.q(interfaceC1704q2, InterfaceC1704q.class)) {
            if (!interfaceC1704q2.getVisibility().e(gVar, interfaceC1704q2, interfaceC1700m, z10)) {
                return interfaceC1704q2;
            }
        }
        if (!(interfaceC1704q instanceof Ua.Q) || (interfaceC1704qE = e(gVar, ((Ua.Q) interfaceC1704q).m0(), interfaceC1700m, z10)) == null) {
            return null;
        }
        return interfaceC1704qE;
    }

    public static boolean f(InterfaceC1700m interfaceC1700m, InterfaceC1700m interfaceC1700m2) {
        if (interfaceC1700m == null) {
            a(6);
        }
        if (interfaceC1700m2 == null) {
            a(7);
        }
        i0 i0VarJ = C4597i.j(interfaceC1700m2);
        if (i0VarJ != i0.f15159a) {
            return i0VarJ.equals(C4597i.j(interfaceC1700m));
        }
        return false;
    }

    public static boolean g(AbstractC1707u abstractC1707u) {
        if (abstractC1707u == null) {
            a(14);
        }
        return abstractC1707u == f15166a || abstractC1707u == f15167b;
    }

    public static boolean h(InterfaceC1704q interfaceC1704q, InterfaceC1700m interfaceC1700m, boolean z10) {
        if (interfaceC1704q == null) {
            a(2);
        }
        if (interfaceC1700m == null) {
            a(3);
        }
        return e(f15179n, interfaceC1704q, interfaceC1700m, z10) == null;
    }

    private static void i(AbstractC1707u abstractC1707u) {
        f15182q.put(abstractC1707u.b(), abstractC1707u);
    }

    public static AbstractC1707u j(x0 x0Var) {
        if (x0Var == null) {
            a(15);
        }
        AbstractC1707u abstractC1707u = f15182q.get(x0Var);
        if (abstractC1707u != null) {
            return abstractC1707u;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + x0Var);
    }
}
