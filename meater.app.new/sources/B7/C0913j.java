package B7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: B7.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0913j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        int iT = 0;
        int iT2 = 0;
        C0916k c0916k = null;
        int iT3 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            int iL = SafeParcelReader.l(iR);
            if (iL == 2) {
                c0916k = (C0916k) SafeParcelReader.e(parcel, iR, C0916k.CREATOR);
            } else if (iL == 3) {
                iT = SafeParcelReader.t(parcel, iR);
            } else if (iL == 4) {
                iT3 = SafeParcelReader.t(parcel, iR);
            } else if (iL != 5) {
                SafeParcelReader.x(parcel, iR);
            } else {
                iT2 = SafeParcelReader.t(parcel, iR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new C0910i(c0916k, iT, iT3, iT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C0910i[i10];
    }
}
