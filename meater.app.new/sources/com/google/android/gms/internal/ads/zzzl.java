package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzzl extends zzfn implements zzzk {
    public zzzl() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    /* renamed from: h7 */
    public static zzzk m20855h7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return iInterfaceQueryLocalInterface instanceof zzzk ? (zzzk) iInterfaceQueryLocalInterface : new zzzm(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzyz zzzbVar = null;
        zzzp zzzrVar = null;
        zzzy zzaaaVar = null;
        zzyw zzyyVar = null;
        zzzs zzzuVar = null;
        switch (i2) {
            case 1:
                IObjectWrapper iObjectWrapperMo16350S0 = mo16350S0();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, iObjectWrapperMo16350S0);
                return true;
            case 2:
                destroy();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zMo16341B = mo16341B();
                parcel2.writeNoException();
                zzfo.m19947a(parcel2, zMo16341B);
                return true;
            case 4:
                boolean zMo16347J4 = mo16347J4((zzxz) zzfo.m19948b(parcel, zzxz.CREATOR));
                parcel2.writeNoException();
                zzfo.m19947a(parcel2, zMo16347J4);
                return true;
            case 5:
                pause();
                parcel2.writeNoException();
                return true;
            case 6:
                resume();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzzbVar = iInterfaceQueryLocalInterface instanceof zzyz ? (zzyz) iInterfaceQueryLocalInterface : new zzzb(strongBinder);
                }
                mo16348L0(zzzbVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    zzzuVar = iInterfaceQueryLocalInterface2 instanceof zzzs ? (zzzs) iInterfaceQueryLocalInterface2 : new zzzu(strongBinder2);
                }
                mo16349P5(zzzuVar);
                parcel2.writeNoException();
                return true;
            case 9:
                showInterstitial();
                parcel2.writeNoException();
                return true;
            case 10:
                mo16357k4();
                parcel2.writeNoException();
                return true;
            case 11:
                mo16364x6();
                parcel2.writeNoException();
                return true;
            case 12:
                zzyd zzydVarMo16344C5 = mo16344C5();
                parcel2.writeNoException();
                zzfo.m19953g(parcel2, zzydVarMo16344C5);
                return true;
            case 13:
                mo16342C2((zzyd) zzfo.m19948b(parcel, zzyd.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                mo16351U5(zzaqo.m16879h7(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                mo16343C3(zzaqu.m16880h7(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String mediationAdapterClassName = getMediationAdapterClassName();
                parcel2.writeNoException();
                parcel2.writeString(mediationAdapterClassName);
                return true;
            case 19:
                mo16345H6(zzadp.m16457h7(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    zzyyVar = iInterfaceQueryLocalInterface3 instanceof zzyw ? (zzyw) iInterfaceQueryLocalInterface3 : new zzyy(strongBinder3);
                }
                mo16362w4(zzyyVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzaaaVar = iInterfaceQueryLocalInterface4 instanceof zzzy ? (zzzy) iInterfaceQueryLocalInterface4 : new zzaaa(strongBinder4);
                }
                mo16361v4(zzaaaVar);
                parcel2.writeNoException();
                return true;
            case 22:
                mo16360t1(zzfo.m19951e(parcel));
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zMo16359p0 = mo16359p0();
                parcel2.writeNoException();
                zzfo.m19947a(parcel2, zMo16359p0);
                return true;
            case 24:
                mo16356h0(zzatc.m16936h7(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 25:
                setUserId(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 26:
                zzaar videoController = getVideoController();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, videoController);
                return true;
            case 29:
                mo16352W6((zzacd) zzfo.m19948b(parcel, zzacd.CREATOR));
                parcel2.writeNoException();
                return true;
            case 30:
                mo16353X5((zzaax) zzfo.m19948b(parcel, zzaax.CREATOR));
                parcel2.writeNoException();
                return true;
            case 31:
                String strMo16355f6 = mo16355f6();
                parcel2.writeNoException();
                parcel2.writeString(strMo16355f6);
                return true;
            case 32:
                zzzs zzzsVarMo16346I4 = mo16346I4();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, zzzsVarMo16346I4);
                return true;
            case 33:
                zzyz zzyzVarMo16363x5 = mo16363x5();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, zzyzVarMo16363x5);
                return true;
            case 34:
                setImmersiveMode(zzfo.m19951e(parcel));
                parcel2.writeNoException();
                return true;
            case 35:
                String strMo16354c0 = mo16354c0();
                parcel2.writeNoException();
                parcel2.writeString(strMo16354c0);
                return true;
            case 36:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    zzzrVar = iInterfaceQueryLocalInterface5 instanceof zzzp ? (zzzp) iInterfaceQueryLocalInterface5 : new zzzr(strongBinder5);
                }
                mo16365z0(zzzrVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle adMetadata = getAdMetadata();
                parcel2.writeNoException();
                zzfo.m19953g(parcel2, adMetadata);
                return true;
            case 38:
                mo16358m4(parcel.readString());
                parcel2.writeNoException();
                return true;
        }
    }
}
