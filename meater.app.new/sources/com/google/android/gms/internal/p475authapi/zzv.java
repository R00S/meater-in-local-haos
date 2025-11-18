package com.google.android.gms.internal.p475authapi;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public abstract class zzv extends zzd implements zzu {
    public zzv() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    @Override // com.google.android.gms.internal.p475authapi.zzd
    /* renamed from: H */
    protected final boolean mo13739H(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            mo20875L3((Status) zze.m20871a(parcel, Status.CREATOR), (Credential) zze.m20871a(parcel, Credential.CREATOR));
        } else if (i2 == 2) {
            mo20874K6((Status) zze.m20871a(parcel, Status.CREATOR));
        } else {
            if (i2 != 3) {
                return false;
            }
            mo20876P6((Status) zze.m20871a(parcel, Status.CREATOR), parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
