package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzaa implements Parcelable.Creator<LocationAvailability> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationAvailability createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        long jM14429G = 0;
        zzaj[] zzajVarArr = null;
        int iM14427E = 1000;
        int iM14427E2 = 1;
        int iM14427E3 = 1;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 1) {
                iM14427E2 = SafeParcelReader.m14427E(parcel, iM14425C);
            } else if (iM14458v == 2) {
                iM14427E3 = SafeParcelReader.m14427E(parcel, iM14425C);
            } else if (iM14458v == 3) {
                jM14429G = SafeParcelReader.m14429G(parcel, iM14425C);
            } else if (iM14458v == 4) {
                iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
            } else if (iM14458v != 5) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                zzajVarArr = (zzaj[]) SafeParcelReader.m14455s(parcel, iM14425C, zzaj.CREATOR);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new LocationAvailability(iM14427E, iM14427E2, iM14427E3, jM14429G, zzajVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationAvailability[] newArray(int i2) {
        return new LocationAvailability[i2];
    }
}
