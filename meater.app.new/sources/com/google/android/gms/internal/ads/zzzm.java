package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzzm extends zzfm implements zzzk {
    zzzm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: B */
    public final boolean mo16341B() throws RemoteException {
        Parcel parcelM19945P = m19945P(3, m19944H());
        boolean zM19951e = zzfo.m19951e(parcelM19945P);
        parcelM19945P.recycle();
        return zM19951e;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: C2 */
    public final void mo16342C2(zzyd zzydVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19950d(parcelM19944H, zzydVar);
        m19946k0(13, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: C5 */
    public final zzyd mo16344C5() throws RemoteException {
        Parcel parcelM19945P = m19945P(12, m19944H());
        zzyd zzydVar = (zzyd) zzfo.m19948b(parcelM19945P, zzyd.CREATOR);
        parcelM19945P.recycle();
        return zzydVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: H6 */
    public final void mo16345H6(zzado zzadoVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, zzadoVar);
        m19946k0(19, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: I4 */
    public final zzzs mo16346I4() throws RemoteException {
        zzzs zzzuVar;
        Parcel parcelM19945P = m19945P(32, m19944H());
        IBinder strongBinder = parcelM19945P.readStrongBinder();
        if (strongBinder == null) {
            zzzuVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            zzzuVar = iInterfaceQueryLocalInterface instanceof zzzs ? (zzzs) iInterfaceQueryLocalInterface : new zzzu(strongBinder);
        }
        parcelM19945P.recycle();
        return zzzuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: J4 */
    public final boolean mo16347J4(zzxz zzxzVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19950d(parcelM19944H, zzxzVar);
        Parcel parcelM19945P = m19945P(4, parcelM19944H);
        boolean zM19951e = zzfo.m19951e(parcelM19945P);
        parcelM19945P.recycle();
        return zM19951e;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: L0 */
    public final void mo16348L0(zzyz zzyzVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, zzyzVar);
        m19946k0(7, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: P5 */
    public final void mo16349P5(zzzs zzzsVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, zzzsVar);
        m19946k0(8, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: S0 */
    public final IObjectWrapper mo16350S0() throws RemoteException {
        Parcel parcelM19945P = m19945P(1, m19944H());
        IObjectWrapper iObjectWrapperM14707P = IObjectWrapper.Stub.m14707P(parcelM19945P.readStrongBinder());
        parcelM19945P.recycle();
        return iObjectWrapperM14707P;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: W6 */
    public final void mo16352W6(zzacd zzacdVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19950d(parcelM19944H, zzacdVar);
        m19946k0(29, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: c0 */
    public final String mo16354c0() throws RemoteException {
        Parcel parcelM19945P = m19945P(35, m19944H());
        String string = parcelM19945P.readString();
        parcelM19945P.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void destroy() throws RemoteException {
        m19946k0(2, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: f6 */
    public final String mo16355f6() throws RemoteException {
        Parcel parcelM19945P = m19945P(31, m19944H());
        String string = parcelM19945P.readString();
        parcelM19945P.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final Bundle getAdMetadata() throws RemoteException {
        Parcel parcelM19945P = m19945P(37, m19944H());
        Bundle bundle = (Bundle) zzfo.m19948b(parcelM19945P, Bundle.CREATOR);
        parcelM19945P.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final zzaar getVideoController() throws RemoteException {
        zzaar zzaatVar;
        Parcel parcelM19945P = m19945P(26, m19944H());
        IBinder strongBinder = parcelM19945P.readStrongBinder();
        if (strongBinder == null) {
            zzaatVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            zzaatVar = iInterfaceQueryLocalInterface instanceof zzaar ? (zzaar) iInterfaceQueryLocalInterface : new zzaat(strongBinder);
        }
        parcelM19945P.recycle();
        return zzaatVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: h0 */
    public final void mo16356h0(zzatb zzatbVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, zzatbVar);
        m19946k0(24, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: p0 */
    public final boolean mo16359p0() throws RemoteException {
        Parcel parcelM19945P = m19945P(23, m19944H());
        boolean zM19951e = zzfo.m19951e(parcelM19945P);
        parcelM19945P.recycle();
        return zM19951e;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void pause() throws RemoteException {
        m19946k0(5, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void resume() throws RemoteException {
        m19946k0(6, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void setImmersiveMode(boolean z) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19947a(parcelM19944H, z);
        m19946k0(34, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void showInterstitial() throws RemoteException {
        m19946k0(9, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: t1 */
    public final void mo16360t1(boolean z) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19947a(parcelM19944H, z);
        m19946k0(22, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: v4 */
    public final void mo16361v4(zzzy zzzyVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, zzzyVar);
        m19946k0(21, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: w4 */
    public final void mo16362w4(zzyw zzywVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, zzywVar);
        m19946k0(20, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: x5 */
    public final zzyz mo16363x5() throws RemoteException {
        zzyz zzzbVar;
        Parcel parcelM19945P = m19945P(33, m19944H());
        IBinder strongBinder = parcelM19945P.readStrongBinder();
        if (strongBinder == null) {
            zzzbVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            zzzbVar = iInterfaceQueryLocalInterface instanceof zzyz ? (zzyz) iInterfaceQueryLocalInterface : new zzzb(strongBinder);
        }
        parcelM19945P.recycle();
        return zzzbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: x6 */
    public final void mo16364x6() throws RemoteException {
        m19946k0(11, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: z0 */
    public final void mo16365z0(zzzp zzzpVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, zzzpVar);
        m19946k0(36, parcelM19944H);
    }
}
