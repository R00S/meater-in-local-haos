package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.collections.C10822w0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10608l1;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.InterfaceC10654i0;
import kotlin.reflect.jvm.internal.impl.utils.C10767a;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10187d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o.InterfaceC10263f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o.InterfaceC10264g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o.InterfaceC10265h;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10432w;
import kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10476l;

/* compiled from: DescriptorVisibilities.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t */
/* loaded from: classes2.dex */
public class C10728t {

    /* renamed from: a */
    public static final AbstractC10730u f41216a;

    /* renamed from: b */
    public static final AbstractC10730u f41217b;

    /* renamed from: c */
    public static final AbstractC10730u f41218c;

    /* renamed from: d */
    public static final AbstractC10730u f41219d;

    /* renamed from: e */
    public static final AbstractC10730u f41220e;

    /* renamed from: f */
    public static final AbstractC10730u f41221f;

    /* renamed from: g */
    public static final AbstractC10730u f41222g;

    /* renamed from: h */
    public static final AbstractC10730u f41223h;

    /* renamed from: i */
    public static final AbstractC10730u f41224i;

    /* renamed from: j */
    public static final Set<AbstractC10730u> f41225j;

    /* renamed from: k */
    private static final Map<AbstractC10730u, Integer> f41226k;

    /* renamed from: l */
    public static final AbstractC10730u f41227l;

    /* renamed from: m */
    private static final InterfaceC10263f f41228m;

    /* renamed from: n */
    public static final InterfaceC10263f f41229n;

    /* renamed from: o */
    @Deprecated
    public static final InterfaceC10263f f41230o;

    /* renamed from: p */
    private static final InterfaceC10476l f41231p;

    /* renamed from: q */
    private static final Map<AbstractC10611m1, AbstractC10730u> f41232q;

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$a */
    static class a implements InterfaceC10263f {
        a() {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o.InterfaceC10263f
        public AbstractC10344e0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$b */
    static class b implements InterfaceC10263f {
        b() {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o.InterfaceC10263f
        public AbstractC10344e0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$c */
    static class c implements InterfaceC10263f {
        c() {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o.InterfaceC10263f
        public AbstractC10344e0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$d */
    static class d extends AbstractC10682r {
        d(AbstractC10611m1 abstractC10611m1) {
            super(abstractC10611m1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m38136g(int i2) {
            Object[] objArr = new Object[3];
            if (i2 == 1) {
                objArr[0] = "what";
            } else if (i2 != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i2 == 1 || i2 == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: h */
        private boolean m38137h(InterfaceC10609m interfaceC10609m) {
            if (interfaceC10609m == null) {
                m38136g(0);
            }
            return C10187d.m35822j(interfaceC10609m) != InterfaceC10575a1.f40728a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.m, kotlin.reflect.jvm.internal.impl.descriptors.q] */
        /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.m] */
        /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.m] */
        /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.reflect.jvm.internal.impl.descriptors.m] */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u
        /* renamed from: e */
        public boolean mo33796e(InterfaceC10263f interfaceC10263f, InterfaceC10677q interfaceC10677q, InterfaceC10609m interfaceC10609m, boolean z) {
            if (interfaceC10677q == 0) {
                m38136g(1);
            }
            if (interfaceC10609m == null) {
                m38136g(2);
            }
            if (C10187d.m35809J(interfaceC10677q) && m38137h(interfaceC10609m)) {
                return C10728t.m38131f(interfaceC10677q, interfaceC10609m);
            }
            if (interfaceC10677q instanceof InterfaceC10606l) {
                InterfaceC10597i interfaceC10597iMo32876b = ((InterfaceC10606l) interfaceC10677q).mo32876b();
                if (z && C10187d.m35806G(interfaceC10597iMo32876b) && C10187d.m35809J(interfaceC10597iMo32876b) && (interfaceC10609m instanceof InterfaceC10606l) && C10187d.m35809J(interfaceC10609m.mo32876b()) && C10728t.m38131f(interfaceC10677q, interfaceC10609m)) {
                    return true;
                }
            }
            while (interfaceC10677q != 0) {
                interfaceC10677q = interfaceC10677q.mo32876b();
                if (((interfaceC10677q instanceof InterfaceC10585e) && !C10187d.m35836x(interfaceC10677q)) || (interfaceC10677q instanceof InterfaceC10604k0)) {
                    break;
                }
            }
            if (interfaceC10677q == 0) {
                return false;
            }
            while (interfaceC10609m != null) {
                if (interfaceC10677q == interfaceC10609m) {
                    return true;
                }
                if (interfaceC10609m instanceof InterfaceC10604k0) {
                    return (interfaceC10677q instanceof InterfaceC10604k0) && interfaceC10677q.mo37712d().equals(((InterfaceC10604k0) interfaceC10609m).mo37712d()) && C10187d.m35814b(interfaceC10609m, interfaceC10677q);
                }
                interfaceC10609m = interfaceC10609m.mo32876b();
            }
            return false;
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$e */
    static class e extends AbstractC10682r {
        e(AbstractC10611m1 abstractC10611m1) {
            super(abstractC10611m1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m38138g(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u
        /* renamed from: e */
        public boolean mo33796e(InterfaceC10263f interfaceC10263f, InterfaceC10677q interfaceC10677q, InterfaceC10609m interfaceC10609m, boolean z) {
            InterfaceC10609m interfaceC10609mM35829q;
            if (interfaceC10677q == null) {
                m38138g(0);
            }
            if (interfaceC10609m == null) {
                m38138g(1);
            }
            if (C10728t.f41216a.mo33796e(interfaceC10263f, interfaceC10677q, interfaceC10609m, z)) {
                if (interfaceC10263f == C10728t.f41229n) {
                    return true;
                }
                if (interfaceC10263f != C10728t.f41228m && (interfaceC10609mM35829q = C10187d.m35829q(interfaceC10677q, InterfaceC10585e.class)) != null && (interfaceC10263f instanceof InterfaceC10265h)) {
                    return ((InterfaceC10265h) interfaceC10263f).mo36183r().mo37019a().equals(interfaceC10609mM35829q.mo37019a());
                }
            }
            return false;
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$f */
    static class f extends AbstractC10682r {
        f(AbstractC10611m1 abstractC10611m1) {
            super(abstractC10611m1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m38139g(int i2) {
            Object[] objArr = new Object[3];
            if (i2 == 1) {
                objArr[0] = "from";
            } else if (i2 == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i2 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i2 == 2 || i2 == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: h */
        private boolean m38140h(InterfaceC10263f interfaceC10263f, InterfaceC10677q interfaceC10677q, InterfaceC10585e interfaceC10585e) {
            if (interfaceC10677q == null) {
                m38139g(2);
            }
            if (interfaceC10585e == null) {
                m38139g(3);
            }
            if (interfaceC10263f == C10728t.f41230o) {
                return false;
            }
            if (!(interfaceC10677q instanceof InterfaceC10576b) || (interfaceC10677q instanceof InterfaceC10606l) || interfaceC10263f == C10728t.f41229n) {
                return true;
            }
            if (interfaceC10263f == C10728t.f41228m || interfaceC10263f == null) {
                return false;
            }
            AbstractC10344e0 abstractC10344e0M36184a = interfaceC10263f instanceof InterfaceC10264g ? ((InterfaceC10264g) interfaceC10263f).m36184a() : interfaceC10263f.getType();
            return C10187d.m35808I(abstractC10344e0M36184a, interfaceC10585e) || C10432w.m37085a(abstractC10344e0M36184a);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u
        /* renamed from: e */
        public boolean mo33796e(InterfaceC10263f interfaceC10263f, InterfaceC10677q interfaceC10677q, InterfaceC10609m interfaceC10609m, boolean z) {
            InterfaceC10585e interfaceC10585e;
            if (interfaceC10677q == null) {
                m38139g(0);
            }
            if (interfaceC10609m == null) {
                m38139g(1);
            }
            InterfaceC10585e interfaceC10585e2 = (InterfaceC10585e) C10187d.m35829q(interfaceC10677q, InterfaceC10585e.class);
            InterfaceC10585e interfaceC10585e3 = (InterfaceC10585e) C10187d.m35830r(interfaceC10609m, InterfaceC10585e.class, false);
            if (interfaceC10585e3 == null) {
                return false;
            }
            if (interfaceC10585e2 != null && C10187d.m35836x(interfaceC10585e2) && (interfaceC10585e = (InterfaceC10585e) C10187d.m35829q(interfaceC10585e2, InterfaceC10585e.class)) != null && C10187d.m35807H(interfaceC10585e3, interfaceC10585e)) {
                return true;
            }
            InterfaceC10677q interfaceC10677qM35812M = C10187d.m35812M(interfaceC10677q);
            InterfaceC10585e interfaceC10585e4 = (InterfaceC10585e) C10187d.m35829q(interfaceC10677qM35812M, InterfaceC10585e.class);
            if (interfaceC10585e4 == null) {
                return false;
            }
            if (C10187d.m35807H(interfaceC10585e3, interfaceC10585e4) && m38140h(interfaceC10263f, interfaceC10677qM35812M, interfaceC10585e3)) {
                return true;
            }
            return mo33796e(interfaceC10263f, interfaceC10677q, interfaceC10585e3.mo32876b(), z);
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$g */
    static class g extends AbstractC10682r {
        g(AbstractC10611m1 abstractC10611m1) {
            super(abstractC10611m1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m38141g(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u
        /* renamed from: e */
        public boolean mo33796e(InterfaceC10263f interfaceC10263f, InterfaceC10677q interfaceC10677q, InterfaceC10609m interfaceC10609m, boolean z) {
            if (interfaceC10677q == null) {
                m38141g(0);
            }
            if (interfaceC10609m == null) {
                m38141g(1);
            }
            if (C10187d.m35819g(interfaceC10609m).mo37020e0(C10187d.m35819g(interfaceC10677q))) {
                return C10728t.f41231p.mo37206a(interfaceC10677q, interfaceC10609m);
            }
            return false;
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$h */
    static class h extends AbstractC10682r {
        h(AbstractC10611m1 abstractC10611m1) {
            super(abstractC10611m1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m38142g(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u
        /* renamed from: e */
        public boolean mo33796e(InterfaceC10263f interfaceC10263f, InterfaceC10677q interfaceC10677q, InterfaceC10609m interfaceC10609m, boolean z) {
            if (interfaceC10677q == null) {
                m38142g(0);
            }
            if (interfaceC10609m == null) {
                m38142g(1);
            }
            return true;
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$i */
    static class i extends AbstractC10682r {
        i(AbstractC10611m1 abstractC10611m1) {
            super(abstractC10611m1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m38143g(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u
        /* renamed from: e */
        public boolean mo33796e(InterfaceC10263f interfaceC10263f, InterfaceC10677q interfaceC10677q, InterfaceC10609m interfaceC10609m, boolean z) {
            if (interfaceC10677q == null) {
                m38143g(0);
            }
            if (interfaceC10609m == null) {
                m38143g(1);
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$j */
    static class j extends AbstractC10682r {
        j(AbstractC10611m1 abstractC10611m1) {
            super(abstractC10611m1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m38144g(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u
        /* renamed from: e */
        public boolean mo33796e(InterfaceC10263f interfaceC10263f, InterfaceC10677q interfaceC10677q, InterfaceC10609m interfaceC10609m, boolean z) {
            if (interfaceC10677q == null) {
                m38144g(0);
            }
            if (interfaceC10609m == null) {
                m38144g(1);
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$k */
    static class k extends AbstractC10682r {
        k(AbstractC10611m1 abstractC10611m1) {
            super(abstractC10611m1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m38145g(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u
        /* renamed from: e */
        public boolean mo33796e(InterfaceC10263f interfaceC10263f, InterfaceC10677q interfaceC10677q, InterfaceC10609m interfaceC10609m, boolean z) {
            if (interfaceC10677q == null) {
                m38145g(0);
            }
            if (interfaceC10609m == null) {
                m38145g(1);
            }
            return false;
        }
    }

    /* compiled from: DescriptorVisibilities.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t$l */
    static class l extends AbstractC10682r {
        l(AbstractC10611m1 abstractC10611m1) {
            super(abstractC10611m1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m38146g(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u
        /* renamed from: e */
        public boolean mo33796e(InterfaceC10263f interfaceC10263f, InterfaceC10677q interfaceC10677q, InterfaceC10609m interfaceC10609m, boolean z) {
            if (interfaceC10677q == null) {
                m38146g(0);
            }
            if (interfaceC10609m == null) {
                m38146g(1);
            }
            return false;
        }
    }

    static {
        d dVar = new d(C10608l1.e.f40777c);
        f41216a = dVar;
        e eVar = new e(C10608l1.f.f40778c);
        f41217b = eVar;
        f fVar = new f(C10608l1.g.f40779c);
        f41218c = fVar;
        g gVar = new g(C10608l1.b.f40774c);
        f41219d = gVar;
        h hVar = new h(C10608l1.h.f40780c);
        f41220e = hVar;
        i iVar = new i(C10608l1.d.f40776c);
        f41221f = iVar;
        j jVar = new j(C10608l1.a.f40773c);
        f41222g = jVar;
        k kVar = new k(C10608l1.c.f40775c);
        f41223h = kVar;
        l lVar = new l(C10608l1.i.f40781c);
        f41224i = lVar;
        f41225j = Collections.unmodifiableSet(C10822w0.m38922i(dVar, eVar, gVar, iVar));
        HashMap mapM38512e = C10767a.m38512e(4);
        mapM38512e.put(eVar, 0);
        mapM38512e.put(dVar, 0);
        mapM38512e.put(gVar, 1);
        mapM38512e.put(fVar, 1);
        mapM38512e.put(hVar, 2);
        f41226k = Collections.unmodifiableMap(mapM38512e);
        f41227l = hVar;
        f41228m = new a();
        f41229n = new b();
        f41230o = new c();
        Iterator it = ServiceLoader.load(InterfaceC10476l.class, InterfaceC10476l.class.getClassLoader()).iterator();
        f41231p = it.hasNext() ? (InterfaceC10476l) it.next() : InterfaceC10476l.a.f40424a;
        f41232q = new HashMap();
        m38134i(dVar);
        m38134i(eVar);
        m38134i(fVar);
        m38134i(gVar);
        m38134i(hVar);
        m38134i(iVar);
        m38134i(jVar);
        m38134i(kVar);
        m38134i(lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m38126a(int r8) {
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
            r4 = 3
            goto L10
        Lf:
            r4 = 2
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.C10728t.m38126a(int):void");
    }

    /* renamed from: d */
    public static Integer m38129d(AbstractC10730u abstractC10730u, AbstractC10730u abstractC10730u2) {
        if (abstractC10730u == null) {
            m38126a(12);
        }
        if (abstractC10730u2 == null) {
            m38126a(13);
        }
        Integer numM38147a = abstractC10730u.m38147a(abstractC10730u2);
        if (numM38147a != null) {
            return numM38147a;
        }
        Integer numM38147a2 = abstractC10730u2.m38147a(abstractC10730u);
        if (numM38147a2 != null) {
            return Integer.valueOf(-numM38147a2.intValue());
        }
        return null;
    }

    /* renamed from: e */
    public static InterfaceC10677q m38130e(InterfaceC10263f interfaceC10263f, InterfaceC10677q interfaceC10677q, InterfaceC10609m interfaceC10609m, boolean z) {
        InterfaceC10677q interfaceC10677qM38130e;
        if (interfaceC10677q == null) {
            m38126a(8);
        }
        if (interfaceC10609m == null) {
            m38126a(9);
        }
        for (InterfaceC10677q interfaceC10677q2 = (InterfaceC10677q) interfaceC10677q.mo37019a(); interfaceC10677q2 != null && interfaceC10677q2.getVisibility() != f41221f; interfaceC10677q2 = (InterfaceC10677q) C10187d.m35829q(interfaceC10677q2, InterfaceC10677q.class)) {
            if (!interfaceC10677q2.getVisibility().mo33796e(interfaceC10263f, interfaceC10677q2, interfaceC10609m, z)) {
                return interfaceC10677q2;
            }
        }
        if (!(interfaceC10677q instanceof InterfaceC10654i0) || (interfaceC10677qM38130e = m38130e(interfaceC10263f, ((InterfaceC10654i0) interfaceC10677q).mo37856p0(), interfaceC10609m, z)) == null) {
            return null;
        }
        return interfaceC10677qM38130e;
    }

    /* renamed from: f */
    public static boolean m38131f(InterfaceC10609m interfaceC10609m, InterfaceC10609m interfaceC10609m2) {
        if (interfaceC10609m == null) {
            m38126a(6);
        }
        if (interfaceC10609m2 == null) {
            m38126a(7);
        }
        InterfaceC10575a1 interfaceC10575a1M35822j = C10187d.m35822j(interfaceC10609m2);
        if (interfaceC10575a1M35822j != InterfaceC10575a1.f40728a) {
            return interfaceC10575a1M35822j.equals(C10187d.m35822j(interfaceC10609m));
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m38132g(AbstractC10730u abstractC10730u) {
        if (abstractC10730u == null) {
            m38126a(14);
        }
        return abstractC10730u == f41216a || abstractC10730u == f41217b;
    }

    /* renamed from: h */
    public static boolean m38133h(InterfaceC10677q interfaceC10677q, InterfaceC10609m interfaceC10609m, boolean z) {
        if (interfaceC10677q == null) {
            m38126a(2);
        }
        if (interfaceC10609m == null) {
            m38126a(3);
        }
        return m38130e(f41229n, interfaceC10677q, interfaceC10609m, z) == null;
    }

    /* renamed from: i */
    private static void m38134i(AbstractC10730u abstractC10730u) {
        f41232q.put(abstractC10730u.mo38007b(), abstractC10730u);
    }

    /* renamed from: j */
    public static AbstractC10730u m38135j(AbstractC10611m1 abstractC10611m1) {
        if (abstractC10611m1 == null) {
            m38126a(15);
        }
        AbstractC10730u abstractC10730u = f41232q.get(abstractC10611m1);
        if (abstractC10730u != null) {
            return abstractC10730u;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + abstractC10611m1);
    }
}
