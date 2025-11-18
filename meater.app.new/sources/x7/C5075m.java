package x7;

import android.os.Parcel;
import android.os.Parcelable;
import c7.C2333b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import g7.O;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* renamed from: x7.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5075m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        C2333b c2333b = null;
        int iT = 0;
        O o10 = null;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            int iL = SafeParcelReader.l(iR);
            if (iL == 1) {
                iT = SafeParcelReader.t(parcel, iR);
            } else if (iL == 2) {
                c2333b = (C2333b) SafeParcelReader.e(parcel, iR, C2333b.CREATOR);
            } else if (iL != 3) {
                SafeParcelReader.x(parcel, iR);
            } else {
                o10 = (O) SafeParcelReader.e(parcel, iR, O.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new C5074l(iT, c2333b, o10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5074l[i10];
    }
}
