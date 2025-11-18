package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzarn extends zzfn implements zzarm {
    public zzarn() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 != 1) {
            zzarp zzarqVar = null;
            zzarr zzartVar = null;
            zzarr zzartVar2 = null;
            if (i2 == 2) {
                zzarg zzargVar = (zzarg) zzfo.m19948b(parcel, zzarg.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    zzarqVar = iInterfaceQueryLocalInterface instanceof zzarp ? (zzarp) iInterfaceQueryLocalInterface : new zzarq(strongBinder);
                }
                mo16893W5(zzargVar, zzarqVar);
                parcel2.writeNoException();
            } else if (i2 == 4) {
                zzarx zzarxVar = (zzarx) zzfo.m19948b(parcel, zzarx.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzartVar2 = iInterfaceQueryLocalInterface2 instanceof zzarr ? (zzarr) iInterfaceQueryLocalInterface2 : new zzart(strongBinder2);
                }
                mo16892I5(zzarxVar, zzartVar2);
                parcel2.writeNoException();
            } else {
                if (i2 != 5) {
                    return false;
                }
                zzarx zzarxVar2 = (zzarx) zzfo.m19948b(parcel, zzarx.CREATOR);
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzartVar = iInterfaceQueryLocalInterface3 instanceof zzarr ? (zzarr) iInterfaceQueryLocalInterface3 : new zzart(strongBinder3);
                }
                mo16894X6(zzarxVar2, zzartVar);
                parcel2.writeNoException();
            }
        } else {
            zzari zzariVarMo16895r6 = mo16895r6((zzarg) zzfo.m19948b(parcel, zzarg.CREATOR));
            parcel2.writeNoException();
            zzfo.m19953g(parcel2, zzariVarMo16895r6);
        }
        return true;
    }
}
