package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzl;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public abstract class zzy extends zzb implements zzx {
    public zzy() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    /* renamed from: H */
    protected final boolean mo13603H(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 1:
                mo20881J5((Status) zzc.m20879a(parcel, Status.CREATOR));
                return true;
            case 2:
                mo20882Q0((Status) zzc.m20879a(parcel, Status.CREATOR), (com.google.android.gms.auth.api.accounttransfer.zzt) zzc.m20879a(parcel, com.google.android.gms.auth.api.accounttransfer.zzt.CREATOR));
                return true;
            case 3:
                mo20887j1((Status) zzc.m20879a(parcel, Status.CREATOR), (zzl) zzc.m20879a(parcel, zzl.CREATOR));
                return true;
            case 4:
                mo20885d();
                return true;
            case 5:
                mo20883R5((Status) zzc.m20879a(parcel, Status.CREATOR));
                return true;
            case 6:
                mo20886i0(parcel.createByteArray());
                return true;
            case 7:
                mo20884S2((DeviceMetaData) zzc.m20879a(parcel, DeviceMetaData.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
