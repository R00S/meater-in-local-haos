package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzapk implements Parcelable.Creator<zzapj> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzapj createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        int iM14427E = 0;
        int iM14427E2 = 0;
        int iM14427E3 = 0;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 1) {
                iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
            } else if (iM14458v == 2) {
                iM14427E2 = SafeParcelReader.m14427E(parcel, iM14425C);
            } else if (iM14458v != 3) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                iM14427E3 = SafeParcelReader.m14427E(parcel, iM14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzapj(iM14427E, iM14427E2, iM14427E3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzapj[] newArray(int i2) {
        return new zzapj[i2];
    }
}
