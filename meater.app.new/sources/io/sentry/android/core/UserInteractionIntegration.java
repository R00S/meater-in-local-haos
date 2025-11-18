package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import io.sentry.C9471i2;
import io.sentry.C9680x4;
import io.sentry.EnumC9587s4;
import io.sentry.Integration;
import io.sentry.InterfaceC9658v1;
import io.sentry.InterfaceC9670w1;
import io.sentry.android.core.internal.gestures.C9296h;
import io.sentry.android.core.internal.gestures.GestureDetectorOnGestureListenerC9295g;
import io.sentry.android.core.internal.gestures.WindowCallbackC9294f;
import io.sentry.util.C9646q;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class UserInteractionIntegration implements Integration, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: f */
    private final Application f35848f;

    /* renamed from: g */
    private InterfaceC9658v1 f35849g;

    /* renamed from: h */
    private SentryAndroidOptions f35850h;

    /* renamed from: i */
    private final boolean f35851i;

    public UserInteractionIntegration(Application application, C9265b1 c9265b1) {
        this.f35848f = (Application) C9646q.m31802c(application, "Application is required");
        this.f35851i = c9265b1.m30152b("androidx.core.view.GestureDetectorCompat", this.f35850h);
    }

    /* renamed from: b */
    private void m30140b(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f35850h;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo30214c(EnumC9587s4.INFO, "Window was null in startTracking", new Object[0]);
                return;
            }
            return;
        }
        if (this.f35849g == null || this.f35850h == null) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback == null) {
            callback = new WindowCallbackC9294f();
        }
        window.setCallback(new C9296h(callback, activity, new GestureDetectorOnGestureListenerC9295g(activity, this.f35849g, this.f35850h), this.f35850h));
    }

    /* renamed from: e */
    private void m30141e(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f35850h;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo30214c(EnumC9587s4.INFO, "Window was null in stopTracking", new Object[0]);
                return;
            }
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof C9296h) {
            C9296h c9296h = (C9296h) callback;
            c9296h.m30253c();
            if (c9296h.m30252a() instanceof WindowCallbackC9294f) {
                window.setCallback(null);
            } else {
                window.setCallback(c9296h.m30252a());
            }
        }
    }

    @Override // io.sentry.InterfaceC9490j2
    /* renamed from: a */
    public /* synthetic */ void mo30003a() {
        C9471i2.m30845a(this);
    }

    @Override // io.sentry.Integration
    /* renamed from: c */
    public void mo30001c(InterfaceC9658v1 interfaceC9658v1, C9680x4 c9680x4) {
        this.f35850h = (SentryAndroidOptions) C9646q.m31802c(c9680x4 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c9680x4 : null, "SentryAndroidOptions is required");
        this.f35849g = (InterfaceC9658v1) C9646q.m31802c(interfaceC9658v1, "Hub is required");
        boolean z = this.f35850h.isEnableUserInteractionBreadcrumbs() || this.f35850h.isEnableUserInteractionTracing();
        InterfaceC9670w1 logger = this.f35850h.getLogger();
        EnumC9587s4 enumC9587s4 = EnumC9587s4.DEBUG;
        logger.mo30214c(enumC9587s4, "UserInteractionIntegration enabled: %s", Boolean.valueOf(z));
        if (z) {
            if (!this.f35851i) {
                c9680x4.getLogger().mo30214c(EnumC9587s4.INFO, "androidx.core is not available, UserInteractionIntegration won't be installed", new Object[0]);
                return;
            }
            this.f35848f.registerActivityLifecycleCallbacks(this);
            this.f35850h.getLogger().mo30214c(enumC9587s4, "UserInteractionIntegration installed.", new Object[0]);
            mo30003a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f35848f.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f35850h;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo30214c(EnumC9587s4.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC9490j2
    /* renamed from: d */
    public /* synthetic */ String mo30004d() {
        return C9471i2.m30846b(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        m30141e(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        m30140b(activity);
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
}
