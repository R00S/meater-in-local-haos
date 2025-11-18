package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzats extends zzfm implements zzatq {
    zzats(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzatq
    public final int getAmount() throws RemoteException {
        Parcel parcelM19945P = m19945P(2, m19944H());
        int i2 = parcelM19945P.readInt();
        parcelM19945P.recycle();
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzatq
    public final String getType() throws RemoteException {
        Parcel parcelM19945P = m19945P(1, m19944H());
        String string = parcelM19945P.readString();
        parcelM19945P.recycle();
        return string;
    }
}
