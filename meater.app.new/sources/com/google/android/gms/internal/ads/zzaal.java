package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzaal extends zzfn implements zzaak {
    public zzaal() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    /* renamed from: h7 */
    public static zzaak m16187h7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return iInterfaceQueryLocalInterface instanceof zzaak ? (zzaak) iInterfaceQueryLocalInterface : new zzaam(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            String description = getDescription();
            parcel2.writeNoException();
            parcel2.writeString(description);
        } else {
            if (i2 != 2) {
                return false;
            }
            String strMo16186Z1 = mo16186Z1();
            parcel2.writeNoException();
            parcel2.writeString(strMo16186Z1);
        }
        return true;
    }
}
