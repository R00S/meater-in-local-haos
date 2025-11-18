package g7;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c7.C2333b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
public final class P implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        int iT = 0;
        boolean zM = false;
        boolean zM2 = false;
        IBinder iBinderS = null;
        C2333b c2333b = null;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            int iL = SafeParcelReader.l(iR);
            if (iL == 1) {
                iT = SafeParcelReader.t(parcel, iR);
            } else if (iL == 2) {
                iBinderS = SafeParcelReader.s(parcel, iR);
            } else if (iL == 3) {
                c2333b = (C2333b) SafeParcelReader.e(parcel, iR, C2333b.CREATOR);
            } else if (iL == 4) {
                zM = SafeParcelReader.m(parcel, iR);
            } else if (iL != 5) {
                SafeParcelReader.x(parcel, iR);
            } else {
                zM2 = SafeParcelReader.m(parcel, iR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new O(iT, iBinderS, c2333b, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new O[i10];
    }
}
