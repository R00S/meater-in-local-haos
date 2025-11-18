package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: TraceCompat.java */
@Deprecated
/* renamed from: androidx.core.os.d */
/* loaded from: classes.dex */
public final class C0275d {

    /* renamed from: a */
    private static long f2255a;

    /* renamed from: b */
    private static Method f2256b;

    /* renamed from: c */
    private static Method f2257c;

    /* renamed from: d */
    private static Method f2258d;

    /* renamed from: e */
    private static Method f2259e;

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 18 || i2 >= 29) {
            return;
        }
        try {
            f2255a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
            Class cls = Long.TYPE;
            f2256b = Trace.class.getMethod("isTagEnabled", cls);
            Class cls2 = Integer.TYPE;
            f2257c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
            f2258d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
            f2259e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
        } catch (Exception e2) {
            Log.i("TraceCompat", "Unable to initialize via reflection.", e2);
        }
    }

    /* renamed from: a */
    public static void m1840a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    /* renamed from: b */
    public static void m1841b() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
