package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzasv extends zzfm implements zzasu {
    zzasv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    @Override // com.google.android.gms.internal.ads.zzasu
    /* renamed from: y3 */
    public final void mo16928y3(zzasr zzasrVar, String str, String str2) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, zzasrVar);
        parcelM19944H.writeString(str);
        parcelM19944H.writeString(str2);
        m19946k0(2, parcelM19944H);
    }
}
