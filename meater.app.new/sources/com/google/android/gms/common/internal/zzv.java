package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zza;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzv extends zza implements IAccountAccessor {
    zzv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    /* renamed from: b */
    public final Account mo14282b() throws RemoteException {
        Parcel parcelM20909H = m20909H(2, m20911k0());
        Account account = (Account) com.google.android.gms.internal.common.zzc.m20921a(parcelM20909H, Account.CREATOR);
        parcelM20909H.recycle();
        return account;
    }
}
