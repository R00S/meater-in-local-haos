package o7;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* loaded from: classes2.dex */
public final class d extends C4140a implements f {
    d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // o7.f
    public final boolean F(boolean z10) {
        Parcel parcelC = c();
        c.a(parcelC, true);
        Parcel parcelG = g(2, parcelC);
        boolean zB = c.b(parcelG);
        parcelG.recycle();
        return zB;
    }

    @Override // o7.f
    public final String d() {
        Parcel parcelG = g(1, c());
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }
}
