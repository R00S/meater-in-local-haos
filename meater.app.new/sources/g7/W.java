package g7;

import android.os.IBinder;
import android.os.IInterface;
import r7.BinderC4358c;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public abstract class W extends BinderC4358c implements X {
    public static X g(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return iInterfaceQueryLocalInterface instanceof X ? (X) iInterfaceQueryLocalInterface : new V(iBinder);
    }
}
