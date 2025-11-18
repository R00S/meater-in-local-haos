package com.google.firebase.installations.p198r;

import com.google.firebase.installations.C8391o;
import java.util.concurrent.TimeUnit;

/* compiled from: RequestLimiter.java */
/* renamed from: com.google.firebase.installations.r.e */
/* loaded from: classes2.dex */
class C8401e {

    /* renamed from: a */
    private static final long f31869a = TimeUnit.HOURS.toMillis(24);

    /* renamed from: b */
    private static final long f31870b = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: c */
    private final C8391o f31871c = C8391o.m26290c();

    /* renamed from: d */
    private long f31872d;

    /* renamed from: e */
    private int f31873e;

    C8401e() {
    }

    /* renamed from: a */
    private synchronized long m26378a(int i2) {
        if (!m26379c(i2)) {
            return f31869a;
        }
        double dPow = Math.pow(2.0d, this.f31873e);
        double dM26296e = this.f31871c.m26296e();
        Double.isNaN(dM26296e);
        return (long) Math.min(dPow + dM26296e, f31870b);
    }

    /* renamed from: c */
    private static boolean m26379c(int i2) {
        return i2 == 429 || (i2 >= 500 && i2 < 600);
    }

    /* renamed from: d */
    private static boolean m26380d(int i2) {
        return (i2 >= 200 && i2 < 300) || i2 == 401 || i2 == 404;
    }

    /* renamed from: e */
    private synchronized void m26381e() {
        this.f31873e = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean m26382b() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f31873e     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L14
            com.google.firebase.installations.o r0 = r5.f31871c     // Catch: java.lang.Throwable -> L17
            long r0 = r0.m26294a()     // Catch: java.lang.Throwable -> L17
            long r2 = r5.f31872d     // Catch: java.lang.Throwable -> L17
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L12
            goto L14
        L12:
            r0 = 0
            goto L15
        L14:
            r0 = 1
        L15:
            monitor-exit(r5)
            return r0
        L17:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.p198r.C8401e.m26382b():boolean");
    }

    /* renamed from: f */
    public synchronized void m26383f(int i2) {
        if (m26380d(i2)) {
            m26381e();
            return;
        }
        this.f31873e++;
        this.f31872d = this.f31871c.m26294a() + m26378a(i2);
    }
}
