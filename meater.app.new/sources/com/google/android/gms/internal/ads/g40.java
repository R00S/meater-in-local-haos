package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes2.dex */
final class g40 implements zzun {

    /* renamed from: a */
    private final /* synthetic */ Activity f18945a;

    g40(e40 e40Var, Activity activity) {
        this.f18945a = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    /* renamed from: a */
    public final void mo15136a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f18945a);
    }
}
