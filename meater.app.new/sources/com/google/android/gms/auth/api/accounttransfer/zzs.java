package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class zzs implements Parcelable.Creator<zzr> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzr createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        HashSet hashSet = new HashSet();
        int iM14427E = 0;
        zzt zztVar = null;
        String strM14452p = null;
        String strM14452p2 = null;
        String strM14452p3 = null;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 1) {
                iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
                hashSet.add(1);
            } else if (iM14458v == 2) {
                zztVar = (zzt) SafeParcelReader.m14451o(parcel, iM14425C, zzt.CREATOR);
                hashSet.add(2);
            } else if (iM14458v == 3) {
                strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
                hashSet.add(3);
            } else if (iM14458v == 4) {
                strM14452p2 = SafeParcelReader.m14452p(parcel, iM14425C);
                hashSet.add(4);
            } else if (iM14458v != 5) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                strM14452p3 = SafeParcelReader.m14452p(parcel, iM14425C);
                hashSet.add(5);
            }
        }
        if (parcel.dataPosition() == iM14434L) {
            return new zzr(hashSet, iM14427E, zztVar, strM14452p, strM14452p2, strM14452p3);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(iM14434L);
        throw new SafeParcelReader.ParseException(sb.toString(), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzr[] newArray(int i2) {
        return new zzr[i2];
    }
}
