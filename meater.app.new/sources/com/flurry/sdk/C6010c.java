package com.flurry.sdk;

import java.lang.Thread;
import java.util.Collections;
import java.util.Map;
import okhttp3.HttpUrl;

/* renamed from: com.flurry.sdk.c */
/* loaded from: classes2.dex */
public final class C6010c extends C6027d7<C6001b> implements Thread.UncaughtExceptionHandler {

    /* renamed from: p */
    public C6118n7 f15701p;

    /* renamed from: q */
    public boolean f15702q;

    public C6010c() {
        super("FlurryErrorProvider");
        this.f15701p = new C6118n7();
        this.f15702q = false;
        C6145q7 c6145q7M13275a = C6145q7.m13275a();
        synchronized (c6145q7M13275a.f16295c) {
            c6145q7M13275a.f16295c.put(this, null);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        String message;
        th.printStackTrace();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f15702q) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace == null || stackTrace.length <= 0) {
                message = th.getMessage() != null ? th.getMessage() : HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                StringBuilder sb = new StringBuilder();
                if (th.getMessage() != null) {
                    sb.append(" (");
                    sb.append(th.getMessage());
                    sb.append(")\n");
                }
                message = sb.toString();
            }
            m13048t(new C6001b(EnumC6136p7.UNCAUGHT_EXCEPTION_ID.f16268i, jCurrentTimeMillis, message, th.getClass().getName(), th, C6127o7.m13230a(), null, this.f15701p.m13211b()));
        }
    }

    /* renamed from: x */
    public final void m12979x(String str, long j2, String str2, String str3, Throwable th, Map<String, String> map, Map<String, String> map2) {
        m13048t(new C6001b(str, j2, str2, str3, th, map, map2, Collections.emptyList()));
    }
}
