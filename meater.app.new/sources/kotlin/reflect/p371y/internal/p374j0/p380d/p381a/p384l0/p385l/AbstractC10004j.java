package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.C10773s;
import kotlin.Pair;
import kotlin.collections.C10782c0;
import kotlin.collections.C10808p0;
import kotlin.collections.C10810q0;
import kotlin.collections.C10813s;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.C9819y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10583d0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10735w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10642c0;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10660l0;
import kotlin.reflect.jvm.internal.impl.utils.C10767a;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.EnumC9941d;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9939b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9961i0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.EnumC9973k;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.C9979e;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.C9980f;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9984a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9988e;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9990g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p386m.C10008a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p386m.C10011d;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10022b0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10029f;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10037n;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10041r;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10047x;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10048y;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10106v;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10186c;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10187d;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10195l;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10246c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10247d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10329m;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10323g;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10324h;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10325i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10326j;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10372n1;

/* compiled from: LazyJavaScope.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.j */
/* loaded from: classes2.dex */
public abstract class AbstractC10004j extends AbstractC10252i {

    /* renamed from: b */
    static final /* synthetic */ KProperty<Object>[] f38105b = {C9790g0.m32304h(new C9819y(C9790g0.m32298b(AbstractC10004j.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(AbstractC10004j.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(AbstractC10004j.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};

    /* renamed from: c */
    private final C9990g f38106c;

    /* renamed from: d */
    private final AbstractC10004j f38107d;

    /* renamed from: e */
    private final InterfaceC10325i<Collection<InterfaceC10609m>> f38108e;

    /* renamed from: f */
    private final InterfaceC10325i<InterfaceC9996b> f38109f;

    /* renamed from: g */
    private final InterfaceC10323g<C10163f, Collection<InterfaceC10739y0>> f38110g;

    /* renamed from: h */
    private final InterfaceC10324h<C10163f, InterfaceC10729t0> f38111h;

    /* renamed from: i */
    private final InterfaceC10323g<C10163f, Collection<InterfaceC10739y0>> f38112i;

    /* renamed from: j */
    private final InterfaceC10325i f38113j;

    /* renamed from: k */
    private final InterfaceC10325i f38114k;

    /* renamed from: l */
    private final InterfaceC10325i f38115l;

    /* renamed from: m */
    private final InterfaceC10323g<C10163f, List<InterfaceC10729t0>> f38116m;

    /* compiled from: LazyJavaScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.j$a */
    protected static final class a {

        /* renamed from: a */
        private final AbstractC10344e0 f38117a;

        /* renamed from: b */
        private final AbstractC10344e0 f38118b;

        /* renamed from: c */
        private final List<InterfaceC10599i1> f38119c;

        /* renamed from: d */
        private final List<InterfaceC10587e1> f38120d;

        /* renamed from: e */
        private final boolean f38121e;

        /* renamed from: f */
        private final List<String> f38122f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(AbstractC10344e0 abstractC10344e0, AbstractC10344e0 abstractC10344e02, List<? extends InterfaceC10599i1> list, List<? extends InterfaceC10587e1> list2, boolean z, List<String> list3) {
            C9801m.m32346f(abstractC10344e0, "returnType");
            C9801m.m32346f(list, "valueParameters");
            C9801m.m32346f(list2, "typeParameters");
            C9801m.m32346f(list3, "errors");
            this.f38117a = abstractC10344e0;
            this.f38118b = abstractC10344e02;
            this.f38119c = list;
            this.f38120d = list2;
            this.f38121e = z;
            this.f38122f = list3;
        }

        /* renamed from: a */
        public final List<String> m33463a() {
            return this.f38122f;
        }

        /* renamed from: b */
        public final boolean m33464b() {
            return this.f38121e;
        }

        /* renamed from: c */
        public final AbstractC10344e0 m33465c() {
            return this.f38118b;
        }

        /* renamed from: d */
        public final AbstractC10344e0 m33466d() {
            return this.f38117a;
        }

        /* renamed from: e */
        public final List<InterfaceC10587e1> m33467e() {
            return this.f38120d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C9801m.m32341a(this.f38117a, aVar.f38117a) && C9801m.m32341a(this.f38118b, aVar.f38118b) && C9801m.m32341a(this.f38119c, aVar.f38119c) && C9801m.m32341a(this.f38120d, aVar.f38120d) && this.f38121e == aVar.f38121e && C9801m.m32341a(this.f38122f, aVar.f38122f);
        }

        /* renamed from: f */
        public final List<InterfaceC10599i1> m33468f() {
            return this.f38119c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iHashCode = this.f38117a.hashCode() * 31;
            AbstractC10344e0 abstractC10344e0 = this.f38118b;
            int iHashCode2 = (((((iHashCode + (abstractC10344e0 == null ? 0 : abstractC10344e0.hashCode())) * 31) + this.f38119c.hashCode()) * 31) + this.f38120d.hashCode()) * 31;
            boolean z = this.f38121e;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            return ((iHashCode2 + i2) * 31) + this.f38122f.hashCode();
        }

        public String toString() {
            return "MethodSignatureData(returnType=" + this.f38117a + ", receiverType=" + this.f38118b + ", valueParameters=" + this.f38119c + ", typeParameters=" + this.f38120d + ", hasStableParameterNames=" + this.f38121e + ", errors=" + this.f38122f + ')';
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.j$b */
    protected static final class b {

        /* renamed from: a */
        private final List<InterfaceC10599i1> f38123a;

        /* renamed from: b */
        private final boolean f38124b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends InterfaceC10599i1> list, boolean z) {
            C9801m.m32346f(list, "descriptors");
            this.f38123a = list;
            this.f38124b = z;
        }

        /* renamed from: a */
        public final List<InterfaceC10599i1> m33469a() {
            return this.f38123a;
        }

        /* renamed from: b */
        public final boolean m33470b() {
            return this.f38124b;
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.j$c */
    static final class c extends Lambda implements Function0<Collection<? extends InterfaceC10609m>> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<InterfaceC10609m> invoke() {
            return AbstractC10004j.this.m33458m(C10247d.f39642m, InterfaceC10251h.f39667a.m36159a());
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.j$d */
    static final class d extends Lambda implements Function0<Set<? extends C10163f>> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Set<C10163f> invoke() {
            return AbstractC10004j.this.mo33404l(C10247d.f39647r, null);
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.j$e */
    static final class e extends Lambda implements Function1<C10163f, InterfaceC10729t0> {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10729t0 invoke(C10163f c10163f) {
            C9801m.m32346f(c10163f, "name");
            if (AbstractC10004j.this.m33455B() != null) {
                return (InterfaceC10729t0) AbstractC10004j.this.m33455B().f38111h.invoke(c10163f);
            }
            InterfaceC10037n interfaceC10037nMo33301c = AbstractC10004j.this.m33462y().invoke().mo33301c(c10163f);
            if (interfaceC10037nMo33301c == null || interfaceC10037nMo33301c.mo33613G()) {
                return null;
            }
            return AbstractC10004j.this.m33447J(interfaceC10037nMo33301c);
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.j$f */
    static final class f extends Lambda implements Function1<C10163f, Collection<? extends InterfaceC10739y0>> {
        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<InterfaceC10739y0> invoke(C10163f c10163f) {
            C9801m.m32346f(c10163f, "name");
            if (AbstractC10004j.this.m33455B() != null) {
                return (Collection) AbstractC10004j.this.m33455B().f38110g.invoke(c10163f);
            }
            ArrayList arrayList = new ArrayList();
            for (InterfaceC10041r interfaceC10041r : AbstractC10004j.this.m33462y().invoke().mo33304f(c10163f)) {
                C9979e c9979eM33456I = AbstractC10004j.this.m33456I(interfaceC10041r);
                if (AbstractC10004j.this.mo33400G(c9979eM33456I)) {
                    AbstractC10004j.this.m33461w().m33282a().m33248h().mo33182e(interfaceC10041r, c9979eM33456I);
                    arrayList.add(c9979eM33456I);
                }
            }
            AbstractC10004j.this.mo33406o(arrayList, c10163f);
            return arrayList;
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.j$g */
    static final class g extends Lambda implements Function0<InterfaceC9996b> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC9996b invoke() {
            return AbstractC10004j.this.mo33407p();
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.j$h */
    static final class h extends Lambda implements Function0<Set<? extends C10163f>> {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Set<C10163f> invoke() {
            return AbstractC10004j.this.mo33405n(C10247d.f39649t, null);
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.j$i */
    static final class i extends Lambda implements Function1<C10163f, Collection<? extends InterfaceC10739y0>> {
        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<InterfaceC10739y0> invoke(C10163f c10163f) {
            C9801m.m32346f(c10163f, "name");
            LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) AbstractC10004j.this.f38110g.invoke(c10163f));
            AbstractC10004j.this.m33448L(linkedHashSet);
            AbstractC10004j.this.mo33408r(linkedHashSet, c10163f);
            return C10782c0.m38569E0(AbstractC10004j.this.m33461w().m33282a().m33258r().m33745g(AbstractC10004j.this.m33461w(), linkedHashSet));
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.j$j */
    static final class j extends Lambda implements Function1<C10163f, List<? extends InterfaceC10729t0>> {
        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List<InterfaceC10729t0> invoke(C10163f c10163f) {
            C9801m.m32346f(c10163f, "name");
            ArrayList arrayList = new ArrayList();
            C10767a.m38508a(arrayList, AbstractC10004j.this.f38111h.invoke(c10163f));
            AbstractC10004j.this.mo33409s(c10163f, arrayList);
            return C10187d.m35832t(AbstractC10004j.this.mo33398C()) ? C10782c0.m38569E0(arrayList) : C10782c0.m38569E0(AbstractC10004j.this.m33461w().m33282a().m33258r().m33745g(AbstractC10004j.this.m33461w(), arrayList));
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.j$k */
    static final class k extends Lambda implements Function0<Set<? extends C10163f>> {
        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Set<C10163f> invoke() {
            return AbstractC10004j.this.mo33410t(C10247d.f39650u, null);
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.j$l */
    static final class l extends Lambda implements Function0<InterfaceC10326j<? extends AbstractC10211g<?>>> {

        /* renamed from: g */
        final /* synthetic */ InterfaceC10037n f38135g;

        /* renamed from: h */
        final /* synthetic */ C10642c0 f38136h;

        /* compiled from: LazyJavaScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.j$l$a */
        static final class a extends Lambda implements Function0<AbstractC10211g<?>> {

            /* renamed from: f */
            final /* synthetic */ AbstractC10004j f38137f;

            /* renamed from: g */
            final /* synthetic */ InterfaceC10037n f38138g;

            /* renamed from: h */
            final /* synthetic */ C10642c0 f38139h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC10004j abstractC10004j, InterfaceC10037n interfaceC10037n, C10642c0 c10642c0) {
                super(0);
                this.f38137f = abstractC10004j;
                this.f38138g = interfaceC10037n;
                this.f38139h = c10642c0;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AbstractC10211g<?> invoke() {
                return this.f38137f.m33461w().m33282a().m33247g().mo33177a(this.f38138g, this.f38139h);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(InterfaceC10037n interfaceC10037n, C10642c0 c10642c0) {
            super(0);
            this.f38135g = interfaceC10037n;
            this.f38136h = c10642c0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10326j<AbstractC10211g<?>> invoke() {
            return AbstractC10004j.this.m33461w().m33286e().mo36518f(new a(AbstractC10004j.this, this.f38135g, this.f38136h));
        }
    }

    /* compiled from: LazyJavaScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.j$m */
    static final class m extends Lambda implements Function1<InterfaceC10739y0, InterfaceC10573a> {

        /* renamed from: f */
        public static final m f38140f = new m();

        m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10573a invoke(InterfaceC10739y0 interfaceC10739y0) {
            C9801m.m32346f(interfaceC10739y0, "$this$selectMostSpecificInEachOverridableGroup");
            return interfaceC10739y0;
        }
    }

    public /* synthetic */ AbstractC10004j(C9990g c9990g, AbstractC10004j abstractC10004j, int i2, C9789g c9789g) {
        this(c9990g, (i2 & 2) != 0 ? null : abstractC10004j);
    }

    /* renamed from: A */
    private final Set<C10163f> m33443A() {
        return (Set) C10329m.m36555a(this.f38113j, this, f38105b[0]);
    }

    /* renamed from: D */
    private final Set<C10163f> m33444D() {
        return (Set) C10329m.m36555a(this.f38114k, this, f38105b[1]);
    }

    /* renamed from: E */
    private final AbstractC10344e0 m33445E(InterfaceC10037n interfaceC10037n) {
        boolean z = false;
        AbstractC10344e0 abstractC10344e0M33525o = this.f38106c.m33288g().m33525o(interfaceC10037n.getType(), C10011d.m33530d(EnumC9973k.COMMON, false, null, 3, null));
        if ((AbstractC9914h.m32757r0(abstractC10344e0M33525o) || AbstractC9914h.m32760u0(abstractC10344e0M33525o)) && m33446F(interfaceC10037n) && interfaceC10037n.mo33614O()) {
            z = true;
        }
        if (!z) {
            return abstractC10344e0M33525o;
        }
        AbstractC10344e0 abstractC10344e0M36781n = C10372n1.m36781n(abstractC10344e0M33525o);
        C9801m.m32345e(abstractC10344e0M36781n, "makeNotNullable(propertyType)");
        return abstractC10344e0M36781n;
    }

    /* renamed from: F */
    private final boolean m33446F(InterfaceC10037n interfaceC10037n) {
        return interfaceC10037n.isFinal() && interfaceC10037n.mo33623Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public final InterfaceC10729t0 m33447J(InterfaceC10037n interfaceC10037n) {
        C10642c0 c10642c0M33453u = m33453u(interfaceC10037n);
        c10642c0M33453u.m37790W0(null, null, null, null);
        c10642c0M33453u.m37794c1(m33445E(interfaceC10037n), C10817u.m38888j(), mo33413z(), null, C10817u.m38888j());
        if (C10187d.m35810K(c10642c0M33453u, c10642c0M33453u.getType())) {
            c10642c0M33453u.m37910M0(new l(interfaceC10037n, c10642c0M33453u));
        }
        this.f38106c.m33282a().m33248h().mo33181d(interfaceC10037n, c10642c0M33453u);
        return c10642c0M33453u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public final void m33448L(Set<InterfaceC10739y0> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            String strM34039c = C10106v.m34039c((InterfaceC10739y0) obj, false, false, 2, null);
            Object arrayList = linkedHashMap.get(strM34039c);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strM34039c, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                Collection<? extends InterfaceC10739y0> collectionM35986a = C10195l.m35986a(list, m.f38140f);
                set.removeAll(list);
                set.addAll(collectionM35986a);
            }
        }
    }

    /* renamed from: u */
    private final C10642c0 m33453u(InterfaceC10037n interfaceC10037n) {
        C9980f c9980fM33220g1 = C9980f.m33220g1(mo33398C(), C9988e.m33273a(this.f38106c, interfaceC10037n), EnumC10583d0.FINAL, C9961i0.m33146c(interfaceC10037n.getVisibility()), !interfaceC10037n.isFinal(), interfaceC10037n.getName(), this.f38106c.m33282a().m33260t().mo33569a(interfaceC10037n), m33446F(interfaceC10037n));
        C9801m.m32345e(c9980fM33220g1, "create(\n            owne…d.isFinalStatic\n        )");
        return c9980fM33220g1;
    }

    /* renamed from: x */
    private final Set<C10163f> m33454x() {
        return (Set) C10329m.m36555a(this.f38115l, this, f38105b[2]);
    }

    /* renamed from: B */
    protected final AbstractC10004j m33455B() {
        return this.f38107d;
    }

    /* renamed from: C */
    protected abstract InterfaceC10609m mo33398C();

    /* renamed from: G */
    protected boolean mo33400G(C9979e c9979e) {
        C9801m.m32346f(c9979e, "<this>");
        return true;
    }

    /* renamed from: H */
    protected abstract a mo33401H(InterfaceC10041r interfaceC10041r, List<? extends InterfaceC10587e1> list, AbstractC10344e0 abstractC10344e0, List<? extends InterfaceC10599i1> list2);

    /* renamed from: I */
    protected final C9979e m33456I(InterfaceC10041r interfaceC10041r) {
        C9801m.m32346f(interfaceC10041r, "method");
        C9979e c9979eM33212q1 = C9979e.m33212q1(mo33398C(), C9988e.m33273a(this.f38106c, interfaceC10041r), interfaceC10041r.getName(), this.f38106c.m33282a().m33260t().mo33569a(interfaceC10041r), this.f38109f.invoke().mo33300b(interfaceC10041r.getName()) != null && interfaceC10041r.mo33620f().isEmpty());
        C9801m.m32345e(c9979eM33212q1, "createJavaMethod(\n      …eters.isEmpty()\n        )");
        C9990g c9990gM33235f = C9984a.m33235f(this.f38106c, c9979eM33212q1, interfaceC10041r, 0, 4, null);
        List<InterfaceC10048y> typeParameters = interfaceC10041r.getTypeParameters();
        List<? extends InterfaceC10587e1> arrayList = new ArrayList<>(C10819v.m38911u(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            InterfaceC10587e1 interfaceC10587e1Mo33293a = c9990gM33235f.m33287f().mo33293a((InterfaceC10048y) it.next());
            C9801m.m32343c(interfaceC10587e1Mo33293a);
            arrayList.add(interfaceC10587e1Mo33293a);
        }
        b bVarM33457K = m33457K(c9990gM33235f, c9979eM33212q1, interfaceC10041r.mo33620f());
        a aVarMo33401H = mo33401H(interfaceC10041r, arrayList, m33459q(interfaceC10041r, c9990gM33235f), bVarM33457K.m33469a());
        AbstractC10344e0 abstractC10344e0M33465c = aVarMo33401H.m33465c();
        c9979eM33212q1.mo33214p1(abstractC10344e0M33465c != null ? C10186c.m35790h(c9979eM33212q1, abstractC10344e0M33465c, InterfaceC10620g.f40808c.m37735b()) : null, mo33413z(), C10817u.m38888j(), aVarMo33401H.m33467e(), aVarMo33401H.m33468f(), aVarMo33401H.m33466d(), EnumC10583d0.f40738f.m37676a(false, interfaceC10041r.isAbstract(), !interfaceC10041r.isFinal()), C9961i0.m33146c(interfaceC10041r.getVisibility()), aVarMo33401H.m33465c() != null ? C10808p0.m38794f(C10773s.m38547a(C9979e.f37942J, C10813s.m38830U(bVarM33457K.m33469a()))) : C10810q0.m38797i());
        c9979eM33212q1.m33217t1(aVarMo33401H.m33464b(), bVarM33457K.m33470b());
        if (!aVarMo33401H.m33463a().isEmpty()) {
            c9990gM33235f.m33282a().m33259s().mo33187b(c9979eM33212q1, aVarMo33401H.m33463a());
        }
        return c9979eM33212q1;
    }

    /* renamed from: K */
    protected final b m33457K(C9990g c9990g, InterfaceC10738y interfaceC10738y, List<? extends InterfaceC10022b0> list) {
        Pair pairM38547a;
        C10163f name;
        C9990g c9990g2 = c9990g;
        C9801m.m32346f(c9990g2, "c");
        C9801m.m32346f(interfaceC10738y, "function");
        C9801m.m32346f(list, "jValueParameters");
        Iterable<IndexedValue> iterableM38578K0 = C10782c0.m38578K0(list);
        ArrayList arrayList = new ArrayList(C10819v.m38911u(iterableM38578K0, 10));
        boolean z = false;
        boolean z2 = false;
        for (IndexedValue indexedValue : iterableM38578K0) {
            int index = indexedValue.getIndex();
            InterfaceC10022b0 interfaceC10022b0 = (InterfaceC10022b0) indexedValue.m38648b();
            InterfaceC10620g interfaceC10620gM33273a = C9988e.m33273a(c9990g2, interfaceC10022b0);
            C10008a c10008aM33530d = C10011d.m33530d(EnumC9973k.COMMON, z, null, 3, null);
            if (interfaceC10022b0.mo33578h()) {
                InterfaceC10047x type = interfaceC10022b0.getType();
                InterfaceC10029f interfaceC10029f = type instanceof InterfaceC10029f ? (InterfaceC10029f) type : null;
                if (interfaceC10029f == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + interfaceC10022b0);
                }
                AbstractC10344e0 abstractC10344e0M33524k = c9990g.m33288g().m33524k(interfaceC10029f, c10008aM33530d, true);
                pairM38547a = C10773s.m38547a(abstractC10344e0M33524k, c9990g.m33285d().mo37021o().m32793k(abstractC10344e0M33524k));
            } else {
                pairM38547a = C10773s.m38547a(c9990g.m33288g().m33525o(interfaceC10022b0.getType(), c10008aM33530d), null);
            }
            AbstractC10344e0 abstractC10344e0 = (AbstractC10344e0) pairM38547a.m37646a();
            AbstractC10344e0 abstractC10344e02 = (AbstractC10344e0) pairM38547a.m37647b();
            if (C9801m.m32341a(interfaceC10738y.getName().m35455k(), "equals") && list.size() == 1 && C9801m.m32341a(c9990g.m33285d().mo37021o().m32774I(), abstractC10344e0)) {
                name = C10163f.m35454x("other");
            } else {
                name = interfaceC10022b0.getName();
                if (name == null) {
                    z2 = true;
                }
                if (name == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append('p');
                    sb.append(index);
                    name = C10163f.m35454x(sb.toString());
                    C9801m.m32345e(name, "identifier(\"p$index\")");
                }
            }
            C10163f c10163f = name;
            C9801m.m32345e(c10163f, "if (function.name.asStri…(\"p$index\")\n            }");
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new C10660l0(interfaceC10738y, null, index, interfaceC10620gM33273a, c10163f, abstractC10344e0, false, false, false, abstractC10344e02, c9990g.m33282a().m33260t().mo33569a(interfaceC10022b0)));
            arrayList = arrayList2;
            z2 = z2;
            z = false;
            c9990g2 = c9990g;
        }
        return new b(C10782c0.m38569E0(arrayList), z2);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: a */
    public Collection<InterfaceC10739y0> mo33311a(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        return !mo33312b().contains(c10163f) ? C10817u.m38888j() : this.f38112i.invoke(c10163f);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: b */
    public Set<C10163f> mo33312b() {
        return m33443A();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: c */
    public Collection<InterfaceC10729t0> mo33313c(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        return !mo33314d().contains(c10163f) ? C10817u.m38888j() : this.f38116m.invoke(c10163f);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: d */
    public Set<C10163f> mo33314d() {
        return m33444D();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: e */
    public Set<C10163f> mo33315e() {
        return m33454x();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k
    /* renamed from: g */
    public Collection<InterfaceC10609m> mo33317g(C10247d c10247d, Function1<? super C10163f, Boolean> function1) {
        C9801m.m32346f(c10247d, "kindFilter");
        C9801m.m32346f(function1, "nameFilter");
        return this.f38108e.invoke();
    }

    /* renamed from: l */
    protected abstract Set<C10163f> mo33404l(C10247d c10247d, Function1<? super C10163f, Boolean> function1);

    /* renamed from: m */
    protected final List<InterfaceC10609m> m33458m(C10247d c10247d, Function1<? super C10163f, Boolean> function1) {
        C9801m.m32346f(c10247d, "kindFilter");
        C9801m.m32346f(function1, "nameFilter");
        EnumC9941d enumC9941d = EnumC9941d.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (c10247d.m36137a(C10247d.f39630a.m36144c())) {
            for (C10163f c10163f : mo33404l(c10247d, function1)) {
                if (function1.invoke(c10163f).booleanValue()) {
                    C10767a.m38508a(linkedHashSet, mo33316f(c10163f, enumC9941d));
                }
            }
        }
        if (c10247d.m36137a(C10247d.f39630a.m36145d()) && !c10247d.m36138l().contains(AbstractC10246c.a.f39627a)) {
            for (C10163f c10163f2 : mo33405n(c10247d, function1)) {
                if (function1.invoke(c10163f2).booleanValue()) {
                    linkedHashSet.addAll(mo33311a(c10163f2, enumC9941d));
                }
            }
        }
        if (c10247d.m36137a(C10247d.f39630a.m36150i()) && !c10247d.m36138l().contains(AbstractC10246c.a.f39627a)) {
            for (C10163f c10163f3 : mo33410t(c10247d, function1)) {
                if (function1.invoke(c10163f3).booleanValue()) {
                    linkedHashSet.addAll(mo33313c(c10163f3, enumC9941d));
                }
            }
        }
        return C10782c0.m38569E0(linkedHashSet);
    }

    /* renamed from: n */
    protected abstract Set<C10163f> mo33405n(C10247d c10247d, Function1<? super C10163f, Boolean> function1);

    /* renamed from: o */
    protected void mo33406o(Collection<InterfaceC10739y0> collection, C10163f c10163f) {
        C9801m.m32346f(collection, "result");
        C9801m.m32346f(c10163f, "name");
    }

    /* renamed from: p */
    protected abstract InterfaceC9996b mo33407p();

    /* renamed from: q */
    protected final AbstractC10344e0 m33459q(InterfaceC10041r interfaceC10041r, C9990g c9990g) {
        C9801m.m32346f(interfaceC10041r, "method");
        C9801m.m32346f(c9990g, "c");
        return c9990g.m33288g().m33525o(interfaceC10041r.getReturnType(), C10011d.m33530d(EnumC9973k.COMMON, interfaceC10041r.mo33618P().mo33601r(), null, 2, null));
    }

    /* renamed from: r */
    protected abstract void mo33408r(Collection<InterfaceC10739y0> collection, C10163f c10163f);

    /* renamed from: s */
    protected abstract void mo33409s(C10163f c10163f, Collection<InterfaceC10729t0> collection);

    /* renamed from: t */
    protected abstract Set<C10163f> mo33410t(C10247d c10247d, Function1<? super C10163f, Boolean> function1);

    public String toString() {
        return "Lazy scope for " + mo33398C();
    }

    /* renamed from: v */
    protected final InterfaceC10325i<Collection<InterfaceC10609m>> m33460v() {
        return this.f38108e;
    }

    /* renamed from: w */
    protected final C9990g m33461w() {
        return this.f38106c;
    }

    /* renamed from: y */
    protected final InterfaceC10325i<InterfaceC9996b> m33462y() {
        return this.f38109f;
    }

    /* renamed from: z */
    protected abstract InterfaceC10735w0 mo33413z();

    public AbstractC10004j(C9990g c9990g, AbstractC10004j abstractC10004j) {
        C9801m.m32346f(c9990g, "c");
        this.f38106c = c9990g;
        this.f38107d = abstractC10004j;
        this.f38108e = c9990g.m33286e().mo36515c(new c(), C10817u.m38888j());
        this.f38109f = c9990g.m33286e().mo36516d(new g());
        this.f38110g = c9990g.m33286e().mo36520h(new f());
        this.f38111h = c9990g.m33286e().mo36521i(new e());
        this.f38112i = c9990g.m33286e().mo36520h(new i());
        this.f38113j = c9990g.m33286e().mo36516d(new h());
        this.f38114k = c9990g.m33286e().mo36516d(new k());
        this.f38115l = c9990g.m33286e().mo36516d(new d());
        this.f38116m = c9990g.m33286e().mo36520h(new j());
    }
}
