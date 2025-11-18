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
public final class zzq extends zza implements IInterface {
    zzq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: E0 */
    public final int m14730E0() throws RemoteException {
        Parcel parcelM20909H = m20909H(6, m20911k0());
        int i2 = parcelM20909H.readInt();
        parcelM20909H.recycle();
        return i2;
    }

    /* renamed from: E3 */
    public final int m14731E3(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel parcelM20911k0 = m20911k0();
        zzc.m20926f(parcelM20911k0, iObjectWrapper);
        parcelM20911k0.writeString(str);
        zzc.m20923c(parcelM20911k0, z);
        Parcel parcelM20909H = m20909H(3, parcelM20911k0);
        int i2 = parcelM20909H.readInt();
        parcelM20909H.recycle();
        return i2;
    }

    /* renamed from: S4 */
    public final IObjectWrapper m14732S4(IObjectWrapper iObjectWrapper, String str, int i2, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelM20911k0 = m20911k0();
        zzc.m20926f(parcelM20911k0, iObjectWrapper);
        parcelM20911k0.writeString(str);
        parcelM20911k0.writeInt(i2);
        zzc.m20926f(parcelM20911k0, iObjectWrapper2);
        Parcel parcelM20909H = m20909H(8, parcelM20911k0);
        IObjectWrapper iObjectWrapperM14707P = IObjectWrapper.Stub.m14707P(parcelM20909H.readStrongBinder());
        parcelM20909H.recycle();
        return iObjectWrapperM14707P;
    }

    /* renamed from: V3 */
    public final int m14733V3(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel parcelM20911k0 = m20911k0();
        zzc.m20926f(parcelM20911k0, iObjectWrapper);
        parcelM20911k0.writeString(str);
        zzc.m20923c(parcelM20911k0, z);
        Parcel parcelM20909H = m20909H(5, parcelM20911k0);
        int i2 = parcelM20909H.readInt();
        parcelM20909H.recycle();
        return i2;
    }

    /* renamed from: Y4 */
    public final IObjectWrapper m14734Y4(IObjectWrapper iObjectWrapper, String str, int i2) throws RemoteException {
        Parcel parcelM20911k0 = m20911k0();
        zzc.m20926f(parcelM20911k0, iObjectWrapper);
        parcelM20911k0.writeString(str);
        parcelM20911k0.writeInt(i2);
        Parcel parcelM20909H = m20909H(4, parcelM20911k0);
        IObjectWrapper iObjectWrapperM14707P = IObjectWrapper.Stub.m14707P(parcelM20909H.readStrongBinder());
        parcelM20909H.recycle();
        return iObjectWrapperM14707P;
    }

    /* renamed from: p5 */
    public final IObjectWrapper m14735p5(IObjectWrapper iObjectWrapper, String str, boolean z, long j2) throws RemoteException {
        Parcel parcelM20911k0 = m20911k0();
        zzc.m20926f(parcelM20911k0, iObjectWrapper);
        parcelM20911k0.writeString(str);
        zzc.m20923c(parcelM20911k0, z);
        parcelM20911k0.writeLong(j2);
        Parcel parcelM20909H = m20909H(7, parcelM20911k0);
        IObjectWrapper iObjectWrapperM14707P = IObjectWrapper.Stub.m14707P(parcelM20909H.readStrongBinder());
        parcelM20909H.recycle();
        return iObjectWrapperM14707P;
    }

    /* renamed from: y4 */
    public final IObjectWrapper m14736y4(IObjectWrapper iObjectWrapper, String str, int i2) throws RemoteException {
        Parcel parcelM20911k0 = m20911k0();
        zzc.m20926f(parcelM20911k0, iObjectWrapper);
        parcelM20911k0.writeString(str);
        parcelM20911k0.writeInt(i2);
        Parcel parcelM20909H = m20909H(2, parcelM20911k0);
        IObjectWrapper iObjectWrapperM14707P = IObjectWrapper.Stub.m14707P(parcelM20909H.readStrongBinder());
        parcelM20909H.recycle();
        return iObjectWrapperM14707P;
    }
}
