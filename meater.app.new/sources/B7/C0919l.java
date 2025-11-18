package B7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: B7.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0919l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            int iL = SafeParcelReader.l(iR);
            if (iL == 2) {
                strF = SafeParcelReader.f(parcel, iR);
            } else if (iL == 3) {
                strF2 = SafeParcelReader.f(parcel, iR);
            } else if (iL != 4) {
                SafeParcelReader.x(parcel, iR);
            } else {
                strF3 = SafeParcelReader.f(parcel, iR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new C0916k(strF, strF2, strF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C0916k[i10];
    }
}
