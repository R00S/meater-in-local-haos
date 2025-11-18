package g7;

import android.os.IBinder;
import android.os.Parcel;
import c7.C2324B;
import c7.C2326D;
import m7.InterfaceC3977a;
import r7.C4356a;
import r7.C4359d;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public final class V extends C4356a implements X {
    V(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // g7.X
    public final C2324B C0(c7.z zVar) {
        Parcel parcelG = g();
        C4359d.c(parcelG, zVar);
        Parcel parcelC = c(8, parcelG);
        C2324B c2324b = (C2324B) C4359d.a(parcelC, C2324B.CREATOR);
        parcelC.recycle();
        return c2324b;
    }

    @Override // g7.X
    public final boolean E(C2326D c2326d, InterfaceC3977a interfaceC3977a) {
        Parcel parcelG = g();
        C4359d.c(parcelG, c2326d);
        C4359d.d(parcelG, interfaceC3977a);
        Parcel parcelC = c(5, parcelG);
        boolean zE = C4359d.e(parcelC);
        parcelC.recycle();
        return zE;
    }

    @Override // g7.X
    public final boolean e() {
        Parcel parcelC = c(7, g());
        boolean zE = C4359d.e(parcelC);
        parcelC.recycle();
        return zE;
    }

    @Override // g7.X
    public final C2324B m0(c7.z zVar) {
        Parcel parcelG = g();
        C4359d.c(parcelG, zVar);
        Parcel parcelC = c(6, parcelG);
        C2324B c2324b = (C2324B) C4359d.a(parcelC, C2324B.CREATOR);
        parcelC.recycle();
        return c2324b;
    }
}
