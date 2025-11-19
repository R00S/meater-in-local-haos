package Xa;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C3862t;

/* compiled from: ReflectJavaRecordComponent.kt */
/* renamed from: Xa.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1817a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1817a f18942a = new C1817a();

    /* renamed from: b, reason: collision with root package name */
    private static C0275a f18943b;

    /* compiled from: ReflectJavaRecordComponent.kt */
    /* renamed from: Xa.a$a, reason: collision with other inner class name */
    public static final class C0275a {

        /* renamed from: a, reason: collision with root package name */
        private final Method f18944a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f18945b;

        public C0275a(Method method, Method method2) {
            this.f18944a = method;
            this.f18945b = method2;
        }

        public final Method a() {
            return this.f18945b;
        }

        public final Method b() {
            return this.f18944a;
        }
    }

    private C1817a() {
    }

    private final C0275a a(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new C0275a(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
        } catch (NoSuchMethodException unused) {
            return new C0275a(null, null);
        }
    }

    private final C0275a b(Object obj) {
        C0275a c0275a = f18943b;
        if (c0275a != null) {
            return c0275a;
        }
        C0275a c0275aA = a(obj);
        f18943b = c0275aA;
        return c0275aA;
    }

    public final Method c(Object recordComponent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C3862t.g(recordComponent, "recordComponent");
        Method methodA = b(recordComponent).a();
        if (methodA == null) {
            return null;
        }
        Object objInvoke = methodA.invoke(recordComponent, null);
        C3862t.e(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
        return (Method) objInvoke;
    }

    public final Class<?> d(Object recordComponent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C3862t.g(recordComponent, "recordComponent");
        Method methodB = b(recordComponent).b();
        if (methodB == null) {
            return null;
        }
        Object objInvoke = methodB.invoke(recordComponent, null);
        C3862t.e(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
        return (Class) objInvoke;
    }
}
