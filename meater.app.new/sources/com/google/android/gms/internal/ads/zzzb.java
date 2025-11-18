package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzzb extends zzfm implements zzyz {
    zzzb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onAdClicked() throws RemoteException {
        m19946k0(6, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onAdClosed() throws RemoteException {
        m19946k0(1, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onAdFailedToLoad(int i2) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeInt(i2);
        m19946k0(2, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onAdImpression() throws RemoteException {
        m19946k0(7, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onAdLeftApplication() throws RemoteException {
        m19946k0(3, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onAdLoaded() throws RemoteException {
        m19946k0(4, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzyz
    public final void onAdOpened() throws RemoteException {
        m19946k0(5, m19944H());
    }
}
