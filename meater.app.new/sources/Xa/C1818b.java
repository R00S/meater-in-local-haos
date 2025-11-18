package Xa;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C3862t;

/* compiled from: ReflectJavaClass.kt */
/* renamed from: Xa.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1818b {

    /* renamed from: a, reason: collision with root package name */
    public static final C1818b f18946a = new C1818b();

    /* renamed from: b, reason: collision with root package name */
    private static a f18947b;

    /* compiled from: ReflectJavaClass.kt */
    /* renamed from: Xa.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Method f18948a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f18949b;

        /* renamed from: c, reason: collision with root package name */
        private final Method f18950c;

        /* renamed from: d, reason: collision with root package name */
        private final Method f18951d;

        public a(Method method, Method method2, Method method3, Method method4) {
            this.f18948a = method;
            this.f18949b = method2;
            this.f18950c = method3;
            this.f18951d = method4;
        }

        public final Method a() {
            return this.f18949b;
        }

        public final Method b() {
            return this.f18951d;
        }

        public final Method c() {
            return this.f18950c;
        }

        public final Method d() {
            return this.f18948a;
        }
    }

    private C1818b() {
    }

    private final a a() {
        try {
            return new a(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
        } catch (NoSuchMethodException unused) {
            return new a(null, null, null, null);
        }
    }

    private final a b() {
        a aVar = f18947b;
        if (aVar != null) {
            return aVar;
        }
        a aVarA = a();
        f18947b = aVarA;
        return aVarA;
    }

    public final Class<?>[] c(Class<?> clazz) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C3862t.g(clazz, "clazz");
        Method methodA = b().a();
        if (methodA == null) {
            return null;
        }
        Object objInvoke = methodA.invoke(clazz, null);
        C3862t.e(objInvoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
        return (Class[]) objInvoke;
    }

    public final Object[] d(Class<?> clazz) {
        C3862t.g(clazz, "clazz");
        Method methodB = b().b();
        if (methodB == null) {
            return null;
        }
        return (Object[]) methodB.invoke(clazz, null);
    }

    public final Boolean e(Class<?> clazz) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C3862t.g(clazz, "clazz");
        Method methodC = b().c();
        if (methodC == null) {
            return null;
        }
        Object objInvoke = methodC.invoke(clazz, null);
        C3862t.e(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objInvoke;
    }

    public final Boolean f(Class<?> clazz) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C3862t.g(clazz, "clazz");
        Method methodD = b().d();
        if (methodD == null) {
            return null;
        }
        Object objInvoke = methodD.invoke(clazz, null);
        C3862t.e(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objInvoke;
    }
}
