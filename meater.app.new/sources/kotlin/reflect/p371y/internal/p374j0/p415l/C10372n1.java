package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10782c0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.utils.C10772f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10403n;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10424h;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10427k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10426j;

/* compiled from: TypeUtils.java */
/* renamed from: kotlin.f0.y.e.j0.l.n1 */
/* loaded from: classes3.dex */
public class C10372n1 {

    /* renamed from: a */
    public static final AbstractC10368m0 f40152a = C10427k.m37053d(EnumC10426j.f40282H, new String[0]);

    /* renamed from: b */
    public static final AbstractC10368m0 f40153b = C10427k.m37053d(EnumC10426j.f40268A, new String[0]);

    /* renamed from: c */
    public static final AbstractC10368m0 f40154c = new a("NO_EXPECTED_TYPE");

    /* renamed from: d */
    public static final AbstractC10368m0 f40155d = new a("UNIT_EXPECTED_TYPE");

    /* compiled from: TypeUtils.java */
    /* renamed from: kotlin.f0.y.e.j0.l.n1$a */
    public static class a extends AbstractC10382r {

        /* renamed from: g */
        private final String f40156g;

        public a(String str) {
            this.f40156g = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
        /* renamed from: a1 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ void m36790a1(int r9) {
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
                r5 = 3
                goto L14
            L13:
                r5 = 2
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p415l.C10372n1.a.m36790a1(int):void");
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
        /* renamed from: V0, reason: merged with bridge method [inline-methods] */
        public AbstractC10368m0 mo33545S0(boolean z) {
            throw new IllegalStateException(this.f40156g);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1
        /* renamed from: W0, reason: merged with bridge method [inline-methods] */
        public AbstractC10368m0 mo33547U0(C10333a1 c10333a1) {
            if (c10333a1 == null) {
                m36790a1(0);
            }
            throw new IllegalStateException(this.f40156g);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10382r
        /* renamed from: X0 */
        protected AbstractC10368m0 mo33694X0() {
            throw new IllegalStateException(this.f40156g);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10382r
        /* renamed from: Z0 */
        public AbstractC10382r mo33695Z0(AbstractC10368m0 abstractC10368m0) {
            if (abstractC10368m0 == null) {
                m36790a1(2);
            }
            throw new IllegalStateException(this.f40156g);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10382r
        /* renamed from: b1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public a mo36558Y0(AbstractC10396g abstractC10396g) {
            if (abstractC10396g == null) {
                m36790a1(3);
            }
            return this;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0
        public String toString() {
            String str = this.f40156g;
            if (str == null) {
                m36790a1(1);
            }
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0120  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m36768a(int r24) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p415l.C10372n1.m36768a(int):void");
    }

    /* renamed from: b */
    public static boolean m36769b(AbstractC10344e0 abstractC10344e0) {
        if (abstractC10344e0 == null) {
            m36768a(28);
        }
        if (abstractC10344e0.mo33691P0()) {
            return true;
        }
        return C10335b0.m36583b(abstractC10344e0) && m36769b(C10335b0.m36582a(abstractC10344e0).m37162X0());
    }

    /* renamed from: c */
    public static boolean m36770c(AbstractC10344e0 abstractC10344e0, Function1<AbstractC10381q1, Boolean> function1) {
        if (function1 == null) {
            m36768a(43);
        }
        return m36771d(abstractC10344e0, function1, null);
    }

    /* renamed from: d */
    private static boolean m36771d(AbstractC10344e0 abstractC10344e0, Function1<AbstractC10381q1, Boolean> function1, C10772f<AbstractC10344e0> c10772f) {
        if (function1 == null) {
            m36768a(44);
        }
        if (abstractC10344e0 == null) {
            return false;
        }
        AbstractC10381q1 abstractC10381q1Mo36635R0 = abstractC10344e0.mo36635R0();
        if (m36789v(abstractC10344e0)) {
            return function1.invoke(abstractC10381q1Mo36635R0).booleanValue();
        }
        if (c10772f != null && c10772f.contains(abstractC10344e0)) {
            return false;
        }
        if (function1.invoke(abstractC10381q1Mo36635R0).booleanValue()) {
            return true;
        }
        if (c10772f == null) {
            c10772f = C10772f.m38540c();
        }
        c10772f.add(abstractC10344e0);
        AbstractC10458y abstractC10458y = abstractC10381q1Mo36635R0 instanceof AbstractC10458y ? (AbstractC10458y) abstractC10381q1Mo36635R0 : null;
        if (abstractC10458y != null && (m36771d(abstractC10458y.m37161W0(), function1, c10772f) || m36771d(abstractC10458y.m37162X0(), function1, c10772f))) {
            return true;
        }
        if ((abstractC10381q1Mo36635R0 instanceof C10376p) && m36771d(((C10376p) abstractC10381q1Mo36635R0).m36794a1(), function1, c10772f)) {
            return true;
        }
        InterfaceC10345e1 interfaceC10345e1Mo35993O0 = abstractC10344e0.mo35993O0();
        if (interfaceC10345e1Mo35993O0 instanceof C10341d0) {
            Iterator<AbstractC10344e0> it = ((C10341d0) interfaceC10345e1Mo35993O0).mo35998a().iterator();
            while (it.hasNext()) {
                if (m36771d(it.next(), function1, c10772f)) {
                    return true;
                }
            }
            return false;
        }
        for (InterfaceC10351g1 interfaceC10351g1 : abstractC10344e0.mo35991M0()) {
            if (!interfaceC10351g1.mo36710c()) {
                if (m36771d(interfaceC10351g1.getType(), function1, c10772f)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    public static AbstractC10344e0 m36772e(AbstractC10344e0 abstractC10344e0, AbstractC10344e0 abstractC10344e02, C10366l1 c10366l1) {
        if (abstractC10344e0 == null) {
            m36768a(20);
        }
        if (abstractC10344e02 == null) {
            m36768a(21);
        }
        if (c10366l1 == null) {
            m36768a(22);
        }
        AbstractC10344e0 abstractC10344e0M36759p = c10366l1.m36759p(abstractC10344e02, EnumC10384r1.INVARIANT);
        if (abstractC10344e0M36759p != null) {
            return m36784q(abstractC10344e0M36759p, abstractC10344e0.mo33691P0());
        }
        return null;
    }

    /* renamed from: f */
    public static InterfaceC10585e m36773f(AbstractC10344e0 abstractC10344e0) {
        if (abstractC10344e0 == null) {
            m36768a(30);
        }
        InterfaceC10594h interfaceC10594hMo32887c = abstractC10344e0.mo35993O0().mo32891w();
        if (interfaceC10594hMo32887c instanceof InterfaceC10585e) {
            return (InterfaceC10585e) interfaceC10594hMo32887c;
        }
        return null;
    }

    /* renamed from: g */
    public static List<InterfaceC10351g1> m36774g(List<InterfaceC10587e1> list) {
        if (list == null) {
            m36768a(16);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<InterfaceC10587e1> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C10357i1(it.next().mo36400s()));
        }
        List<InterfaceC10351g1> listM38569E0 = C10782c0.m38569E0(arrayList);
        if (listM38569E0 == null) {
            m36768a(17);
        }
        return listM38569E0;
    }

    /* renamed from: h */
    public static List<AbstractC10344e0> m36775h(AbstractC10344e0 abstractC10344e0) {
        if (abstractC10344e0 == null) {
            m36768a(18);
        }
        C10366l1 c10366l1M36746f = C10366l1.m36746f(abstractC10344e0);
        Collection<AbstractC10344e0> collectionMo35998a = abstractC10344e0.mo35993O0().mo35998a();
        ArrayList arrayList = new ArrayList(collectionMo35998a.size());
        Iterator<AbstractC10344e0> it = collectionMo35998a.iterator();
        while (it.hasNext()) {
            AbstractC10344e0 abstractC10344e0M36772e = m36772e(abstractC10344e0, it.next(), c10366l1M36746f);
            if (abstractC10344e0M36772e != null) {
                arrayList.add(abstractC10344e0M36772e);
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public static InterfaceC10587e1 m36776i(AbstractC10344e0 abstractC10344e0) {
        if (abstractC10344e0 == null) {
            m36768a(62);
        }
        if (abstractC10344e0.mo35993O0().mo32891w() instanceof InterfaceC10587e1) {
            return (InterfaceC10587e1) abstractC10344e0.mo35993O0().mo32891w();
        }
        return null;
    }

    /* renamed from: j */
    public static boolean m36777j(AbstractC10344e0 abstractC10344e0) {
        if (abstractC10344e0 == null) {
            m36768a(29);
        }
        if (abstractC10344e0.mo35993O0().mo32891w() instanceof InterfaceC10585e) {
            return false;
        }
        Iterator<AbstractC10344e0> it = m36775h(abstractC10344e0).iterator();
        while (it.hasNext()) {
            if (m36779l(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m36778k(AbstractC10344e0 abstractC10344e0) {
        return abstractC10344e0 != null && abstractC10344e0.mo35993O0() == f40152a.mo35993O0();
    }

    /* renamed from: l */
    public static boolean m36779l(AbstractC10344e0 abstractC10344e0) {
        if (abstractC10344e0 == null) {
            m36768a(27);
        }
        if (abstractC10344e0.mo33691P0()) {
            return true;
        }
        if (C10335b0.m36583b(abstractC10344e0) && m36779l(C10335b0.m36582a(abstractC10344e0).m37162X0())) {
            return true;
        }
        if (C10380q0.m36809c(abstractC10344e0)) {
            return false;
        }
        if (m36780m(abstractC10344e0)) {
            return m36777j(abstractC10344e0);
        }
        if (abstractC10344e0 instanceof AbstractC10343e) {
            InterfaceC10587e1 interfaceC10587e1M36954d = ((AbstractC10343e) abstractC10344e0).m36631X0().m36954d();
            return interfaceC10587e1M36954d == null || m36777j(interfaceC10587e1M36954d.mo36400s());
        }
        InterfaceC10345e1 interfaceC10345e1Mo35993O0 = abstractC10344e0.mo35993O0();
        if (interfaceC10345e1Mo35993O0 instanceof C10341d0) {
            Iterator<AbstractC10344e0> it = interfaceC10345e1Mo35993O0.mo35998a().iterator();
            while (it.hasNext()) {
                if (m36779l(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: m */
    public static boolean m36780m(AbstractC10344e0 abstractC10344e0) {
        if (abstractC10344e0 == null) {
            m36768a(59);
        }
        return m36776i(abstractC10344e0) != null || (abstractC10344e0.mo35993O0() instanceof InterfaceC10403n);
    }

    /* renamed from: n */
    public static AbstractC10344e0 m36781n(AbstractC10344e0 abstractC10344e0) {
        if (abstractC10344e0 == null) {
            m36768a(2);
        }
        return m36783p(abstractC10344e0, false);
    }

    /* renamed from: o */
    public static AbstractC10344e0 m36782o(AbstractC10344e0 abstractC10344e0) {
        if (abstractC10344e0 == null) {
            m36768a(1);
        }
        return m36783p(abstractC10344e0, true);
    }

    /* renamed from: p */
    public static AbstractC10344e0 m36783p(AbstractC10344e0 abstractC10344e0, boolean z) {
        if (abstractC10344e0 == null) {
            m36768a(3);
        }
        AbstractC10381q1 abstractC10381q1Mo33545S0 = abstractC10344e0.mo36635R0().mo33545S0(z);
        if (abstractC10381q1Mo33545S0 == null) {
            m36768a(4);
        }
        return abstractC10381q1Mo33545S0;
    }

    /* renamed from: q */
    public static AbstractC10344e0 m36784q(AbstractC10344e0 abstractC10344e0, boolean z) {
        if (abstractC10344e0 == null) {
            m36768a(8);
        }
        if (z) {
            return m36782o(abstractC10344e0);
        }
        if (abstractC10344e0 == null) {
            m36768a(9);
        }
        return abstractC10344e0;
    }

    /* renamed from: r */
    public static AbstractC10368m0 m36785r(AbstractC10368m0 abstractC10368m0, boolean z) {
        if (abstractC10368m0 == null) {
            m36768a(5);
        }
        if (!z) {
            if (abstractC10368m0 == null) {
                m36768a(7);
            }
            return abstractC10368m0;
        }
        AbstractC10368m0 abstractC10368m0Mo33545S0 = abstractC10368m0.mo33545S0(true);
        if (abstractC10368m0Mo33545S0 == null) {
            m36768a(6);
        }
        return abstractC10368m0Mo33545S0;
    }

    /* renamed from: s */
    public static InterfaceC10351g1 m36786s(InterfaceC10587e1 interfaceC10587e1) {
        if (interfaceC10587e1 == null) {
            m36768a(45);
        }
        return new C10386s0(interfaceC10587e1);
    }

    /* renamed from: t */
    public static AbstractC10368m0 m36787t(InterfaceC10594h interfaceC10594h, InterfaceC10251h interfaceC10251h, Function1<AbstractC10396g, AbstractC10368m0> function1) {
        if (!C10427k.m37054m(interfaceC10594h)) {
            return m36788u(interfaceC10594h.mo32877h(), interfaceC10251h, function1);
        }
        C10424h c10424hM37053d = C10427k.m37053d(EnumC10426j.f40280G, interfaceC10594h.toString());
        if (c10424hM37053d == null) {
            m36768a(11);
        }
        return c10424hM37053d;
    }

    /* renamed from: u */
    public static AbstractC10368m0 m36788u(InterfaceC10345e1 interfaceC10345e1, InterfaceC10251h interfaceC10251h, Function1<AbstractC10396g, AbstractC10368m0> function1) {
        if (interfaceC10345e1 == null) {
            m36768a(12);
        }
        if (interfaceC10251h == null) {
            m36768a(13);
        }
        if (function1 == null) {
            m36768a(14);
        }
        AbstractC10368m0 abstractC10368m0M36671k = C10347f0.m36671k(C10333a1.f40041g.m36577h(), interfaceC10345e1, m36774g(interfaceC10345e1.getParameters()), false, interfaceC10251h, function1);
        if (abstractC10368m0M36671k == null) {
            m36768a(15);
        }
        return abstractC10368m0M36671k;
    }

    /* renamed from: v */
    public static boolean m36789v(AbstractC10344e0 abstractC10344e0) {
        if (abstractC10344e0 == null) {
            m36768a(0);
        }
        return abstractC10344e0 == f40154c || abstractC10344e0 == f40155d;
    }
}
