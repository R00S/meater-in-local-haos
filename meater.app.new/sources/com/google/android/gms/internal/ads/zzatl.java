package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzatl extends zzfn implements zzatk {
    public zzatl() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    /* renamed from: h7 */
    public static zzatk m16941h7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof zzatk ? (zzatk) iInterfaceQueryLocalInterface : new zzatm(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 1:
                mo15309c3(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                break;
            case 2:
                mo15303F1(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                mo15313w3(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                break;
            case 4:
                mo15311f1(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                break;
            case 5:
                mo15307a2(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                break;
            case 6:
                mo15306Y5(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                break;
            case 7:
                mo15305Y3(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), (zzato) zzfo.m19948b(parcel, zzato.CREATOR));
                break;
            case 8:
                mo15304G6(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                break;
            case 9:
                mo15312q2(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                mo15310e4(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                break;
            case 11:
                mo15308b5(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                break;
            case 12:
                zzb((Bundle) zzfo.m19948b(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
