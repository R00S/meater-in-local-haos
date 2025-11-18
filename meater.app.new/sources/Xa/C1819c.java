package Xa;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: ReflectJavaMember.kt */
/* renamed from: Xa.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1819c {

    /* renamed from: a, reason: collision with root package name */
    public static final C1819c f18952a = new C1819c();

    /* renamed from: b, reason: collision with root package name */
    private static a f18953b;

    /* compiled from: ReflectJavaMember.kt */
    /* renamed from: Xa.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Method f18954a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f18955b;

        public a(Method method, Method method2) {
            this.f18954a = method;
            this.f18955b = method2;
        }

        public final Method a() {
            return this.f18955b;
        }

        public final Method b() {
            return this.f18954a;
        }
    }

    private C1819c() {
    }

    public final a a(Member member) throws NoSuchMethodException, SecurityException {
        C3862t.g(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new a(cls.getMethod("getParameters", null), C1822f.j(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
        } catch (NoSuchMethodException unused) {
            return new a(null, null);
        }
    }

    public final List<String> b(Member member) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method methodA;
        C3862t.g(member, "member");
        a aVarA = f18953b;
        if (aVarA == null) {
            synchronized (this) {
                aVarA = f18953b;
                if (aVarA == null) {
                    aVarA = f18952a.a(member);
                    f18953b = aVarA;
                }
            }
        }
        Method methodB = aVarA.b();
        if (methodB == null || (methodA = aVarA.a()) == null) {
            return null;
        }
        Object objInvoke = methodB.invoke(member, null);
        C3862t.e(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr = (Object[]) objInvoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Object objInvoke2 = methodA.invoke(obj, null);
            C3862t.e(objInvoke2, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) objInvoke2);
        }
        return arrayList;
    }
}
