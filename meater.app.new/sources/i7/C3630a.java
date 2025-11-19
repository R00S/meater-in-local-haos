package i7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import g7.C3448t;
import p7.C4242a;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* renamed from: i7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3630a extends C4242a implements IInterface {
    C3630a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void u1(C3448t c3448t) {
        Parcel parcelC = c();
        p7.c.c(parcelC, c3448t);
        k(1, parcelC);
    }
}
