package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzaah extends zzfn implements zzaag {
    public zzaah() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    }

    /* renamed from: h7 */
    public static zzaag m16185h7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
        return iInterfaceQueryLocalInterface instanceof zzaag ? (zzaag) iInterfaceQueryLocalInterface : new zzaai(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 != 1) {
            return false;
        }
        onAdMuted();
        parcel2.writeNoException();
        return true;
    }
}
