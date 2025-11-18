package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzadm extends zzfn implements zzadl {
    public zzadm() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzfn
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            String strMo16454M5 = mo16454M5();
            parcel2.writeNoException();
            parcel2.writeString(strMo16454M5);
        } else if (i2 == 2) {
            String content = getContent();
            parcel2.writeNoException();
            parcel2.writeString(content);
        } else if (i2 == 3) {
            mo16455z1(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
            parcel2.writeNoException();
        } else if (i2 == 4) {
            recordClick();
            parcel2.writeNoException();
        } else {
            if (i2 != 5) {
                return false;
            }
            recordImpression();
            parcel2.writeNoException();
        }
        return true;
    }
}
