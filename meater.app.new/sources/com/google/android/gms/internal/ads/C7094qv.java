package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.qv */
/* loaded from: classes2.dex */
final class C7094qv implements zzdu {

    /* renamed from: a */
    private final /* synthetic */ Activity f20411a;

    C7094qv(C7166st c7166st, Activity activity) {
        this.f20411a = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzdu
    /* renamed from: a */
    public final void mo15113a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f20411a);
    }
}
