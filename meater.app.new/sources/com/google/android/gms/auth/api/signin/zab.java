package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zab implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        String strM14452p = null;
        String strM14452p2 = null;
        String strM14452p3 = null;
        String strM14452p4 = null;
        Uri uri = null;
        String strM14452p5 = null;
        String strM14452p6 = null;
        ArrayList arrayListM14456t = null;
        String strM14452p7 = null;
        String strM14452p8 = null;
        long jM14429G = 0;
        int iM14427E = 0;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(iM14425C)) {
                case 1:
                    iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 2:
                    strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 3:
                    strM14452p2 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 4:
                    strM14452p3 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 5:
                    strM14452p4 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.m14451o(parcel, iM14425C, Uri.CREATOR);
                    break;
                case 7:
                    strM14452p5 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 8:
                    jM14429G = SafeParcelReader.m14429G(parcel, iM14425C);
                    break;
                case 9:
                    strM14452p6 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 10:
                    arrayListM14456t = SafeParcelReader.m14456t(parcel, iM14425C, Scope.CREATOR);
                    break;
                case 11:
                    strM14452p7 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 12:
                    strM14452p8 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, iM14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new GoogleSignInAccount(iM14427E, strM14452p, strM14452p2, strM14452p3, strM14452p4, uri, strM14452p5, jM14429G, strM14452p6, arrayListM14456t, strM14452p7, strM14452p8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i2) {
        return new GoogleSignInAccount[i2];
    }
}
