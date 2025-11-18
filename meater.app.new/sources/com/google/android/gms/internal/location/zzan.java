package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzan extends zzb implements zzam {
    public zzan() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    @Override // com.google.android.gms.internal.location.zzb
    /* renamed from: H */
    protected final boolean mo20951H(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            m20952Q5(parcel.readInt(), parcel.createStringArray());
        } else if (i2 == 2) {
            m20953f7(parcel.readInt(), parcel.createStringArray());
        } else {
            if (i2 != 3) {
                return false;
            }
            m20954v3(parcel.readInt(), (PendingIntent) zzc.m20965a(parcel, PendingIntent.CREATOR));
        }
        return true;
    }
}
