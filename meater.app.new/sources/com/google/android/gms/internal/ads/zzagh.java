package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzagh extends zzfn implements zzagg {
    public zzagh() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzagd zzagfVar;
        switch (i2) {
            case 2:
                String strMo16543g = mo16543g();
                parcel2.writeNoException();
                parcel2.writeString(strMo16543g);
                return true;
            case 3:
                List listMo16548k = mo16548k();
                parcel2.writeNoException();
                parcel2.writeList(listMo16548k);
                return true;
            case 4:
                String strMo16545i = mo16545i();
                parcel2.writeNoException();
                parcel2.writeString(strMo16545i);
                return true;
            case 5:
                zzaei zzaeiVarMo16549n = mo16549n();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, zzaeiVarMo16549n);
                return true;
            case 6:
                String strMo16544h = mo16544h();
                parcel2.writeNoException();
                parcel2.writeString(strMo16544h);
                return true;
            case 7:
                String strMo16556w = mo16556w();
                parcel2.writeNoException();
                parcel2.writeString(strMo16556w);
                return true;
            case 8:
                double dMo16553t = mo16553t();
                parcel2.writeNoException();
                parcel2.writeDouble(dMo16553t);
                return true;
            case 9:
                String store = getStore();
                parcel2.writeNoException();
                parcel2.writeString(store);
                return true;
            case 10:
                String strMo16551o = mo16551o();
                parcel2.writeNoException();
                parcel2.writeString(strMo16551o);
                return true;
            case 11:
                zzaar videoController = getVideoController();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, videoController);
                return true;
            case 12:
                String mediationAdapterClassName = getMediationAdapterClassName();
                parcel2.writeNoException();
                parcel2.writeString(mediationAdapterClassName);
                return true;
            case 13:
                destroy();
                parcel2.writeNoException();
                return true;
            case 14:
                zzaea zzaeaVarMo16542f = mo16542f();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, zzaeaVarMo16542f);
                return true;
            case 15:
                mo16557z((Bundle) zzfo.m19948b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                boolean zMo16536E = mo16536E((Bundle) zzfo.m19948b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzfo.m19947a(parcel2, zMo16536E);
                return true;
            case 17:
                mo16538L((Bundle) zzfo.m19948b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 18:
                IObjectWrapper iObjectWrapperMo16552r = mo16552r();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, iObjectWrapperMo16552r);
                return true;
            case 19:
                IObjectWrapper iObjectWrapperMo16546j = mo16546j();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, iObjectWrapperMo16546j);
                return true;
            case 20:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                zzfo.m19953g(parcel2, extras);
                return true;
            case 21:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzagfVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    zzagfVar = iInterfaceQueryLocalInterface instanceof zzagd ? (zzagd) iInterfaceQueryLocalInterface : new zzagf(strongBinder);
                }
                mo16540d0(zzagfVar);
                parcel2.writeNoException();
                return true;
            case 22:
                mo16539W();
                parcel2.writeNoException();
                return true;
            case 23:
                List listMo16555u4 = mo16555u4();
                parcel2.writeNoException();
                parcel2.writeList(listMo16555u4);
                return true;
            case 24:
                boolean zMo16554u2 = mo16554u2();
                parcel2.writeNoException();
                zzfo.m19947a(parcel2, zMo16554u2);
                return true;
            case 25:
                mo16541e0(zzaal.m16187h7(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 26:
                mo16537G0(zzaah.m16185h7(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 27:
                mo16547j0();
                parcel2.writeNoException();
                return true;
            case 28:
                mo16535D6();
                parcel2.writeNoException();
                return true;
            case 29:
                zzaee zzaeeVarMo16550n2 = mo16550n2();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, zzaeeVarMo16550n2);
                return true;
            default:
                return false;
        }
    }
}
