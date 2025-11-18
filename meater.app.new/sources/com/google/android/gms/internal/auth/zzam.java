package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

/* loaded from: classes2.dex */
public abstract class zzam extends zzb implements zzal {
    public zzam() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    /* renamed from: H */
    protected final boolean mo13603H(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            mo20878g3((ProxyResponse) zzc.m20879a(parcel, ProxyResponse.CREATOR));
        } else {
            if (i2 != 2) {
                return false;
            }
            mo20877Y(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
