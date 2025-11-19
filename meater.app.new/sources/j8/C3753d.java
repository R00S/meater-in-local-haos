package j8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.play:review@@2.0.2 */
/* renamed from: j8.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3753d extends C3750a implements f {
    C3753d(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j8.f
    public final void y0(String str, Bundle bundle, h hVar) {
        Parcel parcelC = c();
        parcelC.writeString(str);
        int i10 = C3752c.f43539a;
        parcelC.writeInt(1);
        bundle.writeToParcel(parcelC, 0);
        parcelC.writeStrongBinder(hVar);
        g(2, parcelC);
    }
}
