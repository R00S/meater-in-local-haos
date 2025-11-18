package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzafj extends zzfn implements zzafi {
    public zzafj() {
        super("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    /* renamed from: h7 */
    public static zzafi m16515h7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof zzafi ? (zzafi) iInterfaceQueryLocalInterface : new zzafk(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzaew zzaeyVar;
        if (i2 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            zzaeyVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
            zzaeyVar = iInterfaceQueryLocalInterface instanceof zzaew ? (zzaew) iInterfaceQueryLocalInterface : new zzaey(strongBinder);
        }
        mo16514D3(zzaeyVar);
        parcel2.writeNoException();
        return true;
    }
}
