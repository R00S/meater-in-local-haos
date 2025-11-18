package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzauc extends zzfn implements zzaub {
    public zzauc() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            mo16951n1();
        } else {
            if (i2 != 2) {
                return false;
            }
            mo16950R4(parcel.readInt());
        }
        parcel2.writeNoException();
        return true;
    }
}
