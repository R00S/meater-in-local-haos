package B7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class S1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        String strF = null;
        String strF2 = null;
        N1 n12 = null;
        String strF3 = null;
        String strF4 = null;
        Float fQ = null;
        V1 v12 = null;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            switch (SafeParcelReader.l(iR)) {
                case 1:
                    strF = SafeParcelReader.f(parcel, iR);
                    break;
                case 2:
                    strF2 = SafeParcelReader.f(parcel, iR);
                    break;
                case 3:
                    n12 = (N1) SafeParcelReader.e(parcel, iR, N1.CREATOR);
                    break;
                case 4:
                    strF3 = SafeParcelReader.f(parcel, iR);
                    break;
                case 5:
                    strF4 = SafeParcelReader.f(parcel, iR);
                    break;
                case 6:
                    fQ = SafeParcelReader.q(parcel, iR);
                    break;
                case 7:
                    v12 = (V1) SafeParcelReader.e(parcel, iR, V1.CREATOR);
                    break;
                default:
                    SafeParcelReader.x(parcel, iR);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new R1(strF, strF2, n12, strF3, strF4, fQ, v12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new R1[i10];
    }
}
