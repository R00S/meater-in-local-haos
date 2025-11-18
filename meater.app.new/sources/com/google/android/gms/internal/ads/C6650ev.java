package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.ev */
/* loaded from: classes2.dex */
final class C6650ev implements zzdu {

    /* renamed from: a */
    private final /* synthetic */ Activity f18834a;

    C6650ev(C7166st c7166st, Activity activity) {
        this.f18834a = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzdu
    /* renamed from: a */
    public final void mo15113a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f18834a);
    }
}
