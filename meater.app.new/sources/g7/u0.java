package g7;

import android.os.IBinder;
import android.os.Parcel;
import m7.InterfaceC3977a;
import r7.C4356a;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public final class u0 extends C4356a implements S {
    u0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // g7.S
    public final int d() {
        Parcel parcelC = c(2, g());
        int i10 = parcelC.readInt();
        parcelC.recycle();
        return i10;
    }

    @Override // g7.S
    public final InterfaceC3977a f() {
        Parcel parcelC = c(1, g());
        InterfaceC3977a interfaceC3977aG = InterfaceC3977a.AbstractBinderC0607a.g(parcelC.readStrongBinder());
        parcelC.recycle();
        return interfaceC3977aG;
    }
}
