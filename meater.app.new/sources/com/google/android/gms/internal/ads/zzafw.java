package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzafw extends zzfm implements zzafu {
    zzafw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzafu
    /* renamed from: h1 */
    public final void mo16522h1(zzzk zzzkVar, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, zzzkVar);
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        m19946k0(1, parcelM19944H);
    }
}
