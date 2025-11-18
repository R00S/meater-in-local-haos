package p241e.p307h.p308a.p315k0;

import android.util.Log;

/* compiled from: FileDownloadLog.java */
/* renamed from: e.h.a.k0.d */
/* loaded from: classes2.dex */
public class C9034d {

    /* renamed from: a */
    public static boolean f34819a = false;

    /* renamed from: a */
    public static void m28962a(Object obj, String str, Object... objArr) {
        m28967f(3, obj, str, objArr);
    }

    /* renamed from: b */
    public static void m28963b(Object obj, String str, Object... objArr) {
        m28967f(6, obj, str, objArr);
    }

    /* renamed from: c */
    public static void m28964c(Object obj, Throwable th, String str, Object... objArr) {
        m28968g(6, obj, th, str, objArr);
    }

    /* renamed from: d */
    private static String m28965d(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("FileDownloader.");
        sb.append((obj instanceof Class ? (Class) obj : obj.getClass()).getSimpleName());
        return sb.toString();
    }

    /* renamed from: e */
    public static void m28966e(Object obj, String str, Object... objArr) {
        m28967f(4, obj, str, objArr);
    }

    /* renamed from: f */
    private static void m28967f(int i2, Object obj, String str, Object... objArr) {
        m28968g(i2, obj, null, str, objArr);
    }

    /* renamed from: g */
    private static void m28968g(int i2, Object obj, Throwable th, String str, Object... objArr) {
        if ((i2 >= 5) || f34819a) {
            Log.println(i2, m28965d(obj), C9036f.m29009o(str, objArr));
            if (th != null) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: h */
    public static void m28969h(Object obj, String str, Object... objArr) {
        m28967f(2, obj, str, objArr);
    }

    /* renamed from: i */
    public static void m28970i(Object obj, String str, Object... objArr) {
        m28967f(5, obj, str, objArr);
    }
}
