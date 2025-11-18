package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.base.zab;

/* loaded from: classes2.dex */
public abstract class zak extends zab implements zaj {
    public zak() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    /* renamed from: E3 */
    protected boolean mo14025E3(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 != 1) {
            return false;
        }
        mo14492z2(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
