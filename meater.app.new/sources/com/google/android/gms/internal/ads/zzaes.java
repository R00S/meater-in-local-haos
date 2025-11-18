package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzaes extends zzfn implements zzaer {
    public zzaes() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    /* renamed from: h7 */
    public static zzaer m16476h7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        return iInterfaceQueryLocalInterface instanceof zzaer ? (zzaer) iInterfaceQueryLocalInterface : new zzaet(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            mo16372V(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
        } else if (i2 == 2) {
            mo16374z5();
        } else {
            if (i2 != 3) {
                return false;
            }
            mo16373x0(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
