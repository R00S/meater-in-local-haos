package j8;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.play:review@@2.0.2 */
/* loaded from: classes2.dex */
public abstract class e extends BinderC3751b implements f {
    public static f g(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        return iInterfaceQueryLocalInterface instanceof f ? (f) iInterfaceQueryLocalInterface : new C3753d(iBinder);
    }
}
