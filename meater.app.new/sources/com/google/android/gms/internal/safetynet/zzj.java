package com.google.android.gms.internal.safetynet;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzj extends zza implements zzi {
    zzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.safetynet.internal.ISafetyNetService");
    }

    @Override // com.google.android.gms.internal.safetynet.zzi
    /* renamed from: M1 */
    public final void mo22629M1(zzg zzgVar) throws RemoteException {
        Parcel parcelM22615H = m22615H();
        zzc.m22619b(parcelM22615H, zzgVar);
        m22616P(5, parcelM22615H);
    }
}
