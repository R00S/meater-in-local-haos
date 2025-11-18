package com.google.gson.p219u;

import com.google.gson.p215t.C8588a;
import com.google.gson.p215t.C8589b;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TypeToken.java */
/* renamed from: com.google.gson.u.a */
/* loaded from: classes2.dex */
public class C8619a<T> {
    final int hashCode;
    final Class<? super T> rawType;
    final Type type;

    protected C8619a() {
        Type superclassTypeParameter = getSuperclassTypeParameter(getClass());
        this.type = superclassTypeParameter;
        this.rawType = (Class<? super T>) C8589b.m27056k(superclassTypeParameter);
        this.hashCode = superclassTypeParameter.hashCode();
    }

    private static AssertionError buildUnexpectedTypeError(Type type, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder("Unexpected type. Expected one of: ");
        for (Class<?> cls : clsArr) {
            sb.append(cls.getName());
            sb.append(", ");
        }
        sb.append("but got: ");
        sb.append(type.getClass().getName());
        sb.append(", for type token: ");
        sb.append(type.toString());
        sb.append('.');
        return new AssertionError(sb.toString());
    }

    public static C8619a<?> get(Type type) {
        return new C8619a<>(type);
    }

    public static C8619a<?> getArray(Type type) {
        return new C8619a<>(C8589b.m27046a(type));
    }

    public static C8619a<?> getParameterized(Type type, Type... typeArr) {
        return new C8619a<>(C8589b.m27060o(null, type, typeArr));
    }

    static Type getSuperclassTypeParameter(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        return C8589b.m27047b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
    }

    private static boolean matches(Type type, Type type2, Map<String, Type> map) {
        return type2.equals(type) || ((type instanceof TypeVariable) && type2.equals(map.get(((TypeVariable) type).getName())));
    }

    private static boolean typeEquals(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map<String, Type> map) {
        if (!parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            return false;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
        for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
            if (!matches(actualTypeArguments[i2], actualTypeArguments2[i2], map)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C8619a) && C8589b.m27051f(this.type, ((C8619a) obj).type);
    }

    public final Class<? super T> getRawType() {
        return this.rawType;
    }

    public final Type getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.hashCode;
    }

    @Deprecated
    public boolean isAssignableFrom(Class<?> cls) {
        return isAssignableFrom((Type) cls);
    }

    public final String toString() {
        return C8589b.m27066u(this.type);
    }

    public static <T> C8619a<T> get(Class<T> cls) {
        return new C8619a<>(cls);
    }

    @Deprecated
    public boolean isAssignableFrom(Type type) {
        if (type == null) {
            return false;
        }
        if (this.type.equals(type)) {
            return true;
        }
        Type type2 = this.type;
        if (type2 instanceof Class) {
            return this.rawType.isAssignableFrom(C8589b.m27056k(type));
        }
        if (type2 instanceof ParameterizedType) {
            return isAssignableFrom(type, (ParameterizedType) type2, new HashMap());
        }
        if (type2 instanceof GenericArrayType) {
            return this.rawType.isAssignableFrom(C8589b.m27056k(type)) && isAssignableFrom(type, (GenericArrayType) this.type);
        }
        throw buildUnexpectedTypeError(type2, Class.class, ParameterizedType.class, GenericArrayType.class);
    }

    C8619a(Type type) {
        Type typeM27047b = C8589b.m27047b((Type) C8588a.m27045b(type));
        this.type = typeM27047b;
        this.rawType = (Class<? super T>) C8589b.m27056k(typeM27047b);
        this.hashCode = typeM27047b.hashCode();
    }

    @Deprecated
    public boolean isAssignableFrom(C8619a<?> c8619a) {
        return isAssignableFrom(c8619a.getType());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v9 */
    private static boolean isAssignableFrom(Type type, GenericArrayType genericArrayType) {
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (!(genericComponentType instanceof ParameterizedType)) {
            return true;
        }
        if (type instanceof GenericArrayType) {
            type = ((GenericArrayType) type).getGenericComponentType();
        } else if (type instanceof Class) {
            type = (Class) type;
            while (type.isArray()) {
                type = type.getComponentType();
            }
        }
        return isAssignableFrom(type, (ParameterizedType) genericComponentType, new HashMap());
    }

    private static boolean isAssignableFrom(Type type, ParameterizedType parameterizedType, Map<String, Type> map) {
        if (type == null) {
            return false;
        }
        if (parameterizedType.equals(type)) {
            return true;
        }
        Class<?> clsM27056k = C8589b.m27056k(type);
        ParameterizedType parameterizedType2 = type instanceof ParameterizedType ? (ParameterizedType) type : null;
        if (parameterizedType2 != null) {
            Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
            TypeVariable<Class<?>>[] typeParameters = clsM27056k.getTypeParameters();
            for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                Type type2 = actualTypeArguments[i2];
                TypeVariable<Class<?>> typeVariable = typeParameters[i2];
                while (type2 instanceof TypeVariable) {
                    type2 = map.get(((TypeVariable) type2).getName());
                }
                map.put(typeVariable.getName(), type2);
            }
            if (typeEquals(parameterizedType2, parameterizedType, map)) {
                return true;
            }
        }
        for (Type type3 : clsM27056k.getGenericInterfaces()) {
            if (isAssignableFrom(type3, parameterizedType, new HashMap(map))) {
                return true;
            }
        }
        return isAssignableFrom(clsM27056k.getGenericSuperclass(), parameterizedType, new HashMap(map));
    }
}
