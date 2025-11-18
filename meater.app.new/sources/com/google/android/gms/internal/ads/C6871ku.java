package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.ku */
/* loaded from: classes2.dex */
final class C6871ku implements zzdu {

    /* renamed from: a */
    private final /* synthetic */ Activity f19724a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f19725b;

    C6871ku(C7166st c7166st, Activity activity, Bundle bundle) {
        this.f19724a = activity;
        this.f19725b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzdu
    /* renamed from: a */
    public final void mo15113a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f19724a, this.f19725b);
    }
}
