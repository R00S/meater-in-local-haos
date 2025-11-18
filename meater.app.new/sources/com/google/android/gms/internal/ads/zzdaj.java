package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzdaj extends zzfm implements zzdah {
    zzdaj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.omid.IOmid");
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    /* renamed from: H0 */
    public final String mo19139H0() throws RemoteException {
        Parcel parcelM19945P = m19945P(6, m19944H());
        String string = parcelM19945P.readString();
        parcelM19945P.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    /* renamed from: H1 */
    public final boolean mo19140H1(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        Parcel parcelM19945P = m19945P(2, parcelM19944H);
        boolean zM19951e = zzfo.m19951e(parcelM19945P);
        parcelM19945P.recycle();
        return zM19951e;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    /* renamed from: a7 */
    public final void mo19141a7(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        m19946k0(7, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    /* renamed from: d3 */
    public final IObjectWrapper mo19142d3(String str, IObjectWrapper iObjectWrapper, String str2, String str3, String str4, String str5) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeString(str);
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        parcelM19944H.writeString(str2);
        parcelM19944H.writeString(str3);
        parcelM19944H.writeString(str4);
        parcelM19944H.writeString(str5);
        Parcel parcelM19945P = m19945P(9, parcelM19944H);
        IObjectWrapper iObjectWrapperM14707P = IObjectWrapper.Stub.m14707P(parcelM19945P.readStrongBinder());
        parcelM19945P.recycle();
        return iObjectWrapperM14707P;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    /* renamed from: p1 */
    public final void mo19143p1(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        zzfo.m19949c(parcelM19944H, iObjectWrapper2);
        m19946k0(5, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    /* renamed from: w6 */
    public final void mo19144w6(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        m19946k0(4, parcelM19944H);
    }
}
