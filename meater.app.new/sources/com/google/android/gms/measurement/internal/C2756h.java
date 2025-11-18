package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2756h implements Parcelable.Creator<C2735e> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2735e createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        long jU = 0;
        long jU2 = 0;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            int iL = SafeParcelReader.l(iR);
            if (iL == 1) {
                jU = SafeParcelReader.u(parcel, iR);
            } else if (iL == 2) {
                iT = SafeParcelReader.t(parcel, iR);
            } else if (iL != 3) {
                SafeParcelReader.x(parcel, iR);
            } else {
                jU2 = SafeParcelReader.u(parcel, iR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new C2735e(jU, iT, jU2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2735e[] newArray(int i10) {
        return new C2735e[i10];
    }
}
