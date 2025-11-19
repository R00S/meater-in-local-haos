package A7;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class M implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        int iT = 0;
        Uri uri = null;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            int iL = SafeParcelReader.l(iR);
            if (iL == 1) {
                uri = (Uri) SafeParcelReader.e(parcel, iR, Uri.CREATOR);
            } else if (iL != 2) {
                SafeParcelReader.x(parcel, iR);
            } else {
                iT = SafeParcelReader.t(parcel, iR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new L(uri, iT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new L[i10];
    }
}
