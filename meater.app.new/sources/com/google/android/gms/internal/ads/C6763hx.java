package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.hx */
/* loaded from: classes2.dex */
final class C6763hx implements zzdu {

    /* renamed from: a */
    private final /* synthetic */ Activity f19250a;

    C6763hx(C7166st c7166st, Activity activity) {
        this.f19250a = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzdu
    /* renamed from: a */
    public final void mo15113a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f19250a);
    }
}
