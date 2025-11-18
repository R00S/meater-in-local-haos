package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public final class zzatv extends zzfm implements zzatt {
    zzatv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    /* renamed from: G5 */
    public final void mo16375G5(zzaao zzaaoVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, zzaaoVar);
        m19946k0(8, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    /* renamed from: L5 */
    public final void mo16377L5(zzatw zzatwVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, zzatwVar);
        m19946k0(2, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    /* renamed from: O6 */
    public final zzatq mo16378O6() throws RemoteException {
        zzatq zzatsVar;
        Parcel parcelM19945P = m19945P(11, m19944H());
        IBinder strongBinder = parcelM19945P.readStrongBinder();
        if (strongBinder == null) {
            zzatsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzatsVar = iInterfaceQueryLocalInterface instanceof zzatq ? (zzatq) iInterfaceQueryLocalInterface : new zzats(strongBinder);
        }
        parcelM19945P.recycle();
        return zzatsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    /* renamed from: W1 */
    public final void mo16379W1(zzxz zzxzVar, zzaub zzaubVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19950d(parcelM19944H, zzxzVar);
        zzfo.m19949c(parcelM19944H, zzaubVar);
        m19946k0(1, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    /* renamed from: e7 */
    public final void mo16380e7(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        zzfo.m19947a(parcelM19944H, z);
        m19946k0(10, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    /* renamed from: f5 */
    public final void mo16381f5(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        m19946k0(5, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final Bundle getAdMetadata() throws RemoteException {
        Parcel parcelM19945P = m19945P(9, m19944H());
        Bundle bundle = (Bundle) zzfo.m19948b(parcelM19945P, Bundle.CREATOR);
        parcelM19945P.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel parcelM19945P = m19945P(4, m19944H());
        String string = parcelM19945P.readString();
        parcelM19945P.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final boolean isLoaded() throws RemoteException {
        Parcel parcelM19945P = m19945P(3, m19944H());
        boolean zM19951e = zzfo.m19951e(parcelM19945P);
        parcelM19945P.recycle();
        return zM19951e;
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    /* renamed from: m2 */
    public final void mo16382m2(zzaum zzaumVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19950d(parcelM19944H, zzaumVar);
        m19946k0(7, parcelM19944H);
    }
}
