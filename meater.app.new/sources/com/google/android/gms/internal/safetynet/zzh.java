package com.google.android.gms.internal.safetynet;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafeBrowsingData;
import com.google.android.gms.safetynet.zzd;
import com.google.android.gms.safetynet.zzf;

/* loaded from: classes2.dex */
public abstract class zzh extends zzb implements zzg {
    public zzh() {
        super("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
    }

    @Override // com.google.android.gms.internal.safetynet.zzb
    /* renamed from: H */
    protected final boolean mo22617H(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            mo22626s1((Status) zzc.m22618a(parcel, Status.CREATOR), (com.google.android.gms.safetynet.zza) zzc.m22618a(parcel, com.google.android.gms.safetynet.zza.CREATOR));
        } else if (i2 == 2) {
            mo22627u(parcel.readString());
        } else if (i2 == 3) {
            mo22623H2((Status) zzc.m22618a(parcel, Status.CREATOR), (SafeBrowsingData) zzc.m22618a(parcel, SafeBrowsingData.CREATOR));
        } else if (i2 == 4) {
            mo22621A6((Status) zzc.m22618a(parcel, Status.CREATOR), zzc.m22620c(parcel));
        } else if (i2 == 6) {
            mo22625R3((Status) zzc.m22618a(parcel, Status.CREATOR), (zzf) zzc.m22618a(parcel, zzf.CREATOR));
        } else if (i2 == 8) {
            mo22614s5((Status) zzc.m22618a(parcel, Status.CREATOR), (zzd) zzc.m22618a(parcel, zzd.CREATOR));
        } else if (i2 == 15) {
            mo22624H5((Status) zzc.m22618a(parcel, Status.CREATOR), (com.google.android.gms.safetynet.zzh) zzc.m22618a(parcel, com.google.android.gms.safetynet.zzh.CREATOR));
        } else if (i2 == 10) {
            mo22622E5((Status) zzc.m22618a(parcel, Status.CREATOR), zzc.m22620c(parcel));
        } else {
            if (i2 != 11) {
                return false;
            }
            mo22628y0((Status) zzc.m22618a(parcel, Status.CREATOR));
        }
        return true;
    }
}
