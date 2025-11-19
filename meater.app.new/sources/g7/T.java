package g7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import r7.BinderC4358c;
import r7.C4359d;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public abstract class T extends BinderC4358c implements InterfaceC3440k {
    public T() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // r7.BinderC4358c
    protected final boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            int i12 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) C4359d.a(parcel, Bundle.CREATOR);
            C4359d.b(parcel);
            r0(i12, strongBinder, bundle);
        } else if (i10 == 2) {
            int i13 = parcel.readInt();
            Bundle bundle2 = (Bundle) C4359d.a(parcel, Bundle.CREATOR);
            C4359d.b(parcel);
            U(i13, bundle2);
        } else {
            if (i10 != 3) {
                return false;
            }
            int i14 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            h0 h0Var = (h0) C4359d.a(parcel, h0.CREATOR);
            C4359d.b(parcel);
            Y(i14, strongBinder2, h0Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
