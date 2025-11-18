package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes2.dex */
final class f40 implements zzun {

    /* renamed from: a */
    private final /* synthetic */ Activity f18860a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f18861b;

    f40(e40 e40Var, Activity activity, Bundle bundle) {
        this.f18860a = activity;
        this.f18861b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    /* renamed from: a */
    public final void mo15136a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f18860a, this.f18861b);
    }
}
