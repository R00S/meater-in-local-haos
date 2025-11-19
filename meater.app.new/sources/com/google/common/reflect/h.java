package com.google.common.reflect;

import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessControlException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import l8.C3915h;
import l8.C3918k;
import l8.InterfaceC3914g;
import l8.m;
import l8.o;
import m8.AbstractC4009y;
import m8.AbstractC4010z;
import m8.C3982E;
import m8.j0;

/* compiled from: Types.java */
/* loaded from: classes2.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final C3915h f37600a = C3915h.h(", ").j("null");

    /* compiled from: Types.java */
    class a extends com.google.common.reflect.g {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicReference f37601b;

        a(AtomicReference atomicReference) {
            this.f37601b = atomicReference;
        }

        @Override // com.google.common.reflect.g
        void b(Class<?> cls) {
            this.f37601b.set(cls.getComponentType());
        }

        @Override // com.google.common.reflect.g
        void c(GenericArrayType genericArrayType) {
            this.f37601b.set(genericArrayType.getGenericComponentType());
        }

        @Override // com.google.common.reflect.g
        void e(TypeVariable<?> typeVariable) {
            this.f37601b.set(h.p(typeVariable.getBounds()));
        }

        @Override // com.google.common.reflect.g
        void f(WildcardType wildcardType) {
            this.f37601b.set(h.p(wildcardType.getUpperBounds()));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Types.java */
    private static abstract class b {

        /* renamed from: B, reason: collision with root package name */
        public static final b f37602B = new a("OWNED_BY_ENCLOSING_CLASS", 0);

        /* renamed from: C, reason: collision with root package name */
        public static final b f37603C = new c("LOCAL_CLASS_HAS_NO_OWNER", 1);

        /* renamed from: E, reason: collision with root package name */
        private static final /* synthetic */ b[] f37605E = c();

        /* renamed from: D, reason: collision with root package name */
        static final b f37604D = j();

        /* compiled from: Types.java */
        enum a extends b {
            a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.google.common.reflect.h.b
            Class<?> n(Class<?> cls) {
                return cls.getEnclosingClass();
            }
        }

        /* compiled from: Types.java */
        /* renamed from: com.google.common.reflect.h$b$b, reason: collision with other inner class name */
        class C0480b<T> {
            C0480b() {
            }
        }

        /* compiled from: Types.java */
        enum c extends b {
            c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.google.common.reflect.h.b
            Class<?> n(Class<?> cls) {
                if (cls.isLocalClass()) {
                    return null;
                }
                return cls.getEnclosingClass();
            }
        }

        /* compiled from: Types.java */
        class d extends C0480b<String> {
            d() {
            }
        }

        private b(String str, int i10) {
        }

        private static /* synthetic */ b[] c() {
            return new b[]{f37602B, f37603C};
        }

        private static b j() {
            new d();
            ParameterizedType parameterizedType = (ParameterizedType) d.class.getGenericSuperclass();
            Objects.requireNonNull(parameterizedType);
            ParameterizedType parameterizedType2 = parameterizedType;
            for (b bVar : values()) {
                if (bVar.n(C0480b.class) == parameterizedType2.getOwnerType()) {
                    return bVar;
                }
            }
            throw new AssertionError();
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f37605E.clone();
        }

        abstract Class<?> n(Class<?> cls);

        /* synthetic */ b(String str, int i10, a aVar) {
            this(str, i10);
        }
    }

    /* compiled from: Types.java */
    private static final class c implements GenericArrayType, Serializable {

        /* renamed from: B, reason: collision with root package name */
        private final Type f37606B;

        c(Type type) {
            this.f37606B = d.f37611F.s(type);
        }

        public boolean equals(Object obj) {
            if (obj instanceof GenericArrayType) {
                return C3918k.a(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
            }
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f37606B;
        }

        public int hashCode() {
            return this.f37606B.hashCode();
        }

        public String toString() {
            return h.s(this.f37606B) + "[]";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Types.java */
    static abstract class d {

        /* renamed from: B, reason: collision with root package name */
        public static final d f37607B;

        /* renamed from: C, reason: collision with root package name */
        public static final d f37608C;

        /* renamed from: D, reason: collision with root package name */
        public static final d f37609D;

        /* renamed from: E, reason: collision with root package name */
        public static final d f37610E;

        /* renamed from: F, reason: collision with root package name */
        static final d f37611F;

        /* renamed from: G, reason: collision with root package name */
        private static final /* synthetic */ d[] f37612G;

        /* compiled from: Types.java */
        enum a extends d {
            a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.google.common.reflect.h.d
            Type s(Type type) {
                m.l(type);
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                return cls.isArray() ? new c(cls.getComponentType()) : type;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.h.d
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public GenericArrayType n(Type type) {
                return new c(type);
            }
        }

        /* compiled from: Types.java */
        enum b extends d {
            b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.google.common.reflect.h.d
            Type n(Type type) {
                return type instanceof Class ? h.h((Class) type) : new c(type);
            }

            @Override // com.google.common.reflect.h.d
            Type s(Type type) {
                return (Type) m.l(type);
            }
        }

        /* compiled from: Types.java */
        enum c extends d {
            c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.google.common.reflect.h.d
            Type n(Type type) {
                return d.f37608C.n(type);
            }

            @Override // com.google.common.reflect.h.d
            String p(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", null).invoke(type, null);
                } catch (IllegalAccessException e10) {
                    e = e10;
                    throw new RuntimeException(e);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (InvocationTargetException e11) {
                    e = e11;
                    throw new RuntimeException(e);
                }
            }

            @Override // com.google.common.reflect.h.d
            Type s(Type type) {
                return d.f37608C.s(type);
            }
        }

        /* compiled from: Types.java */
        /* renamed from: com.google.common.reflect.h$d$d, reason: collision with other inner class name */
        enum C0481d extends d {
            C0481d(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.google.common.reflect.h.d
            boolean j() {
                return false;
            }

            @Override // com.google.common.reflect.h.d
            Type n(Type type) {
                return d.f37609D.n(type);
            }

            @Override // com.google.common.reflect.h.d
            String p(Type type) {
                return d.f37609D.p(type);
            }

            @Override // com.google.common.reflect.h.d
            Type s(Type type) {
                return d.f37609D.s(type);
            }
        }

        /* compiled from: Types.java */
        class e extends com.google.common.reflect.c<Map.Entry<String, int[][]>> {
            e() {
            }
        }

        /* compiled from: Types.java */
        class f extends com.google.common.reflect.c<int[]> {
            f() {
            }
        }

        static {
            a aVar = new a("JAVA6", 0);
            f37607B = aVar;
            b bVar = new b("JAVA7", 1);
            f37608C = bVar;
            c cVar = new c("JAVA8", 2);
            f37609D = cVar;
            C0481d c0481d = new C0481d("JAVA9", 3);
            f37610E = c0481d;
            f37612G = c();
            if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
                if (new e().capture().toString().contains("java.util.Map.java.util.Map")) {
                    f37611F = cVar;
                    return;
                } else {
                    f37611F = c0481d;
                    return;
                }
            }
            if (new f().capture() instanceof Class) {
                f37611F = bVar;
            } else {
                f37611F = aVar;
            }
        }

        private d(String str, int i10) {
        }

        private static /* synthetic */ d[] c() {
            return new d[]{f37607B, f37608C, f37609D, f37610E};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f37612G.clone();
        }

        boolean j() {
            return true;
        }

        abstract Type n(Type type);

        String p(Type type) {
            return h.s(type);
        }

        abstract Type s(Type type);

        final AbstractC4009y<Type> t(Type[] typeArr) {
            AbstractC4009y.a aVarY = AbstractC4009y.y();
            for (Type type : typeArr) {
                aVarY.a(s(type));
            }
            return aVarY.k();
        }

        /* synthetic */ d(String str, int i10, a aVar) {
            this(str, i10);
        }
    }

    /* compiled from: Types.java */
    static final class e<X> {

        /* renamed from: a, reason: collision with root package name */
        static final boolean f37613a = !e.class.getTypeParameters()[0].equals(h.k(e.class, "X", new Type[0]));

        e() {
        }
    }

    /* compiled from: Types.java */
    private static final class f implements ParameterizedType, Serializable {

        /* renamed from: B, reason: collision with root package name */
        private final Type f37614B;

        /* renamed from: C, reason: collision with root package name */
        private final AbstractC4009y<Type> f37615C;

        /* renamed from: D, reason: collision with root package name */
        private final Class<?> f37616D;

        f(Type type, Class<?> cls, Type[] typeArr) {
            m.l(cls);
            m.d(typeArr.length == cls.getTypeParameters().length);
            h.f(typeArr, "type parameter");
            this.f37614B = type;
            this.f37616D = cls;
            this.f37615C = d.f37611F.t(typeArr);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            return getRawType().equals(parameterizedType.getRawType()) && C3918k.a(getOwnerType(), parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return h.r(this.f37615C);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f37614B;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f37616D;
        }

        public int hashCode() {
            Type type = this.f37614B;
            return ((type == null ? 0 : type.hashCode()) ^ this.f37615C.hashCode()) ^ this.f37616D.hashCode();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            if (this.f37614B != null) {
                d dVar = d.f37611F;
                if (dVar.j()) {
                    sb2.append(dVar.p(this.f37614B));
                    sb2.append('.');
                }
            }
            sb2.append(this.f37616D.getName());
            sb2.append('<');
            C3915h c3915h = h.f37600a;
            AbstractC4009y<Type> abstractC4009y = this.f37615C;
            final d dVar2 = d.f37611F;
            Objects.requireNonNull(dVar2);
            sb2.append(c3915h.d(C3982E.m(abstractC4009y, new InterfaceC3914g() { // from class: com.google.common.reflect.i
                @Override // l8.InterfaceC3914g
                public final Object apply(Object obj) {
                    return dVar2.p((Type) obj);
                }
            })));
            sb2.append('>');
            return sb2.toString();
        }
    }

    /* compiled from: Types.java */
    private static final class g<D extends GenericDeclaration> {

        /* renamed from: a, reason: collision with root package name */
        private final D f37617a;

        /* renamed from: b, reason: collision with root package name */
        private final String f37618b;

        /* renamed from: c, reason: collision with root package name */
        private final AbstractC4009y<Type> f37619c;

        g(D d10, String str, Type[] typeArr) {
            h.f(typeArr, "bound for type variable");
            this.f37617a = (D) m.l(d10);
            this.f37618b = (String) m.l(str);
            this.f37619c = AbstractC4009y.D(typeArr);
        }

        public D a() {
            return this.f37617a;
        }

        public String b() {
            return this.f37618b;
        }

        public boolean equals(Object obj) {
            if (!e.f37613a) {
                if (!(obj instanceof TypeVariable)) {
                    return false;
                }
                TypeVariable typeVariable = (TypeVariable) obj;
                return this.f37618b.equals(typeVariable.getName()) && this.f37617a.equals(typeVariable.getGenericDeclaration());
            }
            if (obj == null || !Proxy.isProxyClass(obj.getClass()) || !(Proxy.getInvocationHandler(obj) instanceof C0482h)) {
                return false;
            }
            g gVar = ((C0482h) Proxy.getInvocationHandler(obj)).f37621a;
            return this.f37618b.equals(gVar.b()) && this.f37617a.equals(gVar.a()) && this.f37619c.equals(gVar.f37619c);
        }

        public int hashCode() {
            return this.f37617a.hashCode() ^ this.f37618b.hashCode();
        }

        public String toString() {
            return this.f37618b;
        }
    }

    /* compiled from: Types.java */
    /* renamed from: com.google.common.reflect.h$h, reason: collision with other inner class name */
    private static final class C0482h implements InvocationHandler {

        /* renamed from: b, reason: collision with root package name */
        private static final AbstractC4010z<String, Method> f37620b;

        /* renamed from: a, reason: collision with root package name */
        private final g<?> f37621a;

        static {
            AbstractC4010z.a aVarA = AbstractC4010z.a();
            for (Method method : g.class.getMethods()) {
                if (method.getDeclaringClass().equals(g.class)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    aVarA.g(method.getName(), method);
                }
            }
            f37620b = aVarA.c();
        }

        C0482h(g<?> gVar) {
            this.f37621a = gVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Method method2 = f37620b.get(name);
            if (method2 == null) {
                throw new UnsupportedOperationException(name);
            }
            try {
                return method2.invoke(this.f37621a, objArr);
            } catch (InvocationTargetException e10) {
                throw e10.getCause();
            }
        }
    }

    /* compiled from: Types.java */
    static final class i implements WildcardType, Serializable {

        /* renamed from: B, reason: collision with root package name */
        private final AbstractC4009y<Type> f37622B;

        /* renamed from: C, reason: collision with root package name */
        private final AbstractC4009y<Type> f37623C;

        i(Type[] typeArr, Type[] typeArr2) {
            h.f(typeArr, "lower bound for wildcard");
            h.f(typeArr2, "upper bound for wildcard");
            d dVar = d.f37611F;
            this.f37622B = dVar.t(typeArr);
            this.f37623C = dVar.t(typeArr2);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) obj;
            return this.f37622B.equals(Arrays.asList(wildcardType.getLowerBounds())) && this.f37623C.equals(Arrays.asList(wildcardType.getUpperBounds()));
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            return h.r(this.f37622B);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return h.r(this.f37623C);
        }

        public int hashCode() {
            return this.f37622B.hashCode() ^ this.f37623C.hashCode();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("?");
            j0<Type> it = this.f37622B.iterator();
            while (it.hasNext()) {
                Type next = it.next();
                sb2.append(" super ");
                sb2.append(d.f37611F.p(next));
            }
            for (Type type : h.g(this.f37623C)) {
                sb2.append(" extends ");
                sb2.append(d.f37611F.p(type));
            }
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(Type[] typeArr, String str) {
        for (Type type : typeArr) {
            if (type instanceof Class) {
                m.i(!r2.isPrimitive(), "Primitive type '%s' used as %s", (Class) type, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Iterable<Type> g(Iterable<Type> iterable) {
        return C3982E.c(iterable, o.f(o.d(Object.class)));
    }

    static Class<?> h(Class<?> cls) {
        return Array.newInstance(cls, 0).getClass();
    }

    static Type i(Type type) {
        m.l(type);
        AtomicReference atomicReference = new AtomicReference();
        new a(atomicReference).a(type);
        return (Type) atomicReference.get();
    }

    static Type j(Type type) {
        if (!(type instanceof WildcardType)) {
            return d.f37611F.n(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        m.e(lowerBounds.length <= 1, "Wildcard cannot have more than one lower bounds.");
        if (lowerBounds.length == 1) {
            return q(j(lowerBounds[0]));
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        m.e(upperBounds.length == 1, "Wildcard should have only one upper bound.");
        return o(j(upperBounds[0]));
    }

    static <D extends GenericDeclaration> TypeVariable<D> k(D d10, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        return n(d10, str, typeArr);
    }

    static ParameterizedType l(Class<?> cls, Type... typeArr) {
        return new f(b.f37604D.n(cls), cls, typeArr);
    }

    static ParameterizedType m(Type type, Class<?> cls, Type... typeArr) {
        if (type == null) {
            return l(cls, typeArr);
        }
        m.l(typeArr);
        m.h(cls.getEnclosingClass() != null, "Owner type for unenclosed %s", cls);
        return new f(type, cls, typeArr);
    }

    private static <D extends GenericDeclaration> TypeVariable<D> n(D d10, String str, Type[] typeArr) {
        return (TypeVariable) com.google.common.reflect.b.a(TypeVariable.class, new C0482h(new g(d10, str, typeArr)));
    }

    static WildcardType o(Type type) {
        return new i(new Type[0], new Type[]{type});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Type p(Type[] typeArr) {
        for (Type type : typeArr) {
            Type typeI = i(type);
            if (typeI != null) {
                if (typeI instanceof Class) {
                    Class cls = (Class) typeI;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return o(typeI);
            }
        }
        return null;
    }

    static WildcardType q(Type type) {
        return new i(new Type[]{type}, new Type[]{Object.class});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Type[] r(Collection<Type> collection) {
        return (Type[]) collection.toArray(new Type[0]);
    }

    static String s(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
