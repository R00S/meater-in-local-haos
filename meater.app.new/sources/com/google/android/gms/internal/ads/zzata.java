package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzata extends zzfm implements zzasz {
    zzata(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzasz
    /* renamed from: V5 */
    public final IBinder mo16930V5(IObjectWrapper iObjectWrapper, zzamp zzampVar, int i2) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        zzfo.m19949c(parcelM19944H, zzampVar);
        parcelM19944H.writeInt(i2);
        Parcel parcelM19945P = m19945P(1, parcelM19944H);
        IBinder strongBinder = parcelM19945P.readStrongBinder();
        parcelM19945P.recycle();
        return strongBinder;
    }
}
