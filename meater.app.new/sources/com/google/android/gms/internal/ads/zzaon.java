package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzaon extends zzfn implements zzaom {
    public zzaon() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 2) {
            mo15110K0();
        } else {
            if (i2 != 3) {
                return false;
            }
            mo15111p(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
