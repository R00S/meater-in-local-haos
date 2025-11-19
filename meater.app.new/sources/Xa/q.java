package Xa;

import Ra.w0;
import Ra.x0;
import hb.EnumC3507D;
import hb.InterfaceC3508a;
import hb.InterfaceC3514g;
import hb.InterfaceC3517j;
import hb.InterfaceC3530w;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3859p;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;

/* compiled from: ReflectJavaClass.kt */
/* loaded from: classes3.dex */
public final class q extends u implements j, A, InterfaceC3514g {

    /* renamed from: a, reason: collision with root package name */
    private final Class<?> f18974a;

    /* compiled from: ReflectJavaClass.kt */
    /* synthetic */ class a extends C3859p implements Ba.l<Member, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f18975B = new a();

        a() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Member p02) {
            C3862t.g(p02, "p0");
            return Boolean.valueOf(p02.isSynthetic());
        }

        @Override // kotlin.jvm.internal.AbstractC3849f, Ia.c
        public final String getName() {
            return "isSynthetic";
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final Ia.g getOwner() {
            return P.b(Member.class);
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final String getSignature() {
            return "isSynthetic()Z";
        }
    }

    /* compiled from: ReflectJavaClass.kt */
    /* synthetic */ class b extends C3859p implements Ba.l<Constructor<?>, t> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f18976B = new b();

        b() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final t invoke(Constructor<?> p02) {
            C3862t.g(p02, "p0");
            return new t(p02);
        }

        @Override // kotlin.jvm.internal.AbstractC3849f, Ia.c
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final Ia.g getOwner() {
            return P.b(t.class);
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Constructor;)V";
        }
    }

    /* compiled from: ReflectJavaClass.kt */
    /* synthetic */ class c extends C3859p implements Ba.l<Member, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        public static final c f18977B = new c();

        c() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Member p02) {
            C3862t.g(p02, "p0");
            return Boolean.valueOf(p02.isSynthetic());
        }

        @Override // kotlin.jvm.internal.AbstractC3849f, Ia.c
        public final String getName() {
            return "isSynthetic";
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final Ia.g getOwner() {
            return P.b(Member.class);
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final String getSignature() {
            return "isSynthetic()Z";
        }
    }

    /* compiled from: ReflectJavaClass.kt */
    /* synthetic */ class d extends C3859p implements Ba.l<Field, w> {

        /* renamed from: B, reason: collision with root package name */
        public static final d f18978B = new d();

        d() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final w invoke(Field p02) {
            C3862t.g(p02, "p0");
            return new w(p02);
        }

        @Override // kotlin.jvm.internal.AbstractC3849f, Ia.c
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final Ia.g getOwner() {
            return P.b(w.class);
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Field;)V";
        }
    }

    /* compiled from: ReflectJavaClass.kt */
    /* synthetic */ class e extends C3859p implements Ba.l<Method, z> {

        /* renamed from: B, reason: collision with root package name */
        public static final e f18979B = new e();

        e() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final z invoke(Method p02) {
            C3862t.g(p02, "p0");
            return new z(p02);
        }

        @Override // kotlin.jvm.internal.AbstractC3849f, Ia.c
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final Ia.g getOwner() {
            return P.b(z.class);
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Method;)V";
        }
    }

    public q(Class<?> klass) {
        C3862t.g(klass, "klass");
        this.f18974a = klass;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Q(Class cls) {
        String simpleName = cls.getSimpleName();
        C3862t.f(simpleName, "getSimpleName(...)");
        return simpleName.length() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qb.f R(Class cls) {
        String simpleName = cls.getSimpleName();
        if (!qb.f.v(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return qb.f.t(simpleName);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean S(q qVar, Method method) {
        if (method.isSynthetic()) {
            return false;
        }
        if (qVar.C()) {
            C3862t.d(method);
            if (qVar.c0(method)) {
                return false;
            }
        }
        return true;
    }

    private final boolean c0(Method method) {
        String name = method.getName();
        if (C3862t.b(name, "values")) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            C3862t.f(parameterTypes, "getParameterTypes(...)");
            return parameterTypes.length == 0;
        }
        if (C3862t.b(name, "valueOf")) {
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        }
        return false;
    }

    @Override // hb.InterfaceC3514g
    public boolean C() {
        return this.f18974a.isEnum();
    }

    @Override // hb.InterfaceC3514g
    public boolean E() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Boolean boolF = C1818b.f18946a.f(this.f18974a);
        if (boolF != null) {
            return boolF.booleanValue();
        }
        return false;
    }

    @Override // hb.InterfaceC3514g
    public boolean H() {
        return this.f18974a.isInterface();
    }

    @Override // hb.InterfaceC3514g
    public EnumC3507D I() {
        return null;
    }

    @Override // hb.InterfaceC3514g
    public Tb.h<InterfaceC3517j> N() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?>[] clsArrC = C1818b.f18946a.c(this.f18974a);
        if (clsArrC != null) {
            ArrayList arrayList = new ArrayList(clsArrC.length);
            for (Class<?> cls : clsArrC) {
                arrayList.add(new s(cls));
            }
            Tb.h<InterfaceC3517j> hVarZ = kotlin.collections.r.Z(arrayList);
            if (hVarZ != null) {
                return hVarZ;
            }
        }
        return Tb.k.e();
    }

    @Override // hb.InterfaceC3514g
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public List<t> n() throws SecurityException {
        Constructor<?>[] declaredConstructors = this.f18974a.getDeclaredConstructors();
        C3862t.f(declaredConstructors, "getDeclaredConstructors(...)");
        return Tb.k.H(Tb.k.A(Tb.k.r(C3831l.O(declaredConstructors), a.f18975B), b.f18976B));
    }

    @Override // Xa.j
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public Class<?> x() {
        return this.f18974a;
    }

    @Override // hb.InterfaceC3514g
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public List<w> getFields() {
        Field[] declaredFields = this.f18974a.getDeclaredFields();
        C3862t.f(declaredFields, "getDeclaredFields(...)");
        return Tb.k.H(Tb.k.A(Tb.k.r(C3831l.O(declaredFields), c.f18977B), d.f18978B));
    }

    @Override // hb.InterfaceC3514g
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public List<qb.f> K() {
        Class<?>[] declaredClasses = this.f18974a.getDeclaredClasses();
        C3862t.f(declaredClasses, "getDeclaredClasses(...)");
        return Tb.k.H(Tb.k.B(Tb.k.r(C3831l.O(declaredClasses), n.f18971B), o.f18972B));
    }

    @Override // hb.InterfaceC3514g
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public List<z> M() throws SecurityException {
        Method[] declaredMethods = this.f18974a.getDeclaredMethods();
        C3862t.f(declaredMethods, "getDeclaredMethods(...)");
        return Tb.k.H(Tb.k.A(Tb.k.q(C3831l.O(declaredMethods), new p(this)), e.f18979B));
    }

    @Override // hb.InterfaceC3514g
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public q h() {
        Class<?> declaringClass = this.f18974a.getDeclaringClass();
        if (declaringClass != null) {
            return new q(declaringClass);
        }
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof q) && C3862t.b(this.f18974a, ((q) obj).f18974a);
    }

    @Override // hb.InterfaceC3514g
    public qb.c f() {
        return C1822f.e(this.f18974a).a();
    }

    @Override // hb.InterfaceC3526s
    public boolean g() {
        return Modifier.isStatic(getModifiers());
    }

    @Override // hb.InterfaceC3511d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // Xa.A
    public int getModifiers() {
        return this.f18974a.getModifiers();
    }

    @Override // hb.InterfaceC3527t
    public qb.f getName() {
        if (!this.f18974a.isAnonymousClass()) {
            qb.f fVarT = qb.f.t(this.f18974a.getSimpleName());
            C3862t.d(fVarT);
            return fVarT;
        }
        String name = this.f18974a.getName();
        C3862t.f(name, "getName(...)");
        qb.f fVarT2 = qb.f.t(Ub.n.M0(name, ".", null, 2, null));
        C3862t.d(fVarT2);
        return fVarT2;
    }

    @Override // hb.InterfaceC3533z
    public List<F> getTypeParameters() {
        TypeVariable<Class<?>>[] typeParameters = this.f18974a.getTypeParameters();
        C3862t.f(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Class<?>> typeVariable : typeParameters) {
            arrayList.add(new F(typeVariable));
        }
        return arrayList;
    }

    @Override // hb.InterfaceC3526s
    public x0 getVisibility() {
        int modifiers = getModifiers();
        return Modifier.isPublic(modifiers) ? w0.h.f15194c : Modifier.isPrivate(modifiers) ? w0.e.f15191c : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? Va.c.f18235c : Va.b.f18234c : Va.a.f18233c;
    }

    public int hashCode() {
        return this.f18974a.hashCode();
    }

    @Override // hb.InterfaceC3514g
    public Collection<InterfaceC3530w> i() {
        Object[] objArrD = C1818b.f18946a.d(this.f18974a);
        if (objArrD == null) {
            objArrD = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArrD.length);
        for (Object obj : objArrD) {
            arrayList.add(new D(obj));
        }
        return arrayList;
    }

    @Override // hb.InterfaceC3526s
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // hb.InterfaceC3526s
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // hb.InterfaceC3511d
    public boolean l() {
        return false;
    }

    @Override // hb.InterfaceC3511d
    public /* bridge */ /* synthetic */ InterfaceC3508a o(qb.c cVar) {
        return o(cVar);
    }

    @Override // hb.InterfaceC3514g
    public boolean q() {
        return this.f18974a.isAnnotation();
    }

    @Override // hb.InterfaceC3514g
    public Collection<InterfaceC3517j> s() {
        Class cls;
        cls = Object.class;
        if (C3862t.b(this.f18974a, cls)) {
            return kotlin.collections.r.m();
        }
        U u10 = new U(2);
        Object genericSuperclass = this.f18974a.getGenericSuperclass();
        u10.a(genericSuperclass != null ? genericSuperclass : Object.class);
        u10.b(this.f18974a.getGenericInterfaces());
        List listP = kotlin.collections.r.p(u10.d(new Type[u10.c()]));
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(listP, 10));
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            arrayList.add(new s((Type) it.next()));
        }
        return arrayList;
    }

    @Override // hb.InterfaceC3514g
    public boolean t() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Boolean boolE = C1818b.f18946a.e(this.f18974a);
        if (boolE != null) {
            return boolE.booleanValue();
        }
        return false;
    }

    public String toString() {
        return q.class.getName() + ": " + this.f18974a;
    }

    @Override // hb.InterfaceC3514g
    public boolean u() {
        return false;
    }

    @Override // Xa.j, hb.InterfaceC3511d
    public List<C1823g> getAnnotations() {
        Annotation[] declaredAnnotations;
        List<C1823g> listB;
        AnnotatedElement annotatedElementX = x();
        return (annotatedElementX == null || (declaredAnnotations = annotatedElementX.getDeclaredAnnotations()) == null || (listB = k.b(declaredAnnotations)) == null) ? kotlin.collections.r.m() : listB;
    }

    @Override // Xa.j, hb.InterfaceC3511d
    public C1823g o(qb.c fqName) {
        Annotation[] declaredAnnotations;
        C3862t.g(fqName, "fqName");
        AnnotatedElement annotatedElementX = x();
        if (annotatedElementX == null || (declaredAnnotations = annotatedElementX.getDeclaredAnnotations()) == null) {
            return null;
        }
        return k.a(declaredAnnotations, fqName);
    }
}
