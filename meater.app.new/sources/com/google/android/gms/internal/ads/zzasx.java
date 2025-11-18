package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzasx extends zzfn implements zzasw {
    public zzasx() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    /* renamed from: h7 */
    public static zzasw m16929h7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        return iInterfaceQueryLocalInterface instanceof zzasw ? (zzasw) iInterfaceQueryLocalInterface : new zzasy(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            mo16390i4((zzath) zzfo.m19948b(parcel, zzath.CREATOR));
            parcel2.writeNoException();
        } else if (i2 != 2) {
            zzatb zzatdVar = null;
            zzasu zzasvVar = null;
            if (i2 == 3) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    zzatdVar = iInterfaceQueryLocalInterface instanceof zzatb ? (zzatb) iInterfaceQueryLocalInterface : new zzatd(strongBinder);
                }
                mo16389h0(zzatdVar);
                parcel2.writeNoException();
            } else if (i2 != 34) {
                switch (i2) {
                    case 5:
                        boolean zIsLoaded = isLoaded();
                        parcel2.writeNoException();
                        zzfo.m19947a(parcel2, zIsLoaded);
                        break;
                    case 6:
                        pause();
                        parcel2.writeNoException();
                        break;
                    case 7:
                        resume();
                        parcel2.writeNoException();
                        break;
                    case 8:
                        destroy();
                        parcel2.writeNoException();
                        break;
                    case 9:
                        mo16384M6(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 10:
                        mo16386T5(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 11:
                        mo16387d2(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 12:
                        String mediationAdapterClassName = getMediationAdapterClassName();
                        parcel2.writeNoException();
                        parcel2.writeString(mediationAdapterClassName);
                        break;
                    case 13:
                        setUserId(parcel.readString());
                        parcel2.writeNoException();
                        break;
                    case 14:
                        mo16392z0(zzzq.m20857h7(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 15:
                        Bundle adMetadata = getAdMetadata();
                        parcel2.writeNoException();
                        zzfo.m19953g(parcel2, adMetadata);
                        break;
                    case 16:
                        IBinder strongBinder2 = parcel.readStrongBinder();
                        if (strongBinder2 != null) {
                            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            zzasvVar = iInterfaceQueryLocalInterface2 instanceof zzasu ? (zzasu) iInterfaceQueryLocalInterface2 : new zzasv(strongBinder2);
                        }
                        mo16385T4(zzasvVar);
                        parcel2.writeNoException();
                        break;
                    case 17:
                        mo16388g5(parcel.readString());
                        parcel2.writeNoException();
                        break;
                    case 18:
                        mo16391s0(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 19:
                        setCustomData(parcel.readString());
                        parcel2.writeNoException();
                        break;
                    default:
                        return false;
                }
            } else {
                setImmersiveMode(zzfo.m19951e(parcel));
                parcel2.writeNoException();
            }
        } else {
            show();
            parcel2.writeNoException();
        }
        return true;
    }
}
