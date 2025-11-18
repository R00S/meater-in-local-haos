package p241e.p254e.p256b.p257a.p258i.p268z;

import android.os.Build;
import android.util.Log;

/* compiled from: Logging.java */
/* renamed from: e.e.b.a.i.z.a */
/* loaded from: classes2.dex */
public final class C8891a {
    /* renamed from: a */
    private static String m28229a(String str, String str2) {
        String str3 = str + str2;
        return str3.length() > 23 ? str3.substring(0, 23) : str3;
    }

    /* renamed from: b */
    public static void m28230b(String str, String str2, Object obj) {
        String strM28233e = m28233e(str);
        if (Log.isLoggable(strM28233e, 3)) {
            Log.d(strM28233e, String.format(str2, obj));
        }
    }

    /* renamed from: c */
    public static void m28231c(String str, String str2, Object... objArr) {
        String strM28233e = m28233e(str);
        if (Log.isLoggable(strM28233e, 3)) {
            Log.d(strM28233e, String.format(str2, objArr));
        }
    }

    /* renamed from: d */
    public static void m28232d(String str, String str2, Throwable th) {
        String strM28233e = m28233e(str);
        if (Log.isLoggable(strM28233e, 6)) {
            Log.e(strM28233e, str2, th);
        }
    }

    /* renamed from: e */
    private static String m28233e(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return m28229a("TRuntime.", str);
        }
        return "TRuntime." + str;
    }

    /* renamed from: f */
    public static void m28234f(String str, String str2, Object obj) {
        String strM28233e = m28233e(str);
        if (Log.isLoggable(strM28233e, 4)) {
            Log.i(strM28233e, String.format(str2, obj));
        }
    }

    /* renamed from: g */
    public static void m28235g(String str, String str2, Object obj) {
        String strM28233e = m28233e(str);
        if (Log.isLoggable(strM28233e, 5)) {
            Log.w(strM28233e, String.format(str2, obj));
        }
    }
}
