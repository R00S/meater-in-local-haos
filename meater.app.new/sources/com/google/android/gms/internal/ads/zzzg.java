package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

/* loaded from: classes2.dex */
public abstract class zzzg extends zzfn implements zzzf {
    public zzzg() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzyz zzzbVar = null;
        zzzy zzaaaVar = null;
        switch (i2) {
            case 1:
                zzzc zzzcVarMo16330J1 = mo16330J1();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, zzzcVarMo16330J1);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzzbVar = iInterfaceQueryLocalInterface instanceof zzyz ? (zzyz) iInterfaceQueryLocalInterface : new zzzb(strongBinder);
                }
                mo16335e2(zzzbVar);
                parcel2.writeNoException();
                return true;
            case 3:
                mo16329G3(zzafj.m16515h7(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                mo16339y1(zzafm.m16517h7(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5:
                mo16328D5(parcel.readString(), zzafs.m16521h7(parcel.readStrongBinder()), zzafp.m16519h7(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                mo16337k6((zzady) zzfo.m19948b(parcel, zzady.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzaaaVar = iInterfaceQueryLocalInterface2 instanceof zzzy ? (zzzy) iInterfaceQueryLocalInterface2 : new zzaaa(strongBinder2);
                }
                mo16338q5(zzaaaVar);
                parcel2.writeNoException();
                return true;
            case 8:
                mo16336i1(zzafv.m16523h7(parcel.readStrongBinder()), (zzyd) zzfo.m19948b(parcel, zzyd.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                mo16333X1((PublisherAdViewOptions) zzfo.m19948b(parcel, PublisherAdViewOptions.CREATOR));
                parcel2.writeNoException();
                return true;
            case 10:
                mo16334Z3(zzafy.m16525h7(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                mo16332Q3((zzaiy) zzfo.m19948b(parcel, zzaiy.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                mo16331M2(zzajf.m16599h7(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
        }
    }
}
