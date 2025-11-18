package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzu extends zza implements zzs {
    zzu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzs
    /* renamed from: a */
    public final int mo22561a() throws RemoteException {
        Parcel parcelM21489P = m21489P(2, m21488H());
        int i2 = parcelM21489P.readInt();
        parcelM21489P.recycle();
        return i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzs
    /* renamed from: q4 */
    public final void mo22562q4(String str, String str2, Bundle bundle, long j2) throws RemoteException {
        Parcel parcelM21488H = m21488H();
        parcelM21488H.writeString(str);
        parcelM21488H.writeString(str2);
        zzb.m21493c(parcelM21488H, bundle);
        parcelM21488H.writeLong(j2);
        m21490k0(1, parcelM21488H);
    }
}
