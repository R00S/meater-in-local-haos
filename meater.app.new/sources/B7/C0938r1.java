package B7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: B7.r1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0938r1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            if (SafeParcelReader.l(iR) != 2) {
                SafeParcelReader.x(parcel, iR);
            } else {
                iT = SafeParcelReader.t(parcel, iR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new C0936q1(iT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C0936q1[i10];
    }
}
