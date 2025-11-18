package p024c.p087w;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Trace.java */
/* renamed from: c.w.a */
/* loaded from: classes.dex */
public final class C1021a {

    /* renamed from: a */
    private static long f6768a;

    /* renamed from: b */
    private static Method f6769b;

    /* renamed from: a */
    public static void m6523a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            C1022b.m6528a(str);
        }
    }

    /* renamed from: b */
    public static void m6524b() {
        if (Build.VERSION.SDK_INT >= 18) {
            C1022b.m6529b();
        }
    }

    /* renamed from: c */
    private static void m6525c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public static boolean m6526d() {
        try {
            if (f6769b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return m6527e();
    }

    /* renamed from: e */
    private static boolean m6527e() {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (f6769b == null) {
                    f6768a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    f6769b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                return ((Boolean) f6769b.invoke(null, Long.valueOf(f6768a))).booleanValue();
            } catch (Exception e2) {
                m6525c("isTagEnabled", e2);
            }
        }
        return false;
    }
}
