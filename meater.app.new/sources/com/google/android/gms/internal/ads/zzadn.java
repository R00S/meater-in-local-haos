package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzadn extends zzfm implements zzadl {
    zzadn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    /* renamed from: M5 */
    public final String mo16454M5() throws RemoteException {
        Parcel parcelM19945P = m19945P(1, m19944H());
        String string = parcelM19945P.readString();
        parcelM19945P.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final String getContent() throws RemoteException {
        Parcel parcelM19945P = m19945P(2, m19944H());
        String string = parcelM19945P.readString();
        parcelM19945P.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void recordClick() throws RemoteException {
        m19946k0(4, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    public final void recordImpression() throws RemoteException {
        m19946k0(5, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzadl
    /* renamed from: z1 */
    public final void mo16455z1(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        m19946k0(3, parcelM19944H);
    }
}
