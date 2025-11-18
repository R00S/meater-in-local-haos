package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.IAccountAccessor;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public class AccountAccessor extends IAccountAccessor.Stub {
    @KeepForSdk
    /* renamed from: k0 */
    public static Account m14281k0(IAccountAccessor iAccountAccessor) {
        Account accountMo14282b = null;
        if (iAccountAccessor != null) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                try {
                    accountMo14282b = iAccountAccessor.mo14282b();
                } catch (RemoteException unused) {
                    Log.w("AccountAccessor", "Remote account accessor probably died");
                }
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
        return accountMo14282b;
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    /* renamed from: b */
    public final Account mo14282b() {
        throw null;
    }

    public final boolean equals(Object obj) {
        throw null;
    }
}
