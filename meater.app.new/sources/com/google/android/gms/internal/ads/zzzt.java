package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzzt extends zzfn implements zzzs {
    public zzzt() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    /* renamed from: h7 */
    public static zzzs m20858h7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return iInterfaceQueryLocalInterface instanceof zzzs ? (zzzs) iInterfaceQueryLocalInterface : new zzzu(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 != 1) {
            return false;
        }
        onAppEvent(parcel.readString(), parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
