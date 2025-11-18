package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
public abstract class Z0 extends BinderC2437b0 implements InterfaceC2429a1 {
    public Z0() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.BinderC2437b0
    protected final boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            Bundle bundle = (Bundle) C2428a0.a(parcel, Bundle.CREATOR);
            long j10 = parcel.readLong();
            C2428a0.f(parcel);
            E0(string, string2, bundle, j10);
            parcel2.writeNoException();
        } else {
            if (i10 != 2) {
                return false;
            }
            int iA = a();
            parcel2.writeNoException();
            parcel2.writeInt(iA);
        }
        return true;
    }
}
