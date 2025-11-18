package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzv extends com.google.android.gms.internal.location.zzb implements zzu {
    public zzv() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    /* renamed from: P */
    public static zzu m22657P(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return iInterfaceQueryLocalInterface instanceof zzu ? (zzu) iInterfaceQueryLocalInterface : new zzw(iBinder);
    }

    @Override // com.google.android.gms.internal.location.zzb
    /* renamed from: H */
    protected final boolean mo20951H(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            mo20944W4((LocationResult) com.google.android.gms.internal.location.zzc.m20965a(parcel, LocationResult.CREATOR));
        } else {
            if (i2 != 2) {
                return false;
            }
            mo20943P3((LocationAvailability) com.google.android.gms.internal.location.zzc.m20965a(parcel, LocationAvailability.CREATOR));
        }
        return true;
    }
}
