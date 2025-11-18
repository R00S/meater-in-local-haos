package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C9801m;

/* compiled from: ReflectJavaMember.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.c */
/* loaded from: classes2.dex */
final class C10701c {

    /* renamed from: a */
    public static final C10701c f41171a = new C10701c();

    /* renamed from: b */
    private static a f41172b;

    /* compiled from: ReflectJavaMember.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.c$a */
    public static final class a {

        /* renamed from: a */
        private final Method f41173a;

        /* renamed from: b */
        private final Method f41174b;

        public a(Method method, Method method2) {
            this.f41173a = method;
            this.f41174b = method2;
        }

        /* renamed from: a */
        public final Method m38064a() {
            return this.f41174b;
        }

        /* renamed from: b */
        public final Method m38065b() {
            return this.f41173a;
        }
    }

    private C10701c() {
    }

    /* renamed from: a */
    public final a m38062a(Member member) throws NoSuchMethodException, SecurityException {
        C9801m.m32346f(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new a(cls.getMethod("getParameters", new Class[0]), C10703d.m38073e(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new a(null, null);
        }
    }

    /* renamed from: b */
    public final List<String> m38063b(Member member) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method methodM38064a;
        C9801m.m32346f(member, "member");
        a aVarM38062a = f41172b;
        if (aVarM38062a == null) {
            synchronized (this) {
                C10701c c10701c = f41171a;
                a aVar = f41172b;
                if (aVar == null) {
                    aVarM38062a = c10701c.m38062a(member);
                    f41172b = aVarM38062a;
                } else {
                    aVarM38062a = aVar;
                }
            }
        }
        Method methodM38065b = aVarM38062a.m38065b();
        if (methodM38065b == null || (methodM38064a = aVarM38062a.m38064a()) == null) {
            return null;
        }
        Object objInvoke = methodM38065b.invoke(member, new Object[0]);
        C9801m.m32344d(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr = (Object[]) objInvoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Object objInvoke2 = methodM38064a.invoke(obj, new Object[0]);
            C9801m.m32344d(objInvoke2, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) objInvoke2);
        }
        return arrayList;
    }
}
