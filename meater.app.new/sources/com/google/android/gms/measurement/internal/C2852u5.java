package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.u5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2852u5 implements Parcelable.Creator<C2859v5> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2859v5 createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        ArrayList arrayListJ = null;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            if (SafeParcelReader.l(iR) != 1) {
                SafeParcelReader.x(parcel, iR);
            } else {
                arrayListJ = SafeParcelReader.j(parcel, iR, C2845t5.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new C2859v5(arrayListJ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2859v5[] newArray(int i10) {
        return new C2859v5[i10];
    }
}
