package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzfn;
import com.google.android.gms.measurement.internal.zzfs;
import p024c.p071o.p072a.AbstractC0991a;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* loaded from: classes2.dex */
public final class AppMeasurementReceiver extends AbstractC0991a implements zzfs {

    /* renamed from: c */
    private zzfn f28528c;

    @Override // com.google.android.gms.measurement.internal.zzfs
    /* renamed from: a */
    public final void mo22667a(Context context, Intent intent) {
        AbstractC0991a.m6271d(context, intent);
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    /* renamed from: b */
    public final BroadcastReceiver.PendingResult mo22668b() {
        return goAsync();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws IllegalStateException {
        if (this.f28528c == null) {
            this.f28528c = new zzfn(this);
        }
        this.f28528c.m23170a(context, intent);
    }
}
