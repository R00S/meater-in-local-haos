package com.google.firebase.perf.session.gauges;

import B9.o;
import android.app.ActivityManager;
import android.content.Context;
import v9.C4925a;

/* compiled from: GaugeMetadataManager.java */
/* loaded from: classes2.dex */
class i {

    /* renamed from: e, reason: collision with root package name */
    private static final C4925a f38582e = C4925a.e();

    /* renamed from: a, reason: collision with root package name */
    private final Runtime f38583a;

    /* renamed from: b, reason: collision with root package name */
    private final ActivityManager f38584b;

    /* renamed from: c, reason: collision with root package name */
    private final ActivityManager.MemoryInfo f38585c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f38586d;

    i(Context context) {
        this(Runtime.getRuntime(), context);
    }

    public int a() {
        return o.c(B9.k.f1946G.j(this.f38585c.totalMem));
    }

    public int b() {
        return o.c(B9.k.f1946G.j(this.f38583a.maxMemory()));
    }

    public int c() {
        return o.c(B9.k.f1944E.j(this.f38584b.getMemoryClass()));
    }

    i(Runtime runtime, Context context) {
        this.f38583a = runtime;
        this.f38586d = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f38584b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f38585c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
