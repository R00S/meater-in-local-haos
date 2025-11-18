package io.sentry.android.core;

import android.app.Activity;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: CurrentActivityHolder.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.u0 */
/* loaded from: classes2.dex */
public class C9348u0 {

    /* renamed from: a */
    private static final C9348u0 f36105a = new C9348u0();

    /* renamed from: b */
    private WeakReference<Activity> f36106b;

    private C9348u0() {
    }

    /* renamed from: c */
    public static C9348u0 m30427c() {
        return f36105a;
    }

    /* renamed from: a */
    public void m30428a() {
        this.f36106b = null;
    }

    /* renamed from: b */
    public Activity m30429b() {
        WeakReference<Activity> weakReference = this.f36106b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: d */
    public void m30430d(Activity activity) {
        WeakReference<Activity> weakReference = this.f36106b;
        if (weakReference == null || weakReference.get() != activity) {
            this.f36106b = new WeakReference<>(activity);
        }
    }
}
