package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzaor extends zzfm implements zzaop {
    zzaor(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaop
    /* renamed from: E4 */
    public final void mo15555E4(zzang zzangVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, zzangVar);
        m19946k0(1, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzaop
    /* renamed from: p */
    public final void mo15556p(String str) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeString(str);
        m19946k0(2, parcelM19944H);
    }
}
