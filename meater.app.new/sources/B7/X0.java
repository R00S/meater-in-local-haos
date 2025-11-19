package B7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class X0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        String strF = null;
        String strF2 = null;
        int iT = 0;
        byte[] bArrB = null;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            int iL = SafeParcelReader.l(iR);
            if (iL == 2) {
                iT = SafeParcelReader.t(parcel, iR);
            } else if (iL == 3) {
                strF = SafeParcelReader.f(parcel, iR);
            } else if (iL == 4) {
                bArrB = SafeParcelReader.b(parcel, iR);
            } else if (iL != 5) {
                SafeParcelReader.x(parcel, iR);
            } else {
                strF2 = SafeParcelReader.f(parcel, iR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new W0(iT, strF, bArrB, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new W0[i10];
    }
}
