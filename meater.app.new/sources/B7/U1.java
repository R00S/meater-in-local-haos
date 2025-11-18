package B7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class U1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        ArrayList arrayListJ = null;
        int iT = 0;
        N1 n12 = null;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            int iL = SafeParcelReader.l(iR);
            if (iL == 1) {
                iT = SafeParcelReader.t(parcel, iR);
            } else if (iL == 2) {
                arrayListJ = SafeParcelReader.j(parcel, iR, R1.CREATOR);
            } else if (iL != 3) {
                SafeParcelReader.x(parcel, iR);
            } else {
                n12 = (N1) SafeParcelReader.e(parcel, iR, N1.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new T1(iT, arrayListJ, n12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new T1[i10];
    }
}
