package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzdbg extends zzfm implements zzdbf {
    zzdbg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    /* renamed from: B4 */
    public final zzdbd mo19174B4(zzdbb zzdbbVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19950d(parcelM19944H, zzdbbVar);
        Parcel parcelM19945P = m19945P(1, parcelM19944H);
        zzdbd zzdbdVar = (zzdbd) zzfo.m19948b(parcelM19945P, zzdbd.CREATOR);
        parcelM19945P.recycle();
        return zzdbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    /* renamed from: s3 */
    public final void mo19175s3(zzday zzdayVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19950d(parcelM19944H, zzdayVar);
        m19946k0(2, parcelM19944H);
    }
}
