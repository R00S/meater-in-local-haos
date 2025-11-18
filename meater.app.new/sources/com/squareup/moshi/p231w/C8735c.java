package com.squareup.moshi.p231w;

import com.squareup.moshi.AbstractC8716f;
import com.squareup.moshi.AbstractC8719i;
import com.squareup.moshi.C8728r;
import com.squareup.moshi.C8731u;
import com.squareup.moshi.InterfaceC8715e;
import com.squareup.moshi.InterfaceC8717g;
import com.squareup.moshi.InterfaceC8718h;
import com.squareup.moshi.JsonDataException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import okhttp3.HttpUrl;

/* compiled from: Util.java */
/* renamed from: com.squareup.moshi.w.c */
/* loaded from: classes2.dex */
public final class C8735c {

    /* renamed from: a */
    public static final Set<Annotation> f33225a = Collections.emptySet();

    /* renamed from: b */
    public static final Type[] f33226b = new Type[0];

    /* renamed from: c */
    public static final Class<?> f33227c;

    /* renamed from: d */
    private static final Class<? extends Annotation> f33228d;

    /* renamed from: e */
    private static final Map<Class<?>, Class<?>> f33229e;

    /* compiled from: Util.java */
    /* renamed from: com.squareup.moshi.w.c$a */
    public static final class a implements GenericArrayType {

        /* renamed from: f */
        private final Type f33230f;

        public a(Type type) {
            this.f33230f = C8735c.m27855a(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C8731u.m27845d(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f33230f;
        }

        public int hashCode() {
            return this.f33230f.hashCode();
        }

        public String toString() {
            return C8735c.m27875u(this.f33230f) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* compiled from: Util.java */
    /* renamed from: com.squareup.moshi.w.c$b */
    public static final class b implements ParameterizedType {

        /* renamed from: f */
        private final Type f33231f;

        /* renamed from: g */
        private final Type f33232g;

        /* renamed from: h */
        public final Type[] f33233h;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || C8731u.m27848g(type) != enclosingClass) {
                        throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                    }
                } else if (enclosingClass != null) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
                }
            }
            this.f33231f = type == null ? null : C8735c.m27855a(type);
            this.f33232g = C8735c.m27855a(type2);
            this.f33233h = (Type[]) typeArr.clone();
            int i2 = 0;
            while (true) {
                Type[] typeArr2 = this.f33233h;
                if (i2 >= typeArr2.length) {
                    return;
                }
                typeArr2[i2].getClass();
                C8735c.m27856b(typeArr2[i2]);
                Type[] typeArr3 = this.f33233h;
                typeArr3[i2] = C8735c.m27855a(typeArr3[i2]);
                i2++;
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C8731u.m27845d(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f33233h.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f33231f;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f33232g;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f33233h) ^ this.f33232g.hashCode()) ^ C8735c.m27860f(this.f33231f);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((this.f33233h.length + 1) * 30);
            sb.append(C8735c.m27875u(this.f33232g));
            if (this.f33233h.length == 0) {
                return sb.toString();
            }
            sb.append("<");
            sb.append(C8735c.m27875u(this.f33233h[0]));
            for (int i2 = 1; i2 < this.f33233h.length; i2++) {
                sb.append(", ");
                sb.append(C8735c.m27875u(this.f33233h[i2]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* compiled from: Util.java */
    /* renamed from: com.squareup.moshi.w.c$c */
    public static final class c implements WildcardType {

        /* renamed from: f */
        private final Type f33234f;

        /* renamed from: g */
        private final Type f33235g;

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                C8735c.m27856b(typeArr[0]);
                this.f33235g = null;
                this.f33234f = C8735c.m27855a(typeArr[0]);
                return;
            }
            typeArr2[0].getClass();
            C8735c.m27856b(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f33235g = C8735c.m27855a(typeArr2[0]);
            this.f33234f = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C8731u.m27845d(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f33235g;
            return type != null ? new Type[]{type} : C8735c.f33226b;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f33234f};
        }

        public int hashCode() {
            Type type = this.f33235g;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f33234f.hashCode() + 31);
        }

        public String toString() {
            if (this.f33235g != null) {
                return "? super " + C8735c.m27875u(this.f33235g);
            }
            if (this.f33234f == Object.class) {
                return "?";
            }
            return "? extends " + C8735c.m27875u(this.f33234f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Class cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f33228d = cls;
        try {
            cls2 = Class.forName("kotlin.a0.d.g");
        } catch (ClassNotFoundException unused2) {
        }
        f33227c = cls2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        f33229e = Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: a */
    public static Type m27855a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(m27855a(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            if (type instanceof b) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return type instanceof a ? type : new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType) || (type instanceof c)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    /* renamed from: b */
    static void m27856b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    /* renamed from: c */
    static Class<?> m27857c(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: d */
    public static AbstractC8716f<?> m27858d(C8728r c8728r, Type type, Class<?> cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Constructor<?> declaredConstructor;
        Object[] objArr;
        InterfaceC8717g interfaceC8717g = (InterfaceC8717g) cls.getAnnotation(InterfaceC8717g.class);
        Class<?> cls2 = null;
        if (interfaceC8717g == null || !interfaceC8717g.generateAdapter()) {
            return null;
        }
        try {
            try {
                cls2 = Class.forName(C8731u.m27846e(cls.getName()), true, cls.getClassLoader());
                if (type instanceof ParameterizedType) {
                    Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                    try {
                        declaredConstructor = cls2.getDeclaredConstructor(C8728r.class, Type[].class);
                        objArr = new Object[]{c8728r, actualTypeArguments};
                    } catch (NoSuchMethodException unused) {
                        declaredConstructor = cls2.getDeclaredConstructor(Type[].class);
                        objArr = new Object[]{actualTypeArguments};
                    }
                } else {
                    try {
                        declaredConstructor = cls2.getDeclaredConstructor(C8728r.class);
                        objArr = new Object[]{c8728r};
                    } catch (NoSuchMethodException unused2) {
                        declaredConstructor = cls2.getDeclaredConstructor(new Class[0]);
                        objArr = new Object[0];
                    }
                }
                declaredConstructor.setAccessible(true);
                return ((AbstractC8716f) declaredConstructor.newInstance(objArr)).nullSafe();
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("Failed to find the generated JsonAdapter class for " + type, e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Failed to access the generated JsonAdapter for " + type, e3);
            } catch (InstantiationException e4) {
                throw new RuntimeException("Failed to instantiate the generated JsonAdapter for " + type, e4);
            } catch (InvocationTargetException e5) {
                throw m27873s(e5);
            }
        } catch (NoSuchMethodException e6) {
            if ((type instanceof ParameterizedType) || cls2.getTypeParameters().length == 0) {
                throw new RuntimeException("Failed to find the generated JsonAdapter constructor for " + type, e6);
            }
            throw new RuntimeException("Failed to find the generated JsonAdapter constructor for '" + type + "'. Suspiciously, the type was not parameterized but the target class '" + cls2.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", e6);
        }
    }

    /* renamed from: e */
    public static Type m27859e(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (interfaces[i2] == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(interfaces[i2])) {
                    return m27859e(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m27859e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: f */
    static int m27860f(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: g */
    static int m27861g(Object[] objArr, Object obj) {
        for (int i2 = 0; i2 < objArr.length; i2++) {
            if (obj.equals(objArr[i2])) {
                return i2;
            }
        }
        throw new NoSuchElementException();
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    /* renamed from: h */
    public static boolean m27862h(Class<?> cls) {
        Class<? extends Annotation> cls2 = f33228d;
        return cls2 != null && cls.isAnnotationPresent(cls2);
    }

    /* renamed from: i */
    public static boolean m27863i(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    /* renamed from: j */
    public static Set<? extends Annotation> m27864j(AnnotatedElement annotatedElement) {
        return m27865k(annotatedElement.getAnnotations());
    }

    /* renamed from: k */
    public static Set<? extends Annotation> m27865k(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(InterfaceC8718h.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : f33225a;
    }

    /* renamed from: l */
    public static String m27866l(String str, InterfaceC8715e interfaceC8715e) {
        if (interfaceC8715e == null) {
            return str;
        }
        String strName = interfaceC8715e.name();
        return "\u0000".equals(strName) ? str : strName;
    }

    /* renamed from: m */
    public static String m27867m(String str, AnnotatedElement annotatedElement) {
        return m27866l(str, (InterfaceC8715e) annotatedElement.getAnnotation(InterfaceC8715e.class));
    }

    /* renamed from: n */
    public static JsonDataException m27868n(String str, String str2, AbstractC8719i abstractC8719i) {
        String strM27716g = abstractC8719i.m27716g();
        return new JsonDataException(str2.equals(str) ? String.format("Required value '%s' missing at %s", str, strM27716g) : String.format("Required value '%s' (JSON name '%s') missing at %s", str, str2, strM27716g));
    }

    /* renamed from: o */
    public static Type m27869o(Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        if (wildcardType.getLowerBounds().length != 0) {
            return type;
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length == 1) {
            return upperBounds[0];
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: p */
    public static Type m27870p(Type type, Class<?> cls, Type type2) {
        return m27871q(type, cls, type2, new LinkedHashSet());
    }

    /* renamed from: q */
    private static Type m27871q(Type type, Class<?> cls, Type type2, Collection<TypeVariable<?>> collection) {
        while (type2 instanceof TypeVariable) {
            TypeVariable<?> typeVariable = (TypeVariable) type2;
            if (collection.contains(typeVariable)) {
                return type2;
            }
            collection.add(typeVariable);
            type2 = m27872r(type, cls, typeVariable);
            if (type2 == typeVariable) {
                return type2;
            }
        }
        if (type2 instanceof Class) {
            Class cls2 = (Class) type2;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeM27871q = m27871q(type, cls, componentType, collection);
                return componentType == typeM27871q ? cls2 : C8731u.m27843b(typeM27871q);
            }
        }
        if (type2 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type2;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeM27871q2 = m27871q(type, cls, genericComponentType, collection);
            return genericComponentType == typeM27871q2 ? genericArrayType : C8731u.m27843b(typeM27871q2);
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeM27871q3 = m27871q(type, cls, ownerType, collection);
            boolean z = typeM27871q3 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i2 = 0; i2 < length; i2++) {
                Type typeM27871q4 = m27871q(type, cls, actualTypeArguments[i2], collection);
                if (typeM27871q4 != actualTypeArguments[i2]) {
                    if (!z) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z = true;
                    }
                    actualTypeArguments[i2] = typeM27871q4;
                }
            }
            return z ? new b(typeM27871q3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z2 = type2 instanceof WildcardType;
        Type type3 = type2;
        if (z2) {
            WildcardType wildcardType = (WildcardType) type2;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeM27871q5 = m27871q(type, cls, lowerBounds[0], collection);
                type3 = wildcardType;
                if (typeM27871q5 != lowerBounds[0]) {
                    return C8731u.m27853l(typeM27871q5);
                }
            } else {
                type3 = wildcardType;
                if (upperBounds.length == 1) {
                    Type typeM27871q6 = m27871q(type, cls, upperBounds[0], collection);
                    type3 = wildcardType;
                    if (typeM27871q6 != upperBounds[0]) {
                        return C8731u.m27852k(typeM27871q6);
                    }
                }
            }
        }
        return type3;
    }

    /* renamed from: r */
    static Type m27872r(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> clsM27857c = m27857c(typeVariable);
        if (clsM27857c == null) {
            return typeVariable;
        }
        Type typeM27859e = m27859e(type, cls, clsM27857c);
        if (!(typeM27859e instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) typeM27859e).getActualTypeArguments()[m27861g(clsM27857c.getTypeParameters(), typeVariable)];
    }

    /* renamed from: s */
    public static RuntimeException m27873s(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        }
        if (targetException instanceof Error) {
            throw ((Error) targetException);
        }
        throw new RuntimeException(targetException);
    }

    /* renamed from: t */
    public static String m27874t(Type type, Set<? extends Annotation> set) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: u */
    static String m27875u(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* renamed from: v */
    public static JsonDataException m27876v(String str, String str2, AbstractC8719i abstractC8719i) {
        String strM27716g = abstractC8719i.m27716g();
        return new JsonDataException(str2.equals(str) ? String.format("Non-null value '%s' was null at %s", str, strM27716g) : String.format("Non-null value '%s' (JSON name '%s') was null at %s", str, str2, strM27716g));
    }
}
