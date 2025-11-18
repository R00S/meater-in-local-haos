package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.i5 */
/* loaded from: classes2.dex */
final class C6772i5 extends BroadcastReceiver {

    /* renamed from: a */
    private final /* synthetic */ zzaxi f19292a;

    private C6772i5(zzaxi zzaxiVar) {
        this.f19292a = zzaxiVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.f19292a.f22657d = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f19292a.f22657d = false;
        }
    }

    /* synthetic */ C6772i5(zzaxi zzaxiVar, C6624e5 c6624e5) {
        this(zzaxiVar);
    }
}
