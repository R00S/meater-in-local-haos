package x7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import g7.M;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* renamed from: x7.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5073k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        M m10 = null;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            int iL = SafeParcelReader.l(iR);
            if (iL == 1) {
                iT = SafeParcelReader.t(parcel, iR);
            } else if (iL != 2) {
                SafeParcelReader.x(parcel, iR);
            } else {
                m10 = (M) SafeParcelReader.e(parcel, iR, M.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new C5072j(iT, m10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5072j[i10];
    }
}
