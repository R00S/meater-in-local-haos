package kotlin.reflect.p371y.internal.p374j0.p400i;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.C10775u;
import kotlin.Pair;
import kotlin.collections.C10782c0;
import kotlin.collections.C10813s;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10728t;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10583d0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10677q;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10727s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10735w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10640b0;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10666p;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10642c0;
import kotlin.reflect.jvm.internal.impl.utils.C10772f;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.InterfaceC10188e;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10335b0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10342d1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10346f;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10350g0;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10395f;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10394e;

/* compiled from: OverridingUtil.java */
/* renamed from: kotlin.f0.y.e.j0.i.j */
/* loaded from: classes3.dex */
public class C10193j {

    /* renamed from: a */
    private static final List<InterfaceC10188e> f39519a = C10782c0.m38569E0(ServiceLoader.load(InterfaceC10188e.class, InterfaceC10188e.class.getClassLoader()));

    /* renamed from: b */
    public static final C10193j f39520b;

    /* renamed from: c */
    private static final InterfaceC10394e.a f39521c;

    /* renamed from: d */
    private final AbstractC10396g f39522d;

    /* renamed from: e */
    private final AbstractC10395f f39523e;

    /* renamed from: f */
    private final InterfaceC10394e.a f39524f;

    /* renamed from: g */
    private final Function2<AbstractC10344e0, AbstractC10344e0, Boolean> f39525g;

    /* compiled from: OverridingUtil.java */
    /* renamed from: kotlin.f0.y.e.j0.i.j$a */
    static class a implements InterfaceC10394e.a {
        a() {
        }

        /* renamed from: b */
        private static /* synthetic */ void m35887b(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10394e.a
        /* renamed from: a */
        public boolean mo35780a(InterfaceC10345e1 interfaceC10345e1, InterfaceC10345e1 interfaceC10345e12) {
            if (interfaceC10345e1 == null) {
                m35887b(0);
            }
            if (interfaceC10345e12 == null) {
                m35887b(1);
            }
            return interfaceC10345e1.equals(interfaceC10345e12);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    /* compiled from: OverridingUtil.java */
    /* renamed from: kotlin.f0.y.e.j0.i.j$b */
    static class b<D> implements Function2<D, D, Pair<InterfaceC10573a, InterfaceC10573a>> {
        b() {
        }

        /* JADX WARN: Incorrect types in method signature: (TD;TD;)Lkotlin/m<Lkotlin/reflect/jvm/internal/impl/descriptors/a;Lkotlin/reflect/jvm/internal/impl/descriptors/a;>; */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Pair invoke(InterfaceC10573a interfaceC10573a, InterfaceC10573a interfaceC10573a2) {
            return new Pair(interfaceC10573a, interfaceC10573a2);
        }
    }

    /* compiled from: OverridingUtil.java */
    /* renamed from: kotlin.f0.y.e.j0.i.j$c */
    static class c implements Function1<InterfaceC10576b, Boolean> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC10609m f39526f;

        c(InterfaceC10609m interfaceC10609m) {
            this.f39526f = interfaceC10609m;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(InterfaceC10576b interfaceC10576b) {
            return Boolean.valueOf(interfaceC10576b.mo32876b() == this.f39526f);
        }
    }

    /* compiled from: OverridingUtil.java */
    /* renamed from: kotlin.f0.y.e.j0.i.j$d */
    static class d implements Function1<InterfaceC10576b, InterfaceC10573a> {
        d() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC10576b invoke(InterfaceC10576b interfaceC10576b) {
            return interfaceC10576b;
        }
    }

    /* compiled from: OverridingUtil.java */
    /* renamed from: kotlin.f0.y.e.j0.i.j$e */
    static class e implements Function1<InterfaceC10576b, Boolean> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC10585e f39527f;

        e(InterfaceC10585e interfaceC10585e) {
            this.f39527f = interfaceC10585e;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(InterfaceC10576b interfaceC10576b) {
            boolean z = false;
            if (!C10728t.m38132g(interfaceC10576b.getVisibility()) && C10728t.m38133h(interfaceC10576b, this.f39527f, false)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: OverridingUtil.java */
    /* renamed from: kotlin.f0.y.e.j0.i.j$f */
    static class f implements Function1<InterfaceC10576b, InterfaceC10573a> {
        f() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC10573a invoke(InterfaceC10576b interfaceC10576b) {
            return interfaceC10576b;
        }
    }

    /* compiled from: OverridingUtil.java */
    /* renamed from: kotlin.f0.y.e.j0.i.j$g */
    static class g implements Function1<InterfaceC10576b, C10775u> {

        /* renamed from: f */
        final /* synthetic */ AbstractC10192i f39528f;

        /* renamed from: g */
        final /* synthetic */ InterfaceC10576b f39529g;

        g(AbstractC10192i abstractC10192i, InterfaceC10576b interfaceC10576b) {
            this.f39528f = abstractC10192i;
            this.f39529g = interfaceC10576b;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C10775u invoke(InterfaceC10576b interfaceC10576b) {
            this.f39528f.mo35847b(this.f39529g, interfaceC10576b);
            return C10775u.f41439a;
        }
    }

    /* compiled from: OverridingUtil.java */
    /* renamed from: kotlin.f0.y.e.j0.i.j$h */
    static /* synthetic */ class h {

        /* renamed from: a */
        static final /* synthetic */ int[] f39530a;

        /* renamed from: b */
        static final /* synthetic */ int[] f39531b;

        /* renamed from: c */
        static final /* synthetic */ int[] f39532c;

        static {
            int[] iArr = new int[EnumC10583d0.values().length];
            f39532c = iArr;
            try {
                iArr[EnumC10583d0.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39532c[EnumC10583d0.SEALED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39532c[EnumC10583d0.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39532c[EnumC10583d0.ABSTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[i.a.values().length];
            f39531b = iArr2;
            try {
                iArr2[i.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39531b[i.a.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f39531b[i.a.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[InterfaceC10188e.b.values().length];
            f39530a = iArr3;
            try {
                iArr3[InterfaceC10188e.b.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f39530a[InterfaceC10188e.b.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f39530a[InterfaceC10188e.b.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f39530a[InterfaceC10188e.b.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* compiled from: OverridingUtil.java */
    /* renamed from: kotlin.f0.y.e.j0.i.j$i */
    public static class i {

        /* renamed from: a */
        private static final i f39533a = new i(a.OVERRIDABLE, "SUCCESS");

        /* renamed from: b */
        private final a f39534b;

        /* renamed from: c */
        private final String f39535c;

        /* compiled from: OverridingUtil.java */
        /* renamed from: kotlin.f0.y.e.j0.i.j$i$a */
        public enum a {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public i(a aVar, String str) {
            if (aVar == null) {
                m35894a(3);
            }
            if (str == null) {
                m35894a(4);
            }
            this.f39534b = aVar;
            this.f39535c = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ void m35894a(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto Lf
                if (r10 == r2) goto Lf
                if (r10 == r1) goto Lf
                if (r10 == r0) goto Lf
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L11
            Lf:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L11:
                if (r10 == r3) goto L1b
                if (r10 == r2) goto L1b
                if (r10 == r1) goto L1b
                if (r10 == r0) goto L1b
                r5 = 2
                goto L1c
            L1b:
                r5 = 3
            L1c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L31
                if (r10 == r2) goto L31
                if (r10 == r1) goto L2e
                if (r10 == r0) goto L31
                r5[r8] = r7
                goto L35
            L2e:
                r5[r8] = r6
                goto L35
            L31:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L35:
                switch(r10) {
                    case 1: goto L45;
                    case 2: goto L45;
                    case 3: goto L45;
                    case 4: goto L45;
                    case 5: goto L40;
                    case 6: goto L3b;
                    default: goto L38;
                }
            L38:
                r5[r3] = r6
                goto L47
            L3b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L47
            L40:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L47
            L45:
                r5[r3] = r7
            L47:
                if (r10 == r3) goto L5a
                if (r10 == r2) goto L55
                if (r10 == r1) goto L50
                if (r10 == r0) goto L50
                goto L5e
            L50:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L5e
            L55:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L5e
            L5a:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L5e:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L70
                if (r10 == r2) goto L70
                if (r10 == r1) goto L70
                if (r10 == r0) goto L70
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L75
            L70:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L75:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p400i.C10193j.i.m35894a(int):void");
        }

        /* renamed from: b */
        public static i m35895b(String str) {
            if (str == null) {
                m35894a(2);
            }
            return new i(a.CONFLICT, str);
        }

        /* renamed from: d */
        public static i m35896d(String str) {
            if (str == null) {
                m35894a(1);
            }
            return new i(a.INCOMPATIBLE, str);
        }

        /* renamed from: e */
        public static i m35897e() {
            i iVar = f39533a;
            if (iVar == null) {
                m35894a(0);
            }
            return iVar;
        }

        /* renamed from: c */
        public a m35898c() {
            a aVar = this.f39534b;
            if (aVar == null) {
                m35894a(5);
            }
            return aVar;
        }
    }

    static {
        a aVar = new a();
        f39521c = aVar;
        f39520b = new C10193j(aVar, AbstractC10396g.a.f40183a, AbstractC10395f.a.f40182a, null);
    }

    private C10193j(InterfaceC10394e.a aVar, AbstractC10396g abstractC10396g, AbstractC10395f abstractC10395f, Function2<AbstractC10344e0, AbstractC10344e0, Boolean> function2) {
        if (aVar == null) {
            m35858a(5);
        }
        if (abstractC10396g == null) {
            m35858a(6);
        }
        if (abstractC10395f == null) {
            m35858a(7);
        }
        this.f39524f = aVar;
        this.f39522d = abstractC10396g;
        this.f39523e = abstractC10395f;
        this.f39525g = function2;
    }

    /* renamed from: A */
    private static boolean m35849A(InterfaceC10727s0 interfaceC10727s0, InterfaceC10727s0 interfaceC10727s02) {
        if (interfaceC10727s0 == null || interfaceC10727s02 == null) {
            return true;
        }
        return m35853H(interfaceC10727s0, interfaceC10727s02);
    }

    /* renamed from: B */
    public static boolean m35850B(InterfaceC10573a interfaceC10573a, InterfaceC10573a interfaceC10573a2) {
        if (interfaceC10573a == null) {
            m35858a(67);
        }
        if (interfaceC10573a2 == null) {
            m35858a(68);
        }
        AbstractC10344e0 returnType = interfaceC10573a.getReturnType();
        AbstractC10344e0 returnType2 = interfaceC10573a2.getReturnType();
        if (!m35853H(interfaceC10573a, interfaceC10573a2)) {
            return false;
        }
        C10342d1 c10342d1M35869l = f39520b.m35869l(interfaceC10573a.getTypeParameters(), interfaceC10573a2.getTypeParameters());
        if (interfaceC10573a instanceof InterfaceC10738y) {
            return m35852G(interfaceC10573a, returnType, interfaceC10573a2, returnType2, c10342d1M35869l);
        }
        if (!(interfaceC10573a instanceof InterfaceC10729t0)) {
            throw new IllegalArgumentException("Unexpected callable: " + interfaceC10573a.getClass());
        }
        InterfaceC10729t0 interfaceC10729t0 = (InterfaceC10729t0) interfaceC10573a;
        InterfaceC10729t0 interfaceC10729t02 = (InterfaceC10729t0) interfaceC10573a2;
        if (m35849A(interfaceC10729t0.getSetter(), interfaceC10729t02.getSetter())) {
            return (interfaceC10729t0.mo37031j0() && interfaceC10729t02.mo37031j0()) ? C10346f.f40078a.m36654k(c10342d1M35869l, returnType.mo36635R0(), returnType2.mo36635R0()) : (interfaceC10729t0.mo37031j0() || !interfaceC10729t02.mo37031j0()) && m35852G(interfaceC10573a, returnType, interfaceC10573a2, returnType2, c10342d1M35869l);
        }
        return false;
    }

    /* renamed from: C */
    private static boolean m35851C(InterfaceC10573a interfaceC10573a, Collection<InterfaceC10573a> collection) {
        if (interfaceC10573a == null) {
            m35858a(71);
        }
        if (collection == null) {
            m35858a(72);
        }
        Iterator<InterfaceC10573a> it = collection.iterator();
        while (it.hasNext()) {
            if (!m35850B(interfaceC10573a, it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: G */
    private static boolean m35852G(InterfaceC10573a interfaceC10573a, AbstractC10344e0 abstractC10344e0, InterfaceC10573a interfaceC10573a2, AbstractC10344e0 abstractC10344e02, C10342d1 c10342d1) {
        if (interfaceC10573a == null) {
            m35858a(73);
        }
        if (abstractC10344e0 == null) {
            m35858a(74);
        }
        if (interfaceC10573a2 == null) {
            m35858a(75);
        }
        if (abstractC10344e02 == null) {
            m35858a(76);
        }
        if (c10342d1 == null) {
            m35858a(77);
        }
        return C10346f.f40078a.m36657r(c10342d1, abstractC10344e0.mo36635R0(), abstractC10344e02.mo36635R0());
    }

    /* renamed from: H */
    private static boolean m35853H(InterfaceC10677q interfaceC10677q, InterfaceC10677q interfaceC10677q2) {
        if (interfaceC10677q == null) {
            m35858a(69);
        }
        if (interfaceC10677q2 == null) {
            m35858a(70);
        }
        Integer numM38129d = C10728t.m38129d(interfaceC10677q.getVisibility(), interfaceC10677q2.getVisibility());
        return numM38129d == null || numM38129d.intValue() >= 0;
    }

    /* renamed from: I */
    public static boolean m35854I(InterfaceC10580c0 interfaceC10580c0, InterfaceC10580c0 interfaceC10580c02, boolean z) {
        if (interfaceC10580c0 == null) {
            m35858a(57);
        }
        if (interfaceC10580c02 == null) {
            m35858a(58);
        }
        return !C10728t.m38132g(interfaceC10580c02.getVisibility()) && C10728t.m38133h(interfaceC10580c02, interfaceC10580c0, z);
    }

    /* renamed from: J */
    public static <D extends InterfaceC10573a> boolean m35855J(D d2, D d3, boolean z, boolean z2) {
        if (d2 == null) {
            m35858a(13);
        }
        if (d3 == null) {
            m35858a(14);
        }
        if (!d2.equals(d3) && C10185b.f39498a.m35776d(d2.mo37019a(), d3.mo37019a(), z, z2)) {
            return true;
        }
        InterfaceC10573a interfaceC10573aMo37019a = d3.mo37019a();
        Iterator it = C10187d.m35816d(d2).iterator();
        while (it.hasNext()) {
            if (C10185b.f39498a.m35776d(interfaceC10573aMo37019a, (InterfaceC10573a) it.next(), z, z2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: K */
    public static void m35856K(InterfaceC10576b interfaceC10576b, Function1<InterfaceC10576b, C10775u> function1) {
        AbstractC10730u abstractC10730u;
        if (interfaceC10576b == null) {
            m35858a(107);
        }
        for (InterfaceC10576b interfaceC10576b2 : interfaceC10576b.mo37027e()) {
            if (interfaceC10576b2.getVisibility() == C10728t.f41222g) {
                m35856K(interfaceC10576b2, function1);
            }
        }
        if (interfaceC10576b.getVisibility() != C10728t.f41222g) {
            return;
        }
        AbstractC10730u abstractC10730uM35865h = m35865h(interfaceC10576b);
        if (abstractC10730uM35865h == null) {
            if (function1 != null) {
                function1.invoke(interfaceC10576b);
            }
            abstractC10730u = C10728t.f41220e;
        } else {
            abstractC10730u = abstractC10730uM35865h;
        }
        if (interfaceC10576b instanceof C10642c0) {
            ((C10642c0) interfaceC10576b).m37795d1(abstractC10730u);
            Iterator<InterfaceC10727s0> it = ((InterfaceC10729t0) interfaceC10576b).mo37037x().iterator();
            while (it.hasNext()) {
                m35856K(it.next(), abstractC10730uM35865h == null ? null : function1);
            }
            return;
        }
        if (interfaceC10576b instanceof AbstractC10666p) {
            ((AbstractC10666p) interfaceC10576b).m37931k1(abstractC10730u);
            return;
        }
        AbstractC10640b0 abstractC10640b0 = (AbstractC10640b0) interfaceC10576b;
        abstractC10640b0.m37771P0(abstractC10730u);
        if (abstractC10730u != abstractC10640b0.mo37763B0().getVisibility()) {
            abstractC10640b0.m37769N0(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: L */
    public static <H> H m35857L(Collection<H> collection, Function1<H, InterfaceC10573a> function1) {
        if (collection == null) {
            m35858a(78);
        }
        if (function1 == 0) {
            m35858a(79);
        }
        if (collection.size() == 1) {
            H h2 = (H) C10813s.m38829T(collection);
            if (h2 == null) {
                m35858a(80);
            }
            return h2;
        }
        ArrayList arrayList = new ArrayList(2);
        List listM38604j0 = C10782c0.m38604j0(collection, function1);
        H h3 = (H) C10813s.m38829T(collection);
        InterfaceC10573a interfaceC10573a = (InterfaceC10573a) function1.invoke(h3);
        for (H h4 : collection) {
            InterfaceC10573a interfaceC10573a2 = (InterfaceC10573a) function1.invoke(h4);
            if (m35851C(interfaceC10573a2, listM38604j0)) {
                arrayList.add(h4);
            }
            if (m35850B(interfaceC10573a2, interfaceC10573a) && !m35850B(interfaceC10573a, interfaceC10573a2)) {
                h3 = h4;
            }
        }
        if (arrayList.isEmpty()) {
            if (h3 == null) {
                m35858a(81);
            }
            return h3;
        }
        if (arrayList.size() == 1) {
            H h5 = (H) C10813s.m38829T(arrayList);
            if (h5 == null) {
                m35858a(82);
            }
            return h5;
        }
        H h6 = null;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!C10335b0.m36583b(((InterfaceC10573a) function1.invoke(next)).getReturnType())) {
                h6 = next;
                break;
            }
        }
        if (h6 != null) {
            return h6;
        }
        H h7 = (H) C10813s.m38829T(arrayList);
        if (h7 == null) {
            m35858a(84);
        }
        return h7;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058 A[FALL_THROUGH] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m35858a(int r24) {
        /*
            Method dump skipped, instructions count: 1322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p400i.C10193j.m35858a(int):void");
    }

    /* renamed from: b */
    private static boolean m35859b(Collection<InterfaceC10576b> collection) {
        if (collection == null) {
            m35858a(63);
        }
        if (collection.size() < 2) {
            return true;
        }
        return C10782c0.m38573I(collection, new c(collection.iterator().next().mo32876b()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        r1.remove();
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m35860c(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1 r4, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1 r5, kotlin.reflect.p371y.internal.p374j0.p415l.C10342d1 r6) {
        /*
            if (r4 != 0) goto L7
            r0 = 49
            m35858a(r0)
        L7:
            if (r5 != 0) goto Le
            r0 = 50
            m35858a(r0)
        Le:
            if (r6 != 0) goto L15
            r0 = 51
            m35858a(r0)
        L15:
            java.util.List r4 = r4.getUpperBounds()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r5 = r5.getUpperBounds()
            r0.<init>(r5)
            int r5 = r4.size()
            int r1 = r0.size()
            r2 = 0
            if (r5 == r1) goto L2e
            return r2
        L2e:
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L59
            java.lang.Object r5 = r4.next()
            kotlin.f0.y.e.j0.l.e0 r5 = (kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0) r5
            java.util.ListIterator r1 = r0.listIterator()
        L42:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L58
            java.lang.Object r3 = r1.next()
            kotlin.f0.y.e.j0.l.e0 r3 = (kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0) r3
            boolean r3 = m35861d(r5, r3, r6)
            if (r3 == 0) goto L42
            r1.remove()
            goto L32
        L58:
            return r2
        L59:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p400i.C10193j.m35860c(kotlin.reflect.jvm.internal.impl.descriptors.e1, kotlin.reflect.jvm.internal.impl.descriptors.e1, kotlin.f0.y.e.j0.l.d1):boolean");
    }

    /* renamed from: d */
    private static boolean m35861d(AbstractC10344e0 abstractC10344e0, AbstractC10344e0 abstractC10344e02, C10342d1 c10342d1) {
        if (abstractC10344e0 == null) {
            m35858a(46);
        }
        if (abstractC10344e02 == null) {
            m35858a(47);
        }
        if (c10342d1 == null) {
            m35858a(48);
        }
        if (C10350g0.m36706a(abstractC10344e0) && C10350g0.m36706a(abstractC10344e02)) {
            return true;
        }
        return C10346f.f40078a.m36654k(c10342d1, abstractC10344e0.mo36635R0(), abstractC10344e02.mo36635R0());
    }

    /* renamed from: e */
    private static i m35862e(InterfaceC10573a interfaceC10573a, InterfaceC10573a interfaceC10573a2) {
        if ((interfaceC10573a.mo37032m0() == null) != (interfaceC10573a2.mo37032m0() == null)) {
            return i.m35896d("Receiver presence mismatch");
        }
        if (interfaceC10573a.mo37028f().size() != interfaceC10573a2.mo37028f().size()) {
            return i.m35896d("Value parameter number mismatch");
        }
        return null;
    }

    /* renamed from: f */
    private static void m35863f(InterfaceC10576b interfaceC10576b, Set<InterfaceC10576b> set) {
        if (interfaceC10576b == null) {
            m35858a(17);
        }
        if (set == null) {
            m35858a(18);
        }
        if (interfaceC10576b.mo37030i().m37667g()) {
            set.add(interfaceC10576b);
            return;
        }
        if (interfaceC10576b.mo37027e().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + interfaceC10576b);
        }
        Iterator<? extends InterfaceC10576b> it = interfaceC10576b.mo37027e().iterator();
        while (it.hasNext()) {
            m35863f(it.next(), set);
        }
    }

    /* renamed from: g */
    private static List<AbstractC10344e0> m35864g(InterfaceC10573a interfaceC10573a) {
        InterfaceC10735w0 interfaceC10735w0Mo37032m0 = interfaceC10573a.mo37032m0();
        ArrayList arrayList = new ArrayList();
        if (interfaceC10735w0Mo37032m0 != null) {
            arrayList.add(interfaceC10735w0Mo37032m0.getType());
        }
        Iterator<InterfaceC10599i1> it = interfaceC10573a.mo37028f().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getType());
        }
        return arrayList;
    }

    /* renamed from: h */
    private static AbstractC10730u m35865h(InterfaceC10576b interfaceC10576b) {
        if (interfaceC10576b == null) {
            m35858a(108);
        }
        Collection<? extends InterfaceC10576b> collectionMo37027e = interfaceC10576b.mo37027e();
        AbstractC10730u abstractC10730uM35878u = m35878u(collectionMo37027e);
        if (abstractC10730uM35878u == null) {
            return null;
        }
        if (interfaceC10576b.mo37030i() != InterfaceC10576b.a.FAKE_OVERRIDE) {
            return abstractC10730uM35878u.mo38009f();
        }
        for (InterfaceC10576b interfaceC10576b2 : collectionMo37027e) {
            if (interfaceC10576b2.mo32879j() != EnumC10583d0.ABSTRACT && !interfaceC10576b2.getVisibility().equals(abstractC10730uM35878u)) {
                return null;
            }
        }
        return abstractC10730uM35878u;
    }

    /* renamed from: i */
    public static C10193j m35866i(AbstractC10396g abstractC10396g, InterfaceC10394e.a aVar) {
        if (abstractC10396g == null) {
            m35858a(3);
        }
        if (aVar == null) {
            m35858a(4);
        }
        return new C10193j(aVar, abstractC10396g, AbstractC10395f.a.f40182a, null);
    }

    /* renamed from: j */
    private static void m35867j(Collection<InterfaceC10576b> collection, InterfaceC10585e interfaceC10585e, AbstractC10192i abstractC10192i) {
        if (collection == null) {
            m35858a(85);
        }
        if (interfaceC10585e == null) {
            m35858a(86);
        }
        if (abstractC10192i == null) {
            m35858a(87);
        }
        Collection<InterfaceC10576b> collectionM35877t = m35877t(interfaceC10585e, collection);
        boolean zIsEmpty = collectionM35877t.isEmpty();
        if (!zIsEmpty) {
            collection = collectionM35877t;
        }
        InterfaceC10576b interfaceC10576bMo36990k0 = ((InterfaceC10576b) m35857L(collection, new d())).mo36990k0(interfaceC10585e, m35871n(collection, interfaceC10585e), zIsEmpty ? C10728t.f41223h : C10728t.f41222g, InterfaceC10576b.a.FAKE_OVERRIDE, false);
        abstractC10192i.mo33155d(interfaceC10576bMo36990k0, collection);
        abstractC10192i.mo33154a(interfaceC10576bMo36990k0);
    }

    /* renamed from: k */
    private static void m35868k(InterfaceC10585e interfaceC10585e, Collection<InterfaceC10576b> collection, AbstractC10192i abstractC10192i) {
        if (interfaceC10585e == null) {
            m35858a(64);
        }
        if (collection == null) {
            m35858a(65);
        }
        if (abstractC10192i == null) {
            m35858a(66);
        }
        if (m35859b(collection)) {
            Iterator<InterfaceC10576b> it = collection.iterator();
            while (it.hasNext()) {
                m35867j(Collections.singleton(it.next()), interfaceC10585e, abstractC10192i);
            }
        } else {
            LinkedList linkedList = new LinkedList(collection);
            while (!linkedList.isEmpty()) {
                m35867j(m35874q(C10199p.m35990a(linkedList), linkedList, abstractC10192i), interfaceC10585e, abstractC10192i);
            }
        }
    }

    /* renamed from: l */
    private C10342d1 m35869l(List<InterfaceC10587e1> list, List<InterfaceC10587e1> list2) {
        if (list == null) {
            m35858a(42);
        }
        if (list2 == null) {
            m35858a(43);
        }
        if (list.isEmpty()) {
            C10342d1 c10342d1M35914H0 = new C10194k(null, this.f39524f, this.f39522d, this.f39523e, this.f39525g).m35914H0(true, true);
            if (c10342d1M35914H0 == null) {
                m35858a(44);
            }
            return c10342d1M35914H0;
        }
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < list.size(); i2++) {
            map.put(list.get(i2).mo32877h(), list2.get(i2).mo32877h());
        }
        C10342d1 c10342d1M35914H02 = new C10194k(map, this.f39524f, this.f39522d, this.f39523e, this.f39525g).m35914H0(true, true);
        if (c10342d1M35914H02 == null) {
            m35858a(45);
        }
        return c10342d1M35914H02;
    }

    /* renamed from: m */
    public static C10193j m35870m(AbstractC10396g abstractC10396g) {
        if (abstractC10396g == null) {
            m35858a(0);
        }
        return new C10193j(f39521c, abstractC10396g, AbstractC10395f.a.f40182a, null);
    }

    /* renamed from: n */
    private static EnumC10583d0 m35871n(Collection<InterfaceC10576b> collection, InterfaceC10585e interfaceC10585e) {
        if (collection == null) {
            m35858a(88);
        }
        if (interfaceC10585e == null) {
            m35858a(89);
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (InterfaceC10576b interfaceC10576b : collection) {
            int i2 = h.f39532c[interfaceC10576b.mo32879j().ordinal()];
            if (i2 == 1) {
                EnumC10583d0 enumC10583d0 = EnumC10583d0.FINAL;
                if (enumC10583d0 == null) {
                    m35858a(90);
                }
                return enumC10583d0;
            }
            if (i2 == 2) {
                throw new IllegalStateException("Member cannot have SEALED modality: " + interfaceC10576b);
            }
            if (i2 == 3) {
                z2 = true;
            } else if (i2 == 4) {
                z3 = true;
            }
        }
        if (interfaceC10585e.mo32863M() && interfaceC10585e.mo32879j() != EnumC10583d0.ABSTRACT && interfaceC10585e.mo32879j() != EnumC10583d0.SEALED) {
            z = true;
        }
        if (z2 && !z3) {
            EnumC10583d0 enumC10583d02 = EnumC10583d0.OPEN;
            if (enumC10583d02 == null) {
                m35858a(91);
            }
            return enumC10583d02;
        }
        if (!z2 && z3) {
            EnumC10583d0 enumC10583d0Mo32879j = z ? interfaceC10585e.mo32879j() : EnumC10583d0.ABSTRACT;
            if (enumC10583d0Mo32879j == null) {
                m35858a(92);
            }
            return enumC10583d0Mo32879j;
        }
        HashSet hashSet = new HashSet();
        Iterator<InterfaceC10576b> it = collection.iterator();
        while (it.hasNext()) {
            hashSet.addAll(m35882z(it.next()));
        }
        return m35881y(m35875r(hashSet), z, interfaceC10585e.mo32879j());
    }

    /* renamed from: o */
    private Collection<InterfaceC10576b> m35872o(InterfaceC10576b interfaceC10576b, Collection<? extends InterfaceC10576b> collection, InterfaceC10585e interfaceC10585e, AbstractC10192i abstractC10192i) {
        if (interfaceC10576b == null) {
            m35858a(59);
        }
        if (collection == null) {
            m35858a(60);
        }
        if (interfaceC10585e == null) {
            m35858a(61);
        }
        if (abstractC10192i == null) {
            m35858a(62);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        C10772f c10772fM38540c = C10772f.m38540c();
        for (InterfaceC10576b interfaceC10576b2 : collection) {
            i.a aVarM35898c = m35883D(interfaceC10576b2, interfaceC10576b, interfaceC10585e).m35898c();
            boolean zM35854I = m35854I(interfaceC10576b, interfaceC10576b2, false);
            int i2 = h.f39531b[aVarM35898c.ordinal()];
            if (i2 == 1) {
                if (zM35854I) {
                    c10772fM38540c.add(interfaceC10576b2);
                }
                arrayList.add(interfaceC10576b2);
            } else if (i2 == 2) {
                if (zM35854I) {
                    abstractC10192i.mo35848c(interfaceC10576b2, interfaceC10576b);
                }
                arrayList.add(interfaceC10576b2);
            }
        }
        abstractC10192i.mo33155d(interfaceC10576b, c10772fM38540c);
        return arrayList;
    }

    /* renamed from: p */
    public static <H> Collection<H> m35873p(H h2, Collection<H> collection, Function1<H, InterfaceC10573a> function1, Function1<H, C10775u> function12) {
        if (h2 == null) {
            m35858a(99);
        }
        if (collection == null) {
            m35858a(100);
        }
        if (function1 == null) {
            m35858a(101);
        }
        if (function12 == null) {
            m35858a(102);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(h2);
        InterfaceC10573a interfaceC10573aInvoke = function1.invoke(h2);
        Iterator<H> it = collection.iterator();
        while (it.hasNext()) {
            H next = it.next();
            InterfaceC10573a interfaceC10573aInvoke2 = function1.invoke(next);
            if (h2 == next) {
                it.remove();
            } else {
                i.a aVarM35880x = m35880x(interfaceC10573aInvoke, interfaceC10573aInvoke2);
                if (aVarM35880x == i.a.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (aVarM35880x == i.a.CONFLICT) {
                    function12.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    /* renamed from: q */
    private static Collection<InterfaceC10576b> m35874q(InterfaceC10576b interfaceC10576b, Queue<InterfaceC10576b> queue, AbstractC10192i abstractC10192i) {
        if (interfaceC10576b == null) {
            m35858a(104);
        }
        if (queue == null) {
            m35858a(105);
        }
        if (abstractC10192i == null) {
            m35858a(106);
        }
        return m35873p(interfaceC10576b, queue, new f(), new g(abstractC10192i, interfaceC10576b));
    }

    /* renamed from: r */
    public static <D extends InterfaceC10573a> Set<D> m35875r(Set<D> set) {
        if (set == null) {
            m35858a(8);
        }
        return m35876s(set, !set.isEmpty() && C10235a.m36083q(C10235a.m36078l(set.iterator().next())), null, new b());
    }

    /* renamed from: s */
    public static <D> Set<D> m35876s(Set<D> set, boolean z, Function0<?> function0, Function2<? super D, ? super D, Pair<InterfaceC10573a, InterfaceC10573a>> function2) {
        if (set == null) {
            m35858a(9);
        }
        if (function2 == null) {
            m35858a(10);
        }
        if (set.size() <= 1) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (function0 != null) {
                function0.invoke();
            }
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(obj);
                    break;
                }
                Pair<InterfaceC10573a, InterfaceC10573a> pairInvoke = function2.invoke(obj, (Object) it.next());
                InterfaceC10573a interfaceC10573aM37646a = pairInvoke.m37646a();
                InterfaceC10573a interfaceC10573aM37647b = pairInvoke.m37647b();
                if (!m35855J(interfaceC10573aM37646a, interfaceC10573aM37647b, z, true)) {
                    if (m35855J(interfaceC10573aM37647b, interfaceC10573aM37646a, z, true)) {
                        break;
                    }
                } else {
                    it.remove();
                }
            }
        }
        return linkedHashSet;
    }

    /* renamed from: t */
    private static Collection<InterfaceC10576b> m35877t(InterfaceC10585e interfaceC10585e, Collection<InterfaceC10576b> collection) {
        if (interfaceC10585e == null) {
            m35858a(96);
        }
        if (collection == null) {
            m35858a(97);
        }
        List listM38585Q = C10782c0.m38585Q(collection, new e(interfaceC10585e));
        if (listM38585Q == null) {
            m35858a(98);
        }
        return listM38585Q;
    }

    /* renamed from: u */
    public static AbstractC10730u m35878u(Collection<? extends InterfaceC10576b> collection) {
        AbstractC10730u abstractC10730u;
        if (collection == null) {
            m35858a(109);
        }
        if (collection.isEmpty()) {
            return C10728t.f41227l;
        }
        Iterator<? extends InterfaceC10576b> it = collection.iterator();
        loop0: while (true) {
            abstractC10730u = null;
            while (it.hasNext()) {
                AbstractC10730u visibility = it.next().getVisibility();
                if (abstractC10730u != null) {
                    Integer numM38129d = C10728t.m38129d(visibility, abstractC10730u);
                    if (numM38129d == null) {
                        break;
                    }
                    if (numM38129d.intValue() > 0) {
                    }
                }
                abstractC10730u = visibility;
            }
        }
        if (abstractC10730u == null) {
            return null;
        }
        Iterator<? extends InterfaceC10576b> it2 = collection.iterator();
        while (it2.hasNext()) {
            Integer numM38129d2 = C10728t.m38129d(abstractC10730u, it2.next().getVisibility());
            if (numM38129d2 == null || numM38129d2.intValue() < 0) {
                return null;
            }
        }
        return abstractC10730u;
    }

    /* renamed from: w */
    public static i m35879w(InterfaceC10573a interfaceC10573a, InterfaceC10573a interfaceC10573a2) {
        boolean z;
        if (interfaceC10573a == null) {
            m35858a(40);
        }
        if (interfaceC10573a2 == null) {
            m35858a(41);
        }
        boolean z2 = interfaceC10573a instanceof InterfaceC10738y;
        if ((z2 && !(interfaceC10573a2 instanceof InterfaceC10738y)) || (((z = interfaceC10573a instanceof InterfaceC10729t0)) && !(interfaceC10573a2 instanceof InterfaceC10729t0))) {
            return i.m35896d("Member kind mismatch");
        }
        if (!z2 && !z) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + interfaceC10573a);
        }
        if (!interfaceC10573a.getName().equals(interfaceC10573a2.getName())) {
            return i.m35896d("Name mismatch");
        }
        i iVarM35862e = m35862e(interfaceC10573a, interfaceC10573a2);
        if (iVarM35862e != null) {
            return iVarM35862e;
        }
        return null;
    }

    /* renamed from: x */
    public static i.a m35880x(InterfaceC10573a interfaceC10573a, InterfaceC10573a interfaceC10573a2) {
        C10193j c10193j = f39520b;
        i.a aVarM35898c = c10193j.m35883D(interfaceC10573a2, interfaceC10573a, null).m35898c();
        i.a aVarM35898c2 = c10193j.m35883D(interfaceC10573a, interfaceC10573a2, null).m35898c();
        i.a aVar = i.a.OVERRIDABLE;
        if (aVarM35898c == aVar && aVarM35898c2 == aVar) {
            return aVar;
        }
        i.a aVar2 = i.a.CONFLICT;
        return (aVarM35898c == aVar2 || aVarM35898c2 == aVar2) ? aVar2 : i.a.INCOMPATIBLE;
    }

    /* renamed from: y */
    private static EnumC10583d0 m35881y(Collection<InterfaceC10576b> collection, boolean z, EnumC10583d0 enumC10583d0) {
        if (collection == null) {
            m35858a(93);
        }
        if (enumC10583d0 == null) {
            m35858a(94);
        }
        EnumC10583d0 enumC10583d02 = EnumC10583d0.ABSTRACT;
        for (InterfaceC10576b interfaceC10576b : collection) {
            EnumC10583d0 enumC10583d0Mo32879j = (z && interfaceC10576b.mo32879j() == EnumC10583d0.ABSTRACT) ? enumC10583d0 : interfaceC10576b.mo32879j();
            if (enumC10583d0Mo32879j.compareTo(enumC10583d02) < 0) {
                enumC10583d02 = enumC10583d0Mo32879j;
            }
        }
        if (enumC10583d02 == null) {
            m35858a(95);
        }
        return enumC10583d02;
    }

    /* renamed from: z */
    public static Set<InterfaceC10576b> m35882z(InterfaceC10576b interfaceC10576b) {
        if (interfaceC10576b == null) {
            m35858a(15);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m35863f(interfaceC10576b, linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: D */
    public i m35883D(InterfaceC10573a interfaceC10573a, InterfaceC10573a interfaceC10573a2, InterfaceC10585e interfaceC10585e) {
        if (interfaceC10573a == null) {
            m35858a(19);
        }
        if (interfaceC10573a2 == null) {
            m35858a(20);
        }
        i iVarM35884E = m35884E(interfaceC10573a, interfaceC10573a2, interfaceC10585e, false);
        if (iVarM35884E == null) {
            m35858a(21);
        }
        return iVarM35884E;
    }

    /* renamed from: E */
    public i m35884E(InterfaceC10573a interfaceC10573a, InterfaceC10573a interfaceC10573a2, InterfaceC10585e interfaceC10585e, boolean z) {
        if (interfaceC10573a == null) {
            m35858a(22);
        }
        if (interfaceC10573a2 == null) {
            m35858a(23);
        }
        i iVarM35885F = m35885F(interfaceC10573a, interfaceC10573a2, z);
        boolean z2 = iVarM35885F.m35898c() == i.a.OVERRIDABLE;
        for (InterfaceC10188e interfaceC10188e : f39519a) {
            if (interfaceC10188e.mo33227a() != InterfaceC10188e.a.CONFLICTS_ONLY && (!z2 || interfaceC10188e.mo33227a() != InterfaceC10188e.a.SUCCESS_ONLY)) {
                int i2 = h.f39530a[interfaceC10188e.mo33228b(interfaceC10573a, interfaceC10573a2, interfaceC10585e).ordinal()];
                if (i2 == 1) {
                    z2 = true;
                } else {
                    if (i2 == 2) {
                        i iVarM35895b = i.m35895b("External condition failed");
                        if (iVarM35895b == null) {
                            m35858a(24);
                        }
                        return iVarM35895b;
                    }
                    if (i2 == 3) {
                        i iVarM35896d = i.m35896d("External condition");
                        if (iVarM35896d == null) {
                            m35858a(25);
                        }
                        return iVarM35896d;
                    }
                }
            }
        }
        if (!z2) {
            return iVarM35885F;
        }
        for (InterfaceC10188e interfaceC10188e2 : f39519a) {
            if (interfaceC10188e2.mo33227a() == InterfaceC10188e.a.CONFLICTS_ONLY) {
                int i3 = h.f39530a[interfaceC10188e2.mo33228b(interfaceC10573a, interfaceC10573a2, interfaceC10585e).ordinal()];
                if (i3 == 1) {
                    throw new IllegalStateException("Contract violation in " + interfaceC10188e2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (i3 == 2) {
                    i iVarM35895b2 = i.m35895b("External condition failed");
                    if (iVarM35895b2 == null) {
                        m35858a(27);
                    }
                    return iVarM35895b2;
                }
                if (i3 == 3) {
                    i iVarM35896d2 = i.m35896d("External condition");
                    if (iVarM35896d2 == null) {
                        m35858a(28);
                    }
                    return iVarM35896d2;
                }
            }
        }
        i iVarM35897e = i.m35897e();
        if (iVarM35897e == null) {
            m35858a(29);
        }
        return iVarM35897e;
    }

    /* renamed from: F */
    public i m35885F(InterfaceC10573a interfaceC10573a, InterfaceC10573a interfaceC10573a2, boolean z) {
        if (interfaceC10573a == null) {
            m35858a(30);
        }
        if (interfaceC10573a2 == null) {
            m35858a(31);
        }
        i iVarM35879w = m35879w(interfaceC10573a, interfaceC10573a2);
        if (iVarM35879w != null) {
            return iVarM35879w;
        }
        List<AbstractC10344e0> listM35864g = m35864g(interfaceC10573a);
        List<AbstractC10344e0> listM35864g2 = m35864g(interfaceC10573a2);
        List<InterfaceC10587e1> typeParameters = interfaceC10573a.getTypeParameters();
        List<InterfaceC10587e1> typeParameters2 = interfaceC10573a2.getTypeParameters();
        int i2 = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (i2 < listM35864g.size()) {
                if (!InterfaceC10394e.f40181a.mo36919b(listM35864g.get(i2), listM35864g2.get(i2))) {
                    i iVarM35896d = i.m35896d("Type parameter number mismatch");
                    if (iVarM35896d == null) {
                        m35858a(33);
                    }
                    return iVarM35896d;
                }
                i2++;
            }
            i iVarM35895b = i.m35895b("Type parameter number mismatch");
            if (iVarM35895b == null) {
                m35858a(34);
            }
            return iVarM35895b;
        }
        C10342d1 c10342d1M35869l = m35869l(typeParameters, typeParameters2);
        for (int i3 = 0; i3 < typeParameters.size(); i3++) {
            if (!m35860c(typeParameters.get(i3), typeParameters2.get(i3), c10342d1M35869l)) {
                i iVarM35896d2 = i.m35896d("Type parameter bounds mismatch");
                if (iVarM35896d2 == null) {
                    m35858a(35);
                }
                return iVarM35896d2;
            }
        }
        for (int i4 = 0; i4 < listM35864g.size(); i4++) {
            if (!m35861d(listM35864g.get(i4), listM35864g2.get(i4), c10342d1M35869l)) {
                i iVarM35896d3 = i.m35896d("Value parameter type mismatch");
                if (iVarM35896d3 == null) {
                    m35858a(36);
                }
                return iVarM35896d3;
            }
        }
        if ((interfaceC10573a instanceof InterfaceC10738y) && (interfaceC10573a2 instanceof InterfaceC10738y) && ((InterfaceC10738y) interfaceC10573a).isSuspend() != ((InterfaceC10738y) interfaceC10573a2).isSuspend()) {
            i iVarM35895b2 = i.m35895b("Incompatible suspendability");
            if (iVarM35895b2 == null) {
                m35858a(37);
            }
            return iVarM35895b2;
        }
        if (z) {
            AbstractC10344e0 returnType = interfaceC10573a.getReturnType();
            AbstractC10344e0 returnType2 = interfaceC10573a2.getReturnType();
            if (returnType != null && returnType2 != null) {
                if (C10350g0.m36706a(returnType2) && C10350g0.m36706a(returnType)) {
                    i2 = 1;
                }
                if (i2 == 0 && !C10346f.f40078a.m36657r(c10342d1M35869l, returnType2.mo36635R0(), returnType.mo36635R0())) {
                    i iVarM35895b3 = i.m35895b("Return type mismatch");
                    if (iVarM35895b3 == null) {
                        m35858a(38);
                    }
                    return iVarM35895b3;
                }
            }
        }
        i iVarM35897e = i.m35897e();
        if (iVarM35897e == null) {
            m35858a(39);
        }
        return iVarM35897e;
    }

    /* renamed from: v */
    public void m35886v(C10163f c10163f, Collection<? extends InterfaceC10576b> collection, Collection<? extends InterfaceC10576b> collection2, InterfaceC10585e interfaceC10585e, AbstractC10192i abstractC10192i) {
        if (c10163f == null) {
            m35858a(52);
        }
        if (collection == null) {
            m35858a(53);
        }
        if (collection2 == null) {
            m35858a(54);
        }
        if (interfaceC10585e == null) {
            m35858a(55);
        }
        if (abstractC10192i == null) {
            m35858a(56);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator<? extends InterfaceC10576b> it = collection2.iterator();
        while (it.hasNext()) {
            linkedHashSet.removeAll(m35872o(it.next(), collection, interfaceC10585e, abstractC10192i));
        }
        m35868k(interfaceC10585e, linkedHashSet, abstractC10192i);
    }
}
