package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzafc extends zzfm implements zzafa {
    zzafc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* renamed from: D0 */
    public final zzaei mo16493D0() throws RemoteException {
        zzaei zzaekVar;
        Parcel parcelM19945P = m19945P(6, m19944H());
        IBinder strongBinder = parcelM19945P.readStrongBinder();
        if (strongBinder == null) {
            zzaekVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzaekVar = iInterfaceQueryLocalInterface instanceof zzaei ? (zzaei) iInterfaceQueryLocalInterface : new zzaek(strongBinder);
        }
        parcelM19945P.recycle();
        return zzaekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* renamed from: E */
    public final boolean mo16494E(Bundle bundle) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19950d(parcelM19944H, bundle);
        Parcel parcelM19945P = m19945P(13, parcelM19944H);
        boolean zM19951e = zzfo.m19951e(parcelM19945P);
        parcelM19945P.recycle();
        return zM19951e;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* renamed from: L */
    public final void mo16495L(Bundle bundle) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19950d(parcelM19944H, bundle);
        m19946k0(14, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void destroy() throws RemoteException {
        m19946k0(10, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* renamed from: f */
    public final zzaea mo16496f() throws RemoteException {
        zzaea zzaecVar;
        Parcel parcelM19945P = m19945P(15, m19944H());
        IBinder strongBinder = parcelM19945P.readStrongBinder();
        if (strongBinder == null) {
            zzaecVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzaecVar = iInterfaceQueryLocalInterface instanceof zzaea ? (zzaea) iInterfaceQueryLocalInterface : new zzaec(strongBinder);
        }
        parcelM19945P.recycle();
        return zzaecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* renamed from: g */
    public final String mo16497g() throws RemoteException {
        Parcel parcelM19945P = m19945P(3, m19944H());
        String string = parcelM19945P.readString();
        parcelM19945P.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final Bundle getExtras() throws RemoteException {
        Parcel parcelM19945P = m19945P(9, m19944H());
        Bundle bundle = (Bundle) zzfo.m19948b(parcelM19945P, Bundle.CREATOR);
        parcelM19945P.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel parcelM19945P = m19945P(17, m19944H());
        String string = parcelM19945P.readString();
        parcelM19945P.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final zzaar getVideoController() throws RemoteException {
        Parcel parcelM19945P = m19945P(11, m19944H());
        zzaar zzaarVarM16201h7 = zzaas.m16201h7(parcelM19945P.readStrongBinder());
        parcelM19945P.recycle();
        return zzaarVarM16201h7;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* renamed from: h */
    public final String mo16498h() throws RemoteException {
        Parcel parcelM19945P = m19945P(7, m19944H());
        String string = parcelM19945P.readString();
        parcelM19945P.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* renamed from: i */
    public final String mo16499i() throws RemoteException {
        Parcel parcelM19945P = m19945P(5, m19944H());
        String string = parcelM19945P.readString();
        parcelM19945P.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* renamed from: k */
    public final List mo16501k() throws RemoteException {
        Parcel parcelM19945P = m19945P(4, m19944H());
        ArrayList arrayListM19952f = zzfo.m19952f(parcelM19945P);
        parcelM19945P.recycle();
        return arrayListM19952f;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* renamed from: r */
    public final IObjectWrapper mo16502r() throws RemoteException {
        Parcel parcelM19945P = m19945P(2, m19944H());
        IObjectWrapper iObjectWrapperM14707P = IObjectWrapper.Stub.m14707P(parcelM19945P.readStrongBinder());
        parcelM19945P.recycle();
        return iObjectWrapperM14707P;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* renamed from: w */
    public final String mo16503w() throws RemoteException {
        Parcel parcelM19945P = m19945P(8, m19944H());
        String string = parcelM19945P.readString();
        parcelM19945P.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    /* renamed from: z */
    public final void mo16504z(Bundle bundle) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19950d(parcelM19944H, bundle);
        m19946k0(12, parcelM19944H);
    }
}
