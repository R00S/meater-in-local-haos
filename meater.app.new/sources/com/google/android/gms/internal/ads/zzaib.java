package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzaib implements Parcelable.Creator<zzaia> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaia createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        String strM14452p = null;
        String[] strArrM14453q = null;
        String[] strArrM14453q2 = null;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 1) {
                strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
            } else if (iM14458v == 2) {
                strArrM14453q = SafeParcelReader.m14453q(parcel, iM14425C);
            } else if (iM14458v != 3) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                strArrM14453q2 = SafeParcelReader.m14453q(parcel, iM14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzaia(strM14452p, strArrM14453q, strArrM14453q2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaia[] newArray(int i2) {
        return new zzaia[i2];
    }
}
