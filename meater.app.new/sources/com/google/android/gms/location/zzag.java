package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzag implements Parcelable.Creator<LocationSettingsRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationSettingsRequest createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        boolean zM14459w = false;
        ArrayList arrayListM14456t = null;
        zzae zzaeVar = null;
        boolean zM14459w2 = false;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 1) {
                arrayListM14456t = SafeParcelReader.m14456t(parcel, iM14425C, LocationRequest.CREATOR);
            } else if (iM14458v == 2) {
                zM14459w = SafeParcelReader.m14459w(parcel, iM14425C);
            } else if (iM14458v == 3) {
                zM14459w2 = SafeParcelReader.m14459w(parcel, iM14425C);
            } else if (iM14458v != 5) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                zzaeVar = (zzae) SafeParcelReader.m14451o(parcel, iM14425C, zzae.CREATOR);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new LocationSettingsRequest(arrayListM14456t, zM14459w, zM14459w2, zzaeVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationSettingsRequest[] newArray(int i2) {
        return new LocationSettingsRequest[i2];
    }
}
