package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;

@zzard
/* loaded from: classes2.dex */
public class zzbad {
    /* renamed from: a */
    public static boolean m17345a(int i2) {
        return i2 >= 5 || Log.isLoggable("Ads", i2);
    }

    /* renamed from: b */
    public static void m17346b(String str, Throwable th) {
        if (m17345a(3)) {
            Log.d("Ads", str, th);
        }
    }

    /* renamed from: c */
    public static void m17347c(String str, Throwable th) {
        if (m17345a(6)) {
            Log.e("Ads", str, th);
        }
    }

    /* renamed from: d */
    public static void m17348d(String str, Throwable th) {
        if (m17345a(5)) {
            Log.w("Ads", str, th);
        }
    }

    /* renamed from: e */
    public static void m17349e(String str) {
        if (m17345a(3)) {
            Log.d("Ads", str);
        }
    }

    /* renamed from: f */
    public static void m17350f(String str, Throwable th) {
        if (m17345a(5)) {
            if (th != null) {
                m17348d(m17354j(str), th);
            } else {
                m17353i(m17354j(str));
            }
        }
    }

    /* renamed from: g */
    public static void m17351g(String str) {
        if (m17345a(6)) {
            Log.e("Ads", str);
        }
    }

    /* renamed from: h */
    public static void m17352h(String str) {
        if (m17345a(4)) {
            Log.i("Ads", str);
        }
    }

    /* renamed from: i */
    public static void m17353i(String str) {
        if (m17345a(5)) {
            Log.w("Ads", str);
        }
    }

    @VisibleForTesting
    /* renamed from: j */
    private static String m17354j(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append(" @");
        sb.append(lineNumber);
        return sb.toString();
    }

    /* renamed from: k */
    public static void m17355k(String str) {
        m17350f(str, null);
    }
}
