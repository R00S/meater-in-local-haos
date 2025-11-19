package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* compiled from: Intrinsics.java */
/* renamed from: kotlin.jvm.internal.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3862t {

    /* compiled from: Intrinsics.java */
    /* renamed from: kotlin.jvm.internal.t$a */
    public static class a {
        private a() {
        }
    }

    private C3862t() {
    }

    public static boolean a(Float f10, float f11) {
        return f10 != null && f10.floatValue() == f11;
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) l(new IllegalStateException(str + " must not be null")));
    }

    public static void d(Object obj) {
        if (obj == null) {
            o();
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            p(str);
        }
    }

    public static void f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) l(new NullPointerException(str + " must not be null")));
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            s(str);
        }
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            r(str);
        }
    }

    public static int i(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    public static int j(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    private static String k(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = C3862t.class.getName();
        int i10 = 0;
        while (!stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        while (stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    private static <T extends Throwable> T l(T t10) {
        return (T) m(t10, C3862t.class.getName());
    }

    static <T extends Throwable> T m(T t10, String str) {
        StackTraceElement[] stackTrace = t10.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        t10.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        return t10;
    }

    public static String n(String str, Object obj) {
        return str + obj;
    }

    public static void o() {
        throw ((NullPointerException) l(new NullPointerException()));
    }

    public static void p(String str) {
        throw ((NullPointerException) l(new NullPointerException(str)));
    }

    public static void q() {
        throw ((KotlinNullPointerException) l(new KotlinNullPointerException()));
    }

    private static void r(String str) {
        throw ((IllegalArgumentException) l(new IllegalArgumentException(k(str))));
    }

    private static void s(String str) {
        throw ((NullPointerException) l(new NullPointerException(k(str))));
    }

    public static void t(String str) {
        throw ((UninitializedPropertyAccessException) l(new UninitializedPropertyAccessException(str)));
    }

    public static void u(String str) {
        t("lateinit property " + str + " has not been initialized");
    }
}
