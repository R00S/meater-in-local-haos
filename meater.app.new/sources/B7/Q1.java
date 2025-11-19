package B7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class Q1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        int iT = 0;
        byte bO = 0;
        byte bO2 = 0;
        byte bO3 = 0;
        byte bO4 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = SafeParcelReader.r(parcel);
            switch (SafeParcelReader.l(iR)) {
                case 2:
                    iT = SafeParcelReader.t(parcel, iR);
                    break;
                case 3:
                    strF = SafeParcelReader.f(parcel, iR);
                    break;
                case 4:
                    strF2 = SafeParcelReader.f(parcel, iR);
                    break;
                case 5:
                    strF3 = SafeParcelReader.f(parcel, iR);
                    break;
                case 6:
                    strF4 = SafeParcelReader.f(parcel, iR);
                    break;
                case 7:
                    strF5 = SafeParcelReader.f(parcel, iR);
                    break;
                case 8:
                    strF6 = SafeParcelReader.f(parcel, iR);
                    break;
                case 9:
                    bO = SafeParcelReader.o(parcel, iR);
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    bO2 = SafeParcelReader.o(parcel, iR);
                    break;
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    bO3 = SafeParcelReader.o(parcel, iR);
                    break;
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    bO4 = SafeParcelReader.o(parcel, iR);
                    break;
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    strF7 = SafeParcelReader.f(parcel, iR);
                    break;
                default:
                    SafeParcelReader.x(parcel, iR);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new P1(iT, strF, strF2, strF3, strF4, strF5, strF6, bO, bO2, bO3, bO4, strF7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new P1[i10];
    }
}
