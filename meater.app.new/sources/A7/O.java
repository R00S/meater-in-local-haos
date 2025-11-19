package A7;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class O implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        long jU = 0;
        Uri uri = null;
        Bundle bundleA = null;
        byte[] bArrB = null;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            int iL = SafeParcelReader.l(iR);
            if (iL == 2) {
                uri = (Uri) SafeParcelReader.e(parcel, iR, Uri.CREATOR);
            } else if (iL == 4) {
                bundleA = SafeParcelReader.a(parcel, iR);
            } else if (iL == 5) {
                bArrB = SafeParcelReader.b(parcel, iR);
            } else if (iL != 6) {
                SafeParcelReader.x(parcel, iR);
            } else {
                jU = SafeParcelReader.u(parcel, iR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new C0865t(uri, bundleA, bArrB, jU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C0865t[i10];
    }
}
