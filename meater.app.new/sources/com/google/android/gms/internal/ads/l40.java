package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes2.dex */
final class l40 implements zzun {

    /* renamed from: a */
    private final /* synthetic */ Activity f19748a;

    l40(e40 e40Var, Activity activity) {
        this.f19748a = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    /* renamed from: a */
    public final void mo15136a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f19748a);
    }
}
