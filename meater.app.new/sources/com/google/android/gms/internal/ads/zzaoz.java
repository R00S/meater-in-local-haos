package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzaoz extends zzfn implements zzaoy {
    public zzaoz() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            mo16822R2(parcel.readString());
        } else {
            if (i2 != 2) {
                return false;
            }
            onFailure(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
