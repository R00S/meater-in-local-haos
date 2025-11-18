package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzatr extends zzfn implements zzatq {
    public zzatr() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    /* renamed from: h7 */
    public static zzatq m16943h7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        return iInterfaceQueryLocalInterface instanceof zzatq ? (zzatq) iInterfaceQueryLocalInterface : new zzats(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            String type = getType();
            parcel2.writeNoException();
            parcel2.writeString(type);
        } else {
            if (i2 != 2) {
                return false;
            }
            int amount = getAmount();
            parcel2.writeNoException();
            parcel2.writeInt(amount);
        }
        return true;
    }
}
