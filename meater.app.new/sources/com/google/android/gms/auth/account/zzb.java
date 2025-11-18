package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzb extends com.google.android.gms.internal.auth.zzb implements zza {
    public zzb() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    /* renamed from: H */
    protected final boolean mo13603H(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            m13602n5((Account) com.google.android.gms.internal.auth.zzc.m20879a(parcel, Account.CREATOR));
        } else {
            if (i2 != 2) {
                return false;
            }
            m13601B0(com.google.android.gms.internal.auth.zzc.m20880b(parcel));
        }
        return true;
    }
}
