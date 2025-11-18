package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C10773s;
import kotlin.Pair;
import kotlin.collections.C10810q0;
import kotlin.collections.C10819v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.C9819y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.C10736x;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c;
import kotlin.reflect.p371y.internal.p374j0.p375b.p377q.C9930d;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9945a0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.C9963a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.EnumC9973k;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.InterfaceC9981g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9990g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p386m.C10011d;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p387m0.InterfaceC10016a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10019a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10021b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10023c;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10027e;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10030g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10031h;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10036m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10038o;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10047x;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p399h.AbstractC10172c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10204a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10212h;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10214j;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10221q;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10223s;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10329m;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10325i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10326j;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10350g0;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10427k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10426j;

/* compiled from: LazyJavaAnnotationDescriptor.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.e */
/* loaded from: classes2.dex */
public final class C9999e implements InterfaceC10616c, InterfaceC9981g {

    /* renamed from: a */
    static final /* synthetic */ KProperty<Object>[] f38025a = {C9790g0.m32304h(new C9819y(C9790g0.m32298b(C9999e.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(C9999e.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(C9999e.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: b */
    private final C9990g f38026b;

    /* renamed from: c */
    private final InterfaceC10019a f38027c;

    /* renamed from: d */
    private final InterfaceC10326j f38028d;

    /* renamed from: e */
    private final InterfaceC10325i f38029e;

    /* renamed from: f */
    private final InterfaceC10016a f38030f;

    /* renamed from: g */
    private final InterfaceC10325i f38031g;

    /* renamed from: h */
    private final boolean f38032h;

    /* renamed from: i */
    private final boolean f38033i;

    /* compiled from: LazyJavaAnnotationDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.e$a */
    static final class a extends Lambda implements Function0<Map<C10163f, ? extends AbstractC10211g<?>>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Map<C10163f, AbstractC10211g<?>> invoke() {
            Collection<InterfaceC10021b> collectionMo33570b = C9999e.this.f38027c.mo33570b();
            C9999e c9999e = C9999e.this;
            ArrayList arrayList = new ArrayList();
            for (InterfaceC10021b interfaceC10021b : collectionMo33570b) {
                C10163f name = interfaceC10021b.getName();
                if (name == null) {
                    name = C9945a0.f37788c;
                }
                AbstractC10211g abstractC10211gM33326l = c9999e.m33326l(interfaceC10021b);
                Pair pairM38547a = abstractC10211gM33326l != null ? C10773s.m38547a(name, abstractC10211gM33326l) : null;
                if (pairM38547a != null) {
                    arrayList.add(pairM38547a);
                }
            }
            return C10810q0.m38805q(arrayList);
        }
    }

    /* compiled from: LazyJavaAnnotationDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.e$b */
    static final class b extends Lambda implements Function0<C10160c> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C10160c invoke() {
            C10159b c10159bMo33571e = C9999e.this.f38027c.mo33571e();
            if (c10159bMo33571e != null) {
                return c10159bMo33571e.m35409b();
            }
            return null;
        }
    }

    /* compiled from: LazyJavaAnnotationDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.e$c */
    static final class c extends Lambda implements Function0<AbstractC10368m0> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10368m0 invoke() {
            C10160c c10160cMo33162d = C9999e.this.mo33162d();
            if (c10160cMo33162d == null) {
                return C10427k.m37053d(EnumC10426j.f40285I0, C9999e.this.f38027c.toString());
            }
            InterfaceC10585e interfaceC10585eM32936f = C9930d.m32936f(C9930d.f37687a, c10160cMo33162d, C9999e.this.f38026b.m33285d().mo37021o(), null, 4, null);
            if (interfaceC10585eM32936f == null) {
                InterfaceC10030g interfaceC10030gMo33574z = C9999e.this.f38027c.mo33574z();
                interfaceC10585eM32936f = interfaceC10030gMo33574z != null ? C9999e.this.f38026b.m33282a().m33254n().mo33295a(interfaceC10030gMo33574z) : null;
                if (interfaceC10585eM32936f == null) {
                    interfaceC10585eM32936f = C9999e.this.m33325h(c10160cMo33162d);
                }
            }
            return interfaceC10585eM32936f.mo36400s();
        }
    }

    public C9999e(C9990g c9990g, InterfaceC10019a interfaceC10019a, boolean z) {
        C9801m.m32346f(c9990g, "c");
        C9801m.m32346f(interfaceC10019a, "javaAnnotation");
        this.f38026b = c9990g;
        this.f38027c = interfaceC10019a;
        this.f38028d = c9990g.m33286e().mo36518f(new b());
        this.f38029e = c9990g.m33286e().mo36516d(new c());
        this.f38030f = c9990g.m33282a().m33260t().mo33569a(interfaceC10019a);
        this.f38031g = c9990g.m33286e().mo36516d(new a());
        this.f38032h = interfaceC10019a.mo33572g();
        this.f38033i = interfaceC10019a.mo33573v() || z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final InterfaceC10585e m33325h(C10160c c10160c) {
        InterfaceC10592g0 interfaceC10592g0M33285d = this.f38026b.m33285d();
        C10159b c10159bM35408m = C10159b.m35408m(c10160c);
        C9801m.m32345e(c10159bM35408m, "topLevel(fqName)");
        return C10736x.m38151c(interfaceC10592g0M33285d, c10159bM35408m, this.f38026b.m33282a().m33242b().m33971d().m36432q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final AbstractC10211g<?> m33326l(InterfaceC10021b interfaceC10021b) {
        if (interfaceC10021b instanceof InterfaceC10038o) {
            return C10212h.f39560a.m36026c(((InterfaceC10038o) interfaceC10021b).getValue());
        }
        if (interfaceC10021b instanceof InterfaceC10036m) {
            InterfaceC10036m interfaceC10036m = (InterfaceC10036m) interfaceC10021b;
            return m33329o(interfaceC10036m.mo33611b(), interfaceC10036m.mo33612d());
        }
        if (!(interfaceC10021b instanceof InterfaceC10027e)) {
            if (interfaceC10021b instanceof InterfaceC10023c) {
                return m33327m(((InterfaceC10023c) interfaceC10021b).mo33579a());
            }
            if (interfaceC10021b instanceof InterfaceC10031h) {
                return m33330p(((InterfaceC10031h) interfaceC10021b).mo33604c());
            }
            return null;
        }
        InterfaceC10027e interfaceC10027e = (InterfaceC10027e) interfaceC10021b;
        C10163f name = interfaceC10027e.getName();
        if (name == null) {
            name = C9945a0.f37788c;
        }
        C9801m.m32345e(name, "argument.name ?: DEFAULT_ANNOTATION_MEMBER_NAME");
        return m33328n(name, interfaceC10027e.mo33585e());
    }

    /* renamed from: m */
    private final AbstractC10211g<?> m33327m(InterfaceC10019a interfaceC10019a) {
        return new C10204a(new C9999e(this.f38026b, interfaceC10019a, false, 4, null));
    }

    /* renamed from: n */
    private final AbstractC10211g<?> m33328n(C10163f c10163f, List<? extends InterfaceC10021b> list) {
        AbstractC10344e0 abstractC10344e0M32794l;
        AbstractC10368m0 type = getType();
        C9801m.m32345e(type, "type");
        if (C10350g0.m36706a(type)) {
            return null;
        }
        InterfaceC10585e interfaceC10585eM36071e = C10235a.m36071e(this);
        C9801m.m32343c(interfaceC10585eM36071e);
        InterfaceC10599i1 interfaceC10599i1M33149b = C9963a.m33149b(c10163f, interfaceC10585eM36071e);
        if (interfaceC10599i1M33149b == null || (abstractC10344e0M32794l = interfaceC10599i1M33149b.getType()) == null) {
            abstractC10344e0M32794l = this.f38026b.m33282a().m33253m().mo37021o().m32794l(EnumC10384r1.INVARIANT, C10427k.m37053d(EnumC10426j.f40283H0, new String[0]));
        }
        C9801m.m32345e(abstractC10344e0M32794l, "DescriptorResolverUtils.…GUMENT)\n                )");
        ArrayList arrayList = new ArrayList(C10819v.m38911u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            AbstractC10211g<?> abstractC10211gM33326l = m33326l((InterfaceC10021b) it.next());
            if (abstractC10211gM33326l == null) {
                abstractC10211gM33326l = new C10223s();
            }
            arrayList.add(abstractC10211gM33326l);
        }
        return C10212h.f39560a.m36025b(arrayList, abstractC10344e0M32794l);
    }

    /* renamed from: o */
    private final AbstractC10211g<?> m33329o(C10159b c10159b, C10163f c10163f) {
        if (c10159b == null || c10163f == null) {
            return null;
        }
        return new C10214j(c10159b, c10163f);
    }

    /* renamed from: p */
    private final AbstractC10211g<?> m33330p(InterfaceC10047x interfaceC10047x) {
        return C10221q.f39582b.m36053a(this.f38026b.m33288g().m33525o(interfaceC10047x, C10011d.m33530d(EnumC9973k.COMMON, false, null, 3, null)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c
    /* renamed from: a */
    public Map<C10163f, AbstractC10211g<?>> mo33159a() {
        return (Map) C10329m.m36555a(this.f38031g, this, f38025a[2]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c
    /* renamed from: d */
    public C10160c mo33162d() {
        return (C10160c) C10329m.m36556b(this.f38028d, this, f38025a[0]);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.InterfaceC9981g
    /* renamed from: g */
    public boolean mo33163g() {
        return this.f38032h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public InterfaceC10016a mo33164t() {
        return this.f38030f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public AbstractC10368m0 getType() {
        return (AbstractC10368m0) C10329m.m36555a(this.f38029e, this, f38025a[1]);
    }

    /* renamed from: k */
    public final boolean m33333k() {
        return this.f38033i;
    }

    public String toString() {
        return AbstractC10172c.m35499s(AbstractC10172c.f39377g, this, null, 2, null);
    }

    public /* synthetic */ C9999e(C9990g c9990g, InterfaceC10019a interfaceC10019a, boolean z, int i2, C9789g c9789g) {
        this(c9990g, interfaceC10019a, (i2 & 4) != 0 ? false : z);
    }
}
