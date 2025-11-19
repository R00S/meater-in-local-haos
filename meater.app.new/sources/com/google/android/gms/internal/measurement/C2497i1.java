package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.apptionlabs.meater_app.data.Config;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import g7.C3445p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import u7.C4685a;
import v7.C4919v;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.i1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2497i1 {

    /* renamed from: j, reason: collision with root package name */
    private static volatile C2497i1 f34153j;

    /* renamed from: a, reason: collision with root package name */
    private final String f34154a;

    /* renamed from: b, reason: collision with root package name */
    protected final com.google.android.gms.common.util.e f34155b;

    /* renamed from: c, reason: collision with root package name */
    private final ExecutorService f34156c;

    /* renamed from: d, reason: collision with root package name */
    private final C4685a f34157d;

    /* renamed from: e, reason: collision with root package name */
    private final List<Pair<v7.K, c>> f34158e;

    /* renamed from: f, reason: collision with root package name */
    private int f34159f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f34160g;

    /* renamed from: h, reason: collision with root package name */
    private String f34161h;

    /* renamed from: i, reason: collision with root package name */
    private volatile P0 f34162i;

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.i1$a */
    abstract class a implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        final long f34163B;

        /* renamed from: C, reason: collision with root package name */
        final long f34164C;

        /* renamed from: D, reason: collision with root package name */
        private final boolean f34165D;

        a(C2497i1 c2497i1) {
            this(true);
        }

        abstract void a();

        @Override // java.lang.Runnable
        public void run() {
            if (C2497i1.this.f34160g) {
                b();
                return;
            }
            try {
                a();
            } catch (Exception e10) {
                C2497i1.this.q(e10, false, this.f34165D);
                b();
            }
        }

        a(boolean z10) {
            this.f34163B = C2497i1.this.f34155b.a();
            this.f34164C = C2497i1.this.f34155b.c();
            this.f34165D = z10;
        }

        protected void b() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.i1$b */
    class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C2497i1.this.l(new J1(this, bundle, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            C2497i1.this.l(new O1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            C2497i1.this.l(new K1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            C2497i1.this.l(new L1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Q0 q02 = new Q0();
            C2497i1.this.l(new M1(this, activity, q02));
            Bundle bundleG = q02.g(50L);
            if (bundleG != null) {
                bundle.putAll(bundleG);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            C2497i1.this.l(new I1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            C2497i1.this.l(new N1(this, activity));
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.i1$c */
    static class c extends Z0 {

        /* renamed from: B, reason: collision with root package name */
        private final v7.K f34168B;

        c(v7.K k10) {
            this.f34168B = k10;
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC2429a1
        public final void E0(String str, String str2, Bundle bundle, long j10) {
            this.f34168B.a(str, str2, bundle, j10);
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC2429a1
        public final int a() {
            return System.identityHashCode(this.f34168B);
        }
    }

    private C2497i1(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !H(str2, str3)) {
            this.f34154a = "FA";
        } else {
            this.f34154a = str;
        }
        this.f34155b = com.google.android.gms.common.util.h.d();
        this.f34156c = I0.a().a(new ThreadFactoryC2568r1(this), 1);
        this.f34157d = new C4685a(this);
        this.f34158e = new ArrayList();
        if (E(context) && !M()) {
            this.f34161h = null;
            this.f34160g = true;
            Log.w(this.f34154a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (H(str2, str3)) {
            this.f34161h = str2;
        } else {
            this.f34161h = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null)) {
                    Log.w(this.f34154a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f34154a, "Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics");
            }
        }
        l(new C2521l1(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f34154a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new b());
        }
    }

    private static boolean E(Context context) {
        return new C4919v(context, C4919v.a(context)).b("google_app_id") != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean H(String str, String str2) {
        return (str2 == null || str == null || M()) ? false : true;
    }

    private final boolean M() throws ClassNotFoundException {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static C2497i1 e(Context context) {
        return f(context, null, null, null, null);
    }

    public static C2497i1 f(Context context, String str, String str2, String str3, Bundle bundle) {
        C3445p.k(context);
        if (f34153j == null) {
            synchronized (C2497i1.class) {
                try {
                    if (f34153j == null) {
                        f34153j = new C2497i1(context, str, str2, str3, bundle);
                    }
                } finally {
                }
            }
        }
        return f34153j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(a aVar) {
        this.f34156c.execute(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(Exception exc, boolean z10, boolean z11) {
        this.f34160g |= z10;
        if (z10) {
            Log.w(this.f34154a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z11) {
            i(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.f34154a, "Error with data collection. Data lost.", exc);
    }

    private final void u(String str, String str2, Bundle bundle, boolean z10, boolean z11, Long l10) {
        l(new H1(this, l10, str, str2, bundle, z10, z11));
    }

    public final C4685a A() {
        return this.f34157d;
    }

    public final void B(String str) {
        l(new C2576s1(this, str));
    }

    public final void C(String str, String str2) {
        v(null, str, str2, false);
    }

    public final void D(String str, String str2, Bundle bundle) {
        u(str, str2, bundle, true, true, null);
    }

    public final void F(String str) {
        l(new C2592u1(this, str));
    }

    public final String I() {
        Q0 q02 = new Q0();
        l(new C2624y1(this, q02));
        return q02.v1(50L);
    }

    public final String J() {
        Q0 q02 = new Q0();
        l(new C2632z1(this, q02));
        return q02.v1(500L);
    }

    public final String K() {
        Q0 q02 = new Q0();
        l(new B1(this, q02));
        return q02.v1(500L);
    }

    public final String L() {
        Q0 q02 = new Q0();
        l(new C2600v1(this, q02));
        return q02.v1(500L);
    }

    public final int a(String str) {
        Q0 q02 = new Q0();
        l(new E1(this, str, q02));
        Integer num = (Integer) Q0.k(q02.g(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long b() {
        Q0 q02 = new Q0();
        l(new C2616x1(this, q02));
        Long lU1 = q02.u1(500L);
        if (lU1 != null) {
            return lU1.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.f34155b.a()).nextLong();
        int i10 = this.f34159f + 1;
        this.f34159f = i10;
        return jNextLong + i10;
    }

    protected final P0 c(Context context, boolean z10) {
        try {
            return S0.asInterface(DynamiteModule.d(context, DynamiteModule.f33544e, ModuleDescriptor.MODULE_ID).c("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e10) {
            q(e10, true, false);
            return null;
        }
    }

    public final List<Bundle> g(String str, String str2) {
        Q0 q02 = new Q0();
        l(new C2545o1(this, str, str2, q02));
        List<Bundle> list = (List) Q0.k(q02.g(Config.MC_BROADCAST_INTERVAL_WIFI), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map<String, Object> h(String str, String str2, boolean z10) {
        Q0 q02 = new Q0();
        l(new C1(this, str, str2, z10, q02));
        Bundle bundleG = q02.g(Config.MC_BROADCAST_INTERVAL_WIFI);
        if (bundleG == null || bundleG.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap(bundleG.size());
        for (String str3 : bundleG.keySet()) {
            Object obj = bundleG.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void i(int i10, String str, Object obj, Object obj2, Object obj3) {
        l(new D1(this, false, 5, str, obj, null, null));
    }

    public final void j(Activity activity, String str, String str2) {
        l(new C2561q1(this, C2481g1.f0(activity), str, str2));
    }

    public final void k(Bundle bundle) {
        l(new C2537n1(this, bundle));
    }

    public final void p(Boolean bool) {
        l(new C2553p1(this, bool));
    }

    public final void r(Runnable runnable) {
        l(new C2584t1(this, runnable));
    }

    public final void s(String str, Bundle bundle) {
        u(null, str, bundle, false, true, null);
    }

    public final void t(String str, String str2, Bundle bundle) {
        l(new C2529m1(this, str, str2, bundle));
    }

    public final void v(String str, String str2, Object obj, boolean z10) {
        l(new C2513k1(this, str, str2, obj, z10));
    }

    public final void w(v7.K k10) {
        C3445p.k(k10);
        synchronized (this.f34158e) {
            for (int i10 = 0; i10 < this.f34158e.size(); i10++) {
                try {
                    if (k10.equals(this.f34158e.get(i10).first)) {
                        Log.w(this.f34154a, "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c cVar = new c(k10);
            this.f34158e.add(new Pair<>(k10, cVar));
            if (this.f34162i != null) {
                try {
                    this.f34162i.registerOnMeasurementEventListener(cVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.f34154a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            l(new G1(this, cVar));
        }
    }

    public final void x(boolean z10) {
        l(new F1(this, z10));
    }
}
