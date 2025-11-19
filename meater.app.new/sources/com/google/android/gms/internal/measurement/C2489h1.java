package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.h1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2489h1 implements Parcelable.Creator<C2456d1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2456d1 createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        long jU = 0;
        long jU2 = 0;
        boolean zM = false;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        Bundle bundleA = null;
        String strF4 = null;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            switch (SafeParcelReader.l(iR)) {
                case 1:
                    jU = SafeParcelReader.u(parcel, iR);
                    break;
                case 2:
                    jU2 = SafeParcelReader.u(parcel, iR);
                    break;
                case 3:
                    zM = SafeParcelReader.m(parcel, iR);
                    break;
                case 4:
                    strF = SafeParcelReader.f(parcel, iR);
                    break;
                case 5:
                    strF2 = SafeParcelReader.f(parcel, iR);
                    break;
                case 6:
                    strF3 = SafeParcelReader.f(parcel, iR);
                    break;
                case 7:
                    bundleA = SafeParcelReader.a(parcel, iR);
                    break;
                case 8:
                    strF4 = SafeParcelReader.f(parcel, iR);
                    break;
                default:
                    SafeParcelReader.x(parcel, iR);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new C2456d1(jU, jU2, zM, strF, strF2, strF3, bundleA, strF4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2456d1[] newArray(int i10) {
        return new C2456d1[i10];
    }
}
