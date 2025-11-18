package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10803n;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9793i;
import kotlin.jvm.internal.C9796j0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10611m1;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.InterfaceC10707h;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.InterfaceC10721v;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.EnumC10026d0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10030g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10033j;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10046w;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.sequences.C10522n;

/* compiled from: ReflectJavaClass.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.l */
/* loaded from: classes2.dex */
public final class C10711l extends AbstractC10715p implements InterfaceC10707h, InterfaceC10721v, InterfaceC10030g {

    /* renamed from: a */
    private final Class<?> f41193a;

    /* compiled from: ReflectJavaClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.l$a */
    /* synthetic */ class a extends C9793i implements Function1<Member, Boolean> {

        /* renamed from: h */
        public static final a f41194h = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getF40571m() {
            return "isSynthetic";
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final KDeclarationContainer getOwner() {
            return C9790g0.m32298b(Member.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final String getSignature() {
            return "isSynthetic()Z";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Member member) {
            C9801m.m32346f(member, "p0");
            return Boolean.valueOf(member.isSynthetic());
        }
    }

    /* compiled from: ReflectJavaClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.l$b */
    /* synthetic */ class b extends C9793i implements Function1<Constructor<?>, C10714o> {

        /* renamed from: h */
        public static final b f41195h = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getF40571m() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final KDeclarationContainer getOwner() {
            return C9790g0.m32298b(C10714o.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Constructor;)V";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final C10714o invoke(Constructor<?> constructor) {
            C9801m.m32346f(constructor, "p0");
            return new C10714o(constructor);
        }
    }

    /* compiled from: ReflectJavaClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.l$c */
    /* synthetic */ class c extends C9793i implements Function1<Member, Boolean> {

        /* renamed from: h */
        public static final c f41196h = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getF40571m() {
            return "isSynthetic";
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final KDeclarationContainer getOwner() {
            return C9790g0.m32298b(Member.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final String getSignature() {
            return "isSynthetic()Z";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Member member) {
            C9801m.m32346f(member, "p0");
            return Boolean.valueOf(member.isSynthetic());
        }
    }

    /* compiled from: ReflectJavaClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.l$d */
    /* synthetic */ class d extends C9793i implements Function1<Field, C10717r> {

        /* renamed from: h */
        public static final d f41197h = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getF40571m() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final KDeclarationContainer getOwner() {
            return C9790g0.m32298b(C10717r.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Field;)V";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final C10717r invoke(Field field) {
            C9801m.m32346f(field, "p0");
            return new C10717r(field);
        }
    }

    /* compiled from: ReflectJavaClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.l$e */
    static final class e extends Lambda implements Function1<Class<?>, Boolean> {

        /* renamed from: f */
        public static final e f41198f = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            C9801m.m32345e(simpleName, "it.simpleName");
            return Boolean.valueOf(simpleName.length() == 0);
        }
    }

    /* compiled from: ReflectJavaClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.l$f */
    static final class f extends Lambda implements Function1<Class<?>, C10163f> {

        /* renamed from: f */
        public static final f f41199f = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C10163f invoke(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            if (!C10163f.m35450A(simpleName)) {
                simpleName = null;
            }
            if (simpleName != null) {
                return C10163f.m35454x(simpleName);
            }
            return null;
        }
    }

    /* compiled from: ReflectJavaClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.l$g */
    static final class g extends Lambda implements Function1<Method, Boolean> {
        g() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:4:0x0008  */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean invoke(java.lang.reflect.Method r5) {
            /*
                r4 = this;
                boolean r0 = r5.isSynthetic()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto La
            L8:
                r1 = 0
                goto L1f
            La:
                kotlin.reflect.jvm.internal.impl.descriptors.r1.b.l r0 = kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10711l.this
                boolean r0 = r0.mo33588B()
                if (r0 == 0) goto L1f
                kotlin.reflect.jvm.internal.impl.descriptors.r1.b.l r0 = kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10711l.this
                java.lang.String r3 = "method"
                kotlin.jvm.internal.C9801m.m32345e(r5, r3)
                boolean r5 = kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10711l.m38087R(r0, r5)
                if (r5 != 0) goto L8
            L1f:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10711l.g.invoke(java.lang.reflect.Method):java.lang.Boolean");
        }
    }

    /* compiled from: ReflectJavaClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.l$h */
    /* synthetic */ class h extends C9793i implements Function1<Method, C10720u> {

        /* renamed from: h */
        public static final h f41201h = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getF40571m() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final KDeclarationContainer getOwner() {
            return C9790g0.m32298b(C10720u.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Method;)V";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final C10720u invoke(Method method) {
            C9801m.m32346f(method, "p0");
            return new C10720u(method);
        }
    }

    public C10711l(Class<?> cls) {
        C9801m.m32346f(cls, "klass");
        this.f41193a = cls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public final boolean m38088a0(Method method) {
        String name = method.getName();
        if (C9801m.m32341a(name, "values")) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            C9801m.m32345e(parameterTypes, "method.parameterTypes");
            if (parameterTypes.length == 0) {
                return true;
            }
        } else if (C9801m.m32341a(name, "valueOf")) {
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        }
        return false;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10030g
    /* renamed from: B */
    public boolean mo33588B() {
        return this.f41193a.isEnum();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.InterfaceC10721v
    /* renamed from: E */
    public int mo38089E() {
        return this.f41193a.getModifiers();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10030g
    /* renamed from: H */
    public boolean mo33590H() {
        return this.f41193a.isInterface();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10030g
    /* renamed from: I */
    public EnumC10026d0 mo33591I() {
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10030g
    /* renamed from: N */
    public Collection<InterfaceC10033j> mo33594N() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?>[] clsArrM38051c = C10699b.f41161a.m38051c(this.f41193a);
        if (clsArrM38051c == null) {
            return C10817u.m38888j();
        }
        ArrayList arrayList = new ArrayList(clsArrM38051c.length);
        for (Class<?> cls : clsArrM38051c) {
            arrayList.add(new C10713n(cls));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10042s
    /* renamed from: Q */
    public boolean mo33623Q() {
        return InterfaceC10721v.a.m38119d(this);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10025d
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public C10704e mo33582l(C10160c c10160c) {
        return InterfaceC10707h.a.m38081a(this, c10160c);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10025d
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public List<C10704e> getAnnotations() {
        return InterfaceC10707h.a.m38082b(this);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10030g
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public List<C10714o> mo33599k() throws SecurityException {
        Constructor<?>[] declaredConstructors = this.f41193a.getDeclaredConstructors();
        C9801m.m32345e(declaredConstructors, "klass.declaredConstructors");
        return C10522n.m37377A(C10522n.m37391u(C10522n.m37383m(C10803n.m38762r(declaredConstructors), a.f41194h), b.f41195h));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.InterfaceC10707h
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public Class<?> mo38048w() {
        return this.f41193a;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10030g
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public List<C10717r> mo33589D() {
        Field[] declaredFields = this.f41193a.getDeclaredFields();
        C9801m.m32345e(declaredFields, "klass.declaredFields");
        return C10522n.m37377A(C10522n.m37391u(C10522n.m37383m(C10803n.m38762r(declaredFields), c.f41196h), d.f41197h));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10030g
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public List<C10163f> mo33592K() {
        Class<?>[] declaredClasses = this.f41193a.getDeclaredClasses();
        C9801m.m32345e(declaredClasses, "klass.declaredClasses");
        return C10522n.m37377A(C10522n.m37392v(C10522n.m37383m(C10803n.m38762r(declaredClasses), e.f41198f), f.f41199f));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10030g
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public List<C10720u> mo33593M() throws SecurityException {
        Method[] declaredMethods = this.f41193a.getDeclaredMethods();
        C9801m.m32345e(declaredMethods, "klass.declaredMethods");
        return C10522n.m37377A(C10522n.m37391u(C10522n.m37382l(C10803n.m38762r(declaredMethods), new g()), h.f41201h));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10030g
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public C10711l mo33597i() {
        Class<?> declaringClass = this.f41193a.getDeclaringClass();
        if (declaringClass != null) {
            return new C10711l(declaringClass);
        }
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10030g
    /* renamed from: a */
    public Collection<InterfaceC10033j> mo33595a() {
        Class cls;
        cls = Object.class;
        if (C9801m.m32341a(this.f41193a, cls)) {
            return C10817u.m38888j();
        }
        C9796j0 c9796j0 = new C9796j0(2);
        Object genericSuperclass = this.f41193a.getGenericSuperclass();
        c9796j0.m32319a(genericSuperclass != null ? genericSuperclass : Object.class);
        Type[] genericInterfaces = this.f41193a.getGenericInterfaces();
        C9801m.m32345e(genericInterfaces, "klass.genericInterfaces");
        c9796j0.m32320b(genericInterfaces);
        List listM38891m = C10817u.m38891m(c9796j0.m32322d(new Type[c9796j0.m32321c()]));
        ArrayList arrayList = new ArrayList(C10819v.m38911u(listM38891m, 10));
        Iterator it = listM38891m.iterator();
        while (it.hasNext()) {
            arrayList.add(new C10713n((Type) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10030g
    /* renamed from: d */
    public C10160c mo33596d() {
        C10160c c10160cM35409b = C10703d.m38069a(this.f41193a).m35409b();
        C9801m.m32345e(c10160cM35409b, "klass.classId.asSingleFqName()");
        return c10160cM35409b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10711l) && C9801m.m32341a(this.f41193a, ((C10711l) obj).f41193a);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10043t
    public C10163f getName() {
        C10163f c10163fM35454x = C10163f.m35454x(this.f41193a.getSimpleName());
        C9801m.m32345e(c10163fM35454x, "identifier(klass.simpleName)");
        return c10163fM35454x;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10049z
    public List<C10698a0> getTypeParameters() {
        TypeVariable<Class<?>>[] typeParameters = this.f41193a.getTypeParameters();
        C9801m.m32345e(typeParameters, "klass.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Class<?>> typeVariable : typeParameters) {
            arrayList.add(new C10698a0(typeVariable));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10042s
    public AbstractC10611m1 getVisibility() {
        return InterfaceC10721v.a.m38116a(this);
    }

    public int hashCode() {
        return this.f41193a.hashCode();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10042s
    public boolean isAbstract() {
        return InterfaceC10721v.a.m38117b(this);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10042s
    public boolean isFinal() {
        return InterfaceC10721v.a.m38118c(this);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10030g
    /* renamed from: j */
    public Collection<InterfaceC10046w> mo33598j() {
        Object[] objArrM38052d = C10699b.f41161a.m38052d(this.f41193a);
        if (objArrM38052d == null) {
            objArrM38052d = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArrM38052d.length);
        for (Object obj : objArrM38052d) {
            arrayList.add(new C10724y(obj));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10025d
    /* renamed from: m */
    public boolean mo33583m() {
        return InterfaceC10707h.a.m38083c(this);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10030g
    /* renamed from: o */
    public boolean mo33600o() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Boolean boolM38054f = C10699b.f41161a.m38054f(this.f41193a);
        if (boolM38054f != null) {
            return boolM38054f.booleanValue();
        }
        return false;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10030g
    /* renamed from: r */
    public boolean mo33601r() {
        return this.f41193a.isAnnotation();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10030g
    /* renamed from: t */
    public boolean mo33602t() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Boolean boolM38053e = C10699b.f41161a.m38053e(this.f41193a);
        if (boolM38053e != null) {
            return boolM38053e.booleanValue();
        }
        return false;
    }

    public String toString() {
        return C10711l.class.getName() + ": " + this.f41193a;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10030g
    /* renamed from: u */
    public boolean mo33603u() {
        return false;
    }
}
