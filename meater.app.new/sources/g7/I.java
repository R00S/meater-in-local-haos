package g7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
public final class I implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        int iT = -1;
        int iT2 = 0;
        int iT3 = 0;
        int iT4 = 0;
        int iT5 = 0;
        String strF = null;
        String strF2 = null;
        long jU = 0;
        long jU2 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            switch (SafeParcelReader.l(iR)) {
                case 1:
                    iT2 = SafeParcelReader.t(parcel, iR);
                    break;
                case 2:
                    iT3 = SafeParcelReader.t(parcel, iR);
                    break;
                case 3:
                    iT4 = SafeParcelReader.t(parcel, iR);
                    break;
                case 4:
                    jU = SafeParcelReader.u(parcel, iR);
                    break;
                case 5:
                    jU2 = SafeParcelReader.u(parcel, iR);
                    break;
                case 6:
                    strF = SafeParcelReader.f(parcel, iR);
                    break;
                case 7:
                    strF2 = SafeParcelReader.f(parcel, iR);
                    break;
                case 8:
                    iT5 = SafeParcelReader.t(parcel, iR);
                    break;
                case 9:
                    iT = SafeParcelReader.t(parcel, iR);
                    break;
                default:
                    SafeParcelReader.x(parcel, iR);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new C3442m(iT2, iT3, iT4, jU, jU2, strF, strF2, iT5, iT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3442m[i10];
    }
}
