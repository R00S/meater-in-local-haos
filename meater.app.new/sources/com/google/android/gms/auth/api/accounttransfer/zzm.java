package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class zzm implements Parcelable.Creator<zzl> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzl createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        HashSet hashSet = new HashSet();
        int iM14427E = 0;
        ArrayList arrayListM14456t = null;
        zzo zzoVar = null;
        int iM14427E2 = 0;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 1) {
                iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
                hashSet.add(1);
            } else if (iM14458v == 2) {
                arrayListM14456t = SafeParcelReader.m14456t(parcel, iM14425C, zzr.CREATOR);
                hashSet.add(2);
            } else if (iM14458v == 3) {
                iM14427E2 = SafeParcelReader.m14427E(parcel, iM14425C);
                hashSet.add(3);
            } else if (iM14458v != 4) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                zzoVar = (zzo) SafeParcelReader.m14451o(parcel, iM14425C, zzo.CREATOR);
                hashSet.add(4);
            }
        }
        if (parcel.dataPosition() == iM14434L) {
            return new zzl(hashSet, iM14427E, arrayListM14456t, iM14427E2, zzoVar);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(iM14434L);
        throw new SafeParcelReader.ParseException(sb.toString(), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzl[] newArray(int i2) {
        return new zzl[i2];
    }
}
