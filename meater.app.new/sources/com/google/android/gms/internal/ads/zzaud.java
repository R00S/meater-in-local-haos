package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzaud extends zzfm implements zzaub {
    zzaud(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaub
    /* renamed from: R4 */
    public final void mo16950R4(int i2) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeInt(i2);
        m19946k0(2, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzaub
    /* renamed from: n1 */
    public final void mo16951n1() throws RemoteException {
        m19946k0(1, m19944H());
    }
}
