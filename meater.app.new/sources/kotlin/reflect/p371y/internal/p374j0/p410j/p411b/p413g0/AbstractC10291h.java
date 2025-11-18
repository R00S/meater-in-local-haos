package kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
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
import kotlin.collections.C10808p0;
import kotlin.collections.C10810q0;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.collections.C10824x0;
import kotlin.collections.C10825y;
import kotlin.collections.C10827z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.C9819y;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C9848l;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10584d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10742a;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q;
import kotlin.reflect.jvm.internal.impl.utils.C10767a;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9939b;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10130i;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10135n;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10139r;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10190g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10247d;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10303m;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10314x;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10329m;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10323g;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10324h;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10325i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10326j;

/* compiled from: DeserializedMemberScope.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.g0.h */
/* loaded from: classes3.dex */
public abstract class AbstractC10291h extends AbstractC10252i {

    /* renamed from: b */
    static final /* synthetic */ KProperty<Object>[] f39819b = {C9790g0.m32304h(new C9819y(C9790g0.m32298b(AbstractC10291h.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(AbstractC10291h.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};

    /* renamed from: c */
    private final C10303m f39820c;

    /* renamed from: d */
    private final a f39821d;

    /* renamed from: e */
    private final InterfaceC10325i f39822e;

    /* renamed from: f */
    private final InterfaceC10326j f39823f;

    /* compiled from: DeserializedMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$a */
    private interface a {
        /* renamed from: a */
        Collection<InterfaceC10739y0> mo36328a(C10163f c10163f, InterfaceC9939b interfaceC9939b);

        /* renamed from: b */
        Set<C10163f> mo36329b();

        /* renamed from: c */
        Collection<InterfaceC10729t0> mo36330c(C10163f c10163f, InterfaceC9939b interfaceC9939b);

        /* renamed from: d */
        Set<C10163f> mo36331d();

        /* renamed from: e */
        Set<C10163f> mo36332e();

        /* renamed from: f */
        void mo36333f(Collection<InterfaceC10609m> collection, C10247d c10247d, Function1<? super C10163f, Boolean> function1, InterfaceC9939b interfaceC9939b);

        /* renamed from: g */
        InterfaceC10584d1 mo36334g(C10163f c10163f);
    }

    /* compiled from: DeserializedMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$b */
    private final class b implements a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f39824a = {C9790g0.m32304h(new C9819y(C9790g0.m32298b(b.class), "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(b.class), "declaredProperties", "getDeclaredProperties()Ljava/util/List;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(b.class), "allTypeAliases", "getAllTypeAliases()Ljava/util/List;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(b.class), "allFunctions", "getAllFunctions()Ljava/util/List;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(b.class), "allProperties", "getAllProperties()Ljava/util/List;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(b.class), "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(b.class), "functionsByName", "getFunctionsByName()Ljava/util/Map;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(b.class), "propertiesByName", "getPropertiesByName()Ljava/util/Map;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(b.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(b.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* renamed from: b */
        private final List<C10130i> f39825b;

        /* renamed from: c */
        private final List<C10135n> f39826c;

        /* renamed from: d */
        private final List<C10139r> f39827d;

        /* renamed from: e */
        private final InterfaceC10325i f39828e;

        /* renamed from: f */
        private final InterfaceC10325i f39829f;

        /* renamed from: g */
        private final InterfaceC10325i f39830g;

        /* renamed from: h */
        private final InterfaceC10325i f39831h;

        /* renamed from: i */
        private final InterfaceC10325i f39832i;

        /* renamed from: j */
        private final InterfaceC10325i f39833j;

        /* renamed from: k */
        private final InterfaceC10325i f39834k;

        /* renamed from: l */
        private final InterfaceC10325i f39835l;

        /* renamed from: m */
        private final InterfaceC10325i f39836m;

        /* renamed from: n */
        private final InterfaceC10325i f39837n;

        /* renamed from: o */
        final /* synthetic */ AbstractC10291h f39838o;

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$b$a */
        static final class a extends Lambda implements Function0<List<? extends InterfaceC10739y0>> {
            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends InterfaceC10739y0> invoke() {
                return C10782c0.m38609o0(b.this.m36338D(), b.this.m36355t());
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$b$b, reason: collision with other inner class name */
        static final class C11566b extends Lambda implements Function0<List<? extends InterfaceC10729t0>> {
            C11566b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends InterfaceC10729t0> invoke() {
                return C10782c0.m38609o0(b.this.m36339E(), b.this.m36356u());
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$b$c */
        static final class c extends Lambda implements Function0<List<? extends InterfaceC10584d1>> {
            c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends InterfaceC10584d1> invoke() {
                return b.this.m36361z();
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$b$d */
        static final class d extends Lambda implements Function0<List<? extends InterfaceC10739y0>> {
            d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends InterfaceC10739y0> invoke() {
                return b.this.m36357v();
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$b$e */
        static final class e extends Lambda implements Function0<List<? extends InterfaceC10729t0>> {
            e() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends InterfaceC10729t0> invoke() {
                return b.this.m36360y();
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$b$f */
        static final class f extends Lambda implements Function0<Set<? extends C10163f>> {

            /* renamed from: g */
            final /* synthetic */ AbstractC10291h f39845g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(AbstractC10291h abstractC10291h) {
                super(0);
                this.f39845g = abstractC10291h;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Set<C10163f> invoke() {
                b bVar = b.this;
                List list = bVar.f39825b;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                AbstractC10291h abstractC10291h = bVar.f39838o;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(C10314x.m36495b(abstractC10291h.m36325p().m36456g(), ((C10130i) ((InterfaceC10756o) it.next())).m34723e0()));
                }
                return C10824x0.m38925l(linkedHashSet, this.f39845g.mo36298t());
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$b$g */
        static final class g extends Lambda implements Function0<Map<C10163f, ? extends List<? extends InterfaceC10739y0>>> {
            g() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Map<C10163f, List<InterfaceC10739y0>> invoke() {
                List listM36335A = b.this.m36335A();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : listM36335A) {
                    C10163f name = ((InterfaceC10739y0) obj).getName();
                    C9801m.m32345e(name, "it.name");
                    Object arrayList = linkedHashMap.get(name);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(name, arrayList);
                    }
                    ((List) arrayList).add(obj);
                }
                return linkedHashMap;
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$b$h */
        static final class h extends Lambda implements Function0<Map<C10163f, ? extends List<? extends InterfaceC10729t0>>> {
            h() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Map<C10163f, List<InterfaceC10729t0>> invoke() {
                List listM36336B = b.this.m36336B();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : listM36336B) {
                    C10163f name = ((InterfaceC10729t0) obj).getName();
                    C9801m.m32345e(name, "it.name");
                    Object arrayList = linkedHashMap.get(name);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(name, arrayList);
                    }
                    ((List) arrayList).add(obj);
                }
                return linkedHashMap;
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$b$i */
        static final class i extends Lambda implements Function0<Map<C10163f, ? extends InterfaceC10584d1>> {
            i() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Map<C10163f, InterfaceC10584d1> invoke() {
                List listM36337C = b.this.m36337C();
                LinkedHashMap linkedHashMap = new LinkedHashMap(C9848l.m32419b(C10808p0.m38793e(C10819v.m38911u(listM36337C, 10)), 16));
                for (Object obj : listM36337C) {
                    C10163f name = ((InterfaceC10584d1) obj).getName();
                    C9801m.m32345e(name, "it.name");
                    linkedHashMap.put(name, obj);
                }
                return linkedHashMap;
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$b$j */
        static final class j extends Lambda implements Function0<Set<? extends C10163f>> {

            /* renamed from: g */
            final /* synthetic */ AbstractC10291h f39850g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(AbstractC10291h abstractC10291h) {
                super(0);
                this.f39850g = abstractC10291h;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Set<C10163f> invoke() {
                b bVar = b.this;
                List list = bVar.f39826c;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                AbstractC10291h abstractC10291h = bVar.f39838o;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(C10314x.m36495b(abstractC10291h.m36325p().m36456g(), ((C10135n) ((InterfaceC10756o) it.next())).m34887d0()));
                }
                return C10824x0.m38925l(linkedHashSet, this.f39850g.mo36299u());
            }
        }

        public b(AbstractC10291h abstractC10291h, List<C10130i> list, List<C10135n> list2, List<C10139r> list3) {
            C9801m.m32346f(list, "functionList");
            C9801m.m32346f(list2, "propertyList");
            C9801m.m32346f(list3, "typeAliasList");
            this.f39838o = abstractC10291h;
            this.f39825b = list;
            this.f39826c = list2;
            this.f39827d = abstractC10291h.m36325p().m36452c().m36422g().mo36443f() ? list3 : C10817u.m38888j();
            this.f39828e = abstractC10291h.m36325p().m36457h().mo36516d(new d());
            this.f39829f = abstractC10291h.m36325p().m36457h().mo36516d(new e());
            this.f39830g = abstractC10291h.m36325p().m36457h().mo36516d(new c());
            this.f39831h = abstractC10291h.m36325p().m36457h().mo36516d(new a());
            this.f39832i = abstractC10291h.m36325p().m36457h().mo36516d(new C11566b());
            this.f39833j = abstractC10291h.m36325p().m36457h().mo36516d(new i());
            this.f39834k = abstractC10291h.m36325p().m36457h().mo36516d(new g());
            this.f39835l = abstractC10291h.m36325p().m36457h().mo36516d(new h());
            this.f39836m = abstractC10291h.m36325p().m36457h().mo36516d(new f(abstractC10291h));
            this.f39837n = abstractC10291h.m36325p().m36457h().mo36516d(new j(abstractC10291h));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: A */
        public final List<InterfaceC10739y0> m36335A() {
            return (List) C10329m.m36555a(this.f39831h, this, f39824a[3]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: B */
        public final List<InterfaceC10729t0> m36336B() {
            return (List) C10329m.m36555a(this.f39832i, this, f39824a[4]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: C */
        public final List<InterfaceC10584d1> m36337C() {
            return (List) C10329m.m36555a(this.f39830g, this, f39824a[2]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: D */
        public final List<InterfaceC10739y0> m36338D() {
            return (List) C10329m.m36555a(this.f39828e, this, f39824a[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: E */
        public final List<InterfaceC10729t0> m36339E() {
            return (List) C10329m.m36555a(this.f39829f, this, f39824a[1]);
        }

        /* renamed from: F */
        private final Map<C10163f, Collection<InterfaceC10739y0>> m36340F() {
            return (Map) C10329m.m36555a(this.f39834k, this, f39824a[6]);
        }

        /* renamed from: G */
        private final Map<C10163f, Collection<InterfaceC10729t0>> m36341G() {
            return (Map) C10329m.m36555a(this.f39835l, this, f39824a[7]);
        }

        /* renamed from: H */
        private final Map<C10163f, InterfaceC10584d1> m36342H() {
            return (Map) C10329m.m36555a(this.f39833j, this, f39824a[5]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public final List<InterfaceC10739y0> m36355t() {
            Set<C10163f> setMo36298t = this.f39838o.mo36298t();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setMo36298t.iterator();
            while (it.hasNext()) {
                C10827z.m38933z(arrayList, m36358w((C10163f) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: u */
        public final List<InterfaceC10729t0> m36356u() {
            Set<C10163f> setMo36299u = this.f39838o.mo36299u();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setMo36299u.iterator();
            while (it.hasNext()) {
                C10827z.m38933z(arrayList, m36359x((C10163f) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v */
        public final List<InterfaceC10739y0> m36357v() {
            List<C10130i> list = this.f39825b;
            AbstractC10291h abstractC10291h = this.f39838o;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                InterfaceC10739y0 interfaceC10739y0M36487j = abstractC10291h.m36325p().m36455f().m36487j((C10130i) ((InterfaceC10756o) it.next()));
                if (!abstractC10291h.mo36300x(interfaceC10739y0M36487j)) {
                    interfaceC10739y0M36487j = null;
                }
                if (interfaceC10739y0M36487j != null) {
                    arrayList.add(interfaceC10739y0M36487j);
                }
            }
            return arrayList;
        }

        /* renamed from: w */
        private final List<InterfaceC10739y0> m36358w(C10163f c10163f) {
            List<InterfaceC10739y0> listM36338D = m36338D();
            AbstractC10291h abstractC10291h = this.f39838o;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM36338D) {
                if (C9801m.m32341a(((InterfaceC10609m) obj).getName(), c10163f)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            abstractC10291h.mo36294k(c10163f, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        /* renamed from: x */
        private final List<InterfaceC10729t0> m36359x(C10163f c10163f) {
            List<InterfaceC10729t0> listM36339E = m36339E();
            AbstractC10291h abstractC10291h = this.f39838o;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM36339E) {
                if (C9801m.m32341a(((InterfaceC10609m) obj).getName(), c10163f)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            abstractC10291h.mo36295l(c10163f, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y */
        public final List<InterfaceC10729t0> m36360y() {
            List<C10135n> list = this.f39826c;
            AbstractC10291h abstractC10291h = this.f39838o;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                InterfaceC10729t0 interfaceC10729t0M36488l = abstractC10291h.m36325p().m36455f().m36488l((C10135n) ((InterfaceC10756o) it.next()));
                if (interfaceC10729t0M36488l != null) {
                    arrayList.add(interfaceC10729t0M36488l);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z */
        public final List<InterfaceC10584d1> m36361z() {
            List<C10139r> list = this.f39827d;
            AbstractC10291h abstractC10291h = this.f39838o;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                InterfaceC10584d1 interfaceC10584d1M36489m = abstractC10291h.m36325p().m36455f().m36489m((C10139r) ((InterfaceC10756o) it.next()));
                if (interfaceC10584d1M36489m != null) {
                    arrayList.add(interfaceC10584d1M36489m);
                }
            }
            return arrayList;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h.a
        /* renamed from: a */
        public Collection<InterfaceC10739y0> mo36328a(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
            Collection<InterfaceC10739y0> collection;
            C9801m.m32346f(c10163f, "name");
            C9801m.m32346f(interfaceC9939b, "location");
            return (mo36329b().contains(c10163f) && (collection = m36340F().get(c10163f)) != null) ? collection : C10817u.m38888j();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h.a
        /* renamed from: b */
        public Set<C10163f> mo36329b() {
            return (Set) C10329m.m36555a(this.f39836m, this, f39824a[8]);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h.a
        /* renamed from: c */
        public Collection<InterfaceC10729t0> mo36330c(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
            Collection<InterfaceC10729t0> collection;
            C9801m.m32346f(c10163f, "name");
            C9801m.m32346f(interfaceC9939b, "location");
            return (mo36331d().contains(c10163f) && (collection = m36341G().get(c10163f)) != null) ? collection : C10817u.m38888j();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h.a
        /* renamed from: d */
        public Set<C10163f> mo36331d() {
            return (Set) C10329m.m36555a(this.f39837n, this, f39824a[9]);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h.a
        /* renamed from: e */
        public Set<C10163f> mo36332e() {
            List<C10139r> list = this.f39827d;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            AbstractC10291h abstractC10291h = this.f39838o;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(C10314x.m36495b(abstractC10291h.m36325p().m36456g(), ((C10139r) ((InterfaceC10756o) it.next())).m35138X()));
            }
            return linkedHashSet;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h.a
        /* renamed from: f */
        public void mo36333f(Collection<InterfaceC10609m> collection, C10247d c10247d, Function1<? super C10163f, Boolean> function1, InterfaceC9939b interfaceC9939b) {
            C9801m.m32346f(collection, "result");
            C9801m.m32346f(c10247d, "kindFilter");
            C9801m.m32346f(function1, "nameFilter");
            C9801m.m32346f(interfaceC9939b, "location");
            if (c10247d.m36137a(C10247d.f39630a.m36150i())) {
                for (Object obj : m36336B()) {
                    C10163f name = ((InterfaceC10729t0) obj).getName();
                    C9801m.m32345e(name, "it.name");
                    if (function1.invoke(name).booleanValue()) {
                        collection.add(obj);
                    }
                }
            }
            if (c10247d.m36137a(C10247d.f39630a.m36145d())) {
                for (Object obj2 : m36335A()) {
                    C10163f name2 = ((InterfaceC10739y0) obj2).getName();
                    C9801m.m32345e(name2, "it.name");
                    if (function1.invoke(name2).booleanValue()) {
                        collection.add(obj2);
                    }
                }
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h.a
        /* renamed from: g */
        public InterfaceC10584d1 mo36334g(C10163f c10163f) {
            C9801m.m32346f(c10163f, "name");
            return m36342H().get(c10163f);
        }
    }

    /* compiled from: DeserializedMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$c */
    private final class c implements a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f39851a = {C9790g0.m32304h(new C9819y(C9790g0.m32298b(c.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(c.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* renamed from: b */
        private final Map<C10163f, byte[]> f39852b;

        /* renamed from: c */
        private final Map<C10163f, byte[]> f39853c;

        /* renamed from: d */
        private final Map<C10163f, byte[]> f39854d;

        /* renamed from: e */
        private final InterfaceC10323g<C10163f, Collection<InterfaceC10739y0>> f39855e;

        /* renamed from: f */
        private final InterfaceC10323g<C10163f, Collection<InterfaceC10729t0>> f39856f;

        /* renamed from: g */
        private final InterfaceC10324h<C10163f, InterfaceC10584d1> f39857g;

        /* renamed from: h */
        private final InterfaceC10325i f39858h;

        /* renamed from: i */
        private final InterfaceC10325i f39859i;

        /* renamed from: j */
        final /* synthetic */ AbstractC10291h f39860j;

        /* JADX INFO: Add missing generic type declarations: [M] */
        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$c$a */
        static final class a<M> extends Lambda implements Function0<M> {

            /* renamed from: f */
            final /* synthetic */ InterfaceC10758q<M> f39861f;

            /* renamed from: g */
            final /* synthetic */ ByteArrayInputStream f39862g;

            /* renamed from: h */
            final /* synthetic */ AbstractC10291h f39863h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC10758q<M> interfaceC10758q, ByteArrayInputStream byteArrayInputStream, AbstractC10291h abstractC10291h) {
                super(0);
                this.f39861f = interfaceC10758q;
                this.f39862g = byteArrayInputStream;
                this.f39863h = abstractC10291h;
            }

            /* JADX WARN: Incorrect return type in method signature: ()TM; */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InterfaceC10756o invoke() {
                return (InterfaceC10756o) this.f39861f.mo38261c(this.f39862g, this.f39863h.m36325p().m36452c().m36425j());
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$c$b */
        static final class b extends Lambda implements Function0<Set<? extends C10163f>> {

            /* renamed from: g */
            final /* synthetic */ AbstractC10291h f39865g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(AbstractC10291h abstractC10291h) {
                super(0);
                this.f39865g = abstractC10291h;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Set<C10163f> invoke() {
                return C10824x0.m38925l(c.this.f39852b.keySet(), this.f39865g.mo36298t());
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$c$c, reason: collision with other inner class name */
        static final class C11567c extends Lambda implements Function1<C10163f, Collection<? extends InterfaceC10739y0>> {
            C11567c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Collection<InterfaceC10739y0> invoke(C10163f c10163f) {
                C9801m.m32346f(c10163f, "it");
                return c.this.m36372m(c10163f);
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$c$d */
        static final class d extends Lambda implements Function1<C10163f, Collection<? extends InterfaceC10729t0>> {
            d() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Collection<InterfaceC10729t0> invoke(C10163f c10163f) {
                C9801m.m32346f(c10163f, "it");
                return c.this.m36373n(c10163f);
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$c$e */
        static final class e extends Lambda implements Function1<C10163f, InterfaceC10584d1> {
            e() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InterfaceC10584d1 invoke(C10163f c10163f) {
                C9801m.m32346f(c10163f, "it");
                return c.this.m36374o(c10163f);
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$c$f */
        static final class f extends Lambda implements Function0<Set<? extends C10163f>> {

            /* renamed from: g */
            final /* synthetic */ AbstractC10291h f39870g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(AbstractC10291h abstractC10291h) {
                super(0);
                this.f39870g = abstractC10291h;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Set<C10163f> invoke() {
                return C10824x0.m38925l(c.this.f39853c.keySet(), this.f39870g.mo36299u());
            }
        }

        public c(AbstractC10291h abstractC10291h, List<C10130i> list, List<C10135n> list2, List<C10139r> list3) throws IOException {
            Map<C10163f, byte[]> mapM38797i;
            C9801m.m32346f(list, "functionList");
            C9801m.m32346f(list2, "propertyList");
            C9801m.m32346f(list3, "typeAliasList");
            this.f39860j = abstractC10291h;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                C10163f c10163fM36495b = C10314x.m36495b(abstractC10291h.m36325p().m36456g(), ((C10130i) ((InterfaceC10756o) obj)).m34723e0());
                Object arrayList = linkedHashMap.get(c10163fM36495b);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(c10163fM36495b, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            this.f39852b = m36375p(linkedHashMap);
            AbstractC10291h abstractC10291h2 = this.f39860j;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj2 : list2) {
                C10163f c10163fM36495b2 = C10314x.m36495b(abstractC10291h2.m36325p().m36456g(), ((C10135n) ((InterfaceC10756o) obj2)).m34887d0());
                Object arrayList2 = linkedHashMap2.get(c10163fM36495b2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap2.put(c10163fM36495b2, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            this.f39853c = m36375p(linkedHashMap2);
            if (this.f39860j.m36325p().m36452c().m36422g().mo36443f()) {
                AbstractC10291h abstractC10291h3 = this.f39860j;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj3 : list3) {
                    C10163f c10163fM36495b3 = C10314x.m36495b(abstractC10291h3.m36325p().m36456g(), ((C10139r) ((InterfaceC10756o) obj3)).m35138X());
                    Object arrayList3 = linkedHashMap3.get(c10163fM36495b3);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap3.put(c10163fM36495b3, arrayList3);
                    }
                    ((List) arrayList3).add(obj3);
                }
                mapM38797i = m36375p(linkedHashMap3);
            } else {
                mapM38797i = C10810q0.m38797i();
            }
            this.f39854d = mapM38797i;
            this.f39855e = this.f39860j.m36325p().m36457h().mo36520h(new C11567c());
            this.f39856f = this.f39860j.m36325p().m36457h().mo36520h(new d());
            this.f39857g = this.f39860j.m36325p().m36457h().mo36521i(new e());
            this.f39858h = this.f39860j.m36325p().m36457h().mo36516d(new b(this.f39860j));
            this.f39859i = this.f39860j.m36325p().m36457h().mo36516d(new f(this.f39860j));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
        /* renamed from: m */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0> m36372m(kotlin.reflect.p371y.internal.p374j0.p397f.C10163f r7) {
            /*
                r6 = this;
                java.util.Map<kotlin.f0.y.e.j0.f.f, byte[]> r0 = r6.f39852b
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.i> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10130i.f38832i
                java.lang.String r2 = "PARSER"
                kotlin.jvm.internal.C9801m.m32345e(r1, r2)
                kotlin.f0.y.e.j0.j.b.g0.h r2 = r6.f39860j
                java.lang.Object r0 = r0.get(r7)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L2a
                kotlin.f0.y.e.j0.j.b.g0.h r3 = r6.f39860j
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                kotlin.f0.y.e.j0.j.b.g0.h$c$a r0 = new kotlin.f0.y.e.j0.j.b.g0.h$c$a
                r0.<init>(r1, r4, r3)
                kotlin.g0.h r0 = kotlin.sequences.C10517i.m37352g(r0)
                java.util.List r0 = kotlin.sequences.C10517i.m37347A(r0)
                if (r0 == 0) goto L2a
                goto L2e
            L2a:
                java.util.List r0 = kotlin.collections.C10813s.m38848j()
            L2e:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r0.size()
                r1.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L3b:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L66
                java.lang.Object r3 = r0.next()
                kotlin.f0.y.e.j0.e.i r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10130i) r3
                kotlin.f0.y.e.j0.j.b.m r4 = r2.m36325p()
                kotlin.f0.y.e.j0.j.b.w r4 = r4.m36455f()
                java.lang.String r5 = "it"
                kotlin.jvm.internal.C9801m.m32345e(r3, r5)
                kotlin.reflect.jvm.internal.impl.descriptors.y0 r3 = r4.m36487j(r3)
                boolean r4 = r2.mo36300x(r3)
                if (r4 == 0) goto L5f
                goto L60
            L5f:
                r3 = 0
            L60:
                if (r3 == 0) goto L3b
                r1.add(r3)
                goto L3b
            L66:
                r2.mo36294k(r7, r1)
                java.util.List r7 = kotlin.reflect.jvm.internal.impl.utils.C10767a.m38510c(r1)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h.c.m36372m(kotlin.f0.y.e.j0.f.f):java.util.Collection");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
        /* renamed from: n */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0> m36373n(kotlin.reflect.p371y.internal.p374j0.p397f.C10163f r7) {
            /*
                r6 = this;
                java.util.Map<kotlin.f0.y.e.j0.f.f, byte[]> r0 = r6.f39853c
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.n> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10135n.f38914i
                java.lang.String r2 = "PARSER"
                kotlin.jvm.internal.C9801m.m32345e(r1, r2)
                kotlin.f0.y.e.j0.j.b.g0.h r2 = r6.f39860j
                java.lang.Object r0 = r0.get(r7)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L2a
                kotlin.f0.y.e.j0.j.b.g0.h r3 = r6.f39860j
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                kotlin.f0.y.e.j0.j.b.g0.h$c$a r0 = new kotlin.f0.y.e.j0.j.b.g0.h$c$a
                r0.<init>(r1, r4, r3)
                kotlin.g0.h r0 = kotlin.sequences.C10517i.m37352g(r0)
                java.util.List r0 = kotlin.sequences.C10517i.m37347A(r0)
                if (r0 == 0) goto L2a
                goto L2e
            L2a:
                java.util.List r0 = kotlin.collections.C10813s.m38848j()
            L2e:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r0.size()
                r1.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L3b:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L5e
                java.lang.Object r3 = r0.next()
                kotlin.f0.y.e.j0.e.n r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10135n) r3
                kotlin.f0.y.e.j0.j.b.m r4 = r2.m36325p()
                kotlin.f0.y.e.j0.j.b.w r4 = r4.m36455f()
                java.lang.String r5 = "it"
                kotlin.jvm.internal.C9801m.m32345e(r3, r5)
                kotlin.reflect.jvm.internal.impl.descriptors.t0 r3 = r4.m36488l(r3)
                if (r3 == 0) goto L3b
                r1.add(r3)
                goto L3b
            L5e:
                r2.mo36295l(r7, r1)
                java.util.List r7 = kotlin.reflect.jvm.internal.impl.utils.C10767a.m38510c(r1)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h.c.m36373n(kotlin.f0.y.e.j0.f.f):java.util.Collection");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public final InterfaceC10584d1 m36374o(C10163f c10163f) {
            C10139r c10139rM35130o0;
            byte[] bArr = this.f39854d.get(c10163f);
            if (bArr == null || (c10139rM35130o0 = C10139r.m35130o0(new ByteArrayInputStream(bArr), this.f39860j.m36325p().m36452c().m36425j())) == null) {
                return null;
            }
            return this.f39860j.m36325p().m36455f().m36489m(c10139rM35130o0);
        }

        /* renamed from: p */
        private final Map<C10163f, byte[]> m36375p(Map<C10163f, ? extends Collection<? extends AbstractC10742a>> map) throws IOException {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C10808p0.m38793e(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(C10819v.m38911u(iterable, 10));
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    ((AbstractC10742a) it2.next()).m38256i(byteArrayOutputStream);
                    arrayList.add(C10775u.f41439a);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h.a
        /* renamed from: a */
        public Collection<InterfaceC10739y0> mo36328a(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
            C9801m.m32346f(c10163f, "name");
            C9801m.m32346f(interfaceC9939b, "location");
            return !mo36329b().contains(c10163f) ? C10817u.m38888j() : this.f39855e.invoke(c10163f);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h.a
        /* renamed from: b */
        public Set<C10163f> mo36329b() {
            return (Set) C10329m.m36555a(this.f39858h, this, f39851a[0]);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h.a
        /* renamed from: c */
        public Collection<InterfaceC10729t0> mo36330c(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
            C9801m.m32346f(c10163f, "name");
            C9801m.m32346f(interfaceC9939b, "location");
            return !mo36331d().contains(c10163f) ? C10817u.m38888j() : this.f39856f.invoke(c10163f);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h.a
        /* renamed from: d */
        public Set<C10163f> mo36331d() {
            return (Set) C10329m.m36555a(this.f39859i, this, f39851a[1]);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h.a
        /* renamed from: e */
        public Set<C10163f> mo36332e() {
            return this.f39854d.keySet();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h.a
        /* renamed from: f */
        public void mo36333f(Collection<InterfaceC10609m> collection, C10247d c10247d, Function1<? super C10163f, Boolean> function1, InterfaceC9939b interfaceC9939b) {
            C9801m.m32346f(collection, "result");
            C9801m.m32346f(c10247d, "kindFilter");
            C9801m.m32346f(function1, "nameFilter");
            C9801m.m32346f(interfaceC9939b, "location");
            if (c10247d.m36137a(C10247d.f39630a.m36150i())) {
                Set<C10163f> setMo36331d = mo36331d();
                ArrayList arrayList = new ArrayList();
                for (C10163f c10163f : setMo36331d) {
                    if (function1.invoke(c10163f).booleanValue()) {
                        arrayList.addAll(mo36330c(c10163f, interfaceC9939b));
                    }
                }
                C10190g c10190g = C10190g.f39518f;
                C9801m.m32345e(c10190g, "INSTANCE");
                C10825y.m38928y(arrayList, c10190g);
                collection.addAll(arrayList);
            }
            if (c10247d.m36137a(C10247d.f39630a.m36145d())) {
                Set<C10163f> setMo36329b = mo36329b();
                ArrayList arrayList2 = new ArrayList();
                for (C10163f c10163f2 : setMo36329b) {
                    if (function1.invoke(c10163f2).booleanValue()) {
                        arrayList2.addAll(mo36328a(c10163f2, interfaceC9939b));
                    }
                }
                C10190g c10190g2 = C10190g.f39518f;
                C9801m.m32345e(c10190g2, "INSTANCE");
                C10825y.m38928y(arrayList2, c10190g2);
                collection.addAll(arrayList2);
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h.a
        /* renamed from: g */
        public InterfaceC10584d1 mo36334g(C10163f c10163f) {
            C9801m.m32346f(c10163f, "name");
            return this.f39857g.invoke(c10163f);
        }
    }

    /* compiled from: DeserializedMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$d */
    static final class d extends Lambda implements Function0<Set<? extends C10163f>> {

        /* renamed from: f */
        final /* synthetic */ Function0<Collection<C10163f>> f39871f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function0<? extends Collection<C10163f>> function0) {
            super(0);
            this.f39871f = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Set<C10163f> invoke() {
            return C10782c0.m38574I0(this.f39871f.invoke());
        }
    }

    /* compiled from: DeserializedMemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.g0.h$e */
    static final class e extends Lambda implements Function0<Set<? extends C10163f>> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Set<C10163f> invoke() {
            Set<C10163f> setMo36297s = AbstractC10291h.this.mo36297s();
            if (setMo36297s == null) {
                return null;
            }
            return C10824x0.m38925l(C10824x0.m38925l(AbstractC10291h.this.m36326q(), AbstractC10291h.this.f39821d.mo36332e()), setMo36297s);
        }
    }

    protected AbstractC10291h(C10303m c10303m, List<C10130i> list, List<C10135n> list2, List<C10139r> list3, Function0<? extends Collection<C10163f>> function0) {
        C9801m.m32346f(c10303m, "c");
        C9801m.m32346f(list, "functionList");
        C9801m.m32346f(list2, "propertyList");
        C9801m.m32346f(list3, "typeAliasList");
        C9801m.m32346f(function0, "classNames");
        this.f39820c = c10303m;
        this.f39821d = m36320n(list, list2, list3);
        this.f39822e = c10303m.m36457h().mo36516d(new d(function0));
        this.f39823f = c10303m.m36457h().mo36518f(new e());
    }

    /* renamed from: n */
    private final a m36320n(List<C10130i> list, List<C10135n> list2, List<C10139r> list3) {
        return this.f39820c.m36452c().m36422g().mo36438a() ? new b(this, list, list2, list3) : new c(this, list, list2, list3);
    }

    /* renamed from: o */
    private final InterfaceC10585e m36321o(C10163f c10163f) {
        return this.f39820c.m36452c().m36417b(mo36296m(c10163f));
    }

    /* renamed from: r */
    private final Set<C10163f> m36322r() {
        return (Set) C10329m.m36556b(this.f39823f, this, f39819b[1]);
    }

    /* renamed from: v */
    private final InterfaceC10584d1 m36323v(C10163f c10163f) {
        return this.f39821d.mo36334g(c10163f);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: a */
    public Collection<InterfaceC10739y0> mo33311a(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        return this.f39821d.mo36328a(c10163f, interfaceC9939b);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: b */
    public Set<C10163f> mo33312b() {
        return this.f39821d.mo36329b();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: c */
    public Collection<InterfaceC10729t0> mo33313c(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        return this.f39821d.mo36330c(c10163f, interfaceC9939b);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: d */
    public Set<C10163f> mo33314d() {
        return this.f39821d.mo36331d();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: e */
    public Set<C10163f> mo33315e() {
        return m36322r();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k
    /* renamed from: f */
    public InterfaceC10594h mo33316f(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        if (mo36327w(c10163f)) {
            return m36321o(c10163f);
        }
        if (this.f39821d.mo36332e().contains(c10163f)) {
            return m36323v(c10163f);
        }
        return null;
    }

    /* renamed from: i */
    protected abstract void mo36293i(Collection<InterfaceC10609m> collection, Function1<? super C10163f, Boolean> function1);

    /* renamed from: j */
    protected final Collection<InterfaceC10609m> m36324j(C10247d c10247d, Function1<? super C10163f, Boolean> function1, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10247d, "kindFilter");
        C9801m.m32346f(function1, "nameFilter");
        C9801m.m32346f(interfaceC9939b, "location");
        ArrayList arrayList = new ArrayList(0);
        C10247d.a aVar = C10247d.f39630a;
        if (c10247d.m36137a(aVar.m36148g())) {
            mo36293i(arrayList, function1);
        }
        this.f39821d.mo36333f(arrayList, c10247d, function1, interfaceC9939b);
        if (c10247d.m36137a(aVar.m36144c())) {
            for (C10163f c10163f : m36326q()) {
                if (function1.invoke(c10163f).booleanValue()) {
                    C10767a.m38508a(arrayList, m36321o(c10163f));
                }
            }
        }
        if (c10247d.m36137a(C10247d.f39630a.m36149h())) {
            for (C10163f c10163f2 : this.f39821d.mo36332e()) {
                if (function1.invoke(c10163f2).booleanValue()) {
                    C10767a.m38508a(arrayList, this.f39821d.mo36334g(c10163f2));
                }
            }
        }
        return C10767a.m38510c(arrayList);
    }

    /* renamed from: k */
    protected void mo36294k(C10163f c10163f, List<InterfaceC10739y0> list) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(list, "functions");
    }

    /* renamed from: l */
    protected void mo36295l(C10163f c10163f, List<InterfaceC10729t0> list) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(list, "descriptors");
    }

    /* renamed from: m */
    protected abstract C10159b mo36296m(C10163f c10163f);

    /* renamed from: p */
    protected final C10303m m36325p() {
        return this.f39820c;
    }

    /* renamed from: q */
    public final Set<C10163f> m36326q() {
        return (Set) C10329m.m36555a(this.f39822e, this, f39819b[0]);
    }

    /* renamed from: s */
    protected abstract Set<C10163f> mo36297s();

    /* renamed from: t */
    protected abstract Set<C10163f> mo36298t();

    /* renamed from: u */
    protected abstract Set<C10163f> mo36299u();

    /* renamed from: w */
    protected boolean mo36327w(C10163f c10163f) {
        C9801m.m32346f(c10163f, "name");
        return m36326q().contains(c10163f);
    }

    /* renamed from: x */
    protected boolean mo36300x(InterfaceC10739y0 interfaceC10739y0) {
        C9801m.m32346f(interfaceC10739y0, "function");
        return true;
    }
}
