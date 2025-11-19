package v7;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.C2428a0;
import com.google.android.gms.measurement.internal.C2859v5;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: v7.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4912n extends com.google.android.gms.internal.measurement.Y implements InterfaceC4911m {
    C4912n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // v7.InterfaceC4911m
    public final void m(C2859v5 c2859v5) {
        Parcel parcelC = c();
        C2428a0.d(parcelC, c2859v5);
        u1(2, parcelC);
    }
}
