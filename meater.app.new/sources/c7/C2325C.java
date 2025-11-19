package c7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: c7.C, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2325C implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        boolean zM = false;
        int iT = 0;
        String strF = null;
        int iT2 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            int iL = SafeParcelReader.l(iR);
            if (iL == 1) {
                zM = SafeParcelReader.m(parcel, iR);
            } else if (iL == 2) {
                strF = SafeParcelReader.f(parcel, iR);
            } else if (iL == 3) {
                iT2 = SafeParcelReader.t(parcel, iR);
            } else if (iL != 4) {
                SafeParcelReader.x(parcel, iR);
            } else {
                iT = SafeParcelReader.t(parcel, iR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new C2324B(zM, strF, iT2, iT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2324B[i10];
    }
}
