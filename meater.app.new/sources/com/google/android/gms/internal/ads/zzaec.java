package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzaec extends zzfm implements zzaea {
    zzaec(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    /* renamed from: M0 */
    public final List<zzaei> mo16459M0() throws RemoteException {
        Parcel parcelM19945P = m19945P(3, m19944H());
        ArrayList arrayListM19952f = zzfo.m19952f(parcelM19945P);
        parcelM19945P.recycle();
        return arrayListM19952f;
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    /* renamed from: m1 */
    public final String mo16464m1() throws RemoteException {
        Parcel parcelM19945P = m19945P(2, m19944H());
        String string = parcelM19945P.readString();
        parcelM19945P.recycle();
        return string;
    }
}
