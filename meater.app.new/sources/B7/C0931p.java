package B7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: B7.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0931p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        boolean zM = false;
        String strF = null;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            int iL = SafeParcelReader.l(iR);
            if (iL == 1) {
                strF = SafeParcelReader.f(parcel, iR);
            } else if (iL != 2) {
                SafeParcelReader.x(parcel, iR);
            } else {
                zM = SafeParcelReader.m(parcel, iR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new C0901f(strF, zM);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C0901f[i10];
    }
}
