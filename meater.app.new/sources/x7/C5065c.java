package x7;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* renamed from: x7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5065c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        Intent intent = null;
        int iT = 0;
        int iT2 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            int iL = SafeParcelReader.l(iR);
            if (iL == 1) {
                iT = SafeParcelReader.t(parcel, iR);
            } else if (iL == 2) {
                iT2 = SafeParcelReader.t(parcel, iR);
            } else if (iL != 3) {
                SafeParcelReader.x(parcel, iR);
            } else {
                intent = (Intent) SafeParcelReader.e(parcel, iR, Intent.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new C5064b(iT, iT2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5064b[i10];
    }
}
