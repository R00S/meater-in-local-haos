package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzafg extends zzfm implements zzafe {
    zzafg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    /* renamed from: F3 */
    public final boolean mo16506F3(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        zzfo.m19949c(parcelM19944H, iObjectWrapper);
        Parcel parcelM19945P = m19945P(10, parcelM19944H);
        boolean zM19951e = zzfo.m19951e(parcelM19945P);
        parcelM19945P.recycle();
        return zM19951e;
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    /* renamed from: N1 */
    public final zzaei mo16507N1(String str) throws RemoteException {
        zzaei zzaekVar;
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeString(str);
        Parcel parcelM19945P = m19945P(2, parcelM19944H);
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

    @Override // com.google.android.gms.internal.ads.zzafe
    /* renamed from: U4 */
    public final IObjectWrapper mo16508U4() throws RemoteException {
        Parcel parcelM19945P = m19945P(9, m19944H());
        IObjectWrapper iObjectWrapperM14707P = IObjectWrapper.Stub.m14707P(parcelM19945P.readStrongBinder());
        parcelM19945P.recycle();
        return iObjectWrapperM14707P;
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    /* renamed from: Y0 */
    public final String mo16509Y0(String str) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeString(str);
        Parcel parcelM19945P = m19945P(1, parcelM19944H);
        String string = parcelM19945P.readString();
        parcelM19945P.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final void destroy() throws RemoteException {
        m19946k0(8, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final List<String> getAvailableAssetNames() throws RemoteException {
        Parcel parcelM19945P = m19945P(3, m19944H());
        ArrayList<String> arrayListCreateStringArrayList = parcelM19945P.createStringArrayList();
        parcelM19945P.recycle();
        return arrayListCreateStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final String getCustomTemplateId() throws RemoteException {
        Parcel parcelM19945P = m19945P(4, m19944H());
        String string = parcelM19945P.readString();
        parcelM19945P.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final zzaar getVideoController() throws RemoteException {
        Parcel parcelM19945P = m19945P(7, m19944H());
        zzaar zzaarVarM16201h7 = zzaas.m16201h7(parcelM19945P.readStrongBinder());
        parcelM19945P.recycle();
        return zzaarVarM16201h7;
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final void performClick(String str) throws RemoteException {
        Parcel parcelM19944H = m19944H();
        parcelM19944H.writeString(str);
        m19946k0(5, parcelM19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final void recordImpression() throws RemoteException {
        m19946k0(6, m19944H());
    }
}
