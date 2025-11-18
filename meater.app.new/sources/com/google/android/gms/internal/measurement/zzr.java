package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* loaded from: classes2.dex */
public abstract class zzr extends zzc implements zzs {
    public zzr() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzc
    /* renamed from: H */
    protected final boolean mo22099H(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            mo22562q4(parcel.readString(), parcel.readString(), (Bundle) zzb.m21491a(parcel, Bundle.CREATOR), parcel.readLong());
            parcel2.writeNoException();
        } else {
            if (i2 != 2) {
                return false;
            }
            int iMo22561a = mo22561a();
            parcel2.writeNoException();
            parcel2.writeInt(iMo22561a);
        }
        return true;
    }
}
