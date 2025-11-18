package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.s5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2838s5 implements Parcelable.Creator<C2845t5> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2845t5 createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        long jU = 0;
        long jU2 = 0;
        byte[] bArrB = null;
        String strF = null;
        Bundle bundleA = null;
        String strF2 = null;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            switch (SafeParcelReader.l(iR)) {
                case 1:
                    jU = SafeParcelReader.u(parcel, iR);
                    break;
                case 2:
                    bArrB = SafeParcelReader.b(parcel, iR);
                    break;
                case 3:
                    strF = SafeParcelReader.f(parcel, iR);
                    break;
                case 4:
                    bundleA = SafeParcelReader.a(parcel, iR);
                    break;
                case 5:
                    iT = SafeParcelReader.t(parcel, iR);
                    break;
                case 6:
                    jU2 = SafeParcelReader.u(parcel, iR);
                    break;
                case 7:
                    strF2 = SafeParcelReader.f(parcel, iR);
                    break;
                default:
                    SafeParcelReader.x(parcel, iR);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new C2845t5(jU, bArrB, strF, bundleA, iT, jU2, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2845t5[] newArray(int i10) {
        return new C2845t5[i10];
    }
}
