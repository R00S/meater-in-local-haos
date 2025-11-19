package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.apptionlabs.meater_app.data.Config;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class T5 implements Parcelable.Creator<E5> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ E5 createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        Boolean boolN = null;
        ArrayList<String> arrayListH = null;
        String strF8 = null;
        String strF9 = null;
        String strF10 = null;
        long jU = 0;
        long jU2 = 0;
        long jU3 = 0;
        long jU4 = 0;
        long jU5 = 0;
        long jU6 = 0;
        long jU7 = 0;
        boolean zM = true;
        boolean zM2 = true;
        boolean zM3 = false;
        int iT = 0;
        boolean zM4 = false;
        boolean zM5 = false;
        int iT2 = 0;
        int iT3 = 0;
        long jU8 = -2147483648L;
        String strF11 = "";
        String strF12 = strF11;
        String strF13 = strF12;
        String strF14 = strF13;
        int iT4 = 100;
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
                    strF3 = SafeParcelReader.f(parcel, iR);
                    break;
                case 5:
                    strF4 = SafeParcelReader.f(parcel, iR);
                    break;
                case 6:
                    jU = SafeParcelReader.u(parcel, iR);
                    break;
                case 7:
                    jU2 = SafeParcelReader.u(parcel, iR);
                    break;
                case 8:
                    strF5 = SafeParcelReader.f(parcel, iR);
                    break;
                case 9:
                    zM = SafeParcelReader.m(parcel, iR);
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    zM3 = SafeParcelReader.m(parcel, iR);
                    break;
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    jU8 = SafeParcelReader.u(parcel, iR);
                    break;
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    strF6 = SafeParcelReader.f(parcel, iR);
                    break;
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                case 17:
                case 20:
                case 33:
                default:
                    SafeParcelReader.x(parcel, iR);
                    break;
                case 14:
                    jU3 = SafeParcelReader.u(parcel, iR);
                    break;
                case 15:
                    iT = SafeParcelReader.t(parcel, iR);
                    break;
                case 16:
                    zM2 = SafeParcelReader.m(parcel, iR);
                    break;
                case 18:
                    zM4 = SafeParcelReader.m(parcel, iR);
                    break;
                case 19:
                    strF7 = SafeParcelReader.f(parcel, iR);
                    break;
                case 21:
                    boolN = SafeParcelReader.n(parcel, iR);
                    break;
                case 22:
                    jU4 = SafeParcelReader.u(parcel, iR);
                    break;
                case 23:
                    arrayListH = SafeParcelReader.h(parcel, iR);
                    break;
                case 24:
                    strF8 = SafeParcelReader.f(parcel, iR);
                    break;
                case 25:
                    strF11 = SafeParcelReader.f(parcel, iR);
                    break;
                case 26:
                    strF12 = SafeParcelReader.f(parcel, iR);
                    break;
                case 27:
                    strF9 = SafeParcelReader.f(parcel, iR);
                    break;
                case 28:
                    zM5 = SafeParcelReader.m(parcel, iR);
                    break;
                case 29:
                    jU5 = SafeParcelReader.u(parcel, iR);
                    break;
                case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
                    iT4 = SafeParcelReader.t(parcel, iR);
                    break;
                case 31:
                    strF13 = SafeParcelReader.f(parcel, iR);
                    break;
                case 32:
                    iT2 = SafeParcelReader.t(parcel, iR);
                    break;
                case 34:
                    jU6 = SafeParcelReader.u(parcel, iR);
                    break;
                case 35:
                    strF10 = SafeParcelReader.f(parcel, iR);
                    break;
                case 36:
                    strF14 = SafeParcelReader.f(parcel, iR);
                    break;
                case 37:
                    jU7 = SafeParcelReader.u(parcel, iR);
                    break;
                case 38:
                    iT3 = SafeParcelReader.t(parcel, iR);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new E5(strF, strF2, strF3, strF4, jU, jU2, strF5, zM, zM3, jU8, strF6, jU3, iT, zM2, zM4, strF7, boolN, jU4, arrayListH, strF8, strF11, strF12, strF9, zM5, jU5, iT4, strF13, iT2, jU6, strF10, strF14, jU7, iT3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ E5[] newArray(int i10) {
        return new E5[i10];
    }
}
