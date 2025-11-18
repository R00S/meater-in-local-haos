package kotlin.reflect.p371y.internal.p374j0.p400i.p403r;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.C10550i;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10782c0;
import kotlin.collections.C10815t;
import kotlin.collections.C10817u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10333a1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10347f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10357i1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10363k1;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;

/* compiled from: IntegerLiteralTypeConstructor.kt */
/* renamed from: kotlin.f0.y.e.j0.i.r.n */
/* loaded from: classes3.dex */
public final class C10218n implements InterfaceC10345e1 {

    /* renamed from: a */
    public static final a f39567a = new a(null);

    /* renamed from: b */
    private final long f39568b;

    /* renamed from: c */
    private final InterfaceC10592g0 f39569c;

    /* renamed from: d */
    private final Set<AbstractC10344e0> f39570d;

    /* renamed from: e */
    private final AbstractC10368m0 f39571e;

    /* renamed from: f */
    private final Lazy f39572f;

    /* compiled from: IntegerLiteralTypeConstructor.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.r.n$a */
    public static final class a {

        /* compiled from: IntegerLiteralTypeConstructor.kt */
        /* renamed from: kotlin.f0.y.e.j0.i.r.n$a$a, reason: collision with other inner class name */
        private enum EnumC11560a {
            COMMON_SUPER_TYPE,
            INTERSECTION_TYPE
        }

        /* compiled from: IntegerLiteralTypeConstructor.kt */
        /* renamed from: kotlin.f0.y.e.j0.i.r.n$a$b */
        public /* synthetic */ class b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f39576a;

            static {
                int[] iArr = new int[EnumC11560a.values().length];
                iArr[EnumC11560a.COMMON_SUPER_TYPE.ordinal()] = 1;
                iArr[EnumC11560a.INTERSECTION_TYPE.ordinal()] = 2;
                f39576a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        private final AbstractC10368m0 m36044a(Collection<? extends AbstractC10368m0> collection, EnumC11560a enumC11560a) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator<T> it = collection.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                AbstractC10368m0 abstractC10368m0 = (AbstractC10368m0) it.next();
                next = C10218n.f39567a.m36047e((AbstractC10368m0) next, abstractC10368m0, enumC11560a);
            }
            return (AbstractC10368m0) next;
        }

        /* renamed from: c */
        private final AbstractC10368m0 m36045c(C10218n c10218n, C10218n c10218n2, EnumC11560a enumC11560a) {
            Set setM38595a0;
            int i2 = b.f39576a[enumC11560a.ordinal()];
            if (i2 == 1) {
                setM38595a0 = C10782c0.m38595a0(c10218n.m36043k(), c10218n2.m36043k());
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                setM38595a0 = C10782c0.m38576J0(c10218n.m36043k(), c10218n2.m36043k());
            }
            return C10347f0.m36665e(C10333a1.f40041g.m36577h(), new C10218n(c10218n.f39568b, c10218n.f39569c, setM38595a0, null), false);
        }

        /* renamed from: d */
        private final AbstractC10368m0 m36046d(C10218n c10218n, AbstractC10368m0 abstractC10368m0) {
            if (c10218n.m36043k().contains(abstractC10368m0)) {
                return abstractC10368m0;
            }
            return null;
        }

        /* renamed from: e */
        private final AbstractC10368m0 m36047e(AbstractC10368m0 abstractC10368m0, AbstractC10368m0 abstractC10368m02, EnumC11560a enumC11560a) {
            if (abstractC10368m0 == null || abstractC10368m02 == null) {
                return null;
            }
            InterfaceC10345e1 interfaceC10345e1Mo35993O0 = abstractC10368m0.mo35993O0();
            InterfaceC10345e1 interfaceC10345e1Mo35993O02 = abstractC10368m02.mo35993O0();
            boolean z = interfaceC10345e1Mo35993O0 instanceof C10218n;
            if (z && (interfaceC10345e1Mo35993O02 instanceof C10218n)) {
                return m36045c((C10218n) interfaceC10345e1Mo35993O0, (C10218n) interfaceC10345e1Mo35993O02, enumC11560a);
            }
            if (z) {
                return m36046d((C10218n) interfaceC10345e1Mo35993O0, abstractC10368m02);
            }
            if (interfaceC10345e1Mo35993O02 instanceof C10218n) {
                return m36046d((C10218n) interfaceC10345e1Mo35993O02, abstractC10368m0);
            }
            return null;
        }

        /* renamed from: b */
        public final AbstractC10368m0 m36048b(Collection<? extends AbstractC10368m0> collection) {
            C9801m.m32346f(collection, "types");
            return m36044a(collection, EnumC11560a.INTERSECTION_TYPE);
        }
    }

    /* compiled from: IntegerLiteralTypeConstructor.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.r.n$b */
    static final class b extends Lambda implements Function0<List<AbstractC10368m0>> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<AbstractC10368m0> invoke() {
            AbstractC10368m0 abstractC10368m0Mo36400s = C10218n.this.mo36004o().m32804x().mo36400s();
            C9801m.m32345e(abstractC10368m0Mo36400s, "builtIns.comparable.defaultType");
            List<AbstractC10368m0> listM38894p = C10817u.m38894p(C10363k1.m36739f(abstractC10368m0Mo36400s, C10815t.m38883e(new C10357i1(EnumC10384r1.IN_VARIANCE, C10218n.this.f39571e)), null, 2, null));
            if (!C10218n.this.m36041m()) {
                listM38894p.add(C10218n.this.mo36004o().m32777L());
            }
            return listM38894p;
        }
    }

    /* compiled from: IntegerLiteralTypeConstructor.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.r.n$c */
    static final class c extends Lambda implements Function1<AbstractC10344e0, CharSequence> {

        /* renamed from: f */
        public static final c f39578f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(AbstractC10344e0 abstractC10344e0) {
            C9801m.m32346f(abstractC10344e0, "it");
            return abstractC10344e0.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C10218n(long j2, InterfaceC10592g0 interfaceC10592g0, Set<? extends AbstractC10344e0> set) {
        this.f39571e = C10347f0.m36665e(C10333a1.f40041g.m36577h(), this, false);
        this.f39572f = C10550i.m37594b(new b());
        this.f39568b = j2;
        this.f39569c = interfaceC10592g0;
        this.f39570d = set;
    }

    public /* synthetic */ C10218n(long j2, InterfaceC10592g0 interfaceC10592g0, Set set, C9789g c9789g) {
        this(j2, interfaceC10592g0, set);
    }

    /* renamed from: l */
    private final List<AbstractC10344e0> m36040l() {
        return (List) this.f39572f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public final boolean m36041m() {
        Collection<AbstractC10344e0> collectionM36060a = C10224t.m36060a(this.f39569c);
        if ((collectionM36060a instanceof Collection) && collectionM36060a.isEmpty()) {
            return true;
        }
        Iterator<T> it = collectionM36060a.iterator();
        while (it.hasNext()) {
            if (!(!this.f39570d.contains((AbstractC10344e0) it.next()))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    private final String m36042n() {
        return '[' + C10782c0.m38599e0(this.f39570d, ",", null, null, 0, null, c.f39578f, 30, null) + ']';
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    /* renamed from: a */
    public Collection<AbstractC10344e0> mo35998a() {
        return m36040l();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    /* renamed from: b */
    public InterfaceC10345e1 mo35999b(AbstractC10396g abstractC10396g) {
        C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    /* renamed from: c */
    public InterfaceC10594h mo32891w() {
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    /* renamed from: e */
    public boolean mo32888e() {
        return false;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    public List<InterfaceC10587e1> getParameters() {
        return C10817u.m38888j();
    }

    /* renamed from: k */
    public final Set<AbstractC10344e0> m36043k() {
        return this.f39570d;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    /* renamed from: o */
    public AbstractC9914h mo36004o() {
        return this.f39569c.mo37021o();
    }

    public String toString() {
        return "IntegerLiteralType" + m36042n();
    }
}
