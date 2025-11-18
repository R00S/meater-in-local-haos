package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.t3 */
/* loaded from: classes2.dex */
final class RunnableC7825t3 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzfx f28910f;

    /* renamed from: g */
    private final /* synthetic */ long f28911g;

    /* renamed from: h */
    private final /* synthetic */ Bundle f28912h;

    /* renamed from: i */
    private final /* synthetic */ Context f28913i;

    /* renamed from: j */
    private final /* synthetic */ zzet f28914j;

    /* renamed from: k */
    private final /* synthetic */ BroadcastReceiver.PendingResult f28915k;

    RunnableC7825t3(zzfn zzfnVar, zzfx zzfxVar, long j2, Bundle bundle, Context context, zzet zzetVar, BroadcastReceiver.PendingResult pendingResult) {
        this.f28910f = zzfxVar;
        this.f28911g = j2;
        this.f28912h = bundle;
        this.f28913i = context;
        this.f28914j = zzetVar;
        this.f28915k = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jM23155a = this.f28910f.m23211B().f28858k.m23155a();
        long j2 = this.f28911g;
        if (jM23155a > 0 && (j2 >= jM23155a || j2 <= 0)) {
            j2 = jM23155a - 1;
        }
        if (j2 > 0) {
            this.f28912h.putLong("click_timestamp", j2);
        }
        this.f28912h.putString("_cis", "referrer broadcast");
        zzfx.m23203a(this.f28913i, null).m23216H().m23281S("auto", "_cmp", this.f28912h);
        this.f28914j.m23145P().m23147a("Install campaign recorded");
        BroadcastReceiver.PendingResult pendingResult = this.f28915k;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}
