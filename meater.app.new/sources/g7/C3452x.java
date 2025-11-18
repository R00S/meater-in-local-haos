package g7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* renamed from: g7.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3452x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        ArrayList arrayListJ = null;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            int iL = SafeParcelReader.l(iR);
            if (iL == 1) {
                iT = SafeParcelReader.t(parcel, iR);
            } else if (iL != 2) {
                SafeParcelReader.x(parcel, iR);
            } else {
                arrayListJ = SafeParcelReader.j(parcel, iR, C3442m.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new C3448t(iT, arrayListJ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3448t[i10];
    }
}
