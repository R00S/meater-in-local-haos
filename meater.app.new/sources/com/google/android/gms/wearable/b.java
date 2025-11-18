package com.google.android.gms.wearable;

import A7.H;
import A7.J;
import C9.h;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        int iT = 0;
        int iT2 = 0;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        int iT3 = 0;
        boolean zM4 = false;
        int iT4 = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        ArrayList<String> arrayListH = null;
        J j10 = null;
        H h10 = null;
        boolean zM5 = true;
        boolean zM6 = true;
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
                    iT = SafeParcelReader.t(parcel, iR);
                    break;
                case 5:
                    iT2 = SafeParcelReader.t(parcel, iR);
                    break;
                case 6:
                    zM = SafeParcelReader.m(parcel, iR);
                    break;
                case 7:
                    zM2 = SafeParcelReader.m(parcel, iR);
                    break;
                case 8:
                    strF3 = SafeParcelReader.f(parcel, iR);
                    break;
                case 9:
                    zM3 = SafeParcelReader.m(parcel, iR);
                    break;
                case h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    strF4 = SafeParcelReader.f(parcel, iR);
                    break;
                case h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    strF5 = SafeParcelReader.f(parcel, iR);
                    break;
                case h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    iT3 = SafeParcelReader.t(parcel, iR);
                    break;
                case h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    arrayListH = SafeParcelReader.h(parcel, iR);
                    break;
                case 14:
                    zM4 = SafeParcelReader.m(parcel, iR);
                    break;
                case 15:
                    zM5 = SafeParcelReader.m(parcel, iR);
                    break;
                case 16:
                    j10 = (J) SafeParcelReader.e(parcel, iR, J.CREATOR);
                    break;
                case 17:
                    zM6 = SafeParcelReader.m(parcel, iR);
                    break;
                case 18:
                    h10 = (H) SafeParcelReader.e(parcel, iR, H.CREATOR);
                    break;
                case 19:
                    iT4 = SafeParcelReader.t(parcel, iR);
                    break;
                default:
                    SafeParcelReader.x(parcel, iR);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new ConnectionConfiguration(strF, strF2, iT, iT2, zM, zM2, strF3, zM3, strF4, strF5, iT3, arrayListH, zM4, zM5, j10, zM6, h10, iT4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ConnectionConfiguration[i10];
    }
}
