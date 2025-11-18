package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* compiled from: Intrinsics.java */
/* renamed from: kotlin.a0.d.m */
/* loaded from: classes2.dex */
public class C9801m {
    private C9801m() {
    }

    /* renamed from: a */
    public static boolean m32341a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m32342b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) m32352l(new IllegalStateException(str + " must not be null")));
    }

    /* renamed from: c */
    public static void m32343c(Object obj) {
        if (obj == null) {
            m32355o();
        }
    }

    /* renamed from: d */
    public static void m32344d(Object obj, String str) {
        if (obj == null) {
            m32356p(str);
        }
    }

    /* renamed from: e */
    public static void m32345e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) m32352l(new NullPointerException(str + " must not be null")));
    }

    /* renamed from: f */
    public static void m32346f(Object obj, String str) {
        if (obj == null) {
            m32359s(str);
        }
    }

    /* renamed from: g */
    public static void m32347g(Object obj, String str) {
        if (obj == null) {
            m32358r(str);
        }
    }

    /* renamed from: h */
    public static int m32348h(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    /* renamed from: i */
    public static int m32349i(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    /* renamed from: j */
    private static String m32350j(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    /* renamed from: k */
    public static void m32351k(int i2, String str) {
        m32360t();
    }

    /* renamed from: l */
    private static <T extends Throwable> T m32352l(T t) {
        return (T) m32353m(t, C9801m.class.getName());
    }

    /* renamed from: m */
    static <T extends Throwable> T m32353m(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
        return t;
    }

    /* renamed from: n */
    public static String m32354n(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: o */
    public static void m32355o() {
        throw ((NullPointerException) m32352l(new NullPointerException()));
    }

    /* renamed from: p */
    public static void m32356p(String str) {
        throw ((NullPointerException) m32352l(new NullPointerException(str)));
    }

    /* renamed from: q */
    public static void m32357q() {
        throw ((KotlinNullPointerException) m32352l(new KotlinNullPointerException()));
    }

    /* renamed from: r */
    private static void m32358r(String str) {
        throw ((IllegalArgumentException) m32352l(new IllegalArgumentException(m32350j(str))));
    }

    /* renamed from: s */
    private static void m32359s(String str) {
        throw ((NullPointerException) m32352l(new NullPointerException(m32350j(str))));
    }

    /* renamed from: t */
    public static void m32360t() {
        m32361u("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* renamed from: u */
    public static void m32361u(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* renamed from: v */
    public static void m32362v(String str) {
        throw ((UninitializedPropertyAccessException) m32352l(new UninitializedPropertyAccessException(str)));
    }

    /* renamed from: w */
    public static void m32363w(String str) {
        m32362v("lateinit property " + str + " has not been initialized");
    }
}
