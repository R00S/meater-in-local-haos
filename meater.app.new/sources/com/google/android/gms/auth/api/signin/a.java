package com.google.android.gms.auth.api.signin;

import C9.h;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = SafeParcelReader.y(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        Uri uri = null;
        String strF5 = null;
        String strF6 = null;
        ArrayList arrayListJ = null;
        String strF7 = null;
        String strF8 = null;
        long jU = 0;
        int iT = 0;
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
                    strF2 = SafeParcelReader.f(parcel, iR);
                    break;
                case 4:
                    strF3 = SafeParcelReader.f(parcel, iR);
                    break;
                case 5:
                    strF4 = SafeParcelReader.f(parcel, iR);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.e(parcel, iR, Uri.CREATOR);
                    break;
                case 7:
                    strF5 = SafeParcelReader.f(parcel, iR);
                    break;
                case 8:
                    jU = SafeParcelReader.u(parcel, iR);
                    break;
                case 9:
                    strF6 = SafeParcelReader.f(parcel, iR);
                    break;
                case h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    arrayListJ = SafeParcelReader.j(parcel, iR, Scope.CREATOR);
                    break;
                case h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    strF7 = SafeParcelReader.f(parcel, iR);
                    break;
                case h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    strF8 = SafeParcelReader.f(parcel, iR);
                    break;
                default:
                    SafeParcelReader.x(parcel, iR);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY);
        return new GoogleSignInAccount(iT, strF, strF2, strF3, strF4, uri, strF5, jU, strF6, arrayListJ, strF7, strF8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
