package com.squareup.moshi;

import com.squareup.moshi.p231w.C8735c;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;

/* compiled from: Types.java */
/* renamed from: com.squareup.moshi.u */
/* loaded from: classes2.dex */
public final class C8731u {
    /* renamed from: a */
    static Type m27842a(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        if (type instanceof Class) {
            return ((Class) type).getComponentType();
        }
        return null;
    }

    /* renamed from: b */
    public static GenericArrayType m27843b(Type type) {
        return new C8735c.a(type);
    }

    /* renamed from: c */
    public static Type m27844c(Type type, Class<?> cls) {
        Type typeM27849h = m27849h(type, cls, Collection.class);
        if (typeM27849h instanceof WildcardType) {
            typeM27849h = ((WildcardType) typeM27849h).getUpperBounds()[0];
        }
        return typeM27849h instanceof ParameterizedType ? ((ParameterizedType) typeM27849h).getActualTypeArguments()[0] : Object.class;
    }

    /* renamed from: d */
    public static boolean m27845d(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type2 instanceof GenericArrayType ? m27845d(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType()) : type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return m27845d(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType instanceof C8735c.b ? ((C8735c.b) parameterizedType).f33233h : parameterizedType.getActualTypeArguments(), parameterizedType2 instanceof C8735c.b ? ((C8735c.b) parameterizedType2).f33233h : parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return m27845d(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (type2 instanceof GenericArrayType) {
                return m27845d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    /* renamed from: e */
    public static String m27846e(String str) {
        return str.replace("$", "_") + "JsonAdapter";
    }

    /* renamed from: f */
    static Type m27847f(Type type) {
        Class<?> clsM27848g = m27848g(type);
        return C8735c.m27870p(type, clsM27848g, clsM27848g.getGenericSuperclass());
    }

    /* renamed from: g */
    public static Class<?> m27848g(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m27848g(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m27848g(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* renamed from: h */
    static Type m27849h(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C8735c.m27870p(type, cls, C8735c.m27859e(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: i */
    static Type[] m27850i(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type typeM27849h = m27849h(type, cls, Map.class);
        return typeM27849h instanceof ParameterizedType ? ((ParameterizedType) typeM27849h).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    /* renamed from: j */
    public static ParameterizedType m27851j(Type type, Type... typeArr) {
        if (typeArr.length != 0) {
            return new C8735c.b(null, type, typeArr);
        }
        throw new IllegalArgumentException("Missing type arguments for " + type);
    }

    /* renamed from: k */
    public static WildcardType m27852k(Type type) {
        return new C8735c.c(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, C8735c.f33226b);
    }

    /* renamed from: l */
    public static WildcardType m27853l(Type type) {
        return new C8735c.c(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }
}
