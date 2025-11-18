package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.ads.internal.zzk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;

@TargetApi(14)
/* loaded from: classes2.dex */
final class m40 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f */
    private Activity f19872f;

    /* renamed from: g */
    private Context f19873g;

    /* renamed from: m */
    private Runnable f19879m;

    /* renamed from: o */
    private long f19881o;

    /* renamed from: h */
    private final Object f19874h = new Object();

    /* renamed from: i */
    private boolean f19875i = true;

    /* renamed from: j */
    private boolean f19876j = false;

    /* renamed from: k */
    private final List<zzut> f19877k = new ArrayList();

    /* renamed from: l */
    private final List<zzvg> f19878l = new ArrayList();

    /* renamed from: n */
    private boolean f19880n = false;

    m40() {
    }

    /* renamed from: c */
    private final void m15530c(Activity activity) {
        synchronized (this.f19874h) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.f19872f = activity;
            }
        }
    }

    /* renamed from: g */
    static /* synthetic */ boolean m15532g(m40 m40Var, boolean z) {
        m40Var.f19875i = false;
        return false;
    }

    /* renamed from: a */
    public final Activity m15536a() {
        return this.f19872f;
    }

    /* renamed from: b */
    public final Context m15537b() {
        return this.f19873g;
    }

    /* renamed from: e */
    public final void m15538e(Application application, Context context) {
        if (this.f19880n) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            m15530c((Activity) context);
        }
        this.f19873g = application;
        this.f19881o = ((Long) zzyt.m20848e().m16421c(zzacu.f21778e1)).longValue();
        this.f19880n = true;
    }

    /* renamed from: f */
    public final void m15539f(zzut zzutVar) {
        synchronized (this.f19874h) {
            this.f19877k.add(zzutVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f19874h) {
            Activity activity2 = this.f19872f;
            if (activity2 == null) {
                return;
            }
            if (activity2.equals(activity)) {
                this.f19872f = null;
            }
            Iterator<zzvg> it = this.f19878l.iterator();
            while (it.hasNext()) {
                try {
                    if (it.next().m20655a(activity)) {
                        it.remove();
                    }
                } catch (Exception e2) {
                    zzk.zzlk().m17052e(e2, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                    zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m15530c(activity);
        synchronized (this.f19874h) {
            Iterator<zzvg> it = this.f19878l.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onActivityPaused(activity);
                } catch (Exception e2) {
                    zzk.zzlk().m17052e(e2, "AppActivityTracker.ActivityListener.onActivityPaused");
                    zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
                }
            }
        }
        this.f19876j = true;
        Runnable runnable = this.f19879m;
        if (runnable != null) {
            zzaxi.f22654a.removeCallbacks(runnable);
        }
        Handler handler = zzaxi.f22654a;
        n40 n40Var = new n40(this);
        this.f19879m = n40Var;
        handler.postDelayed(n40Var, this.f19881o);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m15530c(activity);
        this.f19876j = false;
        boolean z = !this.f19875i;
        this.f19875i = true;
        Runnable runnable = this.f19879m;
        if (runnable != null) {
            zzaxi.f22654a.removeCallbacks(runnable);
        }
        synchronized (this.f19874h) {
            Iterator<zzvg> it = this.f19878l.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onActivityResumed(activity);
                } catch (Exception e2) {
                    zzk.zzlk().m17052e(e2, "AppActivityTracker.ActivityListener.onActivityResumed");
                    zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
                }
            }
            if (z) {
                Iterator<zzut> it2 = this.f19877k.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().mo15953a(true);
                    } catch (Exception e3) {
                        zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e3);
                    }
                }
            } else {
                zzbad.m17349e("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m15530c(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
