package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzanh extends zzfn implements zzang {
    public zzanh() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    /* renamed from: h7 */
    public static zzang m16796h7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return iInterfaceQueryLocalInterface instanceof zzang ? (zzang) iInterfaceQueryLocalInterface : new zzani(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 2:
                String strMo16787g = mo16787g();
                parcel2.writeNoException();
                parcel2.writeString(strMo16787g);
                return true;
            case 3:
                List listMo16791k = mo16791k();
                parcel2.writeNoException();
                parcel2.writeList(listMo16791k);
                return true;
            case 4:
                String strMo16789i = mo16789i();
                parcel2.writeNoException();
                parcel2.writeString(strMo16789i);
                return true;
            case 5:
                zzaei zzaeiVarMo16792n = mo16792n();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, zzaeiVarMo16792n);
                return true;
            case 6:
                String strMo16788h = mo16788h();
                parcel2.writeNoException();
                parcel2.writeString(strMo16788h);
                return true;
            case 7:
                String strMo16795w = mo16795w();
                parcel2.writeNoException();
                parcel2.writeString(strMo16795w);
                return true;
            case 8:
                double dMo16794t = mo16794t();
                parcel2.writeNoException();
                parcel2.writeDouble(dMo16794t);
                return true;
            case 9:
                String store = getStore();
                parcel2.writeNoException();
                parcel2.writeString(store);
                return true;
            case 10:
                String strMo16793o = mo16793o();
                parcel2.writeNoException();
                parcel2.writeString(strMo16793o);
                return true;
            case 11:
                zzaar videoController = getVideoController();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, videoController);
                return true;
            case 12:
                zzaea zzaeaVarMo16786f = mo16786f();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, zzaeaVarMo16786f);
                return true;
            case 13:
                IObjectWrapper iObjectWrapperMo16782K = mo16782K();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, iObjectWrapperMo16782K);
                return true;
            case 14:
                IObjectWrapper iObjectWrapperMo16781I = mo16781I();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, iObjectWrapperMo16781I);
                return true;
            case 15:
                IObjectWrapper iObjectWrapperMo16790j = mo16790j();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, iObjectWrapperMo16790j);
                return true;
            case 16:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                zzfo.m19953g(parcel2, extras);
                return true;
            case 17:
                boolean zMo16779C = mo16779C();
                parcel2.writeNoException();
                zzfo.m19947a(parcel2, zMo16779C);
                return true;
            case 18:
                boolean zMo16783M = mo16783M();
                parcel2.writeNoException();
                zzfo.m19947a(parcel2, zMo16783M);
                return true;
            case 19:
                recordImpression();
                parcel2.writeNoException();
                return true;
            case 20:
                mo16784N(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 21:
                mo16780D(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                mo16778A(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 23:
                float fMo16785X3 = mo16785X3();
                parcel2.writeNoException();
                parcel2.writeFloat(fMo16785X3);
                return true;
            default:
                return false;
        }
    }
}
