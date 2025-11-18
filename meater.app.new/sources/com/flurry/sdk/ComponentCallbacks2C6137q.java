package com.flurry.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.flurry.sdk.C6128p;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.flurry.sdk.q */
/* loaded from: classes2.dex */
public final class ComponentCallbacks2C6137q extends C6027d7<C6128p> implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: p */
    private static String f16269p;

    /* renamed from: q */
    public int f16270q;

    /* renamed from: r */
    private final Set<String> f16271r;

    public ComponentCallbacks2C6137q() {
        super("ApplicationLifecycleProvider");
        this.f16270q = 0;
        Application application = (Application) C6002b0.m12964a();
        if (application != null) {
            this.f16270q = application.getResources().getConfiguration().orientation;
            application.registerActivityLifecycleCallbacks(this);
            application.registerComponentCallbacks(this);
        } else {
            C6021d1.m13030c(6, "ApplicationLifecycleProvider", "Context is null when initializing.");
        }
        this.f16271r = new HashSet();
    }

    /* renamed from: x */
    private void m13262x(int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("trim_memory_level", i2);
        m13048t(new C6128p(C6128p.a.TRIM_MEMORY, bundle));
    }

    /* renamed from: y */
    private void m13263y(Activity activity, C6128p.a aVar) {
        Bundle extras;
        Bundle bundle = new Bundle();
        bundle.putString("activity_name", activity.getLocalClassName());
        if (C6128p.a.CREATED.equals(aVar)) {
            try {
                Intent intent = activity.getIntent();
                if (intent != null && (extras = intent.getExtras()) != null) {
                    bundle.putBundle("launch_options", extras);
                }
            } catch (Throwable unused) {
                C6021d1.m13030c(6, "ApplicationLifecycleProvider", "Error to get Launch Options from the Intent.");
            }
        }
        m13048t(new C6128p(aVar, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m13263y(activity, C6128p.a.CREATED);
        synchronized (this) {
            if (f16269p == null) {
                f16269p = activity.getClass().getName();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m13263y(activity, C6128p.a.DESTROYED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m13263y(activity, C6128p.a.PAUSED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m13263y(activity, C6128p.a.RESUMED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m13263y(activity, C6128p.a.SAVE_STATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f16271r.add(activity.toString());
        m13263y(activity, C6128p.a.STARTED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f16271r.remove(activity.toString());
        m13263y(activity, C6128p.a.STOPPED);
        if (this.f16271r.isEmpty()) {
            m13263y(activity, C6128p.a.APP_BACKGROUND);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        int i2 = configuration.orientation;
        if (this.f16270q != i2) {
            this.f16270q = i2;
            Bundle bundle = new Bundle();
            bundle.putInt("orientation_name", this.f16270q);
            m13048t(new C6128p(C6128p.a.APP_ORIENTATION_CHANGE, bundle));
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        m13262x(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        m13262x(i2);
    }
}
