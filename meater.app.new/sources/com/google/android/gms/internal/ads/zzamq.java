package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzamq extends zzfn implements zzamp {
    public zzamq() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* renamed from: h7 */
    public static zzamp m16696h7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof zzamp ? (zzamp) iInterfaceQueryLocalInterface : new zzamr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            zzams zzamsVarMo16695l6 = mo16695l6(parcel.readString());
            parcel2.writeNoException();
            zzfo.m19949c(parcel2, zzamsVarMo16695l6);
        } else if (i2 == 2) {
            boolean zMo16692N6 = mo16692N6(parcel.readString());
            parcel2.writeNoException();
            zzfo.m19947a(parcel2, zMo16692N6);
        } else {
            if (i2 != 3) {
                return false;
            }
            zzaov zzaovVarMo16693P2 = mo16693P2(parcel.readString());
            parcel2.writeNoException();
            zzfo.m19949c(parcel2, zzaovVarMo16693P2);
        }
        return true;
    }
}
