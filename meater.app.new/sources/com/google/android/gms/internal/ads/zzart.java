package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzart extends zzfm implements zzarr {
    zzart(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzarr
    /* renamed from: K5 */
    public final void mo16896K5(zzaym zzaymVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19950d(parcelM19944H, zzaymVar);
        m19946k0(2, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzarr
    /* renamed from: V0 */
    public final void mo16897V0(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19950d(parcelM19944H, parcelFileDescriptor);
        m19946k0(1, parcelM19944H);
    }
}
