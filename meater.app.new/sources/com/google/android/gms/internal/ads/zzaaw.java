package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzaaw extends zzfm implements zzaau {
    zzaaw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    /* renamed from: T0 */
    public final void mo16202T0(boolean z) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19947a(parcelM19944H, z);
        m19946k0(5, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    /* renamed from: n0 */
    public final void mo16203n0() throws RemoteException {
        m19946k0(4, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final void onVideoPause() throws RemoteException {
        m19946k0(3, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final void onVideoPlay() throws RemoteException {
        m19946k0(2, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final void onVideoStart() throws RemoteException {
        m19946k0(1, m19944H());
    }
}
