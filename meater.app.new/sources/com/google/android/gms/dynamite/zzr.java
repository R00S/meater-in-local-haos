package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzr extends zza implements IInterface {
    zzr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: E0 */
    public final IObjectWrapper m14737E0(IObjectWrapper iObjectWrapper, String str, int i2, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelM20911k0 = m20911k0();
        zzc.m20926f(parcelM20911k0, iObjectWrapper);
        parcelM20911k0.writeString(str);
        parcelM20911k0.writeInt(i2);
        zzc.m20926f(parcelM20911k0, iObjectWrapper2);
        Parcel parcelM20909H = m20909H(2, parcelM20911k0);
        IObjectWrapper iObjectWrapperM14707P = IObjectWrapper.Stub.m14707P(parcelM20909H.readStrongBinder());
        parcelM20909H.recycle();
        return iObjectWrapperM14707P;
    }

    /* renamed from: E3 */
    public final IObjectWrapper m14738E3(IObjectWrapper iObjectWrapper, String str, int i2, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelM20911k0 = m20911k0();
        zzc.m20926f(parcelM20911k0, iObjectWrapper);
        parcelM20911k0.writeString(str);
        parcelM20911k0.writeInt(i2);
        zzc.m20926f(parcelM20911k0, iObjectWrapper2);
        Parcel parcelM20909H = m20909H(3, parcelM20911k0);
        IObjectWrapper iObjectWrapperM14707P = IObjectWrapper.Stub.m14707P(parcelM20909H.readStrongBinder());
        parcelM20909H.recycle();
        return iObjectWrapperM14707P;
    }
}
