package Fb;

import Ab.d;
import Db.C1010p;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1700m;
import Ra.Z;
import Ra.g0;
import Ra.l0;
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
import kotlin.collections.V;
import kotlin.jvm.internal.C3862t;
import lb.C3929i;
import lb.C3934n;
import lb.C3938r;
import oa.C4153F;
import tb.C4600l;

/* compiled from: DeserializedMemberScope.kt */
/* loaded from: classes3.dex */
public abstract class w extends Ab.l {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ Ia.m<Object>[] f4682f = {kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(w.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(w.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};

    /* renamed from: b, reason: collision with root package name */
    private final C1010p f4683b;

    /* renamed from: c, reason: collision with root package name */
    private final a f4684c;

    /* renamed from: d, reason: collision with root package name */
    private final Gb.i f4685d;

    /* renamed from: e, reason: collision with root package name */
    private final Gb.j f4686e;

    /* compiled from: DeserializedMemberScope.kt */
    private interface a {
        Set<qb.f> a();

        Collection<g0> b(qb.f fVar, Za.b bVar);

        Set<qb.f> c();

        Collection<Z> d(qb.f fVar, Za.b bVar);

        Set<qb.f> e();

        l0 f(qb.f fVar);

        void g(Collection<InterfaceC1700m> collection, Ab.d dVar, Ba.l<? super qb.f, Boolean> lVar, Za.b bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DeserializedMemberScope.kt */
    final class b implements a {

        /* renamed from: o, reason: collision with root package name */
        static final /* synthetic */ Ia.m<Object>[] f4687o = {kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(b.class), "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;")), kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(b.class), "declaredProperties", "getDeclaredProperties()Ljava/util/List;")), kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(b.class), "allTypeAliases", "getAllTypeAliases()Ljava/util/List;")), kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(b.class), "allFunctions", "getAllFunctions()Ljava/util/List;")), kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(b.class), "allProperties", "getAllProperties()Ljava/util/List;")), kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(b.class), "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;")), kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(b.class), "functionsByName", "getFunctionsByName()Ljava/util/Map;")), kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(b.class), "propertiesByName", "getPropertiesByName()Ljava/util/Map;")), kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(b.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(b.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* renamed from: a, reason: collision with root package name */
        private final List<C3929i> f4688a;

        /* renamed from: b, reason: collision with root package name */
        private final List<C3934n> f4689b;

        /* renamed from: c, reason: collision with root package name */
        private final List<C3938r> f4690c;

        /* renamed from: d, reason: collision with root package name */
        private final Gb.i f4691d;

        /* renamed from: e, reason: collision with root package name */
        private final Gb.i f4692e;

        /* renamed from: f, reason: collision with root package name */
        private final Gb.i f4693f;

        /* renamed from: g, reason: collision with root package name */
        private final Gb.i f4694g;

        /* renamed from: h, reason: collision with root package name */
        private final Gb.i f4695h;

        /* renamed from: i, reason: collision with root package name */
        private final Gb.i f4696i;

        /* renamed from: j, reason: collision with root package name */
        private final Gb.i f4697j;

        /* renamed from: k, reason: collision with root package name */
        private final Gb.i f4698k;

        /* renamed from: l, reason: collision with root package name */
        private final Gb.i f4699l;

        /* renamed from: m, reason: collision with root package name */
        private final Gb.i f4700m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ w f4701n;

        public b(w wVar, List<C3929i> functionList, List<C3934n> propertyList, List<C3938r> typeAliasList) {
            C3862t.g(functionList, "functionList");
            C3862t.g(propertyList, "propertyList");
            C3862t.g(typeAliasList, "typeAliasList");
            this.f4701n = wVar;
            this.f4688a = functionList;
            this.f4689b = propertyList;
            this.f4690c = wVar.s().c().g().g() ? typeAliasList : kotlin.collections.r.m();
            this.f4691d = wVar.s().h().g(new x(this));
            this.f4692e = wVar.s().h().g(new y(this));
            this.f4693f = wVar.s().h().g(new z(this));
            this.f4694g = wVar.s().h().g(new A(this));
            this.f4695h = wVar.s().h().g(new B(this));
            this.f4696i = wVar.s().h().g(new C(this));
            this.f4697j = wVar.s().h().g(new D(this));
            this.f4698k = wVar.s().h().g(new E(this));
            this.f4699l = wVar.s().h().g(new F(this, wVar));
            this.f4700m = wVar.s().h().g(new G(this, wVar));
        }

        private final List<l0> A() {
            List<C3938r> list = this.f4690c;
            w wVar = this.f4701n;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                l0 l0VarZ = wVar.s().f().z((C3938r) ((kotlin.reflect.jvm.internal.impl.protobuf.o) it.next()));
                if (l0VarZ != null) {
                    arrayList.add(l0VarZ);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List B(b bVar) {
            return bVar.w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List C(b bVar) {
            return bVar.z();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set D(b bVar, w wVar) {
            List<C3929i> list = bVar.f4688a;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            w wVar2 = bVar.f4701n;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(Db.L.b(wVar2.s().g(), ((C3929i) ((kotlin.reflect.jvm.internal.impl.protobuf.o) it.next())).e0()));
            }
            return V.j(linkedHashSet, wVar.w());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map E(b bVar) {
            List<g0> listF = bVar.F();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : listF) {
                qb.f name = ((g0) obj).getName();
                C3862t.f(name, "getName(...)");
                Object arrayList = linkedHashMap.get(name);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(name, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            return linkedHashMap;
        }

        private final List<g0> F() {
            return (List) Gb.m.a(this.f4694g, this, f4687o[3]);
        }

        private final List<Z> G() {
            return (List) Gb.m.a(this.f4695h, this, f4687o[4]);
        }

        private final List<l0> H() {
            return (List) Gb.m.a(this.f4693f, this, f4687o[2]);
        }

        private final List<g0> I() {
            return (List) Gb.m.a(this.f4691d, this, f4687o[0]);
        }

        private final List<Z> J() {
            return (List) Gb.m.a(this.f4692e, this, f4687o[1]);
        }

        private final Map<qb.f, Collection<g0>> K() {
            return (Map) Gb.m.a(this.f4697j, this, f4687o[6]);
        }

        private final Map<qb.f, Collection<Z>> L() {
            return (Map) Gb.m.a(this.f4698k, this, f4687o[7]);
        }

        private final Map<qb.f, l0> M() {
            return (Map) Gb.m.a(this.f4696i, this, f4687o[5]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map N(b bVar) {
            List<Z> listG = bVar.G();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : listG) {
                qb.f name = ((Z) obj).getName();
                C3862t.f(name, "getName(...)");
                Object arrayList = linkedHashMap.get(name);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(name, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map O(b bVar) {
            List<l0> listH = bVar.H();
            LinkedHashMap linkedHashMap = new LinkedHashMap(Ha.g.d(kotlin.collections.M.d(kotlin.collections.r.x(listH, 10)), 16));
            for (Object obj : listH) {
                qb.f name = ((l0) obj).getName();
                C3862t.f(name, "getName(...)");
                linkedHashMap.put(name, obj);
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set P(b bVar, w wVar) {
            List<C3934n> list = bVar.f4689b;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            w wVar2 = bVar.f4701n;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(Db.L.b(wVar2.s().g(), ((C3934n) ((kotlin.reflect.jvm.internal.impl.protobuf.o) it.next())).d0()));
            }
            return V.j(linkedHashSet, wVar.x());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List r(b bVar) {
            return kotlin.collections.r.F0(bVar.I(), bVar.u());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List s(b bVar) {
            return kotlin.collections.r.F0(bVar.J(), bVar.v());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List t(b bVar) {
            return bVar.A();
        }

        private final List<g0> u() {
            Set<qb.f> setW = this.f4701n.w();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setW.iterator();
            while (it.hasNext()) {
                kotlin.collections.r.D(arrayList, x((qb.f) it.next()));
            }
            return arrayList;
        }

        private final List<Z> v() {
            Set<qb.f> setX = this.f4701n.x();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setX.iterator();
            while (it.hasNext()) {
                kotlin.collections.r.D(arrayList, y((qb.f) it.next()));
            }
            return arrayList;
        }

        private final List<g0> w() {
            List<C3929i> list = this.f4688a;
            w wVar = this.f4701n;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                g0 g0VarS = wVar.s().f().s((C3929i) ((kotlin.reflect.jvm.internal.impl.protobuf.o) it.next()));
                if (!wVar.A(g0VarS)) {
                    g0VarS = null;
                }
                if (g0VarS != null) {
                    arrayList.add(g0VarS);
                }
            }
            return arrayList;
        }

        private final List<g0> x(qb.f fVar) {
            List<g0> listI = I();
            w wVar = this.f4701n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listI) {
                if (C3862t.b(((InterfaceC1700m) obj).getName(), fVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            wVar.n(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        private final List<Z> y(qb.f fVar) {
            List<Z> listJ = J();
            w wVar = this.f4701n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listJ) {
                if (C3862t.b(((InterfaceC1700m) obj).getName(), fVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            wVar.o(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        private final List<Z> z() {
            List<C3934n> list = this.f4689b;
            w wVar = this.f4701n;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Z zU = wVar.s().f().u((C3934n) ((kotlin.reflect.jvm.internal.impl.protobuf.o) it.next()));
                if (zU != null) {
                    arrayList.add(zU);
                }
            }
            return arrayList;
        }

        @Override // Fb.w.a
        public Set<qb.f> a() {
            return (Set) Gb.m.a(this.f4699l, this, f4687o[8]);
        }

        @Override // Fb.w.a
        public Collection<g0> b(qb.f name, Za.b location) {
            C3862t.g(name, "name");
            C3862t.g(location, "location");
            if (!a().contains(name)) {
                return kotlin.collections.r.m();
            }
            Collection<g0> collection = K().get(name);
            return collection == null ? kotlin.collections.r.m() : collection;
        }

        @Override // Fb.w.a
        public Set<qb.f> c() {
            return (Set) Gb.m.a(this.f4700m, this, f4687o[9]);
        }

        @Override // Fb.w.a
        public Collection<Z> d(qb.f name, Za.b location) {
            C3862t.g(name, "name");
            C3862t.g(location, "location");
            if (!c().contains(name)) {
                return kotlin.collections.r.m();
            }
            Collection<Z> collection = L().get(name);
            return collection == null ? kotlin.collections.r.m() : collection;
        }

        @Override // Fb.w.a
        public Set<qb.f> e() {
            List<C3938r> list = this.f4690c;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            w wVar = this.f4701n;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(Db.L.b(wVar.s().g(), ((C3938r) ((kotlin.reflect.jvm.internal.impl.protobuf.o) it.next())).X()));
            }
            return linkedHashSet;
        }

        @Override // Fb.w.a
        public l0 f(qb.f name) {
            C3862t.g(name, "name");
            return M().get(name);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Fb.w.a
        public void g(Collection<InterfaceC1700m> result, Ab.d kindFilter, Ba.l<? super qb.f, Boolean> nameFilter, Za.b location) {
            C3862t.g(result, "result");
            C3862t.g(kindFilter, "kindFilter");
            C3862t.g(nameFilter, "nameFilter");
            C3862t.g(location, "location");
            if (kindFilter.a(Ab.d.f1109c.i())) {
                for (Object obj : G()) {
                    qb.f name = ((Z) obj).getName();
                    C3862t.f(name, "getName(...)");
                    if (nameFilter.invoke(name).booleanValue()) {
                        result.add(obj);
                    }
                }
            }
            if (kindFilter.a(Ab.d.f1109c.d())) {
                for (Object obj2 : F()) {
                    qb.f name2 = ((g0) obj2).getName();
                    C3862t.f(name2, "getName(...)");
                    if (nameFilter.invoke(name2).booleanValue()) {
                        result.add(obj2);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DeserializedMemberScope.kt */
    final class c implements a {

        /* renamed from: j, reason: collision with root package name */
        static final /* synthetic */ Ia.m<Object>[] f4702j = {kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(c.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(c.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* renamed from: a, reason: collision with root package name */
        private final Map<qb.f, byte[]> f4703a;

        /* renamed from: b, reason: collision with root package name */
        private final Map<qb.f, byte[]> f4704b;

        /* renamed from: c, reason: collision with root package name */
        private final Map<qb.f, byte[]> f4705c;

        /* renamed from: d, reason: collision with root package name */
        private final Gb.g<qb.f, Collection<g0>> f4706d;

        /* renamed from: e, reason: collision with root package name */
        private final Gb.g<qb.f, Collection<Z>> f4707e;

        /* renamed from: f, reason: collision with root package name */
        private final Gb.h<qb.f, l0> f4708f;

        /* renamed from: g, reason: collision with root package name */
        private final Gb.i f4709g;

        /* renamed from: h, reason: collision with root package name */
        private final Gb.i f4710h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ w f4711i;

        /* compiled from: DeserializedMemberScope.kt */
        public static final class a implements Ba.a {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.q f4712B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ ByteArrayInputStream f4713C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ w f4714D;

            public a(kotlin.reflect.jvm.internal.impl.protobuf.q qVar, ByteArrayInputStream byteArrayInputStream, w wVar) {
                this.f4712B = qVar;
                this.f4713C = byteArrayInputStream;
                this.f4714D = wVar;
            }

            @Override // Ba.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.protobuf.o invoke() {
                return (kotlin.reflect.jvm.internal.impl.protobuf.o) this.f4712B.c(this.f4713C, this.f4714D.s().c().k());
            }
        }

        public c(w wVar, List<C3929i> functionList, List<C3934n> propertyList, List<C3938r> typeAliasList) throws IOException {
            Map<qb.f, byte[]> mapH;
            C3862t.g(functionList, "functionList");
            C3862t.g(propertyList, "propertyList");
            C3862t.g(typeAliasList, "typeAliasList");
            this.f4711i = wVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : functionList) {
                qb.f fVarB = Db.L.b(wVar.s().g(), ((C3929i) ((kotlin.reflect.jvm.internal.impl.protobuf.o) obj)).e0());
                Object arrayList = linkedHashMap.get(fVarB);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(fVarB, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            this.f4703a = r(linkedHashMap);
            w wVar2 = this.f4711i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj2 : propertyList) {
                qb.f fVarB2 = Db.L.b(wVar2.s().g(), ((C3934n) ((kotlin.reflect.jvm.internal.impl.protobuf.o) obj2)).d0());
                Object arrayList2 = linkedHashMap2.get(fVarB2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap2.put(fVarB2, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            this.f4704b = r(linkedHashMap2);
            if (this.f4711i.s().c().g().g()) {
                w wVar3 = this.f4711i;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj3 : typeAliasList) {
                    qb.f fVarB3 = Db.L.b(wVar3.s().g(), ((C3938r) ((kotlin.reflect.jvm.internal.impl.protobuf.o) obj3)).X());
                    Object arrayList3 = linkedHashMap3.get(fVarB3);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap3.put(fVarB3, arrayList3);
                    }
                    ((List) arrayList3).add(obj3);
                }
                mapH = r(linkedHashMap3);
            } else {
                mapH = kotlin.collections.M.h();
            }
            this.f4705c = mapH;
            this.f4706d = this.f4711i.s().h().h(new H(this));
            this.f4707e = this.f4711i.s().h().h(new I(this));
            this.f4708f = this.f4711i.s().h().e(new J(this));
            this.f4709g = this.f4711i.s().h().g(new K(this, this.f4711i));
            this.f4710h = this.f4711i.s().h().g(new L(this, this.f4711i));
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final java.util.Collection<Ra.g0> m(qb.f r6) {
            /*
                r5 = this;
                java.util.Map<qb.f, byte[]> r0 = r5.f4703a
                kotlin.reflect.jvm.internal.impl.protobuf.q<lb.i> r1 = lb.C3929i.f44698X
                java.lang.String r2 = "PARSER"
                kotlin.jvm.internal.C3862t.f(r1, r2)
                Fb.w r2 = r5.f4711i
                java.lang.Object r0 = r0.get(r6)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L2c
                Fb.w r3 = r5.f4711i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                Fb.w$c$a r0 = new Fb.w$c$a
                r0.<init>(r1, r4, r3)
                Tb.h r0 = Tb.k.h(r0)
                java.util.List r0 = Tb.k.H(r0)
                if (r0 == 0) goto L2c
                java.util.Collection r0 = (java.util.Collection) r0
                goto L32
            L2c:
                java.util.List r0 = kotlin.collections.r.m()
                java.util.Collection r0 = (java.util.Collection) r0
            L32:
                r1 = r0
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r3 = new java.util.ArrayList
                int r0 = r0.size()
                r3.<init>(r0)
                java.util.Iterator r0 = r1.iterator()
            L42:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L6b
                java.lang.Object r1 = r0.next()
                lb.i r1 = (lb.C3929i) r1
                Db.p r4 = r2.s()
                Db.K r4 = r4.f()
                kotlin.jvm.internal.C3862t.d(r1)
                Ra.g0 r1 = r4.s(r1)
                boolean r4 = r2.A(r1)
                if (r4 == 0) goto L64
                goto L65
            L64:
                r1 = 0
            L65:
                if (r1 == 0) goto L42
                r3.add(r1)
                goto L42
            L6b:
                r2.n(r6, r3)
                java.util.List r6 = Rb.a.c(r3)
                java.util.Collection r6 = (java.util.Collection) r6
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Fb.w.c.m(qb.f):java.util.Collection");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final java.util.Collection<Ra.Z> n(qb.f r6) {
            /*
                r5 = this;
                java.util.Map<qb.f, byte[]> r0 = r5.f4704b
                kotlin.reflect.jvm.internal.impl.protobuf.q<lb.n> r1 = lb.C3934n.f44780X
                java.lang.String r2 = "PARSER"
                kotlin.jvm.internal.C3862t.f(r1, r2)
                Fb.w r2 = r5.f4711i
                java.lang.Object r0 = r0.get(r6)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L2c
                Fb.w r3 = r5.f4711i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                Fb.w$c$a r0 = new Fb.w$c$a
                r0.<init>(r1, r4, r3)
                Tb.h r0 = Tb.k.h(r0)
                java.util.List r0 = Tb.k.H(r0)
                if (r0 == 0) goto L2c
                java.util.Collection r0 = (java.util.Collection) r0
                goto L32
            L2c:
                java.util.List r0 = kotlin.collections.r.m()
                java.util.Collection r0 = (java.util.Collection) r0
            L32:
                r1 = r0
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r3 = new java.util.ArrayList
                int r0 = r0.size()
                r3.<init>(r0)
                java.util.Iterator r0 = r1.iterator()
            L42:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L63
                java.lang.Object r1 = r0.next()
                lb.n r1 = (lb.C3934n) r1
                Db.p r4 = r2.s()
                Db.K r4 = r4.f()
                kotlin.jvm.internal.C3862t.d(r1)
                Ra.Z r1 = r4.u(r1)
                if (r1 == 0) goto L42
                r3.add(r1)
                goto L42
            L63:
                r2.o(r6, r3)
                java.util.List r6 = Rb.a.c(r3)
                java.util.Collection r6 = (java.util.Collection) r6
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Fb.w.c.n(qb.f):java.util.Collection");
        }

        private final l0 o(qb.f fVar) {
            C3938r c3938rP0;
            byte[] bArr = this.f4705c.get(fVar);
            if (bArr == null || (c3938rP0 = C3938r.p0(new ByteArrayInputStream(bArr), this.f4711i.s().c().k())) == null) {
                return null;
            }
            return this.f4711i.s().f().z(c3938rP0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set p(c cVar, w wVar) {
            return V.j(cVar.f4703a.keySet(), wVar.w());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection q(c cVar, qb.f it) {
            C3862t.g(it, "it");
            return cVar.m(it);
        }

        private final Map<qb.f, byte[]> r(Map<qb.f, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.protobuf.a>> map) throws IOException {
            LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.M.d(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(kotlin.collections.r.x(iterable, 10));
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    ((kotlin.reflect.jvm.internal.impl.protobuf.a) it2.next()).j(byteArrayOutputStream);
                    arrayList.add(C4153F.f46609a);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection s(c cVar, qb.f it) {
            C3862t.g(it, "it");
            return cVar.n(it);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l0 t(c cVar, qb.f it) {
            C3862t.g(it, "it");
            return cVar.o(it);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set u(c cVar, w wVar) {
            return V.j(cVar.f4704b.keySet(), wVar.x());
        }

        @Override // Fb.w.a
        public Set<qb.f> a() {
            return (Set) Gb.m.a(this.f4709g, this, f4702j[0]);
        }

        @Override // Fb.w.a
        public Collection<g0> b(qb.f name, Za.b location) {
            C3862t.g(name, "name");
            C3862t.g(location, "location");
            return !a().contains(name) ? kotlin.collections.r.m() : this.f4706d.invoke(name);
        }

        @Override // Fb.w.a
        public Set<qb.f> c() {
            return (Set) Gb.m.a(this.f4710h, this, f4702j[1]);
        }

        @Override // Fb.w.a
        public Collection<Z> d(qb.f name, Za.b location) {
            C3862t.g(name, "name");
            C3862t.g(location, "location");
            return !c().contains(name) ? kotlin.collections.r.m() : this.f4707e.invoke(name);
        }

        @Override // Fb.w.a
        public Set<qb.f> e() {
            return this.f4705c.keySet();
        }

        @Override // Fb.w.a
        public l0 f(qb.f name) {
            C3862t.g(name, "name");
            return this.f4708f.invoke(name);
        }

        @Override // Fb.w.a
        public void g(Collection<InterfaceC1700m> result, Ab.d kindFilter, Ba.l<? super qb.f, Boolean> nameFilter, Za.b location) {
            C3862t.g(result, "result");
            C3862t.g(kindFilter, "kindFilter");
            C3862t.g(nameFilter, "nameFilter");
            C3862t.g(location, "location");
            if (kindFilter.a(Ab.d.f1109c.i())) {
                Set<qb.f> setC = c();
                ArrayList arrayList = new ArrayList();
                for (qb.f fVar : setC) {
                    if (nameFilter.invoke(fVar).booleanValue()) {
                        arrayList.addAll(d(fVar, location));
                    }
                }
                C4600l INSTANCE = C4600l.f50025B;
                C3862t.f(INSTANCE, "INSTANCE");
                kotlin.collections.r.C(arrayList, INSTANCE);
                result.addAll(arrayList);
            }
            if (kindFilter.a(Ab.d.f1109c.d())) {
                Set<qb.f> setA = a();
                ArrayList arrayList2 = new ArrayList();
                for (qb.f fVar2 : setA) {
                    if (nameFilter.invoke(fVar2).booleanValue()) {
                        arrayList2.addAll(b(fVar2, location));
                    }
                }
                C4600l INSTANCE2 = C4600l.f50025B;
                C3862t.f(INSTANCE2, "INSTANCE");
                kotlin.collections.r.C(arrayList2, INSTANCE2);
                result.addAll(arrayList2);
            }
        }
    }

    protected w(C1010p c10, List<C3929i> functionList, List<C3934n> propertyList, List<C3938r> typeAliasList, Ba.a<? extends Collection<qb.f>> classNames) {
        C3862t.g(c10, "c");
        C3862t.g(functionList, "functionList");
        C3862t.g(propertyList, "propertyList");
        C3862t.g(typeAliasList, "typeAliasList");
        C3862t.g(classNames, "classNames");
        this.f4683b = c10;
        this.f4684c = q(functionList, propertyList, typeAliasList);
        this.f4685d = c10.h().g(new u(classNames));
        this.f4686e = c10.h().i(new v(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set k(Ba.a aVar) {
        return kotlin.collections.r.b1((Iterable) aVar.invoke());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set l(w wVar) {
        Set<qb.f> setV = wVar.v();
        if (setV == null) {
            return null;
        }
        return V.j(V.j(wVar.t(), wVar.f4684c.e()), setV);
    }

    private final a q(List<C3929i> list, List<C3934n> list2, List<C3938r> list3) {
        return this.f4683b.c().g().a() ? new b(this, list, list2, list3) : new c(this, list, list2, list3);
    }

    private final InterfaceC1692e r(qb.f fVar) {
        return this.f4683b.c().b(p(fVar));
    }

    private final Set<qb.f> u() {
        return (Set) Gb.m.b(this.f4686e, this, f4682f[1]);
    }

    private final l0 y(qb.f fVar) {
        return this.f4684c.f(fVar);
    }

    protected boolean A(g0 function) {
        C3862t.g(function, "function");
        return true;
    }

    @Override // Ab.l, Ab.k
    public Set<qb.f> a() {
        return this.f4684c.a();
    }

    @Override // Ab.l, Ab.k
    public Collection<g0> b(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        return this.f4684c.b(name, location);
    }

    @Override // Ab.l, Ab.k
    public Set<qb.f> c() {
        return this.f4684c.c();
    }

    @Override // Ab.l, Ab.k
    public Collection<Z> d(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        return this.f4684c.d(name, location);
    }

    @Override // Ab.l, Ab.k
    public Set<qb.f> e() {
        return u();
    }

    @Override // Ab.l, Ab.n
    public InterfaceC1695h g(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        if (z(name)) {
            return r(name);
        }
        if (this.f4684c.e().contains(name)) {
            return y(name);
        }
        return null;
    }

    protected abstract void j(Collection<InterfaceC1700m> collection, Ba.l<? super qb.f, Boolean> lVar);

    protected final Collection<InterfaceC1700m> m(Ab.d kindFilter, Ba.l<? super qb.f, Boolean> nameFilter, Za.b location) {
        C3862t.g(kindFilter, "kindFilter");
        C3862t.g(nameFilter, "nameFilter");
        C3862t.g(location, "location");
        ArrayList arrayList = new ArrayList(0);
        d.a aVar = Ab.d.f1109c;
        if (kindFilter.a(aVar.g())) {
            j(arrayList, nameFilter);
        }
        this.f4684c.g(arrayList, kindFilter, nameFilter, location);
        if (kindFilter.a(aVar.c())) {
            for (qb.f fVar : t()) {
                if (nameFilter.invoke(fVar).booleanValue()) {
                    Rb.a.a(arrayList, r(fVar));
                }
            }
        }
        if (kindFilter.a(Ab.d.f1109c.h())) {
            for (qb.f fVar2 : this.f4684c.e()) {
                if (nameFilter.invoke(fVar2).booleanValue()) {
                    Rb.a.a(arrayList, this.f4684c.f(fVar2));
                }
            }
        }
        return Rb.a.c(arrayList);
    }

    protected void n(qb.f name, List<g0> functions) {
        C3862t.g(name, "name");
        C3862t.g(functions, "functions");
    }

    protected void o(qb.f name, List<Z> descriptors) {
        C3862t.g(name, "name");
        C3862t.g(descriptors, "descriptors");
    }

    protected abstract qb.b p(qb.f fVar);

    protected final C1010p s() {
        return this.f4683b;
    }

    public final Set<qb.f> t() {
        return (Set) Gb.m.a(this.f4685d, this, f4682f[0]);
    }

    protected abstract Set<qb.f> v();

    protected abstract Set<qb.f> w();

    protected abstract Set<qb.f> x();

    protected boolean z(qb.f name) {
        C3862t.g(name, "name");
        return t().contains(name);
    }
}
