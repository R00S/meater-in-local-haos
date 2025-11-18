package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzzd extends zzfn implements zzzc {
    public zzzd() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            mo15085j2((zzxz) zzfo.m19948b(parcel, zzxz.CREATOR));
            parcel2.writeNoException();
        } else if (i2 == 2) {
            String mediationAdapterClassName = getMediationAdapterClassName();
            parcel2.writeNoException();
            parcel2.writeString(mediationAdapterClassName);
        } else if (i2 == 3) {
            boolean zMo15086p0 = mo15086p0();
            parcel2.writeNoException();
            zzfo.m19947a(parcel2, zMo15086p0);
        } else if (i2 == 4) {
            String strMo15084c0 = mo15084c0();
            parcel2.writeNoException();
            parcel2.writeString(strMo15084c0);
        } else {
            if (i2 != 5) {
                return false;
            }
            mo15083F5((zzxz) zzfo.m19948b(parcel, zzxz.CREATOR), parcel.readInt());
            parcel2.writeNoException();
        }
        return true;
    }
}
