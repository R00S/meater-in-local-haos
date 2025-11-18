package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzaad extends zzfm implements zzaab {
    zzaad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: B2 */
    public final void mo16171B2(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeString(str);
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        m19946k0(6, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: C4 */
    public final float mo16172C4() throws RemoteException {
        Parcel parcelM19945P = m19945P(7, m19944H());
        float f2 = parcelM19945P.readFloat();
        parcelM19945P.recycle();
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: H3 */
    public final String mo16173H3() throws RemoteException {
        Parcel parcelM19945P = m19945P(9, m19944H());
        String string = parcelM19945P.readString();
        parcelM19945P.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: J3 */
    public final boolean mo16174J3() throws RemoteException {
        Parcel parcelM19945P = m19945P(8, m19944H());
        boolean zM19951e = zzfo.m19951e(parcelM19945P);
        parcelM19945P.recycle();
        return zM19951e;
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: N2 */
    public final void mo16175N2(String str) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeString(str);
        m19946k0(10, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: O0 */
    public final void mo16176O0(zzamp zzampVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, zzampVar);
        m19946k0(11, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: a */
    public final void mo16179a() throws RemoteException {
        m19946k0(1, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: c2 */
    public final void mo16180c2(boolean z) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19947a(parcelM19944H, z);
        m19946k0(4, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: t6 */
    public final void mo16182t6(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        parcelM19944H.writeString(str);
        m19946k0(5, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzaab
    /* renamed from: v5 */
    public final void mo16183v5(float f2) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeFloat(f2);
        m19946k0(2, parcelM19944H);
    }
}
