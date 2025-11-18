package kotlin.reflect.p371y.internal.p374j0.p375b.p376p;

import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C10775u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10782c0;
import kotlin.collections.C10815t;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10593g1;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10728t;
import kotlin.reflect.jvm.internal.impl.descriptors.C10736x;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10583d0;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10588f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10581c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10582d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10604k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10637a;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10658k0;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9917k;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10334b;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10333a1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10347f0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10357i1;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;

/* compiled from: FunctionClassDescriptor.kt */
/* renamed from: kotlin.f0.y.e.j0.b.p.b */
/* loaded from: classes2.dex */
public final class C9923b extends AbstractC10637a {

    /* renamed from: k */
    public static final a f37637k = new a(null);

    /* renamed from: l */
    private static final C10159b f37638l = new C10159b(C9917k.f37517r, C10163f.m35454x("Function"));

    /* renamed from: m */
    private static final C10159b f37639m = new C10159b(C9917k.f37514o, C10163f.m35454x("KFunction"));

    /* renamed from: n */
    private final InterfaceC10330n f37640n;

    /* renamed from: o */
    private final InterfaceC10604k0 f37641o;

    /* renamed from: p */
    private final EnumC9924c f37642p;

    /* renamed from: q */
    private final int f37643q;

    /* renamed from: r */
    private final b f37644r;

    /* renamed from: s */
    private final C9925d f37645s;

    /* renamed from: t */
    private final List<InterfaceC10587e1> f37646t;

    /* compiled from: FunctionClassDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.p.b$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    /* compiled from: FunctionClassDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.p.b$b */
    private final class b extends AbstractC10334b {

        /* compiled from: FunctionClassDescriptor.kt */
        /* renamed from: kotlin.f0.y.e.j0.b.p.b$b$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f37648a;

            static {
                int[] iArr = new int[EnumC9924c.values().length];
                iArr[EnumC9924c.f37650g.ordinal()] = 1;
                iArr[EnumC9924c.f37652i.ordinal()] = 2;
                iArr[EnumC9924c.f37651h.ordinal()] = 3;
                iArr[EnumC9924c.f37653j.ordinal()] = 4;
                f37648a = iArr;
            }
        }

        public b() {
            super(C9923b.this.f37640n);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
        /* renamed from: e */
        public boolean mo32888e() {
            return true;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
        public List<InterfaceC10587e1> getParameters() {
            return C9923b.this.f37646t;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349g
        /* renamed from: l */
        protected Collection<AbstractC10344e0> mo32889l() {
            List<C10159b> listM38883e;
            int i2 = a.f37648a[C9923b.this.m32871V0().ordinal()];
            if (i2 == 1) {
                listM38883e = C10815t.m38883e(C9923b.f37638l);
            } else if (i2 == 2) {
                listM38883e = C10817u.m38891m(C9923b.f37639m, new C10159b(C9917k.f37517r, EnumC9924c.f37650g.m32896u(C9923b.this.m32865R0())));
            } else if (i2 == 3) {
                listM38883e = C10815t.m38883e(C9923b.f37638l);
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                listM38883e = C10817u.m38891m(C9923b.f37639m, new C10159b(C9917k.f37509j, EnumC9924c.f37651h.m32896u(C9923b.this.m32865R0())));
            }
            InterfaceC10592g0 interfaceC10592g0Mo32876b = C9923b.this.f37641o.mo32876b();
            ArrayList arrayList = new ArrayList(C10819v.m38911u(listM38883e, 10));
            for (C10159b c10159b : listM38883e) {
                InterfaceC10585e interfaceC10585eM38149a = C10736x.m38149a(interfaceC10592g0Mo32876b, c10159b);
                if (interfaceC10585eM38149a == null) {
                    throw new IllegalStateException(("Built-in class " + c10159b + " not found").toString());
                }
                List listM38565A0 = C10782c0.m38565A0(getParameters(), interfaceC10585eM38149a.mo32877h().getParameters().size());
                ArrayList arrayList2 = new ArrayList(C10819v.m38911u(listM38565A0, 10));
                Iterator it = listM38565A0.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new C10357i1(((InterfaceC10587e1) it.next()).mo36400s()));
                }
                arrayList.add(C10347f0.m36667g(C10333a1.f40041g.m36577h(), interfaceC10585eM38149a, arrayList2));
            }
            return C10782c0.m38569E0(arrayList);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10349g
        /* renamed from: q */
        protected InterfaceC10581c1 mo32890q() {
            return InterfaceC10581c1.a.f40737a;
        }

        public String toString() {
            return mo32891w().toString();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10334b
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public C9923b mo32891w() {
            return C9923b.this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9923b(InterfaceC10330n interfaceC10330n, InterfaceC10604k0 interfaceC10604k0, EnumC9924c enumC9924c, int i2) {
        super(interfaceC10330n, enumC9924c.m32896u(i2));
        C9801m.m32346f(interfaceC10330n, "storageManager");
        C9801m.m32346f(interfaceC10604k0, "containingDeclaration");
        C9801m.m32346f(enumC9924c, "functionKind");
        this.f37640n = interfaceC10330n;
        this.f37641o = interfaceC10604k0;
        this.f37642p = enumC9924c;
        this.f37643q = i2;
        this.f37644r = new b();
        this.f37645s = new C9925d(interfaceC10330n, this);
        ArrayList arrayList = new ArrayList();
        IntRange intRange = new IntRange(1, i2);
        ArrayList arrayList2 = new ArrayList(C10819v.m38911u(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            int iMo32397b = ((IntIterator) it).mo32397b();
            EnumC10384r1 enumC10384r1 = EnumC10384r1.IN_VARIANCE;
            StringBuilder sb = new StringBuilder();
            sb.append('P');
            sb.append(iMo32397b);
            m32851L0(arrayList, this, enumC10384r1, sb.toString());
            arrayList2.add(C10775u.f41439a);
        }
        m32851L0(arrayList, this, EnumC10384r1.OUT_VARIANCE, "R");
        this.f37646t = C10782c0.m38569E0(arrayList);
    }

    /* renamed from: L0 */
    private static final void m32851L0(ArrayList<InterfaceC10587e1> arrayList, C9923b c9923b, EnumC10384r1 enumC10384r1, String str) {
        arrayList.add(C10658k0.m37875S0(c9923b, InterfaceC10620g.f40808c.m37735b(), false, enumC10384r1, C10163f.m35454x(str), arrayList.size(), c9923b.f37640n));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: A */
    public boolean mo32857A() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: D */
    public boolean mo32858D() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: E0 */
    public boolean mo32859E0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: J0 */
    public boolean mo32862J0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: M */
    public boolean mo32863M() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: R */
    public /* bridge */ /* synthetic */ InterfaceC10582d mo32864R() {
        return (InterfaceC10582d) m32875Z0();
    }

    /* renamed from: R0 */
    public final int m32865R0() {
        return this.f37643q;
    }

    /* renamed from: S0 */
    public Void m32867S0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public List<InterfaceC10582d> mo32880k() {
        return C10817u.m38888j();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: U */
    public /* bridge */ /* synthetic */ InterfaceC10585e mo32869U() {
        return (InterfaceC10585e) m32867S0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10612n, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public InterfaceC10604k0 mo32876b() {
        return this.f37641o;
    }

    /* renamed from: V0 */
    public final EnumC9924c m32871V0() {
        return this.f37642p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public List<InterfaceC10585e> mo32861J() {
        return C10817u.m38888j();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public InterfaceC10251h.b mo32866S() {
        return InterfaceC10251h.b.f39671b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10670t
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public C9925d mo32860H(AbstractC10396g abstractC10396g) {
        C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
        return this.f37645s;
    }

    /* renamed from: Z0 */
    public Void m32875Z0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10614a
    public InterfaceC10620g getAnnotations() {
        return InterfaceC10620g.f40808c.m37735b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10677q, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    public AbstractC10730u getVisibility() {
        AbstractC10730u abstractC10730u = C10728t.f41220e;
        C9801m.m32345e(abstractC10730u, Store.PUBLIC_ACCESS);
        return abstractC10730u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h
    /* renamed from: h */
    public InterfaceC10345e1 mo32877h() {
        return this.f37644r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: i */
    public EnumC10588f mo32878i() {
        return EnumC10588f.INTERFACE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: j */
    public EnumC10583d0 mo32879j() {
        return EnumC10583d0.ABSTRACT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: l */
    public boolean mo32881l() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10597i
    /* renamed from: m */
    public boolean mo32882m() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10635p
    /* renamed from: t */
    public InterfaceC10741z0 mo32883t() {
        InterfaceC10741z0 interfaceC10741z0 = InterfaceC10741z0.f41247a;
        C9801m.m32345e(interfaceC10741z0, "NO_SOURCE");
        return interfaceC10741z0;
    }

    public String toString() {
        String strM35455k = getName().m35455k();
        C9801m.m32345e(strM35455k, "name.asString()");
        return strM35455k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10597i
    /* renamed from: w */
    public List<InterfaceC10587e1> mo32884w() {
        return this.f37646t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: z */
    public boolean mo32885z() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e
    /* renamed from: z0 */
    public AbstractC10593g1<AbstractC10368m0> mo32886z0() {
        return null;
    }
}
