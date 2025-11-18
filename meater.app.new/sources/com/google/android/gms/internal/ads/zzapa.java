package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzapa extends zzfm implements zzaoy {
    zzapa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaoy
    /* renamed from: R2 */
    public final void mo16822R2(String str) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeString(str);
        m19946k0(1, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzaoy
    public final void onFailure(String str) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeString(str);
        m19946k0(2, parcelM19944H);
    }
}
