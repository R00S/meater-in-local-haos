package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzaeb extends zzfn implements zzaea {
    public zzaeb() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    /* renamed from: h7 */
    public static zzaea m16471h7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return iInterfaceQueryLocalInterface instanceof zzaea ? (zzaea) iInterfaceQueryLocalInterface : new zzaec(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 2) {
            String strMo16464m1 = mo16464m1();
            parcel2.writeNoException();
            parcel2.writeString(strMo16464m1);
            return true;
        }
        if (i2 != 3) {
            return false;
        }
        List<zzaei> listMo16459M0 = mo16459M0();
        parcel2.writeNoException();
        parcel2.writeList(listMo16459M0);
        return true;
    }
}
