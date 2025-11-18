package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import io.sentry.AbstractC9435f4;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class SentryPerformanceProvider extends AbstractC9354x0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: g */
    private static AbstractC9435f4 f35833g = C9284h0.m30209a();

    /* renamed from: h */
    private static long f35834h = SystemClock.uptimeMillis();

    /* renamed from: i */
    private boolean f35835i = false;

    /* renamed from: j */
    private boolean f35836j = false;

    /* renamed from: k */
    private Application f35837k;

    public SentryPerformanceProvider() {
        C9340q0.m30389e().m30397i(f35834h, f35833g);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryPerformanceProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (this.f35835i) {
            return;
        }
        C9340q0.m30389e().m30398j(bundle == null);
        this.f35835i = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (!this.f35836j) {
            this.f35836j = true;
            C9340q0.m30389e().m30395g();
        }
        Application application = this.f35837k;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            return false;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        if (!(context instanceof Application)) {
            return true;
        }
        Application application = (Application) context;
        this.f35837k = application;
        application.registerActivityLifecycleCallbacks(this);
        return true;
    }
}
