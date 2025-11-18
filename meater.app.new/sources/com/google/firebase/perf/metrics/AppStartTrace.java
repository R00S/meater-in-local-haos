package com.google.firebase.perf.metrics;

import A9.k;
import B9.e;
import B9.h;
import B9.l;
import C9.d;
import C9.m;
import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.view.AbstractC2106m;
import android.view.F;
import android.view.InterfaceC2113u;
import android.view.J;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Keep;
import com.google.firebase.f;
import com.google.firebase.n;
import com.google.firebase.perf.session.SessionManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import v9.C4925a;
import z9.C5219a;

/* loaded from: classes2.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, InterfaceC2113u {

    /* renamed from: Z, reason: collision with root package name */
    private static final l f38502Z = new B9.a().a();

    /* renamed from: a0, reason: collision with root package name */
    private static final long f38503a0 = TimeUnit.MINUTES.toMicros(1);

    /* renamed from: b0, reason: collision with root package name */
    private static volatile AppStartTrace f38504b0;

    /* renamed from: c0, reason: collision with root package name */
    private static ExecutorService f38505c0;

    /* renamed from: C, reason: collision with root package name */
    private final k f38507C;

    /* renamed from: D, reason: collision with root package name */
    private final B9.a f38508D;

    /* renamed from: E, reason: collision with root package name */
    private final com.google.firebase.perf.config.a f38509E;

    /* renamed from: F, reason: collision with root package name */
    private final m.b f38510F;

    /* renamed from: G, reason: collision with root package name */
    private Context f38511G;

    /* renamed from: H, reason: collision with root package name */
    private WeakReference<Activity> f38512H;

    /* renamed from: I, reason: collision with root package name */
    private WeakReference<Activity> f38513I;

    /* renamed from: K, reason: collision with root package name */
    private final l f38515K;

    /* renamed from: L, reason: collision with root package name */
    private final l f38516L;

    /* renamed from: U, reason: collision with root package name */
    private C5219a f38525U;

    /* renamed from: B, reason: collision with root package name */
    private boolean f38506B = false;

    /* renamed from: J, reason: collision with root package name */
    private boolean f38514J = false;

    /* renamed from: M, reason: collision with root package name */
    private l f38517M = null;

    /* renamed from: N, reason: collision with root package name */
    private l f38518N = null;

    /* renamed from: O, reason: collision with root package name */
    private l f38519O = null;

    /* renamed from: P, reason: collision with root package name */
    private l f38520P = null;

    /* renamed from: Q, reason: collision with root package name */
    private l f38521Q = null;

    /* renamed from: R, reason: collision with root package name */
    private l f38522R = null;

    /* renamed from: S, reason: collision with root package name */
    private l f38523S = null;

    /* renamed from: T, reason: collision with root package name */
    private l f38524T = null;

    /* renamed from: V, reason: collision with root package name */
    private boolean f38526V = false;

    /* renamed from: W, reason: collision with root package name */
    private int f38527W = 0;

    /* renamed from: X, reason: collision with root package name */
    private final b f38528X = new b();

    /* renamed from: Y, reason: collision with root package name */
    private boolean f38529Y = false;

    private final class b implements ViewTreeObserver.OnDrawListener {
        private b() {
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            AppStartTrace.l(AppStartTrace.this);
        }
    }

    public static class c implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        private final AppStartTrace f38531B;

        public c(AppStartTrace appStartTrace) {
            this.f38531B = appStartTrace;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f38531B.f38517M == null) {
                this.f38531B.f38526V = true;
            }
        }
    }

    AppStartTrace(k kVar, B9.a aVar, com.google.firebase.perf.config.a aVar2, ExecutorService executorService) {
        this.f38507C = kVar;
        this.f38508D = aVar;
        this.f38509E = aVar2;
        f38505c0 = executorService;
        this.f38510F = m.G0().V("_experiment_app_start_ttid");
        this.f38515K = l.f(Process.getStartElapsedRealtime());
        n nVar = (n) f.l().j(n.class);
        this.f38516L = nVar != null ? l.f(nVar.b()) : null;
    }

    static /* synthetic */ int l(AppStartTrace appStartTrace) {
        int i10 = appStartTrace.f38527W;
        appStartTrace.f38527W = i10 + 1;
        return i10;
    }

    private l m() {
        l lVar = this.f38516L;
        return lVar != null ? lVar : f38502Z;
    }

    public static AppStartTrace n() {
        return f38504b0 != null ? f38504b0 : o(k.k(), new B9.a());
    }

    @SuppressLint({"ThreadPoolCreation"})
    static AppStartTrace o(k kVar, B9.a aVar) {
        if (f38504b0 == null) {
            synchronized (AppStartTrace.class) {
                try {
                    if (f38504b0 == null) {
                        f38504b0 = new AppStartTrace(kVar, aVar, com.google.firebase.perf.config.a.g(), new ThreadPoolExecutor(0, 1, f38503a0 + 10, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                    }
                } finally {
                }
            }
        }
        return f38504b0;
    }

    private l p() {
        l lVar = this.f38515K;
        return lVar != null ? lVar : m();
    }

    public static boolean q(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = context.getPackageName();
        String str = packageName + ":";
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(str))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(m.b bVar) {
        this.f38507C.C(bVar.e(), d.FOREGROUND_BACKGROUND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        m.b bVarU = m.G0().V(B9.c.APP_START_TRACE_NAME.toString()).T(m().e()).U(m().d(this.f38519O));
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(m.G0().V(B9.c.ON_CREATE_TRACE_NAME.toString()).T(m().e()).U(m().d(this.f38517M)).e());
        if (this.f38518N != null) {
            m.b bVarG0 = m.G0();
            bVarG0.V(B9.c.ON_START_TRACE_NAME.toString()).T(this.f38517M.e()).U(this.f38517M.d(this.f38518N));
            arrayList.add(bVarG0.e());
            m.b bVarG02 = m.G0();
            bVarG02.V(B9.c.ON_RESUME_TRACE_NAME.toString()).T(this.f38518N.e()).U(this.f38518N.d(this.f38519O));
            arrayList.add(bVarG02.e());
        }
        bVarU.M(arrayList).N(this.f38525U.a());
        this.f38507C.C((m) bVarU.e(), d.FOREGROUND_BACKGROUND);
    }

    private void t(final m.b bVar) {
        if (this.f38522R == null || this.f38523S == null || this.f38524T == null) {
            return;
        }
        f38505c0.execute(new Runnable() { // from class: w9.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f51992B.r(bVar);
            }
        });
        y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        if (this.f38524T != null) {
            return;
        }
        this.f38524T = this.f38508D.a();
        this.f38510F.O(m.G0().V("_experiment_onDrawFoQ").T(p().e()).U(p().d(this.f38524T)).e());
        if (this.f38515K != null) {
            this.f38510F.O(m.G0().V("_experiment_procStart_to_classLoad").T(p().e()).U(p().d(m())).e());
        }
        this.f38510F.S("systemDeterminedForeground", this.f38529Y ? "true" : "false");
        this.f38510F.R("onDrawCount", this.f38527W);
        this.f38510F.N(this.f38525U.a());
        t(this.f38510F);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        if (this.f38522R != null) {
            return;
        }
        this.f38522R = this.f38508D.a();
        this.f38510F.T(p().e()).U(p().d(this.f38522R));
        t(this.f38510F);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        if (this.f38523S != null) {
            return;
        }
        this.f38523S = this.f38508D.a();
        this.f38510F.O(m.G0().V("_experiment_preDrawFoQ").T(p().e()).U(p().d(this.f38523S)).e());
        t(this.f38510F);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            if (!this.f38526V && this.f38517M == null) {
                this.f38529Y = this.f38529Y || q(this.f38511G);
                this.f38512H = new WeakReference<>(activity);
                this.f38517M = this.f38508D.a();
                if (p().d(this.f38517M) > f38503a0) {
                    this.f38514J = true;
                }
            }
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        View viewFindViewById;
        if (this.f38526V || this.f38514J || !this.f38509E.h() || (viewFindViewById = activity.findViewById(R.id.content)) == null) {
            return;
        }
        viewFindViewById.getViewTreeObserver().removeOnDrawListener(this.f38528X);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        View viewFindViewById;
        try {
            if (!this.f38526V && !this.f38514J) {
                boolean zH = this.f38509E.h();
                if (zH && (viewFindViewById = activity.findViewById(R.id.content)) != null) {
                    viewFindViewById.getViewTreeObserver().addOnDrawListener(this.f38528X);
                    e.c(viewFindViewById, new Runnable() { // from class: w9.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f51988B.u();
                        }
                    });
                    h.a(viewFindViewById, new Runnable() { // from class: w9.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f51989B.v();
                        }
                    }, new Runnable() { // from class: w9.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f51990B.w();
                        }
                    });
                }
                if (this.f38519O != null) {
                    return;
                }
                this.f38513I = new WeakReference<>(activity);
                this.f38519O = this.f38508D.a();
                this.f38525U = SessionManager.getInstance().perfSession();
                C4925a.e().a("onResume(): " + activity.getClass().getName() + ": " + m().d(this.f38519O) + " microseconds");
                f38505c0.execute(new Runnable() { // from class: w9.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f51991B.s();
                    }
                });
                if (!zH) {
                    y();
                }
            }
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (!this.f38526V && this.f38518N == null && !this.f38514J) {
            this.f38518N = this.f38508D.a();
        }
    }

    @F(AbstractC2106m.a.ON_STOP)
    @Keep
    public void onAppEnteredBackground() {
        if (this.f38526V || this.f38514J || this.f38521Q != null) {
            return;
        }
        this.f38521Q = this.f38508D.a();
        this.f38510F.O(m.G0().V("_experiment_firstBackgrounding").T(p().e()).U(p().d(this.f38521Q)).e());
    }

    @F(AbstractC2106m.a.ON_START)
    @Keep
    public void onAppEnteredForeground() {
        if (this.f38526V || this.f38514J || this.f38520P != null) {
            return;
        }
        this.f38520P = this.f38508D.a();
        this.f38510F.O(m.G0().V("_experiment_firstForegrounding").T(p().e()).U(p().d(this.f38520P)).e());
    }

    public synchronized void x(Context context) {
        try {
            if (this.f38506B) {
                return;
            }
            J.m().getLifecycle().a(this);
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
                this.f38529Y = this.f38529Y || q(applicationContext);
                this.f38506B = true;
                this.f38511G = applicationContext;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void y() {
        if (this.f38506B) {
            J.m().getLifecycle().d(this);
            ((Application) this.f38511G).unregisterActivityLifecycleCallbacks(this);
            this.f38506B = false;
        }
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
