package B7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: B7.h1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0909h1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        int iT = 0;
        String strF = null;
        String strF2 = null;
        boolean zM = false;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            int iL = SafeParcelReader.l(iR);
            if (iL == 2) {
                strF = SafeParcelReader.f(parcel, iR);
            } else if (iL == 3) {
                strF2 = SafeParcelReader.f(parcel, iR);
            } else if (iL == 4) {
                iT = SafeParcelReader.t(parcel, iR);
            } else if (iL != 5) {
                SafeParcelReader.x(parcel, iR);
            } else {
                zM = SafeParcelReader.m(parcel, iR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new C0906g1(strF, strF2, iT, zM);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C0906g1[i10];
    }
}
