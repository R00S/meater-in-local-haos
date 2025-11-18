package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.wx */
/* loaded from: classes2.dex */
final class C7318wx implements zzdu {

    /* renamed from: a */
    private final /* synthetic */ Activity f20877a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f20878b;

    C7318wx(C7166st c7166st, Activity activity, Bundle bundle) {
        this.f20877a = activity;
        this.f20878b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzdu
    /* renamed from: a */
    public final void mo15113a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f20877a, this.f20878b);
    }
}
