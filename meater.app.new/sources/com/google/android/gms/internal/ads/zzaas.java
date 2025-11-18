package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzaas extends zzfn implements zzaar {
    public zzaas() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    /* renamed from: h7 */
    public static zzaar m16201h7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return iInterfaceQueryLocalInterface instanceof zzaar ? (zzaar) iInterfaceQueryLocalInterface : new zzaat(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzaau zzaawVar;
        switch (i2) {
            case 1:
                mo16198k5();
                parcel2.writeNoException();
                return true;
            case 2:
                pause();
                parcel2.writeNoException();
                return true;
            case 3:
                mo16200o2(zzfo.m19951e(parcel));
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zMo16191G1 = mo16191G1();
                parcel2.writeNoException();
                zzfo.m19947a(parcel2, zMo16191G1);
                return true;
            case 5:
                int iMo16190F = mo16190F();
                parcel2.writeNoException();
                parcel2.writeInt(iMo16190F);
                return true;
            case 6:
                float fMo16192Q6 = mo16192Q6();
                parcel2.writeNoException();
                parcel2.writeFloat(fMo16192Q6);
                return true;
            case 7:
                float fMo16194S5 = mo16194S5();
                parcel2.writeNoException();
                parcel2.writeFloat(fMo16194S5);
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzaawVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    zzaawVar = iInterfaceQueryLocalInterface instanceof zzaau ? (zzaau) iInterfaceQueryLocalInterface : new zzaaw(strongBinder);
                }
                mo16193R1(zzaawVar);
                parcel2.writeNoException();
                return true;
            case 9:
                float fMo16195T = mo16195T();
                parcel2.writeNoException();
                parcel2.writeFloat(fMo16195T);
                return true;
            case 10:
                boolean zMo16199l5 = mo16199l5();
                parcel2.writeNoException();
                zzfo.m19947a(parcel2, zMo16199l5);
                return true;
            case 11:
                zzaau zzaauVarMo16196a5 = mo16196a5();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, zzaauVarMo16196a5);
                return true;
            case 12:
                boolean zMo16197d1 = mo16197d1();
                parcel2.writeNoException();
                zzfo.m19947a(parcel2, zMo16197d1);
                return true;
            default:
                return false;
        }
    }
}
