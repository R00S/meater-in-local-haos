package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzc implements Parcelable.Creator<ActivityTransition> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ActivityTransition createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        int iM14427E = 0;
        int iM14427E2 = 0;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 1) {
                iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
            } else if (iM14458v != 2) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                iM14427E2 = SafeParcelReader.m14427E(parcel, iM14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new ActivityTransition(iM14427E, iM14427E2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ActivityTransition[] newArray(int i2) {
        return new ActivityTransition[i2];
    }
}
