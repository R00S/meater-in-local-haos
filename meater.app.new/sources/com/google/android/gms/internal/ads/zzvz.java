package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzvz extends zzfm implements zzvy {
    zzvz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    /* renamed from: F4 */
    public final zzvs mo20681F4(zzvv zzvvVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19950d(parcelM19944H, zzvvVar);
        Parcel parcelM19945P = m19945P(1, parcelM19944H);
        zzvs zzvsVar = (zzvs) zzfo.m19948b(parcelM19945P, zzvs.CREATOR);
        parcelM19945P.recycle();
        return zzvsVar;
    }
}
