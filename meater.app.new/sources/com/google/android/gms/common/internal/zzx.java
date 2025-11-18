package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzx extends zza implements zzz {
    zzx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.zzz
    /* renamed from: c */
    public final int mo14276c() throws RemoteException {
        Parcel parcelM20909H = m20909H(2, m20911k0());
        int i2 = parcelM20909H.readInt();
        parcelM20909H.recycle();
        return i2;
    }

    @Override // com.google.android.gms.common.internal.zzz
    /* renamed from: d */
    public final IObjectWrapper mo14277d() throws RemoteException {
        Parcel parcelM20909H = m20909H(1, m20911k0());
        IObjectWrapper iObjectWrapperM14707P = IObjectWrapper.Stub.m14707P(parcelM20909H.readStrongBinder());
        parcelM20909H.recycle();
        return iObjectWrapperM14707P;
    }
}
