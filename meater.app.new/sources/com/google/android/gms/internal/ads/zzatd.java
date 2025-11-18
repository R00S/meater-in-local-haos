package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzatd extends zzfm implements zzatb {
    zzatd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    /* renamed from: l1 */
    public final void mo16935l1(zzasr zzasrVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, zzasrVar);
        m19946k0(5, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void onRewardedVideoAdClosed() throws RemoteException {
        m19946k0(4, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void onRewardedVideoAdFailedToLoad(int i2) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeInt(i2);
        m19946k0(7, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void onRewardedVideoAdLeftApplication() throws RemoteException {
        m19946k0(6, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void onRewardedVideoAdLoaded() throws RemoteException {
        m19946k0(1, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void onRewardedVideoAdOpened() throws RemoteException {
        m19946k0(2, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void onRewardedVideoCompleted() throws RemoteException {
        m19946k0(8, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void onRewardedVideoStarted() throws RemoteException {
        m19946k0(3, m19944H());
    }
}
