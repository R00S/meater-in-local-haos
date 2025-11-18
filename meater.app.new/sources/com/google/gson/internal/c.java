package com.google.gson.internal;

import com.google.gson.JsonIOException;
import com.google.gson.r;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* compiled from: ConstructorConstructor.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Type, com.google.gson.f<?>> f39042a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f39043b;

    /* renamed from: c, reason: collision with root package name */
    private final List<com.google.gson.r> f39044c;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    class a<T> implements com.google.gson.internal.h<T> {
        a() {
        }

        @Override // com.google.gson.internal.h
        public T a() {
            return (T) new TreeSet();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    class b<T> implements com.google.gson.internal.h<T> {
        b() {
        }

        @Override // com.google.gson.internal.h
        public T a() {
            return (T) new LinkedHashSet();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: com.google.gson.internal.c$c, reason: collision with other inner class name */
    class C0496c<T> implements com.google.gson.internal.h<T> {
        C0496c() {
        }

        @Override // com.google.gson.internal.h
        public T a() {
            return (T) new ArrayDeque();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    class d<T> implements com.google.gson.internal.h<T> {
        d() {
        }

        @Override // com.google.gson.internal.h
        public T a() {
            return (T) new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    class e<T> implements com.google.gson.internal.h<T> {
        e() {
        }

        @Override // com.google.gson.internal.h
        public T a() {
            return (T) new ConcurrentSkipListMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    class f<T> implements com.google.gson.internal.h<T> {
        f() {
        }

        @Override // com.google.gson.internal.h
        public T a() {
            return (T) new ConcurrentHashMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    class g<T> implements com.google.gson.internal.h<T> {
        g() {
        }

        @Override // com.google.gson.internal.h
        public T a() {
            return (T) new TreeMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    class h<T> implements com.google.gson.internal.h<T> {
        h() {
        }

        @Override // com.google.gson.internal.h
        public T a() {
            return (T) new LinkedHashMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    class i<T> implements com.google.gson.internal.h<T> {
        i() {
        }

        @Override // com.google.gson.internal.h
        public T a() {
            return (T) new com.google.gson.internal.g();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    class j<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f39045a;

        j(Class cls) {
            this.f39045a = cls;
        }

        @Override // com.google.gson.internal.h
        public T a() {
            try {
                return (T) com.google.gson.internal.m.f39099a.d(this.f39045a);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to create instance of " + this.f39045a + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    class k<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.gson.f f39047a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Type f39048b;

        k(com.google.gson.f fVar, Type type) {
            this.f39047a = fVar;
            this.f39048b = type;
        }

        @Override // com.google.gson.internal.h
        public T a() {
            return (T) this.f39047a.a(this.f39048b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    class l<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f39050a;

        l(String str) {
            this.f39050a = str;
        }

        @Override // com.google.gson.internal.h
        public T a() {
            throw new JsonIOException(this.f39050a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    class m<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.gson.f f39052a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Type f39053b;

        m(com.google.gson.f fVar, Type type) {
            this.f39052a = fVar;
            this.f39053b = type;
        }

        @Override // com.google.gson.internal.h
        public T a() {
            return (T) this.f39052a.a(this.f39053b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    class n<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f39055a;

        n(String str) {
            this.f39055a = str;
        }

        @Override // com.google.gson.internal.h
        public T a() {
            throw new JsonIOException(this.f39055a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    class o<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f39057a;

        o(String str) {
            this.f39057a = str;
        }

        @Override // com.google.gson.internal.h
        public T a() {
            throw new JsonIOException(this.f39057a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    class p<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f39059a;

        p(Type type) {
            this.f39059a = type;
        }

        @Override // com.google.gson.internal.h
        public T a() {
            Type type = this.f39059a;
            if (!(type instanceof ParameterizedType)) {
                throw new JsonIOException("Invalid EnumSet type: " + this.f39059a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return (T) EnumSet.noneOf((Class) type2);
            }
            throw new JsonIOException("Invalid EnumSet type: " + this.f39059a.toString());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    class q<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f39060a;

        q(Type type) {
            this.f39060a = type;
        }

        @Override // com.google.gson.internal.h
        public T a() {
            Type type = this.f39060a;
            if (!(type instanceof ParameterizedType)) {
                throw new JsonIOException("Invalid EnumMap type: " + this.f39060a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return (T) new EnumMap((Class) type2);
            }
            throw new JsonIOException("Invalid EnumMap type: " + this.f39060a.toString());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    class r<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f39061a;

        r(String str) {
            this.f39061a = str;
        }

        @Override // com.google.gson.internal.h
        public T a() {
            throw new JsonIOException(this.f39061a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    class s<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f39062a;

        s(String str) {
            this.f39062a = str;
        }

        @Override // com.google.gson.internal.h
        public T a() {
            throw new JsonIOException(this.f39062a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    class t<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Constructor f39063a;

        t(Constructor constructor) {
            this.f39063a = constructor;
        }

        @Override // com.google.gson.internal.h
        public T a() {
            try {
                return (T) this.f39063a.newInstance(null);
            } catch (IllegalAccessException e10) {
                throw O9.a.e(e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Failed to invoke constructor '" + O9.a.c(this.f39063a) + "' with no args", e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("Failed to invoke constructor '" + O9.a.c(this.f39063a) + "' with no args", e12.getCause());
            }
        }
    }

    public c(Map<Type, com.google.gson.f<?>> map, boolean z10, List<com.google.gson.r> list) {
        this.f39042a = map;
        this.f39043b = z10;
        this.f39044c = list;
    }

    static String a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + cls.getName();
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName();
    }

    private static <T> com.google.gson.internal.h<T> c(Class<? super T> cls, r.a aVar) throws NoSuchMethodException, SecurityException {
        String strM;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(null);
            r.a aVar2 = r.a.ALLOW;
            if (aVar == aVar2 || (com.google.gson.internal.k.a(declaredConstructor, null) && (aVar != r.a.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                return (aVar != aVar2 || (strM = O9.a.m(declaredConstructor)) == null) ? new t(declaredConstructor) : new s(strM);
            }
            return new r("Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private static <T> com.google.gson.internal.h<T> d(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new a() : Set.class.isAssignableFrom(cls) ? new b() : Queue.class.isAssignableFrom(cls) ? new C0496c() : new d();
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new e() : ConcurrentMap.class.isAssignableFrom(cls) ? new f() : SortedMap.class.isAssignableFrom(cls) ? new g() : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(P9.a.b(((ParameterizedType) type).getActualTypeArguments()[0]).c())) ? new i() : new h();
        }
        return null;
    }

    private static <T> com.google.gson.internal.h<T> e(Type type, Class<? super T> cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new p(type);
        }
        if (cls == EnumMap.class) {
            return new q(type);
        }
        return null;
    }

    private <T> com.google.gson.internal.h<T> f(Class<? super T> cls) {
        if (this.f39043b) {
            return new j(cls);
        }
        return new l("Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
    }

    public <T> com.google.gson.internal.h<T> b(P9.a<T> aVar) throws NoSuchMethodException, SecurityException {
        Type typeD = aVar.d();
        Class<? super T> clsC = aVar.c();
        com.google.gson.f<?> fVar = this.f39042a.get(typeD);
        if (fVar != null) {
            return new k(fVar, typeD);
        }
        com.google.gson.f<?> fVar2 = this.f39042a.get(clsC);
        if (fVar2 != null) {
            return new m(fVar2, typeD);
        }
        com.google.gson.internal.h<T> hVarE = e(typeD, clsC);
        if (hVarE != null) {
            return hVarE;
        }
        r.a aVarB = com.google.gson.internal.k.b(this.f39044c, clsC);
        com.google.gson.internal.h<T> hVarC = c(clsC, aVarB);
        if (hVarC != null) {
            return hVarC;
        }
        com.google.gson.internal.h<T> hVarD = d(typeD, clsC);
        if (hVarD != null) {
            return hVarD;
        }
        String strA = a(clsC);
        if (strA != null) {
            return new n(strA);
        }
        if (aVarB == r.a.ALLOW) {
            return f(clsC);
        }
        return new o("Unable to create instance of " + clsC + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
    }

    public String toString() {
        return this.f39042a.toString();
    }
}
