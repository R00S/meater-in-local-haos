package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzawd implements Parcelable.Creator<zzawc> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzawc createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        String strM14452p = null;
        String strM14452p2 = null;
        zzyd zzydVar = null;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 1) {
                strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
            } else if (iM14458v == 2) {
                strM14452p2 = SafeParcelReader.m14452p(parcel, iM14425C);
            } else if (iM14458v != 3) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                zzydVar = (zzyd) SafeParcelReader.m14451o(parcel, iM14425C, zzyd.CREATOR);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzawc(strM14452p, strM14452p2, zzydVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzawc[] newArray(int i2) {
        return new zzawc[i2];
    }
}
