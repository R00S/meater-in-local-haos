package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes2.dex */
public final class Gson {

    /* renamed from: A, reason: collision with root package name */
    static final d f38805A = c.f38841B;

    /* renamed from: B, reason: collision with root package name */
    static final t f38806B = s.f39128B;

    /* renamed from: C, reason: collision with root package name */
    static final t f38807C = s.f39129C;

    /* renamed from: z, reason: collision with root package name */
    static final String f38808z = null;

    /* renamed from: a, reason: collision with root package name */
    private final ThreadLocal<Map<P9.a<?>, TypeAdapter<?>>> f38809a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<P9.a<?>, TypeAdapter<?>> f38810b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.gson.internal.c f38811c;

    /* renamed from: d, reason: collision with root package name */
    private final JsonAdapterAnnotationTypeAdapterFactory f38812d;

    /* renamed from: e, reason: collision with root package name */
    final List<u> f38813e;

    /* renamed from: f, reason: collision with root package name */
    final Excluder f38814f;

    /* renamed from: g, reason: collision with root package name */
    final d f38815g;

    /* renamed from: h, reason: collision with root package name */
    final Map<Type, f<?>> f38816h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f38817i;

    /* renamed from: j, reason: collision with root package name */
    final boolean f38818j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f38819k;

    /* renamed from: l, reason: collision with root package name */
    final boolean f38820l;

    /* renamed from: m, reason: collision with root package name */
    final boolean f38821m;

    /* renamed from: n, reason: collision with root package name */
    final boolean f38822n;

    /* renamed from: o, reason: collision with root package name */
    final boolean f38823o;

    /* renamed from: p, reason: collision with root package name */
    final boolean f38824p;

    /* renamed from: q, reason: collision with root package name */
    final String f38825q;

    /* renamed from: r, reason: collision with root package name */
    final int f38826r;

    /* renamed from: s, reason: collision with root package name */
    final int f38827s;

    /* renamed from: t, reason: collision with root package name */
    final q f38828t;

    /* renamed from: u, reason: collision with root package name */
    final List<u> f38829u;

    /* renamed from: v, reason: collision with root package name */
    final List<u> f38830v;

    /* renamed from: w, reason: collision with root package name */
    final t f38831w;

    /* renamed from: x, reason: collision with root package name */
    final t f38832x;

    /* renamed from: y, reason: collision with root package name */
    final List<r> f38833y;

    static class FutureTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

        /* renamed from: a, reason: collision with root package name */
        private TypeAdapter<T> f38838a = null;

        FutureTypeAdapter() {
        }

        private TypeAdapter<T> b() {
            TypeAdapter<T> typeAdapter = this.f38838a;
            if (typeAdapter != null) {
                return typeAdapter;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
        public TypeAdapter<T> a() {
            return b();
        }

        public void c(TypeAdapter<T> typeAdapter) {
            if (this.f38838a != null) {
                throw new AssertionError("Delegate is already set");
            }
            this.f38838a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public T read(Q9.a aVar) {
            return b().read(aVar);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(Q9.c cVar, T t10) {
            b().write(cVar, t10);
        }
    }

    public Gson() {
        this(Excluder.f38870H, f38805A, Collections.emptyMap(), false, false, false, true, false, false, false, true, q.f39120B, f38808z, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), f38806B, f38807C, Collections.emptyList());
    }

    private static void a(Object obj, Q9.a aVar) {
        if (obj != null) {
            try {
                if (aVar.N() == Q9.b.END_DOCUMENT) {
                } else {
                    throw new JsonSyntaxException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e10) {
                throw new JsonSyntaxException(e10);
            } catch (IOException e11) {
                throw new JsonIOException(e11);
            }
        }
    }

    private static TypeAdapter<AtomicLong> b(final TypeAdapter<Number> typeAdapter) {
        return new TypeAdapter<AtomicLong>() { // from class: com.google.gson.Gson.4
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AtomicLong read(Q9.a aVar) {
                return new AtomicLong(((Number) typeAdapter.read(aVar)).longValue());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Q9.c cVar, AtomicLong atomicLong) {
                typeAdapter.write(cVar, Long.valueOf(atomicLong.get()));
            }
        }.nullSafe();
    }

    private static TypeAdapter<AtomicLongArray> c(final TypeAdapter<Number> typeAdapter) {
        return new TypeAdapter<AtomicLongArray>() { // from class: com.google.gson.Gson.5
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AtomicLongArray read(Q9.a aVar) throws IOException {
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.m()) {
                    arrayList.add(Long.valueOf(((Number) typeAdapter.read(aVar)).longValue()));
                }
                aVar.f();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Q9.c cVar, AtomicLongArray atomicLongArray) throws IOException {
                cVar.c();
                int length = atomicLongArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    typeAdapter.write(cVar, Long.valueOf(atomicLongArray.get(i10)));
                }
                cVar.f();
            }
        }.nullSafe();
    }

    static void d(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private TypeAdapter<Number> e(boolean z10) {
        return z10 ? TypeAdapters.f39005v : new TypeAdapter<Number>() { // from class: com.google.gson.Gson.1
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Double read(Q9.a aVar) throws IOException {
                if (aVar.N() != Q9.b.NULL) {
                    return Double.valueOf(aVar.s());
                }
                aVar.z();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Q9.c cVar, Number number) throws IOException {
                if (number == null) {
                    cVar.p();
                    return;
                }
                double dDoubleValue = number.doubleValue();
                Gson.d(dDoubleValue);
                cVar.L(dDoubleValue);
            }
        };
    }

    private TypeAdapter<Number> f(boolean z10) {
        return z10 ? TypeAdapters.f39004u : new TypeAdapter<Number>() { // from class: com.google.gson.Gson.2
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Float read(Q9.a aVar) throws IOException {
                if (aVar.N() != Q9.b.NULL) {
                    return Float.valueOf((float) aVar.s());
                }
                aVar.z();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Q9.c cVar, Number number) throws IOException {
                if (number == null) {
                    cVar.p();
                    return;
                }
                float fFloatValue = number.floatValue();
                Gson.d(fFloatValue);
                if (!(number instanceof Float)) {
                    number = Float.valueOf(fFloatValue);
                }
                cVar.Q(number);
            }
        };
    }

    private static TypeAdapter<Number> p(q qVar) {
        return qVar == q.f39120B ? TypeAdapters.f39003t : new TypeAdapter<Number>() { // from class: com.google.gson.Gson.3
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Number read(Q9.a aVar) throws IOException {
                if (aVar.N() != Q9.b.NULL) {
                    return Long.valueOf(aVar.u());
                }
                aVar.z();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Q9.c cVar, Number number) throws IOException {
                if (number == null) {
                    cVar.p();
                } else {
                    cVar.W(number.toString());
                }
            }
        };
    }

    public <T> T g(Q9.a aVar, P9.a<T> aVar2) {
        boolean zN = aVar.n();
        boolean z10 = true;
        aVar.a0(true);
        try {
            try {
                try {
                    aVar.N();
                    z10 = false;
                    return m(aVar2).read(aVar);
                } catch (EOFException e10) {
                    if (!z10) {
                        throw new JsonSyntaxException(e10);
                    }
                    aVar.a0(zN);
                    return null;
                } catch (IOException e11) {
                    throw new JsonSyntaxException(e11);
                }
            } catch (AssertionError e12) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e12.getMessage(), e12);
            } catch (IllegalStateException e13) {
                throw new JsonSyntaxException(e13);
            }
        } finally {
            aVar.a0(zN);
        }
    }

    public <T> T h(Reader reader, P9.a<T> aVar) {
        Q9.a aVarQ = q(reader);
        T t10 = (T) g(aVarQ, aVar);
        a(t10, aVarQ);
        return t10;
    }

    public <T> T i(Reader reader, Class<T> cls) {
        return (T) com.google.gson.internal.j.b(cls).cast(h(reader, P9.a.a(cls)));
    }

    public <T> T j(String str, P9.a<T> aVar) {
        if (str == null) {
            return null;
        }
        return (T) h(new StringReader(str), aVar);
    }

    public <T> T k(String str, Class<T> cls) {
        return (T) com.google.gson.internal.j.b(cls).cast(j(str, P9.a.a(cls)));
    }

    public <T> T l(String str, Type type) {
        return (T) j(str, P9.a.b(type));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        r2.c(r4);
        r0.put(r7, r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> com.google.gson.TypeAdapter<T> m(P9.a<T> r7) {
        /*
            r6 = this;
            java.lang.String r0 = "type must not be null"
            java.util.Objects.requireNonNull(r7, r0)
            java.util.concurrent.ConcurrentMap<P9.a<?>, com.google.gson.TypeAdapter<?>> r0 = r6.f38810b
            java.lang.Object r0 = r0.get(r7)
            com.google.gson.TypeAdapter r0 = (com.google.gson.TypeAdapter) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            java.lang.ThreadLocal<java.util.Map<P9.a<?>, com.google.gson.TypeAdapter<?>>> r0 = r6.f38809a
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L26
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.ThreadLocal<java.util.Map<P9.a<?>, com.google.gson.TypeAdapter<?>>> r1 = r6.f38809a
            r1.set(r0)
            r1 = 1
            goto L30
        L26:
            java.lang.Object r1 = r0.get(r7)
            com.google.gson.TypeAdapter r1 = (com.google.gson.TypeAdapter) r1
            if (r1 == 0) goto L2f
            return r1
        L2f:
            r1 = 0
        L30:
            com.google.gson.Gson$FutureTypeAdapter r2 = new com.google.gson.Gson$FutureTypeAdapter     // Catch: java.lang.Throwable -> L58
            r2.<init>()     // Catch: java.lang.Throwable -> L58
            r0.put(r7, r2)     // Catch: java.lang.Throwable -> L58
            java.util.List<com.google.gson.u> r3 = r6.f38813e     // Catch: java.lang.Throwable -> L58
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L58
            r4 = 0
        L3f:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r5 == 0) goto L5a
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L58
            com.google.gson.u r4 = (com.google.gson.u) r4     // Catch: java.lang.Throwable -> L58
            com.google.gson.TypeAdapter r4 = r4.b(r6, r7)     // Catch: java.lang.Throwable -> L58
            if (r4 == 0) goto L3f
            r2.c(r4)     // Catch: java.lang.Throwable -> L58
            r0.put(r7, r4)     // Catch: java.lang.Throwable -> L58
            goto L5a
        L58:
            r7 = move-exception
            goto L82
        L5a:
            if (r1 == 0) goto L61
            java.lang.ThreadLocal<java.util.Map<P9.a<?>, com.google.gson.TypeAdapter<?>>> r2 = r6.f38809a
            r2.remove()
        L61:
            if (r4 == 0) goto L6b
            if (r1 == 0) goto L6a
            java.util.concurrent.ConcurrentMap<P9.a<?>, com.google.gson.TypeAdapter<?>> r7 = r6.f38810b
            r7.putAll(r0)
        L6a:
            return r4
        L6b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "GSON (2.10.1) cannot handle "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L82:
            if (r1 == 0) goto L89
            java.lang.ThreadLocal<java.util.Map<P9.a<?>, com.google.gson.TypeAdapter<?>>> r0 = r6.f38809a
            r0.remove()
        L89:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.Gson.m(P9.a):com.google.gson.TypeAdapter");
    }

    public <T> TypeAdapter<T> n(Class<T> cls) {
        return m(P9.a.a(cls));
    }

    public <T> TypeAdapter<T> o(u uVar, P9.a<T> aVar) {
        if (!this.f38813e.contains(uVar)) {
            uVar = this.f38812d;
        }
        boolean z10 = false;
        for (u uVar2 : this.f38813e) {
            if (z10) {
                TypeAdapter<T> typeAdapterB = uVar2.b(this, aVar);
                if (typeAdapterB != null) {
                    return typeAdapterB;
                }
            } else if (uVar2 == uVar) {
                z10 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public Q9.a q(Reader reader) {
        Q9.a aVar = new Q9.a(reader);
        aVar.a0(this.f38822n);
        return aVar;
    }

    public Q9.c r(Writer writer) throws IOException {
        if (this.f38819k) {
            writer.write(")]}'\n");
        }
        Q9.c cVar = new Q9.c(writer);
        if (this.f38821m) {
            cVar.y("  ");
        }
        cVar.x(this.f38820l);
        cVar.z(this.f38822n);
        cVar.C(this.f38817i);
        return cVar;
    }

    public String s(j jVar) {
        StringWriter stringWriter = new StringWriter();
        w(jVar, stringWriter);
        return stringWriter.toString();
    }

    public String t(Object obj) {
        return obj == null ? s(k.f39117B) : u(obj, obj.getClass());
    }

    public String toString() {
        return "{serializeNulls:" + this.f38817i + ",factories:" + this.f38813e + ",instanceCreators:" + this.f38811c + "}";
    }

    public String u(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        y(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void v(j jVar, Q9.c cVar) {
        boolean zL = cVar.l();
        cVar.z(true);
        boolean zK = cVar.k();
        cVar.x(this.f38820l);
        boolean zJ = cVar.j();
        cVar.C(this.f38817i);
        try {
            try {
                com.google.gson.internal.l.b(jVar, cVar);
            } catch (IOException e10) {
                throw new JsonIOException(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e11.getMessage(), e11);
            }
        } finally {
            cVar.z(zL);
            cVar.x(zK);
            cVar.C(zJ);
        }
    }

    public void w(j jVar, Appendable appendable) {
        try {
            v(jVar, r(com.google.gson.internal.l.c(appendable)));
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }

    public void x(Object obj, Type type, Q9.c cVar) {
        TypeAdapter typeAdapterM = m(P9.a.b(type));
        boolean zL = cVar.l();
        cVar.z(true);
        boolean zK = cVar.k();
        cVar.x(this.f38820l);
        boolean zJ = cVar.j();
        cVar.C(this.f38817i);
        try {
            try {
                typeAdapterM.write(cVar, obj);
            } catch (IOException e10) {
                throw new JsonIOException(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e11.getMessage(), e11);
            }
        } finally {
            cVar.z(zL);
            cVar.x(zK);
            cVar.C(zJ);
        }
    }

    public void y(Object obj, Type type, Appendable appendable) {
        try {
            x(obj, type, r(com.google.gson.internal.l.c(appendable)));
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }

    Gson(Excluder excluder, d dVar, Map<Type, f<?>> map, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, q qVar, String str, int i10, int i11, List<u> list, List<u> list2, List<u> list3, t tVar, t tVar2, List<r> list4) {
        this.f38809a = new ThreadLocal<>();
        this.f38810b = new ConcurrentHashMap();
        this.f38814f = excluder;
        this.f38815g = dVar;
        this.f38816h = map;
        com.google.gson.internal.c cVar = new com.google.gson.internal.c(map, z17, list4);
        this.f38811c = cVar;
        this.f38817i = z10;
        this.f38818j = z11;
        this.f38819k = z12;
        this.f38820l = z13;
        this.f38821m = z14;
        this.f38822n = z15;
        this.f38823o = z16;
        this.f38824p = z17;
        this.f38828t = qVar;
        this.f38825q = str;
        this.f38826r = i10;
        this.f38827s = i11;
        this.f38829u = list;
        this.f38830v = list2;
        this.f38831w = tVar;
        this.f38832x = tVar2;
        this.f38833y = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.f38982W);
        arrayList.add(ObjectTypeAdapter.a(tVar));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.f38962C);
        arrayList.add(TypeAdapters.f38996m);
        arrayList.add(TypeAdapters.f38990g);
        arrayList.add(TypeAdapters.f38992i);
        arrayList.add(TypeAdapters.f38994k);
        TypeAdapter<Number> typeAdapterP = p(qVar);
        arrayList.add(TypeAdapters.c(Long.TYPE, Long.class, typeAdapterP));
        arrayList.add(TypeAdapters.c(Double.TYPE, Double.class, e(z16)));
        arrayList.add(TypeAdapters.c(Float.TYPE, Float.class, f(z16)));
        arrayList.add(NumberTypeAdapter.a(tVar2));
        arrayList.add(TypeAdapters.f38998o);
        arrayList.add(TypeAdapters.f39000q);
        arrayList.add(TypeAdapters.b(AtomicLong.class, b(typeAdapterP)));
        arrayList.add(TypeAdapters.b(AtomicLongArray.class, c(typeAdapterP)));
        arrayList.add(TypeAdapters.f39002s);
        arrayList.add(TypeAdapters.f39007x);
        arrayList.add(TypeAdapters.f38964E);
        arrayList.add(TypeAdapters.f38966G);
        arrayList.add(TypeAdapters.b(BigDecimal.class, TypeAdapters.f39009z));
        arrayList.add(TypeAdapters.b(BigInteger.class, TypeAdapters.f38960A));
        arrayList.add(TypeAdapters.b(com.google.gson.internal.f.class, TypeAdapters.f38961B));
        arrayList.add(TypeAdapters.f38968I);
        arrayList.add(TypeAdapters.f38970K);
        arrayList.add(TypeAdapters.f38974O);
        arrayList.add(TypeAdapters.f38976Q);
        arrayList.add(TypeAdapters.f38980U);
        arrayList.add(TypeAdapters.f38972M);
        arrayList.add(TypeAdapters.f38987d);
        arrayList.add(DateTypeAdapter.f38896b);
        arrayList.add(TypeAdapters.f38978S);
        if (com.google.gson.internal.sql.a.f39111a) {
            arrayList.add(com.google.gson.internal.sql.a.f39115e);
            arrayList.add(com.google.gson.internal.sql.a.f39114d);
            arrayList.add(com.google.gson.internal.sql.a.f39116f);
        }
        arrayList.add(ArrayTypeAdapter.f38890c);
        arrayList.add(TypeAdapters.f38985b);
        arrayList.add(new CollectionTypeAdapterFactory(cVar));
        arrayList.add(new MapTypeAdapterFactory(cVar, z11));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(cVar);
        this.f38812d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.f38983X);
        arrayList.add(new ReflectiveTypeAdapterFactory(cVar, dVar, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
        this.f38813e = Collections.unmodifiableList(arrayList);
    }
}
