package com.google.firebase.perf.application;

import A9.k;
import B9.g;
import B9.j;
import B9.l;
import C9.m;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.o;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import v9.C4925a;
import w9.f;

/* compiled from: AppStateMonitor.java */
/* loaded from: classes2.dex */
public class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: S, reason: collision with root package name */
    private static final C4925a f38438S = C4925a.e();

    /* renamed from: T, reason: collision with root package name */
    private static volatile a f38439T;

    /* renamed from: B, reason: collision with root package name */
    private final WeakHashMap<Activity, Boolean> f38440B;

    /* renamed from: C, reason: collision with root package name */
    private final WeakHashMap<Activity, d> f38441C;

    /* renamed from: D, reason: collision with root package name */
    private final WeakHashMap<Activity, c> f38442D;

    /* renamed from: E, reason: collision with root package name */
    private final WeakHashMap<Activity, Trace> f38443E;

    /* renamed from: F, reason: collision with root package name */
    private final Map<String, Long> f38444F;

    /* renamed from: G, reason: collision with root package name */
    private final Set<WeakReference<b>> f38445G;

    /* renamed from: H, reason: collision with root package name */
    private Set<InterfaceC0490a> f38446H;

    /* renamed from: I, reason: collision with root package name */
    private final AtomicInteger f38447I;

    /* renamed from: J, reason: collision with root package name */
    private final k f38448J;

    /* renamed from: K, reason: collision with root package name */
    private final com.google.firebase.perf.config.a f38449K;

    /* renamed from: L, reason: collision with root package name */
    private final B9.a f38450L;

    /* renamed from: M, reason: collision with root package name */
    private final boolean f38451M;

    /* renamed from: N, reason: collision with root package name */
    private l f38452N;

    /* renamed from: O, reason: collision with root package name */
    private l f38453O;

    /* renamed from: P, reason: collision with root package name */
    private C9.d f38454P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f38455Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f38456R;

    /* compiled from: AppStateMonitor.java */
    /* renamed from: com.google.firebase.perf.application.a$a, reason: collision with other inner class name */
    public interface InterfaceC0490a {
        void a();
    }

    /* compiled from: AppStateMonitor.java */
    public interface b {
        void onUpdateAppState(C9.d dVar);
    }

    a(k kVar, B9.a aVar) {
        this(kVar, aVar, com.google.firebase.perf.config.a.g(), g());
    }

    public static a b() {
        if (f38439T == null) {
            synchronized (a.class) {
                try {
                    if (f38439T == null) {
                        f38439T = new a(k.k(), new B9.a());
                    }
                } finally {
                }
            }
        }
        return f38439T;
    }

    public static String c(Activity activity) {
        return "_st_" + activity.getClass().getSimpleName();
    }

    private static boolean g() {
        return d.a();
    }

    private void l() {
        synchronized (this.f38446H) {
            try {
                for (InterfaceC0490a interfaceC0490a : this.f38446H) {
                    if (interfaceC0490a != null) {
                        interfaceC0490a.a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void m(Activity activity) {
        Trace trace = this.f38443E.get(activity);
        if (trace == null) {
            return;
        }
        this.f38443E.remove(activity);
        g<f.a> gVarE = this.f38441C.get(activity).e();
        if (!gVarE.d()) {
            f38438S.k("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        } else {
            j.a(trace, gVarE.c());
            trace.stop();
        }
    }

    private void n(String str, l lVar, l lVar2) {
        if (this.f38449K.K()) {
            m.b bVarN = m.G0().V(str).T(lVar.e()).U(lVar.d(lVar2)).N(SessionManager.getInstance().perfSession().a());
            int andSet = this.f38447I.getAndSet(0);
            synchronized (this.f38444F) {
                try {
                    bVarN.P(this.f38444F);
                    if (andSet != 0) {
                        bVarN.R(B9.b.TRACE_STARTED_NOT_STOPPED.toString(), andSet);
                    }
                    this.f38444F.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f38448J.C(bVarN.e(), C9.d.FOREGROUND_BACKGROUND);
        }
    }

    private void o(Activity activity) {
        if (h() && this.f38449K.K()) {
            d dVar = new d(activity);
            this.f38441C.put(activity, dVar);
            if (activity instanceof o) {
                c cVar = new c(this.f38450L, this.f38448J, this, dVar);
                this.f38442D.put(activity, cVar);
                ((o) activity).w0().t1(cVar, true);
            }
        }
    }

    private void q(C9.d dVar) {
        this.f38454P = dVar;
        synchronized (this.f38445G) {
            try {
                Iterator<WeakReference<b>> it = this.f38445G.iterator();
                while (it.hasNext()) {
                    b bVar = it.next().get();
                    if (bVar != null) {
                        bVar.onUpdateAppState(this.f38454P);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C9.d a() {
        return this.f38454P;
    }

    public void d(String str, long j10) {
        synchronized (this.f38444F) {
            try {
                Long l10 = this.f38444F.get(str);
                if (l10 == null) {
                    this.f38444F.put(str, Long.valueOf(j10));
                } else {
                    this.f38444F.put(str, Long.valueOf(l10.longValue() + j10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(int i10) {
        this.f38447I.addAndGet(i10);
    }

    public boolean f() {
        return this.f38456R;
    }

    protected boolean h() {
        return this.f38451M;
    }

    public synchronized void i(Context context) {
        if (this.f38455Q) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            this.f38455Q = true;
        }
    }

    public void j(InterfaceC0490a interfaceC0490a) {
        synchronized (this.f38446H) {
            this.f38446H.add(interfaceC0490a);
        }
    }

    public void k(WeakReference<b> weakReference) {
        synchronized (this.f38445G) {
            this.f38445G.add(weakReference);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        o(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.f38441C.remove(activity);
        if (this.f38442D.containsKey(activity)) {
            ((o) activity).w0().P1(this.f38442D.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.f38440B.isEmpty()) {
                this.f38452N = this.f38450L.a();
                this.f38440B.put(activity, Boolean.TRUE);
                if (this.f38456R) {
                    q(C9.d.FOREGROUND);
                    l();
                    this.f38456R = false;
                } else {
                    n(B9.c.BACKGROUND_TRACE_NAME.toString(), this.f38453O, this.f38452N);
                    q(C9.d.FOREGROUND);
                }
            } else {
                this.f38440B.put(activity, Boolean.TRUE);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        try {
            if (h() && this.f38449K.K()) {
                if (!this.f38441C.containsKey(activity)) {
                    o(activity);
                }
                this.f38441C.get(activity).c();
                Trace trace = new Trace(c(activity), this.f38448J, this.f38450L, this);
                trace.start();
                this.f38443E.put(activity, trace);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
        try {
            if (h()) {
                m(activity);
            }
            if (this.f38440B.containsKey(activity)) {
                this.f38440B.remove(activity);
                if (this.f38440B.isEmpty()) {
                    this.f38453O = this.f38450L.a();
                    n(B9.c.FOREGROUND_TRACE_NAME.toString(), this.f38452N, this.f38453O);
                    q(C9.d.BACKGROUND);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void p(WeakReference<b> weakReference) {
        synchronized (this.f38445G) {
            this.f38445G.remove(weakReference);
        }
    }

    a(k kVar, B9.a aVar, com.google.firebase.perf.config.a aVar2, boolean z10) {
        this.f38440B = new WeakHashMap<>();
        this.f38441C = new WeakHashMap<>();
        this.f38442D = new WeakHashMap<>();
        this.f38443E = new WeakHashMap<>();
        this.f38444F = new HashMap();
        this.f38445G = new HashSet();
        this.f38446H = new HashSet();
        this.f38447I = new AtomicInteger(0);
        this.f38454P = C9.d.BACKGROUND;
        this.f38455Q = false;
        this.f38456R = true;
        this.f38448J = kVar;
        this.f38450L = aVar;
        this.f38449K = aVar2;
        this.f38451M = z10;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
