package e8;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* renamed from: e8.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3249l extends BinderC3244g implements InterfaceC3250m {
    public AbstractBinderC3249l() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    @Override // e8.BinderC3244g
    protected final boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            Bundle bundle = (Bundle) C3245h.a(parcel, Bundle.CREATOR);
            C3245h.b(parcel);
            t0(bundle);
            return true;
        }
        if (i10 != 3) {
            return false;
        }
        Bundle bundle2 = (Bundle) C3245h.a(parcel, Bundle.CREATOR);
        C3245h.b(parcel);
        i(bundle2);
        return true;
    }
}
