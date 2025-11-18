package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzaev extends zzfm implements zzaeu {
    zzaev(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    /* renamed from: y5 */
    public final IBinder mo16477y5(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        zzfo.m19949c(parcelM19944H, iObjectWrapper2);
        zzfo.m19949c(parcelM19944H, iObjectWrapper3);
        Parcel parcelM19945P = m19945P(1, parcelM19944H);
        IBinder strongBinder = parcelM19945P.readStrongBinder();
        parcelM19945P.recycle();
        return strongBinder;
    }
}
