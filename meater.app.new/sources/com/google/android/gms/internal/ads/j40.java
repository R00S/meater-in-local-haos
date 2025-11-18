package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes2.dex */
final class j40 implements zzun {

    /* renamed from: a */
    private final /* synthetic */ Activity f19457a;

    j40(e40 e40Var, Activity activity) {
        this.f19457a = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    /* renamed from: a */
    public final void mo15136a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f19457a);
    }
}
