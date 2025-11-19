package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class O5 implements Parcelable.Creator<P5> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ P5 createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        int iT = 0;
        String strF = null;
        Long lV = null;
        Float fQ = null;
        String strF2 = null;
        String strF3 = null;
        Double dP = null;
        long jU = 0;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            switch (SafeParcelReader.l(iR)) {
                case 1:
                    iT = SafeParcelReader.t(parcel, iR);
                    break;
                case 2:
                    strF = SafeParcelReader.f(parcel, iR);
                    break;
                case 3:
                    jU = SafeParcelReader.u(parcel, iR);
                    break;
                case 4:
                    lV = SafeParcelReader.v(parcel, iR);
                    break;
                case 5:
                    fQ = SafeParcelReader.q(parcel, iR);
                    break;
                case 6:
                    strF2 = SafeParcelReader.f(parcel, iR);
                    break;
                case 7:
                    strF3 = SafeParcelReader.f(parcel, iR);
                    break;
                case 8:
                    dP = SafeParcelReader.p(parcel, iR);
                    break;
                default:
                    SafeParcelReader.x(parcel, iR);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new P5(iT, strF, jU, lV, fQ, strF2, strF3, dP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ P5[] newArray(int i10) {
        return new P5[i10];
    }
}
