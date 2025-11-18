package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzadp extends zzfn implements zzado {
    public zzadp() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    /* renamed from: h7 */
    public static zzado m16457h7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof zzado ? (zzado) iInterfaceQueryLocalInterface : new zzadq(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzadl zzadnVar;
        if (i2 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            zzadnVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
            zzadnVar = iInterfaceQueryLocalInterface instanceof zzadl ? (zzadl) iInterfaceQueryLocalInterface : new zzadn(strongBinder);
        }
        mo16456O2(zzadnVar);
        parcel2.writeNoException();
        return true;
    }
}
