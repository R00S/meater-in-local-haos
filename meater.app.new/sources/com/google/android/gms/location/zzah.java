package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzah implements Parcelable.Creator<LocationSettingsResult> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationSettingsResult createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        Status status = null;
        LocationSettingsStates locationSettingsStates = null;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 1) {
                status = (Status) SafeParcelReader.m14451o(parcel, iM14425C, Status.CREATOR);
            } else if (iM14458v != 2) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                locationSettingsStates = (LocationSettingsStates) SafeParcelReader.m14451o(parcel, iM14425C, LocationSettingsStates.CREATOR);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new LocationSettingsResult(status, locationSettingsStates);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationSettingsResult[] newArray(int i2) {
        return new LocationSettingsResult[i2];
    }
}
