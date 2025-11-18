package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzars extends zzfn implements zzarr {
    public zzars() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            mo16897V0((ParcelFileDescriptor) zzfo.m19948b(parcel, ParcelFileDescriptor.CREATOR));
        } else {
            if (i2 != 2) {
                return false;
            }
            mo16896K5((zzaym) zzfo.m19948b(parcel, zzaym.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
