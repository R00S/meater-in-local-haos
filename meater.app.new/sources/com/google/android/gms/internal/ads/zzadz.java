package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzadz implements Parcelable.Creator<zzady> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzady createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        zzacd zzacdVar = null;
        int iM14427E = 0;
        boolean zM14459w = false;
        int iM14427E2 = 0;
        boolean zM14459w2 = false;
        int iM14427E3 = 0;
        boolean zM14459w3 = false;
        int iM14427E4 = 0;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            switch (SafeParcelReader.m14458v(iM14425C)) {
                case 1:
                    iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 2:
                    zM14459w = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 3:
                    iM14427E2 = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 4:
                    zM14459w2 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 5:
                    iM14427E3 = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                case 6:
                    zzacdVar = (zzacd) SafeParcelReader.m14451o(parcel, iM14425C, zzacd.CREATOR);
                    break;
                case 7:
                    zM14459w3 = SafeParcelReader.m14459w(parcel, iM14425C);
                    break;
                case 8:
                    iM14427E4 = SafeParcelReader.m14427E(parcel, iM14425C);
                    break;
                default:
                    SafeParcelReader.m14433K(parcel, iM14425C);
                    break;
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzady(iM14427E, zM14459w, iM14427E2, zM14459w2, iM14427E3, zzacdVar, zM14459w3, iM14427E4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzady[] newArray(int i2) {
        return new zzady[i2];
    }
}
