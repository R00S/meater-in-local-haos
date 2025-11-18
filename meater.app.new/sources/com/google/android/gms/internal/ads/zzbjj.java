package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzbjj extends zzfm implements zzbjh {
    zzbjj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // com.google.android.gms.internal.ads.zzbjh
    /* renamed from: A1 */
    public final void mo17773A1(zzbjf zzbjfVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, zzbjfVar);
        m19946k0(1, parcelM19944H);
    }
}
