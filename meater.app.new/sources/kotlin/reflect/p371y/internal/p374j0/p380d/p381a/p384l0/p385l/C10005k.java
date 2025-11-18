package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C10775u;
import kotlin.collections.C10782c0;
import kotlin.collections.C10813s;
import kotlin.collections.C10815t;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.collections.C10822w0;
import kotlin.collections.C10827z;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0;
import kotlin.reflect.jvm.internal.impl.utils.C10768b;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9917k;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.EnumC9941d;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9939b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.C9963a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.C9982h;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9990g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10030g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10040q;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10186c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10247d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.sequences.C10522n;

/* compiled from: LazyJavaStaticClassScope.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.k */
/* loaded from: classes2.dex */
public final class C10005k extends AbstractC10006l {

    /* renamed from: n */
    private final InterfaceC10030g f38141n;

    /* renamed from: o */
    private final C10000f f38142o;

    /* compiled from: LazyJavaStaticClassScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.k$a */
    static final class a extends Lambda implements Function1<InterfaceC10040q, Boolean> {

        /* renamed from: f */
        public static final a f38143f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC10040q interfaceC10040q) {
            C9801m.m32346f(interfaceC10040q, "it");
            return Boolean.valueOf(interfaceC10040q.mo33623Q());
        }
    }

    /* compiled from: LazyJavaStaticClassScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.k$b */
    static final class b extends Lambda implements Function1<InterfaceC10251h, Collection<? extends InterfaceC10729t0>> {

        /* renamed from: f */
        final /* synthetic */ C10163f f38144f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C10163f c10163f) {
            super(1);
            this.f38144f = c10163f;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<? extends InterfaceC10729t0> invoke(InterfaceC10251h interfaceC10251h) {
            C9801m.m32346f(interfaceC10251h, "it");
            return interfaceC10251h.mo33313c(this.f38144f, EnumC9941d.WHEN_GET_SUPER_MEMBERS);
        }
    }

    /* compiled from: LazyJavaStaticClassScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.k$c */
    static final class c extends Lambda implements Function1<InterfaceC10251h, Collection<? extends C10163f>> {

        /* renamed from: f */
        public static final c f38145f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<C10163f> invoke(InterfaceC10251h interfaceC10251h) {
            C9801m.m32346f(interfaceC10251h, "it");
            return interfaceC10251h.mo33314d();
        }
    }

    /* compiled from: LazyJavaStaticClassScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.k$d */
    static final class d<N> implements C10768b.c {

        /* renamed from: a */
        public static final d<N> f38146a = new d<>();

        /* compiled from: LazyJavaStaticClassScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.k$d$a */
        static final class a extends Lambda implements Function1<AbstractC10344e0, InterfaceC10585e> {

            /* renamed from: f */
            public static final a f38147f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InterfaceC10585e invoke(AbstractC10344e0 abstractC10344e0) {
                InterfaceC10594h interfaceC10594hMo32891w = abstractC10344e0.mo35993O0().mo32891w();
                if (interfaceC10594hMo32891w instanceof InterfaceC10585e) {
                    return (InterfaceC10585e) interfaceC10594hMo32891w;
                }
                return null;
            }
        }

        d() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.C10768b.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Iterable<InterfaceC10585e> mo32992a(InterfaceC10585e interfaceC10585e) {
            Collection<AbstractC10344e0> collectionMo35998a = interfaceC10585e.mo32877h().mo35998a();
            C9801m.m32345e(collectionMo35998a, "it.typeConstructor.supertypes");
            return C10522n.m37379i(C10522n.m37392v(C10782c0.m38575J(collectionMo35998a), a.f38147f));
        }
    }

    /* compiled from: LazyJavaStaticClassScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.k$e */
    public static final class e extends C10768b.b<InterfaceC10585e, C10775u> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC10585e f38148a;

        /* renamed from: b */
        final /* synthetic */ Set<R> f38149b;

        /* renamed from: c */
        final /* synthetic */ Function1<InterfaceC10251h, Collection<R>> f38150c;

        /* JADX WARN: Multi-variable type inference failed */
        e(InterfaceC10585e interfaceC10585e, Set<R> set, Function1<? super InterfaceC10251h, ? extends Collection<? extends R>> function1) {
            this.f38148a = interfaceC10585e;
            this.f38149b = set;
            this.f38150c = function1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.C10768b.d
        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo32994a() {
            m33494e();
            return C10775u.f41439a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.C10768b.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo32995c(InterfaceC10585e interfaceC10585e) {
            C9801m.m32346f(interfaceC10585e, "current");
            if (interfaceC10585e == this.f38148a) {
                return true;
            }
            InterfaceC10251h interfaceC10251hMo32866S = interfaceC10585e.mo32866S();
            C9801m.m32345e(interfaceC10251hMo32866S, "current.staticScope");
            if (!(interfaceC10251hMo32866S instanceof AbstractC10006l)) {
                return true;
            }
            this.f38149b.addAll((Collection) this.f38150c.invoke(interfaceC10251hMo32866S));
            return false;
        }

        /* renamed from: e */
        public void m33494e() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10005k(C9990g c9990g, InterfaceC10030g interfaceC10030g, C10000f c10000f) {
        super(c9990g);
        C9801m.m32346f(c9990g, "c");
        C9801m.m32346f(interfaceC10030g, "jClass");
        C9801m.m32346f(c10000f, "ownerDescriptor");
        this.f38141n = interfaceC10030g;
        this.f38142o = c10000f;
    }

    /* renamed from: N */
    private final <R> Set<R> m33483N(InterfaceC10585e interfaceC10585e, Set<R> set, Function1<? super InterfaceC10251h, ? extends Collection<? extends R>> function1) {
        C10768b.m38516b(C10815t.m38883e(interfaceC10585e), d.f38146a, new e(interfaceC10585e, set, function1));
        return set;
    }

    /* renamed from: P */
    private final InterfaceC10729t0 m33484P(InterfaceC10729t0 interfaceC10729t0) {
        if (interfaceC10729t0.mo37030i().m37667g()) {
            return interfaceC10729t0;
        }
        Collection<? extends InterfaceC10729t0> collectionMo37027e = interfaceC10729t0.mo37027e();
        C9801m.m32345e(collectionMo37027e, "this.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(C10819v.m38911u(collectionMo37027e, 10));
        for (InterfaceC10729t0 interfaceC10729t02 : collectionMo37027e) {
            C9801m.m32345e(interfaceC10729t02, "it");
            arrayList.add(m33484P(interfaceC10729t02));
        }
        return (InterfaceC10729t0) C10813s.m38866s0(C10782c0.m38579L(arrayList));
    }

    /* renamed from: Q */
    private final Set<InterfaceC10739y0> m33485Q(C10163f c10163f, InterfaceC10585e interfaceC10585e) {
        C10005k c10005kM33226b = C9982h.m33226b(interfaceC10585e);
        return c10005kM33226b == null ? C10822w0.m38917d() : C10782c0.m38574I0(c10005kM33226b.mo33311a(c10163f, EnumC9941d.WHEN_GET_SUPER_MEMBERS));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public C9995a mo33407p() {
        return new C9995a(this.f38141n, a.f38143f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public C10000f mo33398C() {
        return this.f38142o;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k
    /* renamed from: f */
    public InterfaceC10594h mo33316f(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j
    /* renamed from: l */
    protected Set<C10163f> mo33404l(C10247d c10247d, Function1<? super C10163f, Boolean> function1) {
        C9801m.m32346f(c10247d, "kindFilter");
        return C10822w0.m38917d();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j
    /* renamed from: n */
    protected Set<C10163f> mo33405n(C10247d c10247d, Function1<? super C10163f, Boolean> function1) {
        C9801m.m32346f(c10247d, "kindFilter");
        Set<C10163f> setM38572H0 = C10782c0.m38572H0(m33462y().invoke().mo33299a());
        C10005k c10005kM33226b = C9982h.m33226b(mo33398C());
        Set<C10163f> setMo33312b = c10005kM33226b != null ? c10005kM33226b.mo33312b() : null;
        if (setMo33312b == null) {
            setMo33312b = C10822w0.m38917d();
        }
        setM38572H0.addAll(setMo33312b);
        if (this.f38141n.mo33588B()) {
            setM38572H0.addAll(C10817u.m38891m(C9917k.f37504e, C9917k.f37503d));
        }
        setM38572H0.addAll(m33461w().m33282a().m33263w().mo36093a(mo33398C()));
        return setM38572H0;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j
    /* renamed from: o */
    protected void mo33406o(Collection<InterfaceC10739y0> collection, C10163f c10163f) {
        C9801m.m32346f(collection, "result");
        C9801m.m32346f(c10163f, "name");
        m33461w().m33282a().m33263w().mo36097e(mo33398C(), c10163f, collection);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j
    /* renamed from: r */
    protected void mo33408r(Collection<InterfaceC10739y0> collection, C10163f c10163f) {
        C9801m.m32346f(collection, "result");
        C9801m.m32346f(c10163f, "name");
        Collection<? extends InterfaceC10739y0> collectionM33152e = C9963a.m33152e(c10163f, m33485Q(c10163f, mo33398C()), collection, mo33398C(), m33461w().m33282a().m33243c(), m33461w().m33282a().m33251k().mo36948a());
        C9801m.m32345e(collectionM33152e, "resolveOverridesForStati….overridingUtil\n        )");
        collection.addAll(collectionM33152e);
        if (this.f38141n.mo33588B()) {
            if (C9801m.m32341a(c10163f, C9917k.f37504e)) {
                InterfaceC10739y0 interfaceC10739y0M35788f = C10186c.m35788f(mo33398C());
                C9801m.m32345e(interfaceC10739y0M35788f, "createEnumValueOfMethod(ownerDescriptor)");
                collection.add(interfaceC10739y0M35788f);
            } else if (C9801m.m32341a(c10163f, C9917k.f37503d)) {
                InterfaceC10739y0 interfaceC10739y0M35789g = C10186c.m35789g(mo33398C());
                C9801m.m32345e(interfaceC10739y0M35789g, "createEnumValuesMethod(ownerDescriptor)");
                collection.add(interfaceC10739y0M35789g);
            }
        }
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10006l, kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j
    /* renamed from: s */
    protected void mo33409s(C10163f c10163f, Collection<InterfaceC10729t0> collection) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(collection, "result");
        Set setM33483N = m33483N(mo33398C(), new LinkedHashSet(), new b(c10163f));
        if (!collection.isEmpty()) {
            Collection<? extends InterfaceC10729t0> collectionM33152e = C9963a.m33152e(c10163f, setM33483N, collection, mo33398C(), m33461w().m33282a().m33243c(), m33461w().m33282a().m33251k().mo36948a());
            C9801m.m32345e(collectionM33152e, "resolveOverridesForStati…ingUtil\n                )");
            collection.addAll(collectionM33152e);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : setM33483N) {
            InterfaceC10729t0 interfaceC10729t0M33484P = m33484P((InterfaceC10729t0) obj);
            Object arrayList = linkedHashMap.get(interfaceC10729t0M33484P);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(interfaceC10729t0M33484P, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Collection collectionM33152e2 = C9963a.m33152e(c10163f, (Collection) ((Map.Entry) it.next()).getValue(), collection, mo33398C(), m33461w().m33282a().m33243c(), m33461w().m33282a().m33251k().mo36948a());
            C9801m.m32345e(collectionM33152e2, "resolveOverridesForStati…ingUtil\n                )");
            C10827z.m38933z(arrayList2, collectionM33152e2);
        }
        collection.addAll(arrayList2);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.AbstractC10004j
    /* renamed from: t */
    protected Set<C10163f> mo33410t(C10247d c10247d, Function1<? super C10163f, Boolean> function1) {
        C9801m.m32346f(c10247d, "kindFilter");
        Set<C10163f> setM38572H0 = C10782c0.m38572H0(m33462y().invoke().mo33303e());
        m33483N(mo33398C(), setM38572H0, c.f38145f);
        return setM38572H0;
    }
}
