package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzane extends zzfn implements zzand {
    public zzane() {
        super("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 2:
                String strMo16772g = mo16772g();
                parcel2.writeNoException();
                parcel2.writeString(strMo16772g);
                return true;
            case 3:
                List listMo16776k = mo16776k();
                parcel2.writeNoException();
                parcel2.writeList(listMo16776k);
                return true;
            case 4:
                String strMo16774i = mo16774i();
                parcel2.writeNoException();
                parcel2.writeString(strMo16774i);
                return true;
            case 5:
                zzaei zzaeiVarMo16766D0 = mo16766D0();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, zzaeiVarMo16766D0);
                return true;
            case 6:
                String strMo16773h = mo16773h();
                parcel2.writeNoException();
                parcel2.writeString(strMo16773h);
                return true;
            case 7:
                String strMo16777w = mo16777w();
                parcel2.writeNoException();
                parcel2.writeString(strMo16777w);
                return true;
            case 8:
                recordImpression();
                parcel2.writeNoException();
                return true;
            case 9:
                mo16770N(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 10:
                mo16764C0(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 11:
                boolean zMo16763C = mo16763C();
                parcel2.writeNoException();
                zzfo.m19947a(parcel2, zMo16763C);
                return true;
            case 12:
                boolean zMo16769M = mo16769M();
                parcel2.writeNoException();
                zzfo.m19947a(parcel2, zMo16769M);
                return true;
            case 13:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                zzfo.m19953g(parcel2, extras);
                return true;
            case 14:
                mo16762A(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                IObjectWrapper iObjectWrapperMo16768K = mo16768K();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, iObjectWrapperMo16768K);
                return true;
            case 16:
                zzaar videoController = getVideoController();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, videoController);
                return true;
            case 17:
            case 18:
            default:
                return false;
            case 19:
                zzaea zzaeaVarMo16771f = mo16771f();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, zzaeaVarMo16771f);
                return true;
            case 20:
                IObjectWrapper iObjectWrapperMo16767I = mo16767I();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, iObjectWrapperMo16767I);
                return true;
            case 21:
                IObjectWrapper iObjectWrapperMo16775j = mo16775j();
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, iObjectWrapperMo16775j);
                return true;
            case 22:
                mo16765D(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
        }
    }
}
