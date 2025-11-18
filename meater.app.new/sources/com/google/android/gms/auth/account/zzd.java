package com.google.android.gms.auth.account;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public abstract class zzd extends com.google.android.gms.internal.auth.zzb implements zzc {
    /* renamed from: P */
    public static zzc m13604P(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        return iInterfaceQueryLocalInterface instanceof zzc ? (zzc) iInterfaceQueryLocalInterface : new zze(iBinder);
    }
}
