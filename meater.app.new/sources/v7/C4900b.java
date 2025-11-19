package v7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: v7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4900b implements Parcelable.Creator<C4901c> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C4901c createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        Bundle bundleA = null;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            if (SafeParcelReader.l(iR) != 1) {
                SafeParcelReader.x(parcel, iR);
            } else {
                bundleA = SafeParcelReader.a(parcel, iR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new C4901c(bundleA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C4901c[] newArray(int i10) {
        return new C4901c[i10];
    }
}
