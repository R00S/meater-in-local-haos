package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzauf extends zzfm implements zzaue {
    zzauf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    @Override // com.google.android.gms.internal.ads.zzaue
    /* renamed from: X2 */
    public final void mo16952X2(zzatq zzatqVar, String str, String str2) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, zzatqVar);
        parcelM19944H.writeString(str);
        parcelM19944H.writeString(str2);
        m19946k0(2, parcelM19944H);
    }
}
