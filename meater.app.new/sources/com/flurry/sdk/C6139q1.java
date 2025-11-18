package com.flurry.sdk;

import android.app.Activity;
import android.view.ViewTreeObserver;
import com.flurry.sdk.C6121o1;
import com.flurry.sdk.C6182v3;
import java.util.HashMap;
import java.util.Map;
import p241e.p252d.p253a.EnumC8778d;

/* renamed from: com.flurry.sdk.q1 */
/* loaded from: classes2.dex */
public final class C6139q1 {

    /* renamed from: a */
    private static C6139q1 f16277a;

    /* renamed from: b */
    private C6121o1.b f16278b;

    /* renamed from: c */
    C6103m1 f16279c;

    /* renamed from: e */
    public boolean f16281e = false;

    /* renamed from: f */
    long f16282f = 0;

    /* renamed from: g */
    long f16283g = 0;

    /* renamed from: h */
    int f16284h = 0;

    /* renamed from: i */
    boolean f16285i = false;

    /* renamed from: d */
    Map<String, C6103m1> f16280d = new HashMap();

    /* renamed from: com.flurry.sdk.q1$a */
    final class a implements C6121o1.b {

        /* renamed from: com.flurry.sdk.q1$a$a, reason: collision with other inner class name */
        final class ViewTreeObserverOnGlobalLayoutListenerC11473a implements ViewTreeObserver.OnGlobalLayoutListener {

            /* renamed from: f */
            final /* synthetic */ Activity f16287f;

            ViewTreeObserverOnGlobalLayoutListenerC11473a(Activity activity) {
                this.f16287f = activity;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C6103m1 c6103m1;
                this.f16287f.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                C6139q1 c6139q1 = C6139q1.this;
                if (!c6139q1.f16281e || (c6103m1 = c6139q1.f16279c) == null) {
                    return;
                }
                double dNanoTime = System.nanoTime() - C6139q1.this.f16282f;
                Double.isNaN(dNanoTime);
                c6103m1.f16131h = (long) (dNanoTime / 1000000.0d);
                C6021d1.m13030c(3, "ScreenTimeMonitor", "Start timed event for activity: " + C6139q1.this.f16279c.f16125b);
                C6103m1 c6103m12 = C6139q1.this.f16279c;
                if (c6103m12.f16129f) {
                    return;
                }
                C6021d1.m13030c(4, "ActivityScreenData", "Start timed activity event: " + c6103m12.f16125b);
                C5992a c5992aM12944v = C5992a.m12944v();
                String str = c6103m12.f16124a;
                C6182v3.a aVar = C6182v3.a.PERFORMANCE;
                String str2 = c6103m12.f16126c;
                if (str2 != null) {
                    c6103m12.f16128e.put("fl.previous.screen", str2);
                }
                c6103m12.f16128e.put("fl.current.screen", c6103m12.f16125b);
                c6103m12.f16128e.put("fl.resume.time", Long.toString(c6103m12.f16130g));
                c6103m12.f16128e.put("fl.layout.time", Long.toString(c6103m12.f16131h));
                Map<String, String> map = c6103m12.f16128e;
                if (C6013c2.m12991g(16)) {
                    c5992aM12944v.m12947t(str, aVar, map, true, true);
                } else {
                    EnumC8778d enumC8778d = EnumC8778d.kFlurryEventFailed;
                }
                c6103m12.f16129f = true;
            }
        }

        a() {
        }

        @Override // com.flurry.sdk.C6121o1.b
        /* renamed from: a */
        public final void mo13202a() {
            C6139q1.this.f16282f = System.nanoTime();
        }

        @Override // com.flurry.sdk.C6121o1.b
        /* renamed from: b */
        public final void mo13203b(Activity activity) {
            C6021d1.m13030c(3, "ScreenTimeMonitor", "onActivityStarted for activity: " + activity.toString());
            C6139q1 c6139q1 = C6139q1.this;
            C6103m1 c6103m1 = c6139q1.f16279c;
            c6139q1.f16279c = new C6103m1(activity.getClass().getSimpleName(), c6103m1 == null ? null : c6103m1.f16125b);
            C6139q1.this.f16280d.put(activity.toString(), C6139q1.this.f16279c);
            C6139q1 c6139q12 = C6139q1.this;
            int i2 = c6139q12.f16284h + 1;
            c6139q12.f16284h = i2;
            if (i2 == 1 && !c6139q12.f16285i) {
                C6021d1.m13030c(3, "ScreenTimeMonitor", "onForeground for activity: " + activity.toString());
                long jNanoTime = System.nanoTime();
                C6139q1 c6139q13 = C6139q1.this;
                double d2 = jNanoTime - c6139q13.f16283g;
                Double.isNaN(d2);
                long j2 = (long) (d2 / 1000000.0d);
                c6139q13.f16283g = jNanoTime;
                c6139q13.f16282f = jNanoTime;
                if (c6139q13.f16281e) {
                    C6139q1.m13267b("fl.background.time", activity.getClass().getSimpleName(), j2);
                }
            }
            activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC11473a(activity));
        }

        @Override // com.flurry.sdk.C6121o1.b
        /* renamed from: c */
        public final void mo13204c(Activity activity) {
            C6103m1 c6103m1Remove = C6139q1.this.f16280d.remove(activity.toString());
            C6139q1.this.f16285i = activity.isChangingConfigurations();
            C6139q1 c6139q1 = C6139q1.this;
            int i2 = c6139q1.f16284h - 1;
            c6139q1.f16284h = i2;
            if (i2 == 0 && !c6139q1.f16285i) {
                C6021d1.m13030c(3, "ScreenTimeMonitor", "onBackground for activity: " + activity.toString());
                long jNanoTime = System.nanoTime();
                C6139q1 c6139q12 = C6139q1.this;
                double d2 = jNanoTime - c6139q12.f16283g;
                Double.isNaN(d2);
                long j2 = (long) (d2 / 1000000.0d);
                c6139q12.f16283g = jNanoTime;
                if (c6139q12.f16281e) {
                    C6139q1.m13267b("fl.foreground.time", activity.getClass().getSimpleName(), j2);
                }
            }
            if (!C6139q1.this.f16281e || c6103m1Remove == null) {
                return;
            }
            C6021d1.m13030c(3, "ScreenTimeMonitor", "End timed event: " + c6103m1Remove.f16125b);
            if (c6103m1Remove.f16129f) {
                C6021d1.m13030c(4, "ActivityScreenData", "End timed activity event: " + c6103m1Remove.f16125b);
                C5992a c5992aM12944v = C5992a.m12944v();
                String str = c6103m1Remove.f16124a;
                C6182v3.a aVar = C6182v3.a.PERFORMANCE;
                double dNanoTime = System.nanoTime() - c6103m1Remove.f16127d;
                Double.isNaN(dNanoTime);
                c6103m1Remove.f16128e.put("fl.duration", Long.toString((long) (dNanoTime / 1000000.0d)));
                Map<String, String> map = c6103m1Remove.f16128e;
                if (C6013c2.m12991g(16)) {
                    c5992aM12944v.m12947t(str, aVar, map, true, false);
                } else {
                    EnumC8778d enumC8778d = EnumC8778d.kFlurryEventFailed;
                }
                c6103m1Remove.f16129f = false;
            }
        }

        @Override // com.flurry.sdk.C6121o1.b
        /* renamed from: d */
        public final void mo13205d(Activity activity) {
            C6103m1 c6103m1;
            C6139q1 c6139q1 = C6139q1.this;
            if (!c6139q1.f16281e || (c6103m1 = c6139q1.f16279c) == null) {
                return;
            }
            double dNanoTime = System.nanoTime() - C6139q1.this.f16282f;
            Double.isNaN(dNanoTime);
            c6103m1.f16130g = (long) (dNanoTime / 1000000.0d);
        }
    }

    private C6139q1() {
    }

    /* renamed from: a */
    public static synchronized C6139q1 m13266a() {
        if (f16277a == null) {
            f16277a = new C6139q1();
        }
        return f16277a;
    }

    /* renamed from: b */
    static /* synthetic */ void m13267b(String str, String str2, long j2) {
        HashMap map = new HashMap();
        map.put("fl.current.screen", str2);
        map.put(str, Long.toString(j2));
        C5992a.m12944v().m12946s("Flurry.ForegroundTime", C6182v3.a.PERFORMANCE, map);
    }

    /* renamed from: c */
    public final void m13268c() {
        if (this.f16278b != null) {
            return;
        }
        C6021d1.m13030c(3, "ScreenTimeMonitor", "Register Screen Time metrics.");
        long jNanoTime = System.nanoTime();
        this.f16283g = jNanoTime;
        this.f16282f = jNanoTime;
        this.f16278b = new a();
        C6121o1.m13222a().m13224c(this.f16278b);
    }
}
