package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzaaa extends zzfm implements zzzy {
    zzaaa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
    }

    @Override // com.google.android.gms.internal.ads.zzzy
    public final long getValue() throws RemoteException {
        Parcel parcelM19945P = m19945P(1, m19944H());
        long j2 = parcelM19945P.readLong();
        parcelM19945P.recycle();
        return j2;
    }
}
