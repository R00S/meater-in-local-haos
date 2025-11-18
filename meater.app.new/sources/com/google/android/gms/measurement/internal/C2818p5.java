package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.p5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2818p5 implements Parcelable.Creator<C2797m5> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2797m5 createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        String strF = null;
        long jU = 0;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            int iL = SafeParcelReader.l(iR);
            if (iL == 1) {
                strF = SafeParcelReader.f(parcel, iR);
            } else if (iL == 2) {
                jU = SafeParcelReader.u(parcel, iR);
            } else if (iL != 3) {
                SafeParcelReader.x(parcel, iR);
            } else {
                iT = SafeParcelReader.t(parcel, iR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new C2797m5(strF, jU, iT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2797m5[] newArray(int i10) {
        return new C2797m5[i10];
    }
}
