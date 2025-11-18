package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzanf extends zzfm implements zzand {
    zzanf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzand
    /* renamed from: A */
    public final void mo16762A(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        m19946k0(14, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzand
    /* renamed from: C */
    public final boolean mo16763C() throws RemoteException {
        Parcel parcelM19945P = m19945P(11, m19944H());
        boolean zM19951e = zzfo.m19951e(parcelM19945P);
        parcelM19945P.recycle();
        return zM19951e;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    /* renamed from: C0 */
    public final void mo16764C0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        m19946k0(10, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzand
    /* renamed from: D */
    public final void mo16765D(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        zzfo.m19949c(parcelM19944H, iObjectWrapper2);
        zzfo.m19949c(parcelM19944H, iObjectWrapper3);
        m19946k0(22, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzand
    /* renamed from: D0 */
    public final zzaei mo16766D0() throws RemoteException {
        Parcel parcelM19945P = m19945P(5, m19944H());
        zzaei zzaeiVarM16473h7 = zzaej.m16473h7(parcelM19945P.readStrongBinder());
        parcelM19945P.recycle();
        return zzaeiVarM16473h7;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    /* renamed from: I */
    public final IObjectWrapper mo16767I() throws RemoteException {
        Parcel parcelM19945P = m19945P(20, m19944H());
        IObjectWrapper iObjectWrapperM14707P = IObjectWrapper.Stub.m14707P(parcelM19945P.readStrongBinder());
        parcelM19945P.recycle();
        return iObjectWrapperM14707P;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    /* renamed from: K */
    public final IObjectWrapper mo16768K() throws RemoteException {
        Parcel parcelM19945P = m19945P(15, m19944H());
        IObjectWrapper iObjectWrapperM14707P = IObjectWrapper.Stub.m14707P(parcelM19945P.readStrongBinder());
        parcelM19945P.recycle();
        return iObjectWrapperM14707P;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    /* renamed from: M */
    public final boolean mo16769M() throws RemoteException {
        Parcel parcelM19945P = m19945P(12, m19944H());
        boolean zM19951e = zzfo.m19951e(parcelM19945P);
        parcelM19945P.recycle();
        return zM19951e;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    /* renamed from: N */
    public final void mo16770N(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        m19946k0(9, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzand
    /* renamed from: f */
    public final zzaea mo16771f() throws RemoteException {
        Parcel parcelM19945P = m19945P(19, m19944H());
        zzaea zzaeaVarM16471h7 = zzaeb.m16471h7(parcelM19945P.readStrongBinder());
        parcelM19945P.recycle();
        return zzaeaVarM16471h7;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    /* renamed from: g */
    public final String mo16772g() throws RemoteException {
        Parcel parcelM19945P = m19945P(2, m19944H());
        String string = parcelM19945P.readString();
        parcelM19945P.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final Bundle getExtras() throws RemoteException {
        Parcel parcelM19945P = m19945P(13, m19944H());
        Bundle bundle = (Bundle) zzfo.m19948b(parcelM19945P, Bundle.CREATOR);
        parcelM19945P.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final zzaar getVideoController() throws RemoteException {
        Parcel parcelM19945P = m19945P(16, m19944H());
        zzaar zzaarVarM16201h7 = zzaas.m16201h7(parcelM19945P.readStrongBinder());
        parcelM19945P.recycle();
        return zzaarVarM16201h7;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    /* renamed from: h */
    public final String mo16773h() throws RemoteException {
        Parcel parcelM19945P = m19945P(6, m19944H());
        String string = parcelM19945P.readString();
        parcelM19945P.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    /* renamed from: i */
    public final String mo16774i() throws RemoteException {
        Parcel parcelM19945P = m19945P(4, m19944H());
        String string = parcelM19945P.readString();
        parcelM19945P.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    /* renamed from: j */
    public final IObjectWrapper mo16775j() throws RemoteException {
        Parcel parcelM19945P = m19945P(21, m19944H());
        IObjectWrapper iObjectWrapperM14707P = IObjectWrapper.Stub.m14707P(parcelM19945P.readStrongBinder());
        parcelM19945P.recycle();
        return iObjectWrapperM14707P;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    /* renamed from: k */
    public final List mo16776k() throws RemoteException {
        Parcel parcelM19945P = m19945P(3, m19944H());
        ArrayList arrayListM19952f = zzfo.m19952f(parcelM19945P);
        parcelM19945P.recycle();
        return arrayListM19952f;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final void recordImpression() throws RemoteException {
        m19946k0(8, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzand
    /* renamed from: w */
    public final String mo16777w() throws RemoteException {
        Parcel parcelM19945P = m19945P(7, m19944H());
        String string = parcelM19945P.readString();
        parcelM19945P.recycle();
        return string;
    }
}
