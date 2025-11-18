package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.hy */
/* loaded from: classes2.dex */
final class C6764hy implements zzdu {

    /* renamed from: a */
    private final /* synthetic */ Activity f19251a;

    C6764hy(C7166st c7166st, Activity activity) {
        this.f19251a = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzdu
    /* renamed from: a */
    public final void mo15113a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f19251a);
    }
}
