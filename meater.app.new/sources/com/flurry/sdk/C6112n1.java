package com.flurry.sdk;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.view.ViewTreeObserver;
import com.flurry.sdk.C6121o1;
import com.flurry.sdk.C6182v3;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.flurry.sdk.n1 */
/* loaded from: classes2.dex */
public final class C6112n1 {

    /* renamed from: a */
    private static C6112n1 f16156a;

    /* renamed from: b */
    private static final long f16157b = System.nanoTime();

    /* renamed from: c */
    private long f16158c;

    /* renamed from: d */
    private long f16159d;

    /* renamed from: e */
    private long f16160e;

    /* renamed from: g */
    private C6121o1.b f16162g;

    /* renamed from: h */
    public boolean f16163h = false;

    /* renamed from: i */
    public boolean f16164i = false;

    /* renamed from: j */
    public boolean f16165j = false;

    /* renamed from: f */
    private Map<String, String> f16161f = new HashMap();

    /* renamed from: com.flurry.sdk.n1$a */
    final class a implements C6121o1.b {

        /* renamed from: com.flurry.sdk.n1$a$a, reason: collision with other inner class name */
        final class ViewTreeObserverOnGlobalLayoutListenerC11470a implements ViewTreeObserver.OnGlobalLayoutListener {

            /* renamed from: f */
            final /* synthetic */ Activity f16167f;

            ViewTreeObserverOnGlobalLayoutListenerC11470a(Activity activity) {
                this.f16167f = activity;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f16167f.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                C6112n1 c6112n1 = C6112n1.this;
                this.f16167f.getApplication();
                C6112n1.m13194d(c6112n1);
                C6112n1.this.m13200c(this.f16167f, "onGlobalLayout", "fl.layout.time", "fl.layout.runtime.memory", "fl.layout.system.memory");
                C6112n1.m13196g(C6112n1.this);
                if (C6112n1.this.f16163h) {
                    C6112n1.this.m13201f();
                }
            }
        }

        a() {
        }

        @Override // com.flurry.sdk.C6121o1.b
        /* renamed from: a */
        public final void mo13202a() {
        }

        @Override // com.flurry.sdk.C6121o1.b
        /* renamed from: b */
        public final void mo13203b(Activity activity) {
            activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC11470a(activity));
        }

        @Override // com.flurry.sdk.C6121o1.b
        /* renamed from: c */
        public final void mo13204c(Activity activity) {
        }

        @Override // com.flurry.sdk.C6121o1.b
        /* renamed from: d */
        public final void mo13205d(Activity activity) {
            C6112n1.this.m13200c(activity, "onActivityResumed", "fl.resume.time", "fl.resume.runtime.memory", "fl.resume.system.memory");
        }
    }

    private C6112n1() {
    }

    /* renamed from: a */
    public static synchronized C6112n1 m13193a() {
        if (f16156a == null) {
            f16156a = new C6112n1();
        }
        return f16156a;
    }

    /* renamed from: d */
    static /* synthetic */ void m13194d(C6112n1 c6112n1) {
        if (c6112n1.f16162g != null) {
            C6121o1 c6121o1M13222a = C6121o1.m13222a();
            C6121o1.b bVar = c6112n1.f16162g;
            synchronized (c6121o1M13222a.f16203c) {
                c6121o1M13222a.f16203c.remove(bVar);
            }
            c6112n1.f16162g = null;
        }
    }

    /* renamed from: g */
    static /* synthetic */ boolean m13196g(C6112n1 c6112n1) {
        c6112n1.f16164i = true;
        return true;
    }

    /* renamed from: b */
    public final void m13199b(Context context, Cursor cursor) {
        if (this.f16162g != null) {
            return;
        }
        if (cursor != null) {
            cursor.moveToFirst();
            this.f16158c = cursor.getLong(0);
            this.f16159d = cursor.getLong(1);
            this.f16160e = cursor.getLong(2);
            cursor.close();
        } else {
            Runtime runtime = Runtime.getRuntime();
            ActivityManager.MemoryInfo memoryInfoM13251a = C6130p1.m13251a(context);
            this.f16158c = f16157b;
            this.f16159d = runtime.totalMemory() - runtime.freeMemory();
            this.f16160e = memoryInfoM13251a.totalMem - memoryInfoM13251a.availMem;
        }
        StringBuilder sb = new StringBuilder("Registered with Content Provider: ");
        sb.append(cursor != null);
        sb.append(", start time: ");
        sb.append(this.f16158c);
        sb.append(", runtime memory: ");
        sb.append(this.f16159d);
        sb.append(", system memory: ");
        sb.append(this.f16160e);
        C6021d1.m13030c(3, "ColdStartMonitor", sb.toString());
        this.f16162g = new a();
        C6121o1.m13222a().m13224c(this.f16162g);
    }

    /* renamed from: c */
    public final void m13200c(Context context, String str, String str2, String str3, String str4) {
        double dNanoTime = System.nanoTime() - this.f16158c;
        Double.isNaN(dNanoTime);
        long j2 = (long) (dNanoTime / 1000000.0d);
        Runtime runtime = Runtime.getRuntime();
        long jFreeMemory = runtime.totalMemory() - runtime.freeMemory();
        long j3 = jFreeMemory - this.f16159d;
        if (j3 < 0) {
            j3 = 0;
        }
        ActivityManager.MemoryInfo memoryInfoM13251a = C6130p1.m13251a(context);
        long j4 = memoryInfoM13251a.totalMem - memoryInfoM13251a.availMem;
        long j5 = j4 - this.f16160e;
        long j6 = j5 >= 0 ? j5 : 0L;
        C6021d1.m13030c(3, "ColdStartMonitor", str + " time: " + j2 + ", runtime memory usage: " + jFreeMemory + ", system memory usage: " + j4);
        this.f16161f.put(str2, Long.toString(j2));
        this.f16161f.put(str3, Long.toString(j3));
        this.f16161f.put(str4, Long.toString(j6));
    }

    /* renamed from: f */
    public final synchronized void m13201f() {
        if (this.f16161f.isEmpty()) {
            return;
        }
        C6021d1.m13030c(4, "ColdStartMonitor", "Log Cold Start time event: " + this.f16161f);
        C5992a.m12944v().m12946s("Flurry.ColdStartTime", C6182v3.a.PERFORMANCE, this.f16161f);
        this.f16161f.clear();
    }
}
