package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzk implements Parcelable.Creator<TokenData> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TokenData createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        String strM14452p = null;
        Long lM14430H = null;
        ArrayList<String> arrayListM14454r = null;
        String strM14452p2 = null;
        int iM14427E = 0;
        boolean zM14459w = false;
        boolean zM14459w2 = false;
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
                    lM14430H = SafeParcelReader.m14430H(parcel, iM14425C);
                    break;
                case 4:
                    zM14459w = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 5:
                    zM14459w2 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 6:
                    arrayListM14454r = SafeParcelReader.m14454r(parcel, iM14425C);
                    break;
                case 7:
                    strM14452p2 = SafeParcelReader.m14452p(parcel, iM14425C);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, iM14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new TokenData(iM14427E, strM14452p, lM14430H, zM14459w, zM14459w2, arrayListM14454r, strM14452p2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TokenData[] newArray(int i2) {
        return new TokenData[i2];
    }
}
