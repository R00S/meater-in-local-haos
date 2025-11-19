package n1;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: TraceCompat.java */
@Deprecated
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private static long f45603a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f45604b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f45605c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f45606d;

    /* renamed from: e, reason: collision with root package name */
    private static Method f45607e;

    /* compiled from: TraceCompat.java */
    static class a {
        static boolean a() {
            return Trace.isEnabled();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f45603a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f45604b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f45605c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f45606d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f45607e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e10) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e10);
            }
        }
    }

    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }

    public static boolean c() {
        if (Build.VERSION.SDK_INT >= 29) {
            return a.a();
        }
        try {
            return ((Boolean) f45604b.invoke(null, Long.valueOf(f45603a))).booleanValue();
        } catch (Exception unused) {
            Log.v("TraceCompat", "Unable to invoke isTagEnabled() via reflection.");
            return false;
        }
    }
}
