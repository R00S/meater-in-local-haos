package g7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public final class a0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        int iT = 0;
        boolean zM = false;
        boolean zM2 = false;
        int iT2 = 0;
        int iT3 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            int iL = SafeParcelReader.l(iR);
            if (iL == 1) {
                iT = SafeParcelReader.t(parcel, iR);
            } else if (iL == 2) {
                zM = SafeParcelReader.m(parcel, iR);
            } else if (iL == 3) {
                zM2 = SafeParcelReader.m(parcel, iR);
            } else if (iL == 4) {
                iT2 = SafeParcelReader.t(parcel, iR);
            } else if (iL != 5) {
                SafeParcelReader.x(parcel, iR);
            } else {
                iT3 = SafeParcelReader.t(parcel, iR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new r(iT, zM, zM2, iT2, iT3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new r[i10];
    }
}
