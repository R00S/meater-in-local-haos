package e8;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* renamed from: e8.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class BinderC3244g extends Binder implements IInterface {
    protected BinderC3244g(String str) {
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    protected boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        throw null;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        return c(i10, parcel, parcel2, i11);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
