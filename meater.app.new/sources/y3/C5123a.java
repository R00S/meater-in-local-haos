package y3;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Trace.java */
/* renamed from: y3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5123a {

    /* renamed from: a, reason: collision with root package name */
    private static long f53104a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f53105b;

    public static void a(String str) {
        C5124b.a(f(str));
    }

    public static void b() {
        C5124b.b();
    }

    private static void c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 29 ? C5125c.a() : e();
    }

    private static boolean e() {
        try {
            if (f53105b == null) {
                f53104a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f53105b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f53105b.invoke(null, Long.valueOf(f53104a))).booleanValue();
        } catch (Exception e10) {
            c("isTagEnabled", e10);
            return false;
        }
    }

    private static String f(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
