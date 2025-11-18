package com.facebook.p157o0.p165q0;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.C5641a0;
import com.facebook.EnumC5659g0;
import com.facebook.internal.C5666a0;
import com.facebook.internal.C5670c0;
import com.facebook.internal.C5672d0;
import com.facebook.internal.C5684j0;
import com.facebook.internal.C5696p0;
import com.facebook.p157o0.C5813a0;
import com.facebook.p157o0.p158k0.C5835c;
import com.facebook.p157o0.p160m0.C5864i;
import com.facebook.p157o0.p163o0.C5888k;
import com.facebook.p157o0.p169u0.C5938h;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C10775u;
import kotlin.jvm.internal.C9801m;

/* compiled from: ActivityLifecycleTracker.kt */
/* renamed from: com.facebook.o0.q0.f */
/* loaded from: classes2.dex */
public final class C5901f {

    /* renamed from: a */
    public static final C5901f f15358a = new C5901f();

    /* renamed from: b */
    private static final String f15359b;

    /* renamed from: c */
    private static final ScheduledExecutorService f15360c;

    /* renamed from: d */
    private static volatile ScheduledFuture<?> f15361d;

    /* renamed from: e */
    private static final Object f15362e;

    /* renamed from: f */
    private static final AtomicInteger f15363f;

    /* renamed from: g */
    private static volatile C5908m f15364g;

    /* renamed from: h */
    private static final AtomicBoolean f15365h;

    /* renamed from: i */
    private static String f15366i;

    /* renamed from: j */
    private static long f15367j;

    /* renamed from: k */
    private static int f15368k;

    /* renamed from: l */
    private static WeakReference<Activity> f15369l;

    /* compiled from: ActivityLifecycleTracker.kt */
    /* renamed from: com.facebook.o0.q0.f$a */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C9801m.m32346f(activity, "activity");
            C5684j0.f14429a.m11454b(EnumC5659g0.APP_EVENTS, C5901f.f15359b, "onActivityCreated");
            C5902g c5902g = C5902g.f15370a;
            C5902g.m12624a();
            C5901f c5901f = C5901f.f15358a;
            C5901f.m12614p(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            C9801m.m32346f(activity, "activity");
            C5684j0.f14429a.m11454b(EnumC5659g0.APP_EVENTS, C5901f.f15359b, "onActivityDestroyed");
            C5901f.f15358a.m12616r(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            C9801m.m32346f(activity, "activity");
            C5684j0.f14429a.m11454b(EnumC5659g0.APP_EVENTS, C5901f.f15359b, "onActivityPaused");
            C5902g c5902g = C5902g.f15370a;
            C5902g.m12624a();
            C5901f.f15358a.m12617s(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            C9801m.m32346f(activity, "activity");
            C5684j0.f14429a.m11454b(EnumC5659g0.APP_EVENTS, C5901f.f15359b, "onActivityResumed");
            C5902g c5902g = C5902g.f15370a;
            C5902g.m12624a();
            C5901f c5901f = C5901f.f15358a;
            C5901f.m12620v(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C9801m.m32346f(activity, "activity");
            C9801m.m32346f(bundle, "outState");
            C5684j0.f14429a.m11454b(EnumC5659g0.APP_EVENTS, C5901f.f15359b, "onActivitySaveInstanceState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            C9801m.m32346f(activity, "activity");
            C5901f c5901f = C5901f.f15358a;
            C5901f.f15368k++;
            C5684j0.f14429a.m11454b(EnumC5659g0.APP_EVENTS, C5901f.f15359b, "onActivityStarted");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            C9801m.m32346f(activity, "activity");
            C5684j0.f14429a.m11454b(EnumC5659g0.APP_EVENTS, C5901f.f15359b, "onActivityStopped");
            C5813a0.f14908a.m12174h();
            C5901f c5901f = C5901f.f15358a;
            C5901f.f15368k--;
        }
    }

    static {
        String canonicalName = C5901f.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        f15359b = canonicalName;
        f15360c = Executors.newSingleThreadScheduledExecutor();
        f15362e = new Object();
        f15363f = new AtomicInteger(0);
        f15365h = new AtomicBoolean(false);
    }

    private C5901f() {
    }

    /* renamed from: f */
    private final void m12604f() {
        ScheduledFuture<?> scheduledFuture;
        synchronized (f15362e) {
            if (f15361d != null && (scheduledFuture = f15361d) != null) {
                scheduledFuture.cancel(false);
            }
            f15361d = null;
            C10775u c10775u = C10775u.f41439a;
        }
    }

    /* renamed from: g */
    public static final Activity m12605g() {
        WeakReference<Activity> weakReference = f15369l;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: h */
    public static final UUID m12606h() {
        C5908m c5908m;
        if (f15364g == null || (c5908m = f15364g) == null) {
            return null;
        }
        return c5908m.m12653d();
    }

    /* renamed from: i */
    private final int m12607i() {
        C5672d0 c5672d0 = C5672d0.f14392a;
        C5641a0 c5641a0 = C5641a0.f14199a;
        C5670c0 c5670c0M11417c = C5672d0.m11417c(C5641a0.m11285d());
        if (c5670c0M11417c != null) {
            return c5670c0M11417c.m11407k();
        }
        C5905j c5905j = C5905j.f15382a;
        return C5905j.m12642a();
    }

    /* renamed from: j */
    public static final boolean m12608j() {
        return f15368k == 0;
    }

    /* renamed from: p */
    public static final void m12614p(Activity activity) {
        f15360c.execute(new Runnable() { // from class: com.facebook.o0.q0.c
            @Override // java.lang.Runnable
            public final void run() {
                C5901f.m12615q();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m12615q() {
        if (f15364g == null) {
            f15364g = C5908m.f15393a.m12664b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final void m12616r(Activity activity) {
        C5864i c5864i = C5864i.f15174a;
        C5864i.m12388j(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public final void m12617s(Activity activity) {
        AtomicInteger atomicInteger = f15363f;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
            Log.w(f15359b, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        m12604f();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C5696p0 c5696p0 = C5696p0.f14478a;
        final String strM11590r = C5696p0.m11590r(activity);
        C5864i c5864i = C5864i.f15174a;
        C5864i.m12389k(activity);
        f15360c.execute(new Runnable() { // from class: com.facebook.o0.q0.a
            @Override // java.lang.Runnable
            public final void run() {
                C5901f.m12618t(jCurrentTimeMillis, strM11590r);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m12618t(final long j2, final String str) {
        C9801m.m32346f(str, "$activityName");
        if (f15364g == null) {
            f15364g = new C5908m(Long.valueOf(j2), null, null, 4, null);
        }
        C5908m c5908m = f15364g;
        if (c5908m != null) {
            c5908m.m12660k(Long.valueOf(j2));
        }
        if (f15363f.get() <= 0) {
            Runnable runnable = new Runnable() { // from class: com.facebook.o0.q0.e
                @Override // java.lang.Runnable
                public final void run() {
                    C5901f.m12619u(j2, str);
                }
            };
            synchronized (f15362e) {
                f15361d = f15360c.schedule(runnable, f15358a.m12607i(), TimeUnit.SECONDS);
                C10775u c10775u = C10775u.f41439a;
            }
        }
        long j3 = f15367j;
        long j4 = j3 > 0 ? (j2 - j3) / 1000 : 0L;
        C5904i c5904i = C5904i.f15376a;
        C5904i.m12637e(str, j4);
        C5908m c5908m2 = f15364g;
        if (c5908m2 == null) {
            return;
        }
        c5908m2.m12662m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static final void m12619u(long j2, String str) {
        C9801m.m32346f(str, "$activityName");
        if (f15364g == null) {
            f15364g = new C5908m(Long.valueOf(j2), null, null, 4, null);
        }
        if (f15363f.get() <= 0) {
            C5909n c5909n = C5909n.f15400a;
            C5909n.m12669e(str, f15364g, f15366i);
            C5908m.f15393a.m12663a();
            f15364g = null;
        }
        synchronized (f15362e) {
            f15361d = null;
            C10775u c10775u = C10775u.f41439a;
        }
    }

    /* renamed from: v */
    public static final void m12620v(Activity activity) {
        C9801m.m32346f(activity, "activity");
        C5901f c5901f = f15358a;
        f15369l = new WeakReference<>(activity);
        f15363f.incrementAndGet();
        c5901f.m12604f();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        f15367j = jCurrentTimeMillis;
        C5696p0 c5696p0 = C5696p0.f14478a;
        final String strM11590r = C5696p0.m11590r(activity);
        C5864i c5864i = C5864i.f15174a;
        C5864i.m12390l(activity);
        C5835c c5835c = C5835c.f14978a;
        C5835c.m12274d(activity);
        C5938h c5938h = C5938h.f15513a;
        C5938h.m12807h(activity);
        C5888k c5888k = C5888k.f15323a;
        C5888k.m12565b();
        final Context applicationContext = activity.getApplicationContext();
        f15360c.execute(new Runnable() { // from class: com.facebook.o0.q0.b
            @Override // java.lang.Runnable
            public final void run() {
                C5901f.m12621w(jCurrentTimeMillis, strM11590r, applicationContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final void m12621w(long j2, String str, Context context) {
        C5908m c5908m;
        C9801m.m32346f(str, "$activityName");
        C5908m c5908m2 = f15364g;
        Long lM12654e = c5908m2 == null ? null : c5908m2.m12654e();
        if (f15364g == null) {
            f15364g = new C5908m(Long.valueOf(j2), null, null, 4, null);
            C5909n c5909n = C5909n.f15400a;
            String str2 = f15366i;
            C9801m.m32345e(context, "appContext");
            C5909n.m12667c(str, null, str2, context);
        } else if (lM12654e != null) {
            long jLongValue = j2 - lM12654e.longValue();
            if (jLongValue > f15358a.m12607i() * 1000) {
                C5909n c5909n2 = C5909n.f15400a;
                C5909n.m12669e(str, f15364g, f15366i);
                String str3 = f15366i;
                C9801m.m32345e(context, "appContext");
                C5909n.m12667c(str, null, str3, context);
                f15364g = new C5908m(Long.valueOf(j2), null, null, 4, null);
            } else if (jLongValue > 1000 && (c5908m = f15364g) != null) {
                c5908m.m12657h();
            }
        }
        C5908m c5908m3 = f15364g;
        if (c5908m3 != null) {
            c5908m3.m12660k(Long.valueOf(j2));
        }
        C5908m c5908m4 = f15364g;
        if (c5908m4 == null) {
            return;
        }
        c5908m4.m12662m();
    }

    /* renamed from: x */
    public static final void m12622x(Application application, String str) {
        C9801m.m32346f(application, "application");
        if (f15365h.compareAndSet(false, true)) {
            C5666a0 c5666a0 = C5666a0.f14313a;
            C5666a0.m11372a(C5666a0.b.CodelessEvents, new C5666a0.a() { // from class: com.facebook.o0.q0.d
                @Override // com.facebook.internal.C5666a0.a
                /* renamed from: a */
                public final void mo11347a(boolean z) {
                    C5901f.m12623y(z);
                }
            });
            f15366i = str;
            application.registerActivityLifecycleCallbacks(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static final void m12623y(boolean z) {
        if (z) {
            C5864i c5864i = C5864i.f15174a;
            C5864i.m12382d();
        } else {
            C5864i c5864i2 = C5864i.f15174a;
            C5864i.m12381c();
        }
    }
}
