package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzg extends zza implements zze {
    zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // com.google.android.gms.internal.ads_identifier.zze
    /* renamed from: c */
    public final boolean mo20863c() throws RemoteException {
        Parcel parcelM20860P = m20860P(6, m20859H());
        boolean zM20862b = zzc.m20862b(parcelM20860P);
        parcelM20860P.recycle();
        return zM20862b;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zze
    /* renamed from: g0 */
    public final boolean mo20864g0(boolean z) throws RemoteException {
        Parcel parcelM20859H = m20859H();
        zzc.m20861a(parcelM20859H, true);
        Parcel parcelM20860P = m20860P(2, parcelM20859H);
        boolean zM20862b = zzc.m20862b(parcelM20860P);
        parcelM20860P.recycle();
        return zM20862b;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zze
    public final String getId() throws RemoteException {
        Parcel parcelM20860P = m20860P(1, m20859H());
        String string = parcelM20860P.readString();
        parcelM20860P.recycle();
        return string;
    }
}
