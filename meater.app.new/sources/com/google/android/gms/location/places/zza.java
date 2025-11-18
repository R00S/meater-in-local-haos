package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zza implements Parcelable.Creator<PlaceReport> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PlaceReport createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        String strM14452p = null;
        String strM14452p2 = null;
        String strM14452p3 = null;
        int iM14427E = 0;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 1) {
                iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
            } else if (iM14458v == 2) {
                strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
            } else if (iM14458v == 3) {
                strM14452p2 = SafeParcelReader.m14452p(parcel, iM14425C);
            } else if (iM14458v != 4) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                strM14452p3 = SafeParcelReader.m14452p(parcel, iM14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new PlaceReport(iM14427E, strM14452p, strM14452p2, strM14452p3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PlaceReport[] newArray(int i2) {
        return new PlaceReport[i2];
    }
}
