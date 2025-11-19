package com.google.gson.internal.bind;

import M9.c;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.g;
import com.google.gson.internal.f;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.u;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes2.dex */
public final class TypeAdapters {

    /* renamed from: A, reason: collision with root package name */
    public static final TypeAdapter<BigInteger> f38960A;

    /* renamed from: B, reason: collision with root package name */
    public static final TypeAdapter<f> f38961B;

    /* renamed from: C, reason: collision with root package name */
    public static final u f38962C;

    /* renamed from: D, reason: collision with root package name */
    public static final TypeAdapter<StringBuilder> f38963D;

    /* renamed from: E, reason: collision with root package name */
    public static final u f38964E;

    /* renamed from: F, reason: collision with root package name */
    public static final TypeAdapter<StringBuffer> f38965F;

    /* renamed from: G, reason: collision with root package name */
    public static final u f38966G;

    /* renamed from: H, reason: collision with root package name */
    public static final TypeAdapter<URL> f38967H;

    /* renamed from: I, reason: collision with root package name */
    public static final u f38968I;

    /* renamed from: J, reason: collision with root package name */
    public static final TypeAdapter<URI> f38969J;

    /* renamed from: K, reason: collision with root package name */
    public static final u f38970K;

    /* renamed from: L, reason: collision with root package name */
    public static final TypeAdapter<InetAddress> f38971L;

    /* renamed from: M, reason: collision with root package name */
    public static final u f38972M;

    /* renamed from: N, reason: collision with root package name */
    public static final TypeAdapter<UUID> f38973N;

    /* renamed from: O, reason: collision with root package name */
    public static final u f38974O;

    /* renamed from: P, reason: collision with root package name */
    public static final TypeAdapter<Currency> f38975P;

    /* renamed from: Q, reason: collision with root package name */
    public static final u f38976Q;

    /* renamed from: R, reason: collision with root package name */
    public static final TypeAdapter<Calendar> f38977R;

    /* renamed from: S, reason: collision with root package name */
    public static final u f38978S;

    /* renamed from: T, reason: collision with root package name */
    public static final TypeAdapter<Locale> f38979T;

    /* renamed from: U, reason: collision with root package name */
    public static final u f38980U;

    /* renamed from: V, reason: collision with root package name */
    public static final TypeAdapter<j> f38981V;

    /* renamed from: W, reason: collision with root package name */
    public static final u f38982W;

    /* renamed from: X, reason: collision with root package name */
    public static final u f38983X;

    /* renamed from: a, reason: collision with root package name */
    public static final TypeAdapter<Class> f38984a;

    /* renamed from: b, reason: collision with root package name */
    public static final u f38985b;

    /* renamed from: c, reason: collision with root package name */
    public static final TypeAdapter<BitSet> f38986c;

    /* renamed from: d, reason: collision with root package name */
    public static final u f38987d;

    /* renamed from: e, reason: collision with root package name */
    public static final TypeAdapter<Boolean> f38988e;

    /* renamed from: f, reason: collision with root package name */
    public static final TypeAdapter<Boolean> f38989f;

    /* renamed from: g, reason: collision with root package name */
    public static final u f38990g;

    /* renamed from: h, reason: collision with root package name */
    public static final TypeAdapter<Number> f38991h;

    /* renamed from: i, reason: collision with root package name */
    public static final u f38992i;

    /* renamed from: j, reason: collision with root package name */
    public static final TypeAdapter<Number> f38993j;

    /* renamed from: k, reason: collision with root package name */
    public static final u f38994k;

    /* renamed from: l, reason: collision with root package name */
    public static final TypeAdapter<Number> f38995l;

    /* renamed from: m, reason: collision with root package name */
    public static final u f38996m;

    /* renamed from: n, reason: collision with root package name */
    public static final TypeAdapter<AtomicInteger> f38997n;

    /* renamed from: o, reason: collision with root package name */
    public static final u f38998o;

    /* renamed from: p, reason: collision with root package name */
    public static final TypeAdapter<AtomicBoolean> f38999p;

    /* renamed from: q, reason: collision with root package name */
    public static final u f39000q;

    /* renamed from: r, reason: collision with root package name */
    public static final TypeAdapter<AtomicIntegerArray> f39001r;

    /* renamed from: s, reason: collision with root package name */
    public static final u f39002s;

    /* renamed from: t, reason: collision with root package name */
    public static final TypeAdapter<Number> f39003t;

    /* renamed from: u, reason: collision with root package name */
    public static final TypeAdapter<Number> f39004u;

    /* renamed from: v, reason: collision with root package name */
    public static final TypeAdapter<Number> f39005v;

    /* renamed from: w, reason: collision with root package name */
    public static final TypeAdapter<Character> f39006w;

    /* renamed from: x, reason: collision with root package name */
    public static final u f39007x;

    /* renamed from: y, reason: collision with root package name */
    public static final TypeAdapter<String> f39008y;

    /* renamed from: z, reason: collision with root package name */
    public static final TypeAdapter<BigDecimal> f39009z;

    private static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Map<String, T> f39024a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final Map<String, T> f39025b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        private final Map<T, String> f39026c = new HashMap();

        class a implements PrivilegedAction<Field[]> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Class f39027a;

            a(Class cls) {
                this.f39027a = cls;
            }

            @Override // java.security.PrivilegedAction
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Field[] run() throws SecurityException {
                Field[] declaredFields = this.f39027a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        public EnumTypeAdapter(Class<T> cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new a(cls))) {
                    Enum r42 = (Enum) field.get(null);
                    String strName = r42.name();
                    String string = r42.toString();
                    c cVar = (c) field.getAnnotation(c.class);
                    if (cVar != null) {
                        strName = cVar.value();
                        for (String str : cVar.alternate()) {
                            this.f39024a.put(str, r42);
                        }
                    }
                    this.f39024a.put(strName, r42);
                    this.f39025b.put(string, r42);
                    this.f39026c.put(r42, strName);
                }
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public T read(Q9.a aVar) throws IOException {
            if (aVar.N() == Q9.b.NULL) {
                aVar.z();
                return null;
            }
            String strK = aVar.K();
            T t10 = this.f39024a.get(strK);
            return t10 == null ? this.f39025b.get(strK) : t10;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(Q9.c cVar, T t10) throws IOException {
            cVar.W(t10 == null ? null : this.f39026c.get(t10));
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39029a;

        static {
            int[] iArr = new int[Q9.b.values().length];
            f39029a = iArr;
            try {
                iArr[Q9.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39029a[Q9.b.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39029a[Q9.b.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39029a[Q9.b.BEGIN_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39029a[Q9.b.BEGIN_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39029a[Q9.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        TypeAdapter<Class> typeAdapterNullSafe = new TypeAdapter<Class>() { // from class: com.google.gson.internal.bind.TypeAdapters.1
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Class read(Q9.a aVar) {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Q9.c cVar, Class cls) {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
            }
        }.nullSafe();
        f38984a = typeAdapterNullSafe;
        f38985b = b(Class.class, typeAdapterNullSafe);
        TypeAdapter<BitSet> typeAdapterNullSafe2 = new TypeAdapter<BitSet>() { // from class: com.google.gson.internal.bind.TypeAdapters.2
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public BitSet read(Q9.a aVar) throws IOException, NumberFormatException {
                BitSet bitSet = new BitSet();
                aVar.a();
                Q9.b bVarN = aVar.N();
                int i10 = 0;
                while (bVarN != Q9.b.END_ARRAY) {
                    int i11 = a.f39029a[bVarN.ordinal()];
                    boolean zQ = true;
                    if (i11 == 1 || i11 == 2) {
                        int iT = aVar.t();
                        if (iT == 0) {
                            zQ = false;
                        } else if (iT != 1) {
                            throw new JsonSyntaxException("Invalid bitset value " + iT + ", expected 0 or 1; at path " + aVar.l());
                        }
                    } else {
                        if (i11 != 3) {
                            throw new JsonSyntaxException("Invalid bitset value type: " + bVarN + "; at path " + aVar.h());
                        }
                        zQ = aVar.q();
                    }
                    if (zQ) {
                        bitSet.set(i10);
                    }
                    i10++;
                    bVarN = aVar.N();
                }
                aVar.f();
                return bitSet;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Q9.c cVar, BitSet bitSet) throws IOException {
                cVar.c();
                int length = bitSet.length();
                for (int i10 = 0; i10 < length; i10++) {
                    cVar.N(bitSet.get(i10) ? 1L : 0L);
                }
                cVar.f();
            }
        }.nullSafe();
        f38986c = typeAdapterNullSafe2;
        f38987d = b(BitSet.class, typeAdapterNullSafe2);
        TypeAdapter<Boolean> typeAdapter = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.3
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean read(Q9.a aVar) throws IOException {
                Q9.b bVarN = aVar.N();
                if (bVarN != Q9.b.NULL) {
                    return bVarN == Q9.b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.K())) : Boolean.valueOf(aVar.q());
                }
                aVar.z();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Q9.c cVar, Boolean bool) throws IOException {
                cVar.P(bool);
            }
        };
        f38988e = typeAdapter;
        f38989f = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.4
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean read(Q9.a aVar) throws IOException {
                if (aVar.N() != Q9.b.NULL) {
                    return Boolean.valueOf(aVar.K());
                }
                aVar.z();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Q9.c cVar, Boolean bool) throws IOException {
                cVar.W(bool == null ? "null" : bool.toString());
            }
        };
        f38990g = c(Boolean.TYPE, Boolean.class, typeAdapter);
        TypeAdapter<Number> typeAdapter2 = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.5
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Number read(Q9.a aVar) throws IOException {
                if (aVar.N() == Q9.b.NULL) {
                    aVar.z();
                    return null;
                }
                try {
                    int iT = aVar.t();
                    if (iT <= 255 && iT >= -128) {
                        return Byte.valueOf((byte) iT);
                    }
                    throw new JsonSyntaxException("Lossy conversion from " + iT + " to byte; at path " + aVar.l());
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Q9.c cVar, Number number) throws IOException {
                if (number == null) {
                    cVar.p();
                } else {
                    cVar.N(number.byteValue());
                }
            }
        };
        f38991h = typeAdapter2;
        f38992i = c(Byte.TYPE, Byte.class, typeAdapter2);
        TypeAdapter<Number> typeAdapter3 = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.6
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Number read(Q9.a aVar) throws IOException {
                if (aVar.N() == Q9.b.NULL) {
                    aVar.z();
                    return null;
                }
                try {
                    int iT = aVar.t();
                    if (iT <= 65535 && iT >= -32768) {
                        return Short.valueOf((short) iT);
                    }
                    throw new JsonSyntaxException("Lossy conversion from " + iT + " to short; at path " + aVar.l());
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Q9.c cVar, Number number) throws IOException {
                if (number == null) {
                    cVar.p();
                } else {
                    cVar.N(number.shortValue());
                }
            }
        };
        f38993j = typeAdapter3;
        f38994k = c(Short.TYPE, Short.class, typeAdapter3);
        TypeAdapter<Number> typeAdapter4 = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.7
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Number read(Q9.a aVar) throws IOException {
                if (aVar.N() == Q9.b.NULL) {
                    aVar.z();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.t());
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Q9.c cVar, Number number) throws IOException {
                if (number == null) {
                    cVar.p();
                } else {
                    cVar.N(number.intValue());
                }
            }
        };
        f38995l = typeAdapter4;
        f38996m = c(Integer.TYPE, Integer.class, typeAdapter4);
        TypeAdapter<AtomicInteger> typeAdapterNullSafe3 = new TypeAdapter<AtomicInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.8
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AtomicInteger read(Q9.a aVar) {
                try {
                    return new AtomicInteger(aVar.t());
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Q9.c cVar, AtomicInteger atomicInteger) throws IOException {
                cVar.N(atomicInteger.get());
            }
        }.nullSafe();
        f38997n = typeAdapterNullSafe3;
        f38998o = b(AtomicInteger.class, typeAdapterNullSafe3);
        TypeAdapter<AtomicBoolean> typeAdapterNullSafe4 = new TypeAdapter<AtomicBoolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.9
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AtomicBoolean read(Q9.a aVar) {
                return new AtomicBoolean(aVar.q());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Q9.c cVar, AtomicBoolean atomicBoolean) throws IOException {
                cVar.X(atomicBoolean.get());
            }
        }.nullSafe();
        f38999p = typeAdapterNullSafe4;
        f39000q = b(AtomicBoolean.class, typeAdapterNullSafe4);
        TypeAdapter<AtomicIntegerArray> typeAdapterNullSafe5 = new TypeAdapter<AtomicIntegerArray>() { // from class: com.google.gson.internal.bind.TypeAdapters.10
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AtomicIntegerArray read(Q9.a aVar) throws IOException {
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.m()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.t()));
                    } catch (NumberFormatException e10) {
                        throw new JsonSyntaxException(e10);
                    }
                }
                aVar.f();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Q9.c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
                cVar.c();
                int length = atomicIntegerArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    cVar.N(atomicIntegerArray.get(i10));
                }
                cVar.f();
            }
        }.nullSafe();
        f39001r = typeAdapterNullSafe5;
        f39002s = b(AtomicIntegerArray.class, typeAdapterNullSafe5);
        f39003t = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.11
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Number read(Q9.a aVar) throws IOException {
                if (aVar.N() == Q9.b.NULL) {
                    aVar.z();
                    return null;
                }
                try {
                    return Long.valueOf(aVar.u());
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Q9.c cVar, Number number) throws IOException {
                if (number == null) {
                    cVar.p();
                } else {
                    cVar.N(number.longValue());
                }
            }
        };
        f39004u = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.12
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Number read(Q9.a aVar) throws IOException {
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
                if (!(number instanceof Float)) {
                    number = Float.valueOf(number.floatValue());
                }
                cVar.Q(number);
            }
        };
        f39005v = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.13
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Number read(Q9.a aVar) throws IOException {
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
                } else {
                    cVar.L(number.doubleValue());
                }
            }
        };
        TypeAdapter<Character> typeAdapter5 = new TypeAdapter<Character>() { // from class: com.google.gson.internal.bind.TypeAdapters.14
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Character read(Q9.a aVar) throws IOException {
                if (aVar.N() == Q9.b.NULL) {
                    aVar.z();
                    return null;
                }
                String strK = aVar.K();
                if (strK.length() == 1) {
                    return Character.valueOf(strK.charAt(0));
                }
                throw new JsonSyntaxException("Expecting character, got: " + strK + "; at " + aVar.l());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Q9.c cVar, Character ch) throws IOException {
                cVar.W(ch == null ? null : String.valueOf(ch));
            }
        };
        f39006w = typeAdapter5;
        f39007x = c(Character.TYPE, Character.class, typeAdapter5);
        TypeAdapter<String> typeAdapter6 = new TypeAdapter<String>() { // from class: com.google.gson.internal.bind.TypeAdapters.15
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String read(Q9.a aVar) throws IOException {
                Q9.b bVarN = aVar.N();
                if (bVarN != Q9.b.NULL) {
                    return bVarN == Q9.b.BOOLEAN ? Boolean.toString(aVar.q()) : aVar.K();
                }
                aVar.z();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Q9.c cVar, String str) throws IOException {
                cVar.W(str);
            }
        };
        f39008y = typeAdapter6;
        f39009z = new TypeAdapter<BigDecimal>() { // from class: com.google.gson.internal.bind.TypeAdapters.16
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public BigDecimal read(Q9.a aVar) throws IOException {
                if (aVar.N() == Q9.b.NULL) {
                    aVar.z();
                    return null;
                }
                String strK = aVar.K();
                try {
                    return new BigDecimal(strK);
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException("Failed parsing '" + strK + "' as BigDecimal; at path " + aVar.l(), e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Q9.c cVar, BigDecimal bigDecimal) throws IOException {
                cVar.Q(bigDecimal);
            }
        };
        f38960A = new TypeAdapter<BigInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.17
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public BigInteger read(Q9.a aVar) throws IOException {
                if (aVar.N() == Q9.b.NULL) {
                    aVar.z();
                    return null;
                }
                String strK = aVar.K();
                try {
                    return new BigInteger(strK);
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException("Failed parsing '" + strK + "' as BigInteger; at path " + aVar.l(), e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Q9.c cVar, BigInteger bigInteger) throws IOException {
                cVar.Q(bigInteger);
            }
        };
        f38961B = new TypeAdapter<f>() { // from class: com.google.gson.internal.bind.TypeAdapters.18
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public f read(Q9.a aVar) throws IOException {
                if (aVar.N() != Q9.b.NULL) {
                    return new f(aVar.K());
                }
                aVar.z();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Q9.c cVar, f fVar) throws IOException {
                cVar.Q(fVar);
            }
        };
        f38962C = b(String.class, typeAdapter6);
        TypeAdapter<StringBuilder> typeAdapter7 = new TypeAdapter<StringBuilder>() { // from class: com.google.gson.internal.bind.TypeAdapters.19
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public StringBuilder read(Q9.a aVar) throws IOException {
                if (aVar.N() != Q9.b.NULL) {
                    return new StringBuilder(aVar.K());
                }
                aVar.z();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Q9.c cVar, StringBuilder sb2) throws IOException {
                cVar.W(sb2 == null ? null : sb2.toString());
            }
        };
        f38963D = typeAdapter7;
        f38964E = b(StringBuilder.class, typeAdapter7);
        TypeAdapter<StringBuffer> typeAdapter8 = new TypeAdapter<StringBuffer>() { // from class: com.google.gson.internal.bind.TypeAdapters.20
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public StringBuffer read(Q9.a aVar) throws IOException {
                if (aVar.N() != Q9.b.NULL) {
                    return new StringBuffer(aVar.K());
                }
                aVar.z();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Q9.c cVar, StringBuffer stringBuffer) throws IOException {
                cVar.W(stringBuffer == null ? null : stringBuffer.toString());
            }
        };
        f38965F = typeAdapter8;
        f38966G = b(StringBuffer.class, typeAdapter8);
        TypeAdapter<URL> typeAdapter9 = new TypeAdapter<URL>() { // from class: com.google.gson.internal.bind.TypeAdapters.21
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public URL read(Q9.a aVar) throws IOException {
                if (aVar.N() == Q9.b.NULL) {
                    aVar.z();
                    return null;
                }
                String strK = aVar.K();
                if ("null".equals(strK)) {
                    return null;
                }
                return new URL(strK);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Q9.c cVar, URL url) throws IOException {
                cVar.W(url == null ? null : url.toExternalForm());
            }
        };
        f38967H = typeAdapter9;
        f38968I = b(URL.class, typeAdapter9);
        TypeAdapter<URI> typeAdapter10 = new TypeAdapter<URI>() { // from class: com.google.gson.internal.bind.TypeAdapters.22
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public URI read(Q9.a aVar) throws IOException {
                if (aVar.N() == Q9.b.NULL) {
                    aVar.z();
                    return null;
                }
                try {
                    String strK = aVar.K();
                    if ("null".equals(strK)) {
                        return null;
                    }
                    return new URI(strK);
                } catch (URISyntaxException e10) {
                    throw new JsonIOException(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Q9.c cVar, URI uri) throws IOException {
                cVar.W(uri == null ? null : uri.toASCIIString());
            }
        };
        f38969J = typeAdapter10;
        f38970K = b(URI.class, typeAdapter10);
        TypeAdapter<InetAddress> typeAdapter11 = new TypeAdapter<InetAddress>() { // from class: com.google.gson.internal.bind.TypeAdapters.23
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public InetAddress read(Q9.a aVar) throws IOException {
                if (aVar.N() != Q9.b.NULL) {
                    return InetAddress.getByName(aVar.K());
                }
                aVar.z();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Q9.c cVar, InetAddress inetAddress) throws IOException {
                cVar.W(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        f38971L = typeAdapter11;
        f38972M = e(InetAddress.class, typeAdapter11);
        TypeAdapter<UUID> typeAdapter12 = new TypeAdapter<UUID>() { // from class: com.google.gson.internal.bind.TypeAdapters.24
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public UUID read(Q9.a aVar) throws IOException {
                if (aVar.N() == Q9.b.NULL) {
                    aVar.z();
                    return null;
                }
                String strK = aVar.K();
                try {
                    return UUID.fromString(strK);
                } catch (IllegalArgumentException e10) {
                    throw new JsonSyntaxException("Failed parsing '" + strK + "' as UUID; at path " + aVar.l(), e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Q9.c cVar, UUID uuid) throws IOException {
                cVar.W(uuid == null ? null : uuid.toString());
            }
        };
        f38973N = typeAdapter12;
        f38974O = b(UUID.class, typeAdapter12);
        TypeAdapter<Currency> typeAdapterNullSafe6 = new TypeAdapter<Currency>() { // from class: com.google.gson.internal.bind.TypeAdapters.25
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Currency read(Q9.a aVar) throws IOException {
                String strK = aVar.K();
                try {
                    return Currency.getInstance(strK);
                } catch (IllegalArgumentException e10) {
                    throw new JsonSyntaxException("Failed parsing '" + strK + "' as Currency; at path " + aVar.l(), e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Q9.c cVar, Currency currency) throws IOException {
                cVar.W(currency.getCurrencyCode());
            }
        }.nullSafe();
        f38975P = typeAdapterNullSafe6;
        f38976Q = b(Currency.class, typeAdapterNullSafe6);
        TypeAdapter<Calendar> typeAdapter13 = new TypeAdapter<Calendar>() { // from class: com.google.gson.internal.bind.TypeAdapters.26
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Calendar read(Q9.a aVar) throws IOException, NumberFormatException {
                if (aVar.N() == Q9.b.NULL) {
                    aVar.z();
                    return null;
                }
                aVar.b();
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (aVar.N() != Q9.b.END_OBJECT) {
                    String strX = aVar.x();
                    int iT = aVar.t();
                    if ("year".equals(strX)) {
                        i10 = iT;
                    } else if ("month".equals(strX)) {
                        i11 = iT;
                    } else if ("dayOfMonth".equals(strX)) {
                        i12 = iT;
                    } else if ("hourOfDay".equals(strX)) {
                        i13 = iT;
                    } else if ("minute".equals(strX)) {
                        i14 = iT;
                    } else if ("second".equals(strX)) {
                        i15 = iT;
                    }
                }
                aVar.g();
                return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Q9.c cVar, Calendar calendar) throws IOException {
                if (calendar == null) {
                    cVar.p();
                    return;
                }
                cVar.d();
                cVar.n("year");
                cVar.N(calendar.get(1));
                cVar.n("month");
                cVar.N(calendar.get(2));
                cVar.n("dayOfMonth");
                cVar.N(calendar.get(5));
                cVar.n("hourOfDay");
                cVar.N(calendar.get(11));
                cVar.n("minute");
                cVar.N(calendar.get(12));
                cVar.n("second");
                cVar.N(calendar.get(13));
                cVar.g();
            }
        };
        f38977R = typeAdapter13;
        f38978S = d(Calendar.class, GregorianCalendar.class, typeAdapter13);
        TypeAdapter<Locale> typeAdapter14 = new TypeAdapter<Locale>() { // from class: com.google.gson.internal.bind.TypeAdapters.27
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Locale read(Q9.a aVar) throws IOException {
                if (aVar.N() == Q9.b.NULL) {
                    aVar.z();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.K(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(Q9.c cVar, Locale locale) throws IOException {
                cVar.W(locale == null ? null : locale.toString());
            }
        };
        f38979T = typeAdapter14;
        f38980U = b(Locale.class, typeAdapter14);
        TypeAdapter<j> typeAdapter15 = new TypeAdapter<j>() { // from class: com.google.gson.internal.bind.TypeAdapters.28
            private j b(Q9.a aVar, Q9.b bVar) throws IOException {
                int i10 = a.f39029a[bVar.ordinal()];
                if (i10 == 1) {
                    return new n(new f(aVar.K()));
                }
                if (i10 == 2) {
                    return new n(aVar.K());
                }
                if (i10 == 3) {
                    return new n(Boolean.valueOf(aVar.q()));
                }
                if (i10 == 6) {
                    aVar.z();
                    return k.f39117B;
                }
                throw new IllegalStateException("Unexpected token: " + bVar);
            }

            private j c(Q9.a aVar, Q9.b bVar) throws IOException {
                int i10 = a.f39029a[bVar.ordinal()];
                if (i10 == 4) {
                    aVar.a();
                    return new g();
                }
                if (i10 != 5) {
                    return null;
                }
                aVar.b();
                return new l();
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public j read(Q9.a aVar) throws IOException {
                if (aVar instanceof com.google.gson.internal.bind.a) {
                    return ((com.google.gson.internal.bind.a) aVar).v0();
                }
                Q9.b bVarN = aVar.N();
                j jVarC = c(aVar, bVarN);
                if (jVarC == null) {
                    return b(aVar, bVarN);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (aVar.m()) {
                        String strX = jVarC instanceof l ? aVar.x() : null;
                        Q9.b bVarN2 = aVar.N();
                        j jVarC2 = c(aVar, bVarN2);
                        boolean z10 = jVarC2 != null;
                        if (jVarC2 == null) {
                            jVarC2 = b(aVar, bVarN2);
                        }
                        if (jVarC instanceof g) {
                            ((g) jVarC).A(jVarC2);
                        } else {
                            ((l) jVarC).A(strX, jVarC2);
                        }
                        if (z10) {
                            arrayDeque.addLast(jVarC);
                            jVarC = jVarC2;
                        }
                    } else {
                        if (jVarC instanceof g) {
                            aVar.f();
                        } else {
                            aVar.g();
                        }
                        if (arrayDeque.isEmpty()) {
                            return jVarC;
                        }
                        jVarC = (j) arrayDeque.removeLast();
                    }
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void write(Q9.c cVar, j jVar) throws IOException {
                if (jVar == null || jVar.x()) {
                    cVar.p();
                    return;
                }
                if (jVar.z()) {
                    n nVarR = jVar.r();
                    if (nVarR.F()) {
                        cVar.Q(nVarR.B());
                        return;
                    } else if (nVarR.D()) {
                        cVar.X(nVarR.c());
                        return;
                    } else {
                        cVar.W(nVarR.v());
                        return;
                    }
                }
                if (jVar.w()) {
                    cVar.c();
                    Iterator<j> it = jVar.i().iterator();
                    while (it.hasNext()) {
                        write(cVar, it.next());
                    }
                    cVar.f();
                    return;
                }
                if (!jVar.y()) {
                    throw new IllegalArgumentException("Couldn't write " + jVar.getClass());
                }
                cVar.d();
                for (Map.Entry<String, j> entry : jVar.j().B()) {
                    cVar.n(entry.getKey());
                    write(cVar, entry.getValue());
                }
                cVar.g();
            }
        };
        f38981V = typeAdapter15;
        f38982W = e(j.class, typeAdapter15);
        f38983X = new u() { // from class: com.google.gson.internal.bind.TypeAdapters.29
            @Override // com.google.gson.u
            public <T> TypeAdapter<T> b(Gson gson, P9.a<T> aVar) {
                Class<? super T> clsC = aVar.c();
                if (!Enum.class.isAssignableFrom(clsC) || clsC == Enum.class) {
                    return null;
                }
                if (!clsC.isEnum()) {
                    clsC = clsC.getSuperclass();
                }
                return new EnumTypeAdapter(clsC);
            }
        };
    }

    public static <TT> u a(final P9.a<TT> aVar, final TypeAdapter<TT> typeAdapter) {
        return new u() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            @Override // com.google.gson.u
            public <T> TypeAdapter<T> b(Gson gson, P9.a<T> aVar2) {
                if (aVar2.equals(aVar)) {
                    return typeAdapter;
                }
                return null;
            }
        };
    }

    public static <TT> u b(final Class<TT> cls, final TypeAdapter<TT> typeAdapter) {
        return new u() { // from class: com.google.gson.internal.bind.TypeAdapters.31
            @Override // com.google.gson.u
            public <T> TypeAdapter<T> b(Gson gson, P9.a<T> aVar) {
                if (aVar.c() == cls) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static <TT> u c(final Class<TT> cls, final Class<TT> cls2, final TypeAdapter<? super TT> typeAdapter) {
        return new u() { // from class: com.google.gson.internal.bind.TypeAdapters.32
            @Override // com.google.gson.u
            public <T> TypeAdapter<T> b(Gson gson, P9.a<T> aVar) {
                Class<? super T> clsC = aVar.c();
                if (clsC == cls || clsC == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static <TT> u d(final Class<TT> cls, final Class<? extends TT> cls2, final TypeAdapter<? super TT> typeAdapter) {
        return new u() { // from class: com.google.gson.internal.bind.TypeAdapters.33
            @Override // com.google.gson.u
            public <T> TypeAdapter<T> b(Gson gson, P9.a<T> aVar) {
                Class<? super T> clsC = aVar.c();
                if (clsC == cls || clsC == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static <T1> u e(final Class<T1> cls, final TypeAdapter<T1> typeAdapter) {
        return new u() { // from class: com.google.gson.internal.bind.TypeAdapters.34
            @Override // com.google.gson.u
            public <T2> TypeAdapter<T2> b(Gson gson, P9.a<T2> aVar) {
                final Class<? super T2> clsC = aVar.c();
                if (cls.isAssignableFrom(clsC)) {
                    return (TypeAdapter<T2>) new TypeAdapter<T1>() { // from class: com.google.gson.internal.bind.TypeAdapters.34.1
                        @Override // com.google.gson.TypeAdapter
                        public T1 read(Q9.a aVar2) {
                            T1 t12 = (T1) typeAdapter.read(aVar2);
                            if (t12 == null || clsC.isInstance(t12)) {
                                return t12;
                            }
                            throw new JsonSyntaxException("Expected a " + clsC.getName() + " but was " + t12.getClass().getName() + "; at path " + aVar2.l());
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void write(Q9.c cVar, T1 t12) {
                            typeAdapter.write(cVar, t12);
                        }
                    };
                }
                return null;
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }
}
