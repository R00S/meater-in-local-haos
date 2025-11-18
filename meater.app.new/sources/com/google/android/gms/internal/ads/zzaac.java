package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzaac extends zzfn implements zzaab {
    public zzaac() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 1:
                mo16179a();
                parcel2.writeNoException();
                return true;
            case 2:
                mo16183v5(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 3:
                mo16181e5(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 4:
                mo16180c2(zzfo.m19951e(parcel));
                parcel2.writeNoException();
                return true;
            case 5:
                mo16182t6(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                mo16171B2(parcel.readString(), IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                float fMo16172C4 = mo16172C4();
                parcel2.writeNoException();
                parcel2.writeFloat(fMo16172C4);
                return true;
            case 8:
                boolean zMo16174J3 = mo16174J3();
                parcel2.writeNoException();
                zzfo.m19947a(parcel2, zMo16174J3);
                return true;
            case 9:
                String strMo16173H3 = mo16173H3();
                parcel2.writeNoException();
                parcel2.writeString(strMo16173H3);
                return true;
            case 10:
                mo16175N2(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                mo16176O0(zzamq.m16696h7(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 12:
                mo16178Y1(zzaiu.m16592h7(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 13:
                List<zzaio> listMo16177T2 = mo16177T2();
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo16177T2);
                return true;
            default:
                return false;
        }
    }
}
