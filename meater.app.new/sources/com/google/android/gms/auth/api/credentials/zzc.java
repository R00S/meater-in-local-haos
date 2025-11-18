package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzc implements Parcelable.Creator<Credential> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Credential createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        String strM14452p = null;
        String strM14452p2 = null;
        Uri uri = null;
        ArrayList arrayListM14456t = null;
        String strM14452p3 = null;
        String strM14452p4 = null;
        String strM14452p5 = null;
        String strM14452p6 = null;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(iM14425C)) {
                case 1:
                    strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 2:
                    strM14452p2 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 3:
                    uri = (Uri) SafeParcelReader.m14451o(parcel, iM14425C, Uri.CREATOR);
                    break;
                case 4:
                    arrayListM14456t = SafeParcelReader.m14456t(parcel, iM14425C, IdToken.CREATOR);
                    break;
                case 5:
                    strM14452p3 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 6:
                    strM14452p4 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 7:
                case 8:
                default:
                    SafeParcelReader.m14433K(parcel, iM14425C);
                    break;
                case 9:
                    strM14452p5 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                case 10:
                    strM14452p6 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new Credential(strM14452p, strM14452p2, uri, arrayListM14456t, strM14452p3, strM14452p4, strM14452p5, strM14452p6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Credential[] newArray(int i2) {
        return new Credential[i2];
    }
}
