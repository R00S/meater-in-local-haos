package g7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import m7.InterfaceC3977a;
import r7.BinderC4358c;
import r7.C4359d;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public abstract class v0 extends BinderC4358c implements S {
    public v0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static S g(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return iInterfaceQueryLocalInterface instanceof S ? (S) iInterfaceQueryLocalInterface : new u0(iBinder);
    }

    @Override // r7.BinderC4358c
    protected final boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            InterfaceC3977a interfaceC3977aF = f();
            parcel2.writeNoException();
            C4359d.d(parcel2, interfaceC3977aF);
        } else {
            if (i10 != 2) {
                return false;
            }
            int iD = d();
            parcel2.writeNoException();
            parcel2.writeInt(iD);
        }
        return true;
    }
}
