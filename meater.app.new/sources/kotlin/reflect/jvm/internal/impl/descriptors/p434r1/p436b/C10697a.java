package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C9801m;

/* compiled from: ReflectJavaRecordComponent.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.a */
/* loaded from: classes2.dex */
final class C10697a {

    /* renamed from: a */
    public static final C10697a f41156a = new C10697a();

    /* renamed from: b */
    private static a f41157b;

    /* compiled from: ReflectJavaRecordComponent.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.a$a */
    public static final class a {

        /* renamed from: a */
        private final Method f41158a;

        /* renamed from: b */
        private final Method f41159b;

        public a(Method method, Method method2) {
            this.f41158a = method;
            this.f41159b = method2;
        }

        /* renamed from: a */
        public final Method m38043a() {
            return this.f41159b;
        }

        /* renamed from: b */
        public final Method m38044b() {
            return this.f41158a;
        }
    }

    private C10697a() {
    }

    /* renamed from: a */
    private final a m38039a(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new a(cls.getMethod("getType", new Class[0]), cls.getMethod("getAccessor", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new a(null, null);
        }
    }

    /* renamed from: b */
    private final a m38040b(Object obj) {
        a aVar = f41157b;
        if (aVar != null) {
            return aVar;
        }
        a aVarM38039a = m38039a(obj);
        f41157b = aVarM38039a;
        return aVarM38039a;
    }

    /* renamed from: c */
    public final Method m38041c(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C9801m.m32346f(obj, "recordComponent");
        Method methodM38043a = m38040b(obj).m38043a();
        if (methodM38043a == null) {
            return null;
        }
        Object objInvoke = methodM38043a.invoke(obj, new Object[0]);
        C9801m.m32344d(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
        return (Method) objInvoke;
    }

    /* renamed from: d */
    public final Class<?> m38042d(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C9801m.m32346f(obj, "recordComponent");
        Method methodM38044b = m38040b(obj).m38044b();
        if (methodM38044b == null) {
            return null;
        }
        Object objInvoke = methodM38044b.invoke(obj, new Object[0]);
        C9801m.m32344d(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
        return (Class) objInvoke;
    }
}
