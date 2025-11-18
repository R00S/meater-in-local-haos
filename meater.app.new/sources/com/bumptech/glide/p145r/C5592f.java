package com.bumptech.glide.p145r;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.SystemClock;

/* compiled from: LogTime.java */
/* renamed from: com.bumptech.glide.r.f */
/* loaded from: classes.dex */
public final class C5592f {

    /* renamed from: a */
    private static final double f14037a;

    static {
        f14037a = Build.VERSION.SDK_INT >= 17 ? 1.0d / Math.pow(10.0d, 6.0d) : 1.0d;
    }

    /* renamed from: a */
    public static double m11027a(long j2) {
        double dM11028b = m11028b() - j2;
        double d2 = f14037a;
        Double.isNaN(dM11028b);
        return dM11028b * d2;
    }

    @TargetApi(17)
    /* renamed from: b */
    public static long m11028b() {
        return Build.VERSION.SDK_INT >= 17 ? SystemClock.elapsedRealtimeNanos() : SystemClock.uptimeMillis();
    }
}
