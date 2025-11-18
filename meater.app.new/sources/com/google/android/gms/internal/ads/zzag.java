package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public class zzag {

    /* renamed from: a */
    private static String f21995a = "Volley";

    /* renamed from: b */
    public static boolean f21996b = Log.isLoggable("Volley", 2);

    /* renamed from: c */
    private static final String f21997c = zzag.class.getName();

    /* renamed from: com.google.android.gms.internal.ads.zzag$a */
    static class C7432a {

        /* renamed from: a */
        public static final boolean f21998a = zzag.f21996b;

        /* renamed from: b */
        private final List<C7358y> f21999b = new ArrayList();

        /* renamed from: c */
        private boolean f22000c = false;

        C7432a() {
        }

        /* renamed from: a */
        public final synchronized void m16531a(String str, long j2) {
            if (this.f22000c) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f21999b.add(new C7358y(str, j2, SystemClock.elapsedRealtime()));
        }

        /* renamed from: b */
        public final synchronized void m16532b(String str) {
            long j2;
            this.f22000c = true;
            if (this.f21999b.size() == 0) {
                j2 = 0;
            } else {
                long j3 = this.f21999b.get(0).f20993c;
                List<C7358y> list = this.f21999b;
                j2 = list.get(list.size() - 1).f20993c - j3;
            }
            if (j2 <= 0) {
                return;
            }
            long j4 = this.f21999b.get(0).f20993c;
            zzag.m16526a("(%-4d ms) %s", Long.valueOf(j2), str);
            for (C7358y c7358y : this.f21999b) {
                long j5 = c7358y.f20993c;
                zzag.m16526a("(+%-4d) [%2d] %s", Long.valueOf(j5 - j4), Long.valueOf(c7358y.f20992b), c7358y.f20991a);
                j4 = j5;
            }
        }

        protected final void finalize() throws Throwable {
            if (this.f22000c) {
                return;
            }
            m16532b("Request on the loose");
            zzag.m16527b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    /* renamed from: a */
    public static void m16526a(String str, Object... objArr) {
        Log.d(f21995a, m16529d(str, objArr));
    }

    /* renamed from: b */
    public static void m16527b(String str, Object... objArr) {
        Log.e(f21995a, m16529d(str, objArr));
    }

    /* renamed from: c */
    public static void m16528c(String str, Object... objArr) {
        if (f21996b) {
            Log.v(f21995a, m16529d(str, objArr));
        }
    }

    /* renamed from: d */
    private static String m16529d(String str, Object... objArr) {
        String string;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i2 = 2;
        while (true) {
            if (i2 >= stackTrace.length) {
                string = "<unknown>";
                break;
            }
            if (!stackTrace[i2].getClassName().equals(f21997c)) {
                String className = stackTrace[i2].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                String strSubstring2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i2].getMethodName();
                StringBuilder sb = new StringBuilder(String.valueOf(strSubstring2).length() + 1 + String.valueOf(methodName).length());
                sb.append(strSubstring2);
                sb.append(".");
                sb.append(methodName);
                string = sb.toString();
                break;
            }
            i2++;
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), string, str);
    }

    /* renamed from: e */
    public static void m16530e(Throwable th, String str, Object... objArr) {
        Log.e(f21995a, m16529d(str, objArr), th);
    }
}
