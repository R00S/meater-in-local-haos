package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzfn;
import com.google.android.gms.measurement.internal.zzfs;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class AppMeasurementInstallReferrerReceiver extends BroadcastReceiver implements zzfs {

    /* renamed from: a */
    private zzfn f28526a;

    @Override // com.google.android.gms.measurement.internal.zzfs
    /* renamed from: a */
    public final void mo22667a(Context context, Intent intent) {
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    /* renamed from: b */
    public final BroadcastReceiver.PendingResult mo22668b() {
        return goAsync();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws IllegalStateException {
        if (this.f28526a == null) {
            this.f28526a = new zzfn(this);
        }
        this.f28526a.m23170a(context, intent);
    }
}
