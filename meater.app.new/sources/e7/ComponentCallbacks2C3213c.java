package e7;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: e7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ComponentCallbacks2C3213c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: F, reason: collision with root package name */
    private static final ComponentCallbacks2C3213c f40655F = new ComponentCallbacks2C3213c();

    /* renamed from: B, reason: collision with root package name */
    private final AtomicBoolean f40656B = new AtomicBoolean();

    /* renamed from: C, reason: collision with root package name */
    private final AtomicBoolean f40657C = new AtomicBoolean();

    /* renamed from: D, reason: collision with root package name */
    private final ArrayList f40658D = new ArrayList();

    /* renamed from: E, reason: collision with root package name */
    private boolean f40659E = false;

    /* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    /* renamed from: e7.c$a */
    public interface a {
        void a(boolean z10);
    }

    private ComponentCallbacks2C3213c() {
    }

    public static ComponentCallbacks2C3213c b() {
        return f40655F;
    }

    public static void c(Application application) {
        ComponentCallbacks2C3213c componentCallbacks2C3213c = f40655F;
        synchronized (componentCallbacks2C3213c) {
            try {
                if (!componentCallbacks2C3213c.f40659E) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C3213c);
                    application.registerComponentCallbacks(componentCallbacks2C3213c);
                    componentCallbacks2C3213c.f40659E = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void f(boolean z10) {
        synchronized (f40655F) {
            try {
                Iterator it = this.f40658D.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(z10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(a aVar) {
        synchronized (f40655F) {
            this.f40658D.add(aVar);
        }
    }

    public boolean d() {
        return this.f40656B.get();
    }

    public boolean e(boolean z10) {
        if (!this.f40657C.get()) {
            if (com.google.android.gms.common.util.o.b()) {
                return z10;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f40657C.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f40656B.set(true);
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f40657C;
        boolean zCompareAndSet = this.f40656B.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f40657C;
        boolean zCompareAndSet = this.f40656B.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f40656B.compareAndSet(false, true)) {
            this.f40657C.set(true);
            f(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
