package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzaox extends zzfm implements zzaov {
    zzaox(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    /* renamed from: K4 */
    public final void mo16810K4(String str, String str2, zzxz zzxzVar, IObjectWrapper iObjectWrapper, zzaoj zzaojVar, zzamv zzamvVar, zzyd zzydVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeString(str);
        parcelM19944H.writeString(str2);
        zzfo.m19950d(parcelM19944H, zzxzVar);
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        zzfo.m19949c(parcelM19944H, zzaojVar);
        zzfo.m19949c(parcelM19944H, zzamvVar);
        zzfo.m19950d(parcelM19944H, zzydVar);
        m19946k0(13, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    /* renamed from: L2 */
    public final boolean mo16811L2(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        Parcel parcelM19945P = m19945P(17, parcelM19944H);
        boolean zM19951e = zzfo.m19951e(parcelM19945P);
        parcelM19945P.recycle();
        return zM19951e;
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    /* renamed from: a6 */
    public final zzapj mo16812a6() throws RemoteException {
        Parcel parcelM19945P = m19945P(2, m19944H());
        zzapj zzapjVar = (zzapj) zzfo.m19948b(parcelM19945P, zzapj.CREATOR);
        parcelM19945P.recycle();
        return zzapjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    /* renamed from: g4 */
    public final void mo16813g4(String str, String str2, zzxz zzxzVar, IObjectWrapper iObjectWrapper, zzaop zzaopVar, zzamv zzamvVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeString(str);
        parcelM19944H.writeString(str2);
        zzfo.m19950d(parcelM19944H, zzxzVar);
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        zzfo.m19949c(parcelM19944H, zzaopVar);
        zzfo.m19949c(parcelM19944H, zzamvVar);
        m19946k0(18, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    public final zzaar getVideoController() throws RemoteException {
        Parcel parcelM19945P = m19945P(5, m19944H());
        zzaar zzaarVarM16201h7 = zzaas.m16201h7(parcelM19945P.readStrongBinder());
        parcelM19945P.recycle();
        return zzaarVarM16201h7;
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    /* renamed from: h5 */
    public final void mo16814h5(String str, String str2, zzxz zzxzVar, IObjectWrapper iObjectWrapper, zzaos zzaosVar, zzamv zzamvVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeString(str);
        parcelM19944H.writeString(str2);
        zzfo.m19950d(parcelM19944H, zzxzVar);
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        zzfo.m19949c(parcelM19944H, zzaosVar);
        zzfo.m19949c(parcelM19944H, zzamvVar);
        m19946k0(16, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    /* renamed from: i5 */
    public final zzapj mo16815i5() throws RemoteException {
        Parcel parcelM19945P = m19945P(3, m19944H());
        zzapj zzapjVar = (zzapj) zzfo.m19948b(parcelM19945P, zzapj.CREATOR);
        parcelM19945P.recycle();
        return zzapjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    /* renamed from: u3 */
    public final void mo16818u3(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzyd zzydVar, zzaoy zzaoyVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        parcelM19944H.writeString(str);
        zzfo.m19950d(parcelM19944H, bundle);
        zzfo.m19950d(parcelM19944H, bundle2);
        zzfo.m19950d(parcelM19944H, zzydVar);
        zzfo.m19949c(parcelM19944H, zzaoyVar);
        m19946k0(1, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    /* renamed from: x2 */
    public final boolean mo16819x2(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        Parcel parcelM19945P = m19945P(15, parcelM19944H);
        boolean zM19951e = zzfo.m19951e(parcelM19945P);
        parcelM19945P.recycle();
        return zM19951e;
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    /* renamed from: y6 */
    public final void mo16820y6(String str, String str2, zzxz zzxzVar, IObjectWrapper iObjectWrapper, zzaom zzaomVar, zzamv zzamvVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeString(str);
        parcelM19944H.writeString(str2);
        zzfo.m19950d(parcelM19944H, zzxzVar);
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        zzfo.m19949c(parcelM19944H, zzaomVar);
        zzfo.m19949c(parcelM19944H, zzamvVar);
        m19946k0(14, parcelM19944H);
    }
}
