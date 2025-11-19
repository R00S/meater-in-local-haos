package B7;

import A7.C0865t;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.wearable.C2638a;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class N0 extends C2638a implements IInterface {
    N0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wearable.internal.IWearableService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u1(J0 j02, C0949v0 c0949v0) {
        Parcel parcelK = k();
        int i10 = com.google.android.gms.internal.wearable.Z.f34550a;
        parcelK.writeStrongBinder(j02);
        com.google.android.gms.internal.wearable.Z.c(parcelK, c0949v0);
        c(16, parcelK);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v1(J0 j02) {
        Parcel parcelK = k();
        int i10 = com.google.android.gms.internal.wearable.Z.f34550a;
        parcelK.writeStrongBinder(j02);
        c(15, parcelK);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w1(J0 j02, C0865t c0865t) {
        Parcel parcelK = k();
        int i10 = com.google.android.gms.internal.wearable.Z.f34550a;
        parcelK.writeStrongBinder(j02);
        com.google.android.gms.internal.wearable.Z.c(parcelK, c0865t);
        c(6, parcelK);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x1(J0 j02, String str, String str2, byte[] bArr) {
        Parcel parcelK = k();
        int i10 = com.google.android.gms.internal.wearable.Z.f34550a;
        parcelK.writeStrongBinder(j02);
        parcelK.writeString(str);
        parcelK.writeString(str2);
        parcelK.writeByteArray(bArr);
        c(12, parcelK);
    }
}
