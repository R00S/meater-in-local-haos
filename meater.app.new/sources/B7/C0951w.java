package B7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: B7.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0951w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        ArrayList arrayListJ = null;
        String strF = null;
        Long lV = null;
        int iT = 0;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        boolean zM4 = false;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            switch (SafeParcelReader.l(iR)) {
                case 1:
                    iT = SafeParcelReader.t(parcel, iR);
                    break;
                case 2:
                    zM = SafeParcelReader.m(parcel, iR);
                    break;
                case 3:
                    zM2 = SafeParcelReader.m(parcel, iR);
                    break;
                case 4:
                    zM3 = SafeParcelReader.m(parcel, iR);
                    break;
                case 5:
                    zM4 = SafeParcelReader.m(parcel, iR);
                    break;
                case 6:
                    arrayListJ = SafeParcelReader.j(parcel, iR, C0901f.CREATOR);
                    break;
                case 7:
                    strF = SafeParcelReader.f(parcel, iR);
                    break;
                case 8:
                    lV = SafeParcelReader.v(parcel, iR);
                    break;
                default:
                    SafeParcelReader.x(parcel, iR);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new C0948v(iT, zM, zM2, zM3, zM4, arrayListJ, strF, lV);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C0948v[i10];
    }
}
