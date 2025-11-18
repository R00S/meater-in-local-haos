package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzamx extends zzfm implements zzamv {
    zzamx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    /* renamed from: F0 */
    public final void mo16717F0(zzafe zzafeVar, String str) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, zzafeVar);
        parcelM19944H.writeString(str);
        m19946k0(10, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    /* renamed from: I6 */
    public final void mo16718I6() throws RemoteException {
        m19946k0(18, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    /* renamed from: R */
    public final void mo16719R(int i2) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeInt(i2);
        m19946k0(17, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    /* renamed from: b1 */
    public final void mo16720b1() throws RemoteException {
        m19946k0(13, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    /* renamed from: k1 */
    public final void mo16721k1(zzamy zzamyVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, zzamyVar);
        m19946k0(7, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    /* renamed from: m3 */
    public final void mo16722m3(String str) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeString(str);
        m19946k0(12, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    /* renamed from: n0 */
    public final void mo16723n0() throws RemoteException {
        m19946k0(11, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdClicked() throws RemoteException {
        m19946k0(1, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdClosed() throws RemoteException {
        m19946k0(2, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdFailedToLoad(int i2) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeInt(i2);
        m19946k0(3, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdImpression() throws RemoteException {
        m19946k0(8, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdLeftApplication() throws RemoteException {
        m19946k0(4, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdLoaded() throws RemoteException {
        m19946k0(6, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAdOpened() throws RemoteException {
        m19946k0(5, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onAppEvent(String str, String str2) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeString(str);
        parcelM19944H.writeString(str2);
        m19946k0(9, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onVideoPause() throws RemoteException {
        m19946k0(15, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void onVideoPlay() throws RemoteException {
        m19946k0(20, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    /* renamed from: t5 */
    public final void mo16724t5(zzato zzatoVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19950d(parcelM19944H, zzatoVar);
        m19946k0(14, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    /* renamed from: v0 */
    public final void mo16725v0(zzatq zzatqVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, zzatqVar);
        m19946k0(16, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zzb(Bundle bundle) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19950d(parcelM19944H, bundle);
        m19946k0(19, parcelM19944H);
    }
}
