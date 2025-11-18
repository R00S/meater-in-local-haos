package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzg implements Parcelable.Creator<zzf> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzf createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        String strM14452p = null;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            if (SafeParcelReader.m14458v(iM14425C) != 2) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzf(strM14452p);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzf[] newArray(int i2) {
        return new zzf[i2];
    }
}
