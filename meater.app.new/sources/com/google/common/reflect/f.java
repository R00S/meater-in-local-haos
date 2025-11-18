package com.google.common.reflect;

import com.google.common.reflect.a;
import com.google.common.reflect.h;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import l8.C3915h;
import l8.m;
import l8.n;
import m8.AbstractC3979B;
import m8.AbstractC4002q;
import m8.AbstractC4005u;
import m8.AbstractC4009y;
import m8.L;
import m8.U;
import m8.j0;

/* compiled from: TypeToken.java */
/* loaded from: classes2.dex */
public abstract class f<T> extends com.google.common.reflect.c<T> implements Serializable {
    private static final long serialVersionUID = 3637540370352322684L;
    private transient com.google.common.reflect.e covariantTypeResolver;
    private transient com.google.common.reflect.e invariantTypeResolver;
    private final Type runtimeType;

    /* compiled from: TypeToken.java */
    class a extends a.b<T> {
        a(Method method) {
            super(method);
        }

        @Override // com.google.common.reflect.a
        public f<T> a() {
            return f.this;
        }

        @Override // com.google.common.reflect.a
        public String toString() {
            return a() + "." + super.toString();
        }
    }

    /* compiled from: TypeToken.java */
    class b extends a.C0477a<T> {
        b(Constructor constructor) {
            super(constructor);
        }

        @Override // com.google.common.reflect.a
        public f<T> a() {
            return f.this;
        }

        @Override // com.google.common.reflect.a.C0477a
        Type[] c() {
            return f.this.getInvariantTypeResolver().l(super.c());
        }

        @Override // com.google.common.reflect.a
        public String toString() {
            return a() + "(" + C3915h.h(", ").f(c()) + ")";
        }
    }

    /* compiled from: TypeToken.java */
    class c extends com.google.common.reflect.g {
        c() {
        }

        @Override // com.google.common.reflect.g
        void c(GenericArrayType genericArrayType) {
            a(genericArrayType.getGenericComponentType());
        }

        @Override // com.google.common.reflect.g
        void d(ParameterizedType parameterizedType) {
            a(parameterizedType.getActualTypeArguments());
            a(parameterizedType.getOwnerType());
        }

        @Override // com.google.common.reflect.g
        void e(TypeVariable<?> typeVariable) {
            throw new IllegalArgumentException(f.this.runtimeType + "contains a type variable and is not safe for the operation");
        }

        @Override // com.google.common.reflect.g
        void f(WildcardType wildcardType) {
            a(wildcardType.getLowerBounds());
            a(wildcardType.getUpperBounds());
        }
    }

    /* compiled from: TypeToken.java */
    class d extends com.google.common.reflect.g {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC3979B.a f37586b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f37587c;

        d(f fVar, AbstractC3979B.a aVar) {
            this.f37586b = aVar;
            this.f37587c = fVar;
        }

        @Override // com.google.common.reflect.g
        void b(Class<?> cls) {
            this.f37586b.a(cls);
        }

        @Override // com.google.common.reflect.g
        void c(GenericArrayType genericArrayType) {
            this.f37586b.a(com.google.common.reflect.h.h(f.of(genericArrayType.getGenericComponentType()).getRawType()));
        }

        @Override // com.google.common.reflect.g
        void d(ParameterizedType parameterizedType) {
            this.f37586b.a((Class) parameterizedType.getRawType());
        }

        @Override // com.google.common.reflect.g
        void e(TypeVariable<?> typeVariable) {
            a(typeVariable.getBounds());
        }

        @Override // com.google.common.reflect.g
        void f(WildcardType wildcardType) {
            a(wildcardType.getUpperBounds());
        }
    }

    /* compiled from: TypeToken.java */
    private static class e {

        /* renamed from: a, reason: collision with root package name */
        private final Type[] f37588a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f37589b;

        e(Type[] typeArr, boolean z10) {
            this.f37588a = typeArr;
            this.f37589b = z10;
        }

        boolean a(Type type) {
            for (Type type2 : this.f37588a) {
                boolean zIsSubtypeOf = f.of(type2).isSubtypeOf(type);
                boolean z10 = this.f37589b;
                if (zIsSubtypeOf == z10) {
                    return z10;
                }
            }
            return !this.f37589b;
        }

        boolean b(Type type) {
            f<?> fVarOf = f.of(type);
            for (Type type2 : this.f37588a) {
                boolean zIsSubtypeOf = fVarOf.isSubtypeOf(type2);
                boolean z10 = this.f37589b;
                if (zIsSubtypeOf == z10) {
                    return z10;
                }
            }
            return !this.f37589b;
        }
    }

    /* compiled from: TypeToken.java */
    /* renamed from: com.google.common.reflect.f$f, reason: collision with other inner class name */
    private static final class C0479f<T> extends f<T> {
        C0479f(Type type) {
            super(type, null);
        }
    }

    /* compiled from: TypeToken.java */
    private static abstract class g<K> {

        /* renamed from: a, reason: collision with root package name */
        static final g<f<?>> f37590a = new a();

        /* renamed from: b, reason: collision with root package name */
        static final g<Class<?>> f37591b = new b();

        /* compiled from: TypeToken.java */
        class a extends g<f<?>> {
            a() {
                super(null);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.f.g
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public Iterable<? extends f<?>> d(f<?> fVar) {
                return fVar.getGenericInterfaces();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.f.g
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public Class<?> e(f<?> fVar) {
                return fVar.getRawType();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.f.g
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public f<?> f(f<?> fVar) {
                return fVar.getGenericSuperclass();
            }
        }

        /* compiled from: TypeToken.java */
        class c extends U<K> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ Comparator f37592B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ Map f37593C;

            c(Comparator comparator, Map map) {
                this.f37592B = comparator;
                this.f37593C = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // m8.U, java.util.Comparator
            public int compare(K k10, K k11) {
                Comparator comparator = this.f37592B;
                Object obj = this.f37593C.get(k10);
                Objects.requireNonNull(obj);
                Object obj2 = this.f37593C.get(k11);
                Objects.requireNonNull(obj2);
                return comparator.compare(obj, obj2);
            }
        }

        private g() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        private int a(K k10, Map<? super K, Integer> map) {
            Integer num = map.get(k10);
            if (num != null) {
                return num.intValue();
            }
            boolean zIsInterface = e(k10).isInterface();
            Iterator<? extends K> it = d(k10).iterator();
            int iMax = zIsInterface;
            while (it.hasNext()) {
                iMax = Math.max(iMax, a(it.next(), map));
            }
            K kF = f(k10);
            int iMax2 = iMax;
            if (kF != null) {
                iMax2 = Math.max(iMax, a(kF, map));
            }
            int i10 = iMax2 + 1;
            map.put(k10, Integer.valueOf(i10));
            return i10;
        }

        private static <K, V> AbstractC4009y<K> g(Map<K, V> map, Comparator<? super V> comparator) {
            return (AbstractC4009y<K>) new c(comparator, map).c(map.keySet());
        }

        AbstractC4009y<K> b(Iterable<? extends K> iterable) {
            HashMap mapF = L.f();
            Iterator<? extends K> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next(), mapF);
            }
            return g(mapF, U.d().g());
        }

        final AbstractC4009y<K> c(K k10) {
            return b(AbstractC4009y.H(k10));
        }

        abstract Iterable<? extends K> d(K k10);

        abstract Class<?> e(K k10);

        abstract K f(K k10);

        /* synthetic */ g(a aVar) {
            this();
        }

        /* compiled from: TypeToken.java */
        class b extends g<Class<?>> {
            b() {
                super(null);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.f.g
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public Iterable<? extends Class<?>> d(Class<?> cls) {
                return Arrays.asList(cls.getInterfaces());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.f.g
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public Class<?> f(Class<?> cls) {
                return cls.getSuperclass();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.f.g
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public Class<?> e(Class<?> cls) {
                return cls;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TypeToken.java */
    private static abstract class h implements n<f<?>> {

        /* renamed from: B, reason: collision with root package name */
        public static final h f37594B = new a("IGNORE_TYPE_VARIABLE_OR_WILDCARD", 0);

        /* renamed from: C, reason: collision with root package name */
        public static final h f37595C = new b("INTERFACE_ONLY", 1);

        /* renamed from: D, reason: collision with root package name */
        private static final /* synthetic */ h[] f37596D = c();

        /* compiled from: TypeToken.java */
        enum a extends h {
            a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // l8.n
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public boolean apply(f<?> fVar) {
                return ((((f) fVar).runtimeType instanceof TypeVariable) || (((f) fVar).runtimeType instanceof WildcardType)) ? false : true;
            }
        }

        /* compiled from: TypeToken.java */
        enum b extends h {
            b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // l8.n
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public boolean apply(f<?> fVar) {
                return fVar.getRawType().isInterface();
            }
        }

        private h(String str, int i10) {
        }

        private static /* synthetic */ h[] c() {
            return new h[]{f37594B, f37595C};
        }

        public static h valueOf(String str) {
            return (h) Enum.valueOf(h.class, str);
        }

        public static h[] values() {
            return (h[]) f37596D.clone();
        }

        /* synthetic */ h(String str, int i10, a aVar) {
            this(str, i10);
        }
    }

    /* compiled from: TypeToken.java */
    public class i extends AbstractC4005u<f<? super T>> implements Serializable {

        /* renamed from: B, reason: collision with root package name */
        private transient AbstractC3979B<f<? super T>> f37597B;

        i() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m8.r
        /* renamed from: i, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public Set<f<? super T>> h() {
            AbstractC3979B<f<? super T>> abstractC3979B = this.f37597B;
            if (abstractC3979B != null) {
                return abstractC3979B;
            }
            AbstractC3979B<f<? super T>> abstractC3979BI = AbstractC4002q.f(g.f37590a.c(f.this)).c(h.f37594B).i();
            this.f37597B = abstractC3979BI;
            return abstractC3979BI;
        }
    }

    /* synthetic */ f(Type type, a aVar) {
        this(type);
    }

    private static e any(Type[] typeArr) {
        return new e(typeArr, true);
    }

    private f<? super T> boundAsSuperclass(Type type) {
        f<? super T> fVar = (f<? super T>) of(type);
        if (fVar.getRawType().isInterface()) {
            return null;
        }
        return fVar;
    }

    private AbstractC4009y<f<? super T>> boundsAsInterfaces(Type[] typeArr) {
        AbstractC4009y.a aVarY = AbstractC4009y.y();
        for (Type type : typeArr) {
            f<?> fVarOf = of(type);
            if (fVarOf.getRawType().isInterface()) {
                aVarY.a(fVarOf);
            }
        }
        return aVarY.k();
    }

    private static Type canonicalizeTypeArg(TypeVariable<?> typeVariable, Type type) {
        return type instanceof WildcardType ? canonicalizeWildcardType(typeVariable, (WildcardType) type) : canonicalizeWildcardsInType(type);
    }

    private static WildcardType canonicalizeWildcardType(TypeVariable<?> typeVariable, WildcardType wildcardType) {
        Type[] bounds = typeVariable.getBounds();
        ArrayList arrayList = new ArrayList();
        for (Type type : wildcardType.getUpperBounds()) {
            if (!any(bounds).a(type)) {
                arrayList.add(canonicalizeWildcardsInType(type));
            }
        }
        return new h.i(wildcardType.getLowerBounds(), (Type[]) arrayList.toArray(new Type[0]));
    }

    private static ParameterizedType canonicalizeWildcardsInParameterizedType(ParameterizedType parameterizedType) {
        Class cls = (Class) parameterizedType.getRawType();
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
            actualTypeArguments[i10] = canonicalizeTypeArg(typeParameters[i10], actualTypeArguments[i10]);
        }
        return com.google.common.reflect.h.m(parameterizedType.getOwnerType(), cls, actualTypeArguments);
    }

    private static Type canonicalizeWildcardsInType(Type type) {
        return type instanceof ParameterizedType ? canonicalizeWildcardsInParameterizedType((ParameterizedType) type) : type instanceof GenericArrayType ? com.google.common.reflect.h.j(canonicalizeWildcardsInType(((GenericArrayType) type).getGenericComponentType())) : type;
    }

    private static e every(Type[] typeArr) {
        return new e(typeArr, false);
    }

    private f<? extends T> getArraySubtype(Class<?> cls) {
        Class<?> componentType = cls.getComponentType();
        if (componentType != null) {
            f<?> componentType2 = getComponentType();
            Objects.requireNonNull(componentType2);
            return (f<? extends T>) of(newArrayClassOrGenericArrayType(componentType2.getSubtype(componentType).runtimeType));
        }
        throw new IllegalArgumentException(cls + " does not appear to be a subtype of " + this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private f<? super T> getArraySupertype(Class<? super T> cls) {
        f<?> componentType = getComponentType();
        if (componentType != 0) {
            Class<?> componentType2 = cls.getComponentType();
            Objects.requireNonNull(componentType2);
            return (f<? super T>) of(newArrayClassOrGenericArrayType(componentType.getSupertype(componentType2).runtimeType));
        }
        throw new IllegalArgumentException(cls + " isn't a super type of " + this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.reflect.e getCovariantTypeResolver() {
        com.google.common.reflect.e eVar = this.covariantTypeResolver;
        if (eVar != null) {
            return eVar;
        }
        com.google.common.reflect.e eVarD = com.google.common.reflect.e.d(this.runtimeType);
        this.covariantTypeResolver = eVarD;
        return eVarD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.reflect.e getInvariantTypeResolver() {
        com.google.common.reflect.e eVar = this.invariantTypeResolver;
        if (eVar != null) {
            return eVar;
        }
        com.google.common.reflect.e eVarF = com.google.common.reflect.e.f(this.runtimeType);
        this.invariantTypeResolver = eVarF;
        return eVarF;
    }

    private Type getOwnerTypeIfPresent() {
        Type type = this.runtimeType;
        if (type instanceof ParameterizedType) {
            return ((ParameterizedType) type).getOwnerType();
        }
        if (type instanceof Class) {
            return ((Class) type).getEnclosingClass();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC3979B<Class<? super T>> getRawTypes() {
        AbstractC3979B.a aVarY = AbstractC3979B.y();
        new d(this, aVarY).a(this.runtimeType);
        return aVarY.m();
    }

    private f<? extends T> getSubtypeFromLowerBounds(Class<?> cls, Type[] typeArr) {
        if (typeArr.length > 0) {
            return (f<? extends T>) of(typeArr[0]).getSubtype(cls);
        }
        throw new IllegalArgumentException(cls + " isn't a subclass of " + this);
    }

    private f<? super T> getSupertypeFromUpperBounds(Class<? super T> cls, Type[] typeArr) {
        for (Type type : typeArr) {
            f<?> fVarOf = of(type);
            if (fVarOf.isSubtypeOf(cls)) {
                return (f<? super T>) fVarOf.getSupertype(cls);
            }
        }
        throw new IllegalArgumentException(cls + " isn't a super type of " + this);
    }

    private boolean is(Type type, TypeVariable<?> typeVariable) {
        if (this.runtimeType.equals(type)) {
            return true;
        }
        if (!(type instanceof WildcardType)) {
            return canonicalizeWildcardsInType(this.runtimeType).equals(canonicalizeWildcardsInType(type));
        }
        WildcardType wildcardTypeCanonicalizeWildcardType = canonicalizeWildcardType(typeVariable, (WildcardType) type);
        return every(wildcardTypeCanonicalizeWildcardType.getUpperBounds()).b(this.runtimeType) && every(wildcardTypeCanonicalizeWildcardType.getLowerBounds()).a(this.runtimeType);
    }

    private boolean isOwnedBySubtypeOf(Type type) {
        Iterator<f<? super T>> it = getTypes().iterator();
        while (it.hasNext()) {
            Type ownerTypeIfPresent = it.next().getOwnerTypeIfPresent();
            if (ownerTypeIfPresent != null && of(ownerTypeIfPresent).isSubtypeOf(type)) {
                return true;
            }
        }
        return false;
    }

    private boolean isSubtypeOfArrayType(GenericArrayType genericArrayType) {
        Type type = this.runtimeType;
        if (!(type instanceof Class)) {
            if (type instanceof GenericArrayType) {
                return of(((GenericArrayType) type).getGenericComponentType()).isSubtypeOf(genericArrayType.getGenericComponentType());
            }
            return false;
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            return of((Class) cls.getComponentType()).isSubtypeOf(genericArrayType.getGenericComponentType());
        }
        return false;
    }

    private boolean isSubtypeOfParameterizedType(ParameterizedType parameterizedType) {
        Class<? super Object> rawType = of(parameterizedType).getRawType();
        if (!someRawTypeIsSubclassOf(rawType)) {
            return false;
        }
        TypeVariable<Class<? super Object>>[] typeParameters = rawType.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i10 = 0; i10 < typeParameters.length; i10++) {
            if (!of(getCovariantTypeResolver().j(typeParameters[i10])).is(actualTypeArguments[i10], typeParameters[i10])) {
                return false;
            }
        }
        return Modifier.isStatic(((Class) parameterizedType.getRawType()).getModifiers()) || parameterizedType.getOwnerType() == null || isOwnedBySubtypeOf(parameterizedType.getOwnerType());
    }

    private boolean isSupertypeOfArray(GenericArrayType genericArrayType) {
        Type type = this.runtimeType;
        if (type instanceof Class) {
            Class cls = (Class) type;
            return !cls.isArray() ? cls.isAssignableFrom(Object[].class) : of(genericArrayType.getGenericComponentType()).isSubtypeOf(cls.getComponentType());
        }
        if (type instanceof GenericArrayType) {
            return of(genericArrayType.getGenericComponentType()).isSubtypeOf(((GenericArrayType) this.runtimeType).getGenericComponentType());
        }
        return false;
    }

    private boolean isWrapper() {
        return p8.i.b().contains(this.runtimeType);
    }

    private static Type newArrayClassOrGenericArrayType(Type type) {
        return h.d.f37608C.n(type);
    }

    public static <T> f<T> of(Class<T> cls) {
        return new C0479f(cls);
    }

    private f<?> resolveSupertype(Type type) {
        f<?> fVarOf = of(getCovariantTypeResolver().j(type));
        fVarOf.covariantTypeResolver = this.covariantTypeResolver;
        fVarOf.invariantTypeResolver = this.invariantTypeResolver;
        return fVarOf;
    }

    private Type resolveTypeArgsForSubclass(Class<?> cls) {
        if ((this.runtimeType instanceof Class) && (cls.getTypeParameters().length == 0 || getRawType().getTypeParameters().length != 0)) {
            return cls;
        }
        f genericType = toGenericType(cls);
        return new com.google.common.reflect.e().n(genericType.getSupertype(getRawType()).runtimeType, this.runtimeType).j(genericType.runtimeType);
    }

    private boolean someRawTypeIsSubclassOf(Class<?> cls) {
        j0<Class<? super T>> it = getRawTypes().iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(it.next())) {
                return true;
            }
        }
        return false;
    }

    static <T> f<? extends T> toGenericType(Class<T> cls) {
        if (cls.isArray()) {
            return (f<? extends T>) of(com.google.common.reflect.h.j(toGenericType(cls.getComponentType()).runtimeType));
        }
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        Type type = (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) ? null : toGenericType(cls.getEnclosingClass()).runtimeType;
        return (typeParameters.length > 0 || !(type == null || type == cls.getEnclosingClass())) ? (f<? extends T>) of(com.google.common.reflect.h.m(type, cls, typeParameters)) : of((Class) cls);
    }

    public final com.google.common.reflect.a<T, T> constructor(Constructor<?> constructor) {
        m.i(constructor.getDeclaringClass() == getRawType(), "%s not declared by %s", constructor, getRawType());
        return new b(constructor);
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.runtimeType.equals(((f) obj).runtimeType);
        }
        return false;
    }

    public final f<?> getComponentType() {
        Type typeI = com.google.common.reflect.h.i(this.runtimeType);
        if (typeI == null) {
            return null;
        }
        return of(typeI);
    }

    final AbstractC4009y<f<? super T>> getGenericInterfaces() {
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return boundsAsInterfaces(((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return boundsAsInterfaces(((WildcardType) type).getUpperBounds());
        }
        AbstractC4009y.a aVarY = AbstractC4009y.y();
        for (Type type2 : getRawType().getGenericInterfaces()) {
            aVarY.a(resolveSupertype(type2));
        }
        return aVarY.k();
    }

    final f<? super T> getGenericSuperclass() {
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return boundAsSuperclass(((TypeVariable) type).getBounds()[0]);
        }
        if (type instanceof WildcardType) {
            return boundAsSuperclass(((WildcardType) type).getUpperBounds()[0]);
        }
        Type genericSuperclass = getRawType().getGenericSuperclass();
        if (genericSuperclass == null) {
            return null;
        }
        return (f<? super T>) resolveSupertype(genericSuperclass);
    }

    public final Class<? super T> getRawType() {
        return getRawTypes().iterator().next();
    }

    public final f<? extends T> getSubtype(Class<?> cls) {
        m.h(!(this.runtimeType instanceof TypeVariable), "Cannot get subtype of type variable <%s>", this);
        Type type = this.runtimeType;
        if (type instanceof WildcardType) {
            return getSubtypeFromLowerBounds(cls, ((WildcardType) type).getLowerBounds());
        }
        if (isArray()) {
            return getArraySubtype(cls);
        }
        m.i(getRawType().isAssignableFrom(cls), "%s isn't a subclass of %s", cls, this);
        f<? extends T> fVar = (f<? extends T>) of(resolveTypeArgsForSubclass(cls));
        m.i(fVar.isSubtypeOf((f<?>) this), "%s does not appear to be a subtype of %s", fVar, this);
        return fVar;
    }

    public final f<? super T> getSupertype(Class<? super T> cls) {
        m.i(someRawTypeIsSubclassOf(cls), "%s is not a super class of %s", cls, this);
        Type type = this.runtimeType;
        return type instanceof TypeVariable ? getSupertypeFromUpperBounds(cls, ((TypeVariable) type).getBounds()) : type instanceof WildcardType ? getSupertypeFromUpperBounds(cls, ((WildcardType) type).getUpperBounds()) : cls.isArray() ? getArraySupertype(cls) : (f<? super T>) resolveSupertype(toGenericType(cls).runtimeType);
    }

    public final Type getType() {
        return this.runtimeType;
    }

    public final f<T>.i getTypes() {
        return new i();
    }

    public int hashCode() {
        return this.runtimeType.hashCode();
    }

    public final boolean isArray() {
        return getComponentType() != null;
    }

    public final boolean isPrimitive() {
        Type type = this.runtimeType;
        return (type instanceof Class) && ((Class) type).isPrimitive();
    }

    public final boolean isSubtypeOf(f<?> fVar) {
        return isSubtypeOf(fVar.getType());
    }

    public final boolean isSupertypeOf(f<?> fVar) {
        return fVar.isSubtypeOf(getType());
    }

    public final com.google.common.reflect.a<T, Object> method(Method method) {
        m.i(someRawTypeIsSubclassOf(method.getDeclaringClass()), "%s not declared by %s", method, this);
        return new a(method);
    }

    final f<T> rejectTypeVariables() {
        new c().a(this.runtimeType);
        return this;
    }

    public final f<?> resolveType(Type type) {
        m.l(type);
        return of(getInvariantTypeResolver().j(type));
    }

    public String toString() {
        return com.google.common.reflect.h.s(this.runtimeType);
    }

    public final f<T> unwrap() {
        return isWrapper() ? of(p8.i.c((Class) this.runtimeType)) : this;
    }

    public final <X> f<T> where(com.google.common.reflect.d<X> dVar, f<X> fVar) {
        new com.google.common.reflect.e();
        throw null;
    }

    public final f<T> wrap() {
        return isPrimitive() ? of(p8.i.d((Class) this.runtimeType)) : this;
    }

    protected Object writeReplace() {
        return of(new com.google.common.reflect.e().j(this.runtimeType));
    }

    protected f() {
        Type typeCapture = capture();
        this.runtimeType = typeCapture;
        m.s(!(typeCapture instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", typeCapture);
    }

    public static f<?> of(Type type) {
        return new C0479f(type);
    }

    public final boolean isSubtypeOf(Type type) {
        m.l(type);
        if (type instanceof WildcardType) {
            return any(((WildcardType) type).getLowerBounds()).b(this.runtimeType);
        }
        Type type2 = this.runtimeType;
        if (type2 instanceof WildcardType) {
            return any(((WildcardType) type2).getUpperBounds()).a(type);
        }
        if (type2 instanceof TypeVariable) {
            return type2.equals(type) || any(((TypeVariable) this.runtimeType).getBounds()).a(type);
        }
        if (type2 instanceof GenericArrayType) {
            return of(type).isSupertypeOfArray((GenericArrayType) this.runtimeType);
        }
        if (type instanceof Class) {
            return someRawTypeIsSubclassOf((Class) type);
        }
        if (type instanceof ParameterizedType) {
            return isSubtypeOfParameterizedType((ParameterizedType) type);
        }
        if (type instanceof GenericArrayType) {
            return isSubtypeOfArrayType((GenericArrayType) type);
        }
        return false;
    }

    public final boolean isSupertypeOf(Type type) {
        return of(type).isSubtypeOf(getType());
    }

    public final <X> f<T> where(com.google.common.reflect.d<X> dVar, Class<X> cls) {
        return where(dVar, of((Class) cls));
    }

    protected f(Class<?> cls) {
        Type typeCapture = super.capture();
        if (typeCapture instanceof Class) {
            this.runtimeType = typeCapture;
        } else {
            this.runtimeType = com.google.common.reflect.e.d(cls).j(typeCapture);
        }
    }

    private f(Type type) {
        this.runtimeType = (Type) m.l(type);
    }
}
