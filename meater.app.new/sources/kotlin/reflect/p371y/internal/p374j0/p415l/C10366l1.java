package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.C10624k;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.C10625l;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.jvm.internal.impl.utils.C10769c;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9917k;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p401q.p402a.C10203d;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.C10399j;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10424h;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10427k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10426j;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10457a;
import kotlin.reflect.p371y.internal.p374j0.p415l.p421y1.C10461b;

/* compiled from: TypeSubstitutor.java */
/* renamed from: kotlin.f0.y.e.j0.l.l1 */
/* loaded from: classes3.dex */
public class C10366l1 {

    /* renamed from: a */
    public static final C10366l1 f40139a = m36747g(AbstractC10360j1.f40132b);

    /* renamed from: b */
    private final AbstractC10360j1 f40140b;

    /* compiled from: TypeSubstitutor.java */
    /* renamed from: kotlin.f0.y.e.j0.l.l1$a */
    static class a implements Function1<C10160c, Boolean> {
        a() {
        }

        /* renamed from: b */
        private static /* synthetic */ void m36762b(int i2) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(C10160c c10160c) {
            if (c10160c == null) {
                m36762b(0);
            }
            return Boolean.valueOf(!c10160c.equals(C9917k.a.f37550Q));
        }
    }

    /* compiled from: TypeSubstitutor.java */
    /* renamed from: kotlin.f0.y.e.j0.l.l1$b */
    static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f40141a;

        static {
            int[] iArr = new int[d.values().length];
            f40141a = iArr;
            try {
                iArr[d.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40141a[d.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40141a[d.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: TypeSubstitutor.java */
    /* renamed from: kotlin.f0.y.e.j0.l.l1$c */
    private static final class c extends Exception {
        public c(String str) {
            super(str);
        }
    }

    /* compiled from: TypeSubstitutor.java */
    /* renamed from: kotlin.f0.y.e.j0.l.l1$d */
    private enum d {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    protected C10366l1(AbstractC10360j1 abstractC10360j1) {
        if (abstractC10360j1 == null) {
            m36741a(7);
        }
        this.f40140b = abstractC10360j1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m36741a(int r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p415l.C10366l1.m36741a(int):void");
    }

    /* renamed from: b */
    private static void m36742b(int i2, InterfaceC10351g1 interfaceC10351g1, AbstractC10360j1 abstractC10360j1) {
        if (i2 <= 100) {
            return;
        }
        throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + m36751o(interfaceC10351g1) + "; substitution: " + m36751o(abstractC10360j1));
    }

    /* renamed from: c */
    public static EnumC10384r1 m36743c(EnumC10384r1 enumC10384r1, InterfaceC10351g1 interfaceC10351g1) {
        if (enumC10384r1 == null) {
            m36741a(35);
        }
        if (interfaceC10351g1 == null) {
            m36741a(36);
        }
        if (!interfaceC10351g1.mo36710c()) {
            return m36744d(enumC10384r1, interfaceC10351g1.mo36708a());
        }
        EnumC10384r1 enumC10384r12 = EnumC10384r1.OUT_VARIANCE;
        if (enumC10384r12 == null) {
            m36741a(37);
        }
        return enumC10384r12;
    }

    /* renamed from: d */
    public static EnumC10384r1 m36744d(EnumC10384r1 enumC10384r1, EnumC10384r1 enumC10384r12) {
        if (enumC10384r1 == null) {
            m36741a(38);
        }
        if (enumC10384r12 == null) {
            m36741a(39);
        }
        EnumC10384r1 enumC10384r13 = EnumC10384r1.INVARIANT;
        if (enumC10384r1 == enumC10384r13) {
            if (enumC10384r12 == null) {
                m36741a(40);
            }
            return enumC10384r12;
        }
        if (enumC10384r12 == enumC10384r13) {
            if (enumC10384r1 == null) {
                m36741a(41);
            }
            return enumC10384r1;
        }
        if (enumC10384r1 == enumC10384r12) {
            if (enumC10384r12 == null) {
                m36741a(42);
            }
            return enumC10384r12;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + enumC10384r1 + "' and projection kind '" + enumC10384r12 + "' cannot be combined");
    }

    /* renamed from: e */
    private static d m36745e(EnumC10384r1 enumC10384r1, EnumC10384r1 enumC10384r12) {
        EnumC10384r1 enumC10384r13 = EnumC10384r1.IN_VARIANCE;
        return (enumC10384r1 == enumC10384r13 && enumC10384r12 == EnumC10384r1.OUT_VARIANCE) ? d.OUT_IN_IN_POSITION : (enumC10384r1 == EnumC10384r1.OUT_VARIANCE && enumC10384r12 == enumC10384r13) ? d.IN_IN_OUT_POSITION : d.NO_CONFLICT;
    }

    /* renamed from: f */
    public static C10366l1 m36746f(AbstractC10344e0 abstractC10344e0) {
        if (abstractC10344e0 == null) {
            m36741a(6);
        }
        return m36747g(AbstractC10348f1.m36677i(abstractC10344e0.mo35993O0(), abstractC10344e0.mo35991M0()));
    }

    /* renamed from: g */
    public static C10366l1 m36747g(AbstractC10360j1 abstractC10360j1) {
        if (abstractC10360j1 == null) {
            m36741a(0);
        }
        return new C10366l1(abstractC10360j1);
    }

    /* renamed from: h */
    public static C10366l1 m36748h(AbstractC10360j1 abstractC10360j1, AbstractC10360j1 abstractC10360j12) {
        if (abstractC10360j1 == null) {
            m36741a(3);
        }
        if (abstractC10360j12 == null) {
            m36741a(4);
        }
        return m36747g(C10415u.m36983i(abstractC10360j1, abstractC10360j12));
    }

    /* renamed from: i */
    private static InterfaceC10620g m36749i(InterfaceC10620g interfaceC10620g) {
        if (interfaceC10620g == null) {
            m36741a(33);
        }
        return !interfaceC10620g.mo33270R0(C9917k.a.f37550Q) ? interfaceC10620g : new C10625l(interfaceC10620g, new a());
    }

    /* renamed from: l */
    private static InterfaceC10351g1 m36750l(AbstractC10344e0 abstractC10344e0, InterfaceC10351g1 interfaceC10351g1, InterfaceC10587e1 interfaceC10587e1, InterfaceC10351g1 interfaceC10351g12) {
        if (abstractC10344e0 == null) {
            m36741a(26);
        }
        if (interfaceC10351g1 == null) {
            m36741a(27);
        }
        if (interfaceC10351g12 == null) {
            m36741a(28);
        }
        if (!abstractC10344e0.getAnnotations().mo33270R0(C9917k.a.f37550Q)) {
            if (interfaceC10351g1 == null) {
                m36741a(29);
            }
            return interfaceC10351g1;
        }
        InterfaceC10345e1 interfaceC10345e1Mo35993O0 = interfaceC10351g1.getType().mo35993O0();
        if (!(interfaceC10345e1Mo35993O0 instanceof C10399j)) {
            return interfaceC10351g1;
        }
        InterfaceC10351g1 interfaceC10351g1Mo35997f = ((C10399j) interfaceC10345e1Mo35993O0).mo35997f();
        EnumC10384r1 enumC10384r1Mo36708a = interfaceC10351g1Mo35997f.mo36708a();
        d dVarM36745e = m36745e(interfaceC10351g12.mo36708a(), enumC10384r1Mo36708a);
        d dVar = d.OUT_IN_IN_POSITION;
        return dVarM36745e == dVar ? new C10357i1(interfaceC10351g1Mo35997f.getType()) : (interfaceC10587e1 != null && m36745e(interfaceC10587e1.mo37672n(), enumC10384r1Mo36708a) == dVar) ? new C10357i1(interfaceC10351g1Mo35997f.getType()) : interfaceC10351g1;
    }

    /* renamed from: o */
    private static String m36751o(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (C10769c.m38523a(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    /* renamed from: r */
    private InterfaceC10351g1 m36752r(InterfaceC10351g1 interfaceC10351g1, int i2) throws c {
        AbstractC10344e0 type = interfaceC10351g1.getType();
        EnumC10384r1 enumC10384r1Mo36708a = interfaceC10351g1.mo36708a();
        if (type.mo35993O0().mo32887c() instanceof InterfaceC10587e1) {
            return interfaceC10351g1;
        }
        AbstractC10368m0 abstractC10368m0M36808b = C10380q0.m36808b(type);
        AbstractC10344e0 abstractC10344e0M36759p = abstractC10368m0M36808b != null ? m36757m().m36759p(abstractC10368m0M36808b, EnumC10384r1.INVARIANT) : null;
        AbstractC10344e0 abstractC10344e0M36735b = C10363k1.m36735b(type, m36753s(type.mo35993O0().getParameters(), type.mo35991M0(), i2), this.f40140b.mo36727d(type.getAnnotations()));
        if ((abstractC10344e0M36735b instanceof AbstractC10368m0) && (abstractC10344e0M36759p instanceof AbstractC10368m0)) {
            abstractC10344e0M36735b = C10380q0.m36816j((AbstractC10368m0) abstractC10344e0M36735b, (AbstractC10368m0) abstractC10344e0M36759p);
        }
        return new C10357i1(enumC10384r1Mo36708a, abstractC10344e0M36735b);
    }

    /* renamed from: s */
    private List<InterfaceC10351g1> m36753s(List<InterfaceC10587e1> list, List<InterfaceC10351g1> list2, int i2) throws c {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z = false;
        for (int i3 = 0; i3 < list.size(); i3++) {
            InterfaceC10587e1 interfaceC10587e1 = list.get(i3);
            InterfaceC10351g1 interfaceC10351g1 = list2.get(i3);
            InterfaceC10351g1 interfaceC10351g1M36754u = m36754u(interfaceC10351g1, interfaceC10587e1, i2 + 1);
            int i4 = b.f40141a[m36745e(interfaceC10587e1.mo37672n(), interfaceC10351g1M36754u.mo36708a()).ordinal()];
            if (i4 == 1 || i4 == 2) {
                interfaceC10351g1M36754u = C10372n1.m36786s(interfaceC10587e1);
            } else if (i4 == 3) {
                EnumC10384r1 enumC10384r1Mo37672n = interfaceC10587e1.mo37672n();
                EnumC10384r1 enumC10384r1 = EnumC10384r1.INVARIANT;
                if (enumC10384r1Mo37672n != enumC10384r1 && !interfaceC10351g1M36754u.mo36710c()) {
                    interfaceC10351g1M36754u = new C10357i1(enumC10384r1, interfaceC10351g1M36754u.getType());
                }
            }
            if (interfaceC10351g1M36754u != interfaceC10351g1) {
                z = true;
            }
            arrayList.add(interfaceC10351g1M36754u);
        }
        return !z ? list2 : arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    private InterfaceC10351g1 m36754u(InterfaceC10351g1 interfaceC10351g1, InterfaceC10587e1 interfaceC10587e1, int i2) throws c {
        if (interfaceC10351g1 == null) {
            m36741a(18);
        }
        m36742b(i2, interfaceC10351g1, this.f40140b);
        if (interfaceC10351g1.mo36710c()) {
            return interfaceC10351g1;
        }
        AbstractC10344e0 type = interfaceC10351g1.getType();
        if (type instanceof InterfaceC10375o1) {
            InterfaceC10375o1 interfaceC10375o1 = (InterfaceC10375o1) type;
            AbstractC10381q1 abstractC10381q1Mo36566v = interfaceC10375o1.mo36566v();
            AbstractC10344e0 abstractC10344e0Mo36563H = interfaceC10375o1.mo36563H();
            InterfaceC10351g1 interfaceC10351g1M36754u = m36754u(new C10357i1(interfaceC10351g1.mo36708a(), abstractC10381q1Mo36566v), interfaceC10587e1, i2 + 1);
            return interfaceC10351g1M36754u.mo36710c() ? interfaceC10351g1M36754u : new C10357i1(interfaceC10351g1M36754u.mo36708a(), C10378p1.m36806d(interfaceC10351g1M36754u.getType().mo36635R0(), m36759p(abstractC10344e0Mo36563H, interfaceC10351g1.mo36708a())));
        }
        if (!C10432w.m37085a(type) && !(type.mo36635R0() instanceof InterfaceC10365l0)) {
            InterfaceC10351g1 interfaceC10351g1Mo33536e = this.f40140b.mo33536e(type);
            InterfaceC10351g1 interfaceC10351g1M36750l = interfaceC10351g1Mo33536e != null ? m36750l(type, interfaceC10351g1Mo33536e, interfaceC10587e1, interfaceC10351g1) : null;
            EnumC10384r1 enumC10384r1Mo36708a = interfaceC10351g1.mo36708a();
            if (interfaceC10351g1M36750l == null && C10335b0.m36583b(type) && !C10339c1.m36596b(type)) {
                AbstractC10458y abstractC10458yM36582a = C10335b0.m36582a(type);
                int i3 = i2 + 1;
                InterfaceC10351g1 interfaceC10351g1M36754u2 = m36754u(new C10357i1(enumC10384r1Mo36708a, abstractC10458yM36582a.m37161W0()), interfaceC10587e1, i3);
                InterfaceC10351g1 interfaceC10351g1M36754u3 = m36754u(new C10357i1(enumC10384r1Mo36708a, abstractC10458yM36582a.m37162X0()), interfaceC10587e1, i3);
                return (interfaceC10351g1M36754u2.getType() == abstractC10458yM36582a.m37161W0() && interfaceC10351g1M36754u3.getType() == abstractC10458yM36582a.m37162X0()) ? interfaceC10351g1 : new C10357i1(interfaceC10351g1M36754u2.mo36708a(), C10347f0.m36664d(C10363k1.m36734a(interfaceC10351g1M36754u2.getType()), C10363k1.m36734a(interfaceC10351g1M36754u3.getType())));
            }
            if (!AbstractC9914h.m32750m0(type) && !C10350g0.m36706a(type)) {
                if (interfaceC10351g1M36750l != null) {
                    d dVarM36745e = m36745e(enumC10384r1Mo36708a, interfaceC10351g1M36750l.mo36708a());
                    if (!C10203d.m36008d(type)) {
                        int i4 = b.f40141a[dVarM36745e.ordinal()];
                        if (i4 == 1) {
                            throw new c("Out-projection in in-position");
                        }
                        if (i4 == 2) {
                            return new C10357i1(EnumC10384r1.OUT_VARIANCE, type.mo35993O0().mo36004o().m32774I());
                        }
                    }
                    InterfaceC10370n interfaceC10370nM36595a = C10339c1.m36595a(type);
                    if (interfaceC10351g1M36750l.mo36710c()) {
                        return interfaceC10351g1M36750l;
                    }
                    AbstractC10344e0 abstractC10344e0Mo33690K = interfaceC10370nM36595a != null ? interfaceC10370nM36595a.mo33690K(interfaceC10351g1M36750l.getType()) : C10372n1.m36784q(interfaceC10351g1M36750l.getType(), type.mo33691P0());
                    if (!type.getAnnotations().isEmpty()) {
                        abstractC10344e0Mo33690K = C10457a.m37155u(abstractC10344e0Mo33690K, new C10624k(abstractC10344e0Mo33690K.getAnnotations(), m36749i(this.f40140b.mo36727d(type.getAnnotations()))));
                    }
                    if (dVarM36745e == d.NO_CONFLICT) {
                        enumC10384r1Mo36708a = m36744d(enumC10384r1Mo36708a, interfaceC10351g1M36750l.mo36708a());
                    }
                    return new C10357i1(enumC10384r1Mo36708a, abstractC10344e0Mo33690K);
                }
                interfaceC10351g1 = m36752r(interfaceC10351g1, i2);
                if (interfaceC10351g1 == null) {
                    m36741a(25);
                }
            }
        }
        return interfaceC10351g1;
    }

    /* renamed from: j */
    public AbstractC10360j1 m36755j() {
        AbstractC10360j1 abstractC10360j1 = this.f40140b;
        if (abstractC10360j1 == null) {
            m36741a(8);
        }
        return abstractC10360j1;
    }

    /* renamed from: k */
    public boolean m36756k() {
        return this.f40140b.mo33537f();
    }

    /* renamed from: m */
    public C10366l1 m36757m() {
        AbstractC10360j1 abstractC10360j1 = this.f40140b;
        return ((abstractC10360j1 instanceof C10338c0) && abstractC10360j1.mo36012b()) ? new C10366l1(new C10338c0(((C10338c0) this.f40140b).m36594j(), ((C10338c0) this.f40140b).m36593i(), false)) : this;
    }

    /* renamed from: n */
    public AbstractC10344e0 m36758n(AbstractC10344e0 abstractC10344e0, EnumC10384r1 enumC10384r1) {
        if (abstractC10344e0 == null) {
            m36741a(9);
        }
        if (enumC10384r1 == null) {
            m36741a(10);
        }
        if (m36756k()) {
            if (abstractC10344e0 == null) {
                m36741a(11);
            }
            return abstractC10344e0;
        }
        try {
            AbstractC10344e0 type = m36754u(new C10357i1(enumC10384r1, abstractC10344e0), null, 0).getType();
            if (type == null) {
                m36741a(12);
            }
            return type;
        } catch (c e2) {
            C10424h c10424hM37053d = C10427k.m37053d(EnumC10426j.f40280G, e2.getMessage());
            if (c10424hM37053d == null) {
                m36741a(13);
            }
            return c10424hM37053d;
        }
    }

    /* renamed from: p */
    public AbstractC10344e0 m36759p(AbstractC10344e0 abstractC10344e0, EnumC10384r1 enumC10384r1) {
        if (abstractC10344e0 == null) {
            m36741a(14);
        }
        if (enumC10384r1 == null) {
            m36741a(15);
        }
        InterfaceC10351g1 interfaceC10351g1M36760q = m36760q(new C10357i1(enumC10384r1, m36755j().mo36728g(abstractC10344e0, enumC10384r1)));
        if (interfaceC10351g1M36760q == null) {
            return null;
        }
        return interfaceC10351g1M36760q.getType();
    }

    /* renamed from: q */
    public InterfaceC10351g1 m36760q(InterfaceC10351g1 interfaceC10351g1) {
        if (interfaceC10351g1 == null) {
            m36741a(16);
        }
        InterfaceC10351g1 interfaceC10351g1M36761t = m36761t(interfaceC10351g1);
        return (this.f40140b.mo36685a() || this.f40140b.mo36012b()) ? C10461b.m37169c(interfaceC10351g1M36761t, this.f40140b.mo36012b()) : interfaceC10351g1M36761t;
    }

    /* renamed from: t */
    public InterfaceC10351g1 m36761t(InterfaceC10351g1 interfaceC10351g1) {
        if (interfaceC10351g1 == null) {
            m36741a(17);
        }
        if (m36756k()) {
            return interfaceC10351g1;
        }
        try {
            return m36754u(interfaceC10351g1, null, 0);
        } catch (c unused) {
            return null;
        }
    }
}
