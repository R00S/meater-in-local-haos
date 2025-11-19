package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2770j implements Parcelable.Creator<C2749g> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2749g createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        String strF = null;
        String strF2 = null;
        P5 p52 = null;
        String strF3 = null;
        J j10 = null;
        J j11 = null;
        J j12 = null;
        long jU = 0;
        long jU2 = 0;
        long jU3 = 0;
        boolean zM = false;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            switch (SafeParcelReader.l(iR)) {
                case 2:
                    strF = SafeParcelReader.f(parcel, iR);
                    break;
                case 3:
                    strF2 = SafeParcelReader.f(parcel, iR);
                    break;
                case 4:
                    p52 = (P5) SafeParcelReader.e(parcel, iR, P5.CREATOR);
                    break;
                case 5:
                    jU = SafeParcelReader.u(parcel, iR);
                    break;
                case 6:
                    zM = SafeParcelReader.m(parcel, iR);
                    break;
                case 7:
                    strF3 = SafeParcelReader.f(parcel, iR);
                    break;
                case 8:
                    j10 = (J) SafeParcelReader.e(parcel, iR, J.CREATOR);
                    break;
                case 9:
                    jU2 = SafeParcelReader.u(parcel, iR);
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    j11 = (J) SafeParcelReader.e(parcel, iR, J.CREATOR);
                    break;
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    jU3 = SafeParcelReader.u(parcel, iR);
                    break;
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    j12 = (J) SafeParcelReader.e(parcel, iR, J.CREATOR);
                    break;
                default:
                    SafeParcelReader.x(parcel, iR);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new C2749g(strF, strF2, p52, jU, zM, strF3, j10, jU2, j11, jU3, j12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2749g[] newArray(int i10) {
        return new C2749g[i10];
    }
}
