package v7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: v7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4902d implements Parcelable.Creator<com.google.android.gms.measurement.internal.J> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.measurement.internal.J createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        String strF = null;
        com.google.android.gms.measurement.internal.F f10 = null;
        String strF2 = null;
        long jU = 0;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            int iL = SafeParcelReader.l(iR);
            if (iL == 2) {
                strF = SafeParcelReader.f(parcel, iR);
            } else if (iL == 3) {
                f10 = (com.google.android.gms.measurement.internal.F) SafeParcelReader.e(parcel, iR, com.google.android.gms.measurement.internal.F.CREATOR);
            } else if (iL == 4) {
                strF2 = SafeParcelReader.f(parcel, iR);
            } else if (iL != 5) {
                SafeParcelReader.x(parcel, iR);
            } else {
                jU = SafeParcelReader.u(parcel, iR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new com.google.android.gms.measurement.internal.J(strF, f10, strF2, jU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.measurement.internal.J[] newArray(int i10) {
        return new com.google.android.gms.measurement.internal.J[i10];
    }
}
