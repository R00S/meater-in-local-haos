package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zze implements Parcelable.Creator<zzd> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzd createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        long jM14429G = 0;
        HarmfulAppsData[] harmfulAppsDataArr = null;
        int iM14427E = 0;
        boolean zM14459w = false;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 2) {
                jM14429G = SafeParcelReader.m14429G(parcel, iM14425C);
            } else if (iM14458v == 3) {
                harmfulAppsDataArr = (HarmfulAppsData[]) SafeParcelReader.m14455s(parcel, iM14425C, HarmfulAppsData.CREATOR);
            } else if (iM14458v == 4) {
                iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
            } else if (iM14458v != 5) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                zM14459w = SafeParcelReader.m14459w(parcel, iM14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzd(jM14429G, harmfulAppsDataArr, iM14427E, zM14459w);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzd[] newArray(int i2) {
        return new zzd[i2];
    }
}
