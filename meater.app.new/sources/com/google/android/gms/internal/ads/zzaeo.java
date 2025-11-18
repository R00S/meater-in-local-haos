package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzaeo extends zzfm implements zzaem {
    zzaeo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    /* renamed from: V */
    public final void mo16367V(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        m19946k0(3, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    /* renamed from: X0 */
    public final void mo16368X0(IObjectWrapper iObjectWrapper, int i2) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        parcelM19944H.writeInt(i2);
        m19946k0(5, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    /* renamed from: d5 */
    public final void mo16369d5(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeString(str);
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        m19946k0(1, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void destroy() throws RemoteException {
        m19946k0(4, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    /* renamed from: n4 */
    public final IObjectWrapper mo16370n4(String str) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeString(str);
        Parcel parcelM19945P = m19945P(2, parcelM19944H);
        IObjectWrapper iObjectWrapperM14707P = IObjectWrapper.Stub.m14707P(parcelM19945P.readStrongBinder());
        parcelM19945P.recycle();
        return iObjectWrapperM14707P;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    /* renamed from: x0 */
    public final void mo16371x0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        m19946k0(6, parcelM19944H);
    }
}
