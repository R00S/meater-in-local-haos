package B7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: B7.l1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0921l1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        long jU = 0;
        String strF = null;
        String strF2 = null;
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
                jU = SafeParcelReader.u(parcel, iR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new C0918k1(strF, strF2, jU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C0918k1[i10];
    }
}
