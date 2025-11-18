package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.st */
/* loaded from: classes2.dex */
final class C7166st implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f */
    private final Application f20538f;

    /* renamed from: g */
    private final WeakReference<Application.ActivityLifecycleCallbacks> f20539g;

    /* renamed from: h */
    private boolean f20540h = false;

    public C7166st(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f20539g = new WeakReference<>(activityLifecycleCallbacks);
        this.f20538f = application;
    }

    /* renamed from: a */
    private final void m15852a(zzdu zzduVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f20539g.get();
            if (activityLifecycleCallbacks != null) {
                zzduVar.mo15113a(activityLifecycleCallbacks);
            } else {
                if (this.f20540h) {
                    return;
                }
                this.f20538f.unregisterActivityLifecycleCallbacks(this);
                this.f20540h = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m15852a(new C6871ku(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m15852a(new C6764hy(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m15852a(new C6836jw(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m15852a(new C7094qv(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m15852a(new C7318wx(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m15852a(new C6650ev(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m15852a(new C6763hx(this, activity));
    }
}
