package g7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c7.C2335d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public final class i0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        Bundle bundleA = null;
        C3435f c3435f = null;
        int iT = 0;
        C2335d[] c2335dArr = null;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            int iL = SafeParcelReader.l(iR);
            if (iL == 1) {
                bundleA = SafeParcelReader.a(parcel, iR);
            } else if (iL == 2) {
                c2335dArr = (C2335d[]) SafeParcelReader.i(parcel, iR, C2335d.CREATOR);
            } else if (iL == 3) {
                iT = SafeParcelReader.t(parcel, iR);
            } else if (iL != 4) {
                SafeParcelReader.x(parcel, iR);
            } else {
                c3435f = (C3435f) SafeParcelReader.e(parcel, iR, C3435f.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new h0(bundleA, c2335dArr, iT, c3435f);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new h0[i10];
    }
}
