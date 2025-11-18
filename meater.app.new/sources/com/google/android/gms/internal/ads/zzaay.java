package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzaay implements Parcelable.Creator<zzaax> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaax createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        int iM14427E = 0;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            if (SafeParcelReader.m14458v(iM14425C) != 2) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzaax(iM14427E);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaax[] newArray(int i2) {
        return new zzaax[i2];
    }
}
