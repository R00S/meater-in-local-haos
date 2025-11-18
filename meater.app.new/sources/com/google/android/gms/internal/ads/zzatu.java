package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzatu extends zzfn implements zzatt {
    public zzatu() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    /* renamed from: h7 */
    public static zzatt m16944h7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterfaceQueryLocalInterface instanceof zzatt ? (zzatt) iInterfaceQueryLocalInterface : new zzatv(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzaub zzaudVar = null;
        zzaue zzaufVar = null;
        zzatw zzatyVar = null;
        switch (i2) {
            case 1:
                zzxz zzxzVar = (zzxz) zzfo.m19948b(parcel, zzxz.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzaudVar = iInterfaceQueryLocalInterface instanceof zzaub ? (zzaub) iInterfaceQueryLocalInterface : new zzaud(strongBinder);
                }
                mo16379W1(zzxzVar, zzaudVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzatyVar = iInterfaceQueryLocalInterface2 instanceof zzatw ? (zzatw) iInterfaceQueryLocalInterface2 : new zzaty(strongBinder2);
                }
                mo16377L5(zzatyVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zIsLoaded = isLoaded();
                parcel2.writeNoException();
                zzfo.m19947a(parcel2, zIsLoaded);
                return true;
            case 4:
                String mediationAdapterClassName = getMediationAdapterClassName();
                parcel2.writeNoException();
                parcel2.writeString(mediationAdapterClassName);
                return true;
            case 5:
                mo16381f5(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzaufVar = iInterfaceQueryLocalInterface3 instanceof zzaue ? (zzaue) iInterfaceQueryLocalInterface3 : new zzauf(strongBinder3);
                }
                mo16376K2(zzaufVar);
                parcel2.writeNoException();
                return true;
            case 7:
                mo16382m2((zzaum) zzfo.m19948b(parcel, zzaum.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                mo16375G5(zzaap.m16189h7(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle adMetadata = getAdMetadata();
                parcel2.writeNoException();
                zzfo.m19953g(parcel2, adMetadata);
                return true;
            case 10:
                mo16380e7(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), zzfo.m19951e(parcel));
                parcel2.writeNoException();
                return true;
            case 11:
                zzatq zzatqVarMo16378O6 = mo16378O6();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, zzatqVarMo16378O6);
                return true;
            default:
                return false;
        }
    }
}
