package com.google.gson.p215t;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import okhttp3.HttpUrl;

/* compiled from: $Gson$Types.java */
/* renamed from: com.google.gson.t.b */
/* loaded from: classes2.dex */
public final class C8589b {

    /* renamed from: a */
    static final Type[] f32495a = new Type[0];

    /* compiled from: $Gson$Types.java */
    /* renamed from: com.google.gson.t.b$a */
    private static final class a implements GenericArrayType, Serializable {

        /* renamed from: f */
        private final Type f32496f;

        public a(Type type) {
            this.f32496f = C8589b.m27047b(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C8589b.m27051f(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f32496f;
        }

        public int hashCode() {
            return this.f32496f.hashCode();
        }

        public String toString() {
            return C8589b.m27066u(this.f32496f) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* compiled from: $Gson$Types.java */
    /* renamed from: com.google.gson.t.b$b */
    private static final class b implements ParameterizedType, Serializable {

        /* renamed from: f */
        private final Type f32497f;

        /* renamed from: g */
        private final Type f32498g;

        /* renamed from: h */
        private final Type[] f32499h;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                C8588a.m27044a(z);
            }
            this.f32497f = type == null ? null : C8589b.m27047b(type);
            this.f32498g = C8589b.m27047b(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f32499h = typeArr2;
            int length = typeArr2.length;
            for (int i2 = 0; i2 < length; i2++) {
                C8588a.m27045b(this.f32499h[i2]);
                C8589b.m27048c(this.f32499h[i2]);
                Type[] typeArr3 = this.f32499h;
                typeArr3[i2] = C8589b.m27047b(typeArr3[i2]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C8589b.m27051f(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f32499h.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f32497f;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f32498g;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f32499h) ^ this.f32498g.hashCode()) ^ C8589b.m27058m(this.f32497f);
        }

        public String toString() {
            int length = this.f32499h.length;
            if (length == 0) {
                return C8589b.m27066u(this.f32498g);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(C8589b.m27066u(this.f32498g));
            sb.append("<");
            sb.append(C8589b.m27066u(this.f32499h[0]));
            for (int i2 = 1; i2 < length; i2++) {
                sb.append(", ");
                sb.append(C8589b.m27066u(this.f32499h[i2]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* compiled from: $Gson$Types.java */
    /* renamed from: com.google.gson.t.b$c */
    private static final class c implements WildcardType, Serializable {

        /* renamed from: f */
        private final Type f32500f;

        /* renamed from: g */
        private final Type f32501g;

        public c(Type[] typeArr, Type[] typeArr2) {
            C8588a.m27044a(typeArr2.length <= 1);
            C8588a.m27044a(typeArr.length == 1);
            if (typeArr2.length != 1) {
                C8588a.m27045b(typeArr[0]);
                C8589b.m27048c(typeArr[0]);
                this.f32501g = null;
                this.f32500f = C8589b.m27047b(typeArr[0]);
                return;
            }
            C8588a.m27045b(typeArr2[0]);
            C8589b.m27048c(typeArr2[0]);
            C8588a.m27044a(typeArr[0] == Object.class);
            this.f32501g = C8589b.m27047b(typeArr2[0]);
            this.f32500f = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C8589b.m27051f(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f32501g;
            return type != null ? new Type[]{type} : C8589b.f32495a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f32500f};
        }

        public int hashCode() {
            Type type = this.f32501g;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f32500f.hashCode() + 31);
        }

        public String toString() {
            if (this.f32501g != null) {
                return "? super " + C8589b.m27066u(this.f32501g);
            }
            if (this.f32500f == Object.class) {
                return "?";
            }
            return "? extends " + C8589b.m27066u(this.f32500f);
        }
    }

    /* renamed from: a */
    public static GenericArrayType m27046a(Type type) {
        return new a(type);
    }

    /* renamed from: b */
    public static Type m27047b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(m27047b(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    /* renamed from: c */
    static void m27048c(Type type) {
        C8588a.m27044a(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    /* renamed from: d */
    private static Class<?> m27049d(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: e */
    static boolean m27050e(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: f */
    public static boolean m27051f(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return m27050e(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m27051f(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* renamed from: g */
    public static Type m27052g(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    /* renamed from: h */
    public static Type m27053h(Type type, Class<?> cls) {
        Type typeM27057l = m27057l(type, cls, Collection.class);
        if (typeM27057l instanceof WildcardType) {
            typeM27057l = ((WildcardType) typeM27057l).getUpperBounds()[0];
        }
        return typeM27057l instanceof ParameterizedType ? ((ParameterizedType) typeM27057l).getActualTypeArguments()[0] : Object.class;
    }

    /* renamed from: i */
    static Type m27054i(Type type, Class<?> cls, Class<?> cls2) {
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
                    return m27054i(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
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
                    return m27054i(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: j */
    public static Type[] m27055j(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type typeM27057l = m27057l(type, cls, Map.class);
        return typeM27057l instanceof ParameterizedType ? ((ParameterizedType) typeM27057l).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    /* renamed from: k */
    public static Class<?> m27056k(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C8588a.m27044a(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m27056k(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m27056k(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* renamed from: l */
    static Type m27057l(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C8588a.m27044a(cls2.isAssignableFrom(cls));
        return m27061p(type, cls, m27054i(type, cls, cls2));
    }

    /* renamed from: m */
    static int m27058m(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: n */
    private static int m27059n(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (obj.equals(objArr[i2])) {
                return i2;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: o */
    public static ParameterizedType m27060o(Type type, Type type2, Type... typeArr) {
        return new b(type, type2, typeArr);
    }

    /* renamed from: p */
    public static Type m27061p(Type type, Class<?> cls, Type type2) {
        return m27062q(type, cls, type2, new HashSet());
    }

    /* renamed from: q */
    private static Type m27062q(Type type, Class<?> cls, Type type2, Collection<TypeVariable> collection) {
        while (type2 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type2;
            if (collection.contains(typeVariable)) {
                return type2;
            }
            collection.add(typeVariable);
            type2 = m27063r(type, cls, typeVariable);
            if (type2 == typeVariable) {
                return type2;
            }
        }
        if (type2 instanceof Class) {
            Class cls2 = (Class) type2;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeM27062q = m27062q(type, cls, componentType, collection);
                return componentType == typeM27062q ? cls2 : m27046a(typeM27062q);
            }
        }
        if (type2 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type2;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeM27062q2 = m27062q(type, cls, genericComponentType, collection);
            return genericComponentType == typeM27062q2 ? genericArrayType : m27046a(typeM27062q2);
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeM27062q3 = m27062q(type, cls, ownerType, collection);
            boolean z = typeM27062q3 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i2 = 0; i2 < length; i2++) {
                Type typeM27062q4 = m27062q(type, cls, actualTypeArguments[i2], collection);
                if (typeM27062q4 != actualTypeArguments[i2]) {
                    if (!z) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z = true;
                    }
                    actualTypeArguments[i2] = typeM27062q4;
                }
            }
            return z ? m27060o(typeM27062q3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z2 = type2 instanceof WildcardType;
        Type type3 = type2;
        if (z2) {
            WildcardType wildcardType = (WildcardType) type2;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeM27062q5 = m27062q(type, cls, lowerBounds[0], collection);
                type3 = wildcardType;
                if (typeM27062q5 != lowerBounds[0]) {
                    return m27065t(typeM27062q5);
                }
            } else {
                type3 = wildcardType;
                if (upperBounds.length == 1) {
                    Type typeM27062q6 = m27062q(type, cls, upperBounds[0], collection);
                    type3 = wildcardType;
                    if (typeM27062q6 != upperBounds[0]) {
                        return m27064s(typeM27062q6);
                    }
                }
            }
        }
        return type3;
    }

    /* renamed from: r */
    static Type m27063r(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> clsM27049d = m27049d(typeVariable);
        if (clsM27049d == null) {
            return typeVariable;
        }
        Type typeM27054i = m27054i(type, cls, clsM27049d);
        if (!(typeM27054i instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) typeM27054i).getActualTypeArguments()[m27059n(clsM27049d.getTypeParameters(), typeVariable)];
    }

    /* renamed from: s */
    public static WildcardType m27064s(Type type) {
        return new c(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, f32495a);
    }

    /* renamed from: t */
    public static WildcardType m27065t(Type type) {
        return new c(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }

    /* renamed from: u */
    public static String m27066u(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
