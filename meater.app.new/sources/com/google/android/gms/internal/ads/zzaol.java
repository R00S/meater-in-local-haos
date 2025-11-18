package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzaol extends zzfm implements zzaoj {
    zzaol(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaoj
    /* renamed from: c1 */
    public final void mo15687c1(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        m19946k0(1, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzaoj
    /* renamed from: p */
    public final void mo15688p(String str) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeString(str);
        m19946k0(2, parcelM19944H);
    }
}
