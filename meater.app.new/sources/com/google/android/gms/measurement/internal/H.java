package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class H implements Parcelable.Creator<F> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ F createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        Bundle bundleA = null;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            if (SafeParcelReader.l(iR) != 2) {
                SafeParcelReader.x(parcel, iR);
            } else {
                bundleA = SafeParcelReader.a(parcel, iR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new F(bundleA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ F[] newArray(int i10) {
        return new F[i10];
    }
}
