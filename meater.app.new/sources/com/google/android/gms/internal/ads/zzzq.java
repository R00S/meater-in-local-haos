package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzzq extends zzfn implements zzzp {
    public zzzq() {
        super("com.google.android.gms.ads.internal.client.IAdMetadataListener");
    }

    /* renamed from: h7 */
    public static zzzp m20857h7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return iInterfaceQueryLocalInterface instanceof zzzp ? (zzzp) iInterfaceQueryLocalInterface : new zzzr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 != 1) {
            return false;
        }
        onAdMetadataChanged();
        parcel2.writeNoException();
        return true;
    }
}
