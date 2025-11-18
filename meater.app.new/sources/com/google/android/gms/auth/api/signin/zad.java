package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zad implements Parcelable.Creator<GoogleSignInOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptions createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        ArrayList arrayListM14456t = null;
        Account account = null;
        String strM14452p = null;
        String strM14452p2 = null;
        ArrayList arrayListM14456t2 = null;
        int iM14427E = 0;
        boolean zM14459w = false;
        boolean zM14459w2 = false;
        boolean zM14459w3 = false;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(iM14425C)) {
                case 1:
                    iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 2:
                    arrayListM14456t = SafeParcelReader.m14456t(parcel, iM14425C, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) SafeParcelReader.m14451o(parcel, iM14425C, Account.CREATOR);
                    break;
                case 4:
                    zM14459w = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 5:
                    zM14459w2 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 6:
                    zM14459w3 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 7:
                    strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 8:
                    strM14452p2 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 9:
                    arrayListM14456t2 = SafeParcelReader.m14456t(parcel, iM14425C, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, iM14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new GoogleSignInOptions(iM14427E, (ArrayList<Scope>) arrayListM14456t, account, zM14459w, zM14459w2, zM14459w3, strM14452p, strM14452p2, (ArrayList<GoogleSignInOptionsExtensionParcelable>) arrayListM14456t2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptions[] newArray(int i2) {
        return new GoogleSignInOptions[i2];
    }
}
