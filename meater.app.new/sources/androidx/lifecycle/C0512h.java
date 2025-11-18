package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: LifecycleDispatcher.java */
/* renamed from: androidx.lifecycle.h */
/* loaded from: classes.dex */
class C0512h {

    /* renamed from: a */
    private static AtomicBoolean f3479a = new AtomicBoolean(false);

    /* compiled from: LifecycleDispatcher.java */
    /* renamed from: androidx.lifecycle.h$a */
    static class a extends C0506d {
        a() {
        }

        @Override // androidx.lifecycle.C0506d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            FragmentC0524t.m3896g(activity);
        }

        @Override // androidx.lifecycle.C0506d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // androidx.lifecycle.C0506d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    static void m3868a(Context context) {
        if (f3479a.getAndSet(true)) {
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new a());
    }
}
