package A7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wearable.Term;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class P implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        int iT = 0;
        boolean zM = false;
        int iT2 = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            switch (SafeParcelReader.l(iR)) {
                case 1:
                    iT = SafeParcelReader.t(parcel, iR);
                    break;
                case 2:
                    strF = SafeParcelReader.f(parcel, iR);
                    break;
                case 3:
                    zM = SafeParcelReader.m(parcel, iR);
                    break;
                case 4:
                    strF2 = SafeParcelReader.f(parcel, iR);
                    break;
                case 5:
                    strF3 = SafeParcelReader.f(parcel, iR);
                    break;
                case 6:
                    iT2 = SafeParcelReader.t(parcel, iR);
                    break;
                default:
                    SafeParcelReader.x(parcel, iR);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new Term(iT, strF, zM, strF2, strF3, iT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Term[i10];
    }
}
