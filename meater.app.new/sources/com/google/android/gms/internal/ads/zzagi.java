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
public final class zzagi extends zzfm implements zzagg {
    zzagi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: D6 */
    public final void mo16535D6() throws RemoteException {
        m19946k0(28, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: E */
    public final boolean mo16536E(Bundle bundle) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19950d(parcelM19944H, bundle);
        Parcel parcelM19945P = m19945P(16, parcelM19944H);
        boolean zM19951e = zzfo.m19951e(parcelM19945P);
        parcelM19945P.recycle();
        return zM19951e;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: G0 */
    public final void mo16537G0(zzaag zzaagVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, zzaagVar);
        m19946k0(26, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: L */
    public final void mo16538L(Bundle bundle) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19950d(parcelM19944H, bundle);
        m19946k0(17, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: W */
    public final void mo16539W() throws RemoteException {
        m19946k0(22, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: d0 */
    public final void mo16540d0(zzagd zzagdVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, zzagdVar);
        m19946k0(21, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final void destroy() throws RemoteException {
        m19946k0(13, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: e0 */
    public final void mo16541e0(zzaak zzaakVar) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, zzaakVar);
        m19946k0(25, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: f */
    public final zzaea mo16542f() throws RemoteException {
        zzaea zzaecVar;
        Parcel parcelM19945P = m19945P(14, m19944H());
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

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: g */
    public final String mo16543g() throws RemoteException {
        Parcel parcelM19945P = m19945P(2, m19944H());
        String string = parcelM19945P.readString();
        parcelM19945P.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final Bundle getExtras() throws RemoteException {
        Parcel parcelM19945P = m19945P(20, m19944H());
        Bundle bundle = (Bundle) zzfo.m19948b(parcelM19945P, Bundle.CREATOR);
        parcelM19945P.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel parcelM19945P = m19945P(12, m19944H());
        String string = parcelM19945P.readString();
        parcelM19945P.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final String getStore() throws RemoteException {
        Parcel parcelM19945P = m19945P(9, m19944H());
        String string = parcelM19945P.readString();
        parcelM19945P.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    public final zzaar getVideoController() throws RemoteException {
        Parcel parcelM19945P = m19945P(11, m19944H());
        zzaar zzaarVarM16201h7 = zzaas.m16201h7(parcelM19945P.readStrongBinder());
        parcelM19945P.recycle();
        return zzaarVarM16201h7;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: h */
    public final String mo16544h() throws RemoteException {
        Parcel parcelM19945P = m19945P(6, m19944H());
        String string = parcelM19945P.readString();
        parcelM19945P.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: i */
    public final String mo16545i() throws RemoteException {
        Parcel parcelM19945P = m19945P(4, m19944H());
        String string = parcelM19945P.readString();
        parcelM19945P.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: j */
    public final IObjectWrapper mo16546j() throws RemoteException {
        Parcel parcelM19945P = m19945P(19, m19944H());
        IObjectWrapper iObjectWrapperM14707P = IObjectWrapper.Stub.m14707P(parcelM19945P.readStrongBinder());
        parcelM19945P.recycle();
        return iObjectWrapperM14707P;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: j0 */
    public final void mo16547j0() throws RemoteException {
        m19946k0(27, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: k */
    public final List mo16548k() throws RemoteException {
        Parcel parcelM19945P = m19945P(3, m19944H());
        ArrayList arrayListM19952f = zzfo.m19952f(parcelM19945P);
        parcelM19945P.recycle();
        return arrayListM19952f;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: n */
    public final zzaei mo16549n() throws RemoteException {
        zzaei zzaekVar;
        Parcel parcelM19945P = m19945P(5, m19944H());
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

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: n2 */
    public final zzaee mo16550n2() throws RemoteException {
        zzaee zzaegVar;
        Parcel parcelM19945P = m19945P(29, m19944H());
        IBinder strongBinder = parcelM19945P.readStrongBinder();
        if (strongBinder == null) {
            zzaegVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzaegVar = iInterfaceQueryLocalInterface instanceof zzaee ? (zzaee) iInterfaceQueryLocalInterface : new zzaeg(strongBinder);
        }
        parcelM19945P.recycle();
        return zzaegVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: o */
    public final String mo16551o() throws RemoteException {
        Parcel parcelM19945P = m19945P(10, m19944H());
        String string = parcelM19945P.readString();
        parcelM19945P.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: r */
    public final IObjectWrapper mo16552r() throws RemoteException {
        Parcel parcelM19945P = m19945P(18, m19944H());
        IObjectWrapper iObjectWrapperM14707P = IObjectWrapper.Stub.m14707P(parcelM19945P.readStrongBinder());
        parcelM19945P.recycle();
        return iObjectWrapperM14707P;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: t */
    public final double mo16553t() throws RemoteException {
        Parcel parcelM19945P = m19945P(8, m19944H());
        double d2 = parcelM19945P.readDouble();
        parcelM19945P.recycle();
        return d2;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: u2 */
    public final boolean mo16554u2() throws RemoteException {
        Parcel parcelM19945P = m19945P(24, m19944H());
        boolean zM19951e = zzfo.m19951e(parcelM19945P);
        parcelM19945P.recycle();
        return zM19951e;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: u4 */
    public final List mo16555u4() throws RemoteException {
        Parcel parcelM19945P = m19945P(23, m19944H());
        ArrayList arrayListM19952f = zzfo.m19952f(parcelM19945P);
        parcelM19945P.recycle();
        return arrayListM19952f;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: w */
    public final String mo16556w() throws RemoteException {
        Parcel parcelM19945P = m19945P(7, m19944H());
        String string = parcelM19945P.readString();
        parcelM19945P.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzagg
    /* renamed from: z */
    public final void mo16557z(Bundle bundle) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19950d(parcelM19944H, bundle);
        m19946k0(15, parcelM19944H);
    }
}
