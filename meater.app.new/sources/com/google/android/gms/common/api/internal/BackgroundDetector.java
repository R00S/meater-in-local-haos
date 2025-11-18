package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class BackgroundDetector implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: f */
    private static final BackgroundDetector f17304f = new BackgroundDetector();

    /* renamed from: g */
    private final AtomicBoolean f17305g = new AtomicBoolean();

    /* renamed from: h */
    private final AtomicBoolean f17306h = new AtomicBoolean();

    /* renamed from: i */
    private final ArrayList f17307i = new ArrayList();

    /* renamed from: j */
    private boolean f17308j = false;

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    @KeepForSdk
    public interface BackgroundStateChangeListener {
        @KeepForSdk
        /* renamed from: a */
        void mo13927a(boolean z);
    }

    @KeepForSdk
    private BackgroundDetector() {
    }

    @KeepForSdk
    /* renamed from: b */
    public static BackgroundDetector m13921b() {
        return f17304f;
    }

    @KeepForSdk
    /* renamed from: c */
    public static void m13922c(Application application) {
        BackgroundDetector backgroundDetector = f17304f;
        synchronized (backgroundDetector) {
            if (!backgroundDetector.f17308j) {
                application.registerActivityLifecycleCallbacks(backgroundDetector);
                application.registerComponentCallbacks(backgroundDetector);
                backgroundDetector.f17308j = true;
            }
        }
    }

    /* renamed from: f */
    private final void m13923f(boolean z) {
        synchronized (f17304f) {
            Iterator it = this.f17307i.iterator();
            while (it.hasNext()) {
                ((BackgroundStateChangeListener) it.next()).mo13927a(z);
            }
        }
    }

    @KeepForSdk
    /* renamed from: a */
    public void m13924a(BackgroundStateChangeListener backgroundStateChangeListener) {
        synchronized (f17304f) {
            this.f17307i.add(backgroundStateChangeListener);
        }
    }

    @KeepForSdk
    /* renamed from: d */
    public boolean m13925d() {
        return this.f17305g.get();
    }

    @KeepForSdk
    @TargetApi(16)
    /* renamed from: e */
    public boolean m13926e(boolean z) {
        if (!this.f17306h.get()) {
            if (!PlatformVersion.m14639c()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f17306h.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f17305g.set(true);
            }
        }
        return m13925d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.f17305g.compareAndSet(true, false);
        this.f17306h.set(true);
        if (zCompareAndSet) {
            m13923f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zCompareAndSet = this.f17305g.compareAndSet(true, false);
        this.f17306h.set(true);
        if (zCompareAndSet) {
            m13923f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        if (i2 == 20 && this.f17305g.compareAndSet(false, true)) {
            this.f17306h.set(true);
            m13923f(true);
        }
    }
}
