package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzaex extends zzfn implements zzaew {
    public zzaex() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 2:
                IObjectWrapper iObjectWrapperMo16488r = mo16488r();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, iObjectWrapperMo16488r);
                return true;
            case 3:
                String strMo16481g = mo16481g();
                parcel2.writeNoException();
                parcel2.writeString(strMo16481g);
                return true;
            case 4:
                List listMo16485k = mo16485k();
                parcel2.writeNoException();
                parcel2.writeList(listMo16485k);
                return true;
            case 5:
                String strMo16483i = mo16483i();
                parcel2.writeNoException();
                parcel2.writeString(strMo16483i);
                return true;
            case 6:
                zzaei zzaeiVarMo16486n = mo16486n();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, zzaeiVarMo16486n);
                return true;
            case 7:
                String strMo16482h = mo16482h();
                parcel2.writeNoException();
                parcel2.writeString(strMo16482h);
                return true;
            case 8:
                double dMo16489t = mo16489t();
                parcel2.writeNoException();
                parcel2.writeDouble(dMo16489t);
                return true;
            case 9:
                String store = getStore();
                parcel2.writeNoException();
                parcel2.writeString(store);
                return true;
            case 10:
                String strMo16487o = mo16487o();
                parcel2.writeNoException();
                parcel2.writeString(strMo16487o);
                return true;
            case 11:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                zzfo.m19953g(parcel2, extras);
                return true;
            case 12:
                destroy();
                parcel2.writeNoException();
                return true;
            case 13:
                zzaar videoController = getVideoController();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, videoController);
                return true;
            case 14:
                mo16490z((Bundle) zzfo.m19948b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zMo16478E = mo16478E((Bundle) zzfo.m19948b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzfo.m19947a(parcel2, zMo16478E);
                return true;
            case 16:
                mo16479L((Bundle) zzfo.m19948b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                zzaea zzaeaVarMo16480f = mo16480f();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, zzaeaVarMo16480f);
                return true;
            case 18:
                IObjectWrapper iObjectWrapperMo16484j = mo16484j();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, iObjectWrapperMo16484j);
                return true;
            case 19:
                String mediationAdapterClassName = getMediationAdapterClassName();
                parcel2.writeNoException();
                parcel2.writeString(mediationAdapterClassName);
                return true;
            default:
                return false;
        }
    }
}
