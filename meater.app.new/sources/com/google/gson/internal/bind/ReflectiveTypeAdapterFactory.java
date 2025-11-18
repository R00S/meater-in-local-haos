package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.d;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.c;
import com.google.gson.internal.h;
import com.google.gson.internal.j;
import com.google.gson.internal.k;
import com.google.gson.r;
import com.google.gson.u;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ReflectiveTypeAdapterFactory implements u {

    /* renamed from: B, reason: collision with root package name */
    private final c f38918B;

    /* renamed from: C, reason: collision with root package name */
    private final d f38919C;

    /* renamed from: D, reason: collision with root package name */
    private final Excluder f38920D;

    /* renamed from: E, reason: collision with root package name */
    private final JsonAdapterAnnotationTypeAdapterFactory f38921E;

    /* renamed from: F, reason: collision with root package name */
    private final List<r> f38922F;

    public static abstract class Adapter<T, A> extends TypeAdapter<T> {

        /* renamed from: a, reason: collision with root package name */
        final Map<String, b> f38923a;

        Adapter(Map<String, b> map) {
            this.f38923a = map;
        }

        abstract A a();

        abstract T b(A a10);

        abstract void c(A a10, Q9.a aVar, b bVar);

        @Override // com.google.gson.TypeAdapter
        public T read(Q9.a aVar) throws IOException {
            if (aVar.N() == Q9.b.NULL) {
                aVar.z();
                return null;
            }
            A a10 = a();
            try {
                aVar.b();
                while (aVar.m()) {
                    b bVar = this.f38923a.get(aVar.x());
                    if (bVar == null || !bVar.f38942e) {
                        aVar.o0();
                    } else {
                        c(a10, aVar, bVar);
                    }
                }
                aVar.g();
                return b(a10);
            } catch (IllegalAccessException e10) {
                throw O9.a.e(e10);
            } catch (IllegalStateException e11) {
                throw new JsonSyntaxException(e11);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void write(Q9.c cVar, T t10) throws IOException {
            if (t10 == null) {
                cVar.p();
                return;
            }
            cVar.d();
            try {
                Iterator<b> it = this.f38923a.values().iterator();
                while (it.hasNext()) {
                    it.next().c(cVar, t10);
                }
                cVar.g();
            } catch (IllegalAccessException e10) {
                throw O9.a.e(e10);
            }
        }
    }

    private static final class RecordAdapter<T> extends Adapter<T, Object[]> {

        /* renamed from: e, reason: collision with root package name */
        static final Map<Class<?>, Object> f38925e = f();

        /* renamed from: b, reason: collision with root package name */
        private final Constructor<T> f38926b;

        /* renamed from: c, reason: collision with root package name */
        private final Object[] f38927c;

        /* renamed from: d, reason: collision with root package name */
        private final Map<String, Integer> f38928d;

        RecordAdapter(Class<T> cls, Map<String, b> map, boolean z10) throws SecurityException {
            super(map);
            this.f38928d = new HashMap();
            Constructor<T> constructorI = O9.a.i(cls);
            this.f38926b = constructorI;
            if (z10) {
                ReflectiveTypeAdapterFactory.c(null, constructorI);
            } else {
                O9.a.l(constructorI);
            }
            String[] strArrJ = O9.a.j(cls);
            for (int i10 = 0; i10 < strArrJ.length; i10++) {
                this.f38928d.put(strArrJ[i10], Integer.valueOf(i10));
            }
            Class<?>[] parameterTypes = this.f38926b.getParameterTypes();
            this.f38927c = new Object[parameterTypes.length];
            for (int i11 = 0; i11 < parameterTypes.length; i11++) {
                this.f38927c[i11] = f38925e.get(parameterTypes[i11]);
            }
        }

        private static Map<Class<?>, Object> f() {
            HashMap map = new HashMap();
            map.put(Byte.TYPE, (byte) 0);
            map.put(Short.TYPE, (short) 0);
            map.put(Integer.TYPE, 0);
            map.put(Long.TYPE, 0L);
            map.put(Float.TYPE, Float.valueOf(0.0f));
            map.put(Double.TYPE, Double.valueOf(0.0d));
            map.put(Character.TYPE, (char) 0);
            map.put(Boolean.TYPE, Boolean.FALSE);
            return map;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Object[] a() {
            return (Object[]) this.f38927c.clone();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public T b(Object[] objArr) {
            try {
                return this.f38926b.newInstance(objArr);
            } catch (IllegalAccessException e10) {
                throw O9.a.e(e10);
            } catch (IllegalArgumentException e11) {
                e = e11;
                throw new RuntimeException("Failed to invoke constructor '" + O9.a.c(this.f38926b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e12) {
                e = e12;
                throw new RuntimeException("Failed to invoke constructor '" + O9.a.c(this.f38926b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Failed to invoke constructor '" + O9.a.c(this.f38926b) + "' with args " + Arrays.toString(objArr), e13.getCause());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void c(Object[] objArr, Q9.a aVar, b bVar) {
            Integer num = this.f38928d.get(bVar.f38940c);
            if (num != null) {
                bVar.a(aVar, num.intValue(), objArr);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + O9.a.c(this.f38926b) + "' for field with name '" + bVar.f38940c + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    class a extends b {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f38929f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Method f38930g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f38931h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ TypeAdapter f38932i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Gson f38933j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ P9.a f38934k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f38935l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f38936m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Field field, boolean z10, boolean z11, boolean z12, Method method, boolean z13, TypeAdapter typeAdapter, Gson gson, P9.a aVar, boolean z14, boolean z15) {
            super(str, field, z10, z11);
            this.f38929f = z12;
            this.f38930g = method;
            this.f38931h = z13;
            this.f38932i = typeAdapter;
            this.f38933j = gson;
            this.f38934k = aVar;
            this.f38935l = z14;
            this.f38936m = z15;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
        void a(Q9.a aVar, int i10, Object[] objArr) {
            Object obj = this.f38932i.read(aVar);
            if (obj != null || !this.f38935l) {
                objArr[i10] = obj;
                return;
            }
            throw new JsonParseException("null is not allowed as value for record component '" + this.f38940c + "' of primitive type; at path " + aVar.h());
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
        void b(Q9.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException {
            Object obj2 = this.f38932i.read(aVar);
            if (obj2 == null && this.f38935l) {
                return;
            }
            if (this.f38929f) {
                ReflectiveTypeAdapterFactory.c(obj, this.f38939b);
            } else if (this.f38936m) {
                throw new JsonIOException("Cannot set value of 'static final' " + O9.a.g(this.f38939b, false));
            }
            this.f38939b.set(obj, obj2);
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
        void c(Q9.c cVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Object objInvoke;
            if (this.f38941d) {
                if (this.f38929f) {
                    Method method = this.f38930g;
                    if (method == null) {
                        ReflectiveTypeAdapterFactory.c(obj, this.f38939b);
                    } else {
                        ReflectiveTypeAdapterFactory.c(obj, method);
                    }
                }
                Method method2 = this.f38930g;
                if (method2 != null) {
                    try {
                        objInvoke = method2.invoke(obj, null);
                    } catch (InvocationTargetException e10) {
                        throw new JsonIOException("Accessor " + O9.a.g(this.f38930g, false) + " threw exception", e10.getCause());
                    }
                } else {
                    objInvoke = this.f38939b.get(obj);
                }
                if (objInvoke == obj) {
                    return;
                }
                cVar.n(this.f38938a);
                (this.f38931h ? this.f38932i : new TypeAdapterRuntimeTypeWrapper(this.f38933j, this.f38932i, this.f38934k.d())).write(cVar, objInvoke);
            }
        }
    }

    static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        final String f38938a;

        /* renamed from: b, reason: collision with root package name */
        final Field f38939b;

        /* renamed from: c, reason: collision with root package name */
        final String f38940c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f38941d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f38942e;

        protected b(String str, Field field, boolean z10, boolean z11) {
            this.f38938a = str;
            this.f38939b = field;
            this.f38940c = field.getName();
            this.f38941d = z10;
            this.f38942e = z11;
        }

        abstract void a(Q9.a aVar, int i10, Object[] objArr);

        abstract void b(Q9.a aVar, Object obj);

        abstract void c(Q9.c cVar, Object obj);
    }

    public ReflectiveTypeAdapterFactory(c cVar, d dVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List<r> list) {
        this.f38918B = cVar;
        this.f38919C = dVar;
        this.f38920D = excluder;
        this.f38921E = jsonAdapterAnnotationTypeAdapterFactory;
        this.f38922F = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <M extends AccessibleObject & Member> void c(Object obj, M m10) {
        if (Modifier.isStatic(m10.getModifiers())) {
            obj = null;
        }
        if (k.a(m10, obj)) {
            return;
        }
        throw new JsonIOException(O9.a.g(m10, true) + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
    }

    private b d(Gson gson, Field field, Method method, String str, P9.a<?> aVar, boolean z10, boolean z11, boolean z12) {
        boolean zA = j.a(aVar.c());
        int modifiers = field.getModifiers();
        boolean z13 = Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers);
        M9.b bVar = (M9.b) field.getAnnotation(M9.b.class);
        TypeAdapter<?> typeAdapterA = bVar != null ? this.f38921E.a(this.f38918B, gson, aVar, bVar) : null;
        boolean z14 = typeAdapterA != null;
        if (typeAdapterA == null) {
            typeAdapterA = gson.m(aVar);
        }
        return new a(str, field, z10, z11, z12, method, z14, typeAdapterA, gson, aVar, zA, z13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    private Map<String, b> e(Gson gson, P9.a<?> aVar, Class<?> cls, boolean z10, boolean z11) throws SecurityException {
        boolean z12;
        Method method;
        int i10;
        int i11;
        boolean z13;
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = this;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        P9.a<?> aVarB = aVar;
        boolean z14 = z10;
        Class<?> clsC = cls;
        while (clsC != Object.class) {
            Field[] declaredFields = clsC.getDeclaredFields();
            boolean z15 = true;
            boolean z16 = false;
            if (clsC != cls && declaredFields.length > 0) {
                r.a aVarB2 = k.b(reflectiveTypeAdapterFactory.f38922F, clsC);
                if (aVarB2 == r.a.BLOCK_ALL) {
                    throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + clsC + " (supertype of " + cls + "). Register a TypeAdapter for this type or adjust the access filter.");
                }
                z14 = aVarB2 == r.a.BLOCK_INACCESSIBLE;
            }
            boolean z17 = z14;
            int length = declaredFields.length;
            int i12 = 0;
            while (i12 < length) {
                Field field = declaredFields[i12];
                boolean zG = reflectiveTypeAdapterFactory.g(field, z15);
                boolean zG2 = reflectiveTypeAdapterFactory.g(field, z16);
                if (zG || zG2) {
                    b bVar = null;
                    if (!z11) {
                        z12 = zG2;
                        method = null;
                    } else if (Modifier.isStatic(field.getModifiers())) {
                        method = null;
                        z12 = z16;
                    } else {
                        Method methodH = O9.a.h(clsC, field);
                        if (!z17) {
                            O9.a.l(methodH);
                        }
                        if (methodH.getAnnotation(M9.c.class) != null && field.getAnnotation(M9.c.class) == null) {
                            throw new JsonIOException("@SerializedName on " + O9.a.g(methodH, z16) + " is not supported");
                        }
                        z12 = zG2;
                        method = methodH;
                    }
                    if (!z17 && method == null) {
                        O9.a.l(field);
                    }
                    Type typeO = com.google.gson.internal.b.o(aVarB.d(), clsC, field.getGenericType());
                    List<String> listF = reflectiveTypeAdapterFactory.f(field);
                    int size = listF.size();
                    ?? r12 = z16;
                    while (r12 < size) {
                        String str = listF.get(r12);
                        boolean z18 = r12 != 0 ? z16 : zG;
                        int i13 = r12;
                        b bVar2 = bVar;
                        int i14 = size;
                        List<String> list = listF;
                        Field field2 = field;
                        int i15 = i12;
                        int i16 = length;
                        boolean z19 = z16;
                        bVar = bVar2 == null ? (b) linkedHashMap.put(str, d(gson, field, method, str, P9.a.b(typeO), z18, z12, z17)) : bVar2;
                        zG = z18;
                        i12 = i15;
                        size = i14;
                        listF = list;
                        field = field2;
                        length = i16;
                        z16 = z19;
                        r12 = i13 + 1;
                    }
                    b bVar3 = bVar;
                    Field field3 = field;
                    i10 = i12;
                    i11 = length;
                    z13 = z16;
                    if (bVar3 != null) {
                        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + bVar3.f38938a + "'; conflict is caused by fields " + O9.a.f(bVar3.f38939b) + " and " + O9.a.f(field3));
                    }
                } else {
                    i10 = i12;
                    i11 = length;
                    z13 = z16;
                }
                i12 = i10 + 1;
                z15 = true;
                reflectiveTypeAdapterFactory = this;
                length = i11;
                z16 = z13;
            }
            aVarB = P9.a.b(com.google.gson.internal.b.o(aVarB.d(), clsC, clsC.getGenericSuperclass()));
            clsC = aVarB.c();
            reflectiveTypeAdapterFactory = this;
            z14 = z17;
        }
        return linkedHashMap;
    }

    private List<String> f(Field field) {
        M9.c cVar = (M9.c) field.getAnnotation(M9.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f38919C.c(field));
        }
        String strValue = cVar.value();
        String[] strArrAlternate = cVar.alternate();
        if (strArrAlternate.length == 0) {
            return Collections.singletonList(strValue);
        }
        ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
        arrayList.add(strValue);
        Collections.addAll(arrayList, strArrAlternate);
        return arrayList;
    }

    private boolean g(Field field, boolean z10) {
        return (this.f38920D.d(field.getType(), z10) || this.f38920D.h(field, z10)) ? false : true;
    }

    @Override // com.google.gson.u
    public <T> TypeAdapter<T> b(Gson gson, P9.a<T> aVar) {
        Class<? super T> clsC = aVar.c();
        if (!Object.class.isAssignableFrom(clsC)) {
            return null;
        }
        r.a aVarB = k.b(this.f38922F, clsC);
        if (aVarB != r.a.BLOCK_ALL) {
            boolean z10 = aVarB == r.a.BLOCK_INACCESSIBLE;
            return O9.a.k(clsC) ? new RecordAdapter(clsC, e(gson, aVar, clsC, z10, true), z10) : new FieldReflectionAdapter(this.f38918B.b(aVar), e(gson, aVar, clsC, z10, false));
        }
        throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + clsC + ". Register a TypeAdapter for this type or adjust the access filter.");
    }

    private static final class FieldReflectionAdapter<T> extends Adapter<T, T> {

        /* renamed from: b, reason: collision with root package name */
        private final h<T> f38924b;

        FieldReflectionAdapter(h<T> hVar, Map<String, b> map) {
            super(map);
            this.f38924b = hVar;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        T a() {
            return this.f38924b.a();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        void c(T t10, Q9.a aVar, b bVar) {
            bVar.b(aVar, t10);
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        T b(T t10) {
            return t10;
        }
    }
}
