package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzati implements Parcelable.Creator<zzath> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzath createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        zzxz zzxzVar = null;
        String strM14452p = null;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 2) {
                zzxzVar = (zzxz) SafeParcelReader.m14451o(parcel, iM14425C, zzxz.CREATOR);
            } else if (iM14458v != 3) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzath(zzxzVar, strM14452p);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzath[] newArray(int i2) {
        return new zzath[i2];
    }
}
