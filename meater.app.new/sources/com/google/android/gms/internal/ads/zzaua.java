package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzaua extends zzfm implements zzatz {
    zzaua(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzatz
    /* renamed from: L6 */
    public final IBinder mo16949L6(IObjectWrapper iObjectWrapper, String str, zzamp zzampVar, int i2) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        parcelM19944H.writeString(str);
        zzfo.m19949c(parcelM19944H, zzampVar);
        parcelM19944H.writeInt(i2);
        Parcel parcelM19945P = m19945P(1, parcelM19944H);
        IBinder strongBinder = parcelM19945P.readStrongBinder();
        parcelM19945P.recycle();
        return strongBinder;
    }
}
