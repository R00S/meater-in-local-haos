package B7;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class X implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            int iL = SafeParcelReader.l(iR);
            if (iL == 2) {
                iT = SafeParcelReader.t(parcel, iR);
            } else if (iL != 3) {
                SafeParcelReader.x(parcel, iR);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.e(parcel, iR, ParcelFileDescriptor.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new W(iT, parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new W[i10];
    }
}
