package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class e40 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f */
    private final Application f18728f;

    /* renamed from: g */
    private final WeakReference<Application.ActivityLifecycleCallbacks> f18729g;

    /* renamed from: h */
    private boolean f18730h = false;

    public e40(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f18729g = new WeakReference<>(activityLifecycleCallbacks);
        this.f18728f = application;
    }

    /* renamed from: a */
    private final void m15103a(zzun zzunVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f18729g.get();
            if (activityLifecycleCallbacks != null) {
                zzunVar.mo15136a(activityLifecycleCallbacks);
            } else {
                if (this.f18730h) {
                    return;
                }
                this.f18728f.unregisterActivityLifecycleCallbacks(this);
                this.f18730h = true;
            }
        } catch (Exception e2) {
            zzbad.m17347c("Error while dispatching lifecycle callback.", e2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m15103a(new f40(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m15103a(new l40(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m15103a(new i40(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m15103a(new h40(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m15103a(new k40(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m15103a(new g40(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m15103a(new j40(this, activity));
    }
}
