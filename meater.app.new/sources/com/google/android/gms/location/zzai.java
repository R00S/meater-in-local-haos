package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzai implements Parcelable.Creator<LocationSettingsStates> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationSettingsStates createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        boolean zM14459w = false;
        boolean zM14459w2 = false;
        boolean zM14459w3 = false;
        boolean zM14459w4 = false;
        boolean zM14459w5 = false;
        boolean zM14459w6 = false;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(iM14425C)) {
                case 1:
                    zM14459w = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 2:
                    zM14459w2 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 3:
                    zM14459w3 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 4:
                    zM14459w4 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 5:
                    zM14459w5 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 6:
                    zM14459w6 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, iM14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new LocationSettingsStates(zM14459w, zM14459w2, zM14459w3, zM14459w4, zM14459w5, zM14459w6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationSettingsStates[] newArray(int i2) {
        return new LocationSettingsStates[i2];
    }
}
