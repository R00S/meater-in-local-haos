package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzzo extends zzfm implements zzzn {
    zzzo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzzn
    /* renamed from: o5 */
    public final IBinder mo20856o5(IObjectWrapper iObjectWrapper, zzyd zzydVar, String str, zzamp zzampVar, int i2, int i3) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        zzfo.m19950d(parcelM19944H, zzydVar);
        parcelM19944H.writeString(str);
        zzfo.m19949c(parcelM19944H, zzampVar);
        parcelM19944H.writeInt(i2);
        parcelM19944H.writeInt(i3);
        Parcel parcelM19945P = m19945P(2, parcelM19944H);
        IBinder strongBinder = parcelM19945P.readStrongBinder();
        parcelM19945P.recycle();
        return strongBinder;
    }
}
