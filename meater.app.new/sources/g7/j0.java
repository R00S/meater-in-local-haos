package g7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public final class j0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        r rVar = null;
        int[] iArrC = null;
        int[] iArrC2 = null;
        boolean zM = false;
        boolean zM2 = false;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            switch (SafeParcelReader.l(iR)) {
                case 1:
                    rVar = (r) SafeParcelReader.e(parcel, iR, r.CREATOR);
                    break;
                case 2:
                    zM = SafeParcelReader.m(parcel, iR);
                    break;
                case 3:
                    zM2 = SafeParcelReader.m(parcel, iR);
                    break;
                case 4:
                    iArrC = SafeParcelReader.c(parcel, iR);
                    break;
                case 5:
                    iT = SafeParcelReader.t(parcel, iR);
                    break;
                case 6:
                    iArrC2 = SafeParcelReader.c(parcel, iR);
                    break;
                default:
                    SafeParcelReader.x(parcel, iR);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new C3435f(rVar, zM, zM2, iArrC, iT, iArrC2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3435f[i10];
    }
}
