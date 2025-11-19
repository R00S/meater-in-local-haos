package b7;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* renamed from: b7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2254d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            if (SafeParcelReader.l(iR) != 1) {
                SafeParcelReader.x(parcel, iR);
            } else {
                intent = (Intent) SafeParcelReader.e(parcel, iR, Intent.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new C2251a(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2251a[i10];
    }
}
