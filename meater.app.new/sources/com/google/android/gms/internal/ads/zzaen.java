package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzaen extends zzfn implements zzaem {
    public zzaen() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    /* renamed from: h7 */
    public static zzaem m16474h7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return iInterfaceQueryLocalInterface instanceof zzaem ? (zzaem) iInterfaceQueryLocalInterface : new zzaeo(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 1:
                mo16369d5(parcel.readString(), IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper iObjectWrapperMo16370n4 = mo16370n4(parcel.readString());
                parcel2.writeNoException();
                zzfo.m19949c(parcel2, iObjectWrapperMo16370n4);
                return true;
            case 3:
                mo16367V(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                destroy();
                parcel2.writeNoException();
                return true;
            case 5:
                mo16368X0(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 6:
                mo16371x0(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
