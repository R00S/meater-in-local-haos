package e8;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* renamed from: e8.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3247j extends BinderC3244g implements InterfaceC3248k {
    public static InterfaceC3248k g(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3248k ? (InterfaceC3248k) iInterfaceQueryLocalInterface : new C3246i(iBinder);
    }
}
