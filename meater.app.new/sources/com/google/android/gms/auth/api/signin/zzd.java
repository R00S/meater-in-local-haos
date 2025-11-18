package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzd implements Parcelable.Creator<SignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInAccount createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        String strM14452p = HttpUrl.FRAGMENT_ENCODE_SET;
        GoogleSignInAccount googleSignInAccount = null;
        String strM14452p2 = HttpUrl.FRAGMENT_ENCODE_SET;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 4) {
                strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
            } else if (iM14458v == 7) {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.m14451o(parcel, iM14425C, GoogleSignInAccount.CREATOR);
            } else if (iM14458v != 8) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                strM14452p2 = SafeParcelReader.m14452p(parcel, iM14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new SignInAccount(strM14452p, googleSignInAccount, strM14452p2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInAccount[] newArray(int i2) {
        return new SignInAccount[i2];
    }
}
