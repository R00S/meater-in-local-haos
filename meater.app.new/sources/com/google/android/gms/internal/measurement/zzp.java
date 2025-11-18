package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzp extends zza implements zzn {
    zzp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.zzn
    /* renamed from: J */
    public final void mo22444J(Bundle bundle) throws RemoteException {
        Parcel parcelM21488H = m21488H();
        zzb.m21493c(parcelM21488H, bundle);
        m21490k0(1, parcelM21488H);
    }
}
