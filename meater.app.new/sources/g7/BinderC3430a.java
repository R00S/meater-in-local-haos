package g7;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import g7.InterfaceC3439j;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: g7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class BinderC3430a extends InterfaceC3439j.a {
    public static Account k(InterfaceC3439j interfaceC3439j) {
        Account accountB = null;
        if (interfaceC3439j != null) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                try {
                    accountB = interfaceC3439j.b();
                } catch (RemoteException unused) {
                    Log.w("AccountAccessor", "Remote account accessor probably died");
                }
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
        return accountB;
    }
}
