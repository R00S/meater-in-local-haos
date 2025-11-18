package r7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: r7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class BinderC4358c extends Binder implements IInterface {
    protected BinderC4358c(String str) {
        attachInterface(this, str);
    }

    protected boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        return false;
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
