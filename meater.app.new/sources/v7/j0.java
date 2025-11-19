package v7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class j0 implements Parcelable.Creator<k0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k0 createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        ArrayList<Integer> arrayListD = null;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            if (SafeParcelReader.l(iR) != 1) {
                SafeParcelReader.x(parcel, iR);
            } else {
                arrayListD = SafeParcelReader.d(parcel, iR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new k0(arrayListD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k0[] newArray(int i10) {
        return new k0[i10];
    }
}
