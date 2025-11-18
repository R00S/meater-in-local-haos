package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzafq extends zzfm implements zzafo {
    zzafq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzafo
    /* renamed from: F0 */
    public final void mo16518F0(zzafe zzafeVar, String str) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, zzafeVar);
        parcelM19944H.writeString(str);
        m19946k0(1, parcelM19944H);
    }
}
