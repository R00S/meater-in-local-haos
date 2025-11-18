package com.google.common.reflect;

import com.google.common.reflect.h;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import l8.C3915h;
import l8.C3918k;
import l8.m;
import m8.AbstractC4010z;
import m8.L;

/* compiled from: TypeResolver.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final c f37570a;

    /* compiled from: TypeResolver.java */
    class a extends g {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f37571b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Type f37572c;

        a(Map map, Type type) {
            this.f37571b = map;
            this.f37572c = type;
        }

        @Override // com.google.common.reflect.g
        void b(Class<?> cls) {
            if (this.f37572c instanceof WildcardType) {
                return;
            }
            throw new IllegalArgumentException("No type mapping from " + cls + " to " + this.f37572c);
        }

        @Override // com.google.common.reflect.g
        void c(GenericArrayType genericArrayType) {
            Type type = this.f37572c;
            if (type instanceof WildcardType) {
                return;
            }
            Type typeI = h.i(type);
            m.h(typeI != null, "%s is not an array type.", this.f37572c);
            e.g(this.f37571b, genericArrayType.getGenericComponentType(), typeI);
        }

        @Override // com.google.common.reflect.g
        void d(ParameterizedType parameterizedType) {
            Type type = this.f37572c;
            if (type instanceof WildcardType) {
                return;
            }
            ParameterizedType parameterizedType2 = (ParameterizedType) e.e(ParameterizedType.class, type);
            if (parameterizedType.getOwnerType() != null && parameterizedType2.getOwnerType() != null) {
                e.g(this.f37571b, parameterizedType.getOwnerType(), parameterizedType2.getOwnerType());
            }
            m.i(parameterizedType.getRawType().equals(parameterizedType2.getRawType()), "Inconsistent raw type: %s vs. %s", parameterizedType, this.f37572c);
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
            m.i(actualTypeArguments.length == actualTypeArguments2.length, "%s not compatible with %s", parameterizedType, parameterizedType2);
            for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
                e.g(this.f37571b, actualTypeArguments[i10], actualTypeArguments2[i10]);
            }
        }

        @Override // com.google.common.reflect.g
        void e(TypeVariable<?> typeVariable) {
            this.f37571b.put(new d(typeVariable), this.f37572c);
        }

        @Override // com.google.common.reflect.g
        void f(WildcardType wildcardType) {
            Type type = this.f37572c;
            if (type instanceof WildcardType) {
                WildcardType wildcardType2 = (WildcardType) type;
                Type[] upperBounds = wildcardType.getUpperBounds();
                Type[] upperBounds2 = wildcardType2.getUpperBounds();
                Type[] lowerBounds = wildcardType.getLowerBounds();
                Type[] lowerBounds2 = wildcardType2.getLowerBounds();
                m.i(upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length, "Incompatible type: %s vs. %s", wildcardType, this.f37572c);
                for (int i10 = 0; i10 < upperBounds.length; i10++) {
                    e.g(this.f37571b, upperBounds[i10], upperBounds2[i10]);
                }
                for (int i11 = 0; i11 < lowerBounds.length; i11++) {
                    e.g(this.f37571b, lowerBounds[i11], lowerBounds2[i11]);
                }
            }
        }
    }

    /* compiled from: TypeResolver.java */
    private static final class b extends g {

        /* renamed from: b, reason: collision with root package name */
        private final Map<d, Type> f37573b = L.f();

        private b() {
        }

        static AbstractC4010z<d, Type> g(Type type) {
            m.l(type);
            b bVar = new b();
            bVar.a(type);
            return AbstractC4010z.c(bVar.f37573b);
        }

        private void h(d dVar, Type type) {
            if (this.f37573b.containsKey(dVar)) {
                return;
            }
            Type type2 = type;
            while (type2 != null) {
                if (dVar.a(type2)) {
                    while (type != null) {
                        type = this.f37573b.remove(d.c(type));
                    }
                    return;
                }
                type2 = this.f37573b.get(d.c(type2));
            }
            this.f37573b.put(dVar, type);
        }

        @Override // com.google.common.reflect.g
        void b(Class<?> cls) {
            a(cls.getGenericSuperclass());
            a(cls.getGenericInterfaces());
        }

        @Override // com.google.common.reflect.g
        void d(ParameterizedType parameterizedType) {
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            m.q(typeParameters.length == actualTypeArguments.length);
            for (int i10 = 0; i10 < typeParameters.length; i10++) {
                h(new d(typeParameters[i10]), actualTypeArguments[i10]);
            }
            a(cls);
            a(parameterizedType.getOwnerType());
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

    /* compiled from: TypeResolver.java */
    static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final TypeVariable<?> f37578a;

        d(TypeVariable<?> typeVariable) {
            this.f37578a = (TypeVariable) m.l(typeVariable);
        }

        private boolean b(TypeVariable<?> typeVariable) {
            return this.f37578a.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && this.f37578a.getName().equals(typeVariable.getName());
        }

        static d c(Type type) {
            if (type instanceof TypeVariable) {
                return new d((TypeVariable) type);
            }
            return null;
        }

        boolean a(Type type) {
            if (type instanceof TypeVariable) {
                return b((TypeVariable) type);
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return b(((d) obj).f37578a);
            }
            return false;
        }

        public int hashCode() {
            return C3918k.b(this.f37578a.getGenericDeclaration(), this.f37578a.getName());
        }

        public String toString() {
            return this.f37578a.toString();
        }
    }

    /* compiled from: TypeResolver.java */
    /* renamed from: com.google.common.reflect.e$e, reason: collision with other inner class name */
    private static class C0478e {

        /* renamed from: b, reason: collision with root package name */
        static final C0478e f37579b = new C0478e();

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f37580a;

        /* compiled from: TypeResolver.java */
        /* renamed from: com.google.common.reflect.e$e$a */
        class a extends C0478e {

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ TypeVariable f37581c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C0478e f37582d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C0478e c0478e, AtomicInteger atomicInteger, TypeVariable typeVariable) {
                super(atomicInteger, null);
                this.f37581c = typeVariable;
                this.f37582d = c0478e;
            }

            @Override // com.google.common.reflect.e.C0478e
            TypeVariable<?> b(Type[] typeArr) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(typeArr));
                linkedHashSet.addAll(Arrays.asList(this.f37581c.getBounds()));
                if (linkedHashSet.size() > 1) {
                    linkedHashSet.remove(Object.class);
                }
                return super.b((Type[]) linkedHashSet.toArray(new Type[0]));
            }
        }

        /* synthetic */ C0478e(AtomicInteger atomicInteger, a aVar) {
            this(atomicInteger);
        }

        private Type c(Type type) {
            if (type == null) {
                return null;
            }
            return a(type);
        }

        private C0478e d(TypeVariable<?> typeVariable) {
            return new a(this, this.f37580a, typeVariable);
        }

        private C0478e e() {
            return new C0478e(this.f37580a);
        }

        final Type a(Type type) {
            m.l(type);
            if ((type instanceof Class) || (type instanceof TypeVariable)) {
                return type;
            }
            if (type instanceof GenericArrayType) {
                return h.j(e().a(((GenericArrayType) type).getGenericComponentType()));
            }
            if (!(type instanceof ParameterizedType)) {
                if (!(type instanceof WildcardType)) {
                    throw new AssertionError("must have been one of the known types");
                }
                WildcardType wildcardType = (WildcardType) type;
                return wildcardType.getLowerBounds().length == 0 ? b(wildcardType.getUpperBounds()) : type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable<?>[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
                actualTypeArguments[i10] = d(typeParameters[i10]).a(actualTypeArguments[i10]);
            }
            return h.m(e().c(parameterizedType.getOwnerType()), cls, actualTypeArguments);
        }

        TypeVariable<?> b(Type[] typeArr) {
            return h.k(C0478e.class, "capture#" + this.f37580a.incrementAndGet() + "-of ? extends " + C3915h.g('&').f(typeArr), typeArr);
        }

        private C0478e() {
            this(new AtomicInteger());
        }

        private C0478e(AtomicInteger atomicInteger) {
            this.f37580a = atomicInteger;
        }
    }

    /* synthetic */ e(c cVar, a aVar) {
        this(cVar);
    }

    static e d(Type type) {
        return new e().o(b.g(type));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T e(Class<T> cls, Object obj) {
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            throw new IllegalArgumentException(obj + " is not a " + cls.getSimpleName());
        }
    }

    static e f(Type type) {
        return new e().o(b.g(C0478e.f37579b.a(type)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(Map<d, Type> map, Type type, Type type2) {
        if (type.equals(type2)) {
            return;
        }
        new a(map, type2).a(type);
    }

    private Type h(GenericArrayType genericArrayType) {
        return h.j(j(genericArrayType.getGenericComponentType()));
    }

    private ParameterizedType i(ParameterizedType parameterizedType) {
        Type ownerType = parameterizedType.getOwnerType();
        return h.m(ownerType == null ? null : j(ownerType), (Class) j(parameterizedType.getRawType()), k(parameterizedType.getActualTypeArguments()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Type[] k(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i10 = 0; i10 < typeArr.length; i10++) {
            typeArr2[i10] = j(typeArr[i10]);
        }
        return typeArr2;
    }

    private WildcardType m(WildcardType wildcardType) {
        return new h.i(k(wildcardType.getLowerBounds()), k(wildcardType.getUpperBounds()));
    }

    public Type j(Type type) {
        m.l(type);
        return type instanceof TypeVariable ? this.f37570a.a((TypeVariable) type) : type instanceof ParameterizedType ? i((ParameterizedType) type) : type instanceof GenericArrayType ? h((GenericArrayType) type) : type instanceof WildcardType ? m((WildcardType) type) : type;
    }

    Type[] l(Type[] typeArr) {
        for (int i10 = 0; i10 < typeArr.length; i10++) {
            typeArr[i10] = j(typeArr[i10]);
        }
        return typeArr;
    }

    public e n(Type type, Type type2) {
        HashMap mapF = L.f();
        g(mapF, (Type) m.l(type), (Type) m.l(type2));
        return o(mapF);
    }

    e o(Map<d, ? extends Type> map) {
        return new e(this.f37570a.c(map));
    }

    /* compiled from: TypeResolver.java */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC4010z<d, Type> f37574a;

        /* compiled from: TypeResolver.java */
        class a extends c {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TypeVariable f37575b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f37576c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ c f37577d;

            a(c cVar, TypeVariable typeVariable, c cVar2) {
                this.f37575b = typeVariable;
                this.f37576c = cVar2;
                this.f37577d = cVar;
            }

            @Override // com.google.common.reflect.e.c
            public Type b(TypeVariable<?> typeVariable, c cVar) {
                return typeVariable.getGenericDeclaration().equals(this.f37575b.getGenericDeclaration()) ? typeVariable : this.f37576c.b(typeVariable, cVar);
            }
        }

        c() {
            this.f37574a = AbstractC4010z.l();
        }

        final Type a(TypeVariable<?> typeVariable) {
            return b(typeVariable, new a(this, typeVariable, this));
        }

        Type b(TypeVariable<?> typeVariable, c cVar) {
            Type type = this.f37574a.get(new d(typeVariable));
            a aVar = null;
            if (type != null) {
                return new e(cVar, aVar).j(type);
            }
            Type[] bounds = typeVariable.getBounds();
            if (bounds.length == 0) {
                return typeVariable;
            }
            Type[] typeArrK = new e(cVar, aVar).k(bounds);
            return (h.e.f37613a && Arrays.equals(bounds, typeArrK)) ? typeVariable : h.k(typeVariable.getGenericDeclaration(), typeVariable.getName(), typeArrK);
        }

        final c c(Map<d, ? extends Type> map) {
            AbstractC4010z.a aVarA = AbstractC4010z.a();
            aVarA.j(this.f37574a);
            for (Map.Entry<d, ? extends Type> entry : map.entrySet()) {
                d key = entry.getKey();
                Type value = entry.getValue();
                m.h(!key.a(value), "Type variable %s bound to itself", key);
                aVarA.g(key, value);
            }
            return new c(aVarA.d());
        }

        private c(AbstractC4010z<d, Type> abstractC4010z) {
            this.f37574a = abstractC4010z;
        }
    }

    public e() {
        this.f37570a = new c();
    }

    private e(c cVar) {
        this.f37570a = cVar;
    }
}
