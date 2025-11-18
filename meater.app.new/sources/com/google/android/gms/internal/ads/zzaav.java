package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzaav extends zzfn implements zzaau {
    public zzaav() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            onVideoStart();
        } else if (i2 == 2) {
            onVideoPlay();
        } else if (i2 == 3) {
            onVideoPause();
        } else if (i2 == 4) {
            mo16203n0();
        } else {
            if (i2 != 5) {
                return false;
            }
            mo16202T0(zzfo.m19951e(parcel));
        }
        parcel2.writeNoException();
        return true;
    }
}
