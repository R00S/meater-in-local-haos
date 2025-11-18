package x7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p7.C4242a;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* renamed from: x7.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5069g extends C4242a implements IInterface {
    C5069g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void u1(C5072j c5072j, InterfaceC5068f interfaceC5068f) {
        Parcel parcelC = c();
        p7.c.c(parcelC, c5072j);
        p7.c.d(parcelC, interfaceC5068f);
        g(12, parcelC);
    }
}
