package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.j1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2505j1 implements Parcelable.Creator<C2481g1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2481g1 createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        int iT = 0;
        String strF = null;
        Intent intent = null;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            int iL = SafeParcelReader.l(iR);
            if (iL == 1) {
                iT = SafeParcelReader.t(parcel, iR);
            } else if (iL == 2) {
                strF = SafeParcelReader.f(parcel, iR);
            } else if (iL != 3) {
                SafeParcelReader.x(parcel, iR);
            } else {
                intent = (Intent) SafeParcelReader.e(parcel, iR, Intent.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new C2481g1(iT, strF, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2481g1[] newArray(int i10) {
        return new C2481g1[i10];
    }
}
