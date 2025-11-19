package B7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.wearable.C2638a;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class H0 extends C2638a implements IInterface {
    H0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wearable.internal.IRpcResponseCallback");
    }

    public final void u1(boolean z10, byte[] bArr) {
        Parcel parcelK = k();
        int i10 = com.google.android.gms.internal.wearable.Z.f34550a;
        parcelK.writeInt(z10 ? 1 : 0);
        parcelK.writeByteArray(bArr);
        g(1, parcelK);
    }
}
