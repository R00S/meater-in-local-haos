package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.C9471i2;
import io.sentry.C9680x4;
import io.sentry.Integration;
import io.sentry.InterfaceC9658v1;
import io.sentry.util.C9646q;
import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class CurrentActivityIntegration implements Integration, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: f */
    private final Application f35795f;

    public CurrentActivityIntegration(Application application) {
        this.f35795f = (Application) C9646q.m31802c(application, "Application is required");
    }

    /* renamed from: b */
    private void m30118b(Activity activity) {
        if (C9348u0.m30427c().m30429b() == activity) {
            C9348u0.m30427c().m30428a();
        }
    }

    /* renamed from: e */
    private void m30119e(Activity activity) {
        C9348u0.m30427c().m30430d(activity);
    }

    @Override // io.sentry.InterfaceC9490j2
    /* renamed from: a */
    public /* synthetic */ void mo30003a() {
        C9471i2.m30845a(this);
    }

    @Override // io.sentry.Integration
    /* renamed from: c */
    public void mo30001c(InterfaceC9658v1 interfaceC9658v1, C9680x4 c9680x4) {
        this.f35795f.registerActivityLifecycleCallbacks(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f35795f.unregisterActivityLifecycleCallbacks(this);
        C9348u0.m30427c().m30428a();
    }

    @Override // io.sentry.InterfaceC9490j2
    /* renamed from: d */
    public /* synthetic */ String mo30004d() {
        return C9471i2.m30846b(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        m30119e(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        m30118b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        m30118b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        m30119e(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        m30119e(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m30118b(activity);
    }
}
