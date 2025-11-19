package g7;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import r7.BinderC4358c;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: g7.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC3439j extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    /* renamed from: g7.j$a */
    public static abstract class a extends BinderC4358c implements InterfaceC3439j {
        public static InterfaceC3439j g(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterfaceQueryLocalInterface instanceof InterfaceC3439j ? (InterfaceC3439j) iInterfaceQueryLocalInterface : new t0(iBinder);
        }
    }

    Account b();
}
