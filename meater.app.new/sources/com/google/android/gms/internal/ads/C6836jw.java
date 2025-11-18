package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.jw */
/* loaded from: classes2.dex */
final class C6836jw implements zzdu {

    /* renamed from: a */
    private final /* synthetic */ Activity f19504a;

    C6836jw(C7166st c7166st, Activity activity) {
        this.f19504a = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzdu
    /* renamed from: a */
    public final void mo15113a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f19504a);
    }
}
