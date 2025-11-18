package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzbaj implements Parcelable.Creator<zzbai> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbai createFromParcel(Parcel parcel) {
        int iM14434L = SafeParcelReader.m14434L(parcel);
        String strM14452p = null;
        int iM14427E = 0;
        int iM14427E2 = 0;
        boolean zM14459w = false;
        boolean zM14459w2 = false;
        while (parcel.dataPosition() < iM14434L) {
            int iM14425C = SafeParcelReader.m14425C(parcel);
            int iM14458v = SafeParcelReader.m14458v(iM14425C);
            if (iM14458v == 2) {
                strM14452p = SafeParcelReader.m14452p(parcel, iM14425C);
            } else if (iM14458v == 3) {
                iM14427E = SafeParcelReader.m14427E(parcel, iM14425C);
            } else if (iM14458v == 4) {
                iM14427E2 = SafeParcelReader.m14427E(parcel, iM14425C);
            } else if (iM14458v == 5) {
                zM14459w = SafeParcelReader.m14459w(parcel, iM14425C);
            } else if (iM14458v != 6) {
                SafeParcelReader.m14433K(parcel, iM14425C);
            } else {
                zM14459w2 = SafeParcelReader.m14459w(parcel, iM14425C);
            }
        }
        SafeParcelReader.m14457u(parcel, iM14434L);
        return new zzbai(strM14452p, iM14427E, iM14427E2, zM14459w, zM14459w2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbai[] newArray(int i2) {
        return new zzbai[i2];
    }
}
