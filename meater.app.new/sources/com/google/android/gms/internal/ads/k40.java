package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes2.dex */
final class k40 implements zzun {

    /* renamed from: a */
    private final /* synthetic */ Activity f19520a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f19521b;

    k40(e40 e40Var, Activity activity, Bundle bundle) {
        this.f19520a = activity;
        this.f19521b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    /* renamed from: a */
    public final void mo15136a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f19520a, this.f19521b);
    }
}
