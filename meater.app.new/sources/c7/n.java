package c7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public final class n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        long jU = -1;
        int iT = 0;
        String strF = null;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            int iL = SafeParcelReader.l(iR);
            if (iL == 1) {
                strF = SafeParcelReader.f(parcel, iR);
            } else if (iL == 2) {
                iT = SafeParcelReader.t(parcel, iR);
            } else if (iL != 3) {
                SafeParcelReader.x(parcel, iR);
            } else {
                jU = SafeParcelReader.u(parcel, iR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new C2335d(strF, iT, jU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2335d[i10];
    }
}
