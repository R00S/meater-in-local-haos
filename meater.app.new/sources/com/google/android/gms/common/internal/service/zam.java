package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zam extends com.google.android.gms.internal.base.zaa implements zal {
    zam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    @Override // com.google.android.gms.common.internal.service.zal
    /* renamed from: N0 */
    public final void mo14494N0(zaj zajVar) throws RemoteException {
        Parcel parcelM20890H = m20890H();
        com.google.android.gms.internal.base.zac.m20895c(parcelM20890H, zajVar);
        m20889E0(1, parcelM20890H);
    }
}
