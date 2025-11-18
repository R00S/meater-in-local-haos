package e8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* renamed from: e8.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3246i extends C3238a implements InterfaceC3248k {
    C3246i(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e8.InterfaceC3248k
    public final void Z0(String str, Bundle bundle, InterfaceC3250m interfaceC3250m) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        C3245h.c(parcelC, bundle);
        parcelC.writeStrongBinder(interfaceC3250m);
        g(2, parcelC);
    }
}
